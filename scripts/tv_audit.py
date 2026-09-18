#!/usr/bin/env python3
"""
tv_audit.py - Read-only audit of an Android TV / set-top box over ADB.

Collects device info, storage usage and the full package list, then classifies
every package as KEEP / CAUTION / BLOAT / UNKNOWN and estimates how much space
can actually be recovered by removing it.

This script NEVER modifies the device. It only runs read-only commands
(getprop, df, du, ls, pm list, dumpsys).

Design notes
------------
* Some vendor ROMs (Technicolor TIMVISION box, AOSP TV boxes) ship a shell
  WITHOUT `awk`. All parsing therefore happens on the PC: the device emits raw
  `ls -l` / `du` / `pm list` output and Python does the rest.
* `pm list packages -f` uses different separators across Android versions:
    Android 7/8 : package:/path/to/base.apk=com.example
    Android 9+  : package:/data/app/~~xx==/com.example-yy==/base.apk=com.example
  Both are handled.

Usage
-----
    python scripts/tv_audit.py                    # auto-pick the only device
    python scripts/tv_audit.py -s 192.168.1.27:5555
    python scripts/tv_audit.py --try-root         # also attempt `adb root`
    python scripts/tv_audit.py --out scripts/tv-audit-out

Output
------
    <out>/report.txt    human readable report (this is what you paste back)
    <out>/report.csv    same data, machine readable
    <out>/raw/*.txt     raw command output, for debugging

Connect first, e.g.:
    adb connect 192.168.1.27:5555
"""

from __future__ import annotations

import argparse
import csv
import os
import re
import shutil
import subprocess
import sys
from pathlib import Path

# --------------------------------------------------------------------------- #
# adb plumbing
# --------------------------------------------------------------------------- #

FALLBACK_ADB_PATHS = [
    r"C:\Users\Gianmarco\AppData\Local\Android\Sdk\platform-tools\adb.exe",
    str(Path.home() / "AppData/Local/Android/Sdk/platform-tools/adb.exe"),
    str(Path.home() / "Library/Android/sdk/platform-tools/adb"),
    str(Path.home() / "Android/Sdk/platform-tools/adb"),
]


def find_adb() -> str:
    for cand in (os.environ.get("ADB"), shutil.which("adb"), shutil.which("adb.exe")):
        if cand and Path(cand).exists():
            return str(cand)
    for root in (os.environ.get("ANDROID_HOME"), os.environ.get("ANDROID_SDK_ROOT")):
        if root and "%" not in root:
            cand = Path(root) / "platform-tools" / "adb.exe"
            if cand.exists():
                return str(cand)
    for cand in FALLBACK_ADB_PATHS:
        if Path(cand).exists():
            return cand
    sys.exit("ERROR: adb not found. Set the ADB env var or add platform-tools to PATH.")


class Adb:
    def __init__(self, exe: str, serial: str | None = None) -> None:
        self.exe = exe
        self.serial = serial

    def _base(self) -> list[str]:
        cmd = [self.exe]
        if self.serial:
            cmd += ["-s", self.serial]
        return cmd

    def run(self, args: list[str], timeout: int = 60) -> tuple[int, str]:
        try:
            proc = subprocess.run(self._base() + args, capture_output=True, timeout=timeout)
        except subprocess.TimeoutExpired:
            return 124, ""
        return proc.returncode, (proc.stdout + proc.stderr).decode("utf-8", errors="replace")

    def shell(self, script: str, timeout: int = 300) -> str:
        """Run a shell script ON the device.

        The script is piped to `sh` over stdin so we can do loops and pipelines
        with a single round trip instead of hundreds of adb invocations.
        """
        try:
            proc = subprocess.run(
                self._base() + ["shell", "sh", "-s"],
                input=script.encode("utf-8"),
                capture_output=True,
                timeout=timeout,
            )
        except subprocess.TimeoutExpired:
            return ""
        return (proc.stdout + proc.stderr).decode("utf-8", errors="replace")

    def devices(self) -> list[str]:
        _, out = self.run(["devices"])
        found = []
        for line in out.splitlines()[1:]:
            parts = line.split()
            if len(parts) >= 2 and parts[1] == "device":
                found.append(parts[0])
        return found


# --------------------------------------------------------------------------- #
# classification
# --------------------------------------------------------------------------- #
# KEEP    = removing it can brick the device, kill the remote or break input
# CAUTION = legitimate app or vendor service, decide case by case
# BLOAT   = preinstalled filler, normally safe to remove
# UNKNOWN = not recognised, ask before touching
# --------------------------------------------------------------------------- #

KEEP_EXACT = {
    "android",
    "com.android.systemui",
    "com.android.settings",
    "com.android.tv.settings",
    "com.android.shell",
    "com.android.keychain",
    "com.android.packageinstaller",
    "com.android.permissioncontroller",
    "com.android.provision",
    "com.android.settings.intelligence",
    "com.android.wallpaperbackup",
    "com.android.keyguard",
    "com.android.certinstaller",
    "com.android.externalstorage",
    "com.android.documentsui",
    "com.android.mediaprovider",
    "com.android.webview",
    "com.google.android.webview",
    "com.google.android.gms",
    "com.google.android.gsf",
    "com.google.android.packageinstaller",
    "com.google.android.permissioncontroller",
    "com.google.android.ext.services",
    "com.google.android.ext.shared",
    "com.google.android.tv.frameworkpackagestubs",
    "com.android.defcontainer",
    "com.android.inputdevices",
    "com.android.location.fused",
    "com.android.vpndialogs",
    "com.android.statementservice",
    "com.android.providers.tv",
    "com.android.providers.downloads",
    "com.android.providers.media",
    "com.android.providers.settings",
    "com.android.proxyhandler",
    "com.android.captiveportallogin",
    "com.android.backupconfirm",
    "com.android.sharedstoragebackup",
    "com.android.pacprocessor",
    "com.android.printspooler",
}

KEEP_PREFIX = (
    "com.android.providers.",
    "com.android.internal.",
    "com.android.server",
    "com.android.tv.settings",
    "com.android.cts.",
)

# Pattern -> why. Matched against the package name. Keep these PRECISE:
# a loose substring like "telecom" would wrongly protect "it.telecomitalia.*".
KEEP_PATTERNS: list[tuple[str, str]] = [
    (".telecom", "telephony / call handling"),
    ("com.android.settings", "settings app"),
    ("systemui", "system UI"),
    ("keyguard", "lock screen"),
    ("com.android.bluetooth", "bluetooth stack"),
    ("com.android.shell", "adb shell"),
    (".remotecontrolservice", "IR/Bluetooth remote key mapping - remote would die"),
    (".remotepairing", "remote pairing service - remote would die"),
    ("com.google.android.tv.remote.service", "Android TV remote service"),
    (".inputmethod.", "input method - blocks all text input"),
    ("keyboard", "on-screen keyboard - blocks text input"),
    ("launcher", "home screen - remove it and you land on a black screen"),
    ("leanbacklauncher", "Android TV home screen"),
    ("setupwizard", "first boot wizard"),
    ("setup_wizard", "first boot wizard"),
    ("provision", "device provisioning"),
    ("com.android.vending", "Play Store"),
    ("com.google.android.gms", "Play Services (many apps break without it)"),
    ("com.google.android.gsf", "Google Services Framework"),
    (".syncadapters.", "account sync adapter"),
    ("gatekeeper", "credential storage"),
    ("com.android.wifi", "wifi service"),
    ("com.android.se", "secure element service"),
    ("com.android.nfc", "NFC service"),
    ("com.android.ons", "opportunistic network service"),
    ("com.android.dynsystem", "dynamic system updates"),
    ("com.android.localtransport", "backup transport"),
    ("com.android.traceur", "system tracing - toggling it off breaks dev options"),
    ("com.android.mtp", "MTP file transfer"),
    ("com.android.mms.service", "MMS service"),
    ("com.android.storagemanager", "storage manager"),
    ("com.android.wallpaper", "wallpaper services"),
    ("com.android.tv.frameworkpackagestubs", "required TV framework stubs"),
]

# Well known preinstalled filler: package -> human label
BLOAT: dict[str, str] = {
    # ---- Google media / apps often preinstalled on TV devices ----
    "com.google.android.videos": "Google TV / Play Movies",
    "com.google.android.music": "Play Music",
    "com.google.android.apps.maps": "Google Maps",
    "com.google.android.apps.photos": "Google Photos",
    "com.google.android.apps.docs": "Google Drive",
    "com.google.android.gm": "Gmail",
    "com.google.android.apps.tachyon": "Google Meet / Duo",
    "com.google.android.youtube.tv": "YouTube (TV)",
    "com.google.android.youtube.tvmusic": "YouTube Music (TV)",
    "com.google.android.youtube.tvkids": "YouTube Kids (TV)",
    "com.google.android.youtube": "YouTube",
    "com.google.android.apps.youtube.music": "YouTube Music",
    "com.google.android.apps.youtube.kids": "YouTube Kids",
    "com.google.android.apps.docs.editors.docs": "Docs",
    "com.google.android.apps.docs.editors.sheets": "Sheets",
    "com.google.android.apps.docs.editors.slides": "Slides",
    "com.google.android.calendar": "Calendar",
    "com.google.android.keep": "Keep",
    "com.google.android.apps.messaging": "Messages",
    "com.google.android.talk": "Hangouts",
    "com.google.android.play.games": "Play Games",
    "com.google.android.apps.nbu.files": "Files by Google",
    "com.google.android.apps.wallpaper": "Wallpapers",
    "com.google.android.apps.podcasts": "Podcasts",
    "com.google.android.apps.books": "Play Books",
    "com.google.android.apps.magazines": "News",
    "com.google.android.feedback": "Google market feedback",
    "com.google.android.printservice.recommendation": "Cloud Print",
    "com.google.android.apps.restore": "Restore",
    "com.google.android.apps.mediashell": "Media shell",
    "com.google.android.marvin.talkback": "TalkBack",
    "com.google.android.projection.gearhead": "Android Auto",
    "com.google.android.backdrop": "Daydream Backdrop",
    "com.google.android.tvtutorials": "Android TV tutorials",
    "com.google.android.tv.remote.service": "Google TV remote service",
    "com.google.android.sss": "Second Screen Setup",
    "com.google.android.sss.authbridge": "Second Screen Setup auth bridge",
    "com.google.android.gsf.notouch": "NoTouch auth delegate",
    "com.google.android.syncadapters.contacts": "Contacts sync",
    "com.google.android.syncadapters.calendar": "Calendar sync",
    "com.google.android.apps.wellbeing": "Digital Wellbeing",
    "com.google.android.googlequicksearchbox": "Google app / search",
    "com.google.android.apps.turbo": "Device Health Services",
    "com.google.android.as": "Android System Intelligence",
    # ---- AOSP extras ----
    "com.android.chrome": "Chrome",
    "com.android.browser": "AOSP Browser",
    "com.android.email": "AOSP Email",
    "com.android.calendar": "AOSP Calendar",
    "com.android.deskclock": "AOSP Clock",
    "com.android.music": "AOSP Music",
    "com.android.gallery3d": "AOSP Gallery",
    "com.android.camera2": "AOSP Camera",
    "com.android.quicksearchbox": "Quick Search Box",
    "com.android.wallpaper.livepicker": "Live wallpaper picker",
    "com.android.dreams.phototable": "PhotoTable screensaver",
    "com.android.dreams.basic": "Basic screensaver",
    "com.android.egg": "Easter egg",
    "com.android.bookmarkprovider": "Bookmark provider",
    "com.android.wallpapercropper": "Wallpaper cropper",
    # ---- Third party VOD / streaming typically bundled by OEMs ----
    "com.netflix.ninja": "Netflix (TV)",
    "com.netflix.mediaclient": "Netflix",
    "com.amazon.amazonvideo.livingroom": "Prime Video",
    "com.amazon.avod": "Prime Video",
    "com.disney.disneyplus": "Disney+",
    "com.disney.disneyplus.ph": "Disney+",
    "com.spotify.tv.android": "Spotify TV",
    "com.spotify.music": "Spotify",
    "org.xbmc.kodi": "Kodi",
    "com.dailymotion.dailymotion": "Dailymotion",
    "com.hulu.plus": "Hulu",
    "com.tubitv": "Tubi",
    "com.pandora.android": "Pandora",
    "com.vimeo.android.tv": "Vimeo TV",
    "com.skype.raider": "Skype",
    "com.accuweather.android": "AccuWeather",
    "com.tunein.player": "TuneIn Radio",
    "com.plexapp.android": "Plex",
    "tv.twitch.android.app": "Twitch",
    "com.instagram.android": "Instagram",
    "com.facebook.katana": "Facebook",
    "com.facebook.system": "Facebook installer stub",
    "com.facebook.appmanager": "Facebook App Manager",
    "com.facebook.services": "Facebook services",
    "com.linkedin.android": "LinkedIn",
    "com.dropbox.android": "Dropbox",
    "com.pinterest": "Pinterest",
    "com.twitter.android": "X / Twitter",
    "com.microsoft.office.word": "Word",
    "com.microsoft.office.excel": "Excel",
    "com.microsoft.office.powerpoint": "PowerPoint",
    "com.microsoft.skydrive": "OneDrive",
    # ---- Italian / TIMVISION box specific ----
    "it.telecomitalia.timmusic_tv": "TIM Music (TV)",
    "it.telecomitalia.thefilmclub": "The Film Club (TIM)",
    "it.telecomitalia.calcio": "TIM Calcio / Serie A",
    "it.telecomitalia.games": "TIM Games",
    "it.telecomitalia.timppapp": "TIM Personal / promo app",
    "it.telecomitalia.iotim": "TIM promo app",
    "it.telecomitalia.digitalsupport": "TIM Digital Support",
    "timvision.telemetry": "TIMVISION telemetry/analytics",
    "android.autoinstalls.config.technicolor": "auto-installer that re-adds OEM bloat",
    "com.estrongs.android.pop": "ES File Explorer (known adware)",
    "com.dazn": "DAZN",
    "com.sky.ott.client.androidtv.SkyIT": "Sky (TV)",
    "com.sky.ott.client.androidtv": "Sky (TV)",
    "tv.pluto.android": "Pluto TV",
    "com.upst.hayu": "Hayu",
    "com.vativision.vativisionapp": "Vativision",
    "com.fifa.plus.android": "FIFA+",
    "it.mediaset.infinitytv": "Mediaset Infinity",
    "it.rds.androidtv.rdssocialtv": "RDS Social TV",
    "com.cbs.ca": "CBS (demo/vendor app)",
}

BLOAT_PATTERNS: list[tuple[str, str]] = [
    (".demo", "vendor demo app"),
    (".sample", "vendor sample app"),
    ("bloatware", "vendor bloatware"),
    ("telemetry", "telemetry / analytics agent"),
    ("analytics", "analytics agent"),
]

# Vendor namespaces: preinstalled, purpose unknown. Ask before touching.
VENDOR_PREFIXES: list[tuple[str, str]] = [
    ("com.technicolor.", "Technicolor/Arris vendor component - may control TV hardware, tuner or HDMI"),
    ("com.marvell.", "Marvell SoC vendor component - may control audio/HDMI/wake-on-cast"),
    ("com.movenda.", "OMA-DM device management client - TIM uses it to configure the box remotely"),
    ("timvision.", "TIMVISION service - check what it does before removing"),
    ("tv.broadpeak.", "Broadpeak CDN wrapper used by TIM streaming"),
]


def classify(pkg: str) -> tuple[str, str]:
    """Return (risk, reason). Order matters: KEEP wins over everything."""
    if pkg in KEEP_EXACT or pkg.startswith(KEEP_PREFIX):
        return "KEEP", "core system component"

    low = pkg.lower()

    if pkg in BLOAT:
        return "BLOAT", BLOAT[pkg]

    for pat, why in KEEP_PATTERNS:
        if pat in low:
            return "KEEP", why

    for pat, why in BLOAT_PATTERNS:
        if pat in low:
            return "BLOAT", why

    for pref, why in VENDOR_PREFIXES:
        if pkg.startswith(pref):
            return "CAUTION", why

    if re.match(r"^com\.(android|google)\.", pkg):
        return "CAUTION", "AOSP/Google preinstall, not in the known-bloat list"

    return "UNKNOWN", "not recognised - needs manual check"


# --------------------------------------------------------------------------- #
# device commands (raw output only - no awk, some ROMs lack it)
# --------------------------------------------------------------------------- #

REMOTE_APK_LIST = "pm list packages -f\n"

# Size every APK.
#
# We cannot glob `/data/app/*/*.apk`: on some ROMs (Android 8 TIMVISION box)
# the directory itself is not listable by the shell user, even though the
# individual APK paths ARE readable. So we take the exact path of every
# package and `ls -l` it one by one. No awk: some vendor shells do not have it.
REMOTE_LS_APKS = r"""
pm list packages -f 2>/dev/null | while read line; do
  rest=${line#package:}
  if [ "${rest#*=}" != "$rest" ]; then
    apk=${rest%=*}
  else
    apk=${rest#*:}
  fi
  case "$apk" in
    /*) ls -l "$apk" 2>/dev/null ;;
  esac
done
"""

# Shared storage. /sdcard lives on the same partition as /data, so anything
# found here is real, reclaimable space. Internal app data under
# /data/user/0/<pkg> is NOT readable without root: the shell user cannot
# traverse other apps' directories and SELinux blocks it.
REMOTE_DU = r"""
du -sk /sdcard/* 2>/dev/null
"""


def human(num_bytes: float) -> str:
    if num_bytes <= 0:
        return "-"
    units = ["B", "K", "M", "G", "T"]
    i = 0
    val = float(num_bytes)
    while val >= 1024 and i < len(units) - 1:
        val /= 1024.0
        i += 1
    if i <= 1:
        return f"{int(val)}{units[i]}"
    return f"{val:.1f}{units[i]}"


def parse_package_list(text: str) -> dict[str, str]:
    """`pm list packages -f` -> {package: apk_path}.

    Handles both `package:<pkg>:<path>` and `package:<path>=<pkg>`.
    """
    out: dict[str, str] = {}
    for line in text.splitlines():
        line = line.strip()
        if not line.startswith("package:"):
            continue
        rest = line[len("package:"):]
        if "=" in rest:
            apk, _, pkg = rest.rpartition("=")
        elif ":" in rest:
            pkg, _, apk = rest.partition(":")
        else:
            pkg, apk = rest, ""
        pkg = pkg.strip()
        if pkg:
            out[pkg] = apk.strip()
    return out


def parse_ls_sizes(text: str) -> dict[str, int]:
    """Raw `ls -l` output -> {apk_path: size_in_bytes}."""
    out: dict[str, int] = {}
    for line in text.splitlines():
        if not line.startswith("-"):
            continue
        parts = line.split()
        if len(parts) < 8:
            continue
        try:
            size = int(parts[4])
        except ValueError:
            continue
        path = " ".join(parts[7:]).strip()
        if path:
            out[path] = size
    return out


def parse_pkg_names(text: str) -> set[str]:
    return {
        ln.strip()[len("package:"):]
        for ln in text.splitlines()
        if ln.strip().startswith("package:")
    }


def parse_du(text: str) -> dict[str, int]:
    """`size<TAB>path` -> {basename: bytes}."""
    out: dict[str, int] = {}
    for line in text.splitlines():
        parts = line.split(None, 1)
        if len(parts) != 2:
            continue
        try:
            kb = int(parts[0])
        except ValueError:
            continue
        name = parts[1].strip().rstrip("/").rsplit("/", 1)[-1]
        if name and kb * 1024 > out.get(name, -1):
            out[name] = kb * 1024
    return out


# --------------------------------------------------------------------------- #
# main
# --------------------------------------------------------------------------- #

def main() -> int:
    ap = argparse.ArgumentParser(description="Read-only Android TV audit over ADB")
    ap.add_argument("-s", "--serial", help="adb serial (e.g. 192.168.1.27:5555)")
    ap.add_argument("--out", default="scripts/tv-audit-out", help="output directory")
    ap.add_argument("--top", type=int, default=40, help="rows in the biggest-use table")
    ap.add_argument("--try-root", action="store_true",
                    help="attempt `adb root` so per-app data sizes become readable")
    args = ap.parse_args()

    adb = Adb(find_adb(), args.serial)

    if not adb.serial:
        devices = adb.devices()
        if not devices:
            sys.exit("ERROR: no device. Run `adb connect <ip>:5555` first.")
        if len(devices) > 1:
            sys.exit("ERROR: multiple devices, pass -s <serial>:\n  " + "\n  ".join(devices))
        adb.serial = devices[0]

    out_dir = Path(args.out)
    raw_dir = out_dir / "raw"
    raw_dir.mkdir(parents=True, exist_ok=True)
    print(f"device : {adb.serial}")
    print(f"adb    : {adb.exe}")

    def dump(name: str, script: str, timeout: int = 300) -> str:
        text = adb.shell(script, timeout=timeout)
        (raw_dir / f"{name}.txt").write_text(text, encoding="utf-8", errors="replace")
        print(f"  collected {name:22s} ({len(text.splitlines())} lines)")
        return text

    print("\n[1/6] device info")
    props_txt = dump("props", "getprop\n")
    props = {}
    for line in props_txt.splitlines():
        # getprop prints `[key]: [value]`
        m = re.match(r"^\[(.+?)\]:\s*\[(.*)\]\s*$", line.strip())
        if m:
            props[m.group(1)] = m.group(2).strip()
    root_uid = dump("root", "id -u\n").strip()
    is_root = root_uid == "0"

    print("[2/6] storage")
    df_txt = dump("df", "df -k /data /cache 2>/dev/null\n")
    diskstats = dump("diskstats", "dumpsys diskstats 2>/dev/null | head -25\n")

    root_note = ""
    if args.try_root and not is_root:
        print("[2b ] attempting `adb root` (adbd restarts, safe to try)")
        _, out = adb.run(["root"], timeout=30)
        out = (out or "").strip() or "(no output)"
        root_note = f"adb root -> {out}"
        print(f"      {out}")
        import time
        time.sleep(3)
        adb.run(["wait-for-device"], timeout=60)
        is_root = adb.shell("id -u\n").strip() == "0"
        print("      root OK" if is_root else "      root denied, non-root mode")

    print("[3/6] package list")
    pkg_map = parse_package_list(dump("packages_f", REMOTE_APK_LIST))
    third = parse_pkg_names(dump("third_party", "pm list packages -3\n"))
    third_dis = parse_pkg_names(dump("third_party_disabled", "pm list packages -3 -d\n"))
    sys_dis = parse_pkg_names(dump("system_disabled", "pm list packages -s -d\n"))
    enabled = parse_pkg_names(dump("enabled", "pm list packages -e\n"))

    print("[4/6] apk sizes")
    apk_sizes = parse_ls_sizes(dump("ls_apks", REMOTE_LS_APKS))
    matched = sum(1 for p in pkg_map.values() if p in apk_sizes)
    print(f"      matched {matched}/{len(pkg_map)} apk paths")

    print("[5/6] shared storage sizes")
    data_sizes = parse_du(dump("du", REMOTE_DU, timeout=900))

    print("[6/6] building report")

    packages: dict[str, dict] = {}
    for pkg, apk in pkg_map.items():
        apk_size = apk_sizes.get(apk, 0)
        packages[pkg] = {
            "pkg": pkg,
            "apk": apk,
            "apk_size": apk_size,
            "in_system": not apk.startswith("/data/"),
            "data_size": data_sizes.get(pkg, 0),
            "third_party": pkg in third or pkg in third_dis,
            "enabled": pkg in enabled,
            "disabled": pkg in third_dis or pkg in sys_dis,
        }

    for info in packages.values():
        risk, reason = classify(info["pkg"])
        info["risk"] = risk
        info["reason"] = reason
        # Third-party apps are uninstalled outright -> APK + data are freed.
        # Preinstalled apps in /system are only removable for user 0: the APK
        # sits on another partition, but the /data copy and data dir go away.
        if info["third_party"]:
            info["mode"] = "uninstall"
        else:
            info["mode"] = "user0"
        # An app whose APK lives in /data/app is taking real, reclaimable space
        # on the data partition even when the package is flagged as a system
        # app (preinstalled by the OEM, then updated). That is where the space
        # actually is on boxes like the TIMVISION.
        info["in_data"] = info["apk"].startswith("/data/")
        info["recoverable"] = info["apk_size"] + info["data_size"]

    # ---- storage --------------------------------------------------------- #
    data_total_kb = data_used_kb = data_free_kb = 0
    for line in df_txt.splitlines():
        cols = line.split()
        if len(cols) >= 4 and cols[5] == "/data":
            data_total_kb, data_used_kb, data_free_kb = int(cols[1]), int(cols[2]), int(cols[3])
            break

    # ---- render ---------------------------------------------------------- #
    L: list[str] = []
    w = L.append
    model = props.get("ro.product.model", "?")
    android = props.get("ro.build.version.release", "?")
    sdk = props.get("ro.build.version.sdk", "?")
    abi = props.get("ro.product.cpu.abi", "?")
    abi2 = props.get("ro.product.cpu.abi2", "")

    w("=" * 104)
    w("  WaveStream - Android device audit")
    w("=" * 104)
    w(f"  serial      : {adb.serial}")
    w(f"  model       : {props.get('ro.product.manufacturer','?')} {model}")
    w(f"  android     : {android} (sdk {sdk})")
    w(f"  abi         : {abi}{(' / ' + abi2) if abi2 else ''}")
    w(f"  build       : {props.get('ro.build.display.id','?')}")
    w(f"  shell uid   : {root_uid} {'(ROOT)' if is_root else '(unprivileged)'}")
    if root_note:
        w(f"  {root_note}")
    w("")

    w("-" * 104)
    w("  STORAGE")
    w("-" * 104)
    for line in df_txt.splitlines():
        if line.startswith("Filesystem") or line.startswith("/dev"):
            w(f"  {line}")
    if data_total_kb:
        free_mb = data_free_kb / 1024
        w("")
        w(f"  /data: {human(data_total_kb*1024)} total, {human(data_used_kb*1024)} used, "
          f"FREE {human(data_free_kb*1024)}")
        if free_mb < 400:
            w(f"  >>> CRITICAL: only {free_mb:.0f} MB free. An APK of that size cannot install.")
            w("      Free at least 400 MB before installing anything.")
    w("")

    all_pkgs = sorted(packages.values(), key=lambda p: -p["recoverable"])
    tp = [p for p in all_pkgs if p["third_party"]]
    sp = [p for p in all_pkgs if not p["third_party"]]

    w("-" * 104)
    w("  SUMMARY")
    w("-" * 104)
    w(f"  packages total                   : {len(all_pkgs)}")
    w(f"  third-party (normal uninstall)   : {len(tp):4d}   "
      f"APK {human(sum(p['apk_size'] for p in tp)):>8}  DATA {human(sum(p['data_size'] for p in tp)):>8}")
    w(f"  preinstalled (--user 0)          : {len(sp):4d}   "
      f"APK {human(sum(p['apk_size'] for p in sp)):>8}  DATA {human(sum(p['data_size'] for p in sp)):>8}")
    w(f"  disabled                         : {sum(1 for p in all_pkgs if p['disabled'])}")
    if not is_root:
        w("")
        w("  NOTE: 'EXT' is shared storage (/sdcard, same partition as /data).")
        w("        Internal app data under /data/user/0/<pkg> is NOT readable")
        w("        without root, so `recoverable` is a LOWER BOUND for apps that")
        w("        have real caches. Use Settings > Storage to cross-check.")
    w("")

    w("-" * 104)
    w("  UNINSTALLABLE WITHOUT ROOT, sorted by recoverable space")
    w("-" * 104)
    w(f"  {'RECOVER':>9} {'APK':>8} {'EXT':>7}  {'RISK':<8} {'MODE':<9} {'ORIGIN':<7} PACKAGE")
    w(f"  {'-'*9} {'-'*8} {'-'*7}  {'-'*8} {'-'*9} {'-'*7} {'-'*44}")
    for p in all_pkgs:
        origin = "/data" if p["in_data"] else "system"
        w(f"  {human(p['recoverable']):>9} {human(p['apk_size']):>8} {human(p['data_size']):>7}  "
          f"{p['risk']:<8} {p['mode']:<9} {origin:<7} {p['pkg']}")

    w("")
    w("-" * 104)
    w("  WHAT EACH PACKAGE IS")
    w("-" * 104)
    for risk in ("BLOAT", "UNKNOWN", "CAUTION", "KEEP"):
        rows = [p for p in all_pkgs if p["risk"] == risk]
        if not rows:
            continue
        w("")
        w(f"  === {risk} ({len(rows)}) ===")
        for p in sorted(rows, key=lambda x: (x["reason"], -x["recoverable"])):
            w(f"    {p['pkg']:<54} {human(p['recoverable']):>8}  {p['reason']}")

    w("")
    w("-" * 104)
    w("  CANDIDATES TO REMOVE (BLOAT only)")
    w("-" * 104)
    bloat = [p for p in all_pkgs if p["risk"] == "BLOAT"]
    for p in sorted(bloat, key=lambda x: -x["recoverable"]):
        w(f"    {human(p['recoverable']):>8}  {p['mode']:<9} {p['pkg']:<52} {p['reason']}")
    w("")
    w(f"    BLOAT count: {len(bloat)}   "
      f"total APK size: {human(sum(p['apk_size'] for p in bloat))}")
    w("")

    report = "\n".join(L)
    (out_dir / "report.txt").write_text(report, encoding="utf-8")

    with (out_dir / "report.csv").open("w", newline="", encoding="utf-8") as fh:
        wr = csv.writer(fh)
        wr.writerow(["package", "risk", "reason", "mode", "third_party", "in_system",
                     "enabled", "disabled", "apk_bytes", "data_bytes",
                     "recoverable_bytes", "apk_path"])
        for p in all_pkgs:
            wr.writerow([p["pkg"], p["risk"], p["reason"], p["mode"],
                         int(p["third_party"]), int(p["in_system"]),
                         int(p["enabled"]), int(p["disabled"]),
                         p["apk_size"], p["data_size"], p["recoverable"], p["apk"]])

    print()
    print(report)
    print()
    print("=" * 104)
    print(f"  report : {out_dir / 'report.txt'}")
    print(f"  csv    : {out_dir / 'report.csv'}")
    print(f"  raw    : {raw_dir}")
    print("=" * 104)
    return 0


if __name__ == "__main__":
    try:
        sys.exit(main())
    except KeyboardInterrupt:
        sys.exit(130)

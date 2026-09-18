#!/usr/bin/env python3
"""
tv_audit.py - Read-only audit of an Android TV / set-top box over ADB.

Collects device info, storage usage and the full package list, then classifies
every package as KEEP / CAUTION / BLOAT / UNKNOWN and estimates how much space
can actually be recovered by removing it.

This script NEVER modifies the device. It only runs read-only commands
(getprop, df, du, ls, pm list, dumpsys).

Usage
-----
    python scripts/tv_audit.py                    # auto-pick the only device
    python scripts/tv_audit.py -s 192.168.1.42:5555
    python scripts/tv_audit.py --try-root         # also attempt `adb root`
    python scripts/tv_audit.py --out scripts/tv-audit-out

Output
------
    <out>/report.txt    human readable report (this is what you paste back)
    <out>/report.csv    same data, machine readable
    <out>/raw/*.txt     raw command output, for debugging

Connect first, e.g.:
    adb connect 192.168.1.42:5555
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
            proc = subprocess.run(
                self._base() + args,
                capture_output=True,
                timeout=timeout,
            )
        except subprocess.TimeoutExpired:
            return 124, ""
        out = (proc.stdout + proc.stderr).decode("utf-8", errors="replace")
        return proc.returncode, out

    def shell(self, script: str, timeout: int = 180) -> str:
        """Run a shell script ON the device.

        The script is piped to `sh` over stdin so we can do loops and pipes
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
# KEEP  = removing it can brick the device, kill the remote or break input
# CAUTION = legitimate app you may or may not want, decide case by case
# BLOAT = preinstalled filler, normally safe to remove
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
    "com.android.downloads",  # packageinstaller provider on some ROMs
    "com.android.mediaprovider",
    "com.android.webview",
    "com.android.hotspot2.osulogin",
    "com.google.android.gms",
    "com.google.android.gsf",
    "com.google.android.packageinstaller",
    "com.google.android.permissioncontroller",
    "com.google.android.ext.services",
    "com.google.android.ext.shared",
}

KEEP_PREFIX = (
    "com.android.providers.",
    "com.android.internal.",
    "com.android.server",
    "com.android.tv.settings",
)

# Pattern -> why it must stay. Matching is by substring on the package name.
KEEP_PATTERNS: list[tuple[str, str]] = [
    ("remote", "IR/Bluetooth remote key mapping - remove it and the remote dies"),
    ("keyboard", "on-screen/virtual keyboard - blocks all text input"),
    ("inputmethod", "input method service"),
    ("launcher", "home screen - remove it and you land on a black screen"),
    ("setupwizard", "first boot wizard"),
    ("provision", "device provisioning"),
    ("keyguard", "lock screen"),
    ("settings", "settings app"),
    ("systemui", "system UI"),
    ("telecom", "telephony/HDMI-CEC call handling"),
    ("bluetooth", "bluetooth stack"),
    ("wifi", "wifi service"),
    ("network", "connectivity service"),
    ("vending", "Play Store"),
    ("gms", "Google Play Services (works without it, but many apps break)"),
    ("syncadapter", "account sync adapter"),
    ("mediacenter", "vendor media shell used by the home screen"),
]

# Well known preinstalled filler. Label is shown to the user.
BLOAT: dict[str, str] = {
    # Google media / apps frequently preinstalled on TV boxes
    "com.google.android.videos": "Google TV / Play Movies",
    "com.google.android.music": "Play Music",
    "com.google.android.apps.maps": "Google Maps",
    "com.google.android.apps.photos": "Google Photos",
    "com.google.android.apps.docs": "Google Drive",
    "com.google.android.gm": "Gmail",
    "com.google.android.gm.lite": "Gmail Go",
    "com.google.android.apps.tachyon": "Google Meet / Duo",
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
    "com.google.android.feedback": "Market feedback agent",
    "com.google.android.printservice.recommendation": "Cloud Print",
    "com.google.android.apps.restore": "Restore",
    "com.google.android.apps.mediashell": "Media shell",
    "com.google.android.tts": "Google TTS engine",
    "com.google.android.marvin.talkback": "TalkBack",
    "com.google.android.projection.gearhead": "Android Auto",
    "com.android.chrome": "Chrome",
    "com.android.bookmarkprovider": "Bookmark provider",
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
    # Streaming / VOD apps OEMs preload on cheap TVs
    "com.netflix.ninja": "Netflix",
    "com.netflix.mediaclient": "Netflix (phone)",
    "com.amazon.amazonvideo.livingroom": "Prime Video",
    "com.amazon.avod": "Prime Video",
    "com.disney.disneyplus": "Disney+",
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
    # Cheap box vendor junk / demos
    "com.android.demo.notepad3": "AOSP demo app",
    "com.android.inputmethod.pinyin": "Pinyin keyboard",
    "com.android.inputmethod.latin": "AOSP keyboard",
    "com.mediatek.thermalmanager": "MTK thermal manager",
}

BLOAT_PATTERNS: list[tuple[str, str]] = [
    (".demo", "vendor demo app"),
    (".sample", "vendor sample app"),
    ("ott.", "OTT streaming stub"),
    ("bloatware", "vendor bloatware"),
]


def classify(pkg: str) -> tuple[str, str]:
    """Return (risk, reason)."""
    if pkg in KEEP_EXACT or pkg.startswith(KEEP_PREFIX):
        return "KEEP", "core system component"

    low = pkg.lower()
    for pat, why in KEEP_PATTERNS:
        if pat in low:
            return "KEEP", why

    if pkg in BLOAT:
        return "BLOAT", BLOAT[pkg]

    for pat, why in BLOAT_PATTERNS:
        if pat in low:
            return "BLOAT", why

    # Vendor / OEM namespaces on cheap boxes are usually preinstalled apps,
    # but we cannot know what they do: ask before removing.
    if re.match(r"^com\.(oem|vendor|amlogic|rockchip|allwinner|mediatek|hisilicon|realtek|mstar|sunxi)\.", pkg):
        return "UNKNOWN", "OEM vendor app - verify before removing"
    if re.match(r"^com\.(android|google)\.", pkg):
        return "CAUTION", "AOSP/Google preinstall, not in the known-bloat list"
    if re.match(r"^com\.(amazon|netflix|google)\.", pkg):
        return "CAUTION", "preinstalled media app"

    return "UNKNOWN", "not recognised - needs manual check"


RISK_ORDER = {"BLOAT": 0, "UNKNOWN": 1, "CAUTION": 2, "KEEP": 3}


# --------------------------------------------------------------------------- #
# helpers
# --------------------------------------------------------------------------- #

REMOTE_APK_SIZES = r"""
pm list packages -f 2>/dev/null | while read line; do
  rest=${line#package:}
  pkg=${rest%%:*}
  apk=${rest#*:}
  if [ -z "$apk" ] || [ "$apk" = "$rest" ]; then
    apk=""
    sz=0
  else
    sz=$(ls -l "$apk" 2>/dev/null | awk '{print $5}')
    [ -z "$sz" ] && sz=0
  fi
  echo "$pkg|$sz|$apk"
done
"""

REMOTE_DATA_SIZES = r"""
du -sk /data/user/0/* 2>/dev/null | awk '{print $2"|"$1}'
du -sk /data/data/* 2>/dev/null | awk '{print $2"|"$1}'
"""

REMOTE_SDCARD_SIZES = r"""
du -sk /sdcard/* 2>/dev/null | awk '{print $2"|"$1}'
du -sk /sdcard/Android/data/* 2>/dev/null | awk '{print $2"|"$1}'
du -sk /sdcard/Android/obb/* 2>/dev/null | awk '{print $2"|"$1}'
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


def parse_props(text: str) -> dict[str, str]:
    props: dict[str, str] = {}
    for line in text.splitlines():
        if ": " in line:
            k, v = line.split(": ", 1)
            props[k.strip()] = v.strip()
    return props


def parse_pkg_list(text: str) -> set[str]:
    out = set()
    for line in text.splitlines():
        line = line.strip()
        if line.startswith("package:"):
            out.add(line[len("package:"):])
    return out


def parse_du(text: str) -> dict[str, int]:
    """`path|kilobytes` -> {basename: kb}"""
    out: dict[str, int] = {}
    for line in text.splitlines():
        line = line.rstrip()
        if "|" not in line:
            continue
        path, _, kb = line.rpartition("|")
        try:
            size = int(kb)
        except ValueError:
            continue
        name = path.rstrip("/").rsplit("/", 1)[-1]
        if not name:
            continue
        # keep the largest reading when the same package shows up twice
        if size > out.get(name, -1):
            out[name] = size
    return out


# --------------------------------------------------------------------------- #
# main
# --------------------------------------------------------------------------- #

def main() -> int:
    ap = argparse.ArgumentParser(description="Read-only Android TV audit over ADB")
    ap.add_argument("-s", "--serial", help="adb serial (e.g. 192.168.1.42:5555)")
    ap.add_argument("--out", default="scripts/tv-audit-out", help="output directory")
    ap.add_argument("--top", type=int, default=40, help="rows in the 'top space users' table")
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

    def dump(name: str, script: str, timeout: int = 180) -> str:
        text = adb.shell(script, timeout=timeout)
        (raw_dir / f"{name}.txt").write_text(text, encoding="utf-8", errors="replace")
        print(f"  collected {name:24s} ({len(text.splitlines())} lines)")
        return text

    print("\n[1/5] device info")
    props = parse_props(dump("props", "getprop\n"))
    root_uid = dump("root", "id -u\n").strip()
    is_root = root_uid.strip() == "0"

    print("[2/5] storage")
    df_data = dump("df_data", "df -k /data /cache /storage/emulated 2>/dev/null\n")
    diskstats = dump("diskstats", "dumpsys diskstats 2>/dev/null | head -30\n")
    sdcard_sizes = parse_du(dump("du_sdcard", REMOTE_SDCARD_SIZES, timeout=300))

    root_note = ""
    if args.try_root and not is_root:
        print("[2b ] attempting adb root (adbd will restart, this is safe)")
        code, out = adb.run(["root"], timeout=30)
        out = out.strip() or "(no output)"
        root_note = f"adb root -> {out}"
        print(f"      {out}")
        import time
        time.sleep(3)
        adb.run(["wait-for-device"], timeout=60)
        root_uid = adb.shell("id -u\n").strip()
        is_root = root_uid.strip() == "0"
        if is_root:
            print("      root OK: per-app data sizes will be readable")
        else:
            print("      root denied: falling back to non-root mode")

    print("[3/5] package list")
    pkgs_raw = dump("packages_f", REMOTE_APK_SIZES, timeout=300)
    third = parse_pkg_list(dump("third_party", "pm list packages -3\n"))
    third_dis = parse_pkg_list(dump("third_party_disabled", "pm list packages -3 -d\n"))
    sys_dis = parse_pkg_list(dump("system_disabled", "pm list packages -s -d\n"))
    enabled = parse_pkg_list(dump("enabled", "pm list packages -e\n"))

    print("[4/5] per-app data sizes")
    data_sizes = parse_du(dump("du_data", REMOTE_DATA_SIZES, timeout=600))
    if not data_sizes:
        print("      WARNING: data sizes unavailable (needs root). Space freed by")
        print("               `pm uninstall --user 0` cannot be estimated precisely.")

    print("[5/5] building report")

    packages: dict[str, dict] = {}
    for line in pkgs_raw.splitlines():
        parts = line.rstrip().split("|")
        if len(parts) != 3:
            continue
        pkg, size, apk = parts
        pkg = pkg.strip()
        if not pkg:
            continue
        try:
            apk_size = int(size)
        except ValueError:
            apk_size = 0
        is_system = apk.startswith("/system") or apk.startswith("/product") or apk.startswith("/vendor")
        packages[pkg] = {
            "pkg": pkg,
            "apk": apk,
            "apk_size": apk_size,
            "system": is_system,
            "data_size": data_sizes.get(pkg, 0) * 1024,
            "third_party": pkg in third or pkg in third_dis,
            "enabled": pkg in enabled,
            "disabled": pkg in third_dis or pkg in sys_dis,
        }

    # packages listed but missing from the -f dump (should not happen, but be safe)
    for pkg in third | third_dis:
        packages.setdefault(pkg, {
            "pkg": pkg, "apk": "", "apk_size": 0, "system": False,
            "data_size": data_sizes.get(pkg, 0) * 1024, "third_party": True,
            "enabled": pkg in enabled, "disabled": pkg in third_dis or pkg in sys_dis,
        })

    for info in packages.values():
        risk, reason = classify(info["pkg"])
        info["risk"] = risk
        info["reason"] = reason
        # Recoverable space: /system APKs live on a different partition, so
        # removing them for user 0 frees only their data directory.
        info["recoverable"] = info["data_size"] if info["system"] else info["apk_size"] + info["data_size"]

    # ---- storage numbers ------------------------------------------------- #
    data_line = ""
    for line in df_data.splitlines():
        if line.startswith("/dev") and "/data" in line:
            data_line = line
            break
    data_total_kb = data_used_kb = data_free_kb = 0
    if data_line:
        cols = data_line.split()
        try:
            data_total_kb = int(cols[1])
            data_used_kb = int(cols[2])
            data_free_kb = int(cols[3])
        except (ValueError, IndexError):
            pass

    # ---- render ---------------------------------------------------------- #
    lines: list[str] = []
    w = lines.append

    model = props.get("ro.product.model", "?")
    android = props.get("ro.build.version.release", "?")
    sdk = props.get("ro.build.version.sdk", "?")
    abi = props.get("ro.product.cpu.abi", "?")
    abi2 = props.get("ro.product.cpu.abi2", "")

    w("=" * 100)
    w("  WaveStream - Android device audit")
    w("=" * 100)
    w(f"  serial      : {adb.serial}")
    w(f"  model       : {props.get('ro.product.manufacturer','?')} {model}")
    w(f"  android     : {android} (sdk {sdk})")
    w(f"  abi         : {abi}{(' / ' + abi2) if abi2 else ''}")
    w(f"  build       : {props.get('ro.build.display.id','?')}")
    w(f"  fingerprint : {props.get('ro.build.fingerprint','?')}")
    w(f"  shell uid   : {root_uid} {'(ROOT - full data sizes available)' if is_root else '(unprivileged)'}")
    if root_note:
        w(f"  {root_note}")
    w("")

    w("-" * 100)
    w("  STORAGE (/data is where apps are installed)")
    w("-" * 100)
    for line in df_data.splitlines():
        if line.startswith("Filesystem"):
            w(f"  {line}")
        elif line.startswith("/dev"):
            w(f"  {line}")
    if data_total_kb:
        pct = 100.0 * data_used_kb / data_total_kb if data_total_kb else 0
        w("")
        w(f"  /data total {human(data_total_kb * 1024)}, used {human(data_used_kb * 1024)}, "
          f"FREE {human(data_free_kb * 1024)} ({pct:.0f}% full)")
        if data_free_kb * 1024 < 400 * 1024 * 1024:
            w("  >>> /data is critically full. Free at least ~400 MB before installing an APK.")
    if diskstats.strip():
        w("")
        w("  dumpsys diskstats:")
        for line in diskstats.splitlines()[:12]:
            w(f"    {line}")
    w("")

    if sdcard_sizes:
        w("-" * 100)
        w("  SHARED STORAGE (/sdcard - same partition as /data!)")
        w("-" * 100)
        for name, kb in sorted(sdcard_sizes.items(), key=lambda kv: -kv[1])[:20]:
            if kb >= 1024:
                w(f"  {human(kb * 1024):>10}  /sdcard/{name}")
        w("")

    all_pkgs = sorted(packages.values(), key=lambda p: -p["recoverable"])
    tp = [p for p in all_pkgs if p["third_party"]]
    sp = [p for p in all_pkgs if not p["third_party"]]

    w("-" * 100)
    w("  SUMMARY")
    w("-" * 100)
    w(f"  packages total      : {len(all_pkgs)}")
    w(f"  third-party (normal uninstall)  : {len(tp):4d}   "
      f"APK {human(sum(p['apk_size'] for p in tp)):>8}  DATA {human(sum(p['data_size'] for p in tp)):>8}")
    w(f"  preinstalled (/system, --user 0) : {len(sp):4d}   "
      f"APK {human(sum(p['apk_size'] for p in sp)):>8}  DATA {human(sum(p['data_size'] for p in sp)):>8}")
    w(f"  disabled packages   : {sum(1 for p in all_pkgs if p['disabled'])}")
    w("")
    w("  NOTE: APKs inside /system live on a different partition. Removing a")
    w("        preinstalled app for user 0 frees only its data directory.")
    w("")

    w("-" * 100)
    w(f"  {len(all_pkgs)} PACKAGES (sorted by recoverable space)")
    w("-" * 100)
    w(f"  {'RECOVER':>9} {'APK':>8} {'DATA':>8}  {'RISK':<8} {'STATE':<9} PACKAGE")
    w(f"  {'-'*9} {'-'*8} {'-'*8}  {'-'*8} {'-'*9} {'-'*46}")
    for p in all_pkgs:
        state = "disabled" if p["disabled"] else ("enabled" if p["enabled"] else "?")
        origin = "3rd" if p["third_party"] else "sys"
        w(f"  {human(p['recoverable']):>9} {human(p['apk_size']):>8} {human(p['data_size']):>8}  "
          f"{p['risk']:<8} {state:<9} {p['pkg']}  [{origin}]")

    w("")
    w("-" * 100)
    w("  RECOGNISED PACKAGES - what they are")
    w("-" * 100)
    for risk in ("BLOAT", "CAUTION", "UNKNOWN", "KEEP"):
        rows = [p for p in all_pkgs if p["risk"] == risk]
        if not rows:
            continue
        w("")
        w(f"  === {risk} ({len(rows)}) ===")
        for p in sorted(rows, key=lambda x: (x["reason"], -x["recoverable"])):
            w(f"    {p['pkg']:<52} {human(p['recoverable']):>8}  {p['reason']}")

    w("")
    w("-" * 100)
    w("  QUICK WINS - BLOAT you can remove for user 0")
    w("-" * 100)
    bloat = [p for p in all_pkgs if p["risk"] == "BLOAT"]
    total = sum(p["recoverable"] for p in bloat)
    for p in sorted(bloat, key=lambda x: -x["recoverable"])[:25]:
        w(f"    {human(p['recoverable']):>8}  {p['pkg']:<50} {p['reason']}")
    w("")
    w(f"    TOTAL recoverable from BLOAT (estimated): {human(total)}")
    if not is_root:
        w("    (data sizes are estimates: re-run with --try-root for exact figures)")
    w("")

    report = "\n".join(lines)
    (out_dir / "report.txt").write_text(report, encoding="utf-8")

    with (out_dir / "report.csv").open("w", newline="", encoding="utf-8") as fh:
        wr = csv.writer(fh)
        wr.writerow(["package", "risk", "reason", "origin", "enabled", "disabled",
                     "apk_bytes", "data_bytes", "recoverable_bytes", "apk_path"])
        for p in all_pkgs:
            wr.writerow([p["pkg"], p["risk"], p["reason"],
                         "3rd" if p["third_party"] else "sys",
                         int(p["enabled"]), int(p["disabled"]),
                         p["apk_size"], p["data_size"], p["recoverable"], p["apk"]])

    print(report)
    print()
    print("=" * 100)
    print(f"  report : {out_dir / 'report.txt'}")
    print(f"  csv    : {out_dir / 'report.csv'}")
    print(f"  raw    : {raw_dir}")
    print("=" * 100)
    return 0


if __name__ == "__main__":
    try:
        sys.exit(main())
    except KeyboardInterrupt:
        sys.exit(130)

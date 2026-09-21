package p099l5;

import O7.q;
import androidx.media3.common.MimeTypes;
import io.ktor.sse.ServerSentEventKt;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.Locale;
import p078i6.m;
import p078i6.o;

public final class B {
    public static A a(int i3, String str, String str2) {
        String lowerCase = o.o1(m.l0(new String[]{str, str2}), ServerSentEventKt.SPACE, null, null, null, 62).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (q.B0(lowerCase, MimeTypes.AUDIO_E_AC3_JOC, false) || q.B0(lowerCase, MimeTypes.CODEC_E_AC3_JOC, false)) {
            return A.f24751n;
        }
        if (q.B0(lowerCase, "true-hd", false) || q.B0(lowerCase, "truehd", false) || q.B0(lowerCase, "trhd", false) || q.B0(lowerCase, "mlp", false)) {
            return A.f24752o;
        }
        if (q.B0(lowerCase, "eac3", false) || q.B0(lowerCase, "ec-3", false) || q.B0(lowerCase, "ec3", false)) {
            return A.f24750m;
        }
        if (q.B0(lowerCase, "ac3", false) || q.B0(lowerCase, "ac-3", false)) {
            return A.f24749l;
        }
        if (q.B0(lowerCase, "dts-hd", false) || q.B0(lowerCase, "dtsh", false) || q.B0(lowerCase, "dtse", false)) {
            return A.f24754q;
        }
        if (q.B0(lowerCase, "dts", false)) {
            return A.f24753p;
        }
        if (q.B0(lowerCase, "aac", false) || q.B0(lowerCase, "mp4a", false)) {
            return A.f24755r;
        }
        if (q.B0(lowerCase, "opus", false)) {
            return A.f24756s;
        }
        if (q.B0(lowerCase, "flac", false)) {
            return A.f24757t;
        }
        if (i3 > 2) {
            return A.f24748k;
        }
        if (i3 == 2) {
            return A.j;
        }
        return i3 == 1 ? A.f24747i : A.f24746h;
    }

    public static String b(int i3) {
        if (i3 >= 2160) {
            return "2160";
        }
        if (i3 >= 1080) {
            return "1080";
        }
        if (i3 >= 720) {
            return "720";
        }
        if (i3 >= 576) {
            return "576";
        }
        return i3 >= 480 ? "480" : "SD";
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (q.B0(lowerCase, "hevc", false) || q.B0(lowerCase, "h265", false) || q.B0(lowerCase, "hvc1", false) || q.B0(lowerCase, "hev1", false) || q.B0(lowerCase, "dvhe", false)) {
            return "HEVC";
        }
        if (q.B0(lowerCase, "avc", false) || q.B0(lowerCase, RRWebVideoEvent.REPLAY_ENCODING, false) || q.B0(lowerCase, "avc1", false) || q.B0(lowerCase, "avc3", false)) {
            return "H.264";
        }
        if (q.B0(lowerCase, "av01", false) || q.B0(lowerCase, "av1", false)) {
            return "AV1";
        }
        if (q.B0(lowerCase, "vp9", false) || q.B0(lowerCase, "vp09", false)) {
            return "VP9";
        }
        if (q.B0(lowerCase, "vp8", false) || q.B0(lowerCase, "vp08", false)) {
            return "VP8";
        }
        if (q.B0(lowerCase, "mp4v", false) || q.B0(lowerCase, "xvid", false) || q.B0(lowerCase, "divx", false)) {
            return "MPEG-4";
        }
        if (q.B0(lowerCase, "mpeg2", false) || q.B0(lowerCase, "mp2v", false) || q.B0(lowerCase, "mpgv", false)) {
            return "MPEG-2";
        }
        return null;
    }
}

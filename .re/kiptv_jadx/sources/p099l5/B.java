package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class B {
    public static p099l5.A a(int i3, java.lang.String str, java.lang.String str2) {
        java.lang.String lowerCase = p078i6.o.o1(p078i6.m.l0(new java.lang.String[]{str, str2}), io.ktor.sse.ServerSentEventKt.SPACE, null, null, null, 62).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (O7.q.B0(lowerCase, androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC, false) || O7.q.B0(lowerCase, androidx.media3.common.MimeTypes.CODEC_E_AC3_JOC, false)) {
            return p099l5.A.f24751n;
        }
        if (O7.q.B0(lowerCase, "true-hd", false) || O7.q.B0(lowerCase, "truehd", false) || O7.q.B0(lowerCase, "trhd", false) || O7.q.B0(lowerCase, "mlp", false)) {
            return p099l5.A.f24752o;
        }
        if (O7.q.B0(lowerCase, "eac3", false) || O7.q.B0(lowerCase, "ec-3", false) || O7.q.B0(lowerCase, "ec3", false)) {
            return p099l5.A.f24750m;
        }
        if (O7.q.B0(lowerCase, "ac3", false) || O7.q.B0(lowerCase, "ac-3", false)) {
            return p099l5.A.f24749l;
        }
        if (O7.q.B0(lowerCase, "dts-hd", false) || O7.q.B0(lowerCase, "dtsh", false) || O7.q.B0(lowerCase, "dtse", false)) {
            return p099l5.A.f24754q;
        }
        if (O7.q.B0(lowerCase, "dts", false)) {
            return p099l5.A.f24753p;
        }
        if (O7.q.B0(lowerCase, "aac", false) || O7.q.B0(lowerCase, "mp4a", false)) {
            return p099l5.A.f24755r;
        }
        if (O7.q.B0(lowerCase, "opus", false)) {
            return p099l5.A.f24756s;
        }
        if (O7.q.B0(lowerCase, "flac", false)) {
            return p099l5.A.f24757t;
        }
        if (i3 > 2) {
            return p099l5.A.f24748k;
        }
        if (i3 == 2) {
            return p099l5.A.j;
        }
        return i3 == 1 ? p099l5.A.f24747i : p099l5.A.f24746h;
    }

    public static java.lang.String b(int i3) {
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

    public static java.lang.String c(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        if (O7.q.B0(lowerCase, "hevc", false) || O7.q.B0(lowerCase, "h265", false) || O7.q.B0(lowerCase, "hvc1", false) || O7.q.B0(lowerCase, "hev1", false) || O7.q.B0(lowerCase, "dvhe", false)) {
            return "HEVC";
        }
        if (O7.q.B0(lowerCase, "avc", false) || O7.q.B0(lowerCase, io.sentry.rrweb.RRWebVideoEvent.REPLAY_ENCODING, false) || O7.q.B0(lowerCase, "avc1", false) || O7.q.B0(lowerCase, "avc3", false)) {
            return "H.264";
        }
        if (O7.q.B0(lowerCase, "av01", false) || O7.q.B0(lowerCase, "av1", false)) {
            return "AV1";
        }
        if (O7.q.B0(lowerCase, "vp9", false) || O7.q.B0(lowerCase, "vp09", false)) {
            return "VP9";
        }
        if (O7.q.B0(lowerCase, "vp8", false) || O7.q.B0(lowerCase, "vp08", false)) {
            return "VP8";
        }
        if (O7.q.B0(lowerCase, "mp4v", false) || O7.q.B0(lowerCase, "xvid", false) || O7.q.B0(lowerCase, "divx", false)) {
            return "MPEG-4";
        }
        if (O7.q.B0(lowerCase, "mpeg2", false) || O7.q.B0(lowerCase, "mp2v", false) || O7.q.B0(lowerCase, "mpgv", false)) {
            return "MPEG-2";
        }
        return null;
    }
}

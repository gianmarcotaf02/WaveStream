package p085j5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 j5.P[], still in use, count: 1, list:
  (r0v1 j5.P[]) from 0x00a7: INVOKE (r0v1 j5.P[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:168)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class P {
    HLS("HLS Stream"),
    DASH("DASH Stream"),
    MP4("MPEG-4 Video"),
    TS("MPEG Transport Stream"),
    MKV("Matroska Video"),
    AVI("Audio Video Interleave"),
    FLV("Flash Video"),
    WEBM("WebM Video"),
    WMV("Windows Media Video"),
    MOV("QuickTime Movie"),
    RTSP("RTSP Stream"),
    RTMP("RTMP Stream"),
    UNKNOWN("Unknown Format");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f24045h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(pArr);
    }

    public P(java.lang.String str) {
        super(str, i);
        this.f24045h = str;
    }

    public static p085j5.P valueOf(java.lang.String str) {
        return (p085j5.P) java.lang.Enum.valueOf(p085j5.P.class, str);
    }

    public static p085j5.P[] values() {
        return (p085j5.P[]) f24044v.clone();
    }
}

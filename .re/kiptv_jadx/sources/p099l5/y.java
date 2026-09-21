package p099l5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l5.y[], still in use, count: 1, list:
  (r0v1 l5.y[]) from 0x0036: INVOKE (r0v1 l5.y[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:55)
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
public final class y {
    Auto(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO),
    ExoPlayer(io.sentry.protocol.SentryStackFrame.JsonKeys.NATIVE),
    MPV("mpv"),
    VLC("vlc");

    public static final p099l5.x Companion;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f24812h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(yVarArr);
        Companion = new p099l5.x();
    }

    public y(java.lang.String str) {
        super(str, i);
        this.f24812h = str;
    }

    public static p099l5.y valueOf(java.lang.String str) {
        return (p099l5.y) java.lang.Enum.valueOf(p099l5.y.class, str);
    }

    public static p099l5.y[] values() {
        return (p099l5.y[]) f24811m.clone();
    }
}

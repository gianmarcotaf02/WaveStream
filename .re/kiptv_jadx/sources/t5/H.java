package t5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t5.H[], still in use, count: 1, list:
  (r0v1 t5.H[]) from 0x0043: INVOKE (r0v1 t5.H[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:68)
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
/* JADX INFO: loaded from: classes4.dex */
public final class H {
    CARD(0.45f, 0.22f),
    AMBIENT(0.55f, 0.34f),
    SURFACE(0.42f, 0.28f),
    GLOW(0.45f, 0.68f);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f27912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f27913i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(hArr);
    }

    public H(float f9, float f10) {
        super(str, i);
        this.f27912h = f9;
        this.f27913i = f10;
    }

    public static t5.H valueOf(java.lang.String str) {
        return (t5.H) java.lang.Enum.valueOf(t5.H.class, str);
    }

    public static t5.H[] values() {
        return (t5.H[]) f27911n.clone();
    }
}

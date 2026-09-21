package p099l5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 l5.d[], still in use, count: 1, list:
  (r0v1 l5.d[]) from 0x005c: INVOKE (r0v1 l5.d[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:93)
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
/* JADX INFO: renamed from: l5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2551d {
    /* JADX INFO: Fake field, exist only in values array */
    X0_5(0.5f, "0.5x"),
    /* JADX INFO: Fake field, exist only in values array */
    X0_75(0.75f, "0.75x"),
    X1(1.0f, "Normal"),
    /* JADX INFO: Fake field, exist only in values array */
    X1_25(1.25f, "1.25x"),
    /* JADX INFO: Fake field, exist only in values array */
    X1_5(1.5f, "1.5x"),
    /* JADX INFO: Fake field, exist only in values array */
    X1_75(1.75f, "1.75x"),
    /* JADX INFO: Fake field, exist only in values array */
    X2(2.0f, "2x");

    public static final p099l5.C2550c Companion = new p099l5.C2550c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f24777l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f24778h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f24779i;

    static {
        f24777l = com.google.crypto.tink.shaded.protobuf.q0.t(new p099l5.EnumC2551d[]{r0, r1, r2, new p099l5.EnumC2551d(1.25f, "1.25x"), new p099l5.EnumC2551d(1.5f, "1.5x"), new p099l5.EnumC2551d(1.75f, "1.75x"), new p099l5.EnumC2551d(2.0f, "2x")});
    }

    public EnumC2551d(float f9, java.lang.String str) {
        super(str, i);
        this.f24778h = f9;
        this.f24779i = str;
    }

    public static p099l5.EnumC2551d valueOf(java.lang.String str) {
        return (p099l5.EnumC2551d) java.lang.Enum.valueOf(p099l5.EnumC2551d.class, str);
    }

    public static p099l5.EnumC2551d[] values() {
        return (p099l5.EnumC2551d[]) f24776k.clone();
    }
}

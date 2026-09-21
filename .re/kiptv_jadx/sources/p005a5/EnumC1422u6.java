package p005a5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a5.u6[], still in use, count: 1, list:
  (r0v1 a5.u6[]) from 0x0028: INVOKE (r0v1 a5.u6[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:41)
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
/* JADX INFO: renamed from: a5.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1422u6 {
    POPULAR("home.trakt.popular"),
    /* JADX INFO: Fake field, exist only in values array */
    TRENDING("home.trakt.trending"),
    OFFICIAL("home.trakt.official");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f15147l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f15148h;

    static {
        f15147l = com.google.crypto.tink.shaded.protobuf.q0.t(enumC1422u6Arr);
    }

    public EnumC1422u6(java.lang.String str) {
        super(str, i);
        this.f15148h = str;
    }

    public static p005a5.EnumC1422u6 valueOf(java.lang.String str) {
        return (p005a5.EnumC1422u6) java.lang.Enum.valueOf(p005a5.EnumC1422u6.class, str);
    }

    public static p005a5.EnumC1422u6[] values() {
        return (p005a5.EnumC1422u6[]) f15146k.clone();
    }
}

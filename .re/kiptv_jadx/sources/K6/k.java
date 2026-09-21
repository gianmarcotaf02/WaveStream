package K6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 K6.k[], still in use, count: 1, list:
  (r0v1 K6.k[]) from 0x0066: INVOKE (r0v1 K6.k[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:103)
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
public final class k {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.Set f6878l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p101l7.e f6888h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p101l7.e f6889i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f6890k;

    static {
        K6.k kVar = CHAR;
        K6.k kVar2 = BYTE;
        K6.k kVar3 = SHORT;
        K6.k kVar4 = INT;
        K6.k kVar5 = FLOAT;
        K6.k kVar6 = LONG;
        K6.k kVar7 = DOUBLE;
        com.google.crypto.tink.shaded.protobuf.q0.t(kVarArr);
        f6878l = p078i6.m.F0(new K6.k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7});
    }

    public k(java.lang.String str) {
        super(str, i);
        this.f6888h = p101l7.e.e(str);
        this.f6889i = p101l7.e.e(str.concat("Array"));
        p070h6.i iVar = p070h6.i.f22537i;
        this.j = com.google.common.util.concurrent.D.A(iVar, new K6.j(this, 0));
        this.f6890k = com.google.common.util.concurrent.D.A(iVar, new K6.j(this, 1));
    }

    public static K6.k valueOf(java.lang.String str) {
        return (K6.k) java.lang.Enum.valueOf(K6.k.class, str);
    }

    public static K6.k[] values() {
        return (K6.k[]) f6887u.clone();
    }
}

package C7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 C7.b0[], still in use, count: 1, list:
  (r0v1 C7.b0[]) from 0x002a: INVOKE (r0v1 C7.b0[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:43)
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
public final class b0 {
    j(0, ""),
    f1576k(1, "in"),
    f1577l(2, "out");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f1579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f1580i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(b0VarArr);
    }

    public b0(int i3, java.lang.String str) {
        super(str, i3);
        this.f1579h = str;
        this.f1580i = z;
    }

    public static C7.b0 valueOf(java.lang.String str) {
        return (C7.b0) java.lang.Enum.valueOf(C7.b0.class, str);
    }

    public static C7.b0[] values() {
        return (C7.b0[]) f1578m.clone();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f1579h;
    }
}

package F7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 F7.i[], still in use, count: 1, list:
  (r0v1 F7.i[]) from 0x002a: INVOKE (r0v1 F7.i[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:43)
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
public final class i {
    IN("in"),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3719h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(iVarArr);
    }

    public i(java.lang.String str) {
        super(str, i);
        this.f3719h = str;
    }

    public static F7.i valueOf(java.lang.String str) {
        return (F7.i) java.lang.Enum.valueOf(F7.i.class, str);
    }

    public static F7.i[] values() {
        return (F7.i[]) f3718l.clone();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f3719h;
    }
}

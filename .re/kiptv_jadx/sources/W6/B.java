package W6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 W6.B[], still in use, count: 1, list:
  (r0v1 W6.B[]) from 0x002a: INVOKE (r0v1 W6.B[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:43)
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
public final class B {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f10611h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(bArr);
    }

    public B(java.lang.String str) {
        super(str, i);
        this.f10611h = str;
    }

    public static W6.B valueOf(java.lang.String str) {
        return (W6.B) java.lang.Enum.valueOf(W6.B.class, str);
    }

    public static W6.B[] values() {
        return (W6.B[]) f10610l.clone();
    }
}

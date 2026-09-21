package S2;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 S2.c[], still in use, count: 1, list:
  (r0v1 S2.c[]) from 0x0028: INVOKE (r0v1 S2.c[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:41)
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
public final class c {
    j(true, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(true, false),
    /* JADX INFO: Fake field, exist only in values array */
    EF23(false, true),
    /* JADX INFO: Fake field, exist only in values array */
    EF31(false, false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9214h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f9215i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(cVarArr);
    }

    public c(boolean z6, boolean z9) {
        super(str, i);
        this.f9214h = z6;
        this.f9215i = z9;
    }

    public static S2.c valueOf(java.lang.String str) {
        return (S2.c) java.lang.Enum.valueOf(S2.c.class, str);
    }

    public static S2.c[] values() {
        return (S2.c[]) f9213k.clone();
    }
}

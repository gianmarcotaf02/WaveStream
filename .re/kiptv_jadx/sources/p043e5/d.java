package p043e5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 e5.d[], still in use, count: 1, list:
  (r0v1 e5.d[]) from 0x002a: INVOKE (r0v1 e5.d[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:43)
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
public final class d {
    NEW("whatsNew.section.new"),
    IMPROVEMENT("whatsNew.section.improvement"),
    BUGFIX("whatsNew.section.bugfix");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f21428m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f21429h;

    static {
        f21428m = com.google.crypto.tink.shaded.protobuf.q0.t(dVarArr);
    }

    public d(java.lang.String str) {
        super(str, i);
        this.f21429h = str;
    }

    public static p043e5.d valueOf(java.lang.String str) {
        return (p043e5.d) java.lang.Enum.valueOf(p043e5.d.class, str);
    }

    public static p043e5.d[] values() {
        return (p043e5.d[]) f21427l.clone();
    }
}

package t8;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 t8.N[], still in use, count: 1, list:
  (r0v1 t8.N[]) from 0x0036: INVOKE (r0v1 t8.N[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m), WRAPPED] (LINE:55)
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
public final class N {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');


    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ p126o6.b f28600o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final char f28601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char f28602i;

    static {
        f28600o = com.google.crypto.tink.shaded.protobuf.q0.t(nArr);
    }

    public N(char c9, char c10) {
        super(str, i);
        this.f28601h = c9;
        this.f28602i = c10;
    }

    public static t8.N valueOf(java.lang.String str) {
        return (t8.N) java.lang.Enum.valueOf(t8.N.class, str);
    }

    public static t8.N[] values() {
        return (t8.N[]) f28599n.clone();
    }
}

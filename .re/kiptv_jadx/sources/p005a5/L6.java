package p005a5;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a5.L6[], still in use, count: 1, list:
  (r0v1 a5.L6[]) from 0x0022: INVOKE (r0v1 a5.L6[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:35)
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
public final class L6 {
    j("movies", "movie"),
    f13624k("shows", "show");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f13626h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f13627i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(l6Arr);
    }

    public L6(java.lang.String str, java.lang.String str2) {
        super(str, i);
        this.f13626h = str;
        this.f13627i = str2;
    }

    public static p005a5.L6 valueOf(java.lang.String str) {
        return (p005a5.L6) java.lang.Enum.valueOf(p005a5.L6.class, str);
    }

    public static p005a5.L6[] values() {
        return (p005a5.L6[]) f13625l.clone();
    }
}

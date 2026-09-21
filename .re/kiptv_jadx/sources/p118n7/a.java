package p118n7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 n7.a[], still in use, count: 1, list:
  (r0v1 n7.a[]) from 0x0021: INVOKE (r0v1 n7.a[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:34)
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
public final class a {
    NO_ARGUMENTS(3),
    /* JADX INFO: Fake field, exist only in values array */
    UNLESS_EMPTY(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF24(true, true);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f25837i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(aVarArr);
    }

    public a(boolean z6, boolean z9) {
        super(str, i);
        this.f25836h = z6;
        this.f25837i = z9;
    }

    public static p118n7.a valueOf(java.lang.String str) {
        return (p118n7.a) java.lang.Enum.valueOf(p118n7.a.class, str);
    }

    public static p118n7.a[] values() {
        return (p118n7.a[]) f25835k.clone();
    }

    public /* synthetic */ a(int i3) {
        this((i3 & 1) == 0, false);
    }
}

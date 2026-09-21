package W6;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 W6.a[], still in use, count: 1, list:
  (r0v1 W6.a[]) from 0x0045: INVOKE (r0v1 W6.a[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:70)
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
/* JADX INFO: renamed from: W6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1000a {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    /* JADX INFO: Fake field, exist only in values array */
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f10639h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC1000aArr);
    }

    public EnumC1000a(java.lang.String str) {
        super(str, i);
        this.f10639h = str;
    }

    public static W6.EnumC1000a valueOf(java.lang.String str) {
        return (W6.EnumC1000a) java.lang.Enum.valueOf(W6.EnumC1000a.class, str);
    }

    public static W6.EnumC1000a[] values() {
        return (W6.EnumC1000a[]) f10638n.clone();
    }
}

package S4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 S4.e[], still in use, count: 1, list:
  (r0v1 S4.e[]) from 0x005c: INVOKE (r0v1 S4.e[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:93)
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
/* JADX INFO: renamed from: S4.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0866e {
    MOBILE("SD"),
    SD("SD"),
    HD720P("HD"),
    HD("HD"),
    FHD("FHD"),
    QHD("2K"),
    UHD("4K"),
    UHD8K("8K");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f9386h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0866eArr);
    }

    public EnumC0866e(java.lang.String str) {
        super(str, i);
        this.f9386h = str;
    }

    public static S4.EnumC0866e valueOf(java.lang.String str) {
        return (S4.EnumC0866e) java.lang.Enum.valueOf(S4.EnumC0866e.class, str);
    }

    public static S4.EnumC0866e[] values() {
        return (S4.EnumC0866e[]) f9385q.clone();
    }
}

package E7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 E7.h[], still in use, count: 1, list:
  (r0v1 E7.h[]) from 0x0076: INVOKE (r0v1 E7.h[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:119)
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
public final class h {
    CAPTURED_TYPE_SCOPE("No member resolution should be done on captured type, it used only during constraint system resolution"),
    INTEGER_LITERAL_TYPE_SCOPE("Scope for integer literal type (%s)"),
    /* JADX INFO: Fake field, exist only in values array */
    ERASED_RECEIVER_TYPE_SCOPE("Error scope for erased receiver type"),
    SCOPE_FOR_ABBREVIATION_TYPE("Scope for abbreviation %s"),
    /* JADX INFO: Fake field, exist only in values array */
    STUB_TYPE_SCOPE("Scope for stub type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    NON_CLASSIFIER_SUPER_TYPE_SCOPE("A scope for common supertype which is not a normal classifier"),
    ERROR_TYPE_SCOPE("Scope for error type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_TYPE_SCOPE("Scope for unsupported type %s"),
    SCOPE_FOR_ERROR_CLASS("Error scope for class %s with arguments: %s"),
    /* JADX INFO: Fake field, exist only in values array */
    SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE("Error resolution candidate for call %s");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3240h;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(hVarArr);
    }

    public h(java.lang.String str) {
        super(str, i);
        this.f3240h = str;
    }

    public static E7.h valueOf(java.lang.String str) {
        return (E7.h) java.lang.Enum.valueOf(E7.h.class, str);
    }

    public static E7.h[] values() {
        return (E7.h[]) f3239n.clone();
    }
}

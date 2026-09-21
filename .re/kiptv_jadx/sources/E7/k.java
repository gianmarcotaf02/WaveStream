package E7;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v45 E7.k[], still in use, count: 1, list:
  (r0v45 E7.k[]) from 0x0501: INVOKE (r0v45 E7.k[]) STATIC call: com.google.crypto.tink.shaded.protobuf.q0.t(java.lang.Enum[]):o6.b A[MD:(java.lang.Enum[]):o6.b (m)] (LINE:1282)
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
public final class k {
    /* JADX INFO: Fake field, exist only in values array */
    EF1(0, "Unresolved type for %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(1, "Unresolved type parameter type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF3(2, "Unresolved class %s"),
    j(3, "Unresolved java class %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF5(4, "Unresolved declaration %s"),
    f3262k(5, "Unresolved type for %s (arrayDimensions=%s)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF7(6, "Unresolved type alias %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF8(7, "Return type for %s cannot be resolved"),
    f3263l(8, "Return type for function cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF10(9, "Return type for property %s cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF11(10, "Return type for constructor %s cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF12(11, "Implicit return type for function %s cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(12, "Implicit return type for property %s cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF14(13, "Implicit return type for property accessor %s cannot be resolved"),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(14, "%s() return type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(15, "Recursive type"),
    f3264m(16, "Recursive type alias %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(17, "Recursive annotation's type"),
    f3265n(18, "Cyclic upper bounds"),
    f3266o(19, "Cyclic supertypes"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(20, "Cannot infer a lambda context receiver type"),
    f3267p(21, "Cannot infer a lambda parameter type"),
    f3268q(22, "Cannot infer a type variable %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(23, "Resolution error type (%s)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(24, "Error expected type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(25, "Error type for data flow"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(26, "Failed to reconstruct type %s"),
    f3269r(27, "Unable to substitute type (%s)"),
    f3270s(28, "Special DONT_CARE type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(29, "Stub type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(30, "Function placeholder type (arguments: %s)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(31, "Stubbed 'Result' type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(32, "Error type for a compiler exception while analyzing %s"),
    f3271t(33, "Error java flexible type with id %s. (%s..%s)"),
    f3272u(34, "Error raw type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(35, "Inconsistent type %s (parameters.size = %s, arguments.size = %s)"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(36, "Illegal type range for dynamic type %s..%s"),
    f3273v(37, "Unknown type parameter %s. Please try recompiling module containing \"%s\""),
    f3274w(38, "Couldn't deserialize type parameter %s in %s"),
    f3275x(39, "Inconsistent suspend function type in metadata with constructor %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(40, "Unexpected id of a flexible type %s. (%s..%s)"),
    y(41, "Unknown type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(42, "No type specified for %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(43, "Loop range has no type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(44, "Loop parameter has no type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(45, "Missed a type for a value parameter %s"),
    f3276z(46, "Missed a type argument for a type parameter %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(47, "Error type for parse error argument %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(48, "Error type for star projection directly passing as a call type argument"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(49, "Dynamic type in a not allowed context"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(50, "Not an annotation type %s in the annotation context"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(51, "Unit type returned by inc or dec"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(52, "Return not allowed"),
    /* JADX INFO: Fake field, exist only in values array */
    EF0(53, "Unresolved 'Parcel' type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(54, "Kapt error type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(55, "Error type for synthetic element"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(56, "Error type in ad hoc resolve for lighter classes"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(57, "Error expression type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(58, "Error receiver type for %s"),
    f3250A(59, "Error constant value %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(60, "Empty callable reference"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(61, "Unsupported callable reference type %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(62, "Error delegation type for %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(63, "Type is unavailable for declaration %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(64, "Error type parameter"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(65, "Error type projection"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(66, "Error super type"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(67, "Supertype of error type %s"),
    f3251B(68, "Error property type"),
    f3252C(69, "Error class"),
    f3253D(70, "Type for error type constructor (%s)"),
    f3254E(71, "Intersection of error types %s"),
    f3255F(72, "Cannot compute erased upper bound of a type parameter %s"),
    f3256G(73, "Unsigned type %s not found"),
    H(74, "Not found the corresponding enum class for given enum entry %s.%s"),
    f3257I(75, "Not found recorded type for %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(76, "Descriptor not found for function %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(77, "Cannot build class type, descriptor not found for builder %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(78, "Cannot build type parameter type, descriptor not found for builder %s"),
    f3258J(79, "Type for unmapped Java annotation target to Kotlin one"),
    f3259K(80, "Unknown type for an array element of a java annotation argument"),
    f3260L(81, "No fqName for annotation %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1113(82, "No fqName for %s"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1126(83, "Type for generated error expression");


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3277h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f3278i;

    static {
        com.google.crypto.tink.shaded.protobuf.q0.t(kVarArr);
    }

    public k(int i3, java.lang.String str) {
        super(str, i3);
        this.f3277h = str;
        this.f3278i = z;
    }

    public static E7.k valueOf(java.lang.String str) {
        return (E7.k) java.lang.Enum.valueOf(E7.k.class, str);
    }

    public static E7.k[] values() {
        return (E7.k[]) f3261M.clone();
    }
}

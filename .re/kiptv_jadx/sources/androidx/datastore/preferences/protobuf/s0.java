package androidx.datastore.preferences.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class s0 {
    public static final androidx.datastore.preferences.protobuf.o0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.p0 f16250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final androidx.datastore.preferences.protobuf.q0 f16251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ androidx.datastore.preferences.protobuf.s0[] f16252m;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.t0 f16253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16254i;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.s0 EF10;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.s0 EF11;

    /* JADX INFO: Fake field, exist only in values array */
    androidx.datastore.preferences.protobuf.s0 EF12;

    static {
        androidx.datastore.preferences.protobuf.s0 s0Var = new androidx.datastore.preferences.protobuf.s0("DOUBLE", 0, androidx.datastore.preferences.protobuf.t0.DOUBLE, 1);
        androidx.datastore.preferences.protobuf.s0 s0Var2 = new androidx.datastore.preferences.protobuf.s0("FLOAT", 1, androidx.datastore.preferences.protobuf.t0.FLOAT, 5);
        androidx.datastore.preferences.protobuf.t0 t0Var = androidx.datastore.preferences.protobuf.t0.LONG;
        androidx.datastore.preferences.protobuf.s0 s0Var3 = new androidx.datastore.preferences.protobuf.s0("INT64", 2, t0Var, 0);
        androidx.datastore.preferences.protobuf.s0 s0Var4 = new androidx.datastore.preferences.protobuf.s0("UINT64", 3, t0Var, 0);
        androidx.datastore.preferences.protobuf.t0 t0Var2 = androidx.datastore.preferences.protobuf.t0.INT;
        androidx.datastore.preferences.protobuf.s0 s0Var5 = new androidx.datastore.preferences.protobuf.s0("INT32", 4, t0Var2, 0);
        androidx.datastore.preferences.protobuf.s0 s0Var6 = new androidx.datastore.preferences.protobuf.s0("FIXED64", 5, t0Var, 1);
        androidx.datastore.preferences.protobuf.s0 s0Var7 = new androidx.datastore.preferences.protobuf.s0("FIXED32", 6, t0Var2, 5);
        androidx.datastore.preferences.protobuf.s0 s0Var8 = new androidx.datastore.preferences.protobuf.s0("BOOL", 7, androidx.datastore.preferences.protobuf.t0.BOOLEAN, 0);
        androidx.datastore.preferences.protobuf.o0 o0Var = new androidx.datastore.preferences.protobuf.o0("STRING", 8, androidx.datastore.preferences.protobuf.t0.STRING, 2);
        j = o0Var;
        androidx.datastore.preferences.protobuf.t0 t0Var3 = androidx.datastore.preferences.protobuf.t0.MESSAGE;
        androidx.datastore.preferences.protobuf.p0 p0Var = new androidx.datastore.preferences.protobuf.p0("GROUP", 9, t0Var3, 3);
        f16250k = p0Var;
        androidx.datastore.preferences.protobuf.q0 q0Var = new androidx.datastore.preferences.protobuf.q0("MESSAGE", 10, t0Var3, 2);
        f16251l = q0Var;
        f16252m = new androidx.datastore.preferences.protobuf.s0[]{s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7, s0Var8, o0Var, p0Var, q0Var, new androidx.datastore.preferences.protobuf.r0("BYTES", 11, androidx.datastore.preferences.protobuf.t0.BYTE_STRING, 2), new androidx.datastore.preferences.protobuf.s0("UINT32", 12, t0Var2, 0), new androidx.datastore.preferences.protobuf.s0("ENUM", 13, androidx.datastore.preferences.protobuf.t0.ENUM, 0), new androidx.datastore.preferences.protobuf.s0("SFIXED32", 14, t0Var2, 5), new androidx.datastore.preferences.protobuf.s0("SFIXED64", 15, t0Var, 1), new androidx.datastore.preferences.protobuf.s0("SINT32", 16, t0Var2, 0), new androidx.datastore.preferences.protobuf.s0("SINT64", 17, t0Var, 0)};
    }

    public s0(java.lang.String str, int i3, androidx.datastore.preferences.protobuf.t0 t0Var, int i9) {
        super(str, i3);
        this.f16253h = t0Var;
        this.f16254i = i9;
    }

    public static androidx.datastore.preferences.protobuf.s0 valueOf(java.lang.String str) {
        return (androidx.datastore.preferences.protobuf.s0) java.lang.Enum.valueOf(androidx.datastore.preferences.protobuf.s0.class, str);
    }

    public static androidx.datastore.preferences.protobuf.s0[] values() {
        return (androidx.datastore.preferences.protobuf.s0[]) f16252m.clone();
    }
}

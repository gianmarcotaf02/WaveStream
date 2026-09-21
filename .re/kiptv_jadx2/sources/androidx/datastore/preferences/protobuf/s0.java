package androidx.datastore.preferences.protobuf;

public class s0 {
    public static final o0 j;

    public static final p0 f16250k;

    public static final q0 f16251l;

    public static final s0[] f16252m;

    public final t0 f16253h;

    public final int f16254i;

    s0 EF10;

    s0 EF11;

    s0 EF12;

    static {
        s0 s0Var = new s0("DOUBLE", 0, t0.DOUBLE, 1);
        s0 s0Var2 = new s0("FLOAT", 1, t0.FLOAT, 5);
        t0 t0Var = t0.LONG;
        s0 s0Var3 = new s0("INT64", 2, t0Var, 0);
        s0 s0Var4 = new s0("UINT64", 3, t0Var, 0);
        t0 t0Var2 = t0.INT;
        s0 s0Var5 = new s0("INT32", 4, t0Var2, 0);
        s0 s0Var6 = new s0("FIXED64", 5, t0Var, 1);
        s0 s0Var7 = new s0("FIXED32", 6, t0Var2, 5);
        s0 s0Var8 = new s0("BOOL", 7, t0.BOOLEAN, 0);
        o0 o0Var = new o0("STRING", 8, t0.STRING, 2);
        j = o0Var;
        t0 t0Var3 = t0.MESSAGE;
        p0 p0Var = new p0("GROUP", 9, t0Var3, 3);
        f16250k = p0Var;
        q0 q0Var = new q0("MESSAGE", 10, t0Var3, 2);
        f16251l = q0Var;
        f16252m = new s0[]{s0Var, s0Var2, s0Var3, s0Var4, s0Var5, s0Var6, s0Var7, s0Var8, o0Var, p0Var, q0Var, new r0("BYTES", 11, t0.BYTE_STRING, 2), new s0("UINT32", 12, t0Var2, 0), new s0("ENUM", 13, t0.ENUM, 0), new s0("SFIXED32", 14, t0Var2, 5), new s0("SFIXED64", 15, t0Var, 1), new s0("SINT32", 16, t0Var2, 0), new s0("SINT64", 17, t0Var, 0)};
    }

    public s0(String str, int i3, t0 t0Var, int i9) {
        super(str, i3);
        this.f16253h = t0Var;
        this.f16254i = i9;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) f16252m.clone();
    }
}

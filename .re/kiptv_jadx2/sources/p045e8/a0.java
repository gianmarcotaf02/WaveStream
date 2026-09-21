package p045e8;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class a0 {

    public static final a0 f21530h;

    public static final a0 f21531i;
    public static final a0 j;

    public static final a0[] f21532k;

    static {
        a0 a0Var = new a0("NONE", 0);
        f21530h = a0Var;
        a0 a0Var2 = new a0("ZERO", 1);
        f21531i = a0Var2;
        a0 a0Var3 = new a0("SPACE", 2);
        j = a0Var3;
        a0[] a0VarArr = {a0Var, a0Var2, a0Var3};
        f21532k = a0VarArr;
        q0.t(a0VarArr);
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) f21532k.clone();
    }
}

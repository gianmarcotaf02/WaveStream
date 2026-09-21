package p163t;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class M {

    public static final M f27494h;

    public static final M[] f27495i;

    static {
        M m8 = new M("Default", 0);
        f27494h = m8;
        M[] mArr = {m8, new M("UserInput", 1), new M("PreventUserInput", 2)};
        f27495i = mArr;
        q0.t(mArr);
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f27495i.clone();
    }
}

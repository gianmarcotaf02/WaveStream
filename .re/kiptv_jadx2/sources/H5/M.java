package H5;

public final class M {

    public static final M f4111h;

    public static final M f4112i;
    public static final M j;

    public static final M f4113k;

    public static final M f4114l;

    public static final M f4115m;

    public static final M[] f4116n;

    static {
        M m8 = new M("ALL", 0);
        f4111h = m8;
        M m9 = new M("MOVIES", 1);
        f4112i = m9;
        M m10 = new M("SERIES", 2);
        j = m10;
        M m11 = new M("CHANNELS", 3);
        f4113k = m11;
        M m12 = new M("PEOPLE", 4);
        f4114l = m12;
        M m13 = new M("PROGRAMS", 5);
        f4115m = m13;
        M[] mArr = {m8, m9, m10, m11, m12, m13};
        f4116n = mArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(mArr);
    }

    public static M valueOf(String str) {
        return (M) Enum.valueOf(M.class, str);
    }

    public static M[] values() {
        return (M[]) f4116n.clone();
    }
}

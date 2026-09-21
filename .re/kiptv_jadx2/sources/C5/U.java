package C5;

public final class U {

    public static final U f1139h;

    public static final U f1140i;
    public static final U j;

    public static final U f1141k;

    public static final U f1142l;

    public static final U f1143m;

    public static final U[] f1144n;

    public static final p126o6.b f1145o;

    static {
        U u6 = new U("INFO", 0);
        f1139h = u6;
        U u7 = new U("UP_NEXT", 1);
        f1140i = u7;
        U u8 = new U("CAST", 2);
        j = u8;
        U u9 = new U("FAVORITES", 3);
        f1141k = u9;
        U u10 = new U("RECENT", 4);
        f1142l = u10;
        U u11 = new U("REPLAY", 5);
        f1143m = u11;
        U[] uArr = {u6, u7, u8, u9, u10, u11};
        f1144n = uArr;
        f1145o = com.google.crypto.tink.shaded.protobuf.q0.t(uArr);
    }

    public static p126o6.b a() {
        return f1145o;
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f1144n.clone();
    }
}

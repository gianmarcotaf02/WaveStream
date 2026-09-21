package x;

public final class S {

    public static final S f30797h;

    public static final S f30798i;
    public static final S j;

    public static final S[] f30799k;

    static {
        S s9 = new S("Yes", 0);
        f30797h = s9;
        S s10 = new S("No", 1);
        f30798i = s10;
        S s11 = new S("NotInitialized", 2);
        j = s11;
        S[] sArr = {s9, s10, s11};
        f30799k = sArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(sArr);
    }

    public static S valueOf(String str) {
        return (S) Enum.valueOf(S.class, str);
    }

    public static S[] values() {
        return (S[]) f30799k.clone();
    }
}

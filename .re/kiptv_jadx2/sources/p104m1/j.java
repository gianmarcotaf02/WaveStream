package p104m1;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class j {

    public static final j f25173h;

    public static final j f25174i;
    public static final j[] j;

    static {
        j jVar = new j("Ltr", 0);
        f25173h = jVar;
        j jVar2 = new j("Rtl", 1);
        f25174i = jVar2;
        j[] jVarArr = {jVar, jVar2};
        j = jVarArr;
        q0.t(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) j.clone();
    }
}

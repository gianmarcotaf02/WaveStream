package L0;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class c {

    public static final c f7044h;

    public static final c f7045i;
    public static final c[] j;

    static {
        c cVar = new c("Lsq2", 0);
        f7044h = cVar;
        c cVar2 = new c("Impulse", 1);
        f7045i = cVar2;
        c[] cVarArr = {cVar, cVar2};
        j = cVarArr;
        q0.t(cVarArr);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) j.clone();
    }
}

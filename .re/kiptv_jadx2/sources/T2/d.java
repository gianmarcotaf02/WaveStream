package T2;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class d {

    public static final d f9733h;

    public static final d f9734i;
    public static final d[] j;

    static {
        d dVar = new d("EXACT", 0);
        f9733h = dVar;
        d dVar2 = new d("INEXACT", 1);
        f9734i = dVar2;
        d[] dVarArr = {dVar, dVar2};
        j = dVarArr;
        q0.t(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) j.clone();
    }
}

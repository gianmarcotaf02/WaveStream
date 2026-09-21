package p113n1;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class n {

    public static final n f25566h;

    public static final n f25567i;
    public static final n[] j;

    static {
        n nVar = new n("Ltr", 0);
        f25566h = nVar;
        n nVar2 = new n("Rtl", 1);
        f25567i = nVar2;
        n[] nVarArr = {nVar, nVar2};
        j = nVarArr;
        q0.t(nVarArr);
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) j.clone();
    }
}

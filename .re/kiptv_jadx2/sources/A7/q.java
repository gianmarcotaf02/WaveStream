package A7;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class q {

    public static final q f344h;

    public static final q f345i;
    public static final q[] j;

    static {
        q qVar = new q("STABLE", 0);
        f344h = qVar;
        q qVar2 = new q("UNSTABLE", 1);
        f345i = qVar2;
        q[] qVarArr = {qVar, qVar2};
        j = qVarArr;
        q0.t(qVarArr);
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) j.clone();
    }
}

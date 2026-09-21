package p118n7;

import com.google.crypto.tink.shaded.protobuf.q0;

public abstract class s {

    public static final r f25935h;

    public static final q f25936i;
    public static final s[] j;

    static {
        r rVar = new r();
        f25935h = rVar;
        q qVar = new q();
        f25936i = qVar;
        s[] sVarArr = {rVar, qVar};
        j = sVarArr;
        q0.t(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) j.clone();
    }

    public abstract String a(String str);
}

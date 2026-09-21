package p163t;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class T {

    public static final T f27506h;

    public static final T f27507i;
    public static final T[] j;

    static {
        T t9 = new T("Restart", 0);
        f27506h = t9;
        T t10 = new T("Reverse", 1);
        f27507i = t10;
        T[] tArr = {t9, t10};
        j = tArr;
        q0.t(tArr);
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) j.clone();
    }
}

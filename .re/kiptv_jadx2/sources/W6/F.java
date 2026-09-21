package W6;

import com.google.crypto.tink.shaded.protobuf.q0;

public class F {

    public static final F f10620i;
    public static final F j;

    public static final F f10621k;

    public static final E f10622l;

    public static final F[] f10623m;

    public final Object f10624h;

    static {
        F f9 = new F("NULL", 0, null);
        f10620i = f9;
        F f10 = new F("INDEX", 1, -1);
        j = f10;
        F f11 = new F("FALSE", 2, Boolean.FALSE);
        f10621k = f11;
        E e6 = new E("MAP_GET_OR_DEFAULT", 3, null);
        f10622l = e6;
        F[] fArr = {f9, f10, f11, e6};
        f10623m = fArr;
        q0.t(fArr);
    }

    public F(String str, int i3, Object obj) {
        super(str, i3);
        this.f10624h = obj;
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f10623m.clone();
    }
}

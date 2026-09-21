package p043e5;

import com.google.crypto.tink.shaded.protobuf.q0;
import p126o6.b;

public final class h {

    public static final h f21437h;

    public static final h[] f21438i;
    public static final b j;

    h EF0;

    static {
        h hVar = new h("IOS", 0);
        h hVar2 = new h("TVOS", 1);
        h hVar3 = new h("ANDROID", 2);
        f21437h = hVar3;
        h[] hVarArr = {hVar, hVar2, hVar3};
        f21438i = hVarArr;
        j = q0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f21438i.clone();
    }
}

package H2;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class h {

    public static final h f3886h;

    public static final h f3887i;
    public static final h j;

    public static final h f3888k;

    public static final h[] f3889l;

    static {
        h hVar = new h("MEMORY_CACHE", 0);
        f3886h = hVar;
        h hVar2 = new h("MEMORY", 1);
        f3887i = hVar2;
        h hVar3 = new h("DISK", 2);
        j = hVar3;
        h hVar4 = new h("NETWORK", 3);
        f3888k = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        f3889l = hVarArr;
        q0.t(hVarArr);
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f3889l.clone();
    }
}

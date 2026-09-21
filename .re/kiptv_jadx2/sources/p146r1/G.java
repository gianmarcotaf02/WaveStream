package p146r1;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class G {

    public static final G f26720h;

    public static final G f26721i;
    public static final G[] j;

    static {
        G g = new G("Inherit", 0);
        f26720h = g;
        G g9 = new G("SecureOn", 1);
        f26721i = g9;
        G[] gArr = {g, g9, new G("SecureOff", 2)};
        j = gArr;
        q0.t(gArr);
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) j.clone();
    }
}

package S4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0868g {

    public static final EnumC0868g f9389h;

    public static final EnumC0868g f9390i;
    public static final EnumC0868g j;

    public static final EnumC0868g f9391k;

    public static final EnumC0868g[] f9392l;

    static {
        EnumC0868g enumC0868g = new EnumC0868g("DEFAULT", 0);
        f9389h = enumC0868g;
        EnumC0868g enumC0868g2 = new EnumC0868g("MOST_RECENT", 1);
        f9390i = enumC0868g2;
        EnumC0868g enumC0868g3 = new EnumC0868g("ALPHABETICAL_ASC", 2);
        j = enumC0868g3;
        EnumC0868g enumC0868g4 = new EnumC0868g("ALPHABETICAL_DESC", 3);
        f9391k = enumC0868g4;
        EnumC0868g[] enumC0868gArr = {enumC0868g, enumC0868g2, enumC0868g3, enumC0868g4};
        f9392l = enumC0868gArr;
        q0.t(enumC0868gArr);
    }

    public static EnumC0868g valueOf(String str) {
        return (EnumC0868g) Enum.valueOf(EnumC0868g.class, str);
    }

    public static EnumC0868g[] values() {
        return (EnumC0868g[]) f9392l.clone();
    }
}

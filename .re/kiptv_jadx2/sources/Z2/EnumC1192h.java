package Z2;

import java.util.HashMap;

public final class EnumC1192h {

    public static final EnumC1192h f12883h;

    public static final EnumC1192h f12884i;
    public static final EnumC1192h j;

    public static final EnumC1192h f12885k;

    public static final HashMap f12886l;

    public static final EnumC1192h[] f12887m;

    EnumC1192h EF1;

    static {
        EnumC1192h enumC1192h = new EnumC1192h("target", 0);
        EnumC1192h enumC1192h2 = new EnumC1192h("root", 1);
        EnumC1192h enumC1192h3 = new EnumC1192h("nth_child", 2);
        f12883h = enumC1192h3;
        EnumC1192h enumC1192h4 = new EnumC1192h("nth_last_child", 3);
        EnumC1192h enumC1192h5 = new EnumC1192h("nth_of_type", 4);
        f12884i = enumC1192h5;
        EnumC1192h enumC1192h6 = new EnumC1192h("nth_last_of_type", 5);
        j = enumC1192h6;
        EnumC1192h enumC1192h7 = new EnumC1192h("first_child", 6);
        EnumC1192h enumC1192h8 = new EnumC1192h("last_child", 7);
        EnumC1192h enumC1192h9 = new EnumC1192h("first_of_type", 8);
        EnumC1192h enumC1192h10 = new EnumC1192h("last_of_type", 9);
        EnumC1192h enumC1192h11 = new EnumC1192h("only_child", 10);
        EnumC1192h enumC1192h12 = new EnumC1192h("only_of_type", 11);
        EnumC1192h enumC1192h13 = new EnumC1192h("empty", 12);
        EnumC1192h enumC1192h14 = new EnumC1192h("not", 13);
        EnumC1192h enumC1192h15 = new EnumC1192h("lang", 14);
        EnumC1192h enumC1192h16 = new EnumC1192h("link", 15);
        EnumC1192h enumC1192h17 = new EnumC1192h("visited", 16);
        EnumC1192h enumC1192h18 = new EnumC1192h("hover", 17);
        EnumC1192h enumC1192h19 = new EnumC1192h("active", 18);
        EnumC1192h enumC1192h20 = new EnumC1192h("focus", 19);
        EnumC1192h enumC1192h21 = new EnumC1192h("enabled", 20);
        EnumC1192h enumC1192h22 = new EnumC1192h("disabled", 21);
        EnumC1192h enumC1192h23 = new EnumC1192h("checked", 22);
        EnumC1192h enumC1192h24 = new EnumC1192h("indeterminate", 23);
        EnumC1192h enumC1192h25 = new EnumC1192h("UNSUPPORTED", 24);
        f12885k = enumC1192h25;
        f12887m = new EnumC1192h[]{enumC1192h, enumC1192h2, enumC1192h3, enumC1192h4, enumC1192h5, enumC1192h6, enumC1192h7, enumC1192h8, enumC1192h9, enumC1192h10, enumC1192h11, enumC1192h12, enumC1192h13, enumC1192h14, enumC1192h15, enumC1192h16, enumC1192h17, enumC1192h18, enumC1192h19, enumC1192h20, enumC1192h21, enumC1192h22, enumC1192h23, enumC1192h24, enumC1192h25};
        f12886l = new HashMap();
        for (EnumC1192h enumC1192h26 : values()) {
            if (enumC1192h26 != f12885k) {
                f12886l.put(enumC1192h26.name().replace('_', '-'), enumC1192h26);
            }
        }
    }

    public static EnumC1192h valueOf(String str) {
        return (EnumC1192h) Enum.valueOf(EnumC1192h.class, str);
    }

    public static EnumC1192h[] values() {
        return (EnumC1192h[]) f12887m.clone();
    }
}

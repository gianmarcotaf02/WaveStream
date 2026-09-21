package Z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1192h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z2.EnumC1192h f12883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z2.EnumC1192h f12884i;
    public static final Z2.EnumC1192h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z2.EnumC1192h f12885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f12886l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Z2.EnumC1192h[] f12887m;

    /* JADX INFO: Fake field, exist only in values array */
    Z2.EnumC1192h EF1;

    static {
        Z2.EnumC1192h enumC1192h = new Z2.EnumC1192h("target", 0);
        Z2.EnumC1192h enumC1192h2 = new Z2.EnumC1192h("root", 1);
        Z2.EnumC1192h enumC1192h3 = new Z2.EnumC1192h("nth_child", 2);
        f12883h = enumC1192h3;
        Z2.EnumC1192h enumC1192h4 = new Z2.EnumC1192h("nth_last_child", 3);
        Z2.EnumC1192h enumC1192h5 = new Z2.EnumC1192h("nth_of_type", 4);
        f12884i = enumC1192h5;
        Z2.EnumC1192h enumC1192h6 = new Z2.EnumC1192h("nth_last_of_type", 5);
        j = enumC1192h6;
        Z2.EnumC1192h enumC1192h7 = new Z2.EnumC1192h("first_child", 6);
        Z2.EnumC1192h enumC1192h8 = new Z2.EnumC1192h("last_child", 7);
        Z2.EnumC1192h enumC1192h9 = new Z2.EnumC1192h("first_of_type", 8);
        Z2.EnumC1192h enumC1192h10 = new Z2.EnumC1192h("last_of_type", 9);
        Z2.EnumC1192h enumC1192h11 = new Z2.EnumC1192h("only_child", 10);
        Z2.EnumC1192h enumC1192h12 = new Z2.EnumC1192h("only_of_type", 11);
        Z2.EnumC1192h enumC1192h13 = new Z2.EnumC1192h("empty", 12);
        Z2.EnumC1192h enumC1192h14 = new Z2.EnumC1192h("not", 13);
        Z2.EnumC1192h enumC1192h15 = new Z2.EnumC1192h("lang", 14);
        Z2.EnumC1192h enumC1192h16 = new Z2.EnumC1192h("link", 15);
        Z2.EnumC1192h enumC1192h17 = new Z2.EnumC1192h("visited", 16);
        Z2.EnumC1192h enumC1192h18 = new Z2.EnumC1192h("hover", 17);
        Z2.EnumC1192h enumC1192h19 = new Z2.EnumC1192h("active", 18);
        Z2.EnumC1192h enumC1192h20 = new Z2.EnumC1192h("focus", 19);
        Z2.EnumC1192h enumC1192h21 = new Z2.EnumC1192h("enabled", 20);
        Z2.EnumC1192h enumC1192h22 = new Z2.EnumC1192h("disabled", 21);
        Z2.EnumC1192h enumC1192h23 = new Z2.EnumC1192h("checked", 22);
        Z2.EnumC1192h enumC1192h24 = new Z2.EnumC1192h("indeterminate", 23);
        Z2.EnumC1192h enumC1192h25 = new Z2.EnumC1192h("UNSUPPORTED", 24);
        f12885k = enumC1192h25;
        f12887m = new Z2.EnumC1192h[]{enumC1192h, enumC1192h2, enumC1192h3, enumC1192h4, enumC1192h5, enumC1192h6, enumC1192h7, enumC1192h8, enumC1192h9, enumC1192h10, enumC1192h11, enumC1192h12, enumC1192h13, enumC1192h14, enumC1192h15, enumC1192h16, enumC1192h17, enumC1192h18, enumC1192h19, enumC1192h20, enumC1192h21, enumC1192h22, enumC1192h23, enumC1192h24, enumC1192h25};
        f12886l = new java.util.HashMap();
        for (Z2.EnumC1192h enumC1192h26 : values()) {
            if (enumC1192h26 != f12885k) {
                f12886l.put(enumC1192h26.name().replace('_', '-'), enumC1192h26);
            }
        }
    }

    public static Z2.EnumC1192h valueOf(java.lang.String str) {
        return (Z2.EnumC1192h) java.lang.Enum.valueOf(Z2.EnumC1192h.class, str);
    }

    public static Z2.EnumC1192h[] values() {
        return (Z2.EnumC1192h[]) f12887m.clone();
    }
}

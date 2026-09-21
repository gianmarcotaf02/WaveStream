package androidx.recyclerview.widget;

public final class EnumC1643z {

    public static final EnumC1643z f17523h;

    public static final EnumC1643z[] f17524i;

    static {
        EnumC1643z enumC1643z = new EnumC1643z("ALLOW", 0);
        f17523h = enumC1643z;
        f17524i = new EnumC1643z[]{enumC1643z, new EnumC1643z("PREVENT_WHEN_EMPTY", 1), new EnumC1643z("PREVENT", 2)};
    }

    public static EnumC1643z valueOf(String str) {
        return (EnumC1643z) Enum.valueOf(EnumC1643z.class, str);
    }

    public static EnumC1643z[] values() {
        return (EnumC1643z[]) f17524i.clone();
    }
}

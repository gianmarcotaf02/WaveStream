package S4;

import com.google.crypto.tink.shaded.protobuf.q0;

public final class EnumC0866e {
    MOBILE("SD"),
    SD("SD"),
    HD720P("HD"),
    HD("HD"),
    FHD("FHD"),
    QHD("2K"),
    UHD("4K"),
    UHD8K("8K");


    public final String f9386h;

    static {
        q0.t(enumC0866eArr);
    }

    public EnumC0866e(String str) {
        super(str, i);
        this.f9386h = str;
    }

    public static EnumC0866e valueOf(String str) {
        return (EnumC0866e) Enum.valueOf(EnumC0866e.class, str);
    }

    public static EnumC0866e[] values() {
        return (EnumC0866e[]) f9385q.clone();
    }
}

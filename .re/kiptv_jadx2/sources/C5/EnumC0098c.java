package C5;

public final class EnumC0098c {

    public static final EnumC0098c f1223h;

    public static final EnumC0098c f1224i;
    public static final EnumC0098c j;

    public static final EnumC0098c f1225k;

    public static final EnumC0098c[] f1226l;

    static {
        EnumC0098c enumC0098c = new EnumC0098c("MAIN", 0);
        f1223h = enumC0098c;
        EnumC0098c enumC0098c2 = new EnumC0098c("ENGINE", 1);
        f1224i = enumC0098c2;
        EnumC0098c enumC0098c3 = new EnumC0098c("AUDIO", 2);
        j = enumC0098c3;
        EnumC0098c enumC0098c4 = new EnumC0098c("SUBTITLES", 3);
        f1225k = enumC0098c4;
        EnumC0098c[] enumC0098cArr = {enumC0098c, enumC0098c2, enumC0098c3, enumC0098c4};
        f1226l = enumC0098cArr;
        com.google.crypto.tink.shaded.protobuf.q0.t(enumC0098cArr);
    }

    public static EnumC0098c valueOf(String str) {
        return (EnumC0098c) Enum.valueOf(EnumC0098c.class, str);
    }

    public static EnumC0098c[] values() {
        return (EnumC0098c[]) f1226l.clone();
    }
}

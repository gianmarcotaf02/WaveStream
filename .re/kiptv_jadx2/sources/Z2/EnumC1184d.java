package Z2;

import androidx.media3.extractor.text.ttml.TtmlNode;

public final class EnumC1184d {

    public static final EnumC1184d f12867h;

    public static final EnumC1184d f12868i;
    public static final EnumC1184d[] j;

    static {
        EnumC1184d enumC1184d = new EnumC1184d(TtmlNode.COMBINE_ALL, 0);
        f12867h = enumC1184d;
        EnumC1184d enumC1184d2 = new EnumC1184d("aural", 1);
        EnumC1184d enumC1184d3 = new EnumC1184d("braille", 2);
        EnumC1184d enumC1184d4 = new EnumC1184d("embossed", 3);
        EnumC1184d enumC1184d5 = new EnumC1184d("handheld", 4);
        EnumC1184d enumC1184d6 = new EnumC1184d("print", 5);
        EnumC1184d enumC1184d7 = new EnumC1184d("projection", 6);
        EnumC1184d enumC1184d8 = new EnumC1184d("screen", 7);
        f12868i = enumC1184d8;
        j = new EnumC1184d[]{enumC1184d, enumC1184d2, enumC1184d3, enumC1184d4, enumC1184d5, enumC1184d6, enumC1184d7, enumC1184d8, new EnumC1184d("speech", 8), new EnumC1184d("tty", 9), new EnumC1184d("tv", 10)};
    }

    public static EnumC1184d valueOf(String str) {
        return (EnumC1184d) Enum.valueOf(EnumC1184d.class, str);
    }

    public static EnumC1184d[] values() {
        return (EnumC1184d[]) j.clone();
    }
}

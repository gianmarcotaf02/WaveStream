package Z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: Z2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC1184d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z2.EnumC1184d f12867h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z2.EnumC1184d f12868i;
    public static final /* synthetic */ Z2.EnumC1184d[] j;

    static {
        Z2.EnumC1184d enumC1184d = new Z2.EnumC1184d(androidx.media3.extractor.text.ttml.TtmlNode.COMBINE_ALL, 0);
        f12867h = enumC1184d;
        Z2.EnumC1184d enumC1184d2 = new Z2.EnumC1184d("aural", 1);
        Z2.EnumC1184d enumC1184d3 = new Z2.EnumC1184d("braille", 2);
        Z2.EnumC1184d enumC1184d4 = new Z2.EnumC1184d("embossed", 3);
        Z2.EnumC1184d enumC1184d5 = new Z2.EnumC1184d("handheld", 4);
        Z2.EnumC1184d enumC1184d6 = new Z2.EnumC1184d("print", 5);
        Z2.EnumC1184d enumC1184d7 = new Z2.EnumC1184d("projection", 6);
        Z2.EnumC1184d enumC1184d8 = new Z2.EnumC1184d("screen", 7);
        f12868i = enumC1184d8;
        j = new Z2.EnumC1184d[]{enumC1184d, enumC1184d2, enumC1184d3, enumC1184d4, enumC1184d5, enumC1184d6, enumC1184d7, enumC1184d8, new Z2.EnumC1184d("speech", 8), new Z2.EnumC1184d("tty", 9), new Z2.EnumC1184d("tv", 10)};
    }

    public static Z2.EnumC1184d valueOf(java.lang.String str) {
        return (Z2.EnumC1184d) java.lang.Enum.valueOf(Z2.EnumC1184d.class, str);
    }

    public static Z2.EnumC1184d[] values() {
        return (Z2.EnumC1184d[]) j.clone();
    }
}

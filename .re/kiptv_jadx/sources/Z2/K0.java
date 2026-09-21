package Z2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Z2.K0 f12775h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z2.K0 f12776i;
    public static final Z2.K0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Z2.K0 f12777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.HashMap f12778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ Z2.K0[] f12779m;

    /* JADX INFO: Fake field, exist only in values array */
    Z2.K0 EF1;

    static {
        Z2.K0 k1 = new Z2.K0("svg", 0);
        Z2.K0 k9 = new Z2.K0(androidx.media3.exoplayer.upstream.CmcdData.OBJECT_TYPE_AUDIO_ONLY, 1);
        Z2.K0 k10 = new Z2.K0(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, 2);
        Z2.K0 k11 = new Z2.K0("clipPath", 3);
        Z2.K0 k12 = new Z2.K0("defs", 4);
        Z2.K0 k13 = new Z2.K0("desc", 5);
        f12775h = k13;
        Z2.K0 k14 = new Z2.K0("ellipse", 6);
        Z2.K0 k15 = new Z2.K0("g", 7);
        Z2.K0 k16 = new Z2.K0("image", 8);
        Z2.K0 k17 = new Z2.K0("line", 9);
        Z2.K0 k18 = new Z2.K0("linearGradient", 10);
        Z2.K0 k19 = new Z2.K0("marker", 11);
        Z2.K0 k20 = new Z2.K0("mask", 12);
        Z2.K0 k21 = new Z2.K0("path", 13);
        Z2.K0 k22 = new Z2.K0("pattern", 14);
        Z2.K0 k23 = new Z2.K0("polygon", 15);
        Z2.K0 k24 = new Z2.K0("polyline", 16);
        Z2.K0 k25 = new Z2.K0("radialGradient", 17);
        Z2.K0 k26 = new Z2.K0("rect", 18);
        Z2.K0 k27 = new Z2.K0("solidColor", 19);
        Z2.K0 k28 = new Z2.K0("stop", 20);
        Z2.K0 k29 = new Z2.K0("style", 21);
        Z2.K0 k30 = new Z2.K0("SWITCH", 22);
        f12776i = k30;
        Z2.K0 k31 = new Z2.K0(io.sentry.protocol.SentryStackFrame.JsonKeys.SYMBOL, 23);
        Z2.K0 k32 = new Z2.K0("text", 24);
        Z2.K0 k33 = new Z2.K0("textPath", 25);
        Z2.K0 k34 = new Z2.K0(io.ktor.http.LinkHeader.Parameters.Title, 26);
        j = k34;
        Z2.K0 k35 = new Z2.K0("tref", 27);
        Z2.K0 k36 = new Z2.K0("tspan", 28);
        Z2.K0 k37 = new Z2.K0("use", 29);
        Z2.K0 k38 = new Z2.K0("view", 30);
        Z2.K0 k39 = new Z2.K0("UNSUPPORTED", 31);
        f12777k = k39;
        f12779m = new Z2.K0[]{k1, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39};
        f12778l = new java.util.HashMap();
        for (Z2.K0 k40 : values()) {
            if (k40 == f12776i) {
                f12778l.put("switch", k40);
            } else if (k40 != f12777k) {
                f12778l.put(k40.name(), k40);
            }
        }
    }

    public static Z2.K0 valueOf(java.lang.String str) {
        return (Z2.K0) java.lang.Enum.valueOf(Z2.K0.class, str);
    }

    public static Z2.K0[] values() {
        return (Z2.K0[]) f12779m.clone();
    }
}

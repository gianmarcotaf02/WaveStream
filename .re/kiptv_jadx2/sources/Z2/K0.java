package Z2;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.ktor.http.LinkHeader;
import io.sentry.protocol.SentryStackFrame;
import java.util.HashMap;

public final class K0 {

    public static final K0 f12775h;

    public static final K0 f12776i;
    public static final K0 j;

    public static final K0 f12777k;

    public static final HashMap f12778l;

    public static final K0[] f12779m;

    K0 EF1;

    static {
        K0 k1 = new K0("svg", 0);
        K0 k9 = new K0(CmcdData.OBJECT_TYPE_AUDIO_ONLY, 1);
        K0 k10 = new K0(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, 2);
        K0 k11 = new K0("clipPath", 3);
        K0 k12 = new K0("defs", 4);
        K0 k13 = new K0("desc", 5);
        f12775h = k13;
        K0 k14 = new K0("ellipse", 6);
        K0 k15 = new K0("g", 7);
        K0 k16 = new K0("image", 8);
        K0 k17 = new K0("line", 9);
        K0 k18 = new K0("linearGradient", 10);
        K0 k19 = new K0("marker", 11);
        K0 k20 = new K0("mask", 12);
        K0 k21 = new K0("path", 13);
        K0 k22 = new K0("pattern", 14);
        K0 k23 = new K0("polygon", 15);
        K0 k24 = new K0("polyline", 16);
        K0 k25 = new K0("radialGradient", 17);
        K0 k26 = new K0("rect", 18);
        K0 k27 = new K0("solidColor", 19);
        K0 k28 = new K0("stop", 20);
        K0 k29 = new K0("style", 21);
        K0 k30 = new K0("SWITCH", 22);
        f12776i = k30;
        K0 k31 = new K0(SentryStackFrame.JsonKeys.SYMBOL, 23);
        K0 k32 = new K0("text", 24);
        K0 k33 = new K0("textPath", 25);
        K0 k34 = new K0(LinkHeader.Parameters.Title, 26);
        j = k34;
        K0 k35 = new K0("tref", 27);
        K0 k36 = new K0("tspan", 28);
        K0 k37 = new K0("use", 29);
        K0 k38 = new K0("view", 30);
        K0 k39 = new K0("UNSUPPORTED", 31);
        f12777k = k39;
        f12779m = new K0[]{k1, k9, k10, k11, k12, k13, k14, k15, k16, k17, k18, k19, k20, k21, k22, k23, k24, k25, k26, k27, k28, k29, k30, k31, k32, k33, k34, k35, k36, k37, k38, k39};
        f12778l = new HashMap();
        for (K0 k40 : values()) {
            if (k40 == f12776i) {
                f12778l.put("switch", k40);
            } else if (k40 != f12777k) {
                f12778l.put(k40.name(), k40);
            }
        }
    }

    public static K0 valueOf(String str) {
        return (K0) Enum.valueOf(K0.class, str);
    }

    public static K0[] values() {
        return (K0[]) f12779m.clone();
    }
}

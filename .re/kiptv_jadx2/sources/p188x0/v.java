package p188x0;

import android.graphics.ColorSpace;
import android.os.Build;
import java.util.function.DoubleUnaryOperator;
import kotlin.jvm.internal.m;
import p196y0.c;
import p196y0.d;
import p196y0.p;
import p196y0.q;
import p196y0.r;

public abstract class v {
    public static final ColorSpace a(c cVar) {
        ColorSpace colorSpace;
        if (m.a(cVar, d.f31736e)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (m.a(cVar, d.f31746q)) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (m.a(cVar, d.f31747r)) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (m.a(cVar, d.f31744o)) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (m.a(cVar, d.j)) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (m.a(cVar, d.f31739i)) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (m.a(cVar, d.f31749t)) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (m.a(cVar, d.f31748s)) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (m.a(cVar, d.f31740k)) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (m.a(cVar, d.f31741l)) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (m.a(cVar, d.g)) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (m.a(cVar, d.f31738h)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (m.a(cVar, d.f31737f)) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (m.a(cVar, d.f31742m)) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (m.a(cVar, d.f31745p)) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (m.a(cVar, d.f31743n)) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (Build.VERSION.SDK_INT >= 34) {
            if (m.a(cVar, d.f31751v)) {
                colorSpace = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
            } else {
                colorSpace = m.a(cVar, d.f31752w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof q)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        q qVar = (q) cVar;
        float[] fArrA = qVar.f31779d.a();
        r rVar = qVar.g;
        ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new ColorSpace.Rgb.TransferParameters(rVar.f31792b, rVar.f31793c, rVar.f31794d, rVar.f31795e, rVar.f31796f, rVar.g, rVar.f31791a) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(cVar.f31729a, qVar.f31782h, fArrA, transferParameters);
        }
        String str = cVar.f31729a;
        final p pVar = qVar.f31785l;
        final int i3 = 0;
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() {
            @Override
            public final double applyAsDouble(double d4) {
                switch (i3) {
                    case 0:
                        return ((Number) ((p) pVar).invoke(Double.valueOf(d4))).doubleValue();
                    default:
                        return ((Number) ((p) pVar).invoke(Double.valueOf(d4))).doubleValue();
                }
            }
        };
        final p pVar2 = qVar.f31788o;
        final int i9 = 1;
        return new ColorSpace.Rgb(str, qVar.f31782h, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() {
            @Override
            public final double applyAsDouble(double d4) {
                switch (i9) {
                    case 0:
                        return ((Number) ((p) pVar2).invoke(Double.valueOf(d4))).doubleValue();
                    default:
                        return ((Number) ((p) pVar2).invoke(Double.valueOf(d4))).doubleValue();
                }
            }
        }, qVar.f31780e, qVar.f31781f);
    }
}

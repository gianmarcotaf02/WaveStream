package p188x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final android.graphics.ColorSpace a(p196y0.c cVar) {
        android.graphics.ColorSpace colorSpace;
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31736e)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31746q)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31747r)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31744o)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.j)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31739i)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31749t)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31748s)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31740k)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31741l)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.g)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31738h)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31737f)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31742m)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31745p)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31743n)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SMPTE_C);
        }
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            if (kotlin.jvm.internal.m.a(cVar, p196y0.d.f31751v)) {
                colorSpace = android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020_HLG);
            } else {
                colorSpace = kotlin.jvm.internal.m.a(cVar, p196y0.d.f31752w) ? android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.BT2020_PQ) : null;
            }
            if (colorSpace != null) {
                return colorSpace;
            }
        }
        if (!(cVar instanceof p196y0.q)) {
            return android.graphics.ColorSpace.get(android.graphics.ColorSpace.Named.SRGB);
        }
        p196y0.q qVar = (p196y0.q) cVar;
        float[] fArrA = qVar.f31779d.a();
        p196y0.r rVar = qVar.g;
        android.graphics.ColorSpace.Rgb.TransferParameters transferParameters = rVar != null ? new android.graphics.ColorSpace.Rgb.TransferParameters(rVar.f31792b, rVar.f31793c, rVar.f31794d, rVar.f31795e, rVar.f31796f, rVar.g, rVar.f31791a) : null;
        if (transferParameters != null) {
            return new android.graphics.ColorSpace.Rgb(cVar.f31729a, qVar.f31782h, fArrA, transferParameters);
        }
        java.lang.String str = cVar.f31729a;
        final p196y0.p pVar = qVar.f31785l;
        final int i3 = 0;
        java.util.function.DoubleUnaryOperator doubleUnaryOperator = new java.util.function.DoubleUnaryOperator() { // from class: x0.u
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i3) {
                    case 0:
                        return ((java.lang.Number) ((p196y0.p) pVar).invoke(java.lang.Double.valueOf(d4))).doubleValue();
                    default:
                        return ((java.lang.Number) ((p196y0.p) pVar).invoke(java.lang.Double.valueOf(d4))).doubleValue();
                }
            }
        };
        final p196y0.p pVar2 = qVar.f31788o;
        final int i9 = 1;
        return new android.graphics.ColorSpace.Rgb(str, qVar.f31782h, fArrA, doubleUnaryOperator, new java.util.function.DoubleUnaryOperator() { // from class: x0.u
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d4) {
                switch (i9) {
                    case 0:
                        return ((java.lang.Number) ((p196y0.p) pVar2).invoke(java.lang.Double.valueOf(d4))).doubleValue();
                    default:
                        return ((java.lang.Number) ((p196y0.p) pVar2).invoke(java.lang.Double.valueOf(d4))).doubleValue();
                }
            }
        }, qVar.f31780e, qVar.f31781f);
    }
}

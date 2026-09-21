package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0014\u0010\u0015\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f¨\u0006\u0016"}, d2 = {"", "stringRepresentation", "", "parseRGBAColor", "(Ljava/lang/String;)I", io.sentry.protocol.ViewHierarchyNode.JsonKeys.ALPHA, "red", "green", "blue", "colorInt", "(IIII)I", "LO7/o;", "rgbaColorRegex", "LO7/o;", "HEX_RADIX", "I", "DEFAULT_ALPHA_HEX", "Ljava/lang/String;", "ALPHA_SHIFT_BITS", "RED_SHIFT_BITS", "GREEN_SHIFT_BITS", "ALPHA_MATCH_GROUP_INDEX", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ColorUtilsKt {
    private static final int ALPHA_MATCH_GROUP_INDEX = 4;
    private static final int ALPHA_SHIFT_BITS = 24;
    private static final java.lang.String DEFAULT_ALPHA_HEX = "FF";
    private static final int GREEN_SHIFT_BITS = 8;
    private static final int HEX_RADIX = 16;
    private static final int RED_SHIFT_BITS = 16;
    private static final O7.o rgbaColorRegex = new O7.o("^#([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})([A-Fa-f0-9]{2})?$");

    public static final int colorInt(int i3, int i9, int i10, int i11) {
        return (i3 << 24) | (i9 << 16) | (i10 << 8) | i11;
    }

    public static final int parseRGBAColor(java.lang.String stringRepresentation) {
        kotlin.jvm.internal.m.e(stringRepresentation, "stringRepresentation");
        O7.m mVarC = rgbaColorRegex.c(stringRepresentation);
        if (mVarC == null) {
            return android.graphics.Color.parseColor(stringRepresentation);
        }
        java.lang.String str = (java.lang.String) ((O7.k) mVarC.a()).get(1);
        java.lang.String str2 = (java.lang.String) ((O7.k) mVarC.a()).get(2);
        java.lang.String str3 = (java.lang.String) ((O7.k) mVarC.a()).get(3);
        java.lang.Object objK1 = p078i6.o.k1(4, mVarC.a());
        java.lang.String str4 = (java.lang.String) objK1;
        if (str4 == null || O7.q.N0(str4)) {
            objK1 = null;
        }
        java.lang.String str5 = (java.lang.String) objK1;
        if (str5 == null) {
            str5 = DEFAULT_ALPHA_HEX;
        }
        R8.i.i(16);
        int i3 = java.lang.Integer.parseInt(str5, 16);
        R8.i.i(16);
        int i9 = java.lang.Integer.parseInt(str, 16);
        R8.i.i(16);
        int i10 = java.lang.Integer.parseInt(str2, 16);
        R8.i.i(16);
        return colorInt(i3, i9, i10, java.lang.Integer.parseInt(str3, 16));
    }
}

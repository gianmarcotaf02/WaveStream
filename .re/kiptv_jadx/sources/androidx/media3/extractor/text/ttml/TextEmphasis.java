package androidx.media3.extractor.text.ttml;

/* JADX INFO: loaded from: classes.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final java.util.regex.Pattern WHITESPACE_PATTERN = java.util.regex.Pattern.compile("\\s+");
    private static final p076i4.AbstractC2214p0 SINGLE_STYLE_VALUES = p076i4.AbstractC2214p0.s(new java.lang.Object[]{androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO, "none"}, 2);
    private static final p076i4.AbstractC2214p0 MARK_SHAPE_VALUES = p076i4.AbstractC2214p0.s(new java.lang.Object[]{androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE}, 3);
    private static final p076i4.AbstractC2214p0 MARK_FILL_VALUES = p076i4.AbstractC2214p0.s(new java.lang.Object[]{androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED, androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN}, 2);
    private static final p076i4.AbstractC2214p0 POSITION_VALUES = p076i4.AbstractC2214p0.s(new java.lang.Object[]{androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE, androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE}, 3);

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i3, int i9, int i10) {
        this.markShape = i3;
        this.markFill = i9;
        this.position = i10;
    }

    public static androidx.media3.extractor.text.ttml.TextEmphasis parse(java.lang.String str) {
        p076i4.AbstractC2214p0 f1Var;
        if (str == null) {
            return null;
        }
        java.lang.String strI0 = com.google.crypto.tink.shaded.protobuf.AbstractC1909d.i0(str.trim());
        if (strI0.isEmpty()) {
            return null;
        }
        java.lang.String[] strArrSplit = android.text.TextUtils.split(strI0, WHITESPACE_PATTERN);
        int length = strArrSplit.length;
        if (length == 0) {
            f1Var = p076i4.Z0.f22857q;
        } else if (length != 1) {
            f1Var = p076i4.AbstractC2214p0.s((java.lang.Object[]) strArrSplit.clone(), strArrSplit.length);
        } else {
            f1Var = new p076i4.f1(strArrSplit[0]);
        }
        return parseWords(f1Var);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x0101  */
    /* JADX WARN: Code duplicated, block: B:69:0x0103  */
    /* JADX WARN: Code duplicated, block: B:71:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0108  */
    /* JADX WARN: Code duplicated, block: B:73:0x010a  */
    private static androidx.media3.extractor.text.ttml.TextEmphasis parseWords(p076i4.AbstractC2214p0 abstractC2214p0) {
        byte b9;
        int i3;
        int i9;
        java.lang.String str;
        int iHashCode;
        java.lang.String str2 = (java.lang.String) p076i4.AbstractC2230y.k(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE, p076i4.AbstractC2230y.o(POSITION_VALUES, abstractC2214p0));
        int iHashCode2 = str2.hashCode();
        int i10 = 2;
        byte b10 = 0;
        int i11 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b9 = 0;
                } else {
                    b9 = -1;
                }
            } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b9 = 1;
            } else {
                b9 = -1;
            }
        } else if (str2.equals(androidx.media3.extractor.text.ttml.TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b9 = 2;
        } else {
            b9 = -1;
        }
        if (b9 != 0) {
            i3 = b9 != 1 ? 1 : -2;
        } else {
            i3 = 2;
        }
        p076i4.b1 b1VarO = p076i4.AbstractC2230y.o(SINGLE_STYLE_VALUES, abstractC2214p0);
        if (!b1VarO.isEmpty()) {
            java.lang.String str3 = (java.lang.String) new p076i4.C2217r0(b1VarO).next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i11 = 0;
            }
            return new androidx.media3.extractor.text.ttml.TextEmphasis(i11, 0, i3);
        }
        p076i4.b1 b1VarO2 = p076i4.AbstractC2230y.o(MARK_FILL_VALUES, abstractC2214p0);
        p076i4.b1 b1VarO3 = p076i4.AbstractC2230y.o(MARK_SHAPE_VALUES, abstractC2214p0);
        if (b1VarO2.isEmpty() && b1VarO3.isEmpty()) {
            return new androidx.media3.extractor.text.ttml.TextEmphasis(-1, 0, i3);
        }
        java.lang.String str4 = (java.lang.String) p076i4.AbstractC2230y.k(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED, b1VarO2);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                i9 = 2;
            }
            str = (java.lang.String) p076i4.AbstractC2230y.k(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, b1VarO3);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b10 = -1;
                    }
                } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 != 0) {
                if (b10 != 1) {
                    i10 = 1;
                } else {
                    i10 = 3;
                }
            }
            return new androidx.media3.extractor.text.ttml.TextEmphasis(i10, i9, i3);
        }
        str4.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i9 = 1;
        str = (java.lang.String) p076i4.AbstractC2230y.k(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, b1VarO3);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b10 = -1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
            b10 = 2;
        } else {
            b10 = -1;
        }
        if (b10 != 0) {
            if (b10 != 1) {
                i10 = 1;
            } else {
                i10 = 3;
            }
        }
        return new androidx.media3.extractor.text.ttml.TextEmphasis(i10, i9, i3);
    }
}

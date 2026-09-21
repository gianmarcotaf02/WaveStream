package androidx.media3.extractor.text.ttml;

import android.text.TextUtils;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import p076i4.AbstractC2214p0;
import p076i4.AbstractC2230y;
import p076i4.C2217r0;
import p076i4.Z0;
import p076i4.b1;
import p076i4.f1;

final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;
    public final int markFill;
    public final int markShape;
    public final int position;
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\s+");
    private static final AbstractC2214p0 SINGLE_STYLE_VALUES = AbstractC2214p0.s(new Object[]{TtmlNode.TEXT_EMPHASIS_AUTO, "none"}, 2);
    private static final AbstractC2214p0 MARK_SHAPE_VALUES = AbstractC2214p0.s(new Object[]{TtmlNode.TEXT_EMPHASIS_MARK_DOT, TtmlNode.TEXT_EMPHASIS_MARK_SESAME, TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE}, 3);
    private static final AbstractC2214p0 MARK_FILL_VALUES = AbstractC2214p0.s(new Object[]{TtmlNode.TEXT_EMPHASIS_MARK_FILLED, TtmlNode.TEXT_EMPHASIS_MARK_OPEN}, 2);
    private static final AbstractC2214p0 POSITION_VALUES = AbstractC2214p0.s(new Object[]{TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE}, 3);

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    private TextEmphasis(int i3, int i9, int i10) {
        this.markShape = i3;
        this.markFill = i9;
        this.position = i10;
    }

    public static TextEmphasis parse(String str) {
        AbstractC2214p0 f1Var;
        if (str == null) {
            return null;
        }
        String strI0 = AbstractC1909d.i0(str.trim());
        if (strI0.isEmpty()) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(strI0, WHITESPACE_PATTERN);
        int length = strArrSplit.length;
        if (length == 0) {
            f1Var = Z0.f22857q;
        } else if (length != 1) {
            f1Var = AbstractC2214p0.s((Object[]) strArrSplit.clone(), strArrSplit.length);
        } else {
            f1Var = new f1(strArrSplit[0]);
        }
        return parseWords(f1Var);
    }

    private static TextEmphasis parseWords(AbstractC2214p0 abstractC2214p0) {
        byte b9;
        int i3;
        int i9;
        String str;
        int iHashCode;
        String str2 = (String) AbstractC2230y.k(TtmlNode.ANNOTATION_POSITION_OUTSIDE, AbstractC2230y.o(POSITION_VALUES, abstractC2214p0));
        int iHashCode2 = str2.hashCode();
        int i10 = 2;
        byte b10 = 0;
        int i11 = -1;
        if (iHashCode2 != -1392885889) {
            if (iHashCode2 != -1106037339) {
                if (iHashCode2 == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                    b9 = 0;
                } else {
                    b9 = -1;
                }
            } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                b9 = 1;
            } else {
                b9 = -1;
            }
        } else if (str2.equals(TtmlNode.ANNOTATION_POSITION_BEFORE)) {
            b9 = 2;
        } else {
            b9 = -1;
        }
        if (b9 != 0) {
            i3 = b9 != 1 ? 1 : -2;
        } else {
            i3 = 2;
        }
        b1 b1VarO = AbstractC2230y.o(SINGLE_STYLE_VALUES, abstractC2214p0);
        if (!b1VarO.isEmpty()) {
            String str3 = (String) new C2217r0(b1VarO).next();
            int iHashCode3 = str3.hashCode();
            if (iHashCode3 == 3005871) {
                str3.equals(TtmlNode.TEXT_EMPHASIS_AUTO);
            } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                i11 = 0;
            }
            return new TextEmphasis(i11, 0, i3);
        }
        b1 b1VarO2 = AbstractC2230y.o(MARK_FILL_VALUES, abstractC2214p0);
        b1 b1VarO3 = AbstractC2230y.o(MARK_SHAPE_VALUES, abstractC2214p0);
        if (b1VarO2.isEmpty() && b1VarO3.isEmpty()) {
            return new TextEmphasis(-1, 0, i3);
        }
        String str4 = (String) AbstractC2230y.k(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, b1VarO2);
        int iHashCode4 = str4.hashCode();
        if (iHashCode4 != -1274499742) {
            if (iHashCode4 == 3417674 && str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_OPEN)) {
                i9 = 2;
            }
            str = (String) AbstractC2230y.k(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, b1VarO3);
            iHashCode = str.hashCode();
            if (iHashCode != -1360216880) {
                if (iHashCode != -905816648) {
                    if (iHashCode == 99657 || !str.equals(TtmlNode.TEXT_EMPHASIS_MARK_DOT)) {
                        b10 = -1;
                    }
                } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
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
            return new TextEmphasis(i10, i9, i3);
        }
        str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
        i9 = 1;
        str = (String) AbstractC2230y.k(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, b1VarO3);
        iHashCode = str.hashCode();
        if (iHashCode != -1360216880) {
            if (iHashCode != -905816648) {
                if (iHashCode == 99657) {
                    b10 = -1;
                } else {
                    b10 = -1;
                }
            } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                b10 = 1;
            } else {
                b10 = -1;
            }
        } else if (str.equals(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE)) {
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
        return new TextEmphasis(i10, i9, i3);
    }
}

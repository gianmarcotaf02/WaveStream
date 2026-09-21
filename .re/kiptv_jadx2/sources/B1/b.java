package B1;

import A0.q;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

public final class b {

    public final TextPaint f583a;

    public final TextDirectionHeuristic f584b;

    public final int f585c;

    public final int f586d;

    public b(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            q.g(textPaint).setBreakStrategy(i3).setHyphenationFrequency(i9).setTextDirection(textDirectionHeuristic).build();
        }
        this.f583a = textPaint;
        this.f584b = textDirectionHeuristic;
        this.f585c = i3;
        this.f586d = i9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f585c != bVar.f585c || this.f586d != bVar.f586d) {
            return false;
        }
        TextPaint textPaint = this.f583a;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = bVar.f583a;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.f584b == bVar.f584b;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f583a;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f584b, Integer.valueOf(this.f585c), Integer.valueOf(this.f586d));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f583a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i3 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i3 >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.f584b);
        sb.append(", breakStrategy=" + this.f585c);
        sb.append(", hyphenationFrequency=" + this.f586d);
        sb.append("}");
        return sb.toString();
    }

    public b(PrecomputedText.Params params) {
        this.f583a = params.getTextPaint();
        this.f584b = params.getTextDirection();
        this.f585c = params.getBreakStrategy();
        this.f586d = params.getHyphenationFrequency();
    }
}

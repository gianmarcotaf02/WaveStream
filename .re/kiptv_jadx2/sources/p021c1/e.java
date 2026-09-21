package p021c1;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.m;
import p039e1.f;

public final class e {

    public final CharSequence f18458a;

    public final TextPaint f18459b;

    public final int f18460c;

    public float f18461d = Float.NaN;

    public float f18462e = Float.NaN;

    public BoringLayout.Metrics f18463f;
    public boolean g;

    public CharSequence f18464h;

    public e(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f18458a = charSequence;
        this.f18459b = textPaint;
        this.f18460c = i3;
    }

    public final BoringLayout.Metrics a() {
        BoringLayout.Metrics metricsIsBoring;
        if (!this.g) {
            TextDirectionHeuristic textDirectionHeuristicB = j.b(this.f18460c);
            int i3 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f18458a;
            TextPaint textPaint = this.f18459b;
            if (i3 >= 33) {
                metricsIsBoring = BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristicB, true, null);
            } else {
                metricsIsBoring = !textDirectionHeuristicB.isRtl(charSequence, 0, charSequence.length()) ? BoringLayout.isBoring(charSequence, textPaint, null) : null;
            }
            this.f18463f = metricsIsBoring;
            this.g = true;
        }
        return this.f18463f;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.f18464h;
        if (charSequence != null) {
            m.b(charSequence);
            return charSequence;
        }
        CharSequence charSequence2 = this.f18458a;
        if (charSequence2 instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence2;
            if (f.f(spanned, CharacterStyle.class)) {
                CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class);
                if (characterStyleArr != null && characterStyleArr.length != 0) {
                    SpannableString spannableString = null;
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
        }
        this.f18464h = charSequence2;
        return charSequence2;
    }

    public final float c() {
        if (!Float.isNaN(this.f18461d)) {
            return this.f18461d;
        }
        BoringLayout.Metrics metricsA = a();
        float fCeil = metricsA != null ? metricsA.width : -1;
        TextPaint textPaint = this.f18459b;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(Layout.getDesiredWidth(b(), 0, b().length(), textPaint));
        }
        if (fCeil != 0.0f) {
            CharSequence charSequence = this.f18458a;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (f.f(spanned, f.class) || f.f(spanned, p039e1.e.class)) {
                    fCeil += 0.5f;
                } else if (textPaint.getLetterSpacing() != 0.0f) {
                    fCeil += 0.5f;
                }
            } else if (textPaint.getLetterSpacing() != 0.0f) {
                fCeil += 0.5f;
            }
        }
        this.f18461d = fCeil;
        return fCeil;
    }
}

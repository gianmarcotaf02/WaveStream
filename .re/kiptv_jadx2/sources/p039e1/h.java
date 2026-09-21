package p039e1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import p065h1.a;

public final class h implements LineHeightSpan {

    public final float f21344a;

    public final int f21345b;

    public final boolean f21346c;

    public final boolean f21347d;

    public final float f21348e;

    public final int f21349f;
    public int g = Integer.MIN_VALUE;

    public int f21350h = Integer.MIN_VALUE;

    public int f21351i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;

    public int f21352k;

    public int f21353l;

    public h(float f9, int i3, boolean z6, boolean z9, float f10, int i9) {
        this.f21344a = f9;
        this.f21345b = i3;
        this.f21346c = z6;
        this.f21347d = z9;
        this.f21348e = f10;
        this.f21349f = i9;
        if ((0.0f > f10 || f10 > 1.0f) && f10 != -1.0f) {
            a.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override
    public final void chooseHeight(CharSequence charSequence, int i3, int i9, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i12 = fontMetricsInt.descent;
        int i13 = fontMetricsInt.ascent;
        if (i12 - i13 <= 0) {
            return;
        }
        boolean z6 = i3 == 0;
        boolean z9 = i9 == this.f21345b;
        int i14 = this.f21349f;
        boolean z10 = this.f21347d;
        boolean z11 = this.f21346c;
        if (z6 && z9 && z11 && z10 && i14 != 2) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int i15 = i12 - i13;
            int iCeil = (int) Math.ceil(this.f21344a);
            int i16 = iCeil - i15;
            if (i14 != 1 || i16 > 0) {
                float fAbs = this.f21348e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i16 <= 0) {
                    dCeil = Math.ceil(i16 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i16);
                }
                int i17 = (int) dCeil;
                int i18 = fontMetricsInt.descent;
                int i19 = i17 + i18;
                this.f21351i = i19;
                int i20 = i19 - iCeil;
                this.f21350h = i20;
                if (i14 == 0 || i16 >= 0) {
                    if (z11) {
                        i20 = fontMetricsInt.ascent;
                    }
                    this.g = i20;
                    if (z10) {
                        i19 = i18;
                    }
                    this.j = i19;
                    this.f21352k = fontMetricsInt.ascent - i20;
                    this.f21353l = i19 - i18;
                } else if (i14 == 2) {
                    this.g = z11 ? Math.max(fontMetricsInt.ascent, i20) : Math.min(fontMetricsInt.ascent, i20);
                    this.j = z10 ? Math.min(fontMetricsInt.descent, this.f21351i) : Math.max(fontMetricsInt.descent, this.f21351i);
                    this.f21352k = 0;
                    this.f21353l = 0;
                }
            } else {
                int i21 = fontMetricsInt.ascent;
                this.f21350h = i21;
                int i22 = fontMetricsInt.descent;
                this.f21351i = i22;
                this.g = i21;
                this.j = i22;
                this.f21352k = 0;
                this.f21353l = 0;
            }
        }
        fontMetricsInt.ascent = z6 ? this.g : this.f21350h;
        fontMetricsInt.descent = z9 ? this.j : this.f21351i;
    }
}

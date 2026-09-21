package Z2;

import Y2.C1038h;
import Z.AbstractC1149h0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Base64;
import android.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.google.common.util.concurrent.AbstractC1903s;
import com.kiptv.tv.R;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import p103m.N0;

public final class C0 {
    public static HashSet g;

    public Object f12655a;

    public Object f12656b;

    public Object f12657c;

    public Object f12658d;

    public Object f12659e;

    public Object f12660f;

    public static LayerDrawable B(p103m.I0 i3, Context context, int i9) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
        Drawable drawableC = i3.c(context, R.drawable.abc_star_black_48dp);
        Drawable drawableC2 = i3.c(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableC;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableC2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean D(V v6, long j) {
        return (v6.f12830h & j) != 0;
    }

    public static Path G(P p2) {
        Path path = new Path();
        float[] fArr = p2.f12803o;
        path.moveTo(fArr[0], fArr[1]);
        int i3 = 2;
        while (true) {
            float[] fArr2 = p2.f12803o;
            if (i3 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i3], fArr2[i3 + 1]);
            i3 += 2;
        }
        if (p2 instanceof Q) {
            path.close();
        }
        if (p2.f12855h == null) {
            p2.f12855h = f(path);
        }
        return path;
    }

    public static void T(A0 a2, boolean z6, AbstractC1187e0 abstractC1187e0) {
        int i3;
        V v6 = a2.f12640a;
        float fFloatValue = (z6 ? v6.j : v6.f12833l).floatValue();
        if (abstractC1187e0 instanceof C1212w) {
            i3 = ((C1212w) abstractC1187e0).f12962h;
        } else if (!(abstractC1187e0 instanceof C1213x)) {
            return;
        } else {
            i3 = a2.f12640a.f12839r.f12962h;
        }
        int iL = l(fFloatValue, i3);
        if (z6) {
            a2.f12643d.setColor(iL);
        } else {
            a2.f12644e.setColor(iL);
        }
    }

    public static void U(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterE;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p103m.r.f25107b;
        }
        PorterDuff.Mode mode2 = p103m.r.f25107b;
        synchronized (p103m.r.class) {
            porterDuffColorFilterE = p103m.I0.e(i3, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public static void a(float f9, float f10, float f11, float f12, float f13, boolean z6, boolean z9, float f14, float f15, N n3) {
        if (f9 == f14 && f10 == f15) {
            return;
        }
        if (f11 == 0.0f || f12 == 0.0f) {
            n3.e(f14, f15);
            return;
        }
        float fAbs = Math.abs(f11);
        float fAbs2 = Math.abs(f12);
        double radians = Math.toRadians(((double) f13) % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d4 = ((double) (f9 - f14)) / 2.0d;
        double d6 = ((double) (f10 - f15)) / 2.0d;
        double d9 = (dSin * d6) + (dCos * d4);
        double d10 = (dCos * d6) + ((-dSin) * d4);
        double d11 = fAbs * fAbs;
        double d12 = fAbs2 * fAbs2;
        double d13 = d9 * d9;
        double d14 = d10 * d10;
        double d15 = (d14 / d12) + (d13 / d11);
        if (d15 > 0.99999d) {
            double dSqrt = Math.sqrt(d15) * 1.00001d;
            fAbs = (float) (((double) fAbs) * dSqrt);
            fAbs2 = (float) (dSqrt * ((double) fAbs2));
            d11 = fAbs * fAbs;
            d12 = fAbs2 * fAbs2;
        }
        double d16 = z6 == z9 ? -1.0d : 1.0d;
        double d17 = d11 * d12;
        double d18 = d11 * d14;
        double d19 = d12 * d13;
        double d20 = ((d17 - d18) - d19) / (d18 + d19);
        if (d20 < 0.0d) {
            d20 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d20) * d16;
        double d21 = fAbs;
        double d22 = fAbs2;
        double d23 = ((d21 * d10) / d22) * dSqrt2;
        double d24 = dSqrt2 * (-((d22 * d9) / d21));
        double d25 = ((dCos * d23) - (dSin * d24)) + (((double) (f9 + f14)) / 2.0d);
        double d26 = (dCos * d24) + (dSin * d23) + (((double) (f10 + f15)) / 2.0d);
        double d27 = (d9 - d23) / d21;
        double d28 = (d10 - d24) / d22;
        double d29 = ((-d9) - d23) / d21;
        double d30 = ((-d10) - d24) / d22;
        double d31 = (d28 * d28) + (d27 * d27);
        double dAcos = Math.acos(d27 / Math.sqrt(d31)) * (d28 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = Math.sqrt(((d30 * d30) + (d29 * d29)) * d31);
        double d32 = (d28 * d30) + (d27 * d29);
        double d33 = d32 / dSqrt3;
        double dAcos2 = ((d27 * d30) - (d28 * d29) < 0.0d ? -1.0d : 1.0d) * (d33 < -1.0d ? 3.141592653589793d : d33 > 1.0d ? 0.0d : Math.acos(d33));
        if (!z9 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z9 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d34 = dAcos2 % 6.283185307179586d;
        double d35 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d34) * 2.0d) / 3.141592653589793d);
        double d36 = d34 / ((double) iCeil);
        double d37 = d36 / 2.0d;
        double dSin2 = (Math.sin(d37) * 1.3333333333333333d) / (Math.cos(d37) + 1.0d);
        int i3 = iCeil * 6;
        float[] fArr = new float[i3];
        int i9 = 0;
        int i10 = 0;
        while (i9 < iCeil) {
            double d38 = d35;
            double d39 = (((double) i9) * d36) + d38;
            double dCos2 = Math.cos(d39);
            double dSin3 = Math.sin(d39);
            int i11 = i9;
            int i12 = i10;
            fArr[i12] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i10 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d40 = d39 + d36;
            double dCos3 = Math.cos(d40);
            double dSin4 = Math.sin(d40);
            fArr[i12 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i12 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i12 + 4] = (float) dCos3;
            i10 = i12 + 6;
            fArr[i12 + 5] = (float) dSin4;
            i9 = i11 + 1;
            d35 = d38;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f13);
        matrix.postTranslate((float) d25, (float) d26);
        matrix.mapPoints(fArr);
        fArr[i3 - 2] = f14;
        fArr[i3 - 1] = f15;
        for (int i13 = 0; i13 < i3; i13 += 6) {
            n3.c(fArr[i13], fArr[i13 + 1], fArr[i13 + 2], fArr[i13 + 3], fArr[i13 + 4], fArr[i13 + 5]);
        }
    }

    public static boolean c(int[] iArr, int i3) {
        for (int i9 : iArr) {
            if (i9 == i3) {
                return true;
            }
        }
        return false;
    }

    public static C1209t f(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new C1209t(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix h(C1209t c1209t, C1209t c1209t2, C1208s c1208s) {
        r rVar;
        float f9;
        float f10;
        Matrix matrix = new Matrix();
        if (c1208s != null && (rVar = c1208s.f12933a) != null) {
            float f11 = c1209t.f12943d / c1209t2.f12943d;
            float f12 = c1209t.f12944e / c1209t2.f12944e;
            float f13 = -c1209t2.f12941b;
            float f14 = -c1209t2.f12942c;
            if (c1208s.equals(C1208s.f12931c)) {
                matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
                matrix.preScale(f11, f12);
                matrix.preTranslate(f13, f14);
                return matrix;
            }
            float fMax = c1208s.f12934b == 2 ? Math.max(f11, f12) : Math.min(f11, f12);
            float f15 = c1209t.f12943d / fMax;
            float f16 = c1209t.f12944e / fMax;
            int iOrdinal = rVar.ordinal();
            if (iOrdinal == 2) {
                f9 = (c1209t2.f12943d - f15) / 2.0f;
                f13 -= f9;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                            }
                        }
                    }
                    f9 = (c1209t2.f12943d - f15) / 2.0f;
                    f13 -= f9;
                }
                f9 = c1209t2.f12943d - f15;
                f13 -= f9;
            }
            switch (rVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f10 = (c1209t2.f12944e - f16) / 2.0f;
                    break;
                case 7:
                case 8:
                case 9:
                    f10 = c1209t2.f12944e - f16;
                    break;
                default:
                    matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
                    matrix.preScale(fMax, fMax);
                    matrix.preTranslate(f13, f14);
                    break;
            }
            f14 -= f10;
            matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
            matrix.preScale(fMax, fMax);
            matrix.preTranslate(f13, f14);
        }
        return matrix;
    }

    public static Typeface k(String str, int i3, Integer num) {
        int i9;
        boolean z6 = i3 == 2;
        if (num.intValue() > 500) {
            i9 = z6 ? 3 : 1;
        } else {
            i9 = z6 ? 2 : 0;
        }
        str.getClass();
        switch (str) {
            case "sans-serif":
                return Typeface.create(Typeface.SANS_SERIF, i9);
            case "monospace":
                return Typeface.create(Typeface.MONOSPACE, i9);
            case "fantasy":
                return Typeface.create(Typeface.SANS_SERIF, i9);
            case "serif":
                return Typeface.create(Typeface.SERIF, i9);
            case "cursive":
                return Typeface.create(Typeface.SANS_SERIF, i9);
            default:
                return null;
        }
    }

    public static int l(float f9, int i3) {
        int i9 = 255;
        int iRound = Math.round(((i3 >> 24) & 255) * f9);
        if (iRound < 0) {
            i9 = 0;
        } else if (iRound <= 255) {
            i9 = iRound;
        }
        return (i9 << 24) | (i3 & 16777215);
    }

    public static ColorStateList m(Context context, int i3) {
        int iC = N0.c(context, R.attr.colorControlHighlight);
        int iB = N0.b(context, R.attr.colorButtonNormal);
        int[] iArr = N0.f24944b;
        int[] iArr2 = N0.f24946d;
        int iC2 = p182w1.a.c(iC, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, N0.f24945c, N0.f24948f}, new int[]{iB, iC2, p182w1.a.c(iC, i3), i3});
    }

    public static void s(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void u(A a2, String str) {
        AbstractC1181b0 abstractC1181b0I = a2.f12869a.I(str);
        if (abstractC1181b0I == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(abstractC1181b0I instanceof A)) {
            s("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (abstractC1181b0I == a2) {
            s("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        A a9 = (A) abstractC1181b0I;
        if (a2.f12637i == null) {
            a2.f12637i = a9.f12637i;
        }
        if (a2.j == null) {
            a2.j = a9.j;
        }
        if (a2.f12638k == 0) {
            a2.f12638k = a9.f12638k;
        }
        if (a2.f12636h.isEmpty()) {
            a2.f12636h = a9.f12636h;
        }
        try {
            if (a2 instanceof C1183c0) {
                C1183c0 c1183c0 = (C1183c0) a2;
                C1183c0 c1183c1 = (C1183c0) abstractC1181b0I;
                if (c1183c0.f12863m == null) {
                    c1183c0.f12863m = c1183c1.f12863m;
                }
                if (c1183c0.f12864n == null) {
                    c1183c0.f12864n = c1183c1.f12864n;
                }
                if (c1183c0.f12865o == null) {
                    c1183c0.f12865o = c1183c1.f12865o;
                }
                if (c1183c0.f12866p == null) {
                    c1183c0.f12866p = c1183c1.f12866p;
                }
            } else {
                v((C1191g0) a2, (C1191g0) abstractC1181b0I);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = a9.f12639l;
        if (str2 != null) {
            u(a2, str2);
        }
    }

    public static void v(C1191g0 c1191g0, C1191g0 c1191g1) {
        if (c1191g0.f12878m == null) {
            c1191g0.f12878m = c1191g1.f12878m;
        }
        if (c1191g0.f12879n == null) {
            c1191g0.f12879n = c1191g1.f12879n;
        }
        if (c1191g0.f12880o == null) {
            c1191g0.f12880o = c1191g1.f12880o;
        }
        if (c1191g0.f12881p == null) {
            c1191g0.f12881p = c1191g1.f12881p;
        }
        if (c1191g0.f12882q == null) {
            c1191g0.f12882q = c1191g1.f12882q;
        }
    }

    public static void w(O o8, String str) {
        AbstractC1181b0 abstractC1181b0I = o8.f12869a.I(str);
        if (abstractC1181b0I == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(abstractC1181b0I instanceof O)) {
            s("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (abstractC1181b0I == o8) {
            s("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        O o9 = (O) abstractC1181b0I;
        if (o8.f12795p == null) {
            o8.f12795p = o9.f12795p;
        }
        if (o8.f12796q == null) {
            o8.f12796q = o9.f12796q;
        }
        if (o8.f12797r == null) {
            o8.f12797r = o9.f12797r;
        }
        if (o8.f12798s == null) {
            o8.f12798s = o9.f12798s;
        }
        if (o8.f12799t == null) {
            o8.f12799t = o9.f12799t;
        }
        if (o8.f12800u == null) {
            o8.f12800u = o9.f12800u;
        }
        if (o8.f12801v == null) {
            o8.f12801v = o9.f12801v;
        }
        if (o8.f12851i.isEmpty()) {
            o8.f12851i = o9.f12851i;
        }
        if (o8.f12888o == null) {
            o8.f12888o = o9.f12888o;
        }
        if (o8.f12876n == null) {
            o8.f12876n = o9.f12876n;
        }
        String str2 = o9.f12802w;
        if (str2 != null) {
            w(o8, str2);
        }
    }

    public Path.FillType A() {
        int i3 = ((A0) this.f12657c).f12640a.f12827R;
        return (i3 == 0 || i3 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public ColorStateList C(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return AbstractC1903s.x(context, R.color.abc_tint_edittext);
        }
        if (i3 == 2131230786) {
            return AbstractC1903s.x(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return m(context, N0.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return m(context, N0.c(context, R.attr.colorAccent));
            }
            if (i3 == 2131230781 || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return AbstractC1903s.x(context, R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f12656b, i3)) {
                return N0.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.f12659e, i3)) {
                return AbstractC1903s.x(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.f12660f, i3)) {
                return AbstractC1903s.x(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return AbstractC1903s.x(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = N0.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = N0.f24944b;
            iArr2[0] = N0.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = N0.f24947e;
            iArr2[1] = N0.c(context, R.attr.colorControlActivated);
            iArr[2] = N0.f24948f;
            iArr2[2] = N0.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = N0.f24944b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = N0.f24947e;
            iArr2[1] = N0.c(context, R.attr.colorControlActivated);
            iArr[2] = N0.f24948f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public Path E(C1210u c1210u) {
        F f9 = c1210u.f12945o;
        float fD = f9 != null ? f9.d(this) : 0.0f;
        F f10 = c1210u.f12946p;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        float fA = c1210u.f12947q.a(this);
        float f11 = fD - fA;
        float f12 = fE - fA;
        float f13 = fD + fA;
        float f14 = fE + fA;
        if (c1210u.f12855h == null) {
            float f15 = 2.0f * fA;
            c1210u.f12855h = new C1209t(f11, f12, f15, f15);
        }
        float f16 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f12);
        float f17 = fD + f16;
        float f18 = fE - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fE);
        float f19 = fE + f16;
        path.cubicTo(f13, f19, f17, f14, fD, f14);
        float f20 = fD - f16;
        path.cubicTo(f20, f14, f11, f19, f11, fE);
        path.cubicTo(f11, f18, f20, f12, fD, f12);
        path.close();
        return path;
    }

    public Path F(C1215z c1215z) {
        F f9 = c1215z.f12972o;
        float fD = f9 != null ? f9.d(this) : 0.0f;
        F f10 = c1215z.f12973p;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        float fD2 = c1215z.f12974q.d(this);
        float fE2 = c1215z.f12975r.e(this);
        float f11 = fD - fD2;
        float f12 = fE - fE2;
        float f13 = fD + fD2;
        float f14 = fE + fE2;
        if (c1215z.f12855h == null) {
            c1215z.f12855h = new C1209t(f11, f12, fD2 * 2.0f, 2.0f * fE2);
        }
        float f15 = fD2 * 0.5522848f;
        float f16 = fE2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fD, f12);
        float f17 = fD + f15;
        float f18 = fE - f16;
        path.cubicTo(f17, f12, f13, f18, f13, fE);
        float f19 = fE + f16;
        path.cubicTo(f13, f19, f17, f14, fD, f14);
        float f20 = fD - f15;
        path.cubicTo(f20, f14, f11, f19, f11, fE);
        path.cubicTo(f11, f18, f20, f12, fD, f12);
        path.close();
        return path;
    }

    public Path H(S s9) {
        float fD;
        float fE;
        float fMin;
        F f9;
        float fD2;
        F f10;
        float fE2;
        float fD3;
        float fE3;
        float f11;
        float f12;
        Path path;
        F f13 = s9.f12808s;
        if (f13 == null && s9.f12809t == null) {
            fD = 0.0f;
        } else {
            if (f13 != null) {
                if (s9.f12809t == null) {
                    fD = f13.d(this);
                } else {
                    fD = f13.d(this);
                    fE = s9.f12809t.e(this);
                }
                fMin = Math.min(fD, s9.f12806q.d(this) / 2.0f);
                float fMin2 = Math.min(fE, s9.f12807r.e(this) / 2.0f);
                f9 = s9.f12804o;
                if (f9 != null) {
                    fD2 = f9.d(this);
                } else {
                    fD2 = 0.0f;
                }
                f10 = s9.f12805p;
                if (f10 != null) {
                    fE2 = f10.e(this);
                } else {
                    fE2 = 0.0f;
                }
                fD3 = s9.f12806q.d(this);
                fE3 = s9.f12807r.e(this);
                if (s9.f12855h == null) {
                    s9.f12855h = new C1209t(fD2, fE2, fD3, fE3);
                }
                f11 = fD3 + fD2;
                f12 = fE2 + fE3;
                path = new Path();
                if (fMin != 0.0f || fMin2 == 0.0f) {
                    path.moveTo(fD2, fE2);
                    path.lineTo(f11, fE2);
                    path.lineTo(f11, f12);
                    path.lineTo(fD2, f12);
                    path.lineTo(fD2, fE2);
                } else {
                    float f14 = fMin * 0.5522848f;
                    float f15 = 0.5522848f * fMin2;
                    float f16 = fE2 + fMin2;
                    path.moveTo(fD2, f16);
                    float f17 = f16 - f15;
                    float f18 = fD2 + fMin;
                    float f19 = f18 - f14;
                    path.cubicTo(fD2, f17, f19, fE2, f18, fE2);
                    float f20 = f11 - fMin;
                    path.lineTo(f20, fE2);
                    float f21 = f20 + f14;
                    path.cubicTo(f21, fE2, f11, f17, f11, f16);
                    float f22 = f12 - fMin2;
                    path.lineTo(f11, f22);
                    float f23 = f22 + f15;
                    path.cubicTo(f11, f23, f21, f12, f20, f12);
                    path.lineTo(f18, f12);
                    float f24 = fD2;
                    path.cubicTo(f19, f12, f24, f23, fD2, f22);
                    path.lineTo(f24, f16);
                }
                path.close();
                return path;
            }
            fD = s9.f12809t.e(this);
        }
        fE = fD;
        fMin = Math.min(fD, s9.f12806q.d(this) / 2.0f);
        float fMin3 = Math.min(fE, s9.f12807r.e(this) / 2.0f);
        f9 = s9.f12804o;
        if (f9 != null) {
            fD2 = f9.d(this);
        } else {
            fD2 = 0.0f;
        }
        f10 = s9.f12805p;
        if (f10 != null) {
            fE2 = f10.e(this);
        } else {
            fE2 = 0.0f;
        }
        fD3 = s9.f12806q.d(this);
        fE3 = s9.f12807r.e(this);
        if (s9.f12855h == null) {
            s9.f12855h = new C1209t(fD2, fE2, fD3, fE3);
        }
        f11 = fD3 + fD2;
        f12 = fE2 + fE3;
        path = new Path();
        if (fMin != 0.0f) {
            path.moveTo(fD2, fE2);
            path.lineTo(f11, fE2);
            path.lineTo(f11, f12);
            path.lineTo(fD2, f12);
            path.lineTo(fD2, fE2);
        } else {
            path.moveTo(fD2, fE2);
            path.lineTo(f11, fE2);
            path.lineTo(f11, f12);
            path.lineTo(fD2, f12);
            path.lineTo(fD2, fE2);
        }
        path.close();
        return path;
    }

    public C1209t I(F f9, F f10, F f11, F f12) {
        float fD = f9 != null ? f9.d(this) : 0.0f;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        A0 a2 = (A0) this.f12657c;
        C1209t c1209t = a2.g;
        if (c1209t == null) {
            c1209t = a2.f12645f;
        }
        return new C1209t(fD, fE, f11 != null ? f11.d(this) : c1209t.f12943d, f12 != null ? f12.e(this) : c1209t.f12944e);
    }

    public Path J(AbstractC1179a0 abstractC1179a0, boolean z6) {
        Path pathG;
        Path pathE;
        ((Stack) this.f12658d).push((A0) this.f12657c);
        A0 a2 = new A0((A0) this.f12657c);
        this.f12657c = a2;
        a0(abstractC1179a0, a2);
        if (!o() || !c0()) {
            this.f12657c = (A0) ((Stack) this.f12658d).pop();
            return null;
        }
        if (abstractC1179a0 instanceof s0) {
            if (!z6) {
                s("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            s0 s0Var = (s0) abstractC1179a0;
            AbstractC1181b0 abstractC1181b0I = abstractC1179a0.f12869a.I(s0Var.f12935o);
            if (abstractC1181b0I == null) {
                s("Use reference '%s' not found", s0Var.f12935o);
                this.f12657c = (A0) ((Stack) this.f12658d).pop();
                return null;
            }
            if (!(abstractC1181b0I instanceof AbstractC1179a0)) {
                this.f12657c = (A0) ((Stack) this.f12658d).pop();
                return null;
            }
            pathG = J((AbstractC1179a0) abstractC1181b0I, false);
            if (pathG != null) {
                if (s0Var.f12855h == null) {
                    s0Var.f12855h = f(pathG);
                }
                Matrix matrix = s0Var.f12654n;
                if (matrix != null) {
                    pathG.transform(matrix);
                }
                if (((A0) this.f12657c).f12640a.f12815E != null && (pathE = e(abstractC1179a0, abstractC1179a0.f12855h)) != null) {
                    pathG.op(pathE, Path.Op.INTERSECT);
                }
                this.f12657c = (A0) ((Stack) this.f12658d).pop();
                return pathG;
            }
            return null;
        }
        if (abstractC1179a0 instanceof B) {
            B b9 = (B) abstractC1179a0;
            if (abstractC1179a0 instanceof L) {
                pathG = new w0(((L) abstractC1179a0).f12780o).f12963a;
                if (abstractC1179a0.f12855h == null) {
                    abstractC1179a0.f12855h = f(pathG);
                }
            } else if (abstractC1179a0 instanceof S) {
                pathG = H((S) abstractC1179a0);
            } else if (abstractC1179a0 instanceof C1210u) {
                pathG = E((C1210u) abstractC1179a0);
            } else if (abstractC1179a0 instanceof C1215z) {
                pathG = F((C1215z) abstractC1179a0);
            } else {
                pathG = abstractC1179a0 instanceof P ? G((P) abstractC1179a0) : null;
            }
            if (pathG != null) {
                if (b9.f12855h == null) {
                    b9.f12855h = f(pathG);
                }
                Matrix matrix2 = b9.f12651n;
                if (matrix2 != null) {
                    pathG.transform(matrix2);
                }
                pathG.setFillType(A());
            }
            return null;
        }
        if (!(abstractC1179a0 instanceof C1203m0)) {
            s("Invalid %s element found in clipPath definition", abstractC1179a0.o());
            return null;
        }
        C1203m0 c1203m0 = (C1203m0) abstractC1179a0;
        ArrayList arrayList = c1203m0.f12916n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((F) c1203m0.f12916n.get(0)).d(this);
        ArrayList arrayList2 = c1203m0.f12917o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((F) c1203m0.f12917o.get(0)).e(this);
        ArrayList arrayList3 = c1203m0.f12918p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((F) c1203m0.f12918p.get(0)).d(this);
        ArrayList arrayList4 = c1203m0.f12919q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((F) c1203m0.f12919q.get(0)).e(this);
        }
        if (((A0) this.f12657c).f12640a.f12826Q != 1) {
            float fG = g(c1203m0);
            if (((A0) this.f12657c).f12640a.f12826Q == 2) {
                fG /= 2.0f;
            }
            fD -= fG;
        }
        if (c1203m0.f12855h == null) {
            z0 z0Var = new z0(this, fD, fE2);
            r(c1203m0, z0Var);
            RectF rectF = (RectF) z0Var.f12980r;
            c1203m0.f12855h = new C1209t(rectF.left, rectF.top, rectF.width(), ((RectF) z0Var.f12980r).height());
        }
        Path path = new Path();
        r(c1203m0, new z0(this, fD + fD2, fE2 + fE, path));
        Matrix matrix3 = c1203m0.f12901r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        path.setFillType(A());
        pathG = path;
        if (((A0) this.f12657c).f12640a.f12815E != null) {
            pathG.op(pathE, Path.Op.INTERSECT);
        }
        this.f12657c = (A0) ((Stack) this.f12658d).pop();
        return pathG;
    }

    public void K(C1209t c1209t) {
        if (((A0) this.f12657c).f12640a.f12816F != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = (Canvas) this.f12655a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            I i3 = (I) ((android.support.v4.media.session.q) this.f12656b).I(((A0) this.f12657c).f12640a.f12816F);
            R(i3, c1209t);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            R(i3, c1209t);
            canvas.restore();
            canvas.restore();
        }
        V();
    }

    public boolean L() {
        AbstractC1181b0 abstractC1181b0I;
        int i3 = 0;
        if (((A0) this.f12657c).f12640a.f12838q.floatValue() >= 1.0f && ((A0) this.f12657c).f12640a.f12816F == null) {
            return false;
        }
        int iFloatValue = (int) (((A0) this.f12657c).f12640a.f12838q.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i3 = 255;
            if (iFloatValue <= 255) {
                i3 = iFloatValue;
            }
        }
        ((Canvas) this.f12655a).saveLayerAlpha(null, i3, 31);
        ((Stack) this.f12658d).push((A0) this.f12657c);
        A0 a2 = new A0((A0) this.f12657c);
        this.f12657c = a2;
        String str = a2.f12640a.f12816F;
        if (str != null && ((abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(str)) == null || !(abstractC1181b0I instanceof I))) {
            s("Mask reference '%s' not found", ((A0) this.f12657c).f12640a.f12816F);
            ((A0) this.f12657c).f12640a.f12816F = null;
        }
        return true;
    }

    public void M(W w6, C1209t c1209t, C1209t c1209t2, C1208s c1208s) {
        if (c1209t.f12943d == 0.0f || c1209t.f12944e == 0.0f) {
            return;
        }
        if (c1208s == null && (c1208s = w6.f12876n) == null) {
            c1208s = C1208s.f12932d;
        }
        a0(w6, (A0) this.f12657c);
        if (o()) {
            A0 a2 = (A0) this.f12657c;
            a2.f12645f = c1209t;
            if (!a2.f12640a.f12843v.booleanValue()) {
                C1209t c1209t3 = ((A0) this.f12657c).f12645f;
                S(c1209t3.f12941b, c1209t3.f12942c, c1209t3.f12943d, c1209t3.f12944e);
            }
            i(w6, ((A0) this.f12657c).f12645f);
            Canvas canvas = (Canvas) this.f12655a;
            if (c1209t2 != null) {
                canvas.concat(h(((A0) this.f12657c).f12645f, c1209t2, c1208s));
                ((A0) this.f12657c).g = w6.f12888o;
            } else {
                C1209t c1209t4 = ((A0) this.f12657c).f12645f;
                canvas.translate(c1209t4.f12941b, c1209t4.f12942c);
            }
            boolean zL = L();
            b0();
            O(w6, true);
            if (zL) {
                K(w6.f12855h);
            }
            Y(w6);
        }
    }

    public void N(AbstractC1185d0 abstractC1185d0) {
        F f9;
        String str;
        int iIndexOf;
        Set setC;
        F f10;
        Boolean bool;
        if (abstractC1185d0 instanceof J) {
            return;
        }
        W();
        if ((abstractC1185d0 instanceof AbstractC1181b0) && (bool = ((AbstractC1181b0) abstractC1185d0).f12860d) != null) {
            ((A0) this.f12657c).f12646h = bool.booleanValue();
        }
        if (abstractC1185d0 instanceof W) {
            W w6 = (W) abstractC1185d0;
            M(w6, I(w6.f12847p, w6.f12848q, w6.f12849r, w6.f12850s), w6.f12888o, w6.f12876n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (abstractC1185d0 instanceof s0) {
                s0 s0Var = (s0) abstractC1185d0;
                F f11 = s0Var.f12938r;
                if ((f11 == null || !f11.g()) && ((f10 = s0Var.f12939s) == null || !f10.g())) {
                    a0(s0Var, (A0) this.f12657c);
                    if (o()) {
                        AbstractC1185d0 abstractC1185d0I = s0Var.f12869a.I(s0Var.f12935o);
                        if (abstractC1185d0I == null) {
                            s("Use reference '%s' not found", s0Var.f12935o);
                        } else {
                            Matrix matrix = s0Var.f12654n;
                            Canvas canvas = (Canvas) this.f12655a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            F f12 = s0Var.f12936p;
                            float fD = f12 != null ? f12.d(this) : 0.0f;
                            F f13 = s0Var.f12937q;
                            canvas.translate(fD, f13 != null ? f13.e(this) : 0.0f);
                            i(s0Var, s0Var.f12855h);
                            boolean zL = L();
                            ((Stack) this.f12659e).push(s0Var);
                            ((Stack) this.f12660f).push(((Canvas) this.f12655a).getMatrix());
                            if (abstractC1185d0I instanceof W) {
                                W w9 = (W) abstractC1185d0I;
                                C1209t c1209tI = I(null, null, s0Var.f12938r, s0Var.f12939s);
                                W();
                                M(w9, c1209tI, w9.f12888o, w9.f12876n);
                                V();
                            } else if (abstractC1185d0I instanceof C1197j0) {
                                F f14 = s0Var.f12938r;
                                if (f14 == null) {
                                    f14 = new F(100.0f, 9);
                                }
                                F f15 = s0Var.f12939s;
                                if (f15 == null) {
                                    f15 = new F(100.0f, 9);
                                }
                                C1209t c1209tI2 = I(null, null, f14, f15);
                                W();
                                C1197j0 c1197j0 = (C1197j0) abstractC1185d0I;
                                if (c1209tI2.f12943d != 0.0f && c1209tI2.f12944e != 0.0f) {
                                    C1208s c1208s = c1197j0.f12876n;
                                    if (c1208s == null) {
                                        c1208s = C1208s.f12932d;
                                    }
                                    a0(c1197j0, (A0) this.f12657c);
                                    A0 a2 = (A0) this.f12657c;
                                    a2.f12645f = c1209tI2;
                                    if (!a2.f12640a.f12843v.booleanValue()) {
                                        C1209t c1209t = ((A0) this.f12657c).f12645f;
                                        S(c1209t.f12941b, c1209t.f12942c, c1209t.f12943d, c1209t.f12944e);
                                    }
                                    C1209t c1209t2 = c1197j0.f12888o;
                                    if (c1209t2 != null) {
                                        canvas.concat(h(((A0) this.f12657c).f12645f, c1209t2, c1208s));
                                        ((A0) this.f12657c).g = c1197j0.f12888o;
                                    } else {
                                        C1209t c1209t3 = ((A0) this.f12657c).f12645f;
                                        canvas.translate(c1209t3.f12941b, c1209t3.f12942c);
                                    }
                                    boolean zL2 = L();
                                    O(c1197j0, true);
                                    if (zL2) {
                                        K(c1197j0.f12855h);
                                    }
                                    Y(c1197j0);
                                }
                                V();
                            } else {
                                N(abstractC1185d0I);
                            }
                            ((Stack) this.f12659e).pop();
                            ((Stack) this.f12660f).pop();
                            if (zL) {
                                K(s0Var.f12855h);
                            }
                            Y(s0Var);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof C1195i0) {
                C1195i0 c1195i0 = (C1195i0) abstractC1185d0;
                a0(c1195i0, (A0) this.f12657c);
                if (o()) {
                    Matrix matrix2 = c1195i0.f12654n;
                    if (matrix2 != null) {
                        ((Canvas) this.f12655a).concat(matrix2);
                    }
                    i(c1195i0, c1195i0.f12855h);
                    boolean zL3 = L();
                    String language = Locale.getDefault().getLanguage();
                    for (AbstractC1185d0 abstractC1185d1 : c1195i0.f12851i) {
                        if (abstractC1185d1 instanceof X) {
                            X x9 = (X) abstractC1185d1;
                            if (x9.d() == null && ((setC = x9.c()) == null || (!setC.isEmpty() && setC.contains(language)))) {
                                Set setG = x9.g();
                                if (setG != null) {
                                    if (g == null) {
                                        synchronized (C0.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (setG.isEmpty() || !g.containsAll(setG)) {
                                    }
                                }
                                Set setM = x9.m();
                                if (setM == null) {
                                    Set setN = x9.n();
                                    if (setN == null) {
                                        N(abstractC1185d1);
                                        break;
                                    }
                                    setN.isEmpty();
                                } else {
                                    setM.isEmpty();
                                }
                            }
                        }
                    }
                    if (zL3) {
                        K(c1195i0.f12855h);
                    }
                    Y(c1195i0);
                }
            } else if (abstractC1185d0 instanceof C) {
                C c9 = (C) abstractC1185d0;
                a0(c9, (A0) this.f12657c);
                if (o()) {
                    Matrix matrix3 = c9.f12654n;
                    if (matrix3 != null) {
                        ((Canvas) this.f12655a).concat(matrix3);
                    }
                    i(c9, c9.f12855h);
                    boolean zL4 = L();
                    O(c9, true);
                    if (zL4) {
                        K(c9.f12855h);
                    }
                    Y(c9);
                }
            } else if (abstractC1185d0 instanceof E) {
                E e6 = (E) abstractC1185d0;
                F f16 = e6.f12664r;
                if (f16 != null && !f16.g() && (f9 = e6.f12665s) != null && !f9.g() && (str = e6.f12661o) != null) {
                    C1208s c1208s2 = e6.f12876n;
                    if (c1208s2 == null) {
                        c1208s2 = C1208s.f12932d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e9) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e9);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        C1209t c1209t4 = new C1209t(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        a0(e6, (A0) this.f12657c);
                        if (o() && c0()) {
                            Matrix matrix4 = e6.f12666t;
                            Canvas canvas2 = (Canvas) this.f12655a;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            F f17 = e6.f12662p;
                            float fD2 = f17 != null ? f17.d(this) : 0.0f;
                            F f18 = e6.f12663q;
                            float fE2 = f18 != null ? f18.e(this) : 0.0f;
                            float fD3 = e6.f12664r.d(this);
                            float fD4 = e6.f12665s.d(this);
                            A0 a9 = (A0) this.f12657c;
                            a9.f12645f = new C1209t(fD2, fE2, fD3, fD4);
                            if (!a9.f12640a.f12843v.booleanValue()) {
                                C1209t c1209t5 = ((A0) this.f12657c).f12645f;
                                S(c1209t5.f12941b, c1209t5.f12942c, c1209t5.f12943d, c1209t5.f12944e);
                            }
                            e6.f12855h = ((A0) this.f12657c).f12645f;
                            Y(e6);
                            i(e6, e6.f12855h);
                            boolean zL5 = L();
                            b0();
                            canvas2.save();
                            canvas2.concat(h(((A0) this.f12657c).f12645f, c1209t4, c1208s2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(((A0) this.f12657c).f12640a.f12829T == 3 ? 0 : 2));
                            canvas2.restore();
                            if (zL5) {
                                K(e6.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof L) {
                L l2 = (L) abstractC1185d0;
                if (l2.f12780o != null) {
                    a0(l2, (A0) this.f12657c);
                    if (o() && c0()) {
                        A0 a10 = (A0) this.f12657c;
                        if (a10.f12642c || a10.f12641b) {
                            Matrix matrix5 = l2.f12651n;
                            if (matrix5 != null) {
                                ((Canvas) this.f12655a).concat(matrix5);
                            }
                            Path path = new w0(l2.f12780o).f12963a;
                            if (l2.f12855h == null) {
                                l2.f12855h = f(path);
                            }
                            Y(l2);
                            j(l2);
                            i(l2, l2.f12855h);
                            boolean zL6 = L();
                            A0 a11 = (A0) this.f12657c;
                            if (a11.f12641b) {
                                int i3 = a11.f12640a.f12820K;
                                path.setFillType((i3 == 0 || i3 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                p(l2, path);
                            }
                            if (((A0) this.f12657c).f12642c) {
                                q(path);
                            }
                            Q(l2);
                            if (zL6) {
                                K(l2.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof S) {
                S s9 = (S) abstractC1185d0;
                F f19 = s9.f12806q;
                if (f19 != null && s9.f12807r != null && !f19.g() && !s9.f12807r.g()) {
                    a0(s9, (A0) this.f12657c);
                    if (o() && c0()) {
                        Matrix matrix6 = s9.f12651n;
                        if (matrix6 != null) {
                            ((Canvas) this.f12655a).concat(matrix6);
                        }
                        Path pathH = H(s9);
                        Y(s9);
                        j(s9);
                        i(s9, s9.f12855h);
                        boolean zL7 = L();
                        if (((A0) this.f12657c).f12641b) {
                            p(s9, pathH);
                        }
                        if (((A0) this.f12657c).f12642c) {
                            q(pathH);
                        }
                        if (zL7) {
                            K(s9.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof C1210u) {
                C1210u c1210u = (C1210u) abstractC1185d0;
                F f20 = c1210u.f12947q;
                if (f20 != null && !f20.g()) {
                    a0(c1210u, (A0) this.f12657c);
                    if (o() && c0()) {
                        Matrix matrix7 = c1210u.f12651n;
                        if (matrix7 != null) {
                            ((Canvas) this.f12655a).concat(matrix7);
                        }
                        Path pathE = E(c1210u);
                        Y(c1210u);
                        j(c1210u);
                        i(c1210u, c1210u.f12855h);
                        boolean zL8 = L();
                        if (((A0) this.f12657c).f12641b) {
                            p(c1210u, pathE);
                        }
                        if (((A0) this.f12657c).f12642c) {
                            q(pathE);
                        }
                        if (zL8) {
                            K(c1210u.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof C1215z) {
                C1215z c1215z = (C1215z) abstractC1185d0;
                F f21 = c1215z.f12974q;
                if (f21 != null && c1215z.f12975r != null && !f21.g() && !c1215z.f12975r.g()) {
                    a0(c1215z, (A0) this.f12657c);
                    if (o() && c0()) {
                        Matrix matrix8 = c1215z.f12651n;
                        if (matrix8 != null) {
                            ((Canvas) this.f12655a).concat(matrix8);
                        }
                        Path pathF = F(c1215z);
                        Y(c1215z);
                        j(c1215z);
                        i(c1215z, c1215z.f12855h);
                        boolean zL9 = L();
                        if (((A0) this.f12657c).f12641b) {
                            p(c1215z, pathF);
                        }
                        if (((A0) this.f12657c).f12642c) {
                            q(pathF);
                        }
                        if (zL9) {
                            K(c1215z.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof G) {
                G g9 = (G) abstractC1185d0;
                a0(g9, (A0) this.f12657c);
                if (o() && c0() && ((A0) this.f12657c).f12642c) {
                    Matrix matrix9 = g9.f12651n;
                    if (matrix9 != null) {
                        ((Canvas) this.f12655a).concat(matrix9);
                    }
                    F f22 = g9.f12671o;
                    float fD5 = f22 == null ? 0.0f : f22.d(this);
                    F f23 = g9.f12672p;
                    float fE3 = f23 == null ? 0.0f : f23.e(this);
                    F f24 = g9.f12673q;
                    float fD6 = f24 == null ? 0.0f : f24.d(this);
                    F f25 = g9.f12674r;
                    fE = f25 != null ? f25.e(this) : 0.0f;
                    if (g9.f12855h == null) {
                        g9.f12855h = new C1209t(Math.min(fD5, fD6), Math.min(fE3, fE), Math.abs(fD6 - fD5), Math.abs(fE - fE3));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fD5, fE3);
                    path2.lineTo(fD6, fE);
                    Y(g9);
                    j(g9);
                    i(g9, g9.f12855h);
                    boolean zL10 = L();
                    q(path2);
                    Q(g9);
                    if (zL10) {
                        K(g9.f12855h);
                    }
                }
            } else if (abstractC1185d0 instanceof Q) {
                Q q9 = (Q) abstractC1185d0;
                a0(q9, (A0) this.f12657c);
                if (o() && c0()) {
                    A0 a12 = (A0) this.f12657c;
                    if (a12.f12642c || a12.f12641b) {
                        Matrix matrix10 = q9.f12651n;
                        if (matrix10 != null) {
                            ((Canvas) this.f12655a).concat(matrix10);
                        }
                        if (q9.f12803o.length >= 2) {
                            Path pathG = G(q9);
                            Y(q9);
                            j(q9);
                            i(q9, q9.f12855h);
                            boolean zL11 = L();
                            if (((A0) this.f12657c).f12641b) {
                                p(q9, pathG);
                            }
                            if (((A0) this.f12657c).f12642c) {
                                q(pathG);
                            }
                            Q(q9);
                            if (zL11) {
                                K(q9.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof P) {
                P p2 = (P) abstractC1185d0;
                a0(p2, (A0) this.f12657c);
                if (o() && c0()) {
                    A0 a13 = (A0) this.f12657c;
                    if (a13.f12642c || a13.f12641b) {
                        Matrix matrix11 = p2.f12651n;
                        if (matrix11 != null) {
                            ((Canvas) this.f12655a).concat(matrix11);
                        }
                        if (p2.f12803o.length >= 2) {
                            Path pathG2 = G(p2);
                            Y(p2);
                            int i9 = ((A0) this.f12657c).f12640a.f12820K;
                            pathG2.setFillType((i9 == 0 || i9 != 2) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            j(p2);
                            i(p2, p2.f12855h);
                            boolean zL12 = L();
                            if (((A0) this.f12657c).f12641b) {
                                p(p2, pathG2);
                            }
                            if (((A0) this.f12657c).f12642c) {
                                q(pathG2);
                            }
                            Q(p2);
                            if (zL12) {
                                K(p2.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof C1203m0) {
                C1203m0 c1203m0 = (C1203m0) abstractC1185d0;
                a0(c1203m0, (A0) this.f12657c);
                if (o()) {
                    Matrix matrix12 = c1203m0.f12901r;
                    if (matrix12 != null) {
                        ((Canvas) this.f12655a).concat(matrix12);
                    }
                    ArrayList arrayList = c1203m0.f12916n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((F) c1203m0.f12916n.get(0)).d(this);
                    ArrayList arrayList2 = c1203m0.f12917o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((F) c1203m0.f12917o.get(0)).e(this);
                    ArrayList arrayList3 = c1203m0.f12918p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((F) c1203m0.f12918p.get(0)).d(this);
                    ArrayList arrayList4 = c1203m0.f12919q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((F) c1203m0.f12919q.get(0)).e(this);
                    }
                    int iZ = z();
                    if (iZ != 1) {
                        float fG = g(c1203m0);
                        if (iZ == 2) {
                            fG /= 2.0f;
                        }
                        fD7 -= fG;
                    }
                    if (c1203m0.f12855h == null) {
                        z0 z0Var = new z0(this, fD7, fE4);
                        r(c1203m0, z0Var);
                        RectF rectF = (RectF) z0Var.f12980r;
                        c1203m0.f12855h = new C1209t(rectF.left, rectF.top, rectF.width(), ((RectF) z0Var.f12980r).height());
                    }
                    Y(c1203m0);
                    j(c1203m0);
                    i(c1203m0, c1203m0.f12855h);
                    boolean zL13 = L();
                    r(c1203m0, new y0(this, fD7 + fD8, fE4 + fE));
                    if (zL13) {
                        K(c1203m0.f12855h);
                    }
                }
            }
        }
        V();
    }

    public void O(Y y, boolean z6) {
        if (z6) {
            ((Stack) this.f12659e).push(y);
            ((Stack) this.f12660f).push(((Canvas) this.f12655a).getMatrix());
        }
        Iterator it = y.f12851i.iterator();
        while (it.hasNext()) {
            N((AbstractC1185d0) it.next());
        }
        if (z6) {
            ((Stack) this.f12659e).pop();
            ((Stack) this.f12660f).pop();
        }
    }

    public void P(H h9, v0 v0Var) {
        float fFloatValue;
        float f9;
        float f10;
        float f11;
        W();
        Float f12 = h9.f12681u;
        float f13 = 0.0f;
        if (f12 == null) {
            fFloatValue = 0.0f;
        } else if (Float.isNaN(f12.floatValue())) {
            float f14 = v0Var.f12958c;
            if (f14 == 0.0f && v0Var.f12959d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) Math.toDegrees(Math.atan2(v0Var.f12959d, f14));
            }
        } else {
            fFloatValue = h9.f12681u.floatValue();
        }
        float fC = h9.f12676p ? 1.0f : ((A0) this.f12657c).f12640a.f12834m.c();
        this.f12657c = x(h9);
        Matrix matrix = new Matrix();
        matrix.preTranslate(v0Var.f12956a, v0Var.f12957b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fC, fC);
        F f15 = h9.f12677q;
        float fD = f15 != null ? f15.d(this) : 0.0f;
        F f16 = h9.f12678r;
        float fE = f16 != null ? f16.e(this) : 0.0f;
        F f17 = h9.f12679s;
        float fD2 = f17 != null ? f17.d(this) : 3.0f;
        F f18 = h9.f12680t;
        float fE2 = f18 != null ? f18.e(this) : 3.0f;
        C1209t c1209t = h9.f12888o;
        Canvas canvas = (Canvas) this.f12655a;
        if (c1209t != null) {
            float fMax = fD2 / c1209t.f12943d;
            float f19 = fE2 / c1209t.f12944e;
            C1208s c1208s = h9.f12876n;
            if (c1208s == null) {
                c1208s = C1208s.f12932d;
            }
            if (!c1208s.equals(C1208s.f12931c)) {
                fMax = c1208s.f12934b == 2 ? Math.max(fMax, f19) : Math.min(fMax, f19);
                f19 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f19);
            canvas.concat(matrix);
            C1209t c1209t2 = h9.f12888o;
            float f20 = c1209t2.f12943d * fMax;
            float f21 = c1209t2.f12944e * f19;
            r rVar = c1208s.f12933a;
            int iOrdinal = rVar.ordinal();
            if (iOrdinal == 2) {
                f9 = (fD2 - f20) / 2.0f;
                f10 = 0.0f - f9;
            } else {
                if (iOrdinal != 3) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            if (iOrdinal != 8) {
                                if (iOrdinal != 9) {
                                    f10 = 0.0f;
                                }
                            }
                        }
                    }
                    f9 = (fD2 - f20) / 2.0f;
                    f10 = 0.0f - f9;
                }
                f9 = fD2 - f20;
                f10 = 0.0f - f9;
            }
            switch (rVar.ordinal()) {
                case 4:
                case 5:
                case 6:
                    f11 = (fE2 - f21) / 2.0f;
                    f13 = 0.0f - f11;
                    if (!((A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                        S(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f19);
                    canvas.concat(matrix);
                    break;
                case 7:
                case 8:
                case 9:
                    f11 = fE2 - f21;
                    f13 = 0.0f - f11;
                    if (!((A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                        S(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f19);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                        S(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f19);
                    canvas.concat(matrix);
                    break;
            }
        } else {
            matrix.preTranslate(-fD, -fE);
            canvas.concat(matrix);
            if (!((A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                S(0.0f, 0.0f, fD2, fE2);
            }
        }
        boolean zL = L();
        O(h9, false);
        if (zL) {
            K(h9.f12855h);
        }
        V();
    }

    public void Q(B b9) {
        H h9;
        H h10;
        H h11;
        int i3;
        float f9;
        float f10;
        float f11;
        ArrayList arrayList;
        int size;
        V v6 = ((A0) this.f12657c).f12640a;
        String str = v6.f12845x;
        if (str == null && v6.y == null && v6.f12846z == null) {
            return;
        }
        if (str == null) {
            h9 = null;
        } else {
            AbstractC1181b0 abstractC1181b0I = b9.f12869a.I(str);
            if (abstractC1181b0I != null) {
                h9 = (H) abstractC1181b0I;
            } else {
                s("Marker reference '%s' not found", ((A0) this.f12657c).f12640a.f12845x);
                h9 = null;
            }
        }
        String str2 = ((A0) this.f12657c).f12640a.y;
        if (str2 == null) {
            h10 = null;
        } else {
            AbstractC1181b0 abstractC1181b0I2 = b9.f12869a.I(str2);
            if (abstractC1181b0I2 != null) {
                h10 = (H) abstractC1181b0I2;
            } else {
                s("Marker reference '%s' not found", ((A0) this.f12657c).f12640a.y);
                h10 = null;
            }
        }
        String str3 = ((A0) this.f12657c).f12640a.f12846z;
        if (str3 == null) {
            h11 = null;
        } else {
            AbstractC1181b0 abstractC1181b0I3 = b9.f12869a.I(str3);
            if (abstractC1181b0I3 != null) {
                h11 = (H) abstractC1181b0I3;
            } else {
                s("Marker reference '%s' not found", ((A0) this.f12657c).f12640a.f12846z);
                h11 = null;
            }
        }
        float f12 = 0.0f;
        if (b9 instanceof L) {
            arrayList = new u0(this, ((L) b9).f12780o).f12948a;
            f10 = 0.0f;
            i3 = 1;
        } else if (b9 instanceof G) {
            G g9 = (G) b9;
            F f13 = g9.f12671o;
            float fD = f13 != null ? f13.d(this) : 0.0f;
            F f14 = g9.f12672p;
            float fE = f14 != null ? f14.e(this) : 0.0f;
            F f15 = g9.f12673q;
            float fD2 = f15 != null ? f15.d(this) : 0.0f;
            F f16 = g9.f12674r;
            float fE2 = f16 != null ? f16.e(this) : 0.0f;
            ArrayList arrayList2 = new ArrayList(2);
            float f17 = fD2 - fD;
            i3 = 1;
            float f18 = fE2 - fE;
            arrayList2.add(new v0(fD, fE, f17, f18));
            arrayList2.add(new v0(fD2, fE2, f17, f18));
            f10 = 0.0f;
            arrayList = arrayList2;
        } else {
            i3 = 1;
            P p2 = (P) b9;
            int length = p2.f12803o.length;
            if (length < 2) {
                arrayList = null;
                f10 = 0.0f;
            } else {
                ArrayList arrayList3 = new ArrayList();
                float[] fArr = p2.f12803o;
                v0 v0Var = new v0(fArr[0], fArr[1], 0.0f, 0.0f);
                int i9 = 2;
                float f19 = 0.0f;
                float f20 = 0.0f;
                while (true) {
                    f9 = v0Var.f12957b;
                    f10 = f12;
                    f11 = v0Var.f12956a;
                    if (i9 >= length) {
                        break;
                    }
                    float[] fArr2 = p2.f12803o;
                    float f21 = fArr2[i9];
                    float f22 = fArr2[i9 + 1];
                    v0Var.a(f21, f22);
                    arrayList3.add(v0Var);
                    v0Var = new v0(f21, f22, f21 - f11, f22 - f9);
                    i9 += 2;
                    f20 = f22;
                    f19 = f21;
                    f12 = f10;
                }
                if (p2 instanceof Q) {
                    float[] fArr3 = p2.f12803o;
                    float f23 = fArr3[0];
                    if (f19 != f23) {
                        float f24 = fArr3[1];
                        if (f20 != f24) {
                            v0Var.a(f23, f24);
                            arrayList3.add(v0Var);
                            v0 v0Var2 = new v0(f23, f24, f23 - f11, f24 - f9);
                            v0Var2.b((v0) arrayList3.get(0));
                            arrayList3.add(v0Var2);
                            arrayList3.set(0, v0Var2);
                        }
                    }
                } else {
                    arrayList3.add(v0Var);
                }
                arrayList = arrayList3;
            }
        }
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return;
        }
        V v9 = ((A0) this.f12657c).f12640a;
        v9.f12846z = null;
        v9.y = null;
        v9.f12845x = null;
        if (h9 != null) {
            P(h9, (v0) arrayList.get(0));
        }
        if (h10 != null && arrayList.size() > 2) {
            v0 v0Var3 = (v0) arrayList.get(0);
            v0 v0Var4 = (v0) arrayList.get(i3);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                v0 v0Var5 = (v0) arrayList.get(i10);
                if (v0Var4.f12960e) {
                    float f25 = v0Var4.f12958c;
                    float f26 = v0Var4.f12959d;
                    float f27 = v0Var3.f12956a;
                    float f28 = v0Var4.f12956a;
                    float f29 = v0Var4.f12957b;
                    float f30 = ((f29 - v0Var3.f12957b) * f26) + ((f28 - f27) * f25);
                    if (f30 == f10) {
                        f30 = ((v0Var5.f12956a - f28) * f25) + ((v0Var5.f12957b - f29) * f26);
                    }
                    if (f30 <= f10 && (f30 != f10 || (f25 <= f10 && f26 < f10))) {
                        v0Var4.f12958c = -f25;
                        v0Var4.f12959d = -f26;
                    }
                }
                P(h10, v0Var4);
                v0Var3 = v0Var4;
                v0Var4 = v0Var5;
            }
        }
        if (h11 != null) {
            P(h11, (v0) arrayList.get(size - 1));
        }
    }

    public void R(I i3, C1209t c1209t) {
        float fD;
        float fE;
        Boolean bool = i3.f12683n;
        if (bool == null || !bool.booleanValue()) {
            F f9 = i3.f12685p;
            float fB = f9 != null ? f9.b(this, 1.0f) : 1.2f;
            F f10 = i3.f12686q;
            float fB2 = f10 != null ? f10.b(this, 1.0f) : 1.2f;
            fD = fB * c1209t.f12943d;
            fE = fB2 * c1209t.f12944e;
        } else {
            F f11 = i3.f12685p;
            fD = f11 != null ? f11.d(this) : c1209t.f12943d;
            F f12 = i3.f12686q;
            fE = f12 != null ? f12.e(this) : c1209t.f12944e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        W();
        A0 a0X = x(i3);
        this.f12657c = a0X;
        a0X.f12640a.f12838q = Float.valueOf(1.0f);
        boolean zL = L();
        Canvas canvas = (Canvas) this.f12655a;
        canvas.save();
        Boolean bool2 = i3.f12684o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c1209t.f12941b, c1209t.f12942c);
            canvas.scale(c1209t.f12943d, c1209t.f12944e);
        }
        O(i3, false);
        canvas.restore();
        if (zL) {
            K(c1209t);
        }
        V();
    }

    public void S(float f9, float f10, float f11, float f12) {
        float fD = f11 + f9;
        float fE = f12 + f10;
        A7.m mVar = ((A0) this.f12657c).f12640a.f12844w;
        if (mVar != null) {
            f9 += ((F) mVar.f323l).d(this);
            f10 += ((F) ((A0) this.f12657c).f12640a.f12844w.f321i).e(this);
            fD -= ((F) ((A0) this.f12657c).f12640a.f12844w.j).d(this);
            fE -= ((F) ((A0) this.f12657c).f12640a.f12844w.f322k).e(this);
        }
        ((Canvas) this.f12655a).clipRect(f9, f10, fD, fE);
    }

    public void V() {
        ((Canvas) this.f12655a).restore();
        this.f12657c = (A0) ((Stack) this.f12658d).pop();
    }

    public void W() {
        ((Canvas) this.f12655a).save();
        ((Stack) this.f12658d).push((A0) this.f12657c);
        this.f12657c = new A0((A0) this.f12657c);
    }

    public String X(String str, boolean z6, boolean z9) {
        if (((A0) this.f12657c).f12646h) {
            return str.replaceAll("[\\n\\t]", ServerSentEventKt.SPACE);
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", ServerSentEventKt.SPACE);
        if (z6) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z9) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", ServerSentEventKt.SPACE);
    }

    public void Y(AbstractC1179a0 abstractC1179a0) {
        if (abstractC1179a0.f12870b == null || abstractC1179a0.f12855h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) ((Stack) this.f12660f).peek()).invert(matrix)) {
            C1209t c1209t = abstractC1179a0.f12855h;
            float f9 = c1209t.f12941b;
            float f10 = c1209t.f12942c;
            float fC = c1209t.c();
            C1209t c1209t2 = abstractC1179a0.f12855h;
            float f11 = c1209t2.f12942c;
            float fC2 = c1209t2.c();
            float fD = abstractC1179a0.f12855h.d();
            C1209t c1209t3 = abstractC1179a0.f12855h;
            float[] fArr = {f9, f10, fC, f11, fC2, fD, c1209t3.f12941b, c1209t3.d()};
            matrix.preConcat(((Canvas) this.f12655a).getMatrix());
            matrix.mapPoints(fArr);
            float f12 = fArr[0];
            float f13 = fArr[1];
            RectF rectF = new RectF(f12, f13, f12, f13);
            for (int i3 = 2; i3 <= 6; i3 += 2) {
                float f14 = fArr[i3];
                if (f14 < rectF.left) {
                    rectF.left = f14;
                }
                if (f14 > rectF.right) {
                    rectF.right = f14;
                }
                float f15 = fArr[i3 + 1];
                if (f15 < rectF.top) {
                    rectF.top = f15;
                }
                if (f15 > rectF.bottom) {
                    rectF.bottom = f15;
                }
            }
            AbstractC1179a0 abstractC1179a1 = (AbstractC1179a0) ((Stack) this.f12659e).peek();
            C1209t c1209t4 = abstractC1179a1.f12855h;
            if (c1209t4 == null) {
                float f16 = rectF.left;
                float f17 = rectF.top;
                abstractC1179a1.f12855h = new C1209t(f16, f17, rectF.right - f16, rectF.bottom - f17);
                return;
            }
            float f18 = rectF.left;
            float f19 = rectF.top;
            float f20 = rectF.right - f18;
            float f21 = rectF.bottom - f19;
            if (f18 < c1209t4.f12941b) {
                c1209t4.f12941b = f18;
            }
            if (f19 < c1209t4.f12942c) {
                c1209t4.f12942c = f19;
            }
            if (f18 + f20 > c1209t4.c()) {
                c1209t4.f12943d = (f18 + f20) - c1209t4.f12941b;
            }
            if (f19 + f21 > c1209t4.d()) {
                c1209t4.f12944e = (f19 + f21) - c1209t4.f12942c;
            }
        }
    }

    public void Z(A0 a2, V v6) {
        V v9;
        if (D(v6, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            a2.f12640a.f12839r = v6.f12839r;
        }
        if (D(v6, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            a2.f12640a.f12838q = v6.f12838q;
        }
        boolean zD = D(v6, 1L);
        C1212w c1212w = C1212w.j;
        if (zD) {
            a2.f12640a.f12831i = v6.f12831i;
            AbstractC1187e0 abstractC1187e0 = v6.f12831i;
            a2.f12641b = (abstractC1187e0 == null || abstractC1187e0 == c1212w) ? false : true;
        }
        if (D(v6, 4L)) {
            a2.f12640a.j = v6.j;
        }
        if (D(v6, 6149L)) {
            T(a2, true, a2.f12640a.f12831i);
        }
        if (D(v6, 2L)) {
            a2.f12640a.f12820K = v6.f12820K;
        }
        if (D(v6, 8L)) {
            a2.f12640a.f12832k = v6.f12832k;
            AbstractC1187e0 abstractC1187e1 = v6.f12832k;
            a2.f12642c = (abstractC1187e1 == null || abstractC1187e1 == c1212w) ? false : true;
        }
        if (D(v6, 16L)) {
            a2.f12640a.f12833l = v6.f12833l;
        }
        if (D(v6, 6168L)) {
            T(a2, false, a2.f12640a.f12832k);
        }
        if (D(v6, 34359738368L)) {
            a2.f12640a.f12828S = v6.f12828S;
        }
        if (D(v6, 32L)) {
            V v10 = a2.f12640a;
            F f9 = v6.f12834m;
            v10.f12834m = f9;
            a2.f12644e.setStrokeWidth(f9.a(this));
        }
        if (D(v6, 64L)) {
            a2.f12640a.f12821L = v6.f12821L;
            int iC = AbstractC1149h0.c(v6.f12821L);
            Paint paint = a2.f12644e;
            if (iC == 0) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (iC == 1) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (iC == 2) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (D(v6, 128L)) {
            a2.f12640a.f12822M = v6.f12822M;
            int iC2 = AbstractC1149h0.c(v6.f12822M);
            Paint paint2 = a2.f12644e;
            if (iC2 == 0) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (iC2 == 1) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (iC2 == 2) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (D(v6, 256L)) {
            a2.f12640a.f12835n = v6.f12835n;
            a2.f12644e.setStrokeMiter(v6.f12835n.floatValue());
        }
        if (D(v6, 512L)) {
            a2.f12640a.f12836o = v6.f12836o;
        }
        if (D(v6, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            a2.f12640a.f12837p = v6.f12837p;
        }
        Typeface typefaceK = null;
        if (D(v6, 1536L)) {
            F[] fArr = a2.f12640a.f12836o;
            Paint paint3 = a2.f12644e;
            if (fArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = fArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr2 = new float[i3];
                int i9 = 0;
                float f10 = 0.0f;
                while (true) {
                    v9 = a2.f12640a;
                    if (i9 >= i3) {
                        break;
                    }
                    float fA = v9.f12836o[i9 % length].a(this);
                    fArr2[i9] = fA;
                    f10 += fA;
                    i9++;
                }
                if (f10 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = v9.f12837p.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f10) + f10;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr2, fA2));
                }
            }
        }
        if (D(v6, PlaybackStateCompat.ACTION_PREPARE)) {
            float textSize = ((A0) this.f12657c).f12643d.getTextSize();
            a2.f12640a.f12841t = v6.f12841t;
            a2.f12643d.setTextSize(v6.f12841t.b(this, textSize));
            a2.f12644e.setTextSize(v6.f12841t.b(this, textSize));
        }
        if (D(v6, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            a2.f12640a.f12840s = v6.f12840s;
        }
        if (D(v6, PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (v6.f12842u.intValue() == -1 && a2.f12640a.f12842u.intValue() > 100) {
                V v11 = a2.f12640a;
                v11.f12842u = Integer.valueOf(v11.f12842u.intValue() - 100);
            } else if (v6.f12842u.intValue() != 1 || a2.f12640a.f12842u.intValue() >= 900) {
                a2.f12640a.f12842u = v6.f12842u;
            } else {
                V v12 = a2.f12640a;
                v12.f12842u = Integer.valueOf(v12.f12842u.intValue() + 100);
            }
        }
        if (D(v6, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            a2.f12640a.f12823N = v6.f12823N;
        }
        if (D(v6, 106496L)) {
            V v13 = a2.f12640a;
            ArrayList arrayList = v13.f12840s;
            if (arrayList != null && ((android.support.v4.media.session.q) this.f12656b) != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceK = k((String) it.next(), v13.f12823N, v13.f12842u);
                    if (typefaceK != null) {
                        break;
                    }
                }
            }
            if (typefaceK == null) {
                typefaceK = k(androidx.media3.common.C.SERIF_NAME, v13.f12823N, v13.f12842u);
            }
            a2.f12643d.setTypeface(typefaceK);
            a2.f12644e.setTypeface(typefaceK);
        }
        if (D(v6, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            a2.f12640a.f12824O = v6.f12824O;
            Paint paint4 = a2.f12643d;
            paint4.setStrikeThruText(v6.f12824O == 4);
            paint4.setUnderlineText(v6.f12824O == 2);
            Paint paint5 = a2.f12644e;
            paint5.setStrikeThruText(v6.f12824O == 4);
            paint5.setUnderlineText(v6.f12824O == 2);
        }
        if (D(v6, 68719476736L)) {
            a2.f12640a.f12825P = v6.f12825P;
        }
        if (D(v6, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            a2.f12640a.f12826Q = v6.f12826Q;
        }
        if (D(v6, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            a2.f12640a.f12843v = v6.f12843v;
        }
        if (D(v6, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            a2.f12640a.f12845x = v6.f12845x;
        }
        if (D(v6, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            a2.f12640a.y = v6.y;
        }
        if (D(v6, 8388608L)) {
            a2.f12640a.f12846z = v6.f12846z;
        }
        if (D(v6, 16777216L)) {
            a2.f12640a.f12811A = v6.f12811A;
        }
        if (D(v6, 33554432L)) {
            a2.f12640a.f12812B = v6.f12812B;
        }
        if (D(v6, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            a2.f12640a.f12844w = v6.f12844w;
        }
        if (D(v6, 268435456L)) {
            a2.f12640a.f12815E = v6.f12815E;
        }
        if (D(v6, 536870912L)) {
            a2.f12640a.f12827R = v6.f12827R;
        }
        if (D(v6, 1073741824L)) {
            a2.f12640a.f12816F = v6.f12816F;
        }
        if (D(v6, 67108864L)) {
            a2.f12640a.f12813C = v6.f12813C;
        }
        if (D(v6, 134217728L)) {
            a2.f12640a.f12814D = v6.f12814D;
        }
        if (D(v6, 8589934592L)) {
            a2.f12640a.f12818I = v6.f12818I;
        }
        if (D(v6, 17179869184L)) {
            a2.f12640a.f12819J = v6.f12819J;
        }
        if (D(v6, 137438953472L)) {
            a2.f12640a.f12829T = v6.f12829T;
        }
    }

    public void a0(AbstractC1181b0 abstractC1181b0, A0 a2) {
        boolean z6 = abstractC1181b0.f12870b == null;
        V v6 = a2.f12640a;
        Boolean bool = Boolean.TRUE;
        v6.f12811A = bool;
        if (!z6) {
            bool = Boolean.FALSE;
        }
        v6.f12843v = bool;
        v6.f12844w = null;
        v6.f12815E = null;
        v6.f12838q = Float.valueOf(1.0f);
        v6.f12813C = C1212w.f12961i;
        v6.f12814D = Float.valueOf(1.0f);
        v6.f12816F = null;
        v6.f12817G = null;
        v6.H = Float.valueOf(1.0f);
        v6.f12818I = null;
        v6.f12819J = Float.valueOf(1.0f);
        v6.f12828S = 1;
        V v9 = abstractC1181b0.f12861e;
        if (v9 != null) {
            Z(a2, v9);
        }
        ArrayList arrayList = ((C1202m) ((android.support.v4.media.session.q) this.f12656b).j).f12900b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (C1200l c1200l : ((C1202m) ((android.support.v4.media.session.q) this.f12656b).j).f12900b) {
                if (C1038h.n(c1200l.f12895a, abstractC1181b0)) {
                    Z(a2, c1200l.f12896b);
                }
            }
        }
        V v10 = abstractC1181b0.f12862f;
        if (v10 != null) {
            Z(a2, v10);
        }
    }

    public void b(String str, String str2) {
        HashMap map = (HashMap) this.f12660f;
        if (map == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void b0() {
        int iL;
        V v6 = ((A0) this.f12657c).f12640a;
        AbstractC1187e0 abstractC1187e0 = v6.f12818I;
        if (abstractC1187e0 instanceof C1212w) {
            iL = ((C1212w) abstractC1187e0).f12962h;
        } else if (!(abstractC1187e0 instanceof C1213x)) {
            return;
        } else {
            iL = v6.f12839r.f12962h;
        }
        Float f9 = v6.f12819J;
        if (f9 != null) {
            iL = l(f9.floatValue(), iL);
        }
        ((Canvas) this.f12655a).drawColor(iL);
    }

    public boolean c0() {
        Boolean bool = ((A0) this.f12657c).f12640a.f12812B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public p041e3.h d() {
        String strO = ((String) this.f12655a) == null ? " transportName" : "";
        if (((p041e3.k) this.f12657c) == null) {
            strO = strO.concat(" encodedPayload");
        }
        if (((Long) this.f12658d) == null) {
            strO = p121o0.p.o(strO, " eventMillis");
        }
        if (((Long) this.f12659e) == null) {
            strO = p121o0.p.o(strO, " uptimeMillis");
        }
        if (((HashMap) this.f12660f) == null) {
            strO = p121o0.p.o(strO, " autoMetadata");
        }
        if (strO.isEmpty()) {
            return new p041e3.h((String) this.f12655a, (Integer) this.f12656b, (p041e3.k) this.f12657c, ((Long) this.f12658d).longValue(), ((Long) this.f12659e).longValue(), (HashMap) this.f12660f);
        }
        throw new IllegalStateException("Missing required properties:".concat(strO));
    }

    public Path e(AbstractC1179a0 abstractC1179a0, C1209t c1209t) {
        Path pathJ;
        AbstractC1181b0 abstractC1181b0I = abstractC1179a0.f12869a.I(((A0) this.f12657c).f12640a.f12815E);
        if (abstractC1181b0I == null) {
            s("ClipPath reference '%s' not found", ((A0) this.f12657c).f12640a.f12815E);
            return null;
        }
        C1211v c1211v = (C1211v) abstractC1181b0I;
        ((Stack) this.f12658d).push((A0) this.f12657c);
        this.f12657c = x(c1211v);
        Boolean bool = c1211v.f12955o;
        boolean z6 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z6) {
            matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
            matrix.preScale(c1209t.f12943d, c1209t.f12944e);
        }
        Matrix matrix2 = c1211v.f12654n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (AbstractC1185d0 abstractC1185d0 : c1211v.f12851i) {
            if ((abstractC1185d0 instanceof AbstractC1179a0) && (pathJ = J((AbstractC1179a0) abstractC1185d0, true)) != null) {
                path.op(pathJ, Path.Op.UNION);
            }
        }
        if (((A0) this.f12657c).f12640a.f12815E != null) {
            if (c1211v.f12855h == null) {
                c1211v.f12855h = f(path);
            }
            Path pathE = e(c1211v, c1211v.f12855h);
            if (pathE != null) {
                path.op(pathE, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f12657c = (A0) ((Stack) this.f12658d).pop();
        return path;
    }

    public float g(o0 o0Var) {
        B0 b9 = new B0(this);
        r(o0Var, b9);
        return b9.f12652n;
    }

    public void i(AbstractC1179a0 abstractC1179a0, C1209t c1209t) {
        Path pathE;
        if (((A0) this.f12657c).f12640a.f12815E == null || (pathE = e(abstractC1179a0, c1209t)) == null) {
            return;
        }
        ((Canvas) this.f12655a).clipPath(pathE);
    }

    public void j(AbstractC1179a0 abstractC1179a0) {
        AbstractC1187e0 abstractC1187e0 = ((A0) this.f12657c).f12640a.f12831i;
        if (abstractC1187e0 instanceof K) {
            n(true, abstractC1179a0.f12855h, (K) abstractC1187e0);
        }
        AbstractC1187e0 abstractC1187e1 = ((A0) this.f12657c).f12640a.f12832k;
        if (abstractC1187e1 instanceof K) {
            n(false, abstractC1179a0.f12855h, (K) abstractC1187e1);
        }
    }

    public void n(boolean z6, C1209t c1209t, K k9) {
        float fB;
        float f9;
        float fB2;
        float f10;
        float f11;
        float fB3;
        float fB4;
        float f12;
        float f13;
        int i3;
        AbstractC1181b0 abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(k9.f12773h);
        if (abstractC1181b0I == null) {
            s("%s reference '%s' not found", z6 ? "Fill" : "Stroke", k9.f12773h);
            AbstractC1187e0 abstractC1187e0 = k9.f12774i;
            if (abstractC1187e0 != null) {
                T((A0) this.f12657c, z6, abstractC1187e0);
                return;
            } else if (z6) {
                ((A0) this.f12657c).f12641b = false;
                return;
            } else {
                ((A0) this.f12657c).f12642c = false;
                return;
            }
        }
        boolean z9 = abstractC1181b0I instanceof C1183c0;
        C1212w c1212w = C1212w.f12961i;
        if (z9) {
            C1183c0 c1183c0 = (C1183c0) abstractC1181b0I;
            String str = c1183c0.f12639l;
            if (str != null) {
                u(c1183c0, str);
            }
            Boolean bool = c1183c0.f12637i;
            boolean z10 = bool != null && bool.booleanValue();
            A0 a2 = (A0) this.f12657c;
            Paint paint = z6 ? a2.f12643d : a2.f12644e;
            if (z10) {
                A0 a9 = (A0) this.f12657c;
                f10 = 256.0f;
                C1209t c1209t2 = a9.g;
                if (c1209t2 == null) {
                    c1209t2 = a9.f12645f;
                }
                F f14 = c1183c0.f12863m;
                float fD = f14 != null ? f14.d(this) : 0.0f;
                F f15 = c1183c0.f12864n;
                fB3 = f15 != null ? f15.e(this) : 0.0f;
                f11 = 0.0f;
                F f16 = c1183c0.f12865o;
                float fD2 = f16 != null ? f16.d(this) : c1209t2.f12943d;
                F f17 = c1183c0.f12866p;
                f13 = fD2;
                f12 = fD;
                fB4 = f17 != null ? f17.e(this) : 0.0f;
            } else {
                f10 = 256.0f;
                f11 = 0.0f;
                F f18 = c1183c0.f12863m;
                float fB5 = f18 != null ? f18.b(this, 1.0f) : 0.0f;
                F f19 = c1183c0.f12864n;
                fB3 = f19 != null ? f19.b(this, 1.0f) : 0.0f;
                F f20 = c1183c0.f12865o;
                float fB6 = f20 != null ? f20.b(this, 1.0f) : 1.0f;
                F f21 = c1183c0.f12866p;
                fB4 = f21 != null ? f21.b(this, 1.0f) : 0.0f;
                f12 = fB5;
                f13 = fB6;
            }
            float f22 = fB3;
            W();
            this.f12657c = x(c1183c0);
            Matrix matrix = new Matrix();
            if (!z10) {
                matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
                matrix.preScale(c1209t.f12943d, c1209t.f12944e);
            }
            Matrix matrix2 = c1183c0.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c1183c0.f12636h.size();
            if (size == 0) {
                V();
                if (z6) {
                    ((A0) this.f12657c).f12641b = false;
                    return;
                } else {
                    ((A0) this.f12657c).f12642c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = c1183c0.f12636h.iterator();
            int i9 = 0;
            float f23 = -1.0f;
            while (it.hasNext()) {
                U u6 = (U) ((AbstractC1185d0) it.next());
                Float f24 = u6.f12810h;
                float fFloatValue = f24 != null ? f24.floatValue() : f11;
                if (i9 == 0 || fFloatValue >= f23) {
                    fArr[i9] = fFloatValue;
                    f23 = fFloatValue;
                } else {
                    fArr[i9] = f23;
                }
                W();
                a0(u6, (A0) this.f12657c);
                V v6 = ((A0) this.f12657c).f12640a;
                C1212w c1212w2 = (C1212w) v6.f12813C;
                if (c1212w2 == null) {
                    c1212w2 = c1212w;
                }
                iArr[i9] = l(v6.f12814D.floatValue(), c1212w2.f12962h);
                i9++;
                V();
            }
            if ((f12 == f13 && f22 == fB4) || size == 1) {
                V();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            int i10 = c1183c0.f12638k;
            if (i10 != 0) {
                if (i10 == 2) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (i10 == 3) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            V();
            LinearGradient linearGradient = new LinearGradient(f12, f22, f13, fB4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((A0) this.f12657c).f12640a.j.floatValue() * f10);
            if (iFloatValue < 0) {
                i3 = 0;
            } else {
                i3 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i3);
            return;
        }
        if (!(abstractC1181b0I instanceof C1191g0)) {
            if (abstractC1181b0I instanceof T) {
                T t9 = (T) abstractC1181b0I;
                if (z6) {
                    if (D(t9.f12861e, 2147483648L)) {
                        A0 a10 = (A0) this.f12657c;
                        V v9 = a10.f12640a;
                        AbstractC1187e0 abstractC1187e1 = t9.f12861e.f12817G;
                        v9.f12831i = abstractC1187e1;
                        a10.f12641b = abstractC1187e1 != null;
                    }
                    if (D(t9.f12861e, 4294967296L)) {
                        ((A0) this.f12657c).f12640a.j = t9.f12861e.H;
                    }
                    if (D(t9.f12861e, 6442450944L)) {
                        A0 a11 = (A0) this.f12657c;
                        T(a11, z6, a11.f12640a.f12831i);
                        return;
                    }
                    return;
                }
                if (D(t9.f12861e, 2147483648L)) {
                    A0 a12 = (A0) this.f12657c;
                    V v10 = a12.f12640a;
                    AbstractC1187e0 abstractC1187e2 = t9.f12861e.f12817G;
                    v10.f12832k = abstractC1187e2;
                    a12.f12642c = abstractC1187e2 != null;
                }
                if (D(t9.f12861e, 4294967296L)) {
                    ((A0) this.f12657c).f12640a.f12833l = t9.f12861e.H;
                }
                if (D(t9.f12861e, 6442450944L)) {
                    A0 a13 = (A0) this.f12657c;
                    T(a13, z6, a13.f12640a.f12832k);
                    return;
                }
                return;
            }
            return;
        }
        C1191g0 c1191g0 = (C1191g0) abstractC1181b0I;
        String str2 = c1191g0.f12639l;
        if (str2 != null) {
            u(c1191g0, str2);
        }
        Boolean bool2 = c1191g0.f12637i;
        boolean z11 = bool2 != null && bool2.booleanValue();
        A0 a14 = (A0) this.f12657c;
        Paint paint2 = z6 ? a14.f12643d : a14.f12644e;
        if (z11) {
            F f25 = new F(50.0f, 9);
            F f26 = c1191g0.f12878m;
            float fD3 = f26 != null ? f26.d(this) : f25.d(this);
            F f27 = c1191g0.f12879n;
            fB = f27 != null ? f27.e(this) : f25.e(this);
            F f28 = c1191g0.f12880o;
            fB2 = f28 != null ? f28.a(this) : f25.a(this);
            f9 = fD3;
        } else {
            F f29 = c1191g0.f12878m;
            float fB7 = f29 != null ? f29.b(this, 1.0f) : 0.5f;
            F f30 = c1191g0.f12879n;
            fB = f30 != null ? f30.b(this, 1.0f) : 0.5f;
            F f31 = c1191g0.f12880o;
            f9 = fB7;
            fB2 = f31 != null ? f31.b(this, 1.0f) : 0.5f;
        }
        float f32 = fB;
        W();
        this.f12657c = x(c1191g0);
        Matrix matrix3 = new Matrix();
        if (!z11) {
            matrix3.preTranslate(c1209t.f12941b, c1209t.f12942c);
            matrix3.preScale(c1209t.f12943d, c1209t.f12944e);
        }
        Matrix matrix4 = c1191g0.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c1191g0.f12636h.size();
        if (size2 == 0) {
            V();
            if (z6) {
                ((A0) this.f12657c).f12641b = false;
                return;
            } else {
                ((A0) this.f12657c).f12642c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = c1191g0.f12636h.iterator();
        int i11 = 0;
        float f33 = -1.0f;
        while (it2.hasNext()) {
            U u7 = (U) ((AbstractC1185d0) it2.next());
            Float f34 = u7.f12810h;
            float fFloatValue2 = f34 != null ? f34.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue2 >= f33) {
                fArr2[i11] = fFloatValue2;
                f33 = fFloatValue2;
            } else {
                fArr2[i11] = f33;
            }
            W();
            a0(u7, (A0) this.f12657c);
            V v11 = ((A0) this.f12657c).f12640a;
            C1212w c1212w3 = (C1212w) v11.f12813C;
            if (c1212w3 == null) {
                c1212w3 = c1212w;
            }
            iArr2[i11] = l(v11.f12814D.floatValue(), c1212w3.f12962h);
            i11++;
            V();
        }
        if (fB2 == 0.0f || size2 == 1) {
            V();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        int i12 = c1191g0.f12638k;
        if (i12 != 0) {
            if (i12 == 2) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (i12 == 3) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        V();
        RadialGradient radialGradient = new RadialGradient(f9, f32, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((A0) this.f12657c).f12640a.j.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public boolean o() {
        Boolean bool = ((A0) this.f12657c).f12640a.f12811A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public void p(AbstractC1179a0 abstractC1179a0, Path path) {
        char c9;
        float fD;
        float fE;
        float fE2;
        float fD2;
        char c10;
        AbstractC1187e0 abstractC1187e0 = ((A0) this.f12657c).f12640a.f12831i;
        boolean z6 = abstractC1187e0 instanceof K;
        Canvas canvas = (Canvas) this.f12655a;
        if (z6) {
            AbstractC1181b0 abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(((K) abstractC1187e0).f12773h);
            if (abstractC1181b0I instanceof O) {
                O o8 = (O) abstractC1181b0I;
                Boolean bool = o8.f12795p;
                boolean z9 = bool != null && bool.booleanValue();
                String str = o8.f12802w;
                if (str != null) {
                    w(o8, str);
                }
                if (z9) {
                    F f9 = o8.f12798s;
                    fD = f9 != null ? f9.d(this) : 0.0f;
                    F f10 = o8.f12799t;
                    fE2 = f10 != null ? f10.e(this) : 0.0f;
                    F f11 = o8.f12800u;
                    fD2 = f11 != null ? f11.d(this) : 0.0f;
                    F f12 = o8.f12801v;
                    fE = f12 != null ? f12.e(this) : 0.0f;
                    c9 = 0;
                } else {
                    F f13 = o8.f12798s;
                    float fB = f13 != null ? f13.b(this, 1.0f) : 0.0f;
                    F f14 = o8.f12799t;
                    float fB2 = f14 != null ? f14.b(this, 1.0f) : 0.0f;
                    F f15 = o8.f12800u;
                    float fB3 = f15 != null ? f15.b(this, 1.0f) : 0.0f;
                    F f16 = o8.f12801v;
                    float fB4 = f16 != null ? f16.b(this, 1.0f) : 0.0f;
                    C1209t c1209t = abstractC1179a0.f12855h;
                    float f17 = c1209t.f12941b;
                    c9 = 0;
                    float f18 = c1209t.f12943d;
                    fD = (fB * f18) + f17;
                    float f19 = c1209t.f12942c;
                    float f20 = c1209t.f12944e;
                    float f21 = f18 * fB3;
                    fE = fB4 * f20;
                    fE2 = (fB2 * f20) + f19;
                    fD2 = f21;
                }
                if (fD2 == 0.0f || fE == 0.0f) {
                    return;
                }
                C1208s c1208s = o8.f12876n;
                if (c1208s == null) {
                    c1208s = C1208s.f12932d;
                }
                W();
                canvas.clipPath(path);
                A0 a2 = new A0();
                Z(a2, V.a());
                a2.f12640a.f12843v = Boolean.FALSE;
                y(o8, a2);
                this.f12657c = a2;
                C1209t c1209t2 = abstractC1179a0.f12855h;
                Matrix matrix = o8.f12797r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (o8.f12797r.invert(matrix2)) {
                        C1209t c1209t3 = abstractC1179a0.f12855h;
                        float f22 = c1209t3.f12941b;
                        float f23 = c1209t3.f12942c;
                        float fC = c1209t3.c();
                        c10 = 1;
                        C1209t c1209t4 = abstractC1179a0.f12855h;
                        float f24 = c1209t4.f12942c;
                        float fC2 = c1209t4.c();
                        float fD3 = abstractC1179a0.f12855h.d();
                        C1209t c1209t5 = abstractC1179a0.f12855h;
                        float f25 = c1209t5.f12941b;
                        float fD4 = c1209t5.d();
                        float[] fArr = new float[8];
                        fArr[c9] = f22;
                        fArr[1] = f23;
                        fArr[2] = fC;
                        fArr[3] = f24;
                        fArr[4] = fC2;
                        fArr[5] = fD3;
                        fArr[6] = f25;
                        fArr[7] = fD4;
                        matrix2.mapPoints(fArr);
                        float f26 = fArr[c9];
                        float f27 = fArr[1];
                        RectF rectF = new RectF(f26, f27, f26, f27);
                        for (int i3 = 2; i3 <= 6; i3 += 2) {
                            float f28 = fArr[i3];
                            if (f28 < rectF.left) {
                                rectF.left = f28;
                            }
                            if (f28 > rectF.right) {
                                rectF.right = f28;
                            }
                            float f29 = fArr[i3 + 1];
                            if (f29 < rectF.top) {
                                rectF.top = f29;
                            }
                            if (f29 > rectF.bottom) {
                                rectF.bottom = f29;
                            }
                        }
                        float f30 = rectF.left;
                        float f31 = rectF.top;
                        c1209t2 = new C1209t(f30, f31, rectF.right - f30, rectF.bottom - f31);
                    } else {
                        c10 = 1;
                    }
                } else {
                    c10 = 1;
                }
                float fFloor = (((float) Math.floor((c1209t2.f12941b - fD) / fD2)) * fD2) + fD;
                float fC3 = c1209t2.c();
                float fD5 = c1209t2.d();
                C1209t c1209t6 = new C1209t(0.0f, 0.0f, fD2, fE);
                boolean zL = L();
                for (float fFloor2 = (((float) Math.floor((c1209t2.f12942c - fE2) / fE)) * fE) + fE2; fFloor2 < fD5; fFloor2 += fE) {
                    float f32 = fFloor;
                    while (f32 < fC3) {
                        c1209t6.f12941b = f32;
                        c1209t6.f12942c = fFloor2;
                        W();
                        if (!((A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                            S(c1209t6.f12941b, c1209t6.f12942c, c1209t6.f12943d, c1209t6.f12944e);
                        }
                        C1209t c1209t7 = o8.f12888o;
                        if (c1209t7 != null) {
                            canvas.concat(h(c1209t6, c1209t7, c1208s));
                        } else {
                            Boolean bool2 = o8.f12796q;
                            char c11 = (bool2 == null || bool2.booleanValue()) ? c10 : c9;
                            canvas.translate(f32, fFloor2);
                            if (c11 == 0) {
                                C1209t c1209t8 = abstractC1179a0.f12855h;
                                canvas.scale(c1209t8.f12943d, c1209t8.f12944e);
                            }
                        }
                        Iterator it = o8.f12851i.iterator();
                        while (it.hasNext()) {
                            N((AbstractC1185d0) it.next());
                        }
                        V();
                        f32 += fD2;
                        fD5 = fD5;
                        fFloor = fFloor;
                    }
                }
                if (zL) {
                    K(o8.f12855h);
                }
                V();
                return;
            }
        }
        canvas.drawPath(path, ((A0) this.f12657c).f12643d);
    }

    public void q(Path path) {
        A0 a2 = (A0) this.f12657c;
        int i3 = a2.f12640a.f12828S;
        Canvas canvas = (Canvas) this.f12655a;
        if (i3 != 2) {
            canvas.drawPath(path, a2.f12644e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = ((A0) this.f12657c).f12644e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((A0) this.f12657c).f12644e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void r(o0 o0Var, R8.i iVar) {
        float f9;
        float fE;
        float fD;
        int iZ;
        if (o()) {
            Iterator it = o0Var.f12851i.iterator();
            boolean z6 = true;
            while (it.hasNext()) {
                AbstractC1185d0 abstractC1185d0 = (AbstractC1185d0) it.next();
                if (abstractC1185d0 instanceof r0) {
                    iVar.A(X(((r0) abstractC1185d0).f12930c, z6, !it.hasNext()));
                } else if (iVar.n((o0) abstractC1185d0)) {
                    float fE2 = 0.0f;
                    if (abstractC1185d0 instanceof p0) {
                        W();
                        p0 p0Var = (p0) abstractC1185d0;
                        a0(p0Var, (A0) this.f12657c);
                        if (o() && c0()) {
                            AbstractC1181b0 abstractC1181b0I = p0Var.f12869a.I(p0Var.f12910n);
                            if (abstractC1181b0I == null) {
                                s("TextPath reference '%s' not found", p0Var.f12910n);
                            } else {
                                L l2 = (L) abstractC1181b0I;
                                Path path = new w0(l2.f12780o).f12963a;
                                Matrix matrix = l2.f12651n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                F f10 = p0Var.f12911o;
                                fE2 = f10 != null ? f10.b(this, pathMeasure.getLength()) : 0.0f;
                                int iZ2 = z();
                                if (iZ2 != 1) {
                                    float fG = g(p0Var);
                                    if (iZ2 == 2) {
                                        fG /= 2.0f;
                                    }
                                    fE2 -= fG;
                                }
                                j(p0Var.f12912p);
                                boolean zL = L();
                                r(p0Var, new x0(this, path, fE2));
                                if (zL) {
                                    K(p0Var.f12855h);
                                }
                            }
                        }
                        V();
                    } else if (abstractC1185d0 instanceof C1201l0) {
                        W();
                        C1201l0 c1201l0 = (C1201l0) abstractC1185d0;
                        a0(c1201l0, (A0) this.f12657c);
                        if (o()) {
                            ArrayList arrayList = c1201l0.f12916n;
                            boolean z9 = arrayList != null && arrayList.size() > 0;
                            boolean z10 = iVar instanceof y0;
                            if (z10) {
                                float fD2 = !z9 ? ((y0) iVar).f12969n : ((F) c1201l0.f12916n.get(0)).d(this);
                                ArrayList arrayList2 = c1201l0.f12917o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((y0) iVar).f12970o : ((F) c1201l0.f12917o.get(0)).e(this);
                                ArrayList arrayList3 = c1201l0.f12918p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((F) c1201l0.f12918p.get(0)).d(this);
                                ArrayList arrayList4 = c1201l0.f12919q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((F) c1201l0.f12919q.get(0)).e(this);
                                }
                                float f11 = fD2;
                                f9 = fE2;
                                fE2 = f11;
                            } else {
                                f9 = 0.0f;
                                fE = 0.0f;
                                fD = 0.0f;
                            }
                            if (z9 && (iZ = z()) != 1) {
                                float fG2 = g(c1201l0);
                                if (iZ == 2) {
                                    fG2 /= 2.0f;
                                }
                                fE2 -= fG2;
                            }
                            j(c1201l0.f12898r);
                            if (z10) {
                                y0 y0Var = (y0) iVar;
                                y0Var.f12969n = fE2 + fD;
                                y0Var.f12970o = fE + f9;
                            }
                            boolean zL2 = L();
                            r(c1201l0, iVar);
                            if (zL2) {
                                K(c1201l0.f12855h);
                            }
                        }
                        V();
                    } else if (abstractC1185d0 instanceof C1199k0) {
                        W();
                        C1199k0 c1199k0 = (C1199k0) abstractC1185d0;
                        a0(c1199k0, (A0) this.f12657c);
                        if (o()) {
                            j(c1199k0.f12894o);
                            AbstractC1181b0 abstractC1181b0I2 = abstractC1185d0.f12869a.I(c1199k0.f12893n);
                            if (abstractC1181b0I2 == null || !(abstractC1181b0I2 instanceof o0)) {
                                s("Tref reference '%s' not found", c1199k0.f12893n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                t((o0) abstractC1181b0I2, sb);
                                if (sb.length() > 0) {
                                    iVar.A(sb.toString());
                                }
                            }
                        }
                        V();
                    }
                }
                z6 = false;
            }
        }
    }

    public void t(o0 o0Var, StringBuilder sb) {
        Iterator it = o0Var.f12851i.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            AbstractC1185d0 abstractC1185d0 = (AbstractC1185d0) it.next();
            if (abstractC1185d0 instanceof o0) {
                t((o0) abstractC1185d0, sb);
            } else if (abstractC1185d0 instanceof r0) {
                sb.append(X(((r0) abstractC1185d0).f12930c, z6, !it.hasNext()));
            }
            z6 = false;
        }
    }

    public A0 x(AbstractC1181b0 abstractC1181b0) {
        A0 a2 = new A0();
        Z(a2, V.a());
        y(abstractC1181b0, a2);
        return a2;
    }

    public void y(AbstractC1181b0 abstractC1181b0, A0 a2) {
        ArrayList arrayList = new ArrayList();
        AbstractC1185d0 abstractC1185d0 = abstractC1181b0;
        while (true) {
            if (abstractC1185d0 instanceof AbstractC1181b0) {
                arrayList.add(0, (AbstractC1181b0) abstractC1185d0);
            }
            Object obj = abstractC1185d0.f12870b;
            if (obj == null) {
                break;
            } else {
                abstractC1185d0 = (AbstractC1185d0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0((AbstractC1181b0) it.next(), a2);
        }
        A0 a9 = (A0) this.f12657c;
        a2.g = a9.g;
        a2.f12645f = a9.f12645f;
    }

    public int z() {
        int i3;
        V v6 = ((A0) this.f12657c).f12640a;
        if (v6.f12825P == 1 || (i3 = v6.f12826Q) == 2) {
            return v6.f12826Q;
        }
        return i3 == 1 ? 3 : 1;
    }
}

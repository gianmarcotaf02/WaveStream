package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class C0 {
    public static java.util.HashSet g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f12655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.Object f12656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.Object f12657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f12658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f12659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f12660f;

    public static android.graphics.drawable.LayerDrawable B(p103m.I0 i3, android.content.Context context, int i9) {
        android.graphics.drawable.BitmapDrawable bitmapDrawable;
        android.graphics.drawable.BitmapDrawable bitmapDrawable2;
        android.graphics.drawable.BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
        android.graphics.drawable.Drawable drawableC = i3.c(context, com.kiptv.tv.R.drawable.abc_star_black_48dp);
        android.graphics.drawable.Drawable drawableC2 = i3.c(context, com.kiptv.tv.R.drawable.abc_star_half_black_48dp);
        if ((drawableC instanceof android.graphics.drawable.BitmapDrawable) && drawableC.getIntrinsicWidth() == dimensionPixelSize && drawableC.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (android.graphics.drawable.BitmapDrawable) drawableC;
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
            drawableC.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC.draw(canvas);
            bitmapDrawable = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(android.graphics.Shader.TileMode.REPEAT);
        if ((drawableC2 instanceof android.graphics.drawable.BitmapDrawable) && drawableC2.getIntrinsicWidth() == dimensionPixelSize && drawableC2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (android.graphics.drawable.BitmapDrawable) drawableC2;
        } else {
            android.graphics.Bitmap bitmapCreateBitmap2 = android.graphics.Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, android.graphics.Bitmap.Config.ARGB_8888);
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(bitmapCreateBitmap2);
            drawableC2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableC2.draw(canvas2);
            bitmapDrawable3 = new android.graphics.drawable.BitmapDrawable(bitmapCreateBitmap2);
        }
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean D(Z2.V v6, long j) {
        return (v6.f12830h & j) != 0;
    }

    public static android.graphics.Path G(Z2.P p2) {
        android.graphics.Path path = new android.graphics.Path();
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
        if (p2 instanceof Z2.Q) {
            path.close();
        }
        if (p2.f12855h == null) {
            p2.f12855h = f(path);
        }
        return path;
    }

    public static void T(Z2.A0 a2, boolean z6, Z2.AbstractC1187e0 abstractC1187e0) {
        int i3;
        Z2.V v6 = a2.f12640a;
        float fFloatValue = (z6 ? v6.j : v6.f12833l).floatValue();
        if (abstractC1187e0 instanceof Z2.C1212w) {
            i3 = ((Z2.C1212w) abstractC1187e0).f12962h;
        } else if (!(abstractC1187e0 instanceof Z2.C1213x)) {
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

    public static void U(android.graphics.drawable.Drawable drawable, int i3, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilterE;
        android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = p103m.r.f25107b;
        }
        android.graphics.PorterDuff.Mode mode2 = p103m.r.f25107b;
        synchronized (p103m.r.class) {
            porterDuffColorFilterE = p103m.I0.e(i3, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterE);
    }

    public static void a(float f9, float f10, float f11, float f12, float f13, boolean z6, boolean z9, float f14, float f15, Z2.N n3) {
        if (f9 == f14 && f10 == f15) {
            return;
        }
        if (f11 == 0.0f || f12 == 0.0f) {
            n3.e(f14, f15);
            return;
        }
        float fAbs = java.lang.Math.abs(f11);
        float fAbs2 = java.lang.Math.abs(f12);
        double radians = java.lang.Math.toRadians(((double) f13) % 360.0d);
        double dCos = java.lang.Math.cos(radians);
        double dSin = java.lang.Math.sin(radians);
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
            double dSqrt = java.lang.Math.sqrt(d15) * 1.00001d;
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
        double dSqrt2 = java.lang.Math.sqrt(d20) * d16;
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
        double dAcos = java.lang.Math.acos(d27 / java.lang.Math.sqrt(d31)) * (d28 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = java.lang.Math.sqrt(((d30 * d30) + (d29 * d29)) * d31);
        double d32 = (d28 * d30) + (d27 * d29);
        double d33 = d32 / dSqrt3;
        double dAcos2 = ((d27 * d30) - (d28 * d29) < 0.0d ? -1.0d : 1.0d) * (d33 < -1.0d ? 3.141592653589793d : d33 > 1.0d ? 0.0d : java.lang.Math.acos(d33));
        if (!z9 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z9 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d34 = dAcos2 % 6.283185307179586d;
        double d35 = dAcos % 6.283185307179586d;
        int iCeil = (int) java.lang.Math.ceil((java.lang.Math.abs(d34) * 2.0d) / 3.141592653589793d);
        double d36 = d34 / ((double) iCeil);
        double d37 = d36 / 2.0d;
        double dSin2 = (java.lang.Math.sin(d37) * 1.3333333333333333d) / (java.lang.Math.cos(d37) + 1.0d);
        int i3 = iCeil * 6;
        float[] fArr = new float[i3];
        int i9 = 0;
        int i10 = 0;
        while (i9 < iCeil) {
            double d38 = d35;
            double d39 = (((double) i9) * d36) + d38;
            double dCos2 = java.lang.Math.cos(d39);
            double dSin3 = java.lang.Math.sin(d39);
            int i11 = i9;
            int i12 = i10;
            fArr[i12] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i10 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d40 = d39 + d36;
            double dCos3 = java.lang.Math.cos(d40);
            double dSin4 = java.lang.Math.sin(d40);
            fArr[i12 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i12 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i12 + 4] = (float) dCos3;
            i10 = i12 + 6;
            fArr[i12 + 5] = (float) dSin4;
            i9 = i11 + 1;
            d35 = d38;
            iCeil = iCeil;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
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

    public static Z2.C1209t f(android.graphics.Path path) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, true);
        return new Z2.C1209t(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 != 9) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static android.graphics.Matrix h(Z2.C1209t c1209t, Z2.C1209t c1209t2, Z2.C1208s c1208s) {
        Z2.r rVar;
        float f9;
        float f10;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (c1208s != null && (rVar = c1208s.f12933a) != null) {
            float f11 = c1209t.f12943d / c1209t2.f12943d;
            float f12 = c1209t.f12944e / c1209t2.f12944e;
            float f13 = -c1209t2.f12941b;
            float f14 = -c1209t2.f12942c;
            if (c1208s.equals(Z2.C1208s.f12931c)) {
                matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
                matrix.preScale(f11, f12);
                matrix.preTranslate(f13, f14);
                return matrix;
            }
            float fMax = c1208s.f12934b == 2 ? java.lang.Math.max(f11, f12) : java.lang.Math.min(f11, f12);
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

    public static android.graphics.Typeface k(java.lang.String str, int i3, java.lang.Integer num) {
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
                return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i9);
            case "monospace":
                return android.graphics.Typeface.create(android.graphics.Typeface.MONOSPACE, i9);
            case "fantasy":
                return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i9);
            case "serif":
                return android.graphics.Typeface.create(android.graphics.Typeface.SERIF, i9);
            case "cursive":
                return android.graphics.Typeface.create(android.graphics.Typeface.SANS_SERIF, i9);
            default:
                return null;
        }
    }

    public static int l(float f9, int i3) {
        int i9 = 255;
        int iRound = java.lang.Math.round(((i3 >> 24) & 255) * f9);
        if (iRound < 0) {
            i9 = 0;
        } else if (iRound <= 255) {
            i9 = iRound;
        }
        return (i9 << 24) | (i3 & 16777215);
    }

    public static android.content.res.ColorStateList m(android.content.Context context, int i3) {
        int iC = p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlHighlight);
        int iB = p103m.N0.b(context, com.kiptv.tv.R.attr.colorButtonNormal);
        int[] iArr = p103m.N0.f24944b;
        int[] iArr2 = p103m.N0.f24946d;
        int iC2 = p182w1.a.c(iC, i3);
        return new android.content.res.ColorStateList(new int[][]{iArr, iArr2, p103m.N0.f24945c, p103m.N0.f24948f}, new int[]{iB, iC2, p182w1.a.c(iC, i3), i3});
    }

    public static void s(java.lang.String str, java.lang.Object... objArr) {
        android.util.Log.e("SVGAndroidRenderer", java.lang.String.format(str, objArr));
    }

    public static void u(Z2.A a2, java.lang.String str) {
        Z2.AbstractC1181b0 abstractC1181b0I = a2.f12869a.I(str);
        if (abstractC1181b0I == null) {
            android.util.Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(abstractC1181b0I instanceof Z2.A)) {
            s("Gradient href attributes must point to other gradient elements", new java.lang.Object[0]);
            return;
        }
        if (abstractC1181b0I == a2) {
            s("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        Z2.A a9 = (Z2.A) abstractC1181b0I;
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
            if (a2 instanceof Z2.C1183c0) {
                Z2.C1183c0 c1183c0 = (Z2.C1183c0) a2;
                Z2.C1183c0 c1183c1 = (Z2.C1183c0) abstractC1181b0I;
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
                v((Z2.C1191g0) a2, (Z2.C1191g0) abstractC1181b0I);
            }
        } catch (java.lang.ClassCastException unused) {
        }
        java.lang.String str2 = a9.f12639l;
        if (str2 != null) {
            u(a2, str2);
        }
    }

    public static void v(Z2.C1191g0 c1191g0, Z2.C1191g0 c1191g1) {
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

    public static void w(Z2.O o8, java.lang.String str) {
        Z2.AbstractC1181b0 abstractC1181b0I = o8.f12869a.I(str);
        if (abstractC1181b0I == null) {
            android.util.Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(abstractC1181b0I instanceof Z2.O)) {
            s("Pattern href attributes must point to other pattern elements", new java.lang.Object[0]);
            return;
        }
        if (abstractC1181b0I == o8) {
            s("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        Z2.O o9 = (Z2.O) abstractC1181b0I;
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
        java.lang.String str2 = o9.f12802w;
        if (str2 != null) {
            w(o8, str2);
        }
    }

    public android.graphics.Path.FillType A() {
        int i3 = ((Z2.A0) this.f12657c).f12640a.f12827R;
        return (i3 == 0 || i3 != 2) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD;
    }

    public android.content.res.ColorStateList C(android.content.Context context, int i3) {
        if (i3 == com.kiptv.tv.R.drawable.abc_edit_text_material) {
            return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_edittext);
        }
        if (i3 == 2131230786) {
            return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_switch_track);
        }
        if (i3 != com.kiptv.tv.R.drawable.abc_switch_thumb_material) {
            if (i3 == com.kiptv.tv.R.drawable.abc_btn_default_mtrl_shape) {
                return m(context, p103m.N0.c(context, com.kiptv.tv.R.attr.colorButtonNormal));
            }
            if (i3 == com.kiptv.tv.R.drawable.abc_btn_borderless_material) {
                return m(context, 0);
            }
            if (i3 == com.kiptv.tv.R.drawable.abc_btn_colored_material) {
                return m(context, p103m.N0.c(context, com.kiptv.tv.R.attr.colorAccent));
            }
            if (i3 == 2131230781 || i3 == com.kiptv.tv.R.drawable.abc_spinner_textfield_background_material) {
                return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_spinner);
            }
            if (c((int[]) this.f12656b, i3)) {
                return p103m.N0.d(context, com.kiptv.tv.R.attr.colorControlNormal);
            }
            if (c((int[]) this.f12659e, i3)) {
                return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_default);
            }
            if (c((int[]) this.f12660f, i3)) {
                return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_btn_checkable);
            }
            if (i3 == com.kiptv.tv.R.drawable.abc_seekbar_thumb_material) {
                return com.google.common.util.concurrent.AbstractC1903s.x(context, com.kiptv.tv.R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        android.content.res.ColorStateList colorStateListD = p103m.N0.d(context, com.kiptv.tv.R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = p103m.N0.f24944b;
            iArr2[0] = p103m.N0.b(context, com.kiptv.tv.R.attr.colorSwitchThumbNormal);
            iArr[1] = p103m.N0.f24947e;
            iArr2[1] = p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlActivated);
            iArr[2] = p103m.N0.f24948f;
            iArr2[2] = p103m.N0.c(context, com.kiptv.tv.R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = p103m.N0.f24944b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = p103m.N0.f24947e;
            iArr2[1] = p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlActivated);
            iArr[2] = p103m.N0.f24948f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public android.graphics.Path E(Z2.C1210u c1210u) {
        Z2.F f9 = c1210u.f12945o;
        float fD = f9 != null ? f9.d(this) : 0.0f;
        Z2.F f10 = c1210u.f12946p;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        float fA = c1210u.f12947q.a(this);
        float f11 = fD - fA;
        float f12 = fE - fA;
        float f13 = fD + fA;
        float f14 = fE + fA;
        if (c1210u.f12855h == null) {
            float f15 = 2.0f * fA;
            c1210u.f12855h = new Z2.C1209t(f11, f12, f15, f15);
        }
        float f16 = fA * 0.5522848f;
        android.graphics.Path path = new android.graphics.Path();
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

    public android.graphics.Path F(Z2.C1215z c1215z) {
        Z2.F f9 = c1215z.f12972o;
        float fD = f9 != null ? f9.d(this) : 0.0f;
        Z2.F f10 = c1215z.f12973p;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        float fD2 = c1215z.f12974q.d(this);
        float fE2 = c1215z.f12975r.e(this);
        float f11 = fD - fD2;
        float f12 = fE - fE2;
        float f13 = fD + fD2;
        float f14 = fE + fE2;
        if (c1215z.f12855h == null) {
            c1215z.f12855h = new Z2.C1209t(f11, f12, fD2 * 2.0f, 2.0f * fE2);
        }
        float f15 = fD2 * 0.5522848f;
        float f16 = fE2 * 0.5522848f;
        android.graphics.Path path = new android.graphics.Path();
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

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:24:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    public android.graphics.Path H(Z2.S s9) {
        float fD;
        float fE;
        float fMin;
        Z2.F f9;
        float fD2;
        Z2.F f10;
        float fE2;
        float fD3;
        float fE3;
        float f11;
        float f12;
        android.graphics.Path path;
        Z2.F f13 = s9.f12808s;
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
                fMin = java.lang.Math.min(fD, s9.f12806q.d(this) / 2.0f);
                float fMin2 = java.lang.Math.min(fE, s9.f12807r.e(this) / 2.0f);
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
                    s9.f12855h = new Z2.C1209t(fD2, fE2, fD3, fE3);
                }
                f11 = fD3 + fD2;
                f12 = fE2 + fE3;
                path = new android.graphics.Path();
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
        fMin = java.lang.Math.min(fD, s9.f12806q.d(this) / 2.0f);
        float fMin3 = java.lang.Math.min(fE, s9.f12807r.e(this) / 2.0f);
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
            s9.f12855h = new Z2.C1209t(fD2, fE2, fD3, fE3);
        }
        f11 = fD3 + fD2;
        f12 = fE2 + fE3;
        path = new android.graphics.Path();
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

    public Z2.C1209t I(Z2.F f9, Z2.F f10, Z2.F f11, Z2.F f12) {
        float fD = f9 != null ? f9.d(this) : 0.0f;
        float fE = f10 != null ? f10.e(this) : 0.0f;
        Z2.A0 a2 = (Z2.A0) this.f12657c;
        Z2.C1209t c1209t = a2.g;
        if (c1209t == null) {
            c1209t = a2.f12645f;
        }
        return new Z2.C1209t(fD, fE, f11 != null ? f11.d(this) : c1209t.f12943d, f12 != null ? f12.e(this) : c1209t.f12944e);
    }

    public android.graphics.Path J(Z2.AbstractC1179a0 abstractC1179a0, boolean z6) {
        android.graphics.Path pathG;
        android.graphics.Path pathE;
        ((java.util.Stack) this.f12658d).push((Z2.A0) this.f12657c);
        Z2.A0 a2 = new Z2.A0((Z2.A0) this.f12657c);
        this.f12657c = a2;
        a0(abstractC1179a0, a2);
        if (!o() || !c0()) {
            this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
            return null;
        }
        if (abstractC1179a0 instanceof Z2.s0) {
            if (!z6) {
                s("<use> elements inside a <clipPath> cannot reference another <use>", new java.lang.Object[0]);
            }
            Z2.s0 s0Var = (Z2.s0) abstractC1179a0;
            Z2.AbstractC1181b0 abstractC1181b0I = abstractC1179a0.f12869a.I(s0Var.f12935o);
            if (abstractC1181b0I == null) {
                s("Use reference '%s' not found", s0Var.f12935o);
                this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
                return null;
            }
            if (!(abstractC1181b0I instanceof Z2.AbstractC1179a0)) {
                this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
                return null;
            }
            pathG = J((Z2.AbstractC1179a0) abstractC1181b0I, false);
            if (pathG != null) {
                if (s0Var.f12855h == null) {
                    s0Var.f12855h = f(pathG);
                }
                android.graphics.Matrix matrix = s0Var.f12654n;
                if (matrix != null) {
                    pathG.transform(matrix);
                }
                if (((Z2.A0) this.f12657c).f12640a.f12815E != null && (pathE = e(abstractC1179a0, abstractC1179a0.f12855h)) != null) {
                    pathG.op(pathE, android.graphics.Path.Op.INTERSECT);
                }
                this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
                return pathG;
            }
            return null;
        }
        if (abstractC1179a0 instanceof Z2.B) {
            Z2.B b9 = (Z2.B) abstractC1179a0;
            if (abstractC1179a0 instanceof Z2.L) {
                pathG = new Z2.w0(((Z2.L) abstractC1179a0).f12780o).f12963a;
                if (abstractC1179a0.f12855h == null) {
                    abstractC1179a0.f12855h = f(pathG);
                }
            } else if (abstractC1179a0 instanceof Z2.S) {
                pathG = H((Z2.S) abstractC1179a0);
            } else if (abstractC1179a0 instanceof Z2.C1210u) {
                pathG = E((Z2.C1210u) abstractC1179a0);
            } else if (abstractC1179a0 instanceof Z2.C1215z) {
                pathG = F((Z2.C1215z) abstractC1179a0);
            } else {
                pathG = abstractC1179a0 instanceof Z2.P ? G((Z2.P) abstractC1179a0) : null;
            }
            if (pathG != null) {
                if (b9.f12855h == null) {
                    b9.f12855h = f(pathG);
                }
                android.graphics.Matrix matrix2 = b9.f12651n;
                if (matrix2 != null) {
                    pathG.transform(matrix2);
                }
                pathG.setFillType(A());
            }
            return null;
        }
        if (!(abstractC1179a0 instanceof Z2.C1203m0)) {
            s("Invalid %s element found in clipPath definition", abstractC1179a0.o());
            return null;
        }
        Z2.C1203m0 c1203m0 = (Z2.C1203m0) abstractC1179a0;
        java.util.ArrayList arrayList = c1203m0.f12916n;
        float fE = 0.0f;
        float fD = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12916n.get(0)).d(this);
        java.util.ArrayList arrayList2 = c1203m0.f12917o;
        float fE2 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12917o.get(0)).e(this);
        java.util.ArrayList arrayList3 = c1203m0.f12918p;
        float fD2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12918p.get(0)).d(this);
        java.util.ArrayList arrayList4 = c1203m0.f12919q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            fE = ((Z2.F) c1203m0.f12919q.get(0)).e(this);
        }
        if (((Z2.A0) this.f12657c).f12640a.f12826Q != 1) {
            float fG = g(c1203m0);
            if (((Z2.A0) this.f12657c).f12640a.f12826Q == 2) {
                fG /= 2.0f;
            }
            fD -= fG;
        }
        if (c1203m0.f12855h == null) {
            Z2.z0 z0Var = new Z2.z0(this, fD, fE2);
            r(c1203m0, z0Var);
            android.graphics.RectF rectF = (android.graphics.RectF) z0Var.f12980r;
            c1203m0.f12855h = new Z2.C1209t(rectF.left, rectF.top, rectF.width(), ((android.graphics.RectF) z0Var.f12980r).height());
        }
        android.graphics.Path path = new android.graphics.Path();
        r(c1203m0, new Z2.z0(this, fD + fD2, fE2 + fE, path));
        android.graphics.Matrix matrix3 = c1203m0.f12901r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        path.setFillType(A());
        pathG = path;
        if (((Z2.A0) this.f12657c).f12640a.f12815E != null) {
            pathG.op(pathE, android.graphics.Path.Op.INTERSECT);
        }
        this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
        return pathG;
    }

    public void K(Z2.C1209t c1209t) {
        if (((Z2.A0) this.f12657c).f12640a.f12816F != null) {
            android.graphics.Paint paint = new android.graphics.Paint();
            android.graphics.PorterDuff.Mode mode = android.graphics.PorterDuff.Mode.DST_IN;
            paint.setXfermode(new android.graphics.PorterDuffXfermode(mode));
            android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
            canvas.saveLayer(null, paint, 31);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColorFilter(new android.graphics.ColorMatrixColorFilter(new android.graphics.ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            Z2.I i3 = (Z2.I) ((android.support.v4.media.session.q) this.f12656b).I(((Z2.A0) this.f12657c).f12640a.f12816F);
            R(i3, c1209t);
            canvas.restore();
            android.graphics.Paint paint3 = new android.graphics.Paint();
            paint3.setXfermode(new android.graphics.PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            R(i3, c1209t);
            canvas.restore();
            canvas.restore();
        }
        V();
    }

    public boolean L() {
        Z2.AbstractC1181b0 abstractC1181b0I;
        int i3 = 0;
        if (((Z2.A0) this.f12657c).f12640a.f12838q.floatValue() >= 1.0f && ((Z2.A0) this.f12657c).f12640a.f12816F == null) {
            return false;
        }
        int iFloatValue = (int) (((Z2.A0) this.f12657c).f12640a.f12838q.floatValue() * 256.0f);
        if (iFloatValue >= 0) {
            i3 = 255;
            if (iFloatValue <= 255) {
                i3 = iFloatValue;
            }
        }
        ((android.graphics.Canvas) this.f12655a).saveLayerAlpha(null, i3, 31);
        ((java.util.Stack) this.f12658d).push((Z2.A0) this.f12657c);
        Z2.A0 a2 = new Z2.A0((Z2.A0) this.f12657c);
        this.f12657c = a2;
        java.lang.String str = a2.f12640a.f12816F;
        if (str != null && ((abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(str)) == null || !(abstractC1181b0I instanceof Z2.I))) {
            s("Mask reference '%s' not found", ((Z2.A0) this.f12657c).f12640a.f12816F);
            ((Z2.A0) this.f12657c).f12640a.f12816F = null;
        }
        return true;
    }

    public void M(Z2.W w6, Z2.C1209t c1209t, Z2.C1209t c1209t2, Z2.C1208s c1208s) {
        if (c1209t.f12943d == 0.0f || c1209t.f12944e == 0.0f) {
            return;
        }
        if (c1208s == null && (c1208s = w6.f12876n) == null) {
            c1208s = Z2.C1208s.f12932d;
        }
        a0(w6, (Z2.A0) this.f12657c);
        if (o()) {
            Z2.A0 a2 = (Z2.A0) this.f12657c;
            a2.f12645f = c1209t;
            if (!a2.f12640a.f12843v.booleanValue()) {
                Z2.C1209t c1209t3 = ((Z2.A0) this.f12657c).f12645f;
                S(c1209t3.f12941b, c1209t3.f12942c, c1209t3.f12943d, c1209t3.f12944e);
            }
            i(w6, ((Z2.A0) this.f12657c).f12645f);
            android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
            if (c1209t2 != null) {
                canvas.concat(h(((Z2.A0) this.f12657c).f12645f, c1209t2, c1208s));
                ((Z2.A0) this.f12657c).g = w6.f12888o;
            } else {
                Z2.C1209t c1209t4 = ((Z2.A0) this.f12657c).f12645f;
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

    /* JADX WARN: Multi-variable type inference failed */
    public void N(Z2.AbstractC1185d0 abstractC1185d0) {
        Z2.F f9;
        java.lang.String str;
        int iIndexOf;
        java.util.Set setC;
        Z2.F f10;
        java.lang.Boolean bool;
        if (abstractC1185d0 instanceof Z2.J) {
            return;
        }
        W();
        if ((abstractC1185d0 instanceof Z2.AbstractC1181b0) && (bool = ((Z2.AbstractC1181b0) abstractC1185d0).f12860d) != null) {
            ((Z2.A0) this.f12657c).f12646h = bool.booleanValue();
        }
        if (abstractC1185d0 instanceof Z2.W) {
            Z2.W w6 = (Z2.W) abstractC1185d0;
            M(w6, I(w6.f12847p, w6.f12848q, w6.f12849r, w6.f12850s), w6.f12888o, w6.f12876n);
        } else {
            android.graphics.Bitmap bitmapDecodeByteArray = null;
            float fE = 0.0f;
            if (abstractC1185d0 instanceof Z2.s0) {
                Z2.s0 s0Var = (Z2.s0) abstractC1185d0;
                Z2.F f11 = s0Var.f12938r;
                if ((f11 == null || !f11.g()) && ((f10 = s0Var.f12939s) == null || !f10.g())) {
                    a0(s0Var, (Z2.A0) this.f12657c);
                    if (o()) {
                        Z2.AbstractC1185d0 abstractC1185d0I = s0Var.f12869a.I(s0Var.f12935o);
                        if (abstractC1185d0I == null) {
                            s("Use reference '%s' not found", s0Var.f12935o);
                        } else {
                            android.graphics.Matrix matrix = s0Var.f12654n;
                            android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            Z2.F f12 = s0Var.f12936p;
                            float fD = f12 != null ? f12.d(this) : 0.0f;
                            Z2.F f13 = s0Var.f12937q;
                            canvas.translate(fD, f13 != null ? f13.e(this) : 0.0f);
                            i(s0Var, s0Var.f12855h);
                            boolean zL = L();
                            ((java.util.Stack) this.f12659e).push(s0Var);
                            ((java.util.Stack) this.f12660f).push(((android.graphics.Canvas) this.f12655a).getMatrix());
                            if (abstractC1185d0I instanceof Z2.W) {
                                Z2.W w9 = (Z2.W) abstractC1185d0I;
                                Z2.C1209t c1209tI = I(null, null, s0Var.f12938r, s0Var.f12939s);
                                W();
                                M(w9, c1209tI, w9.f12888o, w9.f12876n);
                                V();
                            } else if (abstractC1185d0I instanceof Z2.C1197j0) {
                                Z2.F f14 = s0Var.f12938r;
                                if (f14 == null) {
                                    f14 = new Z2.F(100.0f, 9);
                                }
                                Z2.F f15 = s0Var.f12939s;
                                if (f15 == null) {
                                    f15 = new Z2.F(100.0f, 9);
                                }
                                Z2.C1209t c1209tI2 = I(null, null, f14, f15);
                                W();
                                Z2.C1197j0 c1197j0 = (Z2.C1197j0) abstractC1185d0I;
                                if (c1209tI2.f12943d != 0.0f && c1209tI2.f12944e != 0.0f) {
                                    Z2.C1208s c1208s = c1197j0.f12876n;
                                    if (c1208s == null) {
                                        c1208s = Z2.C1208s.f12932d;
                                    }
                                    a0(c1197j0, (Z2.A0) this.f12657c);
                                    Z2.A0 a2 = (Z2.A0) this.f12657c;
                                    a2.f12645f = c1209tI2;
                                    if (!a2.f12640a.f12843v.booleanValue()) {
                                        Z2.C1209t c1209t = ((Z2.A0) this.f12657c).f12645f;
                                        S(c1209t.f12941b, c1209t.f12942c, c1209t.f12943d, c1209t.f12944e);
                                    }
                                    Z2.C1209t c1209t2 = c1197j0.f12888o;
                                    if (c1209t2 != null) {
                                        canvas.concat(h(((Z2.A0) this.f12657c).f12645f, c1209t2, c1208s));
                                        ((Z2.A0) this.f12657c).g = c1197j0.f12888o;
                                    } else {
                                        Z2.C1209t c1209t3 = ((Z2.A0) this.f12657c).f12645f;
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
                            ((java.util.Stack) this.f12659e).pop();
                            ((java.util.Stack) this.f12660f).pop();
                            if (zL) {
                                K(s0Var.f12855h);
                            }
                            Y(s0Var);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.C1195i0) {
                Z2.C1195i0 c1195i0 = (Z2.C1195i0) abstractC1185d0;
                a0(c1195i0, (Z2.A0) this.f12657c);
                if (o()) {
                    android.graphics.Matrix matrix2 = c1195i0.f12654n;
                    if (matrix2 != null) {
                        ((android.graphics.Canvas) this.f12655a).concat(matrix2);
                    }
                    i(c1195i0, c1195i0.f12855h);
                    boolean zL3 = L();
                    java.lang.String language = java.util.Locale.getDefault().getLanguage();
                    for (Z2.AbstractC1185d0 abstractC1185d1 : c1195i0.f12851i) {
                        if (abstractC1185d1 instanceof Z2.X) {
                            Z2.X x9 = (Z2.X) abstractC1185d1;
                            if (x9.d() == null && ((setC = x9.c()) == null || (!setC.isEmpty() && setC.contains(language)))) {
                                java.util.Set setG = x9.g();
                                if (setG != null) {
                                    if (g == null) {
                                        synchronized (Z2.C0.class) {
                                            java.util.HashSet hashSet = new java.util.HashSet();
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
                                java.util.Set setM = x9.m();
                                if (setM == null) {
                                    java.util.Set setN = x9.n();
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
            } else if (abstractC1185d0 instanceof Z2.C) {
                Z2.C c9 = (Z2.C) abstractC1185d0;
                a0(c9, (Z2.A0) this.f12657c);
                if (o()) {
                    android.graphics.Matrix matrix3 = c9.f12654n;
                    if (matrix3 != null) {
                        ((android.graphics.Canvas) this.f12655a).concat(matrix3);
                    }
                    i(c9, c9.f12855h);
                    boolean zL4 = L();
                    O(c9, true);
                    if (zL4) {
                        K(c9.f12855h);
                    }
                    Y(c9);
                }
            } else if (abstractC1185d0 instanceof Z2.E) {
                Z2.E e6 = (Z2.E) abstractC1185d0;
                Z2.F f16 = e6.f12664r;
                if (f16 != null && !f16.g() && (f9 = e6.f12665s) != null && !f9.g() && (str = e6.f12661o) != null) {
                    Z2.C1208s c1208s2 = e6.f12876n;
                    if (c1208s2 == null) {
                        c1208s2 = Z2.C1208s.f12932d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = android.util.Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (java.lang.Exception e9) {
                            android.util.Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e9);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        Z2.C1209t c1209t4 = new Z2.C1209t(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        a0(e6, (Z2.A0) this.f12657c);
                        if (o() && c0()) {
                            android.graphics.Matrix matrix4 = e6.f12666t;
                            android.graphics.Canvas canvas2 = (android.graphics.Canvas) this.f12655a;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            Z2.F f17 = e6.f12662p;
                            float fD2 = f17 != null ? f17.d(this) : 0.0f;
                            Z2.F f18 = e6.f12663q;
                            float fE2 = f18 != null ? f18.e(this) : 0.0f;
                            float fD3 = e6.f12664r.d(this);
                            float fD4 = e6.f12665s.d(this);
                            Z2.A0 a9 = (Z2.A0) this.f12657c;
                            a9.f12645f = new Z2.C1209t(fD2, fE2, fD3, fD4);
                            if (!a9.f12640a.f12843v.booleanValue()) {
                                Z2.C1209t c1209t5 = ((Z2.A0) this.f12657c).f12645f;
                                S(c1209t5.f12941b, c1209t5.f12942c, c1209t5.f12943d, c1209t5.f12944e);
                            }
                            e6.f12855h = ((Z2.A0) this.f12657c).f12645f;
                            Y(e6);
                            i(e6, e6.f12855h);
                            boolean zL5 = L();
                            b0();
                            canvas2.save();
                            canvas2.concat(h(((Z2.A0) this.f12657c).f12645f, c1209t4, c1208s2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new android.graphics.Paint(((Z2.A0) this.f12657c).f12640a.f12829T == 3 ? 0 : 2));
                            canvas2.restore();
                            if (zL5) {
                                K(e6.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.L) {
                Z2.L l2 = (Z2.L) abstractC1185d0;
                if (l2.f12780o != null) {
                    a0(l2, (Z2.A0) this.f12657c);
                    if (o() && c0()) {
                        Z2.A0 a10 = (Z2.A0) this.f12657c;
                        if (a10.f12642c || a10.f12641b) {
                            android.graphics.Matrix matrix5 = l2.f12651n;
                            if (matrix5 != null) {
                                ((android.graphics.Canvas) this.f12655a).concat(matrix5);
                            }
                            android.graphics.Path path = new Z2.w0(l2.f12780o).f12963a;
                            if (l2.f12855h == null) {
                                l2.f12855h = f(path);
                            }
                            Y(l2);
                            j(l2);
                            i(l2, l2.f12855h);
                            boolean zL6 = L();
                            Z2.A0 a11 = (Z2.A0) this.f12657c;
                            if (a11.f12641b) {
                                int i3 = a11.f12640a.f12820K;
                                path.setFillType((i3 == 0 || i3 != 2) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                                p(l2, path);
                            }
                            if (((Z2.A0) this.f12657c).f12642c) {
                                q(path);
                            }
                            Q(l2);
                            if (zL6) {
                                K(l2.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.S) {
                Z2.S s9 = (Z2.S) abstractC1185d0;
                Z2.F f19 = s9.f12806q;
                if (f19 != null && s9.f12807r != null && !f19.g() && !s9.f12807r.g()) {
                    a0(s9, (Z2.A0) this.f12657c);
                    if (o() && c0()) {
                        android.graphics.Matrix matrix6 = s9.f12651n;
                        if (matrix6 != null) {
                            ((android.graphics.Canvas) this.f12655a).concat(matrix6);
                        }
                        android.graphics.Path pathH = H(s9);
                        Y(s9);
                        j(s9);
                        i(s9, s9.f12855h);
                        boolean zL7 = L();
                        if (((Z2.A0) this.f12657c).f12641b) {
                            p(s9, pathH);
                        }
                        if (((Z2.A0) this.f12657c).f12642c) {
                            q(pathH);
                        }
                        if (zL7) {
                            K(s9.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.C1210u) {
                Z2.C1210u c1210u = (Z2.C1210u) abstractC1185d0;
                Z2.F f20 = c1210u.f12947q;
                if (f20 != null && !f20.g()) {
                    a0(c1210u, (Z2.A0) this.f12657c);
                    if (o() && c0()) {
                        android.graphics.Matrix matrix7 = c1210u.f12651n;
                        if (matrix7 != null) {
                            ((android.graphics.Canvas) this.f12655a).concat(matrix7);
                        }
                        android.graphics.Path pathE = E(c1210u);
                        Y(c1210u);
                        j(c1210u);
                        i(c1210u, c1210u.f12855h);
                        boolean zL8 = L();
                        if (((Z2.A0) this.f12657c).f12641b) {
                            p(c1210u, pathE);
                        }
                        if (((Z2.A0) this.f12657c).f12642c) {
                            q(pathE);
                        }
                        if (zL8) {
                            K(c1210u.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.C1215z) {
                Z2.C1215z c1215z = (Z2.C1215z) abstractC1185d0;
                Z2.F f21 = c1215z.f12974q;
                if (f21 != null && c1215z.f12975r != null && !f21.g() && !c1215z.f12975r.g()) {
                    a0(c1215z, (Z2.A0) this.f12657c);
                    if (o() && c0()) {
                        android.graphics.Matrix matrix8 = c1215z.f12651n;
                        if (matrix8 != null) {
                            ((android.graphics.Canvas) this.f12655a).concat(matrix8);
                        }
                        android.graphics.Path pathF = F(c1215z);
                        Y(c1215z);
                        j(c1215z);
                        i(c1215z, c1215z.f12855h);
                        boolean zL9 = L();
                        if (((Z2.A0) this.f12657c).f12641b) {
                            p(c1215z, pathF);
                        }
                        if (((Z2.A0) this.f12657c).f12642c) {
                            q(pathF);
                        }
                        if (zL9) {
                            K(c1215z.f12855h);
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.G) {
                Z2.G g9 = (Z2.G) abstractC1185d0;
                a0(g9, (Z2.A0) this.f12657c);
                if (o() && c0() && ((Z2.A0) this.f12657c).f12642c) {
                    android.graphics.Matrix matrix9 = g9.f12651n;
                    if (matrix9 != null) {
                        ((android.graphics.Canvas) this.f12655a).concat(matrix9);
                    }
                    Z2.F f22 = g9.f12671o;
                    float fD5 = f22 == null ? 0.0f : f22.d(this);
                    Z2.F f23 = g9.f12672p;
                    float fE3 = f23 == null ? 0.0f : f23.e(this);
                    Z2.F f24 = g9.f12673q;
                    float fD6 = f24 == null ? 0.0f : f24.d(this);
                    Z2.F f25 = g9.f12674r;
                    fE = f25 != null ? f25.e(this) : 0.0f;
                    if (g9.f12855h == null) {
                        g9.f12855h = new Z2.C1209t(java.lang.Math.min(fD5, fD6), java.lang.Math.min(fE3, fE), java.lang.Math.abs(fD6 - fD5), java.lang.Math.abs(fE - fE3));
                    }
                    android.graphics.Path path2 = new android.graphics.Path();
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
            } else if (abstractC1185d0 instanceof Z2.Q) {
                Z2.Q q9 = (Z2.Q) abstractC1185d0;
                a0(q9, (Z2.A0) this.f12657c);
                if (o() && c0()) {
                    Z2.A0 a12 = (Z2.A0) this.f12657c;
                    if (a12.f12642c || a12.f12641b) {
                        android.graphics.Matrix matrix10 = q9.f12651n;
                        if (matrix10 != null) {
                            ((android.graphics.Canvas) this.f12655a).concat(matrix10);
                        }
                        if (q9.f12803o.length >= 2) {
                            android.graphics.Path pathG = G(q9);
                            Y(q9);
                            j(q9);
                            i(q9, q9.f12855h);
                            boolean zL11 = L();
                            if (((Z2.A0) this.f12657c).f12641b) {
                                p(q9, pathG);
                            }
                            if (((Z2.A0) this.f12657c).f12642c) {
                                q(pathG);
                            }
                            Q(q9);
                            if (zL11) {
                                K(q9.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.P) {
                Z2.P p2 = (Z2.P) abstractC1185d0;
                a0(p2, (Z2.A0) this.f12657c);
                if (o() && c0()) {
                    Z2.A0 a13 = (Z2.A0) this.f12657c;
                    if (a13.f12642c || a13.f12641b) {
                        android.graphics.Matrix matrix11 = p2.f12651n;
                        if (matrix11 != null) {
                            ((android.graphics.Canvas) this.f12655a).concat(matrix11);
                        }
                        if (p2.f12803o.length >= 2) {
                            android.graphics.Path pathG2 = G(p2);
                            Y(p2);
                            int i9 = ((Z2.A0) this.f12657c).f12640a.f12820K;
                            pathG2.setFillType((i9 == 0 || i9 != 2) ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                            j(p2);
                            i(p2, p2.f12855h);
                            boolean zL12 = L();
                            if (((Z2.A0) this.f12657c).f12641b) {
                                p(p2, pathG2);
                            }
                            if (((Z2.A0) this.f12657c).f12642c) {
                                q(pathG2);
                            }
                            Q(p2);
                            if (zL12) {
                                K(p2.f12855h);
                            }
                        }
                    }
                }
            } else if (abstractC1185d0 instanceof Z2.C1203m0) {
                Z2.C1203m0 c1203m0 = (Z2.C1203m0) abstractC1185d0;
                a0(c1203m0, (Z2.A0) this.f12657c);
                if (o()) {
                    android.graphics.Matrix matrix12 = c1203m0.f12901r;
                    if (matrix12 != null) {
                        ((android.graphics.Canvas) this.f12655a).concat(matrix12);
                    }
                    java.util.ArrayList arrayList = c1203m0.f12916n;
                    float fD7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12916n.get(0)).d(this);
                    java.util.ArrayList arrayList2 = c1203m0.f12917o;
                    float fE4 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12917o.get(0)).e(this);
                    java.util.ArrayList arrayList3 = c1203m0.f12918p;
                    float fD8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((Z2.F) c1203m0.f12918p.get(0)).d(this);
                    java.util.ArrayList arrayList4 = c1203m0.f12919q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        fE = ((Z2.F) c1203m0.f12919q.get(0)).e(this);
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
                        Z2.z0 z0Var = new Z2.z0(this, fD7, fE4);
                        r(c1203m0, z0Var);
                        android.graphics.RectF rectF = (android.graphics.RectF) z0Var.f12980r;
                        c1203m0.f12855h = new Z2.C1209t(rectF.left, rectF.top, rectF.width(), ((android.graphics.RectF) z0Var.f12980r).height());
                    }
                    Y(c1203m0);
                    j(c1203m0);
                    i(c1203m0, c1203m0.f12855h);
                    boolean zL13 = L();
                    r(c1203m0, new Z2.y0(this, fD7 + fD8, fE4 + fE));
                    if (zL13) {
                        K(c1203m0.f12855h);
                    }
                }
            }
        }
        V();
    }

    public void O(Z2.Y y, boolean z6) {
        if (z6) {
            ((java.util.Stack) this.f12659e).push(y);
            ((java.util.Stack) this.f12660f).push(((android.graphics.Canvas) this.f12655a).getMatrix());
        }
        java.util.Iterator it = y.f12851i.iterator();
        while (it.hasNext()) {
            N((Z2.AbstractC1185d0) it.next());
        }
        if (z6) {
            ((java.util.Stack) this.f12659e).pop();
            ((java.util.Stack) this.f12660f).pop();
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0033  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    public void P(Z2.H h9, Z2.v0 v0Var) {
        float fFloatValue;
        float f9;
        float f10;
        float f11;
        W();
        java.lang.Float f12 = h9.f12681u;
        float f13 = 0.0f;
        if (f12 == null) {
            fFloatValue = 0.0f;
        } else if (java.lang.Float.isNaN(f12.floatValue())) {
            float f14 = v0Var.f12958c;
            if (f14 == 0.0f && v0Var.f12959d == 0.0f) {
                fFloatValue = 0.0f;
            } else {
                fFloatValue = (float) java.lang.Math.toDegrees(java.lang.Math.atan2(v0Var.f12959d, f14));
            }
        } else {
            fFloatValue = h9.f12681u.floatValue();
        }
        float fC = h9.f12676p ? 1.0f : ((Z2.A0) this.f12657c).f12640a.f12834m.c();
        this.f12657c = x(h9);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(v0Var.f12956a, v0Var.f12957b);
        matrix.preRotate(fFloatValue);
        matrix.preScale(fC, fC);
        Z2.F f15 = h9.f12677q;
        float fD = f15 != null ? f15.d(this) : 0.0f;
        Z2.F f16 = h9.f12678r;
        float fE = f16 != null ? f16.e(this) : 0.0f;
        Z2.F f17 = h9.f12679s;
        float fD2 = f17 != null ? f17.d(this) : 3.0f;
        Z2.F f18 = h9.f12680t;
        float fE2 = f18 != null ? f18.e(this) : 3.0f;
        Z2.C1209t c1209t = h9.f12888o;
        android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
        if (c1209t != null) {
            float fMax = fD2 / c1209t.f12943d;
            float f19 = fE2 / c1209t.f12944e;
            Z2.C1208s c1208s = h9.f12876n;
            if (c1208s == null) {
                c1208s = Z2.C1208s.f12932d;
            }
            if (!c1208s.equals(Z2.C1208s.f12931c)) {
                fMax = c1208s.f12934b == 2 ? java.lang.Math.max(fMax, f19) : java.lang.Math.min(fMax, f19);
                f19 = fMax;
            }
            matrix.preTranslate((-fD) * fMax, (-fE) * f19);
            canvas.concat(matrix);
            Z2.C1209t c1209t2 = h9.f12888o;
            float f20 = c1209t2.f12943d * fMax;
            float f21 = c1209t2.f12944e * f19;
            Z2.r rVar = c1208s.f12933a;
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
                    if (!((Z2.A0) this.f12657c).f12640a.f12843v.booleanValue()) {
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
                    if (!((Z2.A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                        S(f10, f13, fD2, fE2);
                    }
                    matrix.reset();
                    matrix.preScale(fMax, f19);
                    canvas.concat(matrix);
                    break;
                default:
                    if (!((Z2.A0) this.f12657c).f12640a.f12843v.booleanValue()) {
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
            if (!((Z2.A0) this.f12657c).f12640a.f12843v.booleanValue()) {
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

    public void Q(Z2.B b9) {
        Z2.H h9;
        Z2.H h10;
        Z2.H h11;
        int i3;
        float f9;
        float f10;
        float f11;
        java.util.ArrayList arrayList;
        int size;
        Z2.V v6 = ((Z2.A0) this.f12657c).f12640a;
        java.lang.String str = v6.f12845x;
        if (str == null && v6.y == null && v6.f12846z == null) {
            return;
        }
        if (str == null) {
            h9 = null;
        } else {
            Z2.AbstractC1181b0 abstractC1181b0I = b9.f12869a.I(str);
            if (abstractC1181b0I != null) {
                h9 = (Z2.H) abstractC1181b0I;
            } else {
                s("Marker reference '%s' not found", ((Z2.A0) this.f12657c).f12640a.f12845x);
                h9 = null;
            }
        }
        java.lang.String str2 = ((Z2.A0) this.f12657c).f12640a.y;
        if (str2 == null) {
            h10 = null;
        } else {
            Z2.AbstractC1181b0 abstractC1181b0I2 = b9.f12869a.I(str2);
            if (abstractC1181b0I2 != null) {
                h10 = (Z2.H) abstractC1181b0I2;
            } else {
                s("Marker reference '%s' not found", ((Z2.A0) this.f12657c).f12640a.y);
                h10 = null;
            }
        }
        java.lang.String str3 = ((Z2.A0) this.f12657c).f12640a.f12846z;
        if (str3 == null) {
            h11 = null;
        } else {
            Z2.AbstractC1181b0 abstractC1181b0I3 = b9.f12869a.I(str3);
            if (abstractC1181b0I3 != null) {
                h11 = (Z2.H) abstractC1181b0I3;
            } else {
                s("Marker reference '%s' not found", ((Z2.A0) this.f12657c).f12640a.f12846z);
                h11 = null;
            }
        }
        float f12 = 0.0f;
        if (b9 instanceof Z2.L) {
            arrayList = new Z2.u0(this, ((Z2.L) b9).f12780o).f12948a;
            f10 = 0.0f;
            i3 = 1;
        } else if (b9 instanceof Z2.G) {
            Z2.G g9 = (Z2.G) b9;
            Z2.F f13 = g9.f12671o;
            float fD = f13 != null ? f13.d(this) : 0.0f;
            Z2.F f14 = g9.f12672p;
            float fE = f14 != null ? f14.e(this) : 0.0f;
            Z2.F f15 = g9.f12673q;
            float fD2 = f15 != null ? f15.d(this) : 0.0f;
            Z2.F f16 = g9.f12674r;
            float fE2 = f16 != null ? f16.e(this) : 0.0f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(2);
            float f17 = fD2 - fD;
            i3 = 1;
            float f18 = fE2 - fE;
            arrayList2.add(new Z2.v0(fD, fE, f17, f18));
            arrayList2.add(new Z2.v0(fD2, fE2, f17, f18));
            f10 = 0.0f;
            arrayList = arrayList2;
        } else {
            i3 = 1;
            Z2.P p2 = (Z2.P) b9;
            int length = p2.f12803o.length;
            if (length < 2) {
                arrayList = null;
                f10 = 0.0f;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                float[] fArr = p2.f12803o;
                Z2.v0 v0Var = new Z2.v0(fArr[0], fArr[1], 0.0f, 0.0f);
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
                    v0Var = new Z2.v0(f21, f22, f21 - f11, f22 - f9);
                    i9 += 2;
                    f20 = f22;
                    f19 = f21;
                    f12 = f10;
                }
                if (p2 instanceof Z2.Q) {
                    float[] fArr3 = p2.f12803o;
                    float f23 = fArr3[0];
                    if (f19 != f23) {
                        float f24 = fArr3[1];
                        if (f20 != f24) {
                            v0Var.a(f23, f24);
                            arrayList3.add(v0Var);
                            Z2.v0 v0Var2 = new Z2.v0(f23, f24, f23 - f11, f24 - f9);
                            v0Var2.b((Z2.v0) arrayList3.get(0));
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
        Z2.V v9 = ((Z2.A0) this.f12657c).f12640a;
        v9.f12846z = null;
        v9.y = null;
        v9.f12845x = null;
        if (h9 != null) {
            P(h9, (Z2.v0) arrayList.get(0));
        }
        if (h10 != null && arrayList.size() > 2) {
            Z2.v0 v0Var3 = (Z2.v0) arrayList.get(0);
            Z2.v0 v0Var4 = (Z2.v0) arrayList.get(i3);
            int i10 = 1;
            while (i10 < size - 1) {
                i10++;
                Z2.v0 v0Var5 = (Z2.v0) arrayList.get(i10);
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
            P(h11, (Z2.v0) arrayList.get(size - 1));
        }
    }

    public void R(Z2.I i3, Z2.C1209t c1209t) {
        float fD;
        float fE;
        java.lang.Boolean bool = i3.f12683n;
        if (bool == null || !bool.booleanValue()) {
            Z2.F f9 = i3.f12685p;
            float fB = f9 != null ? f9.b(this, 1.0f) : 1.2f;
            Z2.F f10 = i3.f12686q;
            float fB2 = f10 != null ? f10.b(this, 1.0f) : 1.2f;
            fD = fB * c1209t.f12943d;
            fE = fB2 * c1209t.f12944e;
        } else {
            Z2.F f11 = i3.f12685p;
            fD = f11 != null ? f11.d(this) : c1209t.f12943d;
            Z2.F f12 = i3.f12686q;
            fE = f12 != null ? f12.e(this) : c1209t.f12944e;
        }
        if (fD == 0.0f || fE == 0.0f) {
            return;
        }
        W();
        Z2.A0 a0X = x(i3);
        this.f12657c = a0X;
        a0X.f12640a.f12838q = java.lang.Float.valueOf(1.0f);
        boolean zL = L();
        android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
        canvas.save();
        java.lang.Boolean bool2 = i3.f12684o;
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
        A7.m mVar = ((Z2.A0) this.f12657c).f12640a.f12844w;
        if (mVar != null) {
            f9 += ((Z2.F) mVar.f323l).d(this);
            f10 += ((Z2.F) ((Z2.A0) this.f12657c).f12640a.f12844w.f321i).e(this);
            fD -= ((Z2.F) ((Z2.A0) this.f12657c).f12640a.f12844w.j).d(this);
            fE -= ((Z2.F) ((Z2.A0) this.f12657c).f12640a.f12844w.f322k).e(this);
        }
        ((android.graphics.Canvas) this.f12655a).clipRect(f9, f10, fD, fE);
    }

    public void V() {
        ((android.graphics.Canvas) this.f12655a).restore();
        this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
    }

    public void W() {
        ((android.graphics.Canvas) this.f12655a).save();
        ((java.util.Stack) this.f12658d).push((Z2.A0) this.f12657c);
        this.f12657c = new Z2.A0((Z2.A0) this.f12657c);
    }

    public java.lang.String X(java.lang.String str, boolean z6, boolean z9) {
        if (((Z2.A0) this.f12657c).f12646h) {
            return str.replaceAll("[\\n\\t]", io.ktor.sse.ServerSentEventKt.SPACE);
        }
        java.lang.String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", io.ktor.sse.ServerSentEventKt.SPACE);
        if (z6) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z9) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", io.ktor.sse.ServerSentEventKt.SPACE);
    }

    public void Y(Z2.AbstractC1179a0 abstractC1179a0) {
        if (abstractC1179a0.f12870b == null || abstractC1179a0.f12855h == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (((android.graphics.Matrix) ((java.util.Stack) this.f12660f).peek()).invert(matrix)) {
            Z2.C1209t c1209t = abstractC1179a0.f12855h;
            float f9 = c1209t.f12941b;
            float f10 = c1209t.f12942c;
            float fC = c1209t.c();
            Z2.C1209t c1209t2 = abstractC1179a0.f12855h;
            float f11 = c1209t2.f12942c;
            float fC2 = c1209t2.c();
            float fD = abstractC1179a0.f12855h.d();
            Z2.C1209t c1209t3 = abstractC1179a0.f12855h;
            float[] fArr = {f9, f10, fC, f11, fC2, fD, c1209t3.f12941b, c1209t3.d()};
            matrix.preConcat(((android.graphics.Canvas) this.f12655a).getMatrix());
            matrix.mapPoints(fArr);
            float f12 = fArr[0];
            float f13 = fArr[1];
            android.graphics.RectF rectF = new android.graphics.RectF(f12, f13, f12, f13);
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
            Z2.AbstractC1179a0 abstractC1179a1 = (Z2.AbstractC1179a0) ((java.util.Stack) this.f12659e).peek();
            Z2.C1209t c1209t4 = abstractC1179a1.f12855h;
            if (c1209t4 == null) {
                float f16 = rectF.left;
                float f17 = rectF.top;
                abstractC1179a1.f12855h = new Z2.C1209t(f16, f17, rectF.right - f16, rectF.bottom - f17);
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

    public void Z(Z2.A0 a2, Z2.V v6) {
        Z2.V v9;
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            a2.f12640a.f12839r = v6.f12839r;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            a2.f12640a.f12838q = v6.f12838q;
        }
        boolean zD = D(v6, 1L);
        Z2.C1212w c1212w = Z2.C1212w.j;
        if (zD) {
            a2.f12640a.f12831i = v6.f12831i;
            Z2.AbstractC1187e0 abstractC1187e0 = v6.f12831i;
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
            Z2.AbstractC1187e0 abstractC1187e1 = v6.f12832k;
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
            Z2.V v10 = a2.f12640a;
            Z2.F f9 = v6.f12834m;
            v10.f12834m = f9;
            a2.f12644e.setStrokeWidth(f9.a(this));
        }
        if (D(v6, 64L)) {
            a2.f12640a.f12821L = v6.f12821L;
            int iC = Z.AbstractC1149h0.c(v6.f12821L);
            android.graphics.Paint paint = a2.f12644e;
            if (iC == 0) {
                paint.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            } else if (iC == 1) {
                paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            } else if (iC == 2) {
                paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            }
        }
        if (D(v6, 128L)) {
            a2.f12640a.f12822M = v6.f12822M;
            int iC2 = Z.AbstractC1149h0.c(v6.f12822M);
            android.graphics.Paint paint2 = a2.f12644e;
            if (iC2 == 0) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.MITER);
            } else if (iC2 == 1) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            } else if (iC2 == 2) {
                paint2.setStrokeJoin(android.graphics.Paint.Join.BEVEL);
            }
        }
        if (D(v6, 256L)) {
            a2.f12640a.f12835n = v6.f12835n;
            a2.f12644e.setStrokeMiter(v6.f12835n.floatValue());
        }
        if (D(v6, 512L)) {
            a2.f12640a.f12836o = v6.f12836o;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            a2.f12640a.f12837p = v6.f12837p;
        }
        android.graphics.Typeface typefaceK = null;
        if (D(v6, 1536L)) {
            Z2.F[] fArr = a2.f12640a.f12836o;
            android.graphics.Paint paint3 = a2.f12644e;
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
                    paint3.setPathEffect(new android.graphics.DashPathEffect(fArr2, fA2));
                }
            }
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE)) {
            float textSize = ((Z2.A0) this.f12657c).f12643d.getTextSize();
            a2.f12640a.f12841t = v6.f12841t;
            a2.f12643d.setTextSize(v6.f12841t.b(this, textSize));
            a2.f12644e.setTextSize(v6.f12841t.b(this, textSize));
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            a2.f12640a.f12840s = v6.f12840s;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID)) {
            if (v6.f12842u.intValue() == -1 && a2.f12640a.f12842u.intValue() > 100) {
                Z2.V v11 = a2.f12640a;
                v11.f12842u = java.lang.Integer.valueOf(v11.f12842u.intValue() - 100);
            } else if (v6.f12842u.intValue() != 1 || a2.f12640a.f12842u.intValue() >= 900) {
                a2.f12640a.f12842u = v6.f12842u;
            } else {
                Z2.V v12 = a2.f12640a;
                v12.f12842u = java.lang.Integer.valueOf(v12.f12842u.intValue() + 100);
            }
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            a2.f12640a.f12823N = v6.f12823N;
        }
        if (D(v6, 106496L)) {
            Z2.V v13 = a2.f12640a;
            java.util.ArrayList arrayList = v13.f12840s;
            if (arrayList != null && ((android.support.v4.media.session.q) this.f12656b) != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    typefaceK = k((java.lang.String) it.next(), v13.f12823N, v13.f12842u);
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
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            a2.f12640a.f12824O = v6.f12824O;
            android.graphics.Paint paint4 = a2.f12643d;
            paint4.setStrikeThruText(v6.f12824O == 4);
            paint4.setUnderlineText(v6.f12824O == 2);
            android.graphics.Paint paint5 = a2.f12644e;
            paint5.setStrikeThruText(v6.f12824O == 4);
            paint5.setUnderlineText(v6.f12824O == 2);
        }
        if (D(v6, 68719476736L)) {
            a2.f12640a.f12825P = v6.f12825P;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            a2.f12640a.f12826Q = v6.f12826Q;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            a2.f12640a.f12843v = v6.f12843v;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            a2.f12640a.f12845x = v6.f12845x;
        }
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
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
        if (D(v6, androidx.media3.session.legacy.PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
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

    public void a0(Z2.AbstractC1181b0 abstractC1181b0, Z2.A0 a2) {
        boolean z6 = abstractC1181b0.f12870b == null;
        Z2.V v6 = a2.f12640a;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        v6.f12811A = bool;
        if (!z6) {
            bool = java.lang.Boolean.FALSE;
        }
        v6.f12843v = bool;
        v6.f12844w = null;
        v6.f12815E = null;
        v6.f12838q = java.lang.Float.valueOf(1.0f);
        v6.f12813C = Z2.C1212w.f12961i;
        v6.f12814D = java.lang.Float.valueOf(1.0f);
        v6.f12816F = null;
        v6.f12817G = null;
        v6.H = java.lang.Float.valueOf(1.0f);
        v6.f12818I = null;
        v6.f12819J = java.lang.Float.valueOf(1.0f);
        v6.f12828S = 1;
        Z2.V v9 = abstractC1181b0.f12861e;
        if (v9 != null) {
            Z(a2, v9);
        }
        java.util.ArrayList arrayList = ((Z2.C1202m) ((android.support.v4.media.session.q) this.f12656b).j).f12900b;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (Z2.C1200l c1200l : ((Z2.C1202m) ((android.support.v4.media.session.q) this.f12656b).j).f12900b) {
                if (Y2.C1038h.n(c1200l.f12895a, abstractC1181b0)) {
                    Z(a2, c1200l.f12896b);
                }
            }
        }
        Z2.V v10 = abstractC1181b0.f12862f;
        if (v10 != null) {
            Z(a2, v10);
        }
    }

    public void b(java.lang.String str, java.lang.String str2) {
        java.util.HashMap map = (java.util.HashMap) this.f12660f;
        if (map == null) {
            throw new java.lang.IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        map.put(str, str2);
    }

    public void b0() {
        int iL;
        Z2.V v6 = ((Z2.A0) this.f12657c).f12640a;
        Z2.AbstractC1187e0 abstractC1187e0 = v6.f12818I;
        if (abstractC1187e0 instanceof Z2.C1212w) {
            iL = ((Z2.C1212w) abstractC1187e0).f12962h;
        } else if (!(abstractC1187e0 instanceof Z2.C1213x)) {
            return;
        } else {
            iL = v6.f12839r.f12962h;
        }
        java.lang.Float f9 = v6.f12819J;
        if (f9 != null) {
            iL = l(f9.floatValue(), iL);
        }
        ((android.graphics.Canvas) this.f12655a).drawColor(iL);
    }

    public boolean c0() {
        java.lang.Boolean bool = ((Z2.A0) this.f12657c).f12640a.f12812B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public p041e3.h d() {
        java.lang.String strO = ((java.lang.String) this.f12655a) == null ? " transportName" : "";
        if (((p041e3.k) this.f12657c) == null) {
            strO = strO.concat(" encodedPayload");
        }
        if (((java.lang.Long) this.f12658d) == null) {
            strO = p121o0.p.o(strO, " eventMillis");
        }
        if (((java.lang.Long) this.f12659e) == null) {
            strO = p121o0.p.o(strO, " uptimeMillis");
        }
        if (((java.util.HashMap) this.f12660f) == null) {
            strO = p121o0.p.o(strO, " autoMetadata");
        }
        if (strO.isEmpty()) {
            return new p041e3.h((java.lang.String) this.f12655a, (java.lang.Integer) this.f12656b, (p041e3.k) this.f12657c, ((java.lang.Long) this.f12658d).longValue(), ((java.lang.Long) this.f12659e).longValue(), (java.util.HashMap) this.f12660f);
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(strO));
    }

    public android.graphics.Path e(Z2.AbstractC1179a0 abstractC1179a0, Z2.C1209t c1209t) {
        android.graphics.Path pathJ;
        Z2.AbstractC1181b0 abstractC1181b0I = abstractC1179a0.f12869a.I(((Z2.A0) this.f12657c).f12640a.f12815E);
        if (abstractC1181b0I == null) {
            s("ClipPath reference '%s' not found", ((Z2.A0) this.f12657c).f12640a.f12815E);
            return null;
        }
        Z2.C1211v c1211v = (Z2.C1211v) abstractC1181b0I;
        ((java.util.Stack) this.f12658d).push((Z2.A0) this.f12657c);
        this.f12657c = x(c1211v);
        java.lang.Boolean bool = c1211v.f12955o;
        boolean z6 = bool == null || bool.booleanValue();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        if (!z6) {
            matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
            matrix.preScale(c1209t.f12943d, c1209t.f12944e);
        }
        android.graphics.Matrix matrix2 = c1211v.f12654n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        android.graphics.Path path = new android.graphics.Path();
        for (Z2.AbstractC1185d0 abstractC1185d0 : c1211v.f12851i) {
            if ((abstractC1185d0 instanceof Z2.AbstractC1179a0) && (pathJ = J((Z2.AbstractC1179a0) abstractC1185d0, true)) != null) {
                path.op(pathJ, android.graphics.Path.Op.UNION);
            }
        }
        if (((Z2.A0) this.f12657c).f12640a.f12815E != null) {
            if (c1211v.f12855h == null) {
                c1211v.f12855h = f(path);
            }
            android.graphics.Path pathE = e(c1211v, c1211v.f12855h);
            if (pathE != null) {
                path.op(pathE, android.graphics.Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f12657c = (Z2.A0) ((java.util.Stack) this.f12658d).pop();
        return path;
    }

    public float g(Z2.o0 o0Var) {
        Z2.B0 b9 = new Z2.B0(this);
        r(o0Var, b9);
        return b9.f12652n;
    }

    public void i(Z2.AbstractC1179a0 abstractC1179a0, Z2.C1209t c1209t) {
        android.graphics.Path pathE;
        if (((Z2.A0) this.f12657c).f12640a.f12815E == null || (pathE = e(abstractC1179a0, c1209t)) == null) {
            return;
        }
        ((android.graphics.Canvas) this.f12655a).clipPath(pathE);
    }

    public void j(Z2.AbstractC1179a0 abstractC1179a0) {
        Z2.AbstractC1187e0 abstractC1187e0 = ((Z2.A0) this.f12657c).f12640a.f12831i;
        if (abstractC1187e0 instanceof Z2.K) {
            n(true, abstractC1179a0.f12855h, (Z2.K) abstractC1187e0);
        }
        Z2.AbstractC1187e0 abstractC1187e1 = ((Z2.A0) this.f12657c).f12640a.f12832k;
        if (abstractC1187e1 instanceof Z2.K) {
            n(false, abstractC1179a0.f12855h, (Z2.K) abstractC1187e1);
        }
    }

    public void n(boolean z6, Z2.C1209t c1209t, Z2.K k9) {
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
        Z2.AbstractC1181b0 abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(k9.f12773h);
        if (abstractC1181b0I == null) {
            s("%s reference '%s' not found", z6 ? "Fill" : "Stroke", k9.f12773h);
            Z2.AbstractC1187e0 abstractC1187e0 = k9.f12774i;
            if (abstractC1187e0 != null) {
                T((Z2.A0) this.f12657c, z6, abstractC1187e0);
                return;
            } else if (z6) {
                ((Z2.A0) this.f12657c).f12641b = false;
                return;
            } else {
                ((Z2.A0) this.f12657c).f12642c = false;
                return;
            }
        }
        boolean z9 = abstractC1181b0I instanceof Z2.C1183c0;
        Z2.C1212w c1212w = Z2.C1212w.f12961i;
        if (z9) {
            Z2.C1183c0 c1183c0 = (Z2.C1183c0) abstractC1181b0I;
            java.lang.String str = c1183c0.f12639l;
            if (str != null) {
                u(c1183c0, str);
            }
            java.lang.Boolean bool = c1183c0.f12637i;
            boolean z10 = bool != null && bool.booleanValue();
            Z2.A0 a2 = (Z2.A0) this.f12657c;
            android.graphics.Paint paint = z6 ? a2.f12643d : a2.f12644e;
            if (z10) {
                Z2.A0 a9 = (Z2.A0) this.f12657c;
                f10 = 256.0f;
                Z2.C1209t c1209t2 = a9.g;
                if (c1209t2 == null) {
                    c1209t2 = a9.f12645f;
                }
                Z2.F f14 = c1183c0.f12863m;
                float fD = f14 != null ? f14.d(this) : 0.0f;
                Z2.F f15 = c1183c0.f12864n;
                fB3 = f15 != null ? f15.e(this) : 0.0f;
                f11 = 0.0f;
                Z2.F f16 = c1183c0.f12865o;
                float fD2 = f16 != null ? f16.d(this) : c1209t2.f12943d;
                Z2.F f17 = c1183c0.f12866p;
                f13 = fD2;
                f12 = fD;
                fB4 = f17 != null ? f17.e(this) : 0.0f;
            } else {
                f10 = 256.0f;
                f11 = 0.0f;
                Z2.F f18 = c1183c0.f12863m;
                float fB5 = f18 != null ? f18.b(this, 1.0f) : 0.0f;
                Z2.F f19 = c1183c0.f12864n;
                fB3 = f19 != null ? f19.b(this, 1.0f) : 0.0f;
                Z2.F f20 = c1183c0.f12865o;
                float fB6 = f20 != null ? f20.b(this, 1.0f) : 1.0f;
                Z2.F f21 = c1183c0.f12866p;
                fB4 = f21 != null ? f21.b(this, 1.0f) : 0.0f;
                f12 = fB5;
                f13 = fB6;
            }
            float f22 = fB3;
            W();
            this.f12657c = x(c1183c0);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            if (!z10) {
                matrix.preTranslate(c1209t.f12941b, c1209t.f12942c);
                matrix.preScale(c1209t.f12943d, c1209t.f12944e);
            }
            android.graphics.Matrix matrix2 = c1183c0.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = c1183c0.f12636h.size();
            if (size == 0) {
                V();
                if (z6) {
                    ((Z2.A0) this.f12657c).f12641b = false;
                    return;
                } else {
                    ((Z2.A0) this.f12657c).f12642c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            java.util.Iterator it = c1183c0.f12636h.iterator();
            int i9 = 0;
            float f23 = -1.0f;
            while (it.hasNext()) {
                Z2.U u6 = (Z2.U) ((Z2.AbstractC1185d0) it.next());
                java.lang.Float f24 = u6.f12810h;
                float fFloatValue = f24 != null ? f24.floatValue() : f11;
                if (i9 == 0 || fFloatValue >= f23) {
                    fArr[i9] = fFloatValue;
                    f23 = fFloatValue;
                } else {
                    fArr[i9] = f23;
                }
                W();
                a0(u6, (Z2.A0) this.f12657c);
                Z2.V v6 = ((Z2.A0) this.f12657c).f12640a;
                Z2.C1212w c1212w2 = (Z2.C1212w) v6.f12813C;
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
            android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
            int i10 = c1183c0.f12638k;
            if (i10 != 0) {
                if (i10 == 2) {
                    tileMode = android.graphics.Shader.TileMode.MIRROR;
                } else if (i10 == 3) {
                    tileMode = android.graphics.Shader.TileMode.REPEAT;
                }
            }
            android.graphics.Shader.TileMode tileMode2 = tileMode;
            V();
            android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(f12, f22, f13, fB4, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (((Z2.A0) this.f12657c).f12640a.j.floatValue() * f10);
            if (iFloatValue < 0) {
                i3 = 0;
            } else {
                i3 = iFloatValue > 255 ? 255 : iFloatValue;
            }
            paint.setAlpha(i3);
            return;
        }
        if (!(abstractC1181b0I instanceof Z2.C1191g0)) {
            if (abstractC1181b0I instanceof Z2.T) {
                Z2.T t9 = (Z2.T) abstractC1181b0I;
                if (z6) {
                    if (D(t9.f12861e, 2147483648L)) {
                        Z2.A0 a10 = (Z2.A0) this.f12657c;
                        Z2.V v9 = a10.f12640a;
                        Z2.AbstractC1187e0 abstractC1187e1 = t9.f12861e.f12817G;
                        v9.f12831i = abstractC1187e1;
                        a10.f12641b = abstractC1187e1 != null;
                    }
                    if (D(t9.f12861e, 4294967296L)) {
                        ((Z2.A0) this.f12657c).f12640a.j = t9.f12861e.H;
                    }
                    if (D(t9.f12861e, 6442450944L)) {
                        Z2.A0 a11 = (Z2.A0) this.f12657c;
                        T(a11, z6, a11.f12640a.f12831i);
                        return;
                    }
                    return;
                }
                if (D(t9.f12861e, 2147483648L)) {
                    Z2.A0 a12 = (Z2.A0) this.f12657c;
                    Z2.V v10 = a12.f12640a;
                    Z2.AbstractC1187e0 abstractC1187e2 = t9.f12861e.f12817G;
                    v10.f12832k = abstractC1187e2;
                    a12.f12642c = abstractC1187e2 != null;
                }
                if (D(t9.f12861e, 4294967296L)) {
                    ((Z2.A0) this.f12657c).f12640a.f12833l = t9.f12861e.H;
                }
                if (D(t9.f12861e, 6442450944L)) {
                    Z2.A0 a13 = (Z2.A0) this.f12657c;
                    T(a13, z6, a13.f12640a.f12832k);
                    return;
                }
                return;
            }
            return;
        }
        Z2.C1191g0 c1191g0 = (Z2.C1191g0) abstractC1181b0I;
        java.lang.String str2 = c1191g0.f12639l;
        if (str2 != null) {
            u(c1191g0, str2);
        }
        java.lang.Boolean bool2 = c1191g0.f12637i;
        boolean z11 = bool2 != null && bool2.booleanValue();
        Z2.A0 a14 = (Z2.A0) this.f12657c;
        android.graphics.Paint paint2 = z6 ? a14.f12643d : a14.f12644e;
        if (z11) {
            Z2.F f25 = new Z2.F(50.0f, 9);
            Z2.F f26 = c1191g0.f12878m;
            float fD3 = f26 != null ? f26.d(this) : f25.d(this);
            Z2.F f27 = c1191g0.f12879n;
            fB = f27 != null ? f27.e(this) : f25.e(this);
            Z2.F f28 = c1191g0.f12880o;
            fB2 = f28 != null ? f28.a(this) : f25.a(this);
            f9 = fD3;
        } else {
            Z2.F f29 = c1191g0.f12878m;
            float fB7 = f29 != null ? f29.b(this, 1.0f) : 0.5f;
            Z2.F f30 = c1191g0.f12879n;
            fB = f30 != null ? f30.b(this, 1.0f) : 0.5f;
            Z2.F f31 = c1191g0.f12880o;
            f9 = fB7;
            fB2 = f31 != null ? f31.b(this, 1.0f) : 0.5f;
        }
        float f32 = fB;
        W();
        this.f12657c = x(c1191g0);
        android.graphics.Matrix matrix3 = new android.graphics.Matrix();
        if (!z11) {
            matrix3.preTranslate(c1209t.f12941b, c1209t.f12942c);
            matrix3.preScale(c1209t.f12943d, c1209t.f12944e);
        }
        android.graphics.Matrix matrix4 = c1191g0.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = c1191g0.f12636h.size();
        if (size2 == 0) {
            V();
            if (z6) {
                ((Z2.A0) this.f12657c).f12641b = false;
                return;
            } else {
                ((Z2.A0) this.f12657c).f12642c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        java.util.Iterator it2 = c1191g0.f12636h.iterator();
        int i11 = 0;
        float f33 = -1.0f;
        while (it2.hasNext()) {
            Z2.U u7 = (Z2.U) ((Z2.AbstractC1185d0) it2.next());
            java.lang.Float f34 = u7.f12810h;
            float fFloatValue2 = f34 != null ? f34.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue2 >= f33) {
                fArr2[i11] = fFloatValue2;
                f33 = fFloatValue2;
            } else {
                fArr2[i11] = f33;
            }
            W();
            a0(u7, (Z2.A0) this.f12657c);
            Z2.V v11 = ((Z2.A0) this.f12657c).f12640a;
            Z2.C1212w c1212w3 = (Z2.C1212w) v11.f12813C;
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
        android.graphics.Shader.TileMode tileMode3 = android.graphics.Shader.TileMode.CLAMP;
        int i12 = c1191g0.f12638k;
        if (i12 != 0) {
            if (i12 == 2) {
                tileMode3 = android.graphics.Shader.TileMode.MIRROR;
            } else if (i12 == 3) {
                tileMode3 = android.graphics.Shader.TileMode.REPEAT;
            }
        }
        android.graphics.Shader.TileMode tileMode4 = tileMode3;
        V();
        android.graphics.RadialGradient radialGradient = new android.graphics.RadialGradient(f9, f32, fB2, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (((Z2.A0) this.f12657c).f12640a.j.floatValue() * 256.0f);
        if (iFloatValue2 < 0) {
            iFloatValue2 = 0;
        } else if (iFloatValue2 > 255) {
            iFloatValue2 = 255;
        }
        paint2.setAlpha(iFloatValue2);
    }

    public boolean o() {
        java.lang.Boolean bool = ((Z2.A0) this.f12657c).f12640a.f12811A;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
    public void p(Z2.AbstractC1179a0 abstractC1179a0, android.graphics.Path path) {
        char c9;
        float fD;
        float fE;
        float fE2;
        float fD2;
        char c10;
        Z2.AbstractC1187e0 abstractC1187e0 = ((Z2.A0) this.f12657c).f12640a.f12831i;
        boolean z6 = abstractC1187e0 instanceof Z2.K;
        android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
        if (z6) {
            Z2.AbstractC1181b0 abstractC1181b0I = ((android.support.v4.media.session.q) this.f12656b).I(((Z2.K) abstractC1187e0).f12773h);
            if (abstractC1181b0I instanceof Z2.O) {
                Z2.O o8 = (Z2.O) abstractC1181b0I;
                java.lang.Boolean bool = o8.f12795p;
                boolean z9 = bool != null && bool.booleanValue();
                java.lang.String str = o8.f12802w;
                if (str != null) {
                    w(o8, str);
                }
                if (z9) {
                    Z2.F f9 = o8.f12798s;
                    fD = f9 != null ? f9.d(this) : 0.0f;
                    Z2.F f10 = o8.f12799t;
                    fE2 = f10 != null ? f10.e(this) : 0.0f;
                    Z2.F f11 = o8.f12800u;
                    fD2 = f11 != null ? f11.d(this) : 0.0f;
                    Z2.F f12 = o8.f12801v;
                    fE = f12 != null ? f12.e(this) : 0.0f;
                    c9 = 0;
                } else {
                    Z2.F f13 = o8.f12798s;
                    float fB = f13 != null ? f13.b(this, 1.0f) : 0.0f;
                    Z2.F f14 = o8.f12799t;
                    float fB2 = f14 != null ? f14.b(this, 1.0f) : 0.0f;
                    Z2.F f15 = o8.f12800u;
                    float fB3 = f15 != null ? f15.b(this, 1.0f) : 0.0f;
                    Z2.F f16 = o8.f12801v;
                    float fB4 = f16 != null ? f16.b(this, 1.0f) : 0.0f;
                    Z2.C1209t c1209t = abstractC1179a0.f12855h;
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
                Z2.C1208s c1208s = o8.f12876n;
                if (c1208s == null) {
                    c1208s = Z2.C1208s.f12932d;
                }
                W();
                canvas.clipPath(path);
                Z2.A0 a2 = new Z2.A0();
                Z(a2, Z2.V.a());
                a2.f12640a.f12843v = java.lang.Boolean.FALSE;
                y(o8, a2);
                this.f12657c = a2;
                Z2.C1209t c1209t2 = abstractC1179a0.f12855h;
                android.graphics.Matrix matrix = o8.f12797r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                    if (o8.f12797r.invert(matrix2)) {
                        Z2.C1209t c1209t3 = abstractC1179a0.f12855h;
                        float f22 = c1209t3.f12941b;
                        float f23 = c1209t3.f12942c;
                        float fC = c1209t3.c();
                        c10 = 1;
                        Z2.C1209t c1209t4 = abstractC1179a0.f12855h;
                        float f24 = c1209t4.f12942c;
                        float fC2 = c1209t4.c();
                        float fD3 = abstractC1179a0.f12855h.d();
                        Z2.C1209t c1209t5 = abstractC1179a0.f12855h;
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
                        android.graphics.RectF rectF = new android.graphics.RectF(f26, f27, f26, f27);
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
                        c1209t2 = new Z2.C1209t(f30, f31, rectF.right - f30, rectF.bottom - f31);
                    } else {
                        c10 = 1;
                    }
                } else {
                    c10 = 1;
                }
                float fFloor = (((float) java.lang.Math.floor((c1209t2.f12941b - fD) / fD2)) * fD2) + fD;
                float fC3 = c1209t2.c();
                float fD5 = c1209t2.d();
                Z2.C1209t c1209t6 = new Z2.C1209t(0.0f, 0.0f, fD2, fE);
                boolean zL = L();
                for (float fFloor2 = (((float) java.lang.Math.floor((c1209t2.f12942c - fE2) / fE)) * fE) + fE2; fFloor2 < fD5; fFloor2 += fE) {
                    float f32 = fFloor;
                    while (f32 < fC3) {
                        c1209t6.f12941b = f32;
                        c1209t6.f12942c = fFloor2;
                        W();
                        if (!((Z2.A0) this.f12657c).f12640a.f12843v.booleanValue()) {
                            S(c1209t6.f12941b, c1209t6.f12942c, c1209t6.f12943d, c1209t6.f12944e);
                        }
                        Z2.C1209t c1209t7 = o8.f12888o;
                        if (c1209t7 != null) {
                            canvas.concat(h(c1209t6, c1209t7, c1208s));
                        } else {
                            java.lang.Boolean bool2 = o8.f12796q;
                            char c11 = (bool2 == null || bool2.booleanValue()) ? c10 : c9;
                            canvas.translate(f32, fFloor2);
                            if (c11 == 0) {
                                Z2.C1209t c1209t8 = abstractC1179a0.f12855h;
                                canvas.scale(c1209t8.f12943d, c1209t8.f12944e);
                            }
                        }
                        java.util.Iterator it = o8.f12851i.iterator();
                        while (it.hasNext()) {
                            N((Z2.AbstractC1185d0) it.next());
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
        canvas.drawPath(path, ((Z2.A0) this.f12657c).f12643d);
    }

    public void q(android.graphics.Path path) {
        Z2.A0 a2 = (Z2.A0) this.f12657c;
        int i3 = a2.f12640a.f12828S;
        android.graphics.Canvas canvas = (android.graphics.Canvas) this.f12655a;
        if (i3 != 2) {
            canvas.drawPath(path, a2.f12644e);
            return;
        }
        android.graphics.Matrix matrix = canvas.getMatrix();
        android.graphics.Path path2 = new android.graphics.Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new android.graphics.Matrix());
        android.graphics.Shader shader = ((Z2.A0) this.f12657c).f12644e.getShader();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            android.graphics.Matrix matrix3 = new android.graphics.Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, ((Z2.A0) this.f12657c).f12644e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public void r(Z2.o0 o0Var, R8.i iVar) {
        float f9;
        float fE;
        float fD;
        int iZ;
        if (o()) {
            java.util.Iterator it = o0Var.f12851i.iterator();
            boolean z6 = true;
            while (it.hasNext()) {
                Z2.AbstractC1185d0 abstractC1185d0 = (Z2.AbstractC1185d0) it.next();
                if (abstractC1185d0 instanceof Z2.r0) {
                    iVar.A(X(((Z2.r0) abstractC1185d0).f12930c, z6, !it.hasNext()));
                } else if (iVar.n((Z2.o0) abstractC1185d0)) {
                    float fE2 = 0.0f;
                    if (abstractC1185d0 instanceof Z2.p0) {
                        W();
                        Z2.p0 p0Var = (Z2.p0) abstractC1185d0;
                        a0(p0Var, (Z2.A0) this.f12657c);
                        if (o() && c0()) {
                            Z2.AbstractC1181b0 abstractC1181b0I = p0Var.f12869a.I(p0Var.f12910n);
                            if (abstractC1181b0I == null) {
                                s("TextPath reference '%s' not found", p0Var.f12910n);
                            } else {
                                Z2.L l2 = (Z2.L) abstractC1181b0I;
                                android.graphics.Path path = new Z2.w0(l2.f12780o).f12963a;
                                android.graphics.Matrix matrix = l2.f12651n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
                                Z2.F f10 = p0Var.f12911o;
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
                                r(p0Var, new Z2.x0(this, path, fE2));
                                if (zL) {
                                    K(p0Var.f12855h);
                                }
                            }
                        }
                        V();
                    } else if (abstractC1185d0 instanceof Z2.C1201l0) {
                        W();
                        Z2.C1201l0 c1201l0 = (Z2.C1201l0) abstractC1185d0;
                        a0(c1201l0, (Z2.A0) this.f12657c);
                        if (o()) {
                            java.util.ArrayList arrayList = c1201l0.f12916n;
                            boolean z9 = arrayList != null && arrayList.size() > 0;
                            boolean z10 = iVar instanceof Z2.y0;
                            if (z10) {
                                float fD2 = !z9 ? ((Z2.y0) iVar).f12969n : ((Z2.F) c1201l0.f12916n.get(0)).d(this);
                                java.util.ArrayList arrayList2 = c1201l0.f12917o;
                                fE = (arrayList2 == null || arrayList2.size() == 0) ? ((Z2.y0) iVar).f12970o : ((Z2.F) c1201l0.f12917o.get(0)).e(this);
                                java.util.ArrayList arrayList3 = c1201l0.f12918p;
                                fD = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((Z2.F) c1201l0.f12918p.get(0)).d(this);
                                java.util.ArrayList arrayList4 = c1201l0.f12919q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    fE2 = ((Z2.F) c1201l0.f12919q.get(0)).e(this);
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
                                Z2.y0 y0Var = (Z2.y0) iVar;
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
                    } else if (abstractC1185d0 instanceof Z2.C1199k0) {
                        W();
                        Z2.C1199k0 c1199k0 = (Z2.C1199k0) abstractC1185d0;
                        a0(c1199k0, (Z2.A0) this.f12657c);
                        if (o()) {
                            j(c1199k0.f12894o);
                            Z2.AbstractC1181b0 abstractC1181b0I2 = abstractC1185d0.f12869a.I(c1199k0.f12893n);
                            if (abstractC1181b0I2 == null || !(abstractC1181b0I2 instanceof Z2.o0)) {
                                s("Tref reference '%s' not found", c1199k0.f12893n);
                            } else {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                t((Z2.o0) abstractC1181b0I2, sb);
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

    public void t(Z2.o0 o0Var, java.lang.StringBuilder sb) {
        java.util.Iterator it = o0Var.f12851i.iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            Z2.AbstractC1185d0 abstractC1185d0 = (Z2.AbstractC1185d0) it.next();
            if (abstractC1185d0 instanceof Z2.o0) {
                t((Z2.o0) abstractC1185d0, sb);
            } else if (abstractC1185d0 instanceof Z2.r0) {
                sb.append(X(((Z2.r0) abstractC1185d0).f12930c, z6, !it.hasNext()));
            }
            z6 = false;
        }
    }

    public Z2.A0 x(Z2.AbstractC1181b0 abstractC1181b0) {
        Z2.A0 a2 = new Z2.A0();
        Z(a2, Z2.V.a());
        y(abstractC1181b0, a2);
        return a2;
    }

    public void y(Z2.AbstractC1181b0 abstractC1181b0, Z2.A0 a2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        Z2.AbstractC1185d0 abstractC1185d0 = abstractC1181b0;
        while (true) {
            if (abstractC1185d0 instanceof Z2.AbstractC1181b0) {
                arrayList.add(0, (Z2.AbstractC1181b0) abstractC1185d0);
            }
            java.lang.Object obj = abstractC1185d0.f12870b;
            if (obj == null) {
                break;
            } else {
                abstractC1185d0 = (Z2.AbstractC1185d0) obj;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a0((Z2.AbstractC1181b0) it.next(), a2);
        }
        Z2.A0 a9 = (Z2.A0) this.f12657c;
        a2.g = a9.g;
        a2.f12645f = a9.f12645f;
    }

    public int z() {
        int i3;
        Z2.V v6 = ((Z2.A0) this.f12657c).f12640a;
        if (v6.f12825P == 1 || (i3 = v6.f12826Q) == 2) {
            return v6.f12826Q;
        }
        return i3 == 1 ? 3 : 1;
    }
}

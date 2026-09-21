package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {
    public static p103m.I0 g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.WeakHashMap f24922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.WeakHashMap f24923b = new java.util.WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.util.TypedValue f24924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f24925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Z2.C0 f24926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f24920f = android.graphics.PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p103m.H0 f24921h = new p103m.H0(6);

    public static synchronized p103m.I0 b() {
        try {
            if (g == null) {
                g = new p103m.I0();
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return g;
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int i3, android.graphics.PorterDuff.Mode mode) {
        android.graphics.PorterDuffColorFilter porterDuffColorFilter;
        p103m.H0 h9 = f24921h;
        h9.getClass();
        int i9 = (31 + i3) * 31;
        porterDuffColorFilter = (android.graphics.PorterDuffColorFilter) h9.f(java.lang.Integer.valueOf(mode.hashCode() + i9));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new android.graphics.PorterDuffColorFilter(i3, mode);
        }
        return porterDuffColorFilter;
    }

    public final android.graphics.drawable.Drawable a(android.content.Context context, int i3) {
        android.graphics.drawable.Drawable drawableNewDrawable;
        java.lang.ref.WeakReference weakReference;
        if (this.f24924c == null) {
            this.f24924c = new android.util.TypedValue();
        }
        android.util.TypedValue typedValue = this.f24924c;
        context.getResources().getValue(i3, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        synchronized (this) {
            p136q.r rVar = (p136q.r) this.f24923b.get(context);
            drawableNewDrawable = null;
            if (rVar != null && (weakReference = (java.lang.ref.WeakReference) rVar.b(j)) != null) {
                android.graphics.drawable.Drawable.ConstantState constantState = (android.graphics.drawable.Drawable.ConstantState) weakReference.get();
                if (constantState != null) {
                    drawableNewDrawable = constantState.newDrawable(context.getResources());
                } else {
                    rVar.e(j);
                }
            }
        }
        if (drawableNewDrawable != null) {
            return drawableNewDrawable;
        }
        android.graphics.drawable.LayerDrawable layerDrawableB = null;
        if (this.f24926e != null) {
            if (i3 == com.kiptv.tv.R.drawable.abc_cab_background_top_material) {
                layerDrawableB = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.Drawable[]{c(context, com.kiptv.tv.R.drawable.abc_cab_background_internal_bg), c(context, 2131230737)});
            } else if (i3 == com.kiptv.tv.R.drawable.abc_ratingbar_material) {
                layerDrawableB = Z2.C0.B(this, context, com.kiptv.tv.R.dimen.abc_star_big);
            } else if (i3 == com.kiptv.tv.R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableB = Z2.C0.B(this, context, com.kiptv.tv.R.dimen.abc_star_medium);
            } else if (i3 == com.kiptv.tv.R.drawable.abc_ratingbar_small_material) {
                layerDrawableB = Z2.C0.B(this, context, com.kiptv.tv.R.dimen.abc_star_small);
            }
        }
        if (layerDrawableB == null) {
            return layerDrawableB;
        }
        layerDrawableB.setChangingConfigurations(typedValue.changingConfigurations);
        synchronized (this) {
            try {
                android.graphics.drawable.Drawable.ConstantState constantState2 = layerDrawableB.getConstantState();
                if (constantState2 != null) {
                    p136q.r rVar2 = (p136q.r) this.f24923b.get(context);
                    if (rVar2 == null) {
                        rVar2 = new p136q.r((java.lang.Object) null);
                        this.f24923b.put(context, rVar2);
                    }
                    rVar2.d(j, new java.lang.ref.WeakReference(constantState2));
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return layerDrawableB;
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context context, int i3) {
        return d(context, i3, false);
    }

    public final synchronized android.graphics.drawable.Drawable d(android.content.Context context, int i3, boolean z6) {
        android.graphics.drawable.Drawable drawableA;
        try {
            if (!this.f24925d) {
                this.f24925d = true;
                android.graphics.drawable.Drawable drawableC = c(context, com.kiptv.tv.R.drawable.abc_vector_test);
                if (drawableC == null || (!(drawableC instanceof B2.b) && !"android.graphics.drawable.VectorDrawable".equals(drawableC.getClass().getName()))) {
                    this.f24925d = false;
                    throw new java.lang.IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableA = a(context, i3);
            if (drawableA == null) {
                drawableA = context.getDrawable(i3);
            }
            if (drawableA != null) {
                drawableA = g(context, i3, z6, drawableA);
            }
            if (drawableA != null) {
                p103m.AbstractC2569i0.a(drawableA);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return drawableA;
    }

    public final synchronized android.content.res.ColorStateList f(android.content.Context context, int i3) {
        android.content.res.ColorStateList colorStateList;
        p136q.T t9;
        java.util.WeakHashMap weakHashMap = this.f24922a;
        android.content.res.ColorStateList colorStateListC = null;
        colorStateList = (weakHashMap == null || (t9 = (p136q.T) weakHashMap.get(context)) == null) ? null : (android.content.res.ColorStateList) t9.d(i3);
        if (colorStateList == null) {
            Z2.C0 c9 = this.f24926e;
            if (c9 != null) {
                colorStateListC = c9.C(context, i3);
            }
            if (colorStateListC != null) {
                if (this.f24922a == null) {
                    this.f24922a = new java.util.WeakHashMap();
                }
                p136q.T t10 = (p136q.T) this.f24922a.get(context);
                if (t10 == null) {
                    t10 = new p136q.T(0);
                    this.f24922a.put(context, t10);
                }
                t10.a(i3, colorStateListC);
            }
            colorStateList = colorStateListC;
        }
        return colorStateList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0100  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final android.graphics.drawable.Drawable g(android.content.Context context, int i3, boolean z6, android.graphics.drawable.Drawable drawable) {
        int i9;
        boolean z9;
        int iRound;
        android.graphics.drawable.Drawable drawableMutate;
        int iC;
        android.content.res.ColorStateList colorStateListF = f(context, i3);
        android.graphics.PorterDuff.Mode mode = null;
        if (colorStateListF != null) {
            android.graphics.drawable.Drawable drawableMutate2 = drawable.mutate();
            drawableMutate2.setTintList(colorStateListF);
            if (this.f24926e != null && i3 == com.kiptv.tv.R.drawable.abc_switch_thumb_material) {
                mode = android.graphics.PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                drawableMutate2.setTintMode(mode);
            }
            return drawableMutate2;
        }
        if (this.f24926e != null) {
            if (i3 == com.kiptv.tv.R.drawable.abc_seekbar_track_material) {
                android.graphics.drawable.LayerDrawable layerDrawable = (android.graphics.drawable.LayerDrawable) drawable;
                android.graphics.drawable.Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC2 = p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlNormal);
                android.graphics.PorterDuff.Mode mode2 = p103m.r.f25107b;
                Z2.C0.U(drawableFindDrawableByLayerId, iC2, mode2);
                Z2.C0.U(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlNormal), mode2);
                Z2.C0.U(layerDrawable.findDrawableByLayerId(android.R.id.progress), p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i3 == com.kiptv.tv.R.drawable.abc_ratingbar_material || i3 == com.kiptv.tv.R.drawable.abc_ratingbar_indicator_material || i3 == com.kiptv.tv.R.drawable.abc_ratingbar_small_material) {
                android.graphics.drawable.LayerDrawable layerDrawable2 = (android.graphics.drawable.LayerDrawable) drawable;
                android.graphics.drawable.Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = p103m.N0.b(context, com.kiptv.tv.R.attr.colorControlNormal);
                android.graphics.PorterDuff.Mode mode3 = p103m.r.f25107b;
                Z2.C0.U(drawableFindDrawableByLayerId2, iB, mode3);
                Z2.C0.U(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlActivated), mode3);
                Z2.C0.U(layerDrawable2.findDrawableByLayerId(android.R.id.progress), p103m.N0.c(context, com.kiptv.tv.R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        Z2.C0 c9 = this.f24926e;
        boolean z10 = false;
        if (c9 != null) {
            android.graphics.PorterDuff.Mode mode4 = p103m.r.f25107b;
            if (Z2.C0.c((int[]) c9.f12655a, i3)) {
                i9 = com.kiptv.tv.R.attr.colorControlNormal;
            } else if (Z2.C0.c((int[]) c9.f12657c, i3)) {
                i9 = com.kiptv.tv.R.attr.colorControlActivated;
            } else {
                if (Z2.C0.c((int[]) c9.f12658d, i3)) {
                    mode4 = android.graphics.PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i3 == 2131230757) {
                        iRound = java.lang.Math.round(40.8f);
                        i9 = 16842800;
                        z9 = true;
                    } else {
                        if (i3 != com.kiptv.tv.R.drawable.abc_dialog_material_background) {
                            i9 = 0;
                            z9 = false;
                        }
                        iRound = -1;
                    }
                    if (z9) {
                        drawableMutate = drawable.mutate();
                        iC = p103m.N0.c(context, i9);
                        synchronized (p103m.r.class) {
                            android.graphics.PorterDuffColorFilter porterDuffColorFilterE = e(iC, mode4);
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilterE);
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z10 = true;
                    }
                }
                i9 = 16842801;
            }
            z9 = true;
            iRound = -1;
            if (z9) {
                drawableMutate = drawable.mutate();
                iC = p103m.N0.c(context, i9);
                synchronized (p103m.r.class) {
                    android.graphics.PorterDuffColorFilter porterDuffColorFilterE2 = e(iC, mode4);
                    drawableMutate.setColorFilter(porterDuffColorFilterE2);
                    if (iRound != -1) {
                        drawableMutate.setAlpha(iRound);
                    }
                    z10 = true;
                }
            }
        }
        if (z10 || !z6) {
            return drawable;
        }
        return null;
    }
}

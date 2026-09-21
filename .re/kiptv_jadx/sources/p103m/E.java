package p103m;

/* JADX INFO: loaded from: classes.dex */
public final class E extends p103m.C2601z {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p103m.D f24903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.Drawable f24904f;
    public android.content.res.ColorStateList g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f24905h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24906i;
    public boolean j;

    public E(p103m.D d4) {
        super(d4);
        this.g = null;
        this.f24905h = null;
        this.f24906i = false;
        this.j = false;
        this.f24903e = d4;
    }

    @Override // p103m.C2601z
    public final void b(android.util.AttributeSet attributeSet, int i3) {
        super.b(attributeSet, com.kiptv.tv.R.attr.seekBarStyle);
        p103m.D d4 = this.f24903e;
        android.content.Context context = d4.getContext();
        int[] iArr = h.a.g;
        j1.l lVarS = j1.l.s(context, attributeSet, iArr, com.kiptv.tv.R.attr.seekBarStyle);
        D1.U.i(d4, d4.getContext(), iArr, attributeSet, (android.content.res.TypedArray) lVarS.j, com.kiptv.tv.R.attr.seekBarStyle);
        android.graphics.drawable.Drawable drawableM = lVarS.m(0);
        if (drawableM != null) {
            d4.setThumb(drawableM);
        }
        android.graphics.drawable.Drawable drawableL = lVarS.l(1);
        android.graphics.drawable.Drawable drawable = this.f24904f;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f24904f = drawableL;
        if (drawableL != null) {
            drawableL.setCallback(d4);
            drawableL.setLayoutDirection(d4.getLayoutDirection());
            if (drawableL.isStateful()) {
                drawableL.setState(d4.getDrawableState());
            }
            f();
        }
        d4.invalidate();
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) lVarS.j;
        if (typedArray.hasValue(3)) {
            this.f24905h = p103m.AbstractC2569i0.b(typedArray.getInt(3, -1), this.f24905h);
            this.j = true;
        }
        if (typedArray.hasValue(2)) {
            this.g = lVarS.k(2);
            this.f24906i = true;
        }
        lVarS.u();
        f();
    }

    public final void f() {
        android.graphics.drawable.Drawable drawable = this.f24904f;
        if (drawable != null) {
            if (this.f24906i || this.j) {
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                this.f24904f = drawableMutate;
                if (this.f24906i) {
                    drawableMutate.setTintList(this.g);
                }
                if (this.j) {
                    this.f24904f.setTintMode(this.f24905h);
                }
                if (this.f24904f.isStateful()) {
                    this.f24904f.setState(this.f24903e.getDrawableState());
                }
            }
        }
    }

    public final void g(android.graphics.Canvas canvas) {
        if (this.f24904f != null) {
            p103m.D d4 = this.f24903e;
            int max = d4.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f24904f.getIntrinsicWidth();
                int intrinsicHeight = this.f24904f.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f24904f.setBounds(-i3, -i9, i3, i9);
                float width = ((d4.getWidth() - d4.getPaddingLeft()) - d4.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(d4.getPaddingLeft(), d4.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f24904f.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}

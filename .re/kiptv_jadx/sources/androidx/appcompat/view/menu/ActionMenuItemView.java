package androidx.appcompat.view.menu;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends p103m.Y implements p095l.y, android.view.View.OnClickListener, p103m.InterfaceC2572k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p095l.n f15634o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.CharSequence f15635p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public android.graphics.drawable.Drawable f15636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public p095l.k f15637r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p095l.C2545b f15638s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p095l.AbstractC2546c f15639t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f15640u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f15641v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f15642w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f15643x;
    public final int y;

    public ActionMenuItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        android.content.res.Resources resources = context.getResources();
        this.f15640u = h();
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.a.f22407c, 0, 0);
        this.f15642w = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.y = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f15643x = -1;
        setSaveEnabled(false);
    }

    @Override // p103m.InterfaceC2572k
    public final boolean a() {
        return !android.text.TextUtils.isEmpty(getText());
    }

    @Override // p095l.y
    public final void b(p095l.n nVar) {
        this.f15634o = nVar;
        setIcon(nVar.getIcon());
        setTitle(nVar.getTitleCondensed());
        setId(nVar.f24663a);
        setVisibility(nVar.isVisible() ? 0 : 8);
        setEnabled(nVar.isEnabled());
        if (nVar.hasSubMenu() && this.f15638s == null) {
            this.f15638s = new p095l.C2545b(this);
        }
    }

    @Override // p103m.InterfaceC2572k
    public final boolean c() {
        return !android.text.TextUtils.isEmpty(getText()) && this.f15634o.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.Button.class.getName();
    }

    @Override // p095l.y
    public p095l.n getItemData() {
        return this.f15634o;
    }

    public final boolean h() {
        android.content.res.Configuration configuration = getContext().getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (i3 < 480) {
            return (i3 >= 640 && i9 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void i() {
        boolean z6 = true;
        boolean z9 = !android.text.TextUtils.isEmpty(this.f15635p);
        if (this.f15636q != null && ((this.f15634o.y & 4) != 4 || (!this.f15640u && !this.f15641v))) {
            z6 = false;
        }
        boolean z10 = z9 & z6;
        setText(z10 ? this.f15635p : null);
        java.lang.CharSequence charSequence = this.f15634o.f24677q;
        if (android.text.TextUtils.isEmpty(charSequence)) {
            setContentDescription(z10 ? null : this.f15634o.f24667e);
        } else {
            setContentDescription(charSequence);
        }
        java.lang.CharSequence charSequence2 = this.f15634o.f24678r;
        if (android.text.TextUtils.isEmpty(charSequence2)) {
            com.google.crypto.tink.shaded.protobuf.AbstractC1911f.E(this, z10 ? null : this.f15634o.f24667e);
        } else {
            com.google.crypto.tink.shaded.protobuf.AbstractC1911f.E(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        p095l.k kVar = this.f15637r;
        if (kVar != null) {
            kVar.a(this.f15634o);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f15640u = h();
        i();
    }

    @Override // p103m.Y, android.widget.TextView, android.view.View
    public final void onMeasure(int i3, int i9) {
        int i10;
        boolean zIsEmpty = android.text.TextUtils.isEmpty(getText());
        if (!zIsEmpty && (i10 = this.f15643x) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i3, i9);
        int mode = android.view.View.MeasureSpec.getMode(i3);
        int size = android.view.View.MeasureSpec.getSize(i3);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.f15642w;
        int iMin = mode == Integer.MIN_VALUE ? java.lang.Math.min(size, i11) : i11;
        if (mode != 1073741824 && i11 > 0 && measuredWidth < iMin) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i9);
        }
        if (!zIsEmpty || this.f15636q == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f15636q.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        p095l.C2545b c2545b;
        if (this.f15634o.hasSubMenu() && (c2545b = this.f15638s) != null && c2545b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z6) {
    }

    public void setChecked(boolean z6) {
    }

    public void setExpandedFormat(boolean z6) {
        if (this.f15641v != z6) {
            this.f15641v = z6;
            p095l.n nVar = this.f15634o;
            if (nVar != null) {
                p095l.l lVar = nVar.f24674n;
                lVar.f24644k = true;
                lVar.p(true);
            }
        }
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f15636q = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i3 = this.y;
            if (intrinsicWidth > i3) {
                intrinsicHeight = (int) (intrinsicHeight * (i3 / intrinsicWidth));
                intrinsicWidth = i3;
            }
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (intrinsicWidth * (i3 / intrinsicHeight));
            } else {
                i3 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i3);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(p095l.k kVar) {
        this.f15637r = kVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i3, int i9, int i10, int i11) {
        this.f15643x = i3;
        super.setPadding(i3, i9, i10, i11);
    }

    public void setPopupCallback(p095l.AbstractC2546c abstractC2546c) {
        this.f15639t = abstractC2546c;
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        this.f15635p = charSequence;
        i();
    }
}

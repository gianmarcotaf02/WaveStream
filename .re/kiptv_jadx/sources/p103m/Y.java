package p103m;

/* JADX INFO: loaded from: classes.dex */
public class Y extends android.widget.TextView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.w0 f24983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p103m.U f24984i;
    public final p103m.C2601z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p103m.C2591u f24985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p008a8.c f24987m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.util.concurrent.Future f24988n;

    public Y(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    private p103m.C2591u getEmojiTextViewHelper() {
        if (this.f24985k == null) {
            this.f24985k = new p103m.C2591u(this);
        }
        return this.f24985k;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.a();
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    public final void g() {
        java.util.concurrent.Future future = this.f24988n;
        if (future == null) {
            return;
        }
        try {
            this.f24988n = null;
            if (future.get() != null) {
                throw new java.lang.ClassCastException();
            }
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            E8.l.y(this);
            throw null;
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (p103m.g1.f25043c) {
            return super.getAutoSizeMaxTextSize();
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            return java.lang.Math.round(u6.f24973i.f25030e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (p103m.g1.f25043c) {
            return super.getAutoSizeMinTextSize();
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            return java.lang.Math.round(u6.f24973i.f25029d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (p103m.g1.f25043c) {
            return super.getAutoSizeStepGranularity();
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            return java.lang.Math.round(u6.f24973i.f25028c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (p103m.g1.f25043c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        p103m.U u6 = this.f24984i;
        return u6 != null ? u6.f24973i.f25031f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (p103m.g1.f25043c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            return u6.f24973i.f25026a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E8.l.Q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public p103m.V getSuperCaller() {
        if (this.f24987m == null) {
            int i3 = android.os.Build.VERSION.SDK_INT;
            if (i3 >= 34) {
                this.f24987m = new p103m.X(this);
            } else if (i3 >= 28) {
                this.f24987m = new p103m.W(this);
            } else if (i3 >= 26) {
                this.f24987m = new p008a8.c(11, this);
            }
        }
        return this.f24987m;
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f24984i.d();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f24984i.e();
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public android.view.textclassifier.TextClassifier getTextClassifier() {
        p103m.C2601z c2601z;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            return super.getTextClassifier();
        }
        android.view.textclassifier.TextClassifier textClassifier = (android.view.textclassifier.TextClassifier) c2601z.f25154c;
        return textClassifier == null ? p103m.P.a((android.widget.TextView) c2601z.f25153b) : textClassifier;
    }

    public B1.b getTextMetricsParamsCompat() {
        return E8.l.y(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f24984i.getClass();
        if (android.os.Build.VERSION.SDK_INT < 30 && inputConnectionOnCreateInputConnection != null) {
            F1.d.a(editorInfo, getText());
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i3, int i9, int i10, int i11) {
        super.onLayout(z6, i3, i9, i10, i11);
        p103m.U u6 = this.f24984i;
        if (u6 == null || p103m.g1.f25043c) {
            return;
        }
        u6.f24973i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i9) {
        g();
        super.onMeasure(i3, i9);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(java.lang.CharSequence charSequence, int i3, int i9, int i10) {
        super.onTextChanged(charSequence, i3, i9, i10);
        p103m.U u6 = this.f24984i;
        if (u6 == null || p103m.g1.f25043c) {
            return;
        }
        p103m.C2559d0 c2559d0 = u6.f24973i;
        if (c2559d0.f()) {
            c2559d0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i9, int i10, int i11) {
        if (p103m.g1.f25043c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i9, i10, i11);
            return;
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.h(i3, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (p103m.g1.f25043c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.i(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (p103m.g1.f25043c) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.j(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E8.l.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        super.setFilters(((p199y3.e) getEmojiTextViewHelper().f25139b.f27782i).v(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().H(i3);
        } else {
            E8.l.J(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i3);
        } else {
            E8.l.K(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        E8.l.L(this, i3);
    }

    public void setPrecomputedText(B1.c cVar) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        E8.l.y(this);
        throw null;
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        Q0.w0 w0Var = this.f24983h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        p103m.U u6 = this.f24984i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        p103m.U u6 = this.f24984i;
        u6.l(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i3) {
        super.setTextAppearance(context, i3);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.g(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(android.view.textclassifier.TextClassifier textClassifier) {
        p103m.C2601z c2601z;
        if (android.os.Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2601z.f25154c = textClassifier;
        }
    }

    public void setTextFuture(java.util.concurrent.Future<B1.c> future) {
        this.f24988n = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(B1.b bVar) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        android.text.TextDirectionHeuristic textDirectionHeuristic2 = bVar.f584b;
        android.text.TextDirectionHeuristic textDirectionHeuristic3 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i3 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.ANYRTL_LTR) {
                i3 = 2;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LTR) {
                i3 = 3;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.RTL) {
                i3 = 4;
            } else if (textDirectionHeuristic2 == android.text.TextDirectionHeuristics.LOCALE) {
                i3 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i3 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i3 = 7;
            }
        }
        setTextDirection(i3);
        getPaint().set(bVar.f583a);
        setBreakStrategy(bVar.f585c);
        setHyphenationFrequency(bVar.f586d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i3, float f9) {
        boolean z6 = p103m.g1.f25043c;
        if (z6) {
            super.setTextSize(i3, f9);
            return;
        }
        p103m.U u6 = this.f24984i;
        if (u6 == null || z6) {
            return;
        }
        p103m.C2559d0 c2559d0 = u6.f24973i;
        if (c2559d0.f()) {
            return;
        }
        c2559d0.g(f9, i3);
    }

    @Override // android.widget.TextView
    public final void setTypeface(android.graphics.Typeface typeface, int i3) {
        android.graphics.Typeface typefaceCreate;
        if (this.f24986l) {
            return;
        }
        if (typeface == null || i3 <= 0) {
            typefaceCreate = null;
        } else {
            android.content.Context context = getContext();
            com.google.common.util.concurrent.D d4 = p182w1.d.f29765a;
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = android.graphics.Typeface.create(typeface, i3);
        }
        this.f24986l = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f24986l = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(android.content.Context context, android.util.AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        p103m.O0.a(context);
        this.f24986l = false;
        this.f24987m = null;
        p103m.N0.a(this, getContext());
        Q0.w0 w0Var = new Q0.w0(this);
        this.f24983h = w0Var;
        w0Var.k(attributeSet, i3);
        p103m.U u6 = new p103m.U(this);
        this.f24984i = u6;
        u6.f(attributeSet, i3);
        u6.b();
        p103m.C2601z c2601z = new p103m.C2601z();
        c2601z.f25153b = this;
        this.j = c2601z;
        getEmojiTextViewHelper().a(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i3, float f9) {
        int i9 = android.os.Build.VERSION.SDK_INT;
        if (i9 >= 34) {
            getSuperCaller().J(i3, f9);
        } else if (i9 >= 34) {
            D1.C.l(this, i3, f9);
        } else {
            E8.l.L(this, java.lang.Math.round(android.util.TypedValue.applyDimension(i3, f9, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i9, int i10, int i11) {
        android.content.Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i3) : null, i9 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i9) : null, i10 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i10) : null, i11 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i11) : null);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i3, int i9, int i10, int i11) {
        android.content.Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i3) : null, i9 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i9) : null, i10 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i10) : null, i11 != 0 ? com.google.common.util.concurrent.AbstractC1903s.y(context, i11) : null);
        p103m.U u6 = this.f24984i;
        if (u6 != null) {
            u6.b();
        }
    }
}

package p103m;

/* JADX INFO: renamed from: m.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2578n extends android.widget.AutoCompleteTextView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f25082k = {android.R.attr.popupBackground};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.w0 f25083h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p103m.U f25084i;
    public final p103m.C2601z j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2578n(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        p103m.O0.a(context);
        p103m.N0.a(this, getContext());
        j1.l lVarS = j1.l.s(getContext(), attributeSet, f25082k, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        if (((android.content.res.TypedArray) lVarS.j).hasValue(0)) {
            setDropDownBackgroundDrawable(lVarS.l(0));
        }
        lVarS.u();
        Q0.w0 w0Var = new Q0.w0(this);
        this.f25083h = w0Var;
        w0Var.k(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        p103m.U u6 = new p103m.U(this);
        this.f25084i = u6;
        u6.f(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        u6.b();
        p103m.C2601z c2601z = new p103m.C2601z(this);
        this.j = c2601z;
        c2601z.b(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (keyListener instanceof android.text.method.NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        android.text.method.KeyListener keyListenerA = c2601z.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.a();
        }
        p103m.U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E8.l.Q(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25084i.d();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25084i.e();
    }

    @Override // android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.google.crypto.tink.shaded.protobuf.AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.j.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E8.l.R(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(com.google.common.util.concurrent.AbstractC1903s.y(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.j.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.j.a(keyListener));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        Q0.w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        p103m.U u6 = this.f25084i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        p103m.U u6 = this.f25084i;
        u6.l(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i3) {
        super.setTextAppearance(context, i3);
        p103m.U u6 = this.f25084i;
        if (u6 != null) {
            u6.g(context, i3);
        }
    }
}

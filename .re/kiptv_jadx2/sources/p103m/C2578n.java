package p103m;

import Q0.w0;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import j1.l;

public class C2578n extends AutoCompleteTextView {

    public static final int[] f25082k = {R.attr.popupBackground};

    public final w0 f25083h;

    public final U f25084i;
    public final C2601z j;

    public C2578n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        O0.a(context);
        N0.a(this, getContext());
        l lVarS = l.s(getContext(), attributeSet, f25082k, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) lVarS.j).hasValue(0)) {
            setDropDownBackgroundDrawable(lVarS.l(0));
        }
        lVarS.u();
        w0 w0Var = new w0(this);
        this.f25083h = w0Var;
        w0Var.k(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        U u6 = new U(this);
        this.f25084i = u6;
        u6.f(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        u6.b();
        C2601z c2601z = new C2601z(this);
        this.j = c2601z;
        c2601z.b(attributeSet, com.kiptv.tv.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = c2601z.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.a();
        }
        U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E8.l.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25084i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25084i.e();
    }

    @Override
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        return this.j.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f25084i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E8.l.R(callback, this));
    }

    @Override
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC1903s.y(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.j.d(z6);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.j.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f25083h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f25084i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f25084i;
        u6.l(mode);
        u6.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        U u6 = this.f25084i;
        if (u6 != null) {
            u6.g(context, i3);
        }
    }
}

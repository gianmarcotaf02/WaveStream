package p103m;

import A.a;
import D1.C0219e;
import D1.C0222g;
import D1.InterfaceC0217d;
import D1.InterfaceC0234t;
import D1.U;
import E8.l;
import F1.d;
import F1.e;
import F1.f;
import F1.g;
import H1.j;
import Q0.w0;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.kiptv.tv.R;

public final class C2589t extends EditText implements InterfaceC0234t {

    public final w0 f25119h;

    public final U f25120i;
    public final C2601z j;

    public final j f25121k;

    public final C2601z f25122l;

    public C2587s f25123m;

    public C2589t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        O0.a(context);
        N0.a(this, getContext());
        w0 w0Var = new w0(this);
        this.f25119h = w0Var;
        w0Var.k(attributeSet, R.attr.editTextStyle);
        U u6 = new U(this);
        this.f25120i = u6;
        u6.f(attributeSet, R.attr.editTextStyle);
        u6.b();
        C2601z c2601z = new C2601z();
        c2601z.f25153b = this;
        this.j = c2601z;
        this.f25121k = new j();
        C2601z c2601z2 = new C2601z(this);
        this.f25122l = c2601z2;
        c2601z2.b(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener keyListenerA = c2601z2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private C2587s getSuperCaller() {
        if (this.f25123m == null) {
            this.f25123m = new C2587s(this);
        }
        return this.f25123m;
    }

    @Override
    public final C0222g a(C0222g c0222g) {
        this.f25121k.getClass();
        return j.a(this, c0222g);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.a();
        }
        U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return l.Q(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25120i.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25120i.e();
    }

    @Override
    public TextClassifier getTextClassifier() {
        C2601z c2601z;
        if (Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c2601z.f25154c;
        return textClassifier == null ? P.a((TextView) c2601z.f25153b) : textClassifier;
    }

    @Override
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrE;
        String[] stringArray;
        InputConnection gVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f25120i.getClass();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 && inputConnectionOnCreateInputConnection != null) {
            d.a(editorInfo, getText());
        }
        AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i3 <= 30 && (strArrE = U.e(this)) != null) {
            if (i3 >= 25) {
                editorInfo.contentMimeTypes = strArrE;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
            }
            e eVar = new e(0, this);
            if (i3 >= 25) {
                gVar = new f(inputConnectionOnCreateInputConnection, eVar);
            } else {
                String[] strArr = d.f3511a;
                if (i3 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    Bundle bundle = editorInfo.extras;
                    if (bundle != null) {
                        stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        if (stringArray == null) {
                            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
                        }
                        if (stringArray != null) {
                            strArr = stringArray;
                        }
                    }
                }
                if (strArr.length != 0) {
                    gVar = new g(inputConnectionOnCreateInputConnection, eVar);
                }
            }
            inputConnectionOnCreateInputConnection = gVar;
        }
        return this.f25122l.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && U.e(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = C.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override
    public final boolean onTextContextMenuItem(int i3) {
        C0219e c0219e;
        InterfaceC0217d interfaceC0217d;
        int i9;
        a aVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || U.e(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                aVar = new a(primaryClip, 1);
            } else {
                c0219e = new C0219e(0);
                c0219e.f2002i = primaryClip;
                c0219e.j = 1;
            }
            if (i3 == 16908322) {
                interfaceC0217d = c0219e;
                interfaceC0217d = aVar;
                i9 = 0;
            } else {
                interfaceC0217d = c0219e;
                interfaceC0217d = aVar;
                i9 = 1;
            }
            interfaceC0217d.setFlags(i9);
            U.h(this, interfaceC0217d.build());
        }
        return true;
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(l.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f25122l.d(z6);
    }

    @Override
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f25122l.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        U u6 = this.f25120i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        U u6 = this.f25120i;
        u6.l(mode);
        u6.b();
    }

    @Override
    public final void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        U u6 = this.f25120i;
        if (u6 != null) {
            u6.g(context, i3);
        }
    }

    @Override
    public void setTextClassifier(TextClassifier textClassifier) {
        C2601z c2601z;
        if (Build.VERSION.SDK_INT >= 28 || (c2601z = this.j) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c2601z.f25154c = textClassifier;
        }
    }

    @Override
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}

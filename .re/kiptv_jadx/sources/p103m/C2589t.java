package p103m;

/* JADX INFO: renamed from: m.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2589t extends android.widget.EditText implements D1.InterfaceC0234t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q0.w0 f25119h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p103m.U f25120i;
    public final p103m.C2601z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H1.j f25121k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p103m.C2601z f25122l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p103m.C2587s f25123m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2589t(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet, com.kiptv.tv.R.attr.editTextStyle);
        p103m.O0.a(context);
        p103m.N0.a(this, getContext());
        Q0.w0 w0Var = new Q0.w0(this);
        this.f25119h = w0Var;
        w0Var.k(attributeSet, com.kiptv.tv.R.attr.editTextStyle);
        p103m.U u6 = new p103m.U(this);
        this.f25120i = u6;
        u6.f(attributeSet, com.kiptv.tv.R.attr.editTextStyle);
        u6.b();
        p103m.C2601z c2601z = new p103m.C2601z();
        c2601z.f25153b = this;
        this.j = c2601z;
        this.f25121k = new H1.j();
        p103m.C2601z c2601z2 = new p103m.C2601z(this);
        this.f25122l = c2601z2;
        c2601z2.b(attributeSet, com.kiptv.tv.R.attr.editTextStyle);
        android.text.method.KeyListener keyListener = getKeyListener();
        if (keyListener instanceof android.text.method.NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = isFocusable();
        boolean zIsClickable = isClickable();
        boolean zIsLongClickable = isLongClickable();
        int inputType = getInputType();
        android.text.method.KeyListener keyListenerA = c2601z2.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        setRawInputType(inputType);
        setFocusable(zIsFocusable);
        setClickable(zIsClickable);
        setLongClickable(zIsLongClickable);
    }

    private p103m.C2587s getSuperCaller() {
        if (this.f25123m == null) {
            this.f25123m = new p103m.C2587s(this);
        }
        return this.f25123m;
    }

    @Override // D1.InterfaceC0234t
    public final D1.C0222g a(D1.C0222g c0222g) {
        this.f25121k.getClass();
        return H1.j.a(this, c0222g);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.a();
        }
        p103m.U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public android.view.ActionMode.Callback getCustomSelectionActionModeCallback() {
        return E8.l.Q(super.getCustomSelectionActionModeCallback());
    }

    public android.content.res.ColorStateList getSupportBackgroundTintList() {
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            return w0Var.h();
        }
        return null;
    }

    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            return w0Var.i();
        }
        return null;
    }

    public android.content.res.ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f25120i.d();
    }

    public android.graphics.PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f25120i.e();
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

    /* JADX WARN: Code duplicated, block: B:26:0x005f A[PHI: r1
  0x005f: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:33:0x0072, B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo editorInfo) {
        java.lang.String[] strArrE;
        java.lang.String[] stringArray;
        android.view.inputmethod.InputConnection gVar;
        android.view.inputmethod.InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f25120i.getClass();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 30 && inputConnectionOnCreateInputConnection != null) {
            F1.d.a(editorInfo, getText());
        }
        com.google.crypto.tink.shaded.protobuf.AbstractC1909d.d0(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i3 <= 30 && (strArrE = D1.U.e(this)) != null) {
            if (i3 >= 25) {
                editorInfo.contentMimeTypes = strArrE;
            } else {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new android.os.Bundle();
                }
                editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
                editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArrE);
            }
            F1.e eVar = new F1.e(0, this);
            if (i3 >= 25) {
                gVar = new F1.f(inputConnectionOnCreateInputConnection, eVar);
            } else {
                java.lang.String[] strArr = F1.d.f3511a;
                if (i3 >= 25) {
                    stringArray = editorInfo.contentMimeTypes;
                    if (stringArray != null) {
                        strArr = stringArray;
                    }
                } else {
                    android.os.Bundle bundle = editorInfo.extras;
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
                    gVar = new F1.g(inputConnectionOnCreateInputConnection, eVar);
                }
            }
            inputConnectionOnCreateInputConnection = gVar;
        }
        return this.f25122l.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 < 30 || i3 >= 33) {
            return;
        }
        ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(android.view.DragEvent dragEvent) {
        android.app.Activity activity;
        boolean zA = false;
        if (android.os.Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && D1.U.e(this) != null) {
            android.content.Context context = getContext();
            while (true) {
                if (!(context instanceof android.content.ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof android.app.Activity) {
                    activity = (android.app.Activity) context;
                    break;
                }
                context = ((android.content.ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                android.util.Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = p103m.C.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i3) {
        D1.C0219e c0219e;
        D1.InterfaceC0217d interfaceC0217d;
        int i9;
        A.a aVar;
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 >= 31 || D1.U.e(this) == null || !(i3 == 16908322 || i3 == 16908337)) {
            return super.onTextContextMenuItem(i3);
        }
        android.content.ClipboardManager clipboardManager = (android.content.ClipboardManager) getContext().getSystemService("clipboard");
        android.content.ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                aVar = new A.a(primaryClip, 1);
            } else {
                c0219e = new D1.C0219e(0);
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
            D1.U.h(this, interfaceC0217d.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.o(i3);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p103m.U u6 = this.f25120i;
        if (u6 != null) {
            u6.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(android.view.ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(E8.l.R(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        this.f25122l.d(z6);
    }

    @Override // android.widget.TextView
    public void setKeyListener(android.text.method.KeyListener keyListener) {
        super.setKeyListener(this.f25122l.a(keyListener));
    }

    public void setSupportBackgroundTintList(android.content.res.ColorStateList colorStateList) {
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode) {
        Q0.w0 w0Var = this.f25119h;
        if (w0Var != null) {
            w0Var.u(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(android.content.res.ColorStateList colorStateList) {
        p103m.U u6 = this.f25120i;
        u6.k(colorStateList);
        u6.b();
    }

    public void setSupportCompoundDrawablesTintMode(android.graphics.PorterDuff.Mode mode) {
        p103m.U u6 = this.f25120i;
        u6.l(mode);
        u6.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(android.content.Context context, int i3) {
        super.setTextAppearance(context, i3);
        p103m.U u6 = this.f25120i;
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

    @Override // android.widget.EditText, android.widget.TextView
    public android.text.Editable getText() {
        return android.os.Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }
}

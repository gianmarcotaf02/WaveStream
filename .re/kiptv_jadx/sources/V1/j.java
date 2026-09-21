package V1;

/* JADX INFO: loaded from: classes.dex */
public final class j implements android.text.TextWatcher {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.widget.EditText f10245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public V1.i f10246i;
    public boolean j = true;

    public j(android.widget.EditText editText) {
        this.f10245h = editText;
    }

    public static void a(android.widget.EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            android.text.Editable editableText = editText.getEditableText();
            int selectionStart = android.text.Selection.getSelectionStart(editableText);
            int selectionEnd = android.text.Selection.getSelectionEnd(editableText);
            T1.j jVarA = T1.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                android.text.Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                android.text.Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                android.text.Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(java.lang.CharSequence charSequence, int i3, int i9, int i10) throws java.lang.Throwable {
        android.widget.EditText editText = this.f10245h;
        if (!editText.isInEditMode() && this.j && T1.j.d() && i9 <= i10 && (charSequence instanceof android.text.Spannable)) {
            int iC = T1.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    T1.j.a().g(i3, i10 + i3, 0, (android.text.Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            T1.j jVarA = T1.j.a();
            if (this.f10246i == null) {
                this.f10246i = new V1.i(editText);
            }
            jVarA.h(this.f10246i);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(java.lang.CharSequence charSequence, int i3, int i9, int i10) {
    }
}

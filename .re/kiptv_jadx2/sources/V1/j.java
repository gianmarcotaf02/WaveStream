package V1;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

public final class j implements TextWatcher {

    public final EditText f10245h;

    public i f10246i;
    public boolean j = true;

    public j(EditText editText) {
        this.f10245h = editText;
    }

    public static void a(EditText editText, int i3) {
        int length;
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            T1.j jVarA = T1.j.a();
            if (editableText == null) {
                length = 0;
            } else {
                jVarA.getClass();
                length = editableText.length();
            }
            jVarA.g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i3, int i9, int i10) throws Throwable {
        EditText editText = this.f10245h;
        if (!editText.isInEditMode() && this.j && T1.j.d() && i9 <= i10 && (charSequence instanceof Spannable)) {
            int iC = T1.j.a().c();
            if (iC != 0) {
                if (iC == 1) {
                    T1.j.a().g(i3, i10 + i3, 0, (Spannable) charSequence);
                    return;
                } else if (iC != 3) {
                    return;
                }
            }
            T1.j jVarA = T1.j.a();
            if (this.f10246i == null) {
                this.f10246i = new i(editText);
            }
            jVarA.h(this.f10246i);
        }
    }

    @Override
    public final void afterTextChanged(Editable editable) {
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i3, int i9, int i10) {
    }
}

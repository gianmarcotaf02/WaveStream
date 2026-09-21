package V1;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;

public final class c extends InputConnectionWrapper {

    public final EditText f10234a;

    public final b f10235b;

    public c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        b bVar = new b(0);
        super(inputConnection, false);
        this.f10234a = editText;
        this.f10235b = bVar;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
    }

    @Override
    public final boolean deleteSurroundingText(int i3, int i9) {
        Editable editableText = this.f10234a.getEditableText();
        this.f10235b.getClass();
        return b.h(this, editableText, i3, i9, false) || super.deleteSurroundingText(i3, i9);
    }

    @Override
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        Editable editableText = this.f10234a.getEditableText();
        this.f10235b.getClass();
        return b.h(this, editableText, i3, i9, true) || super.deleteSurroundingTextInCodePoints(i3, i9);
    }
}

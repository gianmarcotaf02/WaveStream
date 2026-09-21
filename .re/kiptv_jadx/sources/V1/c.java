package V1;

/* JADX INFO: loaded from: classes.dex */
public final class c extends android.view.inputmethod.InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.widget.EditText f10234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f10235b;

    public c(android.widget.EditText editText, android.view.inputmethod.InputConnection inputConnection, android.view.inputmethod.EditorInfo editorInfo) {
        V1.b bVar = new V1.b(0);
        super(inputConnection, false);
        this.f10234a = editText;
        this.f10235b = bVar;
        if (T1.j.d()) {
            T1.j.a().i(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i3, int i9) {
        android.text.Editable editableText = this.f10234a.getEditableText();
        this.f10235b.getClass();
        return V1.b.h(this, editableText, i3, i9, false) || super.deleteSurroundingText(i3, i9);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i3, int i9) {
        android.text.Editable editableText = this.f10234a.getEditableText();
        this.f10235b.getClass();
        return V1.b.h(this, editableText, i3, i9, true) || super.deleteSurroundingTextInCodePoints(i3, i9);
    }
}

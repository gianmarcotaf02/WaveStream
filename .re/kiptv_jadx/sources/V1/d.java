package V1;

/* JADX INFO: loaded from: classes.dex */
public final class d extends T1.h implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f10236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f10237i;

    public d(android.widget.TextView textView, V1.e eVar) {
        this.f10236h = new java.lang.ref.WeakReference(textView);
        this.f10237i = new java.lang.ref.WeakReference(eVar);
    }

    @Override // T1.h
    public final void b() {
        android.os.Handler handler;
        android.widget.TextView textView = (android.widget.TextView) this.f10236h.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() throws java.lang.Throwable {
        android.text.InputFilter[] filters;
        int length;
        android.widget.TextView textView = (android.widget.TextView) this.f10236h.get();
        android.text.InputFilter inputFilter = (android.text.InputFilter) this.f10237i.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (android.text.InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    java.lang.CharSequence text = textView.getText();
                    T1.j jVarA = T1.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        jVarA.getClass();
                        length = text.length();
                    }
                    java.lang.CharSequence charSequenceG = jVarA.g(0, length, 0, text);
                    if (text == charSequenceG) {
                        return;
                    }
                    int selectionStart = android.text.Selection.getSelectionStart(charSequenceG);
                    int selectionEnd = android.text.Selection.getSelectionEnd(charSequenceG);
                    textView.setText(charSequenceG);
                    if (charSequenceG instanceof android.text.Spannable) {
                        android.text.Spannable spannable = (android.text.Spannable) charSequenceG;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            android.text.Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            android.text.Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                android.text.Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}

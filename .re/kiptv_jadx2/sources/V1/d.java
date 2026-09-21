package V1;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public final class d extends T1.h implements Runnable {

    public final WeakReference f10236h;

    public final WeakReference f10237i;

    public d(TextView textView, e eVar) {
        this.f10236h = new WeakReference(textView);
        this.f10237i = new WeakReference(eVar);
    }

    @Override
    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.f10236h.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override
    public final void run() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f10236h.get();
        InputFilter inputFilter = (InputFilter) this.f10237i.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    T1.j jVarA = T1.j.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        jVarA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceG = jVarA.g(0, length, 0, text);
                    if (text == charSequenceG) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceG);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceG);
                    textView.setText(charSequenceG);
                    if (charSequenceG instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceG;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
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

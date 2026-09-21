package V1;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

public final class i extends T1.h implements Runnable {

    public final WeakReference f10244h;

    public i(EditText editText) {
        this.f10244h = new WeakReference(editText);
    }

    @Override
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.f10244h.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override
    public final void run() {
        j.a((EditText) this.f10244h.get(), 1);
    }
}

package W5;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

public final class h {

    public final HashSet f10606a = new HashSet();

    public final void a() {
        if (E8.d.g == null) {
            E8.d.g = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() != E8.d.g) {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
        Iterator it = this.f10606a.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}

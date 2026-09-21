package R0;

import android.view.Choreographer;
import java.util.ArrayList;

public final class W implements Choreographer.FrameCallback, Runnable {

    public final X f8851h;

    public W(X x9) {
        this.f8851h = x9;
    }

    @Override
    public final void doFrame(long j) {
        this.f8851h.j.removeCallbacks(this);
        X.Z(this.f8851h);
        X x9 = this.f8851h;
        synchronized (x9.f8856k) {
            if (x9.f8861p) {
                x9.f8861p = false;
                ArrayList arrayList = x9.f8858m;
                x9.f8858m = x9.f8859n;
                x9.f8859n = arrayList;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((Choreographer.FrameCallback) arrayList.get(i3)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override
    public final void run() {
        X.Z(this.f8851h);
        X x9 = this.f8851h;
        synchronized (x9.f8856k) {
            if (x9.f8858m.isEmpty()) {
                x9.f8855i.removeFrameCallback(this);
                x9.f8861p = false;
            }
        }
    }
}

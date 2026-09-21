package R0;

import S7.AbstractC0906w;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

public final class X extends AbstractC0906w {

    public static final p070h6.p f8853s = com.google.common.util.concurrent.D.B(M.f8813n);

    public static final B4.a f8854t = new B4.a(8);

    public final Choreographer f8855i;
    public final Handler j;

    public boolean f8860o;

    public boolean f8861p;

    public final Z f8863r;

    public final Object f8856k = new Object();

    public final p078i6.l f8857l = new p078i6.l();

    public ArrayList f8858m = new ArrayList();

    public ArrayList f8859n = new ArrayList();

    public final W f8862q = new W(this);

    public X(Choreographer choreographer, Handler handler) {
        this.f8855i = choreographer;
        this.j = handler;
        this.f8863r = new Z(choreographer, this);
    }

    public static final void Z(X x9) {
        Runnable runnable;
        boolean z6;
        do {
            synchronized (x9.f8856k) {
                p078i6.l lVar = x9.f8857l;
                runnable = (Runnable) (lVar.isEmpty() ? null : lVar.removeFirst());
            }
            while (runnable != null) {
                runnable.run();
                synchronized (x9.f8856k) {
                    p078i6.l lVar2 = x9.f8857l;
                    runnable = (Runnable) (lVar2.isEmpty() ? null : lVar2.removeFirst());
                }
            }
            synchronized (x9.f8856k) {
                if (x9.f8857l.isEmpty()) {
                    z6 = false;
                    x9.f8860o = false;
                } else {
                    z6 = true;
                }
            }
        } while (z6);
    }

    @Override
    public final void V(p100l6.h hVar, Runnable runnable) {
        synchronized (this.f8856k) {
            this.f8857l.addLast(runnable);
            if (!this.f8860o) {
                this.f8860o = true;
                this.j.post(this.f8862q);
                if (!this.f8861p) {
                    this.f8861p = true;
                    this.f8855i.postFrameCallback(this.f8862q);
                }
            }
        }
    }
}

package p019c;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;

public abstract class n {

    public boolean f18072a;

    public final CopyOnWriteArrayList f18073b = new CopyOnWriteArrayList();

    public j f18074c;

    public n(boolean z6) {
        this.f18072a = z6;
    }

    public abstract void b();

    public void c(a backEvent) {
        m.e(backEvent, "backEvent");
    }

    public void d(a backEvent) {
        m.e(backEvent, "backEvent");
    }

    public final void e() {
        Iterator it = this.f18073b.iterator();
        while (it.hasNext()) {
            ((b) it.next()).cancel();
        }
    }

    public final void f(boolean z6) {
        this.f18072a = z6;
        ?? r9 = this.f18074c;
        if (r9 != 0) {
            r9.invoke();
        }
    }

    public void a() {
    }
}

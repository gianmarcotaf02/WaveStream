package p121o0;

import p089k0.a;

public abstract class u implements t {

    public final a f26025h = new a(0);

    public final boolean c(int i3) {
        return (i3 & this.f26025h.get()) != 0;
    }

    public final void f(int i3) {
        a aVar;
        int i9;
        do {
            aVar = this.f26025h;
            i9 = aVar.get();
            if ((i9 & i3) != 0) {
                return;
            }
        } while (!aVar.compareAndSet(i9, i9 | i3));
    }
}

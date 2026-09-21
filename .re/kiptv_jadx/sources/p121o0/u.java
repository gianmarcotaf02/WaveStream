package p121o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class u implements p121o0.t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p089k0.a f26025h = new p089k0.a(0);

    public final boolean c(int i3) {
        return (i3 & this.f26025h.get()) != 0;
    }

    public final void f(int i3) {
        p089k0.a aVar;
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

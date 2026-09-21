package Z7;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends S7.Y implements java.util.concurrent.Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Z7.d f13044i = new Z7.d();
    public static final S7.AbstractC0906w j;

    static {
        Z7.l lVar = Z7.l.f13055i;
        int i3 = X7.s.f10935a;
        if (64 >= i3) {
            i3 = 64;
        }
        j = lVar.Y(X7.a.l(i3, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        j.V(hVar, runnable);
    }

    @Override // S7.AbstractC0906w
    public final void W(p100l6.h hVar, java.lang.Runnable runnable) {
        j.W(hVar, runnable);
    }

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        return Z7.l.f13055i.Y(i3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        V(p100l6.i.f24820h, runnable);
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "Dispatchers.IO";
    }
}

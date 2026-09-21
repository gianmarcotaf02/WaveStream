package G2;

/* JADX INFO: loaded from: classes.dex */
public final class e extends S7.AbstractC0906w {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater f3779k = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(G2.e.class, "j");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final S7.AbstractC0906w f3780i;
    public volatile /* synthetic */ int j = 1;

    public e(S7.AbstractC0906w abstractC0906w) {
        this.f3780i = abstractC0906w;
    }

    @Override // S7.AbstractC0906w
    public final void V(p100l6.h hVar, java.lang.Runnable runnable) {
        Z().V(hVar, runnable);
    }

    @Override // S7.AbstractC0906w
    public final void W(p100l6.h hVar, java.lang.Runnable runnable) {
        Z().W(hVar, runnable);
    }

    @Override // S7.AbstractC0906w
    public final boolean X(p100l6.h hVar) {
        return Z().X(hVar);
    }

    @Override // S7.AbstractC0906w
    public final S7.AbstractC0906w Y(int i3) {
        return Z().Y(i3);
    }

    public final S7.AbstractC0906w Z() {
        return f3779k.get(this) == 1 ? S7.M.f9550b : this.f3780i;
    }

    @Override // S7.AbstractC0906w
    public final java.lang.String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f3780i + ')';
    }
}

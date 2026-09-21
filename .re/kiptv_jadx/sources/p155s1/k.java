package p155s1;

/* JADX INFO: loaded from: classes.dex */
public final class k implements com.google.common.util.concurrent.J {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f27251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p155s1.j f27252i = new p155s1.j(this);

    public k(p155s1.h hVar) {
        this.f27251h = new java.lang.ref.WeakReference(hVar);
    }

    @Override // com.google.common.util.concurrent.J
    public final void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
        this.f27252i.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z6) {
        p155s1.h hVar = (p155s1.h) this.f27251h.get();
        boolean zCancel = this.f27252i.cancel(z6);
        if (zCancel && hVar != null) {
            hVar.f27246a = null;
            hVar.f27247b = null;
            hVar.f27248c.j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
        return this.f27252i.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f27252i.f27244h instanceof p155s1.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f27252i.isDone();
    }

    public final java.lang.String toString() {
        return this.f27252i.toString();
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long j, java.util.concurrent.TimeUnit timeUnit) {
        return this.f27252i.get(j, timeUnit);
    }
}

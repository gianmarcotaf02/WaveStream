package p057g2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements java.lang.AutoCloseable, S7.A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p100l6.h f21856h;

    public a(p100l6.h coroutineContext) {
        kotlin.jvm.internal.m.e(coroutineContext, "coroutineContext");
        this.f21856h = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        S7.C.k(this.f21856h, null);
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        return this.f21856h;
    }
}

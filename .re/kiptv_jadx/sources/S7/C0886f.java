package S7;

/* JADX INFO: renamed from: S7.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0886f extends S7.AbstractC0876a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Thread f9579k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final S7.X f9580l;

    public C0886f(p100l6.h hVar, java.lang.Thread thread, S7.X x9) {
        super(hVar, true, true);
        this.f9579k = thread;
        this.f9580l = x9;
    }

    @Override // S7.p0
    public final void f(java.lang.Object obj) {
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Thread thread = this.f9579k;
        if (kotlin.jvm.internal.m.a(threadCurrentThread, thread)) {
            return;
        }
        java.util.concurrent.locks.LockSupport.unpark(thread);
    }
}

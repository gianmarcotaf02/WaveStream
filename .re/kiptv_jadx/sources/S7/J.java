package S7;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends java.lang.Exception {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Throwable f9547h;

    public J(java.lang.Throwable th, S7.AbstractC0906w abstractC0906w, p100l6.h hVar) {
        super("Coroutine dispatcher " + abstractC0906w + " threw an exception, context = " + hVar, th);
        this.f9547h = th;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
        return this.f9547h;
    }
}

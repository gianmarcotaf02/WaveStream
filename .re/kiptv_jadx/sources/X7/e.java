package X7;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends java.lang.RuntimeException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient p100l6.h f10908h;

    public e(p100l6.h hVar) {
        this.f10908h = hVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return java.lang.String.valueOf(this.f10908h);
    }
}

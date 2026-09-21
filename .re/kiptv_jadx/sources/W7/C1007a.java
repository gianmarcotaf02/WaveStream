package W7;

/* JADX INFO: renamed from: W7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1007a extends java.util.concurrent.CancellationException {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient V7.InterfaceC0982h f10726h;

    public C1007a(V7.InterfaceC0982h interfaceC0982h) {
        super("Flow was aborted, no more elements needed");
        this.f10726h = interfaceC0982h;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}

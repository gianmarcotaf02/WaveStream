package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.io.Closeable f23505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.io.Serializable f23506c;

    public /* synthetic */ c(java.io.Closeable closeable, java.io.Serializable serializable, int i3) {
        this.f23504a = i3;
        this.f23505b = closeable;
        this.f23506c = serializable;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final java.lang.Object call() {
        switch (this.f23504a) {
            case 0:
                return ((io.sentry.instrumentation.file.SentryFileInputStream) this.f23505b).lambda$read$1((byte[]) this.f23506c);
            case 1:
                return ((io.sentry.instrumentation.file.SentryFileInputStream) this.f23505b).lambda$read$0((java.util.concurrent.atomic.AtomicInteger) this.f23506c);
            default:
                return ((io.sentry.instrumentation.file.SentryFileOutputStream) this.f23505b).lambda$write$1((byte[]) this.f23506c);
        }
    }
}

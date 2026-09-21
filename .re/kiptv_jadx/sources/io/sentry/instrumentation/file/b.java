package io.sentry.instrumentation.file;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte[] f23500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.io.Closeable f23503e;

    public /* synthetic */ b(java.io.Closeable closeable, byte[] bArr, int i3, int i9, int i10) {
        this.f23499a = i10;
        this.f23503e = closeable;
        this.f23500b = bArr;
        this.f23501c = i3;
        this.f23502d = i9;
    }

    @Override // io.sentry.instrumentation.file.FileIOSpanManager.FileIOCallable
    public final java.lang.Object call() {
        switch (this.f23499a) {
            case 0:
                return ((io.sentry.instrumentation.file.SentryFileInputStream) this.f23503e).lambda$read$2(this.f23500b, this.f23501c, this.f23502d);
            default:
                return ((io.sentry.instrumentation.file.SentryFileOutputStream) this.f23503e).lambda$write$2(this.f23500b, this.f23501c, this.f23502d);
        }
    }
}

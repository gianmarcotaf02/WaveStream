package io.sentry;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class r implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23534a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ io.sentry.ISerializer f23536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f23538e;

    public /* synthetic */ r(io.sentry.Attachment attachment, long j, io.sentry.ISerializer iSerializer, io.sentry.ILogger iLogger) {
        this.f23537d = attachment;
        this.f23535b = j;
        this.f23536c = iSerializer;
        this.f23538e = iLogger;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f23534a) {
            case 0:
                return io.sentry.SentryEnvelopeItem.lambda$fromAttachment$12((io.sentry.Attachment) this.f23537d, this.f23535b, this.f23536c, (io.sentry.ILogger) this.f23538e);
            default:
                return io.sentry.SentryEnvelopeItem.lambda$fromProfilingTrace$15((java.io.File) this.f23537d, this.f23535b, (io.sentry.ProfilingTraceData) this.f23538e, this.f23536c);
        }
    }

    public /* synthetic */ r(java.io.File file, long j, io.sentry.ProfilingTraceData profilingTraceData, io.sentry.ISerializer iSerializer) {
        this.f23537d = file;
        this.f23535b = j;
        this.f23538e = profilingTraceData;
        this.f23536c = iSerializer;
    }
}

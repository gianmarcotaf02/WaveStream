package io.sentry.android.replay.capture;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f23463h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f23464i;
    public final /* synthetic */ java.util.Date j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ io.sentry.protocol.SentryId f23465k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f23466l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f23467m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23468n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f23469o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.replay.capture.BaseCaptureStrategy f23470p;

    public /* synthetic */ a(io.sentry.android.replay.capture.BaseCaptureStrategy baseCaptureStrategy, long j, java.util.Date date, io.sentry.protocol.SentryId sentryId, int i3, int i9, int i10, p194x6.j jVar, int i11) {
        this.f23463h = i11;
        this.f23470p = baseCaptureStrategy;
        this.f23464i = j;
        this.j = date;
        this.f23465k = sentryId;
        this.f23466l = i3;
        this.f23467m = i9;
        this.f23468n = i10;
        this.f23469o = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23463h) {
            case 0:
                io.sentry.android.replay.capture.BufferCaptureStrategy.createCurrentSegment$lambda$4((io.sentry.android.replay.capture.BufferCaptureStrategy) this.f23470p, this.f23464i, this.j, this.f23465k, this.f23466l, this.f23467m, this.f23468n, this.f23469o);
                break;
            default:
                io.sentry.android.replay.capture.SessionCaptureStrategy.createCurrentSegment$lambda$4((io.sentry.android.replay.capture.SessionCaptureStrategy) this.f23470p, this.f23464i, this.j, this.f23465k, this.f23466l, this.f23467m, this.f23468n, this.f23469o);
                break;
        }
    }
}

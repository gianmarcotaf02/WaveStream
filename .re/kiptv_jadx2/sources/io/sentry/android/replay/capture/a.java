package io.sentry.android.replay.capture;

import io.sentry.protocol.SentryId;
import java.util.Date;
import p194x6.j;

public final class a implements Runnable {

    public final int f23463h;

    public final long f23464i;
    public final Date j;

    public final SentryId f23465k;

    public final int f23466l;

    public final int f23467m;

    public final int f23468n;

    public final j f23469o;

    public final BaseCaptureStrategy f23470p;

    public a(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, SentryId sentryId, int i3, int i9, int i10, j jVar, int i11) {
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

    @Override
    public final void run() {
        switch (this.f23463h) {
            case 0:
                BufferCaptureStrategy.createCurrentSegment$lambda$4((BufferCaptureStrategy) this.f23470p, this.f23464i, this.j, this.f23465k, this.f23466l, this.f23467m, this.f23468n, this.f23469o);
                break;
            default:
                SessionCaptureStrategy.createCurrentSegment$lambda$4((SessionCaptureStrategy) this.f23470p, this.f23464i, this.j, this.f23465k, this.f23466l, this.f23467m, this.f23468n, this.f23469o);
                break;
        }
    }
}

package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.ProgressiveMediaPeriod f16744i;

    public /* synthetic */ j(androidx.media3.exoplayer.source.ProgressiveMediaPeriod progressiveMediaPeriod, int i3) {
        this.f16743h = i3;
        this.f16744i = progressiveMediaPeriod;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16743h) {
            case 0:
                this.f16744i.lambda$onLengthKnown$2();
                break;
            case 1:
                this.f16744i.maybeFinishPrepare();
                break;
            default:
                this.f16744i.lambda$new$0();
                break;
        }
    }
}

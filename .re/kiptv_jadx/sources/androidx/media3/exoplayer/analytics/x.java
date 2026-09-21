package androidx.media3.exoplayer.analytics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16583h;

    public /* synthetic */ x(int i3) {
        this.f16583h = i3;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16583h) {
            case 0:
                return androidx.media3.exoplayer.analytics.DefaultPlaybackSessionManager.generateDefaultSessionId();
            default:
                throw new java.lang.IllegalStateException();
        }
    }
}

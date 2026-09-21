package androidx.media3.exoplayer.source;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.source.CompositeMediaSource f16728i;

    public /* synthetic */ b(androidx.media3.exoplayer.source.CompositeMediaSource compositeMediaSource, int i3) {
        this.f16727h = i3;
        this.f16728i = compositeMediaSource;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        switch (this.f16727h) {
            case 0:
                return ((androidx.media3.exoplayer.source.ConcatenatingMediaSource) this.f16728i).handleMessage(message);
            default:
                return ((androidx.media3.exoplayer.source.ConcatenatingMediaSource2) this.f16728i).handleMessage(message);
        }
    }
}

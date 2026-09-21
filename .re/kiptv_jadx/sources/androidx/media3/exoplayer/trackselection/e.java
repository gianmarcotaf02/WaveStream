package androidx.media3.exoplayer.trackselection;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16803a;

    public /* synthetic */ e(int i3) {
        this.f16803a = i3;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16803a) {
            case 0:
                return ((androidx.media3.exoplayer.source.TrackGroupArray) obj).toBundle();
            case 1:
                return ((androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride) obj).toBundle();
            case 2:
                return androidx.media3.exoplayer.source.TrackGroupArray.fromBundle((android.os.Bundle) obj);
            default:
                return androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SelectionOverride.fromBundle((android.os.Bundle) obj);
        }
    }
}

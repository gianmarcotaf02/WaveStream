package androidx.media3.exoplayer;

/* JADX INFO: renamed from: androidx.media3.exoplayer.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1547b implements androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.SuitableOutputChecker.Callback f16611i;

    public /* synthetic */ C1547b(androidx.media3.exoplayer.SuitableOutputChecker.Callback callback, int i3) {
        this.f16610h = i3;
        this.f16611i = callback;
    }

    @Override // androidx.media3.common.util.BackgroundThreadStateHandler.StateChangeListener
    public final void onStateChanged(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.Boolean bool2 = (java.lang.Boolean) obj2;
        switch (this.f16610h) {
            case 0:
                androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi23.lambda$enable$0(this.f16611i, bool, bool2);
                break;
            default:
                androidx.media3.exoplayer.DefaultSuitableOutputChecker.ImplApi35.lambda$enable$0(this.f16611i, bool, bool2);
                break;
        }
    }
}

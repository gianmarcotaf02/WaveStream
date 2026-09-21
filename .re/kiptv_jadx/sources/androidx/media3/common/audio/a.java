package androidx.media3.common.audio;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16393i;

    public /* synthetic */ a(int i3, java.lang.Object obj) {
        this.f16392h = i3;
        this.f16393i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16392h) {
            case 0:
                ((androidx.media3.common.audio.AudioBecomingNoisyManager) this.f16393i).lambda$setEnabled$0();
                break;
            case 1:
                ((androidx.media3.common.audio.AudioBecomingNoisyManager) this.f16393i).lambda$setEnabled$1();
                break;
            default:
                ((androidx.media3.common.audio.AudioBecomingNoisyManager.AudioBecomingNoisyReceiver) this.f16393i).callListenerIfEnabled();
                break;
        }
    }
}

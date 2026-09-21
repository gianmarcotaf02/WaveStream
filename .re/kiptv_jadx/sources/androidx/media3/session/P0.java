package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P0 implements java.lang.Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionLegacyStub f16931i;

    public /* synthetic */ P0(androidx.media3.session.MediaSessionLegacyStub mediaSessionLegacyStub, int i3) {
        this.f16930h = i3;
        this.f16931i = mediaSessionLegacyStub;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16930h) {
            case 0:
                this.f16931i.updateCustomLayoutAndLegacyExtrasForMediaButtonPreferencesAndInformExtrasChanged();
                break;
            default:
                this.f16931i.onAndroidAutoConnectionStateChanged();
                break;
        }
    }
}

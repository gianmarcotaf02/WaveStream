package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class I0 implements p068h4.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16899h;

    public /* synthetic */ I0(int i3) {
        this.f16899h = i3;
    }

    @Override // p068h4.v
    public final java.lang.Object get() {
        switch (this.f16899h) {
            case 0:
                return java.lang.Integer.valueOf(androidx.media3.session.MediaSessionImpl.getMediaMetadataBitmapMaxSize());
            case 1:
                return java.lang.Integer.valueOf(androidx.media3.session.DefaultMediaNotificationProvider.getMaxNotificationIconSize());
            default:
                return androidx.media3.session.SimpleBitmapLoader.lambda$static$0();
        }
    }
}

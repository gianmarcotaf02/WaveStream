package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class X0 implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSession.ControllerInfo f16968b;

    public /* synthetic */ X0(androidx.media3.session.MediaSession.ControllerInfo controllerInfo, int i3) {
        this.f16967a = i3;
        this.f16968b = controllerInfo;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f16967a) {
            case 0:
                return androidx.media3.session.MediaSessionStub.lambda$replaceMediaItems$55(this.f16968b, (android.os.Bundle) obj);
            case 1:
                return androidx.media3.session.MediaSessionStub.lambda$addMediaItemsWithIndex$46(this.f16968b, (android.os.Bundle) obj);
            case 2:
                return androidx.media3.session.MediaSessionStub.lambda$setMediaItemsWithStartIndex$36(this.f16968b, (android.os.Bundle) obj);
            case 3:
                return androidx.media3.session.MediaSessionStub.lambda$addMediaItems$43(this.f16968b, (android.os.Bundle) obj);
            default:
                return androidx.media3.session.MediaSessionStub.lambda$setMediaItemsWithResetPosition$34(this.f16968b, (android.os.Bundle) obj);
        }
    }
}

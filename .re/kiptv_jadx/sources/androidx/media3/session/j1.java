package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaSessionStub.Controller2Cb f17058b;

    public /* synthetic */ j1(androidx.media3.session.MediaSessionStub.Controller2Cb controller2Cb, int i3) {
        this.f17057a = i3;
        this.f17058b = controller2Cb;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f17057a) {
            case 0:
                return this.f17058b.lambda$setCustomLayout$0((androidx.media3.session.CommandButton) obj);
            case 1:
                return this.f17058b.lambda$setMediaButtonPreferences$1((androidx.media3.session.CommandButton) obj);
            default:
                return this.f17058b.lambda$setMediaButtonPreferences$2((androidx.media3.session.CommandButton) obj);
        }
    }
}

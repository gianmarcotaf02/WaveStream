package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1582h0 implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaControllerStub f17039b;

    public /* synthetic */ C1582h0(androidx.media3.session.MediaControllerStub mediaControllerStub, int i3) {
        this.f17038a = i3;
        this.f17039b = mediaControllerStub;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f17038a) {
            case 0:
                return this.f17039b.lambda$onSetMediaButtonPreferences$4((android.os.Bundle) obj);
            default:
                return this.f17039b.lambda$onSetCustomLayout$2((android.os.Bundle) obj);
        }
    }
}

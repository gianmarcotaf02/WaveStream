package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n1 implements p068h4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17084b;

    public /* synthetic */ n1(int i3, java.lang.Object obj) {
        this.f17083a = i3;
        this.f17084b = obj;
    }

    @Override // p068h4.j
    public final java.lang.Object apply(java.lang.Object obj) {
        switch (this.f17083a) {
            case 0:
                return ((androidx.media3.session.SizeAvoidingBitmapLoader) this.f17084b).scaleIfNecessary((android.graphics.Bitmap) obj);
            case 1:
                return ((androidx.media3.session.MediaSessionService) this.f17084b).lambda$onUpdateNotification$3((java.lang.RuntimeException) obj);
            default:
                return ((androidx.media3.session.SizeLimitedBitmapLoader) this.f17084b).scaleIfNecessary((android.graphics.Bitmap) obj);
        }
    }
}

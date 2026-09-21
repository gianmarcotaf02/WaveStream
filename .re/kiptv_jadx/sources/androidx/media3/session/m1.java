package androidx.media3.session;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m1 implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f17079b;

    public /* synthetic */ m1(int i3, java.lang.Object obj) {
        this.f17078a = i3;
        this.f17079b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f17078a) {
            case 0:
                return androidx.media3.session.SimpleBitmapLoader.load((android.net.Uri) this.f17079b);
            default:
                return androidx.media3.session.SimpleBitmapLoader.decode((byte[]) this.f17079b);
        }
    }
}

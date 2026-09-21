package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements java.util.concurrent.Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.datasource.DataSourceBitmapLoader f16472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f16473c;

    public /* synthetic */ b(androidx.media3.datasource.DataSourceBitmapLoader dataSourceBitmapLoader, java.lang.Object obj, int i3) {
        this.f16471a = i3;
        this.f16472b = dataSourceBitmapLoader;
        this.f16473c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() {
        switch (this.f16471a) {
            case 0:
                return this.f16472b.lambda$decodeBitmap$1((byte[]) this.f16473c);
            default:
                return this.f16472b.lambda$loadBitmap$2((android.net.Uri) this.f16473c);
        }
    }
}

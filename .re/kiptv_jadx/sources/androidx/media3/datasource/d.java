package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p068h4.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f16474h;

    public /* synthetic */ d(int i3) {
        this.f16474h = i3;
    }

    @Override // p068h4.l
    public final boolean apply(java.lang.Object obj) {
        switch (this.f16474h) {
            case 0:
                return androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((java.util.Map.Entry) obj);
            case 1:
                return androidx.media3.datasource.DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((java.lang.String) obj);
            default:
                return androidx.media3.datasource.HttpDataSource.lambda$static$0((java.lang.String) obj);
        }
    }
}

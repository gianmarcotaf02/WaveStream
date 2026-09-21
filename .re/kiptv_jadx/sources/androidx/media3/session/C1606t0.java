package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1606t0 implements com.google.common.util.concurrent.w {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaLibraryServiceLegacyStub f17112i;

    public /* synthetic */ C1606t0(androidx.media3.session.MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, int i3) {
        this.f17111h = i3;
        this.f17112i = mediaLibraryServiceLegacyStub;
    }

    @Override // com.google.common.util.concurrent.w
    public final com.google.common.util.concurrent.J apply(java.lang.Object obj) {
        switch (this.f17111h) {
            case 0:
                return this.f17112i.lambda$createMediaItemToBrowserItemAsyncFunction$15((androidx.media3.session.LibraryResult) obj);
            default:
                return this.f17112i.lambda$createMediaItemsToBrowserItemsAsyncFunction$12((androidx.media3.session.LibraryResult) obj);
        }
    }
}

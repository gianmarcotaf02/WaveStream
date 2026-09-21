package androidx.media3.session;

public final class C1606t0 implements com.google.common.util.concurrent.w {

    public final int f17111h;

    public final MediaLibraryServiceLegacyStub f17112i;

    public C1606t0(MediaLibraryServiceLegacyStub mediaLibraryServiceLegacyStub, int i3) {
        this.f17111h = i3;
        this.f17112i = mediaLibraryServiceLegacyStub;
    }

    @Override
    public final com.google.common.util.concurrent.J apply(Object obj) {
        switch (this.f17111h) {
            case 0:
                return this.f17112i.lambda$createMediaItemToBrowserItemAsyncFunction$15((LibraryResult) obj);
            default:
                return this.f17112i.lambda$createMediaItemsToBrowserItemsAsyncFunction$12((LibraryResult) obj);
        }
    }
}

package androidx.media3.session;

/* JADX INFO: renamed from: androidx.media3.session.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1581h implements androidx.media3.common.util.Consumer {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f17034h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaBrowserImplBase f17035i;
    public final /* synthetic */ java.lang.String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17036k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.session.MediaLibraryService.LibraryParams f17037l;

    public /* synthetic */ C1581h(androidx.media3.session.MediaBrowserImplBase mediaBrowserImplBase, java.lang.String str, int i3, int i9, androidx.media3.session.MediaLibraryService.LibraryParams libraryParams) {
        this.f17034h = i9;
        this.f17035i = mediaBrowserImplBase;
        this.j = str;
        this.f17036k = i3;
        this.f17037l = libraryParams;
    }

    @Override // androidx.media3.common.util.Consumer
    public final void accept(java.lang.Object obj) {
        androidx.media3.session.MediaBrowser.Listener listener = (androidx.media3.session.MediaBrowser.Listener) obj;
        switch (this.f17034h) {
            case 0:
                this.f17035i.lambda$notifySearchResultChanged$0(this.j, this.f17036k, this.f17037l, listener);
                break;
            default:
                this.f17035i.lambda$notifyChildrenChanged$1(this.j, this.f17036k, this.f17037l, listener);
                break;
        }
    }
}

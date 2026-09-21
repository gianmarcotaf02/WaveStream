package androidx.media3.session;

import androidx.media3.common.util.Consumer;

public final class C1581h implements Consumer {

    public final int f17034h;

    public final MediaBrowserImplBase f17035i;
    public final String j;

    public final int f17036k;

    public final MediaLibraryService.LibraryParams f17037l;

    public C1581h(MediaBrowserImplBase mediaBrowserImplBase, String str, int i3, int i9, MediaLibraryService.LibraryParams libraryParams) {
        this.f17034h = i9;
        this.f17035i = mediaBrowserImplBase;
        this.j = str;
        this.f17036k = i3;
        this.f17037l = libraryParams;
    }

    @Override
    public final void accept(Object obj) {
        MediaBrowser.Listener listener = (MediaBrowser.Listener) obj;
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

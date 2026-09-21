package F1;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class h implements i {

    public final InputContentInfo f3516h;

    public h(Object obj) {
        this.f3516h = (InputContentInfo) obj;
    }

    @Override
    public final Uri a() {
        return this.f3516h.getContentUri();
    }

    @Override
    public final void b() {
        this.f3516h.requestPermission();
    }

    @Override
    public final Uri c() {
        return this.f3516h.getLinkUri();
    }

    @Override
    public final Object e() {
        return this.f3516h;
    }

    @Override
    public final ClipDescription getDescription() {
        return this.f3516h.getDescription();
    }

    public h(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3516h = new InputContentInfo(uri, clipDescription, uri2);
    }
}

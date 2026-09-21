package F1;

/* JADX INFO: loaded from: classes.dex */
public final class h implements F1.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.inputmethod.InputContentInfo f3516h;

    public h(java.lang.Object obj) {
        this.f3516h = (android.view.inputmethod.InputContentInfo) obj;
    }

    @Override // F1.i
    public final android.net.Uri a() {
        return this.f3516h.getContentUri();
    }

    @Override // F1.i
    public final void b() {
        this.f3516h.requestPermission();
    }

    @Override // F1.i
    public final android.net.Uri c() {
        return this.f3516h.getLinkUri();
    }

    @Override // F1.i
    public final java.lang.Object e() {
        return this.f3516h;
    }

    @Override // F1.i
    public final android.content.ClipDescription getDescription() {
        return this.f3516h.getDescription();
    }

    public h(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
        this.f3516h = new android.view.inputmethod.InputContentInfo(uri, clipDescription, uri2);
    }
}

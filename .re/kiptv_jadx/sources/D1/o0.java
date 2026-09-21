package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o0 {
    public static /* synthetic */ android.media.session.MediaSession g(android.content.Context context) {
        return new android.media.session.MediaSession(context, "CastMediaSession", null);
    }

    public static /* synthetic */ android.view.WindowInsets.Builder h() {
        return new android.view.WindowInsets.Builder();
    }

    public static /* synthetic */ android.view.WindowInsets.Builder i(android.view.WindowInsets windowInsets) {
        return new android.view.WindowInsets.Builder(windowInsets);
    }

    public static /* bridge */ /* synthetic */ android.view.contentcapture.ContentCaptureSession m(java.lang.Object obj) {
        return (android.view.contentcapture.ContentCaptureSession) obj;
    }
}

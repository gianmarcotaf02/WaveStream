package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q {
    public static /* bridge */ /* synthetic */ boolean A(java.lang.IllegalStateException illegalStateException) {
        return illegalStateException instanceof android.app.ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ boolean B(java.lang.RuntimeException runtimeException) {
        return runtimeException instanceof android.app.ForegroundServiceStartNotAllowedException;
    }

    public static /* bridge */ /* synthetic */ android.app.ForegroundServiceStartNotAllowedException a(java.lang.IllegalStateException illegalStateException) {
        return (android.app.ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static /* bridge */ /* synthetic */ android.media.MediaDrm.PlaybackComponent c(java.lang.Object obj) {
        return (android.media.MediaDrm.PlaybackComponent) obj;
    }

    public static /* synthetic */ android.view.translation.ViewTranslationRequest.Builder g(android.view.autofill.AutofillId autofillId, long j) {
        return new android.view.translation.ViewTranslationRequest.Builder(autofillId, j);
    }

    public static /* bridge */ /* synthetic */ android.view.translation.ViewTranslationResponse i(java.lang.Object obj) {
        return (android.view.translation.ViewTranslationResponse) obj;
    }

    public static /* synthetic */ void m() {
    }
}

package androidx.media3.exoplayer.audio;

import android.app.ForegroundServiceStartNotAllowedException;
import android.media.MediaDrm;
import android.view.autofill.AutofillId;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;

public abstract class q {
    public static boolean A(IllegalStateException illegalStateException) {
        return illegalStateException instanceof ForegroundServiceStartNotAllowedException;
    }

    public static boolean B(RuntimeException runtimeException) {
        return runtimeException instanceof ForegroundServiceStartNotAllowedException;
    }

    public static ForegroundServiceStartNotAllowedException a(IllegalStateException illegalStateException) {
        return (ForegroundServiceStartNotAllowedException) illegalStateException;
    }

    public static MediaDrm.PlaybackComponent c(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static ViewTranslationRequest.Builder g(AutofillId autofillId, long j) {
        return new ViewTranslationRequest.Builder(autofillId, j);
    }

    public static ViewTranslationResponse i(Object obj) {
        return (ViewTranslationResponse) obj;
    }

    public static void m() {
    }
}

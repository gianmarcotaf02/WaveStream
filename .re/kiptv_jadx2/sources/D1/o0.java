package D1;

import android.content.Context;
import android.media.session.MediaSession;
import android.view.WindowInsets;
import android.view.contentcapture.ContentCaptureSession;

public abstract class o0 {
    public static MediaSession g(Context context) {
        return new MediaSession(context, "CastMediaSession", null);
    }

    public static WindowInsets.Builder h() {
        return new WindowInsets.Builder();
    }

    public static WindowInsets.Builder i(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static ContentCaptureSession m(Object obj) {
        return (ContentCaptureSession) obj;
    }
}

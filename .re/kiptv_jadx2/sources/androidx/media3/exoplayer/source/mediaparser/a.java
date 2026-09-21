package androidx.media3.exoplayer.source.mediaparser;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.view.SurfaceControl;

public abstract class a {
    public static MediaSession g(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static SurfaceControl.Transaction j() {
        return new SurfaceControl.Transaction();
    }
}

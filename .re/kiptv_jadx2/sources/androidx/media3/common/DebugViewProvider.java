package androidx.media3.common;

import D1.C0223h;
import android.view.SurfaceView;

public interface DebugViewProvider {
    public static final DebugViewProvider NONE = new C0223h(7);

    static SurfaceView lambda$static$0(int i3, int i9) {
        return null;
    }

    SurfaceView getDebugPreviewSurfaceView(int i3, int i9);
}

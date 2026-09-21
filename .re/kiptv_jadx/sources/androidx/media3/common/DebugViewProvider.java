package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface DebugViewProvider {
    public static final androidx.media3.common.DebugViewProvider NONE = new D1.C0223h(7);

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ android.view.SurfaceView lambda$static$0(int i3, int i9) {
        return null;
    }

    android.view.SurfaceView getDebugPreviewSurfaceView(int i3, int i9);
}

package androidx.media3.common;

/* JADX INFO: loaded from: classes.dex */
public interface VideoCompositorSettings {
    public static final androidx.media3.common.VideoCompositorSettings DEFAULT = new androidx.media3.common.VideoCompositorSettings() { // from class: androidx.media3.common.VideoCompositorSettings.1
        @Override // androidx.media3.common.VideoCompositorSettings
        public androidx.media3.common.util.Size getOutputSize(java.util.List<androidx.media3.common.util.Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.common.VideoCompositorSettings
        public androidx.media3.common.OverlaySettings getOverlaySettings(int i3, long j) {
            return new androidx.media3.common.OverlaySettings() { // from class: androidx.media3.common.VideoCompositorSettings.1.1
            };
        }
    };

    androidx.media3.common.util.Size getOutputSize(java.util.List<androidx.media3.common.util.Size> list);

    androidx.media3.common.OverlaySettings getOverlaySettings(int i3, long j);
}

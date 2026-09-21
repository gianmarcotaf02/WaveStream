package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class RendererConfiguration {
    public static final androidx.media3.exoplayer.RendererConfiguration DEFAULT = new androidx.media3.exoplayer.RendererConfiguration(0, false);
    public final int offloadModePreferred;
    public final boolean tunneling;

    public RendererConfiguration(boolean z6) {
        this.offloadModePreferred = 0;
        this.tunneling = z6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && androidx.media3.exoplayer.RendererConfiguration.class == obj.getClass()) {
            androidx.media3.exoplayer.RendererConfiguration rendererConfiguration = (androidx.media3.exoplayer.RendererConfiguration) obj;
            if (this.offloadModePreferred == rendererConfiguration.offloadModePreferred && this.tunneling == rendererConfiguration.tunneling) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.offloadModePreferred << 1) + (this.tunneling ? 1 : 0);
    }

    public RendererConfiguration(int i3, boolean z6) {
        this.offloadModePreferred = i3;
        this.tunneling = z6;
    }
}

package androidx.media3.common;

import android.view.Surface;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;

public final class SurfaceInfo {
    public final int height;
    public final boolean isEncoderInputSurface;
    public final int orientationDegrees;
    public final Surface surface;
    public final int width;

    public SurfaceInfo(Surface surface, int i3, int i9) {
        this(surface, i3, i9, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceInfo)) {
            return false;
        }
        SurfaceInfo surfaceInfo = (SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.isEncoderInputSurface == surfaceInfo.isEncoderInputSurface && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees) * 31) + (this.isEncoderInputSurface ? 1 : 0);
    }

    public SurfaceInfo(Surface surface, int i3, int i9, int i10) {
        this(surface, i3, i9, i10, false);
    }

    public SurfaceInfo(Surface surface, int i3, int i9, int i10, boolean z6) {
        AbstractC1864o0.M(i10 == 0 || i10 == 90 || i10 == 180 || i10 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i3;
        this.height = i9;
        this.orientationDegrees = i10;
        this.isEncoderInputSurface = z6;
    }
}

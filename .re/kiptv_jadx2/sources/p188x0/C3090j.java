package p188x0;

import android.graphics.PathMeasure;

public final class C3090j {

    public final PathMeasure f31115a;

    public C3090j(PathMeasure pathMeasure) {
        this.f31115a = pathMeasure;
    }

    public final boolean a(float f9, float f10, C3088h c3088h) {
        if (c3088h == null) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f31115a.getSegment(f9, f10, c3088h.f31111a, true);
    }
}

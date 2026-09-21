package p188x0;

/* JADX INFO: renamed from: x0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3090j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.PathMeasure f31115a;

    public C3090j(android.graphics.PathMeasure pathMeasure) {
        this.f31115a = pathMeasure;
    }

    public final boolean a(float f9, float f10, p188x0.C3088h c3088h) {
        if (c3088h == null) {
            throw new java.lang.UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.f31115a.getSegment(f9, f10, c3088h.f31111a, true);
    }
}

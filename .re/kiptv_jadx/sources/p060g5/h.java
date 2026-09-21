package p060g5;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21892a = 40;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f21893b = 24;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f21894c = 20;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f21895d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f21896e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f21897f = 110;
    public final float g = 6;

    public final float a() {
        return this.f21892a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p060g5.h)) {
            return false;
        }
        p060g5.h hVar = (p060g5.h) obj;
        return p113n1.f.c(this.f21892a, hVar.f21892a) && p113n1.f.c(this.f21893b, hVar.f21893b) && p113n1.f.c(this.f21894c, hVar.f21894c) && p113n1.f.c(this.f21895d, hVar.f21895d) && java.lang.Float.compare(1.4f, 1.4f) == 0 && p113n1.f.c(this.f21896e, hVar.f21896e) && p113n1.f.c(this.f21897f, hVar.f21897f) && p113n1.f.c(this.g, hVar.g) && java.lang.Float.compare(1.06f, 1.06f) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(1.06f) + p121o0.p.c(this.g, p121o0.p.c(this.f21897f, p121o0.p.c(this.f21896e, p121o0.p.c(1.4f, p121o0.p.c(this.f21895d, p121o0.p.c(this.f21894c, p121o0.p.c(this.f21893b, java.lang.Float.hashCode(this.f21892a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.String strD = p113n1.f.d(this.f21892a);
        java.lang.String strD2 = p113n1.f.d(this.f21893b);
        java.lang.String strD3 = p113n1.f.d(this.f21894c);
        java.lang.String strD4 = p113n1.f.d(this.f21895d);
        java.lang.String strD5 = p113n1.f.d(this.f21896e);
        java.lang.String strD6 = p113n1.f.d(this.f21897f);
        java.lang.String strD7 = p113n1.f.d(this.g);
        java.lang.StringBuilder sbO = Y6.f.o("TvDimensions(contentPaddingHorizontal=", strD, ", contentPaddingVertical=", strD2, ", itemSpacing=");
        B2.a.x(sbO, strD3, ", focusRingWidth=", strD4, ", posterScale=1.4, sectionHeaderPadding=");
        B2.a.x(sbO, strD5, ", posterWidth=", strD6, ", posterCornerRadius=");
        return Y6.f.m(sbO, strD7, ", focusScale=1.06)");
    }
}

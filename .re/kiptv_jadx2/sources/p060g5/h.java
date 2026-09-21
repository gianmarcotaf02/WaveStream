package p060g5;

import B2.a;
import p113n1.f;
import p121o0.p;

public final class h {

    public final float f21892a = 40;

    public final float f21893b = 24;

    public final float f21894c = 20;

    public final float f21895d = 2;

    public final float f21896e = 8;

    public final float f21897f = 110;
    public final float g = 6;

    public final float a() {
        return this.f21892a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return f.c(this.f21892a, hVar.f21892a) && f.c(this.f21893b, hVar.f21893b) && f.c(this.f21894c, hVar.f21894c) && f.c(this.f21895d, hVar.f21895d) && Float.compare(1.4f, 1.4f) == 0 && f.c(this.f21896e, hVar.f21896e) && f.c(this.f21897f, hVar.f21897f) && f.c(this.g, hVar.g) && Float.compare(1.06f, 1.06f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(1.06f) + p.c(this.g, p.c(this.f21897f, p.c(this.f21896e, p.c(1.4f, p.c(this.f21895d, p.c(this.f21894c, p.c(this.f21893b, Float.hashCode(this.f21892a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strD = f.d(this.f21892a);
        String strD2 = f.d(this.f21893b);
        String strD3 = f.d(this.f21894c);
        String strD4 = f.d(this.f21895d);
        String strD5 = f.d(this.f21896e);
        String strD6 = f.d(this.f21897f);
        String strD7 = f.d(this.g);
        StringBuilder sbO = Y6.f.o("TvDimensions(contentPaddingHorizontal=", strD, ", contentPaddingVertical=", strD2, ", itemSpacing=");
        a.x(sbO, strD3, ", focusRingWidth=", strD4, ", posterScale=1.4, sectionHeaderPadding=");
        a.x(sbO, strD5, ", posterWidth=", strD6, ", posterCornerRadius=");
        return Y6.f.m(sbO, strD7, ", focusScale=1.06)");
    }
}

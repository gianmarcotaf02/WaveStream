package p113n1;

import p121o0.p;

public final class h {

    public final float f25554a;

    public final float f25555b;

    public final float f25556c;

    public final float f25557d;

    public h(float f9, float f10, float f11, float f12) {
        this.f25554a = f9;
        this.f25555b = f10;
        this.f25556c = f11;
        this.f25557d = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return f.c(this.f25554a, hVar.f25554a) && f.c(this.f25555b, hVar.f25555b) && f.c(this.f25556c, hVar.f25556c) && f.c(this.f25557d, hVar.f25557d);
    }

    public final int hashCode() {
        return Float.hashCode(this.f25557d) + p.c(this.f25556c, p.c(this.f25555b, Float.hashCode(this.f25554a) * 31, 31), 31);
    }

    public final String toString() {
        return "DpRect(left=" + ((Object) f.d(this.f25554a)) + ", top=" + ((Object) f.d(this.f25555b)) + ", right=" + ((Object) f.d(this.f25556c)) + ", bottom=" + ((Object) f.d(this.f25557d)) + ')';
    }
}

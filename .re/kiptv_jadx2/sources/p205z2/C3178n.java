package p205z2;

import p121o0.p;

public final class C3178n {

    public static final C3178n f32285c = new C3178n(1.0f, 1.0f);

    public final float f32286a;

    public final float f32287b;

    public C3178n(float f9, float f10) {
        this.f32286a = f9;
        this.f32287b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3178n.class != obj.getClass()) {
            return false;
        }
        C3178n c3178n = (C3178n) obj;
        return this.f32286a == c3178n.f32286a && this.f32287b == c3178n.f32287b;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f) + p.c(1.0f, p.c(1.0f, p.c(1.0f, p.c(this.f32287b, p.c(1.0f, p.c(1.0f, p.c(1.0f, p.c(this.f32286a, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        return "SelectableSurfaceScale(scale=1.0, focusedScale=" + this.f32286a + ",pressedScale=1.0, selectedScale=1.0,disabledScale=1.0, focusedSelectedScale=" + this.f32287b + ", focusedDisabledScale=1.0,pressedSelectedScale=1.0, selectedDisabledScale=1.0, focusedSelectedDisabledScale=1.0)";
    }
}

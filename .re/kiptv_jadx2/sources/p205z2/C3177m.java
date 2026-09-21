package p205z2;

import kotlin.jvm.internal.m;

public final class C3177m {

    public final C3173i f32279a;

    public final C3173i f32280b;

    public final C3173i f32281c;

    public final C3173i f32282d;

    public final C3173i f32283e;

    public final C3173i f32284f;

    public C3177m(C3173i c3173i, C3173i c3173i2, C3173i c3173i3, C3173i c3173i4, C3173i c3173i5, C3173i c3173i6) {
        this.f32279a = c3173i;
        this.f32280b = c3173i2;
        this.f32281c = c3173i3;
        this.f32282d = c3173i4;
        this.f32283e = c3173i5;
        this.f32284f = c3173i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3177m.class != obj.getClass()) {
            return false;
        }
        C3177m c3177m = (C3177m) obj;
        return m.a(this.f32279a, c3177m.f32279a) && m.a(this.f32280b, c3177m.f32280b) && m.a(this.f32281c, c3177m.f32281c) && m.a(this.f32282d, c3177m.f32282d) && m.a(this.f32283e, c3177m.f32283e) && m.a(this.f32284f, c3177m.f32284f);
    }

    public final int hashCode() {
        return this.f32284f.hashCode() + ((this.f32283e.hashCode() + ((this.f32282d.hashCode() + ((this.f32281c.hashCode() + ((this.f32280b.hashCode() + (this.f32279a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectableSurfaceGlow(glow=" + this.f32279a + ", focusedGlow=" + this.f32280b + ",pressedGlow=" + this.f32281c + ", selectedGlow=" + this.f32282d + ",focusedSelectedGlow=" + this.f32283e + ", pressedSelectedGlow=" + this.f32284f + ')';
    }
}

package p205z2;

import kotlin.jvm.internal.m;

public final class C3175k {

    public final C3166b f32259a;

    public final C3166b f32260b;

    public final C3166b f32261c;

    public final C3166b f32262d;

    public final C3166b f32263e;

    public final C3166b f32264f;
    public final C3166b g;

    public final C3166b f32265h;

    public final C3166b f32266i;
    public final C3166b j;

    public C3175k(C3166b c3166b, C3166b c3166b2, C3166b c3166b3, C3166b c3166b4, C3166b c3166b5, C3166b c3166b6, C3166b c3166b7, C3166b c3166b8, C3166b c3166b9, C3166b c3166b10) {
        this.f32259a = c3166b;
        this.f32260b = c3166b2;
        this.f32261c = c3166b3;
        this.f32262d = c3166b4;
        this.f32263e = c3166b5;
        this.f32264f = c3166b6;
        this.g = c3166b7;
        this.f32265h = c3166b8;
        this.f32266i = c3166b9;
        this.j = c3166b10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3175k.class != obj.getClass()) {
            return false;
        }
        C3175k c3175k = (C3175k) obj;
        return m.a(this.f32259a, c3175k.f32259a) && m.a(this.f32260b, c3175k.f32260b) && m.a(this.f32261c, c3175k.f32261c) && m.a(this.f32262d, c3175k.f32262d) && m.a(this.f32263e, c3175k.f32263e) && m.a(this.f32264f, c3175k.f32264f) && m.a(this.g, c3175k.g) && m.a(this.f32265h, c3175k.f32265h) && m.a(this.f32266i, c3175k.f32266i) && m.a(this.j, c3175k.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f32266i.hashCode() + ((this.f32265h.hashCode() + ((this.g.hashCode() + ((this.f32264f.hashCode() + ((this.f32263e.hashCode() + ((this.f32262d.hashCode() + ((this.f32261c.hashCode() + ((this.f32260b.hashCode() + (this.f32259a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectableSurfaceBorder(border=" + this.f32259a + ", focusedBorder=" + this.f32260b + ",pressedBorder=" + this.f32261c + ", selectedBorder=" + this.f32262d + ",disabledBorder=" + this.f32263e + ", focusedSelectedBorder=" + this.f32264f + ", focusedDisabledBorder=" + this.g + ",pressedSelectedBorder=" + this.f32265h + ", selectedDisabledBorder=" + this.f32266i + ", focusedSelectedDisabledBorder=" + this.j + ')';
    }
}

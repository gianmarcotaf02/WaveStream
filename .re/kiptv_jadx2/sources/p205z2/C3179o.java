package p205z2;

import kotlin.jvm.internal.m;
import p188x0.O;

public final class C3179o {

    public final O f32288a;

    public final O f32289b;

    public final O f32290c;

    public final O f32291d;

    public final O f32292e;

    public final O f32293f;
    public final O g;

    public final O f32294h;

    public final O f32295i;
    public final O j;

    public C3179o(O o8, O o9, O o10, O o11, O o12, O o13, O o14, O o15, O o16, O o17) {
        this.f32288a = o8;
        this.f32289b = o9;
        this.f32290c = o10;
        this.f32291d = o11;
        this.f32292e = o12;
        this.f32293f = o13;
        this.g = o14;
        this.f32294h = o15;
        this.f32295i = o16;
        this.j = o17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3179o.class != obj.getClass()) {
            return false;
        }
        C3179o c3179o = (C3179o) obj;
        return m.a(this.f32288a, c3179o.f32288a) && m.a(this.f32289b, c3179o.f32289b) && m.a(this.f32290c, c3179o.f32290c) && m.a(this.f32291d, c3179o.f32291d) && m.a(this.f32292e, c3179o.f32292e) && m.a(this.f32293f, c3179o.f32293f) && m.a(this.g, c3179o.g) && m.a(this.f32294h, c3179o.f32294h) && m.a(this.f32295i, c3179o.f32295i) && m.a(this.j, c3179o.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.f32295i.hashCode() + ((this.f32294h.hashCode() + ((this.g.hashCode() + ((this.f32293f.hashCode() + ((this.f32292e.hashCode() + ((this.f32291d.hashCode() + ((this.f32290c.hashCode() + ((this.f32289b.hashCode() + (this.f32288a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectableSurfaceShape(shape=" + this.f32288a + ", focusedShape=" + this.f32289b + ",pressedShape=" + this.f32290c + ", selectedShape=" + this.f32291d + ",disabledShape=" + this.f32292e + ", focusedSelectedShape=" + this.f32293f + ", focusedDisabledShape=" + this.g + ",pressedSelectedShape=" + this.f32294h + ", selectedDisabledShape=" + this.f32295i + ", focusedSelectedDisabledShape=" + this.j + ')';
    }
}

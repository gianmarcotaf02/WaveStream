package p203z0;

import kotlin.jvm.internal.m;
import p113n1.c;
import p113n1.n;
import p181w0.d;
import p188x0.InterfaceC3097q;

public final class a {

    public c f32123a;

    public n f32124b;

    public InterfaceC3097q f32125c;

    public long f32126d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f32123a, aVar.f32123a) && this.f32124b == aVar.f32124b && m.a(this.f32125c, aVar.f32125c) && d.a(this.f32126d, aVar.f32126d);
    }

    public final int hashCode() {
        return Long.hashCode(this.f32126d) + ((this.f32125c.hashCode() + ((this.f32124b.hashCode() + (this.f32123a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.f32123a + ", layoutDirection=" + this.f32124b + ", canvas=" + this.f32125c + ", size=" + ((Object) d.f(this.f32126d)) + ')';
    }
}

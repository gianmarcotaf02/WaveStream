package p205z2;

import I.e;
import kotlin.jvm.internal.m;

public final class C3181q {

    public final e f32301a;

    public final e f32302b;

    public final e f32303c;

    public final e f32304d;

    public final e f32305e;

    public C3181q() {
        e eVar = AbstractC3180p.f32296a;
        e eVar2 = AbstractC3180p.f32297b;
        e eVar3 = AbstractC3180p.f32298c;
        e eVar4 = AbstractC3180p.f32299d;
        e eVar5 = AbstractC3180p.f32300e;
        this.f32301a = eVar;
        this.f32302b = eVar2;
        this.f32303c = eVar3;
        this.f32304d = eVar4;
        this.f32305e = eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3181q)) {
            return false;
        }
        C3181q c3181q = (C3181q) obj;
        return m.a(this.f32301a, c3181q.f32301a) && m.a(this.f32302b, c3181q.f32302b) && m.a(this.f32303c, c3181q.f32303c) && m.a(this.f32304d, c3181q.f32304d) && m.a(this.f32305e, c3181q.f32305e);
    }

    public final int hashCode() {
        return this.f32305e.hashCode() + ((this.f32304d.hashCode() + ((this.f32303c.hashCode() + ((this.f32302b.hashCode() + (this.f32301a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f32301a + ", small=" + this.f32302b + ", medium=" + this.f32303c + ", large=" + this.f32304d + ", extraLarge=" + this.f32305e + ')';
    }
}

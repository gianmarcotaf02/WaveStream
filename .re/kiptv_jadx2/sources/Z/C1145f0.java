package Z;

public final class C1145f0 {

    public final I.e f12394a;

    public final I.e f12395b;

    public final I.e f12396c;

    public final I.e f12397d;

    public final I.e f12398e;

    public C1145f0() {
        I.e eVar = AbstractC1143e0.f12388a;
        I.e eVar2 = AbstractC1143e0.f12389b;
        I.e eVar3 = AbstractC1143e0.f12390c;
        I.e eVar4 = AbstractC1143e0.f12391d;
        I.e eVar5 = AbstractC1143e0.f12392e;
        this.f12394a = eVar;
        this.f12395b = eVar2;
        this.f12396c = eVar3;
        this.f12397d = eVar4;
        this.f12398e = eVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1145f0)) {
            return false;
        }
        C1145f0 c1145f0 = (C1145f0) obj;
        return kotlin.jvm.internal.m.a(this.f12394a, c1145f0.f12394a) && kotlin.jvm.internal.m.a(this.f12395b, c1145f0.f12395b) && kotlin.jvm.internal.m.a(this.f12396c, c1145f0.f12396c) && kotlin.jvm.internal.m.a(this.f12397d, c1145f0.f12397d) && kotlin.jvm.internal.m.a(this.f12398e, c1145f0.f12398e);
    }

    public final int hashCode() {
        return this.f12398e.hashCode() + ((this.f12397d.hashCode() + ((this.f12396c.hashCode() + ((this.f12395b.hashCode() + (this.f12394a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f12394a + ", small=" + this.f12395b + ", medium=" + this.f12396c + ", large=" + this.f12397d + ", extraLarge=" + this.f12398e + ')';
    }
}

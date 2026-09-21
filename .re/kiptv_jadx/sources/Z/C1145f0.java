package Z;

/* JADX INFO: renamed from: Z.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I.e f12394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I.e f12395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I.e f12396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.e f12397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I.e f12398e;

    public C1145f0() {
        I.e eVar = Z.AbstractC1143e0.f12388a;
        I.e eVar2 = Z.AbstractC1143e0.f12389b;
        I.e eVar3 = Z.AbstractC1143e0.f12390c;
        I.e eVar4 = Z.AbstractC1143e0.f12391d;
        I.e eVar5 = Z.AbstractC1143e0.f12392e;
        this.f12394a = eVar;
        this.f12395b = eVar2;
        this.f12396c = eVar3;
        this.f12397d = eVar4;
        this.f12398e = eVar5;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z.C1145f0)) {
            return false;
        }
        Z.C1145f0 c1145f0 = (Z.C1145f0) obj;
        return kotlin.jvm.internal.m.a(this.f12394a, c1145f0.f12394a) && kotlin.jvm.internal.m.a(this.f12395b, c1145f0.f12395b) && kotlin.jvm.internal.m.a(this.f12396c, c1145f0.f12396c) && kotlin.jvm.internal.m.a(this.f12397d, c1145f0.f12397d) && kotlin.jvm.internal.m.a(this.f12398e, c1145f0.f12398e);
    }

    public final int hashCode() {
        return this.f12398e.hashCode() + ((this.f12397d.hashCode() + ((this.f12396c.hashCode() + ((this.f12395b.hashCode() + (this.f12394a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "Shapes(extraSmall=" + this.f12394a + ", small=" + this.f12395b + ", medium=" + this.f12396c + ", large=" + this.f12397d + ", extraLarge=" + this.f12398e + ')';
    }
}

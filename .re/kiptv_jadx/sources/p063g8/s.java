package p063g8;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements p063g8.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p063g8.c f22392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f22393b;

    public s(p063g8.c cVar) {
        this.f22392a = cVar;
        p086j6.b bVarU = com.google.common.util.concurrent.P.U();
        com.google.common.util.concurrent.P.L(bVarU, cVar);
        p086j6.b bVarM = com.google.common.util.concurrent.P.M(bVarU);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ListIterator listIterator = bVarM.listIterator(0);
        while (true) {
            Q0.C0781o c0781o = (Q0.C0781o) listIterator;
            if (!c0781o.hasNext()) {
                break;
            }
            p045e8.X xD = ((p063g8.j) c0781o.next()).c().d();
            if (xD != null) {
                arrayList.add(xD);
            }
        }
        java.util.Set setR1 = p078i6.o.R1(arrayList);
        this.f22393b = setR1;
        if (setR1.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Signed format must contain at least one field with a sign");
        }
    }

    @Override // p063g8.k
    public final h8.a a() {
        this.f22392a.f22371a.a();
        return new h8.a();
    }

    @Override // p063g8.k
    public final p080i8.p b() {
        return com.google.android.gms.internal.play_billing.V0.k(p078i6.p.B0(new p080i8.p(com.google.common.util.concurrent.P.i0(new p080i8.t(new R0.C0811a(2, this), "sign for " + this.f22393b)), p078i6.w.f23205h), this.f22392a.f22371a.b()));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p063g8.s) {
            return this.f22392a.equals(((p063g8.s) obj).f22392a);
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + (this.f22392a.f22371a.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "SignedFormatStructure(" + this.f22392a + ')';
    }
}

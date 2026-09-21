package J0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LJ0/e;", "LQ0/X;", "LJ0/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class e extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0.d f5984b;

    public e(J0.d dVar) {
        this.f5984b = dVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new J0.i(p138q1.k.f26541a, this.f5984b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof J0.e)) {
            return false;
        }
        J0.e eVar = (J0.e) obj;
        eVar.getClass();
        java.lang.Object obj2 = p138q1.k.f26541a;
        return obj2.equals(obj2) && eVar.f5984b.equals(this.f5984b);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        J0.i iVar = (J0.i) oVar;
        iVar.f5992v = p138q1.k.f26541a;
        J0.d dVar = iVar.f5993w;
        if (dVar.f5980a == iVar) {
            dVar.f5980a = null;
        }
        J0.d dVar2 = this.f5984b;
        if (!dVar2.equals(dVar)) {
            iVar.f5993w = dVar2;
        }
        if (iVar.f26487u) {
            J0.d dVar3 = iVar.f5993w;
            dVar3.f5980a = iVar;
            dVar3.f5981b = null;
            iVar.f5994x = null;
            dVar3.f5982c = new A8.m(3, iVar);
            dVar3.f5983d = iVar.B0();
        }
    }

    public final int hashCode() {
        return this.f5984b.hashCode() + (p138q1.k.f26541a.hashCode() * 31);
    }
}

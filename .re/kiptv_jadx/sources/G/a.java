package G;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LG/a;", "LQ0/X;", "LG/e;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G.c f3738b;

    public a(G.c cVar) {
        this.f3738b = cVar;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        G.e eVar = new G.e();
        eVar.f3746v = this.f3738b;
        return eVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof G.a) {
            return kotlin.jvm.internal.m.a(this.f3738b, ((G.a) obj).f3738b);
        }
        return false;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        G.e eVar = (G.e) oVar;
        G.c cVar = eVar.f3746v;
        if (cVar != null) {
            cVar.f3745a.l(eVar);
        }
        G.c cVar2 = this.f3738b;
        if (cVar2 != null) {
            cVar2.f3745a.c(eVar);
        }
        eVar.f3746v = cVar2;
    }

    public final int hashCode() {
        return this.f3738b.hashCode();
    }
}

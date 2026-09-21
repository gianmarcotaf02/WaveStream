package J0;

import A8.m;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;
import p138q1.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LJ0/e;", "LQ0/X;", "LJ0/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class e extends X {

    public final d f5984b;

    public e(d dVar) {
        this.f5984b = dVar;
    }

    @Override
    public final o e() {
        return new i(k.f26541a, this.f5984b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        eVar.getClass();
        Object obj2 = k.f26541a;
        return obj2.equals(obj2) && eVar.f5984b.equals(this.f5984b);
    }

    @Override
    public final void f(o oVar) {
        i iVar = (i) oVar;
        iVar.f5992v = k.f26541a;
        d dVar = iVar.f5993w;
        if (dVar.f5980a == iVar) {
            dVar.f5980a = null;
        }
        d dVar2 = this.f5984b;
        if (!dVar2.equals(dVar)) {
            iVar.f5993w = dVar2;
        }
        if (iVar.f26487u) {
            d dVar3 = iVar.f5993w;
            dVar3.f5980a = iVar;
            dVar3.f5981b = null;
            iVar.f5994x = null;
            dVar3.f5982c = new m(3, iVar);
            dVar3.f5983d = iVar.B0();
        }
    }

    public final int hashCode() {
        return this.f5984b.hashCode() + (k.f26541a.hashCode() * 31);
    }
}

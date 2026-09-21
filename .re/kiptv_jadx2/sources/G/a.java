package G;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LG/a;", "LQ0/X;", "LG/e;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends X {

    public final c f3738b;

    public a(c cVar) {
        this.f3738b = cVar;
    }

    @Override
    public final o e() {
        e eVar = new e();
        eVar.f3746v = this.f3738b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return m.a(this.f3738b, ((a) obj).f3738b);
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        e eVar = (e) oVar;
        c cVar = eVar.f3746v;
        if (cVar != null) {
            cVar.f3745a.l(eVar);
        }
        c cVar2 = this.f3738b;
        if (cVar2 != null) {
            cVar2.f3745a.c(eVar);
        }
        eVar.f3746v = cVar2;
    }

    public final int hashCode() {
        return this.f3738b.hashCode();
    }
}

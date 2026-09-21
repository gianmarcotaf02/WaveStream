package I0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LI0/d;", "LQ0/X;", "LI0/f;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class d extends X {

    public final j f4569b;

    public final j f4570c;

    public d(j jVar, j jVar2) {
        this.f4569b = jVar;
        this.f4570c = jVar2;
    }

    @Override
    public final o e() {
        f fVar = new f();
        fVar.f4571v = this.f4569b;
        fVar.f4572w = this.f4570c;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f4569b == dVar.f4569b && this.f4570c == dVar.f4570c;
    }

    @Override
    public final void f(o oVar) {
        f fVar = (f) oVar;
        fVar.f4571v = this.f4569b;
        fVar.f4572w = this.f4570c;
    }

    public final int hashCode() {
        j jVar = this.f4569b;
        int iHashCode = (jVar != null ? jVar.hashCode() : 0) * 31;
        j jVar2 = this.f4570c;
        return iHashCode + (jVar2 != null ? jVar2.hashCode() : 0);
    }
}

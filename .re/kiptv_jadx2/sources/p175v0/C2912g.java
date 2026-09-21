package p175v0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/g;", "LQ0/X;", "Lv0/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2912g extends X {

    public final j f29069b;

    public C2912g(j jVar) {
        this.f29069b = jVar;
    }

    @Override
    public final o e() {
        C2914i c2914i = new C2914i();
        c2914i.f29070v = this.f29069b;
        return c2914i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2912g) {
            return this.f29069b == ((C2912g) obj).f29069b;
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        ((C2914i) oVar).f29070v = this.f29069b;
    }

    public final int hashCode() {
        return this.f29069b.hashCode();
    }
}

package O0;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/Z;", "LQ0/X;", "LO0/a0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class Z extends Q0.X {

    public final p194x6.j f7621b;

    public Z(p194x6.j jVar) {
        this.f7621b = jVar;
    }

    @Override
    public final p137q0.o e() {
        a0 a0Var = new a0();
        a0Var.f7623v = this.f7621b;
        return a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Z) {
            return this.f7621b == ((Z) obj).f7621b;
        }
        return false;
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((a0) oVar).f7623v = this.f7621b;
    }

    public final int hashCode() {
        return this.f7621b.hashCode();
    }
}

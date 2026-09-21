package O0;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/w;", "LQ0/X;", "LO0/C;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0733w extends Q0.X {

    public final p194x6.n f7706b;

    public C0733w(p194x6.n nVar) {
        this.f7706b = nVar;
    }

    @Override
    public final p137q0.o e() {
        C c9 = new C();
        c9.f7561v = this.f7706b;
        return c9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0733w) {
            return this.f7706b == ((C0733w) obj).f7706b;
        }
        return false;
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((C) oVar).f7561v = this.f7706b;
    }

    public final int hashCode() {
        return this.f7706b.hashCode();
    }
}

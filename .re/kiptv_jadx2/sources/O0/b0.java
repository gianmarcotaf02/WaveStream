package O0;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/b0;", "LQ0/X;", "LO0/c0;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class b0 extends Q0.X {

    public final p194x6.j f7625b;

    public b0(p194x6.j jVar) {
        this.f7625b = jVar;
    }

    @Override
    public final p137q0.o e() {
        c0 c0Var = new c0();
        c0Var.f7628v = this.f7625b;
        long j = Integer.MIN_VALUE;
        c0Var.f7629w = (j & 4294967295L) | (j << 32);
        return c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f7625b == ((b0) obj).f7625b;
        }
        return false;
    }

    @Override
    public final void f(p137q0.o oVar) {
        c0 c0Var = (c0) oVar;
        c0Var.f7628v = this.f7625b;
        long j = Integer.MIN_VALUE;
        c0Var.f7629w = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.f7625b.hashCode();
    }
}

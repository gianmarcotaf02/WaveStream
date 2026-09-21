package B;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/Q;", "LQ0/X;", "LB/U;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class Q extends Q0.X {

    public final S f491b;

    public Q(S s9) {
        this.f491b = s9;
    }

    @Override
    public final p137q0.o e() {
        U u6 = new U();
        u6.f499v = this.f491b;
        return u6;
    }

    public final boolean equals(Object obj) {
        Q q9 = obj instanceof Q ? (Q) obj : null;
        if (q9 == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f491b, q9.f491b);
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((U) oVar).f499v = this.f491b;
    }

    public final int hashCode() {
        return this.f491b.hashCode();
    }
}

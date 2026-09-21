package P;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LP/e;", "LQ0/X;", "LP/h;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class e extends X {

    public final U.X f8076b;

    public e(U.X x9) {
        this.f8076b = x9;
    }

    @Override
    public final o e() {
        return new h(this.f8076b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f8076b == ((e) obj).f8076b;
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        ((h) oVar).f8083x = this.f8076b;
    }

    public final int hashCode() {
        return this.f8076b.hashCode();
    }
}

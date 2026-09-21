package B;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/F;", "LQ0/X;", "LB/G;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class F extends Q0.X {
    @Override
    public final p137q0.o e() {
        G g = new G();
        g.f467v = E.f466i;
        g.f468w = true;
        return g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof F ? (F) obj : null) == null) {
            return false;
        }
        E e6 = E.f465h;
        return true;
    }

    @Override
    public final void f(p137q0.o oVar) {
        G g = (G) oVar;
        g.f467v = E.f466i;
        g.f468w = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (E.f466i.hashCode() * 31);
    }
}

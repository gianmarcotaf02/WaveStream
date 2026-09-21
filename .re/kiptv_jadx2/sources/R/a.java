package R;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LR/a;", "LQ0/X;", "LR/d;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends X {

    public final Function0 f8719b;

    public a(Function0 function0) {
        this.f8719b = function0;
    }

    @Override
    public final o e() {
        return new d(this.f8719b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.f8719b == ((a) obj).f8719b;
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        ((d) oVar).f8725x = this.f8719b;
    }

    public final int hashCode() {
        return this.f8719b.hashCode();
    }
}

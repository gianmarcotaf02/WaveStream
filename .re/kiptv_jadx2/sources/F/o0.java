package F;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/o0;", "LQ0/X;", "LF/p0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class o0 extends Q0.X {

    public final N f3481b;

    public o0(N n3) {
        this.f3481b = n3;
    }

    @Override
    public final p137q0.o e() {
        p0 p0Var = new p0();
        p0Var.f3485v = this.f3481b;
        return p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && kotlin.jvm.internal.m.a(this.f3481b, ((o0) obj).f3481b);
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((p0) oVar).f3485v = this.f3481b;
    }

    public final int hashCode() {
        return this.f3481b.hashCode();
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f3481b + ')';
    }
}

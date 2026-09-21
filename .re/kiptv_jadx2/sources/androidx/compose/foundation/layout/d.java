package androidx.compose.foundation.layout;

import B.A;
import B.f0;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p121o0.p;
import p137q0.o;
import p194x6.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/d;", "LQ0/X;", "LB/f0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class d extends X {

    public final A f15796b;

    public final m f15797c;

    public final Object f15798d;

    public d(A a2, m mVar, Object obj) {
        this.f15796b = a2;
        this.f15797c = mVar;
        this.f15798d = obj;
    }

    @Override
    public final o e() {
        f0 f0Var = new f0();
        f0Var.f531v = this.f15796b;
        f0Var.f532w = this.f15797c;
        return f0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f15796b == dVar.f15796b && this.f15798d.equals(dVar.f15798d);
    }

    @Override
    public final void f(o oVar) {
        f0 f0Var = (f0) oVar;
        f0Var.f531v = this.f15796b;
        f0Var.f532w = this.f15797c;
    }

    public final int hashCode() {
        return this.f15798d.hashCode() + p.f(this.f15796b.hashCode() * 31, 31, false);
    }
}

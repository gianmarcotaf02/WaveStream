package androidx.compose.foundation.layout;

import B.c0;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p113n1.f;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/c;", "LQ0/X;", "LB/c0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class c extends X {

    public final float f15794b;

    public final float f15795c;

    public c(float f9, float f10) {
        this.f15794b = f9;
        this.f15795c = f10;
    }

    @Override
    public final o e() {
        c0 c0Var = new c0();
        c0Var.f519v = this.f15794b;
        c0Var.f520w = this.f15795c;
        return c0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return f.c(this.f15794b, cVar.f15794b) && f.c(this.f15795c, cVar.f15795c);
    }

    @Override
    public final void f(o oVar) {
        c0 c0Var = (c0) oVar;
        c0Var.f519v = this.f15794b;
        c0Var.f520w = this.f15795c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15795c) + (Float.hashCode(this.f15794b) * 31);
    }
}

package androidx.compose.foundation.layout;

import B.A;
import B.B;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/FillElement;", "LQ0/X;", "LB/B;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FillElement extends X {

    public final A f15782b;

    public final float f15783c;

    public FillElement(A a2, float f9) {
        this.f15782b = a2;
        this.f15783c = f9;
    }

    @Override
    public final o e() {
        B b9 = new B();
        b9.f461v = this.f15782b;
        b9.f462w = this.f15783c;
        return b9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.f15782b == fillElement.f15782b && this.f15783c == fillElement.f15783c;
    }

    @Override
    public final void f(o oVar) {
        B b9 = (B) oVar;
        b9.f461v = this.f15782b;
        b9.f462w = this.f15783c;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15783c) + (this.f15782b.hashCode() * 31);
    }
}

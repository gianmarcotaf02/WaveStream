package B;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/j;", "LQ0/X;", "LB/l;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0072j extends Q0.X {

    public final float f542b;

    public C0072j(float f9) {
        this.f542b = f9;
        if (f9 > 0.0f) {
            return;
        }
        C.a.a("aspectRatio " + f9 + " must be > 0");
    }

    @Override
    public final p137q0.o e() {
        C0074l c0074l = new C0074l();
        c0074l.f545v = this.f542b;
        return c0074l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0072j c0072j = obj instanceof C0072j ? (C0072j) obj : null;
        if (c0072j == null || this.f542b != c0072j.f542b) {
            return false;
        }
        ((C0072j) obj).getClass();
        return true;
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((C0074l) oVar).f545v = this.f542b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f542b) * 31);
    }
}

package B;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LB/H;", "LQ0/X;", "LB/I;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class H extends Q0.X {

    public final float f469b;

    public final boolean f470c;

    public H(float f9, boolean z6) {
        this.f469b = f9;
        this.f470c = z6;
    }

    @Override
    public final p137q0.o e() {
        I i3 = new I();
        i3.f471v = this.f469b;
        i3.f472w = this.f470c;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        H h9 = obj instanceof H ? (H) obj : null;
        return h9 != null && this.f469b == h9.f469b && this.f470c == h9.f470c;
    }

    @Override
    public final void f(p137q0.o oVar) {
        I i3 = (I) oVar;
        i3.f471v = this.f469b;
        i3.f472w = this.f470c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f470c) + (Float.hashCode(this.f469b) * 31);
    }
}

package p137q0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p121o0.p;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq0/t;", "LQ0/X;", "Lq0/u;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class t extends X {

    public final float f26494b;

    public t(float f9) {
        this.f26494b = f9;
    }

    @Override
    public final o e() {
        u uVar = new u();
        uVar.f26495v = this.f26494b;
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && Float.compare(this.f26494b, ((t) obj).f26494b) == 0;
    }

    @Override
    public final void f(o oVar) {
        ((u) oVar).f26495v = this.f26494b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f26494b);
    }

    public final String toString() {
        return p.q(new StringBuilder("ZIndexElement(zIndex="), this.f26494b, ')');
    }
}

package p175v0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/s;", "LQ0/X;", "Lv0/x;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class s extends X {

    public final v f29088b;

    public s(v vVar) {
        this.f29088b = vVar;
    }

    @Override
    public final o e() {
        x xVar = new x();
        xVar.f29102v = this.f29088b;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && m.a(this.f29088b, ((s) obj).f29088b);
    }

    @Override
    public final void f(o oVar) {
        ((x) oVar).f29102v = this.f29088b;
    }

    public final int hashCode() {
        return this.f29088b.f29101h.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f29088b + ')';
    }
}

package Y0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LY0/b;", "LQ0/X;", "LY0/d;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class b extends X implements p137q0.n {

    public final boolean f11026b;

    public final p194x6.j f11027c;

    public b(boolean z6, p194x6.j jVar) {
        this.f11026b = z6;
        this.f11027c = jVar;
    }

    @Override
    public final p137q0.o e() {
        d dVar = new d();
        dVar.f11030v = this.f11026b;
        dVar.f11031w = this.f11027c;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11026b == bVar.f11026b && this.f11027c == bVar.f11027c;
    }

    @Override
    public final void f(p137q0.o oVar) {
        d dVar = (d) oVar;
        dVar.f11030v = this.f11026b;
        dVar.f11031w = this.f11027c;
    }

    public final int hashCode() {
        return this.f11027c.hashCode() + (Boolean.hashCode(this.f11026b) * 31);
    }
}

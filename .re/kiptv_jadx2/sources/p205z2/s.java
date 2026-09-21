package p205z2;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p137q0.o;
import p188x0.O;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz2/s;", "LQ0/X;", "Lz2/t;", "tv-material_release"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class s extends X {

    public final O f32307b;

    public final C3166b f32308c;

    public s(O o8, C3166b c3166b) {
        this.f32307b = o8;
        this.f32308c = c3166b;
    }

    @Override
    public final o e() {
        t tVar = new t();
        tVar.f32309v = this.f32307b;
        tVar.f32310w = this.f32308c;
        return tVar;
    }

    public final boolean equals(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        return sVar != null && m.a(this.f32307b, sVar.f32307b) && m.a(this.f32308c, sVar.f32308c);
    }

    @Override
    public final void f(o oVar) {
        t tVar = (t) oVar;
        tVar.f32309v = this.f32307b;
        tVar.f32310w = this.f32308c;
    }

    public final int hashCode() {
        return this.f32308c.hashCode() + (this.f32307b.hashCode() * 31);
    }
}

package p171u0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu0/g;", "LQ0/X;", "Lu0/b;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class g extends X {

    public final j f28656b;

    public g(j jVar) {
        this.f28656b = jVar;
    }

    @Override
    public final o e() {
        return new b(new c(), this.f28656b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            return this.f28656b == ((g) obj).f28656b;
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        b bVar = (b) oVar;
        bVar.f28651x = this.f28656b;
        bVar.N0();
    }

    public final int hashCode() {
        return this.f28656b.hashCode();
    }
}

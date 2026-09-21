package p175v0;

import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p137q0.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv0/c;", "LQ0/X;", "Lv0/e;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C2908c extends X {

    public final j f29065b;

    public C2908c(j jVar) {
        this.f29065b = jVar;
    }

    @Override
    public final o e() {
        C2910e c2910e = new C2910e();
        c2910e.f29066v = this.f29065b;
        return c2910e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2908c) {
            return this.f29065b == ((C2908c) obj).f29065b;
        }
        return false;
    }

    @Override
    public final void f(o oVar) {
        ((C2910e) oVar).f29066v = this.f29065b;
    }

    public final int hashCode() {
        return this.f29065b.hashCode();
    }
}

package O0;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LO0/x;", "LQ0/X;", "LO0/z;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0734x extends Q0.X {

    public final String f7708b;

    public C0734x(String str) {
        this.f7708b = str;
    }

    @Override
    public final p137q0.o e() {
        C0736z c0736z = new C0736z();
        c0736z.f7716v = this.f7708b;
        return c0736z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0734x) && this.f7708b.equals(((C0734x) obj).f7708b);
    }

    @Override
    public final void f(p137q0.o oVar) {
        ((C0736z) oVar).f7716v = this.f7708b;
    }

    public final int hashCode() {
        return this.f7708b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f7708b) + ')';
    }
}

package F;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import x.EnumC3061p0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LF/m;", "LQ0/X;", "LF/q;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class C0348m extends Q0.X {

    public final r f3474b;

    public final C0347l f3475c;

    public final EnumC3061p0 f3476d;

    public C0348m(r rVar, C0347l c0347l, EnumC3061p0 enumC3061p0) {
        this.f3474b = rVar;
        this.f3475c = c0347l;
        this.f3476d = enumC3061p0;
    }

    @Override
    public final p137q0.o e() {
        C0352q c0352q = new C0352q();
        c0352q.f3486v = this.f3474b;
        c0352q.f3487w = this.f3475c;
        c0352q.f3488x = this.f3476d;
        return c0352q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0348m)) {
            return false;
        }
        C0348m c0348m = (C0348m) obj;
        return kotlin.jvm.internal.m.a(this.f3474b, c0348m.f3474b) && kotlin.jvm.internal.m.a(this.f3475c, c0348m.f3475c) && this.f3476d == c0348m.f3476d;
    }

    @Override
    public final void f(p137q0.o oVar) {
        C0352q c0352q = (C0352q) oVar;
        c0352q.f3486v = this.f3474b;
        c0352q.f3487w = this.f3475c;
        c0352q.f3488x = this.f3476d;
    }

    public final int hashCode() {
        return this.f3476d.hashCode() + p121o0.p.f((this.f3475c.hashCode() + (this.f3474b.hashCode() * 31)) * 31, 31, false);
    }
}

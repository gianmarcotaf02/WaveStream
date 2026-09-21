package v;

import E5.c1;
import Q0.AbstractC0777k;
import android.view.View;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv/i0;", "LQ0/X;", "Lv/l0;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class C2888i0 extends Q0.X {

    public final c1 f28948b;

    public final U.l0 f28949c;

    public final y0 f28950d;

    public C2888i0(c1 c1Var, U.l0 l0Var, y0 y0Var) {
        this.f28948b = c1Var;
        this.f28949c = l0Var;
        this.f28950d = y0Var;
    }

    @Override
    public final p137q0.o e() {
        return new l0(this.f28948b, this.f28949c, this.f28950d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2888i0)) {
            return false;
        }
        c1 c1Var = ((C2888i0) obj).f28948b;
        return false;
    }

    @Override
    public final void f(p137q0.o oVar) {
        l0 l0Var = (l0) oVar;
        l0Var.getClass();
        y0 y0Var = l0Var.f28969x;
        View view = l0Var.y;
        p113n1.c cVar = l0Var.f28970z;
        l0Var.f28967v = this.f28948b;
        l0Var.f28968w = this.f28949c;
        y0 y0Var2 = this.f28950d;
        l0Var.f28969x = y0Var2;
        View viewV = AbstractC0777k.v(l0Var);
        p113n1.c cVar2 = AbstractC0777k.t(l0Var).f8226G;
        if (l0Var.f28961A != null) {
            Y0.w wVar = m0.f28972a;
            if (((!Float.isNaN(Float.NaN) || !Float.isNaN(Float.NaN)) && !y0Var2.a()) || !p113n1.f.c(Float.NaN, Float.NaN) || !p113n1.f.c(Float.NaN, Float.NaN) || !y0Var2.equals(y0Var) || !viewV.equals(view) || !kotlin.jvm.internal.m.a(cVar2, cVar)) {
                l0Var.O0();
            }
        }
        l0Var.P0();
    }

    public final int hashCode() {
        return this.f28950d.hashCode() + ((this.f28949c.hashCode() + p121o0.p.f(p121o0.p.c(Float.NaN, p121o0.p.c(Float.NaN, p121o0.p.e(p121o0.p.f(p121o0.p.c(Float.NaN, this.f28948b.hashCode() * 961, 31), 31, true), 31, 9205357640488583168L), 31), 31), 31, true)) * 31);
    }
}

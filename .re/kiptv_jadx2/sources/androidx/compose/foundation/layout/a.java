package androidx.compose.foundation.layout;

import B.b0;
import Q0.X;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import p113n1.f;
import p121o0.p;
import p137q0.o;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/a;", "LQ0/X;", "LB/b0;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class a extends X {

    public final float f15784b;

    public final float f15785c;

    public final float f15786d;

    public final float f15787e;

    public final boolean f15788f;

    public a(float f9, float f10, float f11, float f12, boolean z6) {
        this.f15784b = f9;
        this.f15785c = f10;
        this.f15786d = f11;
        this.f15787e = f12;
        this.f15788f = z6;
    }

    @Override
    public final o e() {
        b0 b0Var = new b0();
        b0Var.f513v = this.f15784b;
        b0Var.f514w = this.f15785c;
        b0Var.f515x = this.f15786d;
        b0Var.y = this.f15787e;
        b0Var.f516z = this.f15788f;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f.c(this.f15784b, aVar.f15784b) && f.c(this.f15785c, aVar.f15785c) && f.c(this.f15786d, aVar.f15786d) && f.c(this.f15787e, aVar.f15787e) && this.f15788f == aVar.f15788f;
    }

    @Override
    public final void f(o oVar) {
        b0 b0Var = (b0) oVar;
        b0Var.f513v = this.f15784b;
        b0Var.f514w = this.f15785c;
        b0Var.f515x = this.f15786d;
        b0Var.y = this.f15787e;
        b0Var.f516z = this.f15788f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15788f) + p.c(this.f15787e, p.c(this.f15786d, p.c(this.f15785c, Float.hashCode(this.f15784b) * 31, 31), 31), 31);
    }

    public a(float f9, float f10, float f11, float f12, int i3) {
        this((i3 & 1) != 0 ? Float.NaN : f9, (i3 & 2) != 0 ? Float.NaN : f10, (i3 & 4) != 0 ? Float.NaN : f11, (i3 & 8) != 0 ? Float.NaN : f12, true);
    }
}

package K0;

import J.g0;
import Q0.X;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/L;", "LQ0/X;", "LK0/U;", "ui"}, k = 1, mv = {2, 0, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class L extends X {

    public final Object f6658b;

    public final Object f6659c;

    public final PointerInputEventHandler f6660d;

    public L(Object obj, g0 g0Var, PointerInputEventHandler pointerInputEventHandler, int i3) {
        g0Var = (i3 & 2) != 0 ? null : g0Var;
        this.f6658b = obj;
        this.f6659c = g0Var;
        this.f6660d = pointerInputEventHandler;
    }

    @Override
    public final p137q0.o e() {
        return new U(this.f6658b, this.f6659c, this.f6660d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l2 = (L) obj;
        return kotlin.jvm.internal.m.a(this.f6658b, l2.f6658b) && kotlin.jvm.internal.m.a(this.f6659c, l2.f6659c) && this.f6660d == l2.f6660d;
    }

    @Override
    public final void f(p137q0.o oVar) {
        U u6 = (U) oVar;
        Object obj = u6.f6682v;
        Object obj2 = this.f6658b;
        boolean z6 = !kotlin.jvm.internal.m.a(obj, obj2);
        u6.f6682v = obj2;
        Object obj3 = u6.f6683w;
        Object obj4 = this.f6659c;
        if (!kotlin.jvm.internal.m.a(obj3, obj4)) {
            z6 = true;
        }
        u6.f6683w = obj4;
        Class<?> cls = u6.f6684x.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.f6660d;
        if (cls == pointerInputEventHandler.getClass() ? z6 : true) {
            u6.P0();
        }
        u6.f6684x = pointerInputEventHandler;
    }

    public final int hashCode() {
        Object obj = this.f6658b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f6659c;
        return this.f6660d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}

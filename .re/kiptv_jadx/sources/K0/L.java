package K0;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LK0/L;", "LQ0/X;", "LK0/U;", "ui"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class L extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f6658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f6659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.compose.ui.input.pointer.PointerInputEventHandler f6660d;

    public L(java.lang.Object obj, J.g0 g0Var, androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler, int i3) {
        g0Var = (i3 & 2) != 0 ? null : g0Var;
        this.f6658b = obj;
        this.f6659c = g0Var;
        this.f6660d = pointerInputEventHandler;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new K0.U(this.f6658b, this.f6659c, this.f6660d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K0.L)) {
            return false;
        }
        K0.L l2 = (K0.L) obj;
        return kotlin.jvm.internal.m.a(this.f6658b, l2.f6658b) && kotlin.jvm.internal.m.a(this.f6659c, l2.f6659c) && this.f6660d == l2.f6660d;
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        K0.U u6 = (K0.U) oVar;
        java.lang.Object obj = u6.f6682v;
        java.lang.Object obj2 = this.f6658b;
        boolean z6 = !kotlin.jvm.internal.m.a(obj, obj2);
        u6.f6682v = obj2;
        java.lang.Object obj3 = u6.f6683w;
        java.lang.Object obj4 = this.f6659c;
        if (!kotlin.jvm.internal.m.a(obj3, obj4)) {
            z6 = true;
        }
        u6.f6683w = obj4;
        java.lang.Class<?> cls = u6.f6684x.getClass();
        androidx.compose.ui.input.pointer.PointerInputEventHandler pointerInputEventHandler = this.f6660d;
        if (cls == pointerInputEventHandler.getClass() ? z6 : true) {
            u6.P0();
        }
        u6.f6684x = pointerInputEventHandler;
    }

    public final int hashCode() {
        java.lang.Object obj = this.f6658b;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f6659c;
        return this.f6660d.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}

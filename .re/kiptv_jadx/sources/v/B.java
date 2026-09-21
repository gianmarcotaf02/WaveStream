package v;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv/B;", "LQ0/X;", "Lv/A;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class B extends Q0.X {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p188x0.AbstractC3095o f28801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p188x0.O f28802d;

    public B(float f9, p188x0.AbstractC3095o abstractC3095o, p188x0.O o8) {
        this.f28800b = f9;
        this.f28801c = abstractC3095o;
        this.f28802d = o8;
    }

    @Override // Q0.X
    public final p137q0.o e() {
        return new v.A(this.f28800b, this.f28801c, this.f28802d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v.B)) {
            return false;
        }
        v.B b9 = (v.B) obj;
        return p113n1.f.c(this.f28800b, b9.f28800b) && this.f28801c.equals(b9.f28801c) && kotlin.jvm.internal.m.a(this.f28802d, b9.f28802d);
    }

    @Override // Q0.X
    public final void f(p137q0.o oVar) {
        v.A a2 = (v.A) oVar;
        float f9 = a2.y;
        float f10 = this.f28800b;
        boolean zC = p113n1.f.c(f9, f10);
        p171u0.b bVar = a2.f28794B;
        if (!zC) {
            a2.y = f10;
            bVar.N0();
        }
        p188x0.AbstractC3095o abstractC3095o = a2.f28796z;
        p188x0.AbstractC3095o abstractC3095o2 = this.f28801c;
        if (!kotlin.jvm.internal.m.a(abstractC3095o, abstractC3095o2)) {
            a2.f28796z = abstractC3095o2;
            bVar.N0();
        }
        p188x0.O o8 = a2.f28793A;
        p188x0.O o9 = this.f28802d;
        if (kotlin.jvm.internal.m.a(o8, o9)) {
            return;
        }
        a2.f28793A = o9;
        bVar.N0();
        Q0.AbstractC0777k.l(a2);
    }

    public final int hashCode() {
        return this.f28802d.hashCode() + ((this.f28801c.hashCode() + (java.lang.Float.hashCode(this.f28800b) * 31)) * 31);
    }

    public final java.lang.String toString() {
        return "BorderModifierNodeElement(width=" + ((java.lang.Object) p113n1.f.d(this.f28800b)) + ", brush=" + this.f28801c + ", shape=" + this.f28802d + ')';
    }
}

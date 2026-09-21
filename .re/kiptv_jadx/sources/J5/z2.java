package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class z2 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ J5.N2 f6630i;

    public /* synthetic */ z2(J5.N2 n3, int i3) {
        this.f6629h = i3;
        this.f6630i = n3;
    }

    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) {
        java.lang.Object value;
        java.lang.Object value2;
        switch (this.f6629h) {
            case 0:
                J5.O2 o8 = (J5.O2) obj;
                V7.n0 n0Var = this.f6630i.f6199e;
                do {
                    value = n0Var.getValue();
                } while (!n0Var.g(value, J5.O2.a(o8, ((J5.O2) value).f6225s)));
                break;
            default:
                V7.n0 n0Var2 = this.f6630i.f6199e;
                do {
                    value2 = n0Var2.getValue();
                } while (!n0Var2.g(value2, J5.O2.a((J5.O2) value2, true)));
                break;
        }
        return p070h6.A.f22523a;
    }
}

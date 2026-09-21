package J0;

/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.o implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f5995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f5996i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(kotlin.jvm.internal.A a2, int i3) {
        super(1);
        this.f5995h = i3;
        this.f5996i = a2;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z6;
        switch (this.f5995h) {
            case 0:
                java.lang.Object obj2 = (Q0.C0) obj;
                if (((p137q0.o) obj2).f26475h.f26487u) {
                    this.f5996i.f24539h = obj2;
                    z6 = false;
                } else {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            case 1:
                K0.AbstractC0660h abstractC0660h = (K0.AbstractC0660h) obj;
                kotlin.jvm.internal.A a2 = this.f5996i;
                java.lang.Object obj3 = a2.f24539h;
                if (obj3 == null && abstractC0660h.f6704x) {
                    a2.f24539h = abstractC0660h;
                } else if (obj3 != null) {
                    abstractC0660h.getClass();
                }
                return java.lang.Boolean.TRUE;
            default:
                this.f5996i.f24539h = (p175v0.F) obj;
                return java.lang.Boolean.TRUE;
        }
    }
}

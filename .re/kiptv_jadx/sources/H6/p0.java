package H6;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f4478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H6.q0 f4479i;

    public /* synthetic */ p0(H6.q0 q0Var, int i3) {
        this.f4478h = i3;
        this.f4479i = q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        switch (this.f4478h) {
            case 0:
                H6.q0 q0Var = this.f4479i;
                return q0Var.b(q0Var.f4483h);
            default:
                H6.v0 v0Var = this.f4479i.f4484i;
                java.lang.reflect.Type type = v0Var != null ? (java.lang.reflect.Type) v0Var.invoke() : null;
                kotlin.jvm.internal.m.b(type);
                return T6.AbstractC0926d.c(type);
        }
    }
}

package C7;

/* JADX INFO: loaded from: classes4.dex */
public final class S extends C7.T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C7.T f1564c;

    public /* synthetic */ S(C7.T t9, int i3) {
        this.f1563b = i3;
        this.f1564c = t9;
    }

    @Override // C7.T
    public boolean a() {
        switch (this.f1563b) {
            case 1:
                return this.f1564c.a();
            default:
                return super.a();
        }
    }

    @Override // C7.T
    public boolean b() {
        switch (this.f1563b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override // C7.T
    public final O6.h c(O6.h annotations) {
        switch (this.f1563b) {
            case 0:
                kotlin.jvm.internal.m.e(annotations, "annotations");
                break;
            default:
                kotlin.jvm.internal.m.e(annotations, "annotations");
                break;
        }
        return this.f1564c.c(annotations);
    }

    @Override // C7.T
    public final C7.P d(C7.AbstractC0191x abstractC0191x) {
        switch (this.f1563b) {
            case 0:
                return this.f1564c.d(abstractC0191x);
            default:
                C7.P pD = this.f1564c.d(abstractC0191x);
                if (pD == null) {
                    return null;
                }
                N6.InterfaceC0694h interfaceC0694hH = abstractC0191x.u0().h();
                return com.google.android.gms.internal.play_billing.AbstractC1853k0.j(pD, interfaceC0694hH instanceof N6.U ? (N6.U) interfaceC0694hH : null);
        }
    }

    @Override // C7.T
    public final boolean e() {
        switch (this.f1563b) {
            case 0:
                break;
        }
        return this.f1564c.e();
    }

    @Override // C7.T
    public final C7.AbstractC0191x f(C7.AbstractC0191x topLevelType, C7.b0 position) {
        switch (this.f1563b) {
            case 0:
                kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
                kotlin.jvm.internal.m.e(position, "position");
                break;
            default:
                kotlin.jvm.internal.m.e(topLevelType, "topLevelType");
                kotlin.jvm.internal.m.e(position, "position");
                break;
        }
        return this.f1564c.f(topLevelType, position);
    }
}

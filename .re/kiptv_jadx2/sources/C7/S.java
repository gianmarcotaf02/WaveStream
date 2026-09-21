package C7;

import N6.InterfaceC0694h;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;

public final class S extends T {

    public final int f1563b;

    public final T f1564c;

    public S(T t9, int i3) {
        this.f1563b = i3;
        this.f1564c = t9;
    }

    @Override
    public boolean a() {
        switch (this.f1563b) {
            case 1:
                return this.f1564c.a();
            default:
                return super.a();
        }
    }

    @Override
    public boolean b() {
        switch (this.f1563b) {
            case 1:
                return true;
            default:
                return super.b();
        }
    }

    @Override
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

    @Override
    public final P d(AbstractC0191x abstractC0191x) {
        switch (this.f1563b) {
            case 0:
                return this.f1564c.d(abstractC0191x);
            default:
                P pD = this.f1564c.d(abstractC0191x);
                if (pD == null) {
                    return null;
                }
                InterfaceC0694h interfaceC0694hH = abstractC0191x.u0().h();
                return AbstractC1853k0.j(pD, interfaceC0694hH instanceof N6.U ? (N6.U) interfaceC0694hH : null);
        }
    }

    @Override
    public final boolean e() {
        switch (this.f1563b) {
            case 0:
                break;
        }
        return this.f1564c.e();
    }

    @Override
    public final AbstractC0191x f(AbstractC0191x topLevelType, b0 position) {
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

package p205z2;

import E6.u;
import Y0.t;
import Y0.v;
import Y0.w;
import Y0.x;
import kotlin.jvm.internal.o;
import p070h6.A;
import p188x0.L;
import p194x6.j;

public final class z extends o implements j {

    public final int f32336h;

    public final boolean f32337i;

    public z(boolean z6, int i3) {
        super(1);
        this.f32336h = i3;
        this.f32337i = z6;
    }

    @Override
    public final Object invoke(Object obj) {
        A a2 = A.f22523a;
        boolean z6 = this.f32337i;
        switch (this.f32336h) {
            case 0:
                ((L) obj).b(!z6 ? 0.8f : 1.0f);
                break;
            default:
                x xVar = (x) obj;
                u[] uVarArr = v.f11144a;
                w wVar = t.f11111I;
                u uVar = v.f11144a[22];
                xVar.d(wVar, Boolean.valueOf(z6));
                v.c(xVar, 4);
                break;
        }
        return a2;
    }
}

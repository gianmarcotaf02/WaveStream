package p205z2;

import E6.u;
import Y0.a;
import Y0.l;
import Y0.t;
import Y0.v;
import Y0.w;
import Y0.x;
import Z.Y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

public final class H extends o implements j {

    public final boolean f32178h;

    public final boolean f32179i;
    public final Function0 j;

    public H(boolean z6, boolean z9, Function0 function0) {
        super(1);
        this.f32178h = z6;
        this.f32179i = z9;
        this.j = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        x xVar = (x) obj;
        u[] uVarArr = v.f11144a;
        w wVar = t.f11111I;
        u uVar = v.f11144a[22];
        xVar.d(wVar, Boolean.valueOf(this.f32178h));
        xVar.d(l.f11065b, new a(null, new Y(1, this.j)));
        xVar.d(l.f11066c, new a(null, new C3168d(0, 4)));
        boolean z6 = this.f32179i;
        A a2 = A.f22523a;
        if (!z6) {
            xVar.d(t.f11126i, a2);
        }
        return a2;
    }
}

package U;

import E5.c1;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import v.A0;
import v.C2888i0;

public final class l0 implements p194x6.j {

    public final int f10043h;

    public final p113n1.c f10044i;
    public final p020c0.X j;

    public l0(p113n1.c cVar, p020c0.X x9, int i3) {
        this.f10043h = i3;
        this.f10044i = cVar;
        this.j = x9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f10043h) {
            case 0:
                p137q0.m mVar = p137q0.m.f26474b;
                c1 c1Var = new c1(3, (Function0) obj);
                l0 l0Var = new l0(this.f10044i, this.j, 1);
                if (v.m0.a()) {
                    return v.m0.a() ? new C2888i0(c1Var, l0Var, Build.VERSION.SDK_INT == 28 ? A0.f28797b : A0.f28798c) : mVar;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                p113n1.i iVar = (p113n1.i) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (iVar.f25558a >> 32));
                p113n1.c cVar = this.f10044i;
                this.j.setValue(new p113n1.m((((long) cVar.k0(fIntBitsToFloat)) << 32) | (((long) cVar.k0(Float.intBitsToFloat((int) (iVar.f25558a & 4294967295L)))) & 4294967295L)));
                return p070h6.A.f22523a;
        }
    }
}

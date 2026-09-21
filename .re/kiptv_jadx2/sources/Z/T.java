package Z;

import kotlin.jvm.functions.Function0;

public final class T extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f12324h;

    public final Function0 f12325i;

    public T(int i3, Function0 function0) {
        super(1);
        this.f12324h = i3;
        this.f12325i = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        p070h6.A a2 = p070h6.A.f22523a;
        Function0 function0 = this.f12325i;
        switch (this.f12324h) {
            case 0:
                Y0.h hVar = new Y0.h(((Number) function0.invoke()).floatValue(), new D6.d(0.0f, 1.0f));
                E6.u[] uVarArr = Y0.v.f11144a;
                Y0.w wVar = Y0.t.f11121c;
                E6.u uVar = Y0.v.f11144a[1];
                ((Y0.x) obj).d(wVar, hVar);
                break;
            default:
                if (((p175v0.D) ((p175v0.C) obj)).b()) {
                    function0.invoke();
                }
                break;
        }
        return a2;
    }
}

package p146r1;

import O.c;
import O0.InterfaceC0732v;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

public final class l extends o implements j {

    public final int f26757h;

    public final A f26758i;

    public l(A a2, int i3) {
        super(1);
        this.f26757h = i3;
        this.f26758i = a2;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f26757h) {
            case 0:
                InterfaceC0732v interfaceC0732vF = ((InterfaceC0732v) obj).F();
                m.b(interfaceC0732vF);
                this.f26758i.l(interfaceC0732vF);
                break;
            case 1:
                p113n1.m mVar = new p113n1.m(((p113n1.m) obj).f25565a);
                A a2 = this.f26758i;
                a2.m523setPopupContentSizefhxjrPA(mVar);
                a2.m();
                break;
            default:
                Function0 function0 = (Function0) obj;
                A a9 = this.f26758i;
                Handler handler = a9.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = a9.getHandler();
                    if (handler2 != null) {
                        handler2.post(new c(9, function0));
                    }
                }
                break;
        }
        return A.f22523a;
    }
}

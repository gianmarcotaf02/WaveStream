package t5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class C2813k0 implements p194x6.j {

    public final Function0 f28242h;

    public final long f28243i;
    public final Function0 j;

    public final long f28244k;

    public final Function0 f28245l;

    public final Function0 f28246m;

    public final p020c0.X f28247n;

    public final p020c0.X f28248o;

    public C2813k0(Function0 function0, long j, Function0 function1, long j9, Function0 function2, Function0 function3, p020c0.X x9, p020c0.X x10) {
        this.f28242h = function0;
        this.f28243i = j;
        this.j = function1;
        this.f28244k = j9;
        this.f28245l = function2;
        this.f28246m = function3;
        this.f28247n = x9;
        this.f28248o = x10;
    }

    @Override
    public final Object invoke(Object obj) {
        KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        Function0 function0 = this.f28242h;
        if (function0 != null && I0.a.a(I0.c.a(event.getKeyCode()), this.f28243i)) {
            if (I0.c.c(event) == 2) {
                function0.invoke();
            }
            return Boolean.TRUE;
        }
        Function0 function1 = this.j;
        if (function1 != null && I0.a.a(I0.c.a(event.getKeyCode()), this.f28244k)) {
            if (I0.c.c(event) == 2) {
                function1.invoke();
            }
            return Boolean.TRUE;
        }
        boolean z6 = false;
        if (I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4551i) || I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4560s) || I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4537G)) {
            Function0 function2 = this.f28245l;
            Function0 function3 = this.f28246m;
            if (function2 != null || function3 != null) {
                int iC = I0.c.c(event);
                p020c0.X x9 = this.f28247n;
                p020c0.X x10 = this.f28248o;
                if (iC == 2) {
                    if (event.getRepeatCount() == 0) {
                        x9.setValue(Boolean.TRUE);
                        x10.setValue(Boolean.FALSE);
                    }
                    if (function3 != null && ((Boolean) x9.getValue()).booleanValue() && !((Boolean) x10.getValue()).booleanValue() && event.getRepeatCount() >= 1) {
                        x10.setValue(Boolean.TRUE);
                        function3.invoke();
                    }
                } else if (I0.c.c(event) == 1) {
                    if (((Boolean) x9.getValue()).booleanValue()) {
                        if (((Boolean) x10.getValue()).booleanValue()) {
                            x10.setValue(Boolean.FALSE);
                        } else if (function2 != null) {
                            function2.invoke();
                        }
                    }
                    x9.setValue(Boolean.FALSE);
                }
                z6 = true;
            }
        }
        return Boolean.valueOf(z6);
    }
}

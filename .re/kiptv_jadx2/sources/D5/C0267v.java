package D5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class C0267v implements p194x6.j {

    public final int f2417h;

    public final Function0 f2418i;
    public final Function0 j;

    public C0267v(Function0 function0, Function0 function1, int i3) {
        this.f2417h = i3;
        this.f2418i = function0;
        this.j = function1;
    }

    @Override
    public final Object invoke(Object obj) {
        Function0 function0;
        switch (this.f2417h) {
            case 0:
                KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                if (I0.c.c(event) != 2) {
                    return Boolean.FALSE;
                }
                boolean z6 = true;
                Function0 function1 = this.f2418i;
                if (function1 == null || !I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4548e)) {
                    Function0 function2 = this.j;
                    if (function2 == null || !I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4549f)) {
                        z6 = false;
                    } else {
                        function2.invoke();
                    }
                } else {
                    function1.invoke();
                }
                return Boolean.valueOf(z6);
            default:
                KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                if (I0.c.c(event2) != 2) {
                    return Boolean.FALSE;
                }
                long jA = I0.c.a(event2.getKeyCode());
                boolean z9 = true;
                if (I0.a.a(jA, I0.a.f4548e)) {
                    Function0 function3 = this.f2418i;
                    if (function3 != null) {
                        function3.invoke();
                    } else {
                        z9 = false;
                    }
                } else if (!I0.a.a(jA, I0.a.f4549f) || (function0 = this.j) == null) {
                    z9 = false;
                } else {
                    function0.invoke();
                }
                return Boolean.valueOf(z9);
        }
    }
}

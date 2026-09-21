package t5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class D implements p194x6.j {

    public final int f27842h;

    public final long f27843i;
    public final Function0 j;

    public D(long j, Function0 function0, int i3) {
        this.f27842h = i3;
        this.f27843i = j;
        this.j = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z6;
        boolean z9;
        switch (this.f27842h) {
            case 0:
                KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                long jA = I0.c.a(event.getKeyCode());
                if (I0.a.a(jA, I0.a.f4545b) || I0.a.a(jA, this.f27843i)) {
                    if (I0.c.c(event) == 2) {
                        this.j.invoke();
                    }
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            default:
                KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                if (I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event2.getKeyCode()), this.f27843i)) {
                    if (I0.c.c(event2) == 2) {
                        this.j.invoke();
                    }
                    z9 = true;
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}

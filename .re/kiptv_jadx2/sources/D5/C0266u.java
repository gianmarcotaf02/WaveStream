package D5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class C0266u implements p194x6.j {

    public final int f2412h;

    public final Function0 f2413i;

    public C0266u(int i3, Function0 function0) {
        this.f2412h = i3;
        this.f2413i = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z6;
        switch (this.f2412h) {
            case 0:
                KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                if (I0.c.c(event) == 2 && I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4548e)) {
                    this.f2413i.invoke();
                    z6 = true;
                } else {
                    z6 = false;
                }
                return Boolean.valueOf(z6);
            case 1:
                KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                boolean z9 = true;
                if (I0.c.c(event2) == 1 && (I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 2:
                KeyEvent event3 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event3, "event");
                boolean z10 = true;
                if (I0.c.c(event3) == 1 && (I0.a.a(I0.c.a(event3.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event3.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 3:
                KeyEvent event4 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event4, "event");
                boolean z11 = true;
                if (I0.c.c(event4) != 1) {
                    return Boolean.FALSE;
                }
                long jA = I0.c.a(event4.getKeyCode());
                if (I0.a.a(jA, I0.a.f4562u) || I0.a.a(jA, I0.a.f4545b)) {
                    this.f2413i.invoke();
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 4:
                KeyEvent event5 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event5, "event");
                boolean z12 = true;
                if (I0.c.c(event5) == 1 && (I0.a.a(I0.c.a(event5.getKeyCode()), I0.a.f4545b) || I0.a.a(I0.c.a(event5.getKeyCode()), I0.a.f4563v))) {
                    this.f2413i.invoke();
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            default:
                KeyEvent event6 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event6, "event");
                boolean z13 = true;
                if (I0.c.c(event6) == 1 && (I0.a.a(I0.c.a(event6.getKeyCode()), I0.a.f4551i) || I0.a.a(I0.c.a(event6.getKeyCode()), I0.a.f4560s))) {
                    this.f2413i.invoke();
                } else {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
        }
    }
}

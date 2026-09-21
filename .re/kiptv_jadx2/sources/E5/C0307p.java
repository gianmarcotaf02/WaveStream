package E5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import t5.AbstractC2782a;

public final class C0307p implements p194x6.j {

    public final int f3116h;

    public final Function0 f3117i;
    public final p020c0.X j;

    public C0307p(Function0 function0, p020c0.X x9, int i3) {
        this.f3116h = i3;
        this.f3117i = function0;
        this.j = x9;
    }

    @Override
    public final Object invoke(Object obj) {
        boolean z6;
        boolean z9;
        switch (this.f3116h) {
            case 0:
                KeyEvent event = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event, "event");
                boolean zA = I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4548e);
                p020c0.X x9 = this.j;
                boolean z10 = true;
                if ((!zA || ((Number) x9.getValue()).intValue() != 0) && (!I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4549f) || ((Number) x9.getValue()).intValue() != p078i6.p.A0(AbstractC2782a.f28120a))) {
                    if (I0.c.c(event) == 1 && I0.a.a(I0.c.a(event.getKeyCode()), I0.a.f4545b)) {
                        this.f3117i.invoke();
                    } else {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                KeyEvent event2 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event2, "event");
                p020c0.X x10 = this.j;
                if (((Boolean) x10.getValue()).booleanValue()) {
                    z6 = false;
                } else {
                    z6 = true;
                    if (I0.c.c(event2) == 1 && (I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4551i) || I0.a.a(I0.c.a(event2.getKeyCode()), I0.a.f4560s))) {
                        x10.setValue(Boolean.TRUE);
                        this.f3117i.invoke();
                    } else {
                        z6 = false;
                    }
                }
                return Boolean.valueOf(z6);
            case 2:
                KeyEvent event3 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event3, "event");
                boolean z11 = true;
                if (I0.c.c(event3) == 1 && I0.a.a(I0.c.a(event3.getKeyCode()), I0.a.f4545b)) {
                    p020c0.X x11 = this.j;
                    if (((Boolean) x11.getValue()).booleanValue()) {
                        x11.setValue(Boolean.FALSE);
                    } else {
                        this.f3117i.invoke();
                    }
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            case 3:
                KeyEvent event4 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event4, "event");
                boolean z12 = true;
                if (I0.c.c(event4) != 1) {
                    return Boolean.FALSE;
                }
                long jA = I0.c.a(event4.getKeyCode());
                boolean zA2 = I0.a.a(jA, I0.a.f4545b);
                Function0 function0 = this.f3117i;
                if (zA2) {
                    function0.invoke();
                } else if (I0.a.a(jA, I0.a.f4548e) && ((Number) this.j.getValue()).intValue() == 0) {
                    function0.invoke();
                } else {
                    z12 = false;
                }
                return Boolean.valueOf(z12);
            default:
                KeyEvent event5 = ((I0.b) obj).f4568a;
                kotlin.jvm.internal.m.e(event5, "event");
                if (((Boolean) this.j.getValue()).booleanValue()) {
                    z9 = true;
                    if (I0.c.c(event5) == 1 && I0.a.a(I0.c.a(event5.getKeyCode()), I0.a.f4549f)) {
                        this.f3117i.invoke();
                    } else {
                        z9 = false;
                    }
                } else {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
        }
    }
}

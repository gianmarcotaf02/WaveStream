package D5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class i0 implements p194x6.j {

    public final long f2304h;

    public final boolean f2305i;
    public final p194x6.j j;

    public final long f2306k;

    public final Function0 f2307l;

    public i0(long j, boolean z6, p194x6.j jVar, long j9, Function0 function0) {
        this.f2304h = j;
        this.f2305i = z6;
        this.j = jVar;
        this.f2306k = j9;
        this.f2307l = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        if (I0.c.c(event) != 2) {
            return Boolean.FALSE;
        }
        long jA = I0.c.a(event.getKeyCode());
        boolean zA = I0.a.a(jA, this.f2304h);
        p194x6.j jVar = this.j;
        boolean z6 = this.f2305i;
        boolean z9 = false;
        if (zA) {
            if (z6) {
                jVar.invoke(-1);
                z9 = true;
            }
        } else if (I0.a.a(jA, this.f2306k)) {
            if (z6) {
                jVar.invoke(1);
                z9 = true;
            }
        } else if (I0.a.a(jA, I0.a.f4551i) || I0.a.a(jA, I0.a.f4560s)) {
            this.f2307l.invoke();
            z9 = true;
        }
        return Boolean.valueOf(z9);
    }
}

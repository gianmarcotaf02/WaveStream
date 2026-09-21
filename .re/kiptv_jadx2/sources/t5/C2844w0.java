package t5;

import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;

public final class C2844w0 implements p194x6.j {

    public final boolean f28430h;

    public final long f28431i;
    public final long j;

    public final Function0 f28432k;

    public C2844w0(boolean z6, long j, long j9, Function0 function0) {
        this.f28430h = z6;
        this.f28431i = j;
        this.j = j9;
        this.f28432k = function0;
    }

    @Override
    public final Object invoke(Object obj) {
        KeyEvent event = ((I0.b) obj).f4568a;
        kotlin.jvm.internal.m.e(event, "event");
        if (!this.f28430h) {
            return Boolean.FALSE;
        }
        long jA = I0.c.a(event.getKeyCode());
        boolean z6 = true;
        if (!I0.a.a(jA, this.f28431i)) {
            if (!I0.a.a(jA, this.j)) {
                z6 = false;
            } else if (I0.c.c(event) == 2) {
                this.f28432k.invoke();
            }
        }
        return Boolean.valueOf(z6);
    }
}

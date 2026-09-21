package K0;

import android.view.MotionEvent;

public final class E extends kotlin.jvm.internal.o implements p194x6.j {

    public final int f6648h;

    public final F f6649i;

    public E(F f9, int i3) {
        super(1);
        this.f6648h = i3;
        this.f6649i = f9;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.f6648h) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                G g = this.f6649i.f6650b;
                if (g != null) {
                    g.invoke(motionEvent);
                    return p070h6.A.f22523a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                G g9 = this.f6649i.f6650b;
                if (g9 != null) {
                    g9.invoke(motionEvent2);
                    return p070h6.A.f22523a;
                }
                kotlin.jvm.internal.m.k("onTouchEvent");
                throw null;
        }
    }
}

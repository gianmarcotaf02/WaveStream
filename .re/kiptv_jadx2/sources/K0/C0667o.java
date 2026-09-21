package K0;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;

public final class C0667o {

    public final Object f6724a;

    public final C0661i f6725b;

    public final int f6726c;

    public final int f6727d;

    public final int f6728e;

    public int f6729f;

    public C0667o(List list, C0661i c0661i) {
        MotionEvent motionEventA;
        this.f6724a = list;
        this.f6725b = c0661i;
        int i3 = 0;
        this.f6726c = (Build.VERSION.SDK_INT < 29 || (motionEventA = a()) == null) ? 0 : motionEventA.getClassification();
        MotionEvent motionEventA2 = a();
        this.f6727d = motionEventA2 != null ? motionEventA2.getButtonState() : 0;
        MotionEvent motionEventA3 = a();
        this.f6728e = motionEventA3 != null ? motionEventA3.getMetaState() : 0;
        MotionEvent motionEventA4 = a();
        if (motionEventA4 != null) {
            int actionMasked = motionEventA4.getActionMasked();
            if (actionMasked == 0) {
                i3 = 1;
            } else if (actionMasked == 1) {
                i3 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i3 = 1;
                        break;
                    case 6:
                        i3 = 2;
                        break;
                    case 7:
                        i3 = 3;
                        break;
                    case 8:
                        i3 = 6;
                        break;
                    case 9:
                        i3 = 4;
                        break;
                    case 10:
                        i3 = 5;
                        break;
                }
            } else {
                i3 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i3 < size) {
                    x xVar = (x) list.get(i3);
                    if (w.d(xVar)) {
                        i3 = 2;
                    } else if (w.b(xVar)) {
                        i3 = 1;
                    } else {
                        i3++;
                    }
                } else {
                    i3 = 3;
                }
            }
        }
        this.f6729f = i3;
    }

    public final MotionEvent a() {
        C0661i c0661i = this.f6725b;
        if (c0661i != null) {
            return (MotionEvent) ((S.p) c0661i.f6708d).j;
        }
        return null;
    }
}

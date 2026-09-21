package I0;

import android.view.KeyEvent;
import p137q0.p;
import p194x6.j;

public abstract class c {
    public static final long a(int i3) {
        long j = (((long) i3) << 32) | (((long) 0) & 4294967295L);
        int i9 = a.f4544O;
        return j;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final p d(p pVar, j jVar) {
        return pVar.d(new d(jVar, null));
    }

    public static final p e(p pVar, j jVar) {
        return pVar.d(new d(null, jVar));
    }
}

package X2;

import android.os.SystemClock;
import androidx.media3.common.util.Log;

public final class h implements c {
    @Override
    public final boolean a(T2.h hVar) {
        T2.c cVar = hVar.f9739a;
        boolean z6 = cVar instanceof T2.a;
        int i3 = Log.LOG_LEVEL_OFF;
        if ((z6 ? ((T2.a) cVar).f9731a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        T2.c cVar2 = hVar.f9740b;
        if (cVar2 instanceof T2.a) {
            i3 = ((T2.a) cVar2).f9731a;
        }
        return i3 > 100;
    }

    @Override
    public final boolean b() {
        boolean z6;
        synchronized (b.f10821a) {
            try {
                int i3 = b.f10823c;
                b.f10823c = i3 + 1;
                if (i3 >= 30 || SystemClock.uptimeMillis() > b.f10824d + ((long) 30000)) {
                    b.f10823c = 0;
                    b.f10824d = SystemClock.uptimeMillis();
                    String[] list = b.f10822b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    b.f10825e = list.length < 800;
                }
                z6 = b.f10825e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z6;
    }
}

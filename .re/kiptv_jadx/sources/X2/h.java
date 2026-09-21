package X2;

/* JADX INFO: loaded from: classes.dex */
public final class h implements X2.c {
    @Override // X2.c
    public final boolean a(T2.h hVar) {
        T2.c cVar = hVar.f9739a;
        boolean z6 = cVar instanceof T2.a;
        int i3 = androidx.media3.common.util.Log.LOG_LEVEL_OFF;
        if ((z6 ? ((T2.a) cVar).f9731a : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        T2.c cVar2 = hVar.f9740b;
        if (cVar2 instanceof T2.a) {
            i3 = ((T2.a) cVar2).f9731a;
        }
        return i3 > 100;
    }

    @Override // X2.c
    public final boolean b() {
        boolean z6;
        synchronized (X2.b.f10821a) {
            try {
                int i3 = X2.b.f10823c;
                X2.b.f10823c = i3 + 1;
                if (i3 >= 30 || android.os.SystemClock.uptimeMillis() > X2.b.f10824d + ((long) 30000)) {
                    X2.b.f10823c = 0;
                    X2.b.f10824d = android.os.SystemClock.uptimeMillis();
                    java.lang.String[] list = X2.b.f10822b.list();
                    if (list == null) {
                        list = new java.lang.String[0];
                    }
                    X2.b.f10825e = list.length < 800;
                }
                z6 = X2.b.f10825e;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z6;
    }
}

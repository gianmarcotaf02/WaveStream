package I0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long a(int i3) {
        long j = (((long) i3) << 32) | (((long) 0) & 4294967295L);
        int i9 = I0.a.f4544O;
        return j;
    }

    public static final long b(android.view.KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final p137q0.p d(p137q0.p pVar, p194x6.j jVar) {
        return pVar.d(new I0.d(jVar, null));
    }

    public static final p137q0.p e(p137q0.p pVar, p194x6.j jVar) {
        return pVar.d(new I0.d(null, jVar));
    }
}

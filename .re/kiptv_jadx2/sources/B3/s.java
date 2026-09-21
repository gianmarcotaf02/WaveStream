package B3;

import android.os.Looper;
import java.util.Locale;

public final class s {

    public static final Object f658i = new Object();

    public final C0089b f659a;

    public final long f660b;

    public final String f661c;
    public q g;

    public r f665h;

    public long f663e = -1;

    public long f664f = 0;

    public final Z3.d f662d = new Z3.d(Looper.getMainLooper(), 2);

    public s(long j, String str) {
        this.f660b = j;
        this.f661c = str;
        this.f659a = new C0089b("RequestTracker", str);
    }

    public final void a(long j, q qVar) {
        q qVar2;
        long j9;
        long j10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object obj = f658i;
        synchronized (obj) {
            qVar2 = this.g;
            j9 = this.f663e;
            j10 = this.f664f;
            this.f663e = j;
            this.g = qVar;
            this.f664f = jCurrentTimeMillis;
        }
        if (qVar2 != null) {
            qVar2.o(this.f661c, j9, j10, jCurrentTimeMillis);
        }
        synchronized (obj) {
            try {
                r rVar = this.f665h;
                if (rVar != null) {
                    this.f662d.removeCallbacks(rVar);
                }
                r rVar2 = new r(0, this);
                this.f665h = rVar2;
                this.f662d.postDelayed(rVar2, this.f660b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j, int i3, o oVar) {
        synchronized (f658i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    e(i3, oVar, "request " + j + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c(long j) {
        boolean z6;
        synchronized (f658i) {
            long j9 = this.f663e;
            z6 = false;
            if (j9 != -1 && j9 == j) {
                z6 = true;
            }
        }
        return z6;
    }

    public final boolean d() {
        boolean z6;
        synchronized (f658i) {
            z6 = this.f663e != -1;
        }
        return z6;
    }

    public final void e(int i3, o oVar, String str) {
        this.f659a.b(str, new Object[0]);
        Object obj = f658i;
        synchronized (obj) {
            try {
                if (this.g != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    q qVar = this.g;
                    H3.q.g(qVar);
                    qVar.i(this.f661c, this.f663e, i3, oVar, this.f664f, jCurrentTimeMillis);
                }
                this.f663e = -1L;
                this.g = null;
                synchronized (obj) {
                    try {
                        r rVar = this.f665h;
                        if (rVar != null) {
                            this.f662d.removeCallbacks(rVar);
                            this.f665h = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean f(int i3) {
        synchronized (f658i) {
            try {
                if (!d()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                e(i3, null, "clearing request " + this.f663e);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

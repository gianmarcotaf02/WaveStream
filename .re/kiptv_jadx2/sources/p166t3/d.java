package p166t3;

import E3.i;
import E6.G;
import Z.AbstractC1149h0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.lifecycle.B;
import androidx.lifecycle.F;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p066h2.a;
import p111n.b;

public final class d {

    public a f27769a;

    public boolean f27770b;

    public boolean f27771c;

    public boolean f27772d;

    public boolean f27773e;

    public final ThreadPoolExecutor f27774f;
    public volatile p075i2.a g;

    public volatile p075i2.a f27775h;

    public final Semaphore f27776i;
    public final Set j;

    public d(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = p075i2.a.f22750o;
        this.f27770b = false;
        this.f27771c = false;
        this.f27772d = true;
        this.f27773e = false;
        signInHubActivity.getApplicationContext();
        this.f27774f = threadPoolExecutor;
        this.f27776i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.g != null) {
            if (!this.f27770b) {
                this.f27773e = true;
            }
            if (this.f27775h != null) {
                this.g.getClass();
                this.g = null;
                return;
            }
            this.g.getClass();
            p075i2.a aVar = this.g;
            aVar.f22755k.set(true);
            if (aVar.f22754i.cancel(false)) {
                this.f27775h = this.g;
            }
            this.g = null;
        }
    }

    public final void b(p075i2.a aVar, Object obj) {
        boolean z6;
        if (this.g != aVar) {
            if (this.f27775h == aVar) {
                SystemClock.uptimeMillis();
                this.f27775h = null;
                c();
                return;
            }
            return;
        }
        if (this.f27771c) {
            return;
        }
        SystemClock.uptimeMillis();
        this.g = null;
        a aVar2 = this.f27769a;
        if (aVar2 != null) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                aVar2.i(obj);
                return;
            }
            synchronized (aVar2.f16279a) {
                z6 = aVar2.f16284f == F.f16278k;
                aVar2.f16284f = obj;
            }
            if (z6) {
                p111n.a aVarM0 = p111n.a.m0();
                B b9 = aVar2.j;
                b bVar = aVarM0.f25518a;
                if (bVar.f25521c == null) {
                    synchronized (bVar.f25519a) {
                        try {
                            if (bVar.f25521c == null) {
                                bVar.f25521c = b.m0(Looper.getMainLooper());
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                bVar.f25521c.post(b9);
            }
        }
    }

    public final void c() {
        if (this.f27775h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        p075i2.a aVar = this.g;
        ThreadPoolExecutor threadPoolExecutor = this.f27774f;
        if (aVar.j == 1) {
            aVar.j = 2;
            aVar.f22753h.getClass();
            threadPoolExecutor.execute(aVar.f22754i);
        } else {
            int iC = AbstractC1149h0.c(aVar.j);
            if (iC == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iC == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((i) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f27776i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e6) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e6);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        G.i(this, sb);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}

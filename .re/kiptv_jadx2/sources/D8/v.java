package D8;

import com.google.android.gms.internal.play_billing.M0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;

public final class v {

    public final int f2591a;

    public final n f2592b;

    public long f2593c;

    public long f2594d;

    public long f2595e;

    public long f2596f;
    public final ArrayDeque g;

    public boolean f2597h;

    public final t f2598i;
    public final s j;

    public final u f2599k;

    public final u f2600l;

    public int f2601m;

    public IOException f2602n;

    public v(int i3, n connection, boolean z6, boolean z9, w8.m mVar) {
        kotlin.jvm.internal.m.e(connection, "connection");
        this.f2591a = i3;
        this.f2592b = connection;
        this.f2596f = connection.f2565x.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.f2598i = new t(this, connection.f2564w.a(), z9);
        this.j = new s(this, z6);
        this.f2599k = new u(this);
        this.f2600l = new u(this);
        if (mVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z6;
        boolean zH;
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            try {
                t tVar = this.f2598i;
                if (tVar.f2586i || !tVar.f2588l) {
                    z6 = false;
                } else {
                    s sVar = this.j;
                    if (sVar.f2582h || sVar.j) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            c(null, 9);
        } else {
            if (zH) {
                return;
            }
            this.f2592b.i(this.f2591a);
        }
    }

    public final void b() throws IOException {
        s sVar = this.j;
        if (sVar.j) {
            throw new IOException("stream closed");
        }
        if (sVar.f2582h) {
            throw new IOException("stream finished");
        }
        if (this.f2601m != 0) {
            IOException iOException = this.f2602n;
            if (iOException != null) {
                throw iOException;
            }
            int i3 = this.f2601m;
            M0.r(i3);
            throw new B(i3);
        }
    }

    public final void c(IOException iOException, int i3) {
        M0.s(i3, "rstStatusCode");
        if (d(iOException, i3)) {
            n nVar = this.f2592b;
            nVar.getClass();
            M0.s(i3, "statusCode");
            nVar.f2547D.v(this.f2591a, i3);
        }
    }

    public final boolean d(IOException iOException, int i3) {
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            if (this.f2601m != 0) {
                return false;
            }
            this.f2601m = i3;
            this.f2602n = iOException;
            notifyAll();
            if (this.f2598i.f2586i && this.j.f2582h) {
                return false;
            }
            this.f2592b.i(this.f2591a);
            return true;
        }
    }

    public final void e(int i3) {
        M0.s(i3, "errorCode");
        if (d(null, i3)) {
            this.f2592b.v(this.f2591a, i3);
        }
    }

    public final s f() {
        synchronized (this) {
            if (!this.f2597h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z6 = (this.f2591a & 1) == 1;
        this.f2592b.getClass();
        return true == z6;
    }

    public final synchronized boolean h() {
        if (this.f2601m != 0) {
            return false;
        }
        t tVar = this.f2598i;
        if (tVar.f2586i || tVar.f2588l) {
            s sVar = this.j;
            if ((sVar.f2582h || sVar.j) && this.f2597h) {
                return false;
            }
        }
        return true;
    }

    public final void i(w8.m headers, boolean z6) {
        boolean zH;
        kotlin.jvm.internal.m.e(headers, "headers");
        byte[] bArr = x8.b.f31716a;
        synchronized (this) {
            try {
                if (this.f2597h && z6) {
                    this.f2598i.getClass();
                } else {
                    this.f2597h = true;
                    this.g.add(headers);
                }
                if (z6) {
                    this.f2598i.f2586i = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f2592b.i(this.f2591a);
    }

    public final synchronized void j(int i3) {
        M0.s(i3, "errorCode");
        if (this.f2601m == 0) {
            this.f2601m = i3;
            notifyAll();
        }
    }

    public final void k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}

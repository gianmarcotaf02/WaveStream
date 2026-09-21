package D8;

import M8.C0682j;
import M8.D;
import M8.E;
import Z2.C0;
import com.google.android.gms.internal.play_billing.M0;
import io.ktor.network.sockets.DatagramKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class n implements Closeable, AutoCloseable {

    public static final A f2543G;

    public long f2544A;

    public long f2545B;

    public final Socket f2546C;

    public final w f2547D;

    public final A7.l f2548E;

    public final LinkedHashSet f2549F;

    public final h f2550h;

    public final LinkedHashMap f2551i = new LinkedHashMap();
    public final String j;

    public int f2552k;

    public int f2553l;

    public boolean f2554m;

    public final z8.c f2555n;

    public final z8.b f2556o;

    public final z8.b f2557p;

    public final z8.b f2558q;

    public final z f2559r;

    public long f2560s;

    public long f2561t;

    public long f2562u;

    public long f2563v;

    public final A f2564w;

    public A f2565x;
    public long y;

    public long f2566z;

    static {
        A a2 = new A();
        a2.c(7, DatagramKt.MAX_DATAGRAM_SIZE);
        a2.c(5, 16384);
        f2543G = a2;
    }

    public n(C0 c9) {
        this.f2550h = (h) c9.f12660f;
        String str = (String) c9.f12657c;
        if (str == null) {
            kotlin.jvm.internal.m.k("connectionName");
            throw null;
        }
        this.j = str;
        this.f2553l = 3;
        z8.c cVar = (z8.c) c9.f12655a;
        this.f2555n = cVar;
        this.f2556o = cVar.e();
        this.f2557p = cVar.e();
        this.f2558q = cVar.e();
        this.f2559r = z.f2614a;
        A a2 = new A();
        a2.c(7, 16777216);
        this.f2564w = a2;
        A a9 = f2543G;
        this.f2565x = a9;
        this.f2545B = a9.a();
        Socket socket = (Socket) c9.f12656b;
        if (socket == null) {
            kotlin.jvm.internal.m.k("socket");
            throw null;
        }
        this.f2546C = socket;
        D d4 = (D) c9.f12659e;
        if (d4 == null) {
            kotlin.jvm.internal.m.k("sink");
            throw null;
        }
        this.f2547D = new w(d4);
        E e6 = (E) c9.f12658d;
        if (e6 == null) {
            kotlin.jvm.internal.m.k("source");
            throw null;
        }
        this.f2548E = new A7.l(9, this, new r(e6), false);
        this.f2549F = new LinkedHashSet();
    }

    public final void b(int i3, int i9, IOException iOException) {
        int i10;
        Object[] array;
        M0.s(i3, "connectionCode");
        M0.s(i9, "streamCode");
        byte[] bArr = x8.b.f31716a;
        try {
            j(i3);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f2551i.isEmpty()) {
                array = null;
            } else {
                array = this.f2551i.values().toArray(new v[0]);
                this.f2551i.clear();
            }
        }
        v[] vVarArr = (v[]) array;
        if (vVarArr != null) {
            for (v vVar : vVarArr) {
                try {
                    vVar.c(iOException, i9);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f2547D.close();
        } catch (IOException unused3) {
        }
        try {
            this.f2546C.close();
        } catch (IOException unused4) {
        }
        this.f2556o.e();
        this.f2557p.e();
        this.f2558q.e();
    }

    @Override
    public final void close() {
        b(1, 9, null);
    }

    public final synchronized v e(int i3) {
        return (v) this.f2551i.get(Integer.valueOf(i3));
    }

    public final void flush() {
        this.f2547D.flush();
    }

    public final synchronized v i(int i3) {
        v vVar;
        vVar = (v) this.f2551i.remove(Integer.valueOf(i3));
        notifyAll();
        return vVar;
    }

    public final void j(int i3) {
        M0.s(i3, "statusCode");
        synchronized (this.f2547D) {
            synchronized (this) {
                if (this.f2554m) {
                    return;
                }
                this.f2554m = true;
                this.f2547D.j(x8.b.f31716a, this.f2552k, i3);
            }
        }
    }

    public final synchronized void t(long j) {
        long j9 = this.y + j;
        this.y = j9;
        long j10 = j9 - this.f2566z;
        if (j10 >= this.f2564w.a() / 2) {
            z(0, j10);
            this.f2566z += j10;
        }
    }

    public final void u(int i3, boolean z6, C0682j c0682j, long j) {
        long j9;
        long j10;
        int iMin;
        long j11;
        if (j == 0) {
            this.f2547D.e(z6, i3, c0682j, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j9 = this.f2544A;
                            j10 = this.f2545B;
                            if (j9 >= j10) {
                                if (!this.f2551i.containsKey(Integer.valueOf(i3))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j10 - j9), this.f2547D.j);
                j11 = iMin;
                this.f2544A += j11;
            }
            j -= j11;
            this.f2547D.e(z6 && j == 0, i3, c0682j, iMin);
        }
    }

    public final void v(int i3, int i9) {
        M0.s(i9, "errorCode");
        this.f2556o.c(new j(this.j + '[' + i3 + "] writeSynReset", this, i3, i9, 2), 0L);
    }

    public final void z(int i3, long j) {
        this.f2556o.c(new m(this.j + '[' + i3 + "] windowUpdate", this, i3, j), 0L);
    }
}

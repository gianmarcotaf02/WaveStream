package A8;

import io.sentry.ProfilingTraceData;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p078i6.u;
import w8.B;
import w8.InterfaceC3025e;
import w8.InterfaceC3026f;
import w8.v;

public final class j implements InterfaceC3025e {

    public final w8.s f403h;

    public final v f404i;
    public final boolean j;

    public final q f405k;

    public final i f406l;

    public final AtomicBoolean f407m;

    public Object f408n;

    public f f409o;

    public o f410p;

    public boolean f411q;

    public e f412r;

    public boolean f413s;

    public boolean f414t;

    public boolean f415u;

    public volatile boolean f416v;

    public volatile e f417w;

    public volatile o f418x;

    public j(w8.s client, v originalRequest, boolean z6) {
        kotlin.jvm.internal.m.e(client, "client");
        kotlin.jvm.internal.m.e(originalRequest, "originalRequest");
        this.f403h = client;
        this.f404i = originalRequest;
        this.j = z6;
        this.f405k = (q) client.f30631i.f18362i;
        client.f30633l.getClass();
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.f406l = iVar;
        this.f407m = new AtomicBoolean();
        this.f415u = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(jVar.f416v ? "canceled " : "");
        sb.append(jVar.j ? "web socket" : "call");
        sb.append(" to ");
        sb.append(jVar.f404i.f30659a.f());
        return sb.toString();
    }

    public final void b(o oVar) {
        byte[] bArr = x8.b.f31716a;
        if (this.f410p != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f410p = oVar;
        oVar.f439p.add(new h(this, this.f408n));
    }

    public final IOException c(IOException iOException) {
        IOException interruptedIOException;
        Socket socketJ;
        byte[] bArr = x8.b.f31716a;
        o oVar = this.f410p;
        if (oVar != null) {
            synchronized (oVar) {
                socketJ = j();
            }
            if (this.f410p == null) {
                if (socketJ != null) {
                    x8.b.d(socketJ);
                }
            } else if (socketJ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f411q && this.f406l.j()) {
            interruptedIOException = new InterruptedIOException(ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            kotlin.jvm.internal.m.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new j(this.f403h, this.f404i, this.j);
    }

    public final void d() {
        Socket socket;
        if (this.f416v) {
            return;
        }
        this.f416v = true;
        e eVar = this.f417w;
        if (eVar != null) {
            eVar.f387c.cancel();
        }
        o oVar = this.f418x;
        if (oVar == null || (socket = oVar.f428c) == null) {
            return;
        }
        x8.b.d(socket);
    }

    public final void e(InterfaceC3026f interfaceC3026f) {
        g gVar;
        if (!this.f407m.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        E8.n nVar = E8.n.f3326a;
        this.f408n = E8.n.f3326a.g();
        A7.m mVar = this.f403h.f30630h;
        g gVar2 = new g(this, interfaceC3026f);
        mVar.getClass();
        synchronized (mVar) {
            ((ArrayDeque) mVar.j).add(gVar2);
            if (!this.j) {
                String str = this.f404i.f30659a.f30586d;
                Iterator it = ((ArrayDeque) mVar.f322k).iterator();
                do {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) mVar.j).iterator();
                        do {
                            if (!it2.hasNext()) {
                                gVar = null;
                                break;
                            }
                            gVar = (g) it2.next();
                        } while (!kotlin.jvm.internal.m.a(gVar.j.f404i.f30659a.f30586d, str));
                    } else {
                        gVar = (g) it.next();
                    }
                } while (!kotlin.jvm.internal.m.a(gVar.j.f404i.f30659a.f30586d, str));
                if (gVar != null) {
                    gVar2.f400i = gVar.f400i;
                }
            }
        }
        mVar.O();
    }

    public final void f(boolean z6) {
        e eVar;
        synchronized (this) {
            if (!this.f415u) {
                throw new IllegalStateException("released");
            }
        }
        if (z6 && (eVar = this.f417w) != null) {
            eVar.f387c.cancel();
            eVar.f385a.h(eVar, true, true, null);
        }
        this.f412r = null;
    }

    public final B g() {
        ArrayList arrayList = new ArrayList();
        u.M0(arrayList, this.f403h.j);
        arrayList.add(new B8.a(this.f403h));
        arrayList.add(new B8.a(this.f403h.f30638q));
        this.f403h.getClass();
        arrayList.add(new y8.b());
        arrayList.add(a.f370a);
        if (!this.j) {
            u.M0(arrayList, this.f403h.f30632k);
        }
        arrayList.add(new B8.b(this.j));
        v vVar = this.f404i;
        w8.s sVar = this.f403h;
        boolean z6 = false;
        try {
            try {
                B bF = new B8.f(this, arrayList, 0, null, vVar, sVar.f30626D, sVar.f30627E, sVar.f30628F).f(this.f404i);
                if (this.f416v) {
                    x8.b.c(bF);
                    throw new IOException("Canceled");
                }
                i(null);
                return bF;
            } catch (IOException e6) {
                z6 = true;
                IOException iOExceptionI = i(e6);
                kotlin.jvm.internal.m.c(iOExceptionI, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionI;
            }
        } catch (Throwable th) {
            if (!z6) {
                i(null);
            }
            throw th;
        }
        if (!z6) {
            i(null);
        }
        throw th;
    }

    public final IOException h(e exchange, boolean z6, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        kotlin.jvm.internal.m.e(exchange, "exchange");
        if (exchange.equals(this.f417w)) {
            synchronized (this) {
                z10 = false;
                if (z6) {
                    try {
                        if (this.f413s) {
                            if (z6) {
                                this.f413s = false;
                            }
                            if (z9) {
                                this.f414t = false;
                            }
                            z12 = this.f413s;
                            if (z12) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (!z12) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        } else if (z9 || !this.f414t) {
                            z11 = false;
                        } else {
                            if (z6) {
                                this.f413s = false;
                            }
                            if (z9) {
                                this.f414t = false;
                            }
                            z12 = this.f413s;
                            if (z12 || this.f414t) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (!z12 && !this.f414t && !this.f415u) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z9) {
                    }
                    z11 = false;
                }
            }
            if (z10) {
                this.f417w = null;
                o oVar = this.f410p;
                if (oVar != null) {
                    synchronized (oVar) {
                        oVar.f436m++;
                    }
                }
            }
            if (z11) {
                return c(iOException);
            }
        }
        return iOException;
    }

    public final IOException i(IOException iOException) {
        boolean z6;
        synchronized (this) {
            z6 = false;
            if (this.f415u) {
                this.f415u = false;
                if (!this.f413s && !this.f414t) {
                    z6 = true;
                }
            }
        }
        return z6 ? c(iOException) : iOException;
    }

    public final Socket j() {
        o oVar = this.f410p;
        kotlin.jvm.internal.m.b(oVar);
        byte[] bArr = x8.b.f31716a;
        ArrayList arrayList = oVar.f439p;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (kotlin.jvm.internal.m.a(((Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i3);
        this.f410p = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        oVar.f440q = System.nanoTime();
        q qVar = this.f405k;
        qVar.getClass();
        byte[] bArr2 = x8.b.f31716a;
        boolean z6 = oVar.j;
        z8.b bVar = qVar.f444b;
        if (!z6) {
            bVar.c(qVar.f445c, 0L);
            return null;
        }
        oVar.j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = qVar.f446d;
        concurrentLinkedQueue.remove(oVar);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = oVar.f429d;
        kotlin.jvm.internal.m.b(socket);
        return socket;
    }

    public final void k() {
        if (this.f411q) {
            throw new IllegalStateException("Check failed.");
        }
        this.f411q = true;
        this.f406l.j();
    }
}

package A8;

import D8.C0272a;
import M8.AbstractC0674b;
import M8.D;
import M8.E;
import java.io.IOException;
import java.net.Socket;
import w8.A;
import w8.B;
import w8.v;
import w8.z;

public final class e {

    public final j f385a;

    public final f f386b;

    public final B8.d f387c;

    public boolean f388d;

    public boolean f389e;

    public final o f390f;

    public e(j call, f finder, B8.d dVar) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(finder, "finder");
        this.f385a = call;
        this.f386b = finder;
        this.f387c = dVar;
        this.f390f = dVar.e();
    }

    public final IOException a(boolean z6, boolean z9, IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        j call = this.f385a;
        if (z9) {
            if (iOException != null) {
                kotlin.jvm.internal.m.e(call, "call");
            } else {
                kotlin.jvm.internal.m.e(call, "call");
            }
        }
        if (z6) {
            if (iOException != null) {
                kotlin.jvm.internal.m.e(call, "call");
            } else {
                kotlin.jvm.internal.m.e(call, "call");
            }
        }
        return call.h(this, z9, z6, iOException);
    }

    public final c b(v request, boolean z6) {
        kotlin.jvm.internal.m.e(request, "request");
        this.f388d = z6;
        z zVar = request.f30662d;
        kotlin.jvm.internal.m.b(zVar);
        long jContentLength = zVar.contentLength();
        j call = this.f385a;
        kotlin.jvm.internal.m.e(call, "call");
        return new c(this, this.f387c.c(request, jContentLength), jContentLength);
    }

    public final n c() {
        this.f385a.k();
        o oVarE = this.f387c.e();
        oVarE.getClass();
        Socket socket = oVarE.f429d;
        kotlin.jvm.internal.m.b(socket);
        E e6 = oVarE.f432h;
        kotlin.jvm.internal.m.b(e6);
        D d4 = oVarE.f433i;
        kotlin.jvm.internal.m.b(d4);
        socket.setSoTimeout(0);
        oVarE.k();
        return new n(e6, d4, this);
    }

    public final B8.g d(B b9) throws IOException {
        B8.d dVar = this.f387c;
        try {
            String strB = B.b("Content-Type", b9);
            long jG = dVar.g(b9);
            return new B8.g(strB, jG, AbstractC0674b.c(new d(this, dVar.b(b9), jG)));
        } catch (IOException e6) {
            j call = this.f385a;
            kotlin.jvm.internal.m.e(call, "call");
            f(e6);
            throw e6;
        }
    }

    public final A e(boolean z6) throws IOException {
        try {
            A aD = this.f387c.d(z6);
            if (aD != null) {
                aD.f30485m = this;
            }
            return aD;
        } catch (IOException e6) {
            j call = this.f385a;
            kotlin.jvm.internal.m.e(call, "call");
            f(e6);
            throw e6;
        }
    }

    public final void f(IOException iOException) {
        this.f389e = true;
        this.f386b.c(iOException);
        o oVarE = this.f387c.e();
        j call = this.f385a;
        synchronized (oVarE) {
            try {
                kotlin.jvm.internal.m.e(call, "call");
                if (!(iOException instanceof D8.B)) {
                    if (!(oVarE.g != null) || (iOException instanceof C0272a)) {
                        oVarE.j = true;
                        if (oVarE.f436m == 0) {
                            o.d(call.f403h, oVarE.f427b, iOException);
                            oVarE.f435l++;
                        }
                    }
                } else if (((D8.B) iOException).f2502h == 8) {
                    int i3 = oVarE.f437n + 1;
                    oVarE.f437n = i3;
                    if (i3 > 1) {
                        oVarE.j = true;
                        oVarE.f435l++;
                    }
                } else if (((D8.B) iOException).f2502h != 9 || !call.f416v) {
                    oVarE.j = true;
                    oVarE.f435l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

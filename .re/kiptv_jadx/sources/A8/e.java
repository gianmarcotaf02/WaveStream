package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A8.j f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A8.f f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B8.d f387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final A8.o f390f;

    public e(A8.j call, A8.f finder, B8.d dVar) {
        kotlin.jvm.internal.m.e(call, "call");
        kotlin.jvm.internal.m.e(finder, "finder");
        this.f385a = call;
        this.f386b = finder;
        this.f387c = dVar;
        this.f390f = dVar.e();
    }

    public final java.io.IOException a(boolean z6, boolean z9, java.io.IOException iOException) {
        if (iOException != null) {
            f(iOException);
        }
        A8.j call = this.f385a;
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

    public final A8.c b(w8.v request, boolean z6) {
        kotlin.jvm.internal.m.e(request, "request");
        this.f388d = z6;
        w8.z zVar = request.f30662d;
        kotlin.jvm.internal.m.b(zVar);
        long jContentLength = zVar.contentLength();
        A8.j call = this.f385a;
        kotlin.jvm.internal.m.e(call, "call");
        return new A8.c(this, this.f387c.c(request, jContentLength), jContentLength);
    }

    public final A8.n c() {
        this.f385a.k();
        A8.o oVarE = this.f387c.e();
        oVarE.getClass();
        java.net.Socket socket = oVarE.f429d;
        kotlin.jvm.internal.m.b(socket);
        M8.E e6 = oVarE.f432h;
        kotlin.jvm.internal.m.b(e6);
        M8.D d4 = oVarE.f433i;
        kotlin.jvm.internal.m.b(d4);
        socket.setSoTimeout(0);
        oVarE.k();
        return new A8.n(e6, d4, this);
    }

    public final B8.g d(w8.B b9) throws java.io.IOException {
        B8.d dVar = this.f387c;
        try {
            java.lang.String strB = w8.B.b("Content-Type", b9);
            long jG = dVar.g(b9);
            return new B8.g(strB, jG, M8.AbstractC0674b.c(new A8.d(this, dVar.b(b9), jG)));
        } catch (java.io.IOException e6) {
            A8.j call = this.f385a;
            kotlin.jvm.internal.m.e(call, "call");
            f(e6);
            throw e6;
        }
    }

    public final w8.A e(boolean z6) throws java.io.IOException {
        try {
            w8.A aD = this.f387c.d(z6);
            if (aD != null) {
                aD.f30485m = this;
            }
            return aD;
        } catch (java.io.IOException e6) {
            A8.j call = this.f385a;
            kotlin.jvm.internal.m.e(call, "call");
            f(e6);
            throw e6;
        }
    }

    public final void f(java.io.IOException iOException) {
        this.f389e = true;
        this.f386b.c(iOException);
        A8.o oVarE = this.f387c.e();
        A8.j call = this.f385a;
        synchronized (oVarE) {
            try {
                kotlin.jvm.internal.m.e(call, "call");
                if (!(iOException instanceof D8.B)) {
                    if (!(oVarE.g != null) || (iOException instanceof D8.C0272a)) {
                        oVarE.j = true;
                        if (oVarE.f436m == 0) {
                            A8.o.d(call.f403h, oVarE.f427b, iOException);
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
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}

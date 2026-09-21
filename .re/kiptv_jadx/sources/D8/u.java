package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends M8.C0678f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D8.v f2590m;

    public u(D8.v vVar) {
        this.f2590m = vVar;
    }

    @Override // M8.C0678f
    public final void k() {
        this.f2590m.e(9);
        D8.n nVar = this.f2590m.f2592b;
        synchronized (nVar) {
            long j = nVar.f2562u;
            long j9 = nVar.f2561t;
            if (j < j9) {
                return;
            }
            nVar.f2561t = j9 + 1;
            nVar.f2563v = java.lang.System.nanoTime() + ((long) 1000000000);
            nVar.f2556o.c(new A8.p(Y6.f.m(new java.lang.StringBuilder(), nVar.j, " ping"), 1, nVar), 0L);
        }
    }

    public final void l() {
        if (j()) {
            throw new java.net.SocketTimeoutException(io.sentry.ProfilingTraceData.TRUNCATION_REASON_TIMEOUT);
        }
    }
}

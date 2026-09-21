package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends M8.r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f380i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f381k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f382l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f383m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ A8.e f384n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(A8.e eVar, M8.K delegate, long j) {
        super(delegate);
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f384n = eVar;
        this.f380i = j;
        this.f381k = true;
        if (j == 0) {
            b(null);
        }
    }

    public final java.io.IOException b(java.io.IOException iOException) {
        if (this.f382l) {
            return iOException;
        }
        this.f382l = true;
        A8.e eVar = this.f384n;
        if (iOException == null && this.f381k) {
            this.f381k = false;
            eVar.getClass();
            A8.j call = eVar.f385a;
            kotlin.jvm.internal.m.e(call, "call");
        }
        return eVar.a(true, false, iOException);
    }

    @Override // M8.r, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        if (this.f383m) {
            return;
        }
        this.f383m = true;
        try {
            super.close();
            b(null);
        } catch (java.io.IOException e6) {
            throw b(e6);
        }
    }

    @Override // M8.r, M8.K
    public final long m(long j, M8.C0682j sink) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (this.f383m) {
            throw new java.lang.IllegalStateException("closed");
        }
        try {
            long jM = this.f7277h.m(j, sink);
            if (this.f381k) {
                this.f381k = false;
                A8.e eVar = this.f384n;
                eVar.getClass();
                A8.j call = eVar.f385a;
                kotlin.jvm.internal.m.e(call, "call");
            }
            if (jM == -1) {
                b(null);
                return -1L;
            }
            long j9 = this.j + jM;
            long j10 = this.f380i;
            if (j10 == -1 || j9 <= j10) {
                this.j = j9;
                if (j9 == j10) {
                    b(null);
                }
                return jM;
            }
            throw new java.net.ProtocolException("expected " + j10 + " bytes but received " + j9);
        } catch (java.io.IOException e6) {
            throw b(e6);
        }
    }
}

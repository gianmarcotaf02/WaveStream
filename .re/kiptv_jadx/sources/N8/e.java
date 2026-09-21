package N8;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends M8.r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7482i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7483k;

    public e(M8.K k9, long j, boolean z6) {
        super(k9);
        this.f7482i = j;
        this.j = z6;
    }

    @Override // M8.r, M8.K
    public final long m(long j, M8.C0682j sink) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        long j9 = this.f7483k;
        long j10 = this.f7482i;
        if (j9 > j10) {
            j = 0;
        } else if (this.j) {
            long j11 = j10 - j9;
            if (j11 == 0) {
                return -1L;
            }
            j = java.lang.Math.min(j, j11);
        }
        long jM = super.m(j, sink);
        if (jM != -1) {
            this.f7483k += jM;
        }
        long j12 = this.f7483k;
        if ((j12 >= j10 || jM != -1) && j12 <= j10) {
            return jM;
        }
        if (jM > 0 && j12 > j10) {
            long j13 = sink.f7260i - (j12 - j10);
            M8.C0682j c0682j = new M8.C0682j();
            c0682j.M(sink);
            sink.J(j13, c0682j);
            c0682j.C(c0682j.f7260i);
        }
        java.lang.StringBuilder sbU = p121o0.p.u(j10, "expected ", " bytes but got ");
        sbU.append(this.f7483k);
        throw new java.io.IOException(sbU.toString());
    }
}

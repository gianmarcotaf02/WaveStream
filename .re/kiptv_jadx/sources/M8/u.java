package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class u implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.E f7283h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.zip.Inflater f7284i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7285k;

    public u(M8.E e6, java.util.zip.Inflater inflater) {
        this.f7283h = e6;
        this.f7284i = inflater;
    }

    public final long b(long j, M8.C0682j sink) throws java.io.IOException {
        java.util.zip.Inflater inflater = this.f7284i;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f7285k) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                M8.F fW = sink.W(1);
                int iMin = (int) java.lang.Math.min(j, 8192 - fW.f7221c);
                boolean zNeedsInput = inflater.needsInput();
                M8.E e6 = this.f7283h;
                if (zNeedsInput && !e6.o()) {
                    M8.F f9 = e6.f7218i.f7259h;
                    kotlin.jvm.internal.m.b(f9);
                    int i3 = f9.f7221c;
                    int i9 = f9.f7220b;
                    int i10 = i3 - i9;
                    this.j = i10;
                    inflater.setInput(f9.f7219a, i9, i10);
                }
                int iInflate = inflater.inflate(fW.f7219a, fW.f7221c, iMin);
                int i11 = this.j;
                if (i11 != 0) {
                    int remaining = i11 - inflater.getRemaining();
                    this.j -= remaining;
                    e6.C(remaining);
                }
                if (iInflate > 0) {
                    fW.f7221c += iInflate;
                    long j9 = iInflate;
                    sink.f7260i += j9;
                    return j9;
                }
                if (fW.f7220b == fW.f7221c) {
                    sink.f7259h = fW.a();
                    M8.G.a(fW);
                }
            } catch (java.util.zip.DataFormatException e9) {
                throw new java.io.IOException(e9);
            }
        }
        return 0L;
    }

    @Override // M8.K
    public final M8.M c() {
        return this.f7283h.f7217h.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7285k) {
            return;
        }
        this.f7284i.end();
        this.f7285k = true;
        this.f7283h.close();
    }

    @Override // M8.K
    public final long m(long j, M8.C0682j sink) throws java.io.IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        do {
            long jB = b(j, sink);
            if (jB > 0) {
                return jB;
            }
            java.util.zip.Inflater inflater = this.f7284i;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f7283h.o());
        throw new java.io.EOFException("source exhausted prematurely");
    }
}

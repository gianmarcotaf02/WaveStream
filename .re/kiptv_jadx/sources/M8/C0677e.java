package M8;

/* JADX INFO: renamed from: M8.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0677e implements M8.K {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7243h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f7244i;
    public final java.lang.Object j;

    public C0677e(java.io.InputStream input, M8.M m8) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f7244i = input;
        this.j = m8;
    }

    @Override // M8.K
    public final M8.M c() {
        switch (this.f7243h) {
            case 0:
                return (M8.J) this.f7244i;
            default:
                return (M8.M) this.j;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        switch (this.f7243h) {
            case 0:
                M8.C0677e c0677e = (M8.C0677e) this.j;
                M8.J j = (M8.J) this.f7244i;
                j.i();
                try {
                    try {
                        c0677e.close();
                        if (j.j()) {
                            throw j.l(null);
                        }
                        return;
                    } catch (java.io.IOException e6) {
                        if (!j.j()) {
                            throw e6;
                        }
                        throw j.l(e6);
                    }
                } catch (java.lang.Throwable th) {
                    j.j();
                    throw th;
                }
            default:
                ((java.io.InputStream) this.f7244i).close();
                return;
        }
    }

    @Override // M8.K
    public final long m(long j, M8.C0682j sink) {
        switch (this.f7243h) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                M8.C0677e c0677e = (M8.C0677e) this.j;
                M8.J j9 = (M8.J) this.f7244i;
                j9.i();
                try {
                    try {
                        long jM = c0677e.m(j, sink);
                        if (j9.j()) {
                            throw j9.l(null);
                        }
                        return jM;
                    } catch (java.io.IOException e6) {
                        if (j9.j()) {
                            throw j9.l(e6);
                        }
                        throw e6;
                    }
                } catch (java.lang.Throwable th) {
                    j9.j();
                    throw th;
                }
            default:
                kotlin.jvm.internal.m.e(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
                }
                try {
                    ((M8.M) this.j).f();
                    M8.F fW = sink.W(1);
                    int i3 = ((java.io.InputStream) this.f7244i).read(fW.f7219a, fW.f7221c, (int) java.lang.Math.min(j, 8192 - fW.f7221c));
                    if (i3 == -1) {
                        if (fW.f7220b == fW.f7221c) {
                            sink.f7259h = fW.a();
                            M8.G.a(fW);
                        }
                        return -1L;
                    }
                    fW.f7221c += i3;
                    long j10 = i3;
                    sink.f7260i += j10;
                    return j10;
                } catch (java.lang.AssertionError e9) {
                    if (M8.AbstractC0674b.f(e9)) {
                        throw new java.io.IOException(e9);
                    }
                    throw e9;
                }
        }
    }

    public final java.lang.String toString() {
        switch (this.f7243h) {
            case 0:
                return "AsyncTimeout.source(" + ((M8.C0677e) this.j) + ')';
            default:
                return "source(" + ((java.io.InputStream) this.f7244i) + ')';
        }
    }

    public C0677e(M8.J j, M8.C0677e c0677e) {
        this.f7244i = j;
        this.j = c0677e;
    }
}

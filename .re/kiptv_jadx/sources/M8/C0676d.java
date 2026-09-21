package M8;

/* JADX INFO: renamed from: M8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0676d implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f7242i;
    public final java.lang.Object j;

    public /* synthetic */ C0676d(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f7241h = i3;
        this.f7242i = obj;
        this.j = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009e A[LOOP:1: B:12:0x0065->B:25:0x009e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0 A[SYNTHETIC] */
    @Override // M8.I
    public final void J(long j, M8.C0682j source) throws java.io.IOException {
        M8.J j9;
        switch (this.f7241h) {
            case 0:
                kotlin.jvm.internal.m.e(source, "source");
                M8.AbstractC0674b.e(source.f7260i, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    M8.F f9 = source.f7259h;
                    kotlin.jvm.internal.m.b(f9);
                    try {
                        try {
                            while (j11 < androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                                j11 += (long) (f9.f7221c - f9.f7220b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    M8.C0676d c0676d = (M8.C0676d) this.j;
                                    j9 = (M8.J) this.f7242i;
                                    j9.i();
                                    c0676d.J(j11, source);
                                    if (!j9.j()) {
                                        throw j9.l(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    f9 = f9.f7224f;
                                    kotlin.jvm.internal.m.b(f9);
                                }
                            }
                            c0676d.J(j11, source);
                            if (!j9.j()) {
                                throw j9.l(null);
                            }
                            j10 -= j11;
                        } catch (java.io.IOException e6) {
                            if (!j9.j()) {
                                throw e6;
                            }
                            throw j9.l(e6);
                        }
                    } catch (java.lang.Throwable th) {
                        j9.j();
                        throw th;
                    }
                    M8.C0676d c0676d2 = (M8.C0676d) this.j;
                    j9 = (M8.J) this.f7242i;
                    j9.i();
                }
                break;
            default:
                kotlin.jvm.internal.m.e(source, "source");
                M8.AbstractC0674b.e(source.f7260i, 0L, j);
                while (j > 0) {
                    ((M8.M) this.j).f();
                    M8.F f10 = source.f7259h;
                    kotlin.jvm.internal.m.b(f10);
                    int iMin = (int) java.lang.Math.min(j, f10.f7221c - f10.f7220b);
                    ((java.io.OutputStream) this.f7242i).write(f10.f7219a, f10.f7220b, iMin);
                    int i3 = f10.f7220b + iMin;
                    f10.f7220b = i3;
                    long j12 = iMin;
                    j -= j12;
                    source.f7260i -= j12;
                    if (i3 == f10.f7221c) {
                        source.f7259h = f10.a();
                        M8.G.a(f10);
                    }
                }
                return;
        }
    }

    @Override // M8.I
    public final M8.M c() {
        switch (this.f7241h) {
            case 0:
                return (M8.J) this.f7242i;
            default:
                return (M8.M) this.j;
        }
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        switch (this.f7241h) {
            case 0:
                M8.C0676d c0676d = (M8.C0676d) this.j;
                M8.J j = (M8.J) this.f7242i;
                j.i();
                try {
                    try {
                        c0676d.close();
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
                ((java.io.OutputStream) this.f7242i).close();
                return;
        }
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() throws java.io.IOException {
        switch (this.f7241h) {
            case 0:
                M8.C0676d c0676d = (M8.C0676d) this.j;
                M8.J j = (M8.J) this.f7242i;
                j.i();
                try {
                    try {
                        c0676d.flush();
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
                ((java.io.OutputStream) this.f7242i).flush();
                return;
        }
    }

    public final java.lang.String toString() {
        switch (this.f7241h) {
            case 0:
                return "AsyncTimeout.sink(" + ((M8.C0676d) this.j) + ')';
            default:
                return "sink(" + ((java.io.OutputStream) this.f7242i) + ')';
        }
    }
}

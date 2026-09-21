package C8;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements M8.I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1629h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f1630i;
    public final java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f1631k;

    public f(M8.I i3, C5.C0132n0 c0132n0) {
        this.j = i3;
        this.f1631k = c0132n0;
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) throws java.io.IOException {
        java.lang.Object obj = this.f1631k;
        switch (this.f1629h) {
            case 0:
                kotlin.jvm.internal.m.e(source, "source");
                if (this.f1630i) {
                    throw new java.lang.IllegalStateException("closed");
                }
                long j9 = source.f7260i;
                byte[] bArr = x8.b.f31716a;
                if (j < 0 || 0 > j9 || j9 < j) {
                    throw new java.lang.ArrayIndexOutOfBoundsException();
                }
                ((M8.D) ((A8.t) obj).f456f).J(j, source);
                return;
            case 1:
                if (this.f1630i) {
                    source.C(j);
                    return;
                }
                try {
                    ((M8.I) this.j).J(j, source);
                    return;
                } catch (java.io.IOException e6) {
                    this.f1630i = true;
                    ((C5.C0132n0) obj).invoke(e6);
                    return;
                }
            default:
                kotlin.jvm.internal.m.e(source, "source");
                M8.AbstractC0674b.e(source.f7260i, 0L, j);
                while (j > 0) {
                    M8.F f9 = source.f7259h;
                    kotlin.jvm.internal.m.b(f9);
                    int iMin = (int) java.lang.Math.min(j, f9.f7221c - f9.f7220b);
                    ((java.util.zip.Deflater) obj).setInput(f9.f7219a, f9.f7220b, iMin);
                    b(false);
                    long j10 = iMin;
                    source.f7260i -= j10;
                    int i3 = f9.f7220b + iMin;
                    f9.f7220b = i3;
                    if (i3 == f9.f7221c) {
                        source.f7259h = f9.a();
                        M8.G.a(f9);
                    }
                    j -= j10;
                }
                return;
        }
    }

    public void b(boolean z6) throws java.io.IOException {
        M8.F fW;
        int iDeflate;
        M8.D d4 = (M8.D) this.j;
        M8.C0682j c0682j = d4.f7216i;
        while (true) {
            fW = c0682j.W(1);
            java.util.zip.Deflater deflater = (java.util.zip.Deflater) this.f1631k;
            byte[] bArr = fW.f7219a;
            if (z6) {
                try {
                    int i3 = fW.f7221c;
                    iDeflate = deflater.deflate(bArr, i3, 8192 - i3, 2);
                } catch (java.lang.NullPointerException e6) {
                    throw new java.io.IOException("Deflater already closed", e6);
                }
            } else {
                int i9 = fW.f7221c;
                iDeflate = deflater.deflate(bArr, i9, 8192 - i9);
            }
            if (iDeflate > 0) {
                fW.f7221c += iDeflate;
                c0682j.f7260i += (long) iDeflate;
                d4.b();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (fW.f7220b == fW.f7221c) {
            c0682j.f7259h = fW.a();
            M8.G.a(fW);
        }
    }

    @Override // M8.I
    public final M8.M c() {
        switch (this.f1629h) {
            case 0:
                return (M8.s) this.j;
            case 1:
                return ((M8.I) this.j).c();
            default:
                return ((M8.D) this.j).f7215h.c();
        }
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        switch (this.f1629h) {
            case 0:
                if (this.f1630i) {
                    return;
                }
                this.f1630i = true;
                A8.t tVar = (A8.t) this.f1631k;
                tVar.getClass();
                M8.s sVar = (M8.s) this.j;
                M8.M m8 = sVar.f7278e;
                sVar.f7278e = M8.M.f7231d;
                m8.a();
                m8.b();
                tVar.f452b = 3;
                return;
            case 1:
                try {
                    ((M8.I) this.j).close();
                    return;
                } catch (java.io.IOException e6) {
                    this.f1630i = true;
                    ((C5.C0132n0) this.f1631k).invoke(e6);
                    return;
                }
            default:
                java.util.zip.Deflater deflater = (java.util.zip.Deflater) this.f1631k;
                if (this.f1630i) {
                    return;
                }
                deflater.finish();
                b(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (java.lang.Throwable th) {
                    if (th == null) {
                        th = th;
                    }
                }
                try {
                    ((M8.D) this.j).close();
                    break;
                } catch (java.lang.Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                this.f1630i = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() throws java.io.IOException {
        switch (this.f1629h) {
            case 0:
                if (!this.f1630i) {
                    ((M8.D) ((A8.t) this.f1631k).f456f).flush();
                    break;
                }
                break;
            case 1:
                try {
                    ((M8.I) this.j).flush();
                } catch (java.io.IOException e6) {
                    this.f1630i = true;
                    ((C5.C0132n0) this.f1631k).invoke(e6);
                    return;
                }
                break;
            default:
                b(true);
                ((M8.D) this.j).flush();
                break;
        }
    }

    public java.lang.String toString() {
        switch (this.f1629h) {
            case 2:
                return "DeflaterSink(" + ((M8.D) this.j) + ')';
            default:
                return super.toString();
        }
    }

    public f(M8.C0682j c0682j, java.util.zip.Deflater deflater) {
        this.j = M8.AbstractC0674b.b(c0682j);
        this.f1631k = deflater;
    }

    public f(A8.t tVar) {
        this.f1631k = tVar;
        this.j = new M8.s(((M8.D) tVar.f456f).f7215h.c());
    }
}

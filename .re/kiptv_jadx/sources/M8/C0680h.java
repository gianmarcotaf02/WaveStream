package M8;

/* JADX INFO: renamed from: M8.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0680h implements java.io.Closeable, java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public M8.C0682j f7251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7252i;
    public M8.F j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f7254l;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7253k = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7255m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f7256n = -1;

    public final void b(long j) {
        M8.C0682j c0682j = this.f7251h;
        if (c0682j == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer");
        }
        if (!this.f7252i) {
            throw new java.lang.IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long j9 = c0682j.f7260i;
        if (j <= j9) {
            if (j < 0) {
                throw new java.lang.IllegalArgumentException(B2.a.j(j, "newSize < 0: ").toString());
            }
            long j10 = j9 - j;
            while (j10 > 0) {
                M8.F f9 = c0682j.f7259h;
                kotlin.jvm.internal.m.b(f9);
                M8.F f10 = f9.g;
                kotlin.jvm.internal.m.b(f10);
                int i3 = f10.f7221c;
                long j11 = i3 - f10.f7220b;
                if (j11 > j10) {
                    f10.f7221c = i3 - ((int) j10);
                    break;
                } else {
                    c0682j.f7259h = f10.a();
                    M8.G.a(f10);
                    j10 -= j11;
                }
            }
            this.j = null;
            this.f7253k = j;
            this.f7254l = null;
            this.f7255m = -1;
            this.f7256n = -1;
        } else if (j > j9) {
            long j12 = j - j9;
            int i9 = 1;
            boolean z6 = true;
            for (long j13 = 0; j12 > j13; j13 = 0) {
                M8.F fW = c0682j.W(i9);
                int iMin = (int) java.lang.Math.min(j12, 8192 - fW.f7221c);
                int i10 = fW.f7221c + iMin;
                fW.f7221c = i10;
                j12 -= (long) iMin;
                if (z6) {
                    this.j = fW;
                    this.f7253k = j9;
                    this.f7254l = fW.f7219a;
                    this.f7255m = i10 - iMin;
                    this.f7256n = i10;
                    z6 = false;
                }
                i9 = 1;
            }
        }
        c0682j.f7260i = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f7251h == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer");
        }
        this.f7251h = null;
        this.j = null;
        this.f7253k = -1L;
        this.f7254l = null;
        this.f7255m = -1;
        this.f7256n = -1;
    }

    public final int e(long j) {
        M8.C0682j c0682j = this.f7251h;
        if (c0682j == null) {
            throw new java.lang.IllegalStateException("not attached to a buffer");
        }
        if (j >= -1) {
            long j9 = c0682j.f7260i;
            if (j <= j9) {
                if (j == -1 || j == j9) {
                    this.j = null;
                    this.f7253k = j;
                    this.f7254l = null;
                    this.f7255m = -1;
                    this.f7256n = -1;
                    return -1;
                }
                M8.F f9 = c0682j.f7259h;
                M8.F f10 = this.j;
                long j10 = 0;
                if (f10 != null) {
                    long j11 = this.f7253k - ((long) (this.f7255m - f10.f7220b));
                    if (j11 > j) {
                        f10 = f9;
                        f9 = f10;
                        j9 = j11;
                    } else {
                        j10 = j11;
                    }
                } else {
                    f10 = f9;
                }
                if (j9 - j > j - j10) {
                    while (true) {
                        kotlin.jvm.internal.m.b(f10);
                        long j12 = ((long) (f10.f7221c - f10.f7220b)) + j10;
                        if (j < j12) {
                            break;
                        }
                        f10 = f10.f7224f;
                        j10 = j12;
                    }
                } else {
                    while (j9 > j) {
                        kotlin.jvm.internal.m.b(f9);
                        f9 = f9.g;
                        kotlin.jvm.internal.m.b(f9);
                        j9 -= (long) (f9.f7221c - f9.f7220b);
                    }
                    f10 = f9;
                    j10 = j9;
                }
                if (this.f7252i) {
                    kotlin.jvm.internal.m.b(f10);
                    if (f10.f7222d) {
                        byte[] bArr = f10.f7219a;
                        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                        kotlin.jvm.internal.m.d(bArrCopyOf, "copyOf(...)");
                        M8.F f11 = new M8.F(bArrCopyOf, f10.f7220b, f10.f7221c, false, true);
                        if (c0682j.f7259h == f10) {
                            c0682j.f7259h = f11;
                        }
                        f10.b(f11);
                        M8.F f12 = f11.g;
                        kotlin.jvm.internal.m.b(f12);
                        f12.a();
                        f10 = f11;
                    }
                }
                this.j = f10;
                this.f7253k = j;
                kotlin.jvm.internal.m.b(f10);
                this.f7254l = f10.f7219a;
                int i3 = f10.f7220b + ((int) (j - j10));
                this.f7255m = i3;
                int i9 = f10.f7221c;
                this.f7256n = i9;
                return i9 - i3;
            }
        }
        java.lang.StringBuilder sbU = p121o0.p.u(j, "offset=", " > size=");
        sbU.append(c0682j.f7260i);
        throw new java.lang.ArrayIndexOutOfBoundsException(sbU.toString());
    }
}

package M8;

/* JADX INFO: renamed from: M8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0681i extends java.io.InputStream implements java.lang.AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ M8.InterfaceC0684l f7258i;

    public /* synthetic */ C0681i(M8.InterfaceC0684l interfaceC0684l, int i3) {
        this.f7257h = i3;
        this.f7258i = interfaceC0684l;
    }

    @Override // java.io.InputStream
    public final int available() throws java.io.IOException {
        switch (this.f7257h) {
            case 0:
                return (int) java.lang.Math.min(((M8.C0682j) this.f7258i).f7260i, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
            default:
                M8.E e6 = (M8.E) this.f7258i;
                if (e6.j) {
                    throw new java.io.IOException("closed");
                }
                return (int) java.lang.Math.min(e6.f7218i.f7260i, androidx.media3.common.util.Log.LOG_LEVEL_OFF);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f7257h) {
            case 0:
                break;
            default:
                ((M8.E) this.f7258i).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        switch (this.f7257h) {
            case 0:
                M8.C0682j c0682j = (M8.C0682j) this.f7258i;
                if (c0682j.f7260i > 0) {
                    return c0682j.readByte() & 255;
                }
                return -1;
            default:
                M8.E e6 = (M8.E) this.f7258i;
                if (e6.j) {
                    throw new java.io.IOException("closed");
                }
                M8.C0682j c0682j2 = e6.f7218i;
                if (c0682j2.f7260i == 0 && e6.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j2) == -1) {
                    return -1;
                }
                return c0682j2.readByte() & 255;
        }
    }

    public final java.lang.String toString() {
        switch (this.f7257h) {
            case 0:
                return ((M8.C0682j) this.f7258i) + ".inputStream()";
            default:
                return ((M8.E) this.f7258i) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public long transferTo(java.io.OutputStream out) throws java.io.IOException {
        switch (this.f7257h) {
            case 1:
                kotlin.jvm.internal.m.e(out, "out");
                M8.E e6 = (M8.E) this.f7258i;
                if (e6.j) {
                    throw new java.io.IOException("closed");
                }
                long j = 0;
                long j9 = 0;
                while (true) {
                    M8.C0682j c0682j = e6.f7218i;
                    if (c0682j.f7260i == j && e6.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                        return j9;
                    }
                    long j10 = c0682j.f7260i;
                    j9 += j10;
                    M8.AbstractC0674b.e(j10, 0L, j10);
                    M8.F f9 = c0682j.f7259h;
                    while (j10 > j) {
                        kotlin.jvm.internal.m.b(f9);
                        int iMin = (int) java.lang.Math.min(j10, f9.f7221c - f9.f7220b);
                        out.write(f9.f7219a, f9.f7220b, iMin);
                        int i3 = f9.f7220b + iMin;
                        f9.f7220b = i3;
                        long j11 = iMin;
                        c0682j.f7260i -= j11;
                        j10 -= j11;
                        if (i3 == f9.f7221c) {
                            M8.F fA = f9.a();
                            c0682j.f7259h = fA;
                            M8.G.a(f9);
                            f9 = fA;
                        }
                        j = 0;
                    }
                }
                break;
            default:
                return super.transferTo(out);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i3, int i9) throws java.io.IOException {
        switch (this.f7257h) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                return ((M8.C0682j) this.f7258i).t(sink, i3, i9);
            default:
                kotlin.jvm.internal.m.e(sink, "data");
                M8.E e6 = (M8.E) this.f7258i;
                if (!e6.j) {
                    M8.AbstractC0674b.e(sink.length, i3, i9);
                    M8.C0682j c0682j = e6.f7218i;
                    if (c0682j.f7260i == 0 && e6.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                        return -1;
                    }
                    return c0682j.t(sink, i3, i9);
                }
                throw new java.io.IOException("closed");
        }
    }

    private final void b() {
    }
}

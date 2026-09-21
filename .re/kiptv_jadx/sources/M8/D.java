package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class D implements M8.InterfaceC0683k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.I f7215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.C0682j f7216i;
    public boolean j;

    public D(M8.I sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f7215h = sink;
        this.f7216i = new M8.C0682j();
    }

    @Override // M8.I
    public final void J(long j, M8.C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f7216i.J(j, source);
        b();
    }

    @Override // M8.InterfaceC0683k
    public final long M(M8.K k9) {
        long j = 0;
        while (true) {
            long jM = ((M8.C0677e) k9).m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, this.f7216i);
            if (jM == -1) {
                return j;
            }
            j += jM;
            b();
        }
    }

    public final M8.InterfaceC0683k b() {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j = this.f7216i;
        long jB = c0682j.b();
        if (jB > 0) {
            this.f7215h.J(jB, c0682j);
        }
        return this;
    }

    @Override // M8.I
    public final M8.M c() {
        return this.f7215h.c();
    }

    @Override // M8.I, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.lang.Throwable {
        M8.I i3 = this.f7215h;
        if (this.j) {
            return;
        }
        M8.C0682j c0682j = this.f7216i;
        long j = c0682j.f7260i;
        if (j > 0) {
            i3.J(j, c0682j);
        }
        th = null;
        try {
            i3.close();
        } catch (java.lang.Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.j = true;
        if (th != null) {
            throw th;
        }
    }

    public final M8.InterfaceC0683k e(M8.C0685m byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f7216i.X(byteString);
        b();
        return this;
    }

    @Override // M8.I, java.io.Flushable
    public final void flush() {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j = this.f7216i;
        long j = c0682j.f7260i;
        M8.I i3 = this.f7215h;
        if (j > 0) {
            i3.J(j, c0682j);
        }
        i3.flush();
    }

    public final M8.InterfaceC0683k i(long j) {
        boolean z6;
        byte[] bArr;
        long j9 = j;
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j = this.f7216i;
        c0682j.getClass();
        long j10 = 0;
        if (j9 == 0) {
            c0682j.Z(48);
        } else {
            if (j9 < 0) {
                j9 = -j9;
                if (j9 < 0) {
                    c0682j.d0("-9223372036854775808");
                } else {
                    z6 = true;
                }
            } else {
                z6 = false;
            }
            byte[] bArr2 = N8.a.f7472a;
            int iNumberOfLeadingZeros = ((64 - java.lang.Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
            int i3 = iNumberOfLeadingZeros + (j9 > N8.a.f7473b[iNumberOfLeadingZeros] ? 1 : 0);
            if (z6) {
                i3++;
            }
            M8.F fW = c0682j.W(i3);
            int i9 = fW.f7221c + i3;
            while (true) {
                bArr = fW.f7219a;
                if (j9 == j10) {
                    break;
                }
                long j11 = 10;
                i9--;
                bArr[i9] = N8.a.f7472a[(int) (j9 % j11)];
                j9 /= j11;
                j10 = 0;
            }
            if (z6) {
                bArr[i9 - 1] = 45;
            }
            fW.f7221c += i3;
            c0682j.f7260i += (long) i3;
        }
        b();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    public final M8.InterfaceC0683k j(int i3) {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f7216i.n(i3);
        b();
        return this;
    }

    @Override // M8.InterfaceC0683k
    public final M8.InterfaceC0683k p(int i3) {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f7216i.Z(i3);
        b();
        return this;
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f7215h + ')';
    }

    @Override // M8.InterfaceC0683k
    public final M8.InterfaceC0683k w(java.lang.String string) {
        kotlin.jvm.internal.m.e(string, "string");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        this.f7216i.d0(string);
        b();
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        int iWrite = this.f7216i.write(source);
        b();
        return iWrite;
    }
}

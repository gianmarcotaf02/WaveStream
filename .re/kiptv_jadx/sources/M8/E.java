package M8;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements M8.InterfaceC0684l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M8.K f7217h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final M8.C0682j f7218i;
    public boolean j;

    public E(M8.K source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f7217h = source;
        this.f7218i = new M8.C0682j();
    }

    @Override // M8.InterfaceC0684l
    public final void C(long j) {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        while (j > 0) {
            M8.C0682j c0682j = this.f7218i;
            if (c0682j.f7260i == 0 && this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                throw new java.io.EOFException();
            }
            long jMin = java.lang.Math.min(j, c0682j.f7260i);
            c0682j.C(jMin);
            j -= jMin;
        }
    }

    @Override // M8.InterfaceC0684l
    public final void F(long j, M8.C0682j c0682j) throws java.io.EOFException {
        M8.C0682j c0682j2 = this.f7218i;
        try {
            S(j);
            c0682j2.F(j, c0682j);
        } catch (java.io.EOFException e6) {
            c0682j.M(c0682j2);
            throw e6;
        }
    }

    @Override // M8.InterfaceC0684l
    public final java.lang.String I() {
        return u(Long.MAX_VALUE);
    }

    @Override // M8.InterfaceC0684l
    public final boolean Q(long j, M8.C0685m bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        byte[] bArr = bytes.f7262h;
        int length = bArr.length;
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j >= 0 && length >= 0 && bArr.length >= length) {
            for (int i3 = 0; i3 < length; i3++) {
                long j9 = ((long) i3) + j;
                if (d(1 + j9) && this.f7218i.i(j9) == bArr[i3]) {
                }
            }
            return true;
        }
        return false;
    }

    public final void S(long j) {
        if (!d(j)) {
            throw new java.io.EOFException();
        }
    }

    @Override // M8.InterfaceC0684l
    public final java.io.InputStream U() {
        return new M8.C0681i(this, 1);
    }

    @Override // M8.InterfaceC0684l
    public final M8.C0682j a() {
        return this.f7218i;
    }

    public final M8.C0685m b(long j) {
        S(j);
        return this.f7218i.z(j);
    }

    @Override // M8.K
    public final M8.M c() {
        return this.f7217h.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f7217h.close();
        M8.C0682j c0682j = this.f7218i;
        c0682j.C(c0682j.f7260i);
    }

    @Override // M8.InterfaceC0684l
    public final boolean d(long j) {
        M8.C0682j c0682j;
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        do {
            c0682j = this.f7218i;
            if (c0682j.f7260i >= j) {
                return true;
            }
        } while (this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1);
        return false;
    }

    public final int e() {
        S(4L);
        int i3 = this.f7218i.readInt();
        return ((i3 & 255) << 24) | (((-16777216) & i3) >>> 24) | ((16711680 & i3) >>> 8) | ((65280 & i3) << 8);
    }

    @Override // M8.InterfaceC0684l
    public final int g(M8.z options) throws java.io.EOFException {
        M8.C0682j c0682j;
        kotlin.jvm.internal.m.e(options, "options");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        do {
            c0682j = this.f7218i;
            int iB = N8.a.b(c0682j, options, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                c0682j.C(options.f7291h[iB].d());
                return iB;
            }
        } while (this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1);
        return -1;
    }

    @Override // M8.InterfaceC0684l
    public final long h(M8.C0685m targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            M8.C0682j c0682j = this.f7218i;
            long j = c0682j.j(jMax, targetBytes);
            if (j != -1) {
                return j;
            }
            long j9 = c0682j.f7260i;
            if (this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                return -1L;
            }
            jMax = java.lang.Math.max(jMax, j9);
        }
    }

    public final long i() throws java.io.EOFException {
        S(8L);
        long j = this.f7218i.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.j;
    }

    public final short j() {
        S(2L);
        return this.f7218i.N();
    }

    @Override // M8.InterfaceC0684l
    public final long k(M8.InterfaceC0683k interfaceC0683k) {
        M8.C0682j c0682j;
        long j = 0;
        while (true) {
            c0682j = this.f7218i;
            if (this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                break;
            }
            long jB = c0682j.b();
            if (jB > 0) {
                j += jB;
                interfaceC0683k.J(jB, c0682j);
            }
        }
        long j9 = c0682j.f7260i;
        if (j9 <= 0) {
            return j;
        }
        long j10 = j + j9;
        interfaceC0683k.J(j9, c0682j);
        return j10;
    }

    @Override // M8.K
    public final long m(long j, M8.C0682j sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j = this.f7218i;
        if (c0682j.f7260i == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                return -1L;
            }
        }
        return c0682j.m(java.lang.Math.min(j, c0682j.f7260i), sink);
    }

    public final boolean o() {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        M8.C0682j c0682j = this.f7218i;
        return c0682j.o() && this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(java.nio.ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        M8.C0682j c0682j = this.f7218i;
        if (c0682j.f7260i == 0 && this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
            return -1;
        }
        return c0682j.read(sink);
    }

    public final byte readByte() {
        S(1L);
        return this.f7218i.readByte();
    }

    public final int readInt() {
        S(4L);
        return this.f7218i.readInt();
    }

    public final short readShort() {
        S(2L);
        return this.f7218i.readShort();
    }

    @Override // M8.InterfaceC0684l
    public final long s(byte b9, long j, long j9) {
        if (this.j) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (0 > j || j > j9) {
            java.lang.StringBuilder sbU = p121o0.p.u(j, "fromIndex=", " toIndex=");
            sbU.append(j9);
            throw new java.lang.IllegalArgumentException(sbU.toString().toString());
        }
        long jMax = j;
        while (jMax < j9) {
            M8.C0682j c0682j = this.f7218i;
            byte b10 = b9;
            long j10 = j9;
            long jS = c0682j.s(b10, jMax, j10);
            if (jS != -1) {
                return jS;
            }
            long j11 = c0682j.f7260i;
            if (j11 >= j10 || this.f7217h.m(androidx.media3.session.legacy.PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                break;
            }
            jMax = java.lang.Math.max(jMax, j11);
            b9 = b10;
            j9 = j10;
        }
        return -1L;
    }

    public final java.lang.String t(long j) {
        S(j);
        M8.C0682j c0682j = this.f7218i;
        c0682j.getClass();
        return c0682j.P(j, O7.a.f8024b);
    }

    public final java.lang.String toString() {
        return "buffer(" + this.f7217h + ')';
    }

    public final java.lang.String u(long j) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException(B2.a.j(j, "limit < 0: ").toString());
        }
        long j9 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jS = s((byte) 10, 0L, j9);
        M8.C0682j c0682j = this.f7218i;
        if (jS != -1) {
            return N8.a.a(jS, c0682j);
        }
        if (j9 < Long.MAX_VALUE && d(j9) && c0682j.i(j9 - 1) == 13 && d(j9 + 1) && c0682j.i(j9) == 10) {
            return N8.a.a(j9, c0682j);
        }
        M8.C0682j c0682j2 = new M8.C0682j();
        c0682j.e(c0682j2, 0L, java.lang.Math.min(32, c0682j.f7260i));
        throw new java.io.EOFException("\\n not found: limit=" + java.lang.Math.min(c0682j.f7260i, j) + " content=" + c0682j2.z(c0682j2.f7260i).e() + (char) 8230);
    }

    @Override // M8.InterfaceC0684l
    public final java.lang.String x(java.nio.charset.Charset charset) {
        M8.C0682j c0682j = this.f7218i;
        c0682j.M(this.f7217h);
        return c0682j.P(c0682j.f7260i, charset);
    }
}

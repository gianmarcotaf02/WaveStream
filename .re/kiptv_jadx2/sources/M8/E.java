package M8;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class E implements InterfaceC0684l {

    public final K f7217h;

    public final C0682j f7218i;
    public boolean j;

    public E(K source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f7217h = source;
        this.f7218i = new C0682j();
    }

    @Override
    public final void C(long j) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            C0682j c0682j = this.f7218i;
            if (c0682j.f7260i == 0 && this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j, c0682j.f7260i);
            c0682j.C(jMin);
            j -= jMin;
        }
    }

    @Override
    public final void F(long j, C0682j c0682j) throws EOFException {
        C0682j c0682j2 = this.f7218i;
        try {
            S(j);
            c0682j2.F(j, c0682j);
        } catch (EOFException e6) {
            c0682j.M(c0682j2);
            throw e6;
        }
    }

    @Override
    public final String I() {
        return u(Long.MAX_VALUE);
    }

    @Override
    public final boolean Q(long j, C0685m bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        byte[] bArr = bytes.f7262h;
        int length = bArr.length;
        if (this.j) {
            throw new IllegalStateException("closed");
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
            throw new EOFException();
        }
    }

    @Override
    public final InputStream U() {
        return new C0681i(this, 1);
    }

    @Override
    public final C0682j a() {
        return this.f7218i;
    }

    public final C0685m b(long j) {
        S(j);
        return this.f7218i.z(j);
    }

    @Override
    public final M c() {
        return this.f7217h.c();
    }

    @Override
    public final void close() {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f7217h.close();
        C0682j c0682j = this.f7218i;
        c0682j.C(c0682j.f7260i);
    }

    @Override
    public final boolean d(long j) {
        C0682j c0682j;
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        do {
            c0682j = this.f7218i;
            if (c0682j.f7260i >= j) {
                return true;
            }
        } while (this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1);
        return false;
    }

    public final int e() {
        S(4L);
        int i3 = this.f7218i.readInt();
        return ((i3 & 255) << 24) | (((-16777216) & i3) >>> 24) | ((16711680 & i3) >>> 8) | ((65280 & i3) << 8);
    }

    @Override
    public final int g(z options) throws EOFException {
        C0682j c0682j;
        kotlin.jvm.internal.m.e(options, "options");
        if (this.j) {
            throw new IllegalStateException("closed");
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
        } while (this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) != -1);
        return -1;
    }

    @Override
    public final long h(C0685m targetBytes) {
        kotlin.jvm.internal.m.e(targetBytes, "targetBytes");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        long jMax = 0;
        while (true) {
            C0682j c0682j = this.f7218i;
            long j = c0682j.j(jMax, targetBytes);
            if (j != -1) {
                return j;
            }
            long j9 = c0682j.f7260i;
            if (this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                return -1L;
            }
            jMax = Math.max(jMax, j9);
        }
    }

    public final long i() throws EOFException {
        S(8L);
        long j = this.f7218i.readLong();
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    @Override
    public final boolean isOpen() {
        return !this.j;
    }

    public final short j() {
        S(2L);
        return this.f7218i.N();
    }

    @Override
    public final long k(InterfaceC0683k interfaceC0683k) {
        C0682j c0682j;
        long j = 0;
        while (true) {
            c0682j = this.f7218i;
            if (this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
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

    @Override
    public final long m(long j, C0682j sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0682j c0682j = this.f7218i;
        if (c0682j.f7260i == 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                return -1L;
            }
        }
        return c0682j.m(Math.min(j, c0682j.f7260i), sink);
    }

    public final boolean o() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0682j c0682j = this.f7218i;
        return c0682j.o() && this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1;
    }

    @Override
    public final int read(ByteBuffer sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        C0682j c0682j = this.f7218i;
        if (c0682j.f7260i == 0 && this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
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

    @Override
    public final long s(byte b9, long j, long j9) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        if (0 > j || j > j9) {
            StringBuilder sbU = p121o0.p.u(j, "fromIndex=", " toIndex=");
            sbU.append(j9);
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        long jMax = j;
        while (jMax < j9) {
            C0682j c0682j = this.f7218i;
            byte b10 = b9;
            long j10 = j9;
            long jS = c0682j.s(b10, jMax, j10);
            if (jS != -1) {
                return jS;
            }
            long j11 = c0682j.f7260i;
            if (j11 >= j10 || this.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                break;
            }
            jMax = Math.max(jMax, j11);
            b9 = b10;
            j9 = j10;
        }
        return -1L;
    }

    public final String t(long j) {
        S(j);
        C0682j c0682j = this.f7218i;
        c0682j.getClass();
        return c0682j.P(j, O7.a.f8024b);
    }

    public final String toString() {
        return "buffer(" + this.f7217h + ')';
    }

    public final String u(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "limit < 0: ").toString());
        }
        long j9 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long jS = s((byte) 10, 0L, j9);
        C0682j c0682j = this.f7218i;
        if (jS != -1) {
            return N8.a.a(jS, c0682j);
        }
        if (j9 < Long.MAX_VALUE && d(j9) && c0682j.i(j9 - 1) == 13 && d(j9 + 1) && c0682j.i(j9) == 10) {
            return N8.a.a(j9, c0682j);
        }
        C0682j c0682j2 = new C0682j();
        c0682j.e(c0682j2, 0L, Math.min(32, c0682j.f7260i));
        throw new EOFException("\\n not found: limit=" + Math.min(c0682j.f7260i, j) + " content=" + c0682j2.z(c0682j2.f7260i).e() + (char) 8230);
    }

    @Override
    public final String x(Charset charset) {
        C0682j c0682j = this.f7218i;
        c0682j.M(this.f7217h);
        return c0682j.P(c0682j.f7260i, charset);
    }
}

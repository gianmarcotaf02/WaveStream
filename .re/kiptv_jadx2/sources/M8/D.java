package M8;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.nio.ByteBuffer;

public final class D implements InterfaceC0683k {

    public final I f7215h;

    public final C0682j f7216i;
    public boolean j;

    public D(I sink) {
        kotlin.jvm.internal.m.e(sink, "sink");
        this.f7215h = sink;
        this.f7216i = new C0682j();
    }

    @Override
    public final void J(long j, C0682j source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.f7216i.J(j, source);
        b();
    }

    @Override
    public final long M(K k9) {
        long j = 0;
        while (true) {
            long jM = ((C0677e) k9).m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, this.f7216i);
            if (jM == -1) {
                return j;
            }
            j += jM;
            b();
        }
    }

    public final InterfaceC0683k b() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0682j c0682j = this.f7216i;
        long jB = c0682j.b();
        if (jB > 0) {
            this.f7215h.J(jB, c0682j);
        }
        return this;
    }

    @Override
    public final M c() {
        return this.f7215h.c();
    }

    @Override
    public final void close() throws Throwable {
        I i3 = this.f7215h;
        if (this.j) {
            return;
        }
        C0682j c0682j = this.f7216i;
        long j = c0682j.f7260i;
        if (j > 0) {
            i3.J(j, c0682j);
        }
        th = null;
        try {
            i3.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.j = true;
        if (th != null) {
            throw th;
        }
    }

    public final InterfaceC0683k e(C0685m byteString) {
        kotlin.jvm.internal.m.e(byteString, "byteString");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.f7216i.X(byteString);
        b();
        return this;
    }

    @Override
    public final void flush() {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0682j c0682j = this.f7216i;
        long j = c0682j.f7260i;
        I i3 = this.f7215h;
        if (j > 0) {
            i3.J(j, c0682j);
        }
        i3.flush();
    }

    public final InterfaceC0683k i(long j) {
        boolean z6;
        byte[] bArr;
        long j9 = j;
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        C0682j c0682j = this.f7216i;
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
            int iNumberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j9)) * 10) >>> 5;
            int i3 = iNumberOfLeadingZeros + (j9 > N8.a.f7473b[iNumberOfLeadingZeros] ? 1 : 0);
            if (z6) {
                i3++;
            }
            F fW = c0682j.W(i3);
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

    @Override
    public final boolean isOpen() {
        return !this.j;
    }

    public final InterfaceC0683k j(int i3) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.f7216i.n(i3);
        b();
        return this;
    }

    @Override
    public final InterfaceC0683k p(int i3) {
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.f7216i.Z(i3);
        b();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f7215h + ')';
    }

    @Override
    public final InterfaceC0683k w(String string) {
        kotlin.jvm.internal.m.e(string, "string");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        this.f7216i.d0(string);
        b();
        return this;
    }

    @Override
    public final int write(ByteBuffer source) {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.j) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f7216i.write(source);
        b();
        return iWrite;
    }
}

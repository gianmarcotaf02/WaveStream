package M8;

import androidx.media3.common.util.Log;
import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C0681i extends InputStream implements AutoCloseable {

    public final int f7257h;

    public final InterfaceC0684l f7258i;

    public C0681i(InterfaceC0684l interfaceC0684l, int i3) {
        this.f7257h = i3;
        this.f7258i = interfaceC0684l;
    }

    @Override
    public final int available() throws IOException {
        switch (this.f7257h) {
            case 0:
                return (int) Math.min(((C0682j) this.f7258i).f7260i, Log.LOG_LEVEL_OFF);
            default:
                E e6 = (E) this.f7258i;
                if (e6.j) {
                    throw new IOException("closed");
                }
                return (int) Math.min(e6.f7218i.f7260i, Log.LOG_LEVEL_OFF);
        }
    }

    @Override
    public final void close() {
        switch (this.f7257h) {
            case 0:
                break;
            default:
                ((E) this.f7258i).close();
                break;
        }
    }

    @Override
    public final int read() throws IOException {
        switch (this.f7257h) {
            case 0:
                C0682j c0682j = (C0682j) this.f7258i;
                if (c0682j.f7260i > 0) {
                    return c0682j.readByte() & 255;
                }
                return -1;
            default:
                E e6 = (E) this.f7258i;
                if (e6.j) {
                    throw new IOException("closed");
                }
                C0682j c0682j2 = e6.f7218i;
                if (c0682j2.f7260i == 0 && e6.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j2) == -1) {
                    return -1;
                }
                return c0682j2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f7257h) {
            case 0:
                return ((C0682j) this.f7258i) + ".inputStream()";
            default:
                return ((E) this.f7258i) + ".inputStream()";
        }
    }

    @Override
    public long transferTo(OutputStream out) throws IOException {
        switch (this.f7257h) {
            case 1:
                kotlin.jvm.internal.m.e(out, "out");
                E e6 = (E) this.f7258i;
                if (e6.j) {
                    throw new IOException("closed");
                }
                long j = 0;
                long j9 = 0;
                while (true) {
                    C0682j c0682j = e6.f7218i;
                    if (c0682j.f7260i == j && e6.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                        return j9;
                    }
                    long j10 = c0682j.f7260i;
                    j9 += j10;
                    AbstractC0674b.e(j10, 0L, j10);
                    F f9 = c0682j.f7259h;
                    while (j10 > j) {
                        kotlin.jvm.internal.m.b(f9);
                        int iMin = (int) Math.min(j10, f9.f7221c - f9.f7220b);
                        out.write(f9.f7219a, f9.f7220b, iMin);
                        int i3 = f9.f7220b + iMin;
                        f9.f7220b = i3;
                        long j11 = iMin;
                        c0682j.f7260i -= j11;
                        j10 -= j11;
                        if (i3 == f9.f7221c) {
                            F fA = f9.a();
                            c0682j.f7259h = fA;
                            G.a(f9);
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

    @Override
    public final int read(byte[] sink, int i3, int i9) throws IOException {
        switch (this.f7257h) {
            case 0:
                kotlin.jvm.internal.m.e(sink, "sink");
                return ((C0682j) this.f7258i).t(sink, i3, i9);
            default:
                kotlin.jvm.internal.m.e(sink, "data");
                E e6 = (E) this.f7258i;
                if (!e6.j) {
                    AbstractC0674b.e(sink.length, i3, i9);
                    C0682j c0682j = e6.f7218i;
                    if (c0682j.f7260i == 0 && e6.f7217h.m(PlaybackStateCompat.ACTION_PLAY_FROM_URI, c0682j) == -1) {
                        return -1;
                    }
                    return c0682j.t(sink, i3, i9);
                }
                throw new IOException("closed");
        }
    }

    private final void b() {
    }
}

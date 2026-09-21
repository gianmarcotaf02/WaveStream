package M8;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.io.IOException;
import java.io.OutputStream;

public final class C0676d implements I {

    public final int f7241h;

    public final Object f7242i;
    public final Object j;

    public C0676d(Object obj, Object obj2, int i3) {
        this.f7241h = i3;
        this.f7242i = obj;
        this.j = obj2;
    }

    @Override
    public final void J(long j, C0682j source) throws IOException {
        J j9;
        switch (this.f7241h) {
            case 0:
                kotlin.jvm.internal.m.e(source, "source");
                AbstractC0674b.e(source.f7260i, 0L, j);
                long j10 = j;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    F f9 = source.f7259h;
                    kotlin.jvm.internal.m.b(f9);
                    try {
                        try {
                            while (j11 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                                j11 += (long) (f9.f7221c - f9.f7220b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    C0676d c0676d = (C0676d) this.j;
                                    j9 = (J) this.f7242i;
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
                        } catch (IOException e6) {
                            if (!j9.j()) {
                                throw e6;
                            }
                            throw j9.l(e6);
                        }
                    } catch (Throwable th) {
                        j9.j();
                        throw th;
                    }
                    C0676d c0676d2 = (C0676d) this.j;
                    j9 = (J) this.f7242i;
                    j9.i();
                }
                break;
            default:
                kotlin.jvm.internal.m.e(source, "source");
                AbstractC0674b.e(source.f7260i, 0L, j);
                while (j > 0) {
                    ((M) this.j).f();
                    F f10 = source.f7259h;
                    kotlin.jvm.internal.m.b(f10);
                    int iMin = (int) Math.min(j, f10.f7221c - f10.f7220b);
                    ((OutputStream) this.f7242i).write(f10.f7219a, f10.f7220b, iMin);
                    int i3 = f10.f7220b + iMin;
                    f10.f7220b = i3;
                    long j12 = iMin;
                    j -= j12;
                    source.f7260i -= j12;
                    if (i3 == f10.f7221c) {
                        source.f7259h = f10.a();
                        G.a(f10);
                    }
                }
                return;
        }
    }

    @Override
    public final M c() {
        switch (this.f7241h) {
            case 0:
                return (J) this.f7242i;
            default:
                return (M) this.j;
        }
    }

    @Override
    public final void close() throws IOException {
        switch (this.f7241h) {
            case 0:
                C0676d c0676d = (C0676d) this.j;
                J j = (J) this.f7242i;
                j.i();
                try {
                    try {
                        c0676d.close();
                        if (j.j()) {
                            throw j.l(null);
                        }
                        return;
                    } catch (IOException e6) {
                        if (!j.j()) {
                            throw e6;
                        }
                        throw j.l(e6);
                    }
                } catch (Throwable th) {
                    j.j();
                    throw th;
                }
            default:
                ((OutputStream) this.f7242i).close();
                return;
        }
    }

    @Override
    public final void flush() throws IOException {
        switch (this.f7241h) {
            case 0:
                C0676d c0676d = (C0676d) this.j;
                J j = (J) this.f7242i;
                j.i();
                try {
                    try {
                        c0676d.flush();
                        if (j.j()) {
                            throw j.l(null);
                        }
                        return;
                    } catch (IOException e6) {
                        if (!j.j()) {
                            throw e6;
                        }
                        throw j.l(e6);
                    }
                } catch (Throwable th) {
                    j.j();
                    throw th;
                }
            default:
                ((OutputStream) this.f7242i).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f7241h) {
            case 0:
                return "AsyncTimeout.sink(" + ((C0676d) this.j) + ')';
            default:
                return "sink(" + ((OutputStream) this.f7242i) + ')';
        }
    }
}

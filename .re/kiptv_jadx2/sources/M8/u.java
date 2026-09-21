package M8;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public final class u implements K {

    public final E f7283h;

    public final Inflater f7284i;
    public int j;

    public boolean f7285k;

    public u(E e6, Inflater inflater) {
        this.f7283h = e6;
        this.f7284i = inflater;
    }

    public final long b(long j, C0682j sink) throws IOException {
        Inflater inflater = this.f7284i;
        kotlin.jvm.internal.m.e(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(B2.a.j(j, "byteCount < 0: ").toString());
        }
        if (this.f7285k) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                F fW = sink.W(1);
                int iMin = (int) Math.min(j, 8192 - fW.f7221c);
                boolean zNeedsInput = inflater.needsInput();
                E e6 = this.f7283h;
                if (zNeedsInput && !e6.o()) {
                    F f9 = e6.f7218i.f7259h;
                    kotlin.jvm.internal.m.b(f9);
                    int i3 = f9.f7221c;
                    int i9 = f9.f7220b;
                    int i10 = i3 - i9;
                    this.j = i10;
                    inflater.setInput(f9.f7219a, i9, i10);
                }
                int iInflate = inflater.inflate(fW.f7219a, fW.f7221c, iMin);
                int i11 = this.j;
                if (i11 != 0) {
                    int remaining = i11 - inflater.getRemaining();
                    this.j -= remaining;
                    e6.C(remaining);
                }
                if (iInflate > 0) {
                    fW.f7221c += iInflate;
                    long j9 = iInflate;
                    sink.f7260i += j9;
                    return j9;
                }
                if (fW.f7220b == fW.f7221c) {
                    sink.f7259h = fW.a();
                    G.a(fW);
                }
            } catch (DataFormatException e9) {
                throw new IOException(e9);
            }
        }
        return 0L;
    }

    @Override
    public final M c() {
        return this.f7283h.f7217h.c();
    }

    @Override
    public final void close() {
        if (this.f7285k) {
            return;
        }
        this.f7284i.end();
        this.f7285k = true;
        this.f7283h.close();
    }

    @Override
    public final long m(long j, C0682j sink) throws IOException {
        kotlin.jvm.internal.m.e(sink, "sink");
        do {
            long jB = b(j, sink);
            if (jB > 0) {
                return jB;
            }
            Inflater inflater = this.f7284i;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f7283h.o());
        throw new EOFException("source exhausted prematurely");
    }
}

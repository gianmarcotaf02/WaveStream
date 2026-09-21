package A8;

import M8.C0682j;
import M8.I;
import M8.M;
import java.io.IOException;
import java.net.ProtocolException;

public final class c implements I {

    public final I f375h;

    public final long f376i;
    public boolean j;

    public long f377k;

    public boolean f378l;

    public final e f379m;

    public c(e eVar, I delegate, long j) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.f379m = eVar;
        this.f375h = delegate;
        this.f376i = j;
    }

    @Override
    public final void J(long j, C0682j source) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        if (this.f378l) {
            throw new IllegalStateException("closed");
        }
        long j9 = this.f376i;
        if (j9 != -1 && this.f377k + j > j9) {
            StringBuilder sbU = p121o0.p.u(j9, "expected ", " bytes but received ");
            sbU.append(this.f377k + j);
            throw new ProtocolException(sbU.toString());
        }
        try {
            this.f375h.J(j, source);
            this.f377k += j;
        } catch (IOException e6) {
            throw e(e6);
        }
    }

    public final void b() {
        this.f375h.close();
    }

    @Override
    public final M c() {
        return this.f375h.c();
    }

    @Override
    public final void close() throws IOException {
        if (this.f378l) {
            return;
        }
        this.f378l = true;
        long j = this.f376i;
        if (j != -1 && this.f377k != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            b();
            e(null);
        } catch (IOException e6) {
            throw e(e6);
        }
    }

    public final IOException e(IOException iOException) {
        if (this.j) {
            return iOException;
        }
        this.j = true;
        return this.f379m.a(false, true, iOException);
    }

    @Override
    public final void flush() throws IOException {
        try {
            i();
        } catch (IOException e6) {
            throw e(e6);
        }
    }

    public final void i() {
        this.f375h.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f375h + ')';
    }
}

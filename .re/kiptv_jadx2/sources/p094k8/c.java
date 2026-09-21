package p094k8;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.m;

public final class c implements e {

    public final OutputStream f24511h;

    public c(OutputStream outputStream) {
        this.f24511h = outputStream;
    }

    @Override
    public final void close() throws IOException {
        this.f24511h.close();
    }

    @Override
    public final void flush() throws IOException {
        this.f24511h.flush();
    }

    public final String toString() {
        return "RawSink(" + this.f24511h + ')';
    }

    @Override
    public final void write(a source, long j) throws IOException {
        m.e(source, "source");
        p.b(source.j, 0L, j);
        while (j > 0) {
            if (source.o()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            j jVar = source.f24508h;
            m.b(jVar);
            int i3 = jVar.f24524b;
            int iMin = (int) Math.min(j, jVar.f24525c - i3);
            this.f24511h.write(jVar.f24523a, i3, iMin);
            long j9 = iMin;
            j -= j9;
            if (iMin != 0) {
                if (iMin < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (iMin > jVar.b()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                source.C(j9);
            }
        }
    }
}

package p094k8;

import B2.a;
import O7.q;
import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.m;

public final class b implements f {

    public final InputStream f24510h;

    public b(InputStream inputStream) {
        this.f24510h = inputStream;
    }

    @Override
    public final void close() throws IOException {
        this.f24510h.close();
    }

    @Override
    public final long readAtMostTo(a sink, long j) throws IOException {
        m.e(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(a.k(j, "byteCount (", ") < 0").toString());
        }
        boolean z6 = false;
        try {
            j jVarU = sink.u(1);
            byte[] bArr = jVarU.f24523a;
            int i3 = jVarU.f24525c;
            long j9 = this.f24510h.read(bArr, i3, (int) Math.min(j, bArr.length - i3));
            int i9 = j9 == -1 ? 0 : (int) j9;
            if (i9 == 1) {
                jVarU.f24525c += i9;
                sink.j += (long) i9;
                return j9;
            }
            if (i9 < 0 || i9 > jVarU.a()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i9 + ". Should be in 0.." + jVarU.a()).toString());
            }
            if (i9 != 0) {
                jVarU.f24525c += i9;
                sink.j += (long) i9;
                return j9;
            }
            if (!p.e(jVarU)) {
                return j9;
            }
            sink.j();
            return j9;
        } catch (AssertionError e6) {
            if (e6.getCause() != null) {
                String message = e6.getMessage();
                if (message != null ? q.B0(message, "getsockname failed", false) : false) {
                    z6 = true;
                }
            }
            if (z6) {
                throw new IOException(e6);
            }
            throw e6;
        }
    }

    public final String toString() {
        return "RawSource(" + this.f24510h + ')';
    }
}

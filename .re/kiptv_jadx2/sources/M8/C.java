package M8;

import java.io.IOException;
import java.io.OutputStream;

public final class C extends OutputStream implements AutoCloseable {

    public final D f7214h;

    public C(D d4) {
        this.f7214h = d4;
    }

    @Override
    public final void close() throws Throwable {
        this.f7214h.close();
    }

    @Override
    public final void flush() {
        D d4 = this.f7214h;
        if (d4.j) {
            return;
        }
        d4.flush();
    }

    public final String toString() {
        return this.f7214h + ".outputStream()";
    }

    @Override
    public final void write(int i3) throws IOException {
        D d4 = this.f7214h;
        if (d4.j) {
            throw new IOException("closed");
        }
        d4.f7216i.Z((byte) i3);
        d4.b();
    }

    @Override
    public final void write(byte[] data, int i3, int i9) throws IOException {
        kotlin.jvm.internal.m.e(data, "data");
        D d4 = this.f7214h;
        if (!d4.j) {
            d4.f7216i.write(data, i3, i9);
            d4.b();
            return;
        }
        throw new IOException("closed");
    }
}

package H2;

import java.io.IOException;
import java.io.InputStream;

public final class m extends InputStream implements AutoCloseable {

    public final InputStream f3895h;

    public int f3896i = 1073741824;

    public m(InputStream inputStream) {
        this.f3895h = inputStream;
    }

    @Override
    public final int available() {
        return this.f3896i;
    }

    @Override
    public final void close() throws IOException {
        this.f3895h.close();
    }

    @Override
    public final int read() throws IOException {
        int i3 = this.f3895h.read();
        if (i3 == -1) {
            this.f3896i = 0;
        }
        return i3;
    }

    @Override
    public final long skip(long j) {
        return this.f3895h.skip(j);
    }

    @Override
    public final int read(byte[] bArr) throws IOException {
        int i3 = this.f3895h.read(bArr);
        if (i3 == -1) {
            this.f3896i = 0;
        }
        return i3;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i9) throws IOException {
        int i10 = this.f3895h.read(bArr, i3, i9);
        if (i10 == -1) {
            this.f3896i = 0;
        }
        return i10;
    }
}

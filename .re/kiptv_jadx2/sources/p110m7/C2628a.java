package p110m7;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public final class C2628a extends FilterInputStream {

    public int f25470h;

    public C2628a(ByteArrayInputStream byteArrayInputStream, int i3) {
        super(byteArrayInputStream);
        this.f25470h = i3;
    }

    @Override
    public final int available() {
        return Math.min(super.available(), this.f25470h);
    }

    @Override
    public final int read() throws IOException {
        if (this.f25470h <= 0) {
            return -1;
        }
        int i3 = super.read();
        if (i3 >= 0) {
            this.f25470h--;
        }
        return i3;
    }

    @Override
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(Math.min(j, this.f25470h));
        if (jSkip >= 0) {
            this.f25470h = (int) (((long) this.f25470h) - jSkip);
        }
        return jSkip;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i9) throws IOException {
        int i10 = this.f25470h;
        if (i10 <= 0) {
            return -1;
        }
        int i11 = super.read(bArr, i3, Math.min(i9, i10));
        if (i11 >= 0) {
            this.f25470h -= i11;
        }
        return i11;
    }
}

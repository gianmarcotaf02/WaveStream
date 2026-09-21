package G4;

import java.io.OutputStream;

public final class b extends OutputStream {

    public long f3788h;

    @Override
    public final void write(int i3) {
        this.f3788h++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.f3788h += (long) bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i3, int i9) {
        int i10;
        if (i3 >= 0 && i3 <= bArr.length && i9 >= 0 && (i10 = i3 + i9) <= bArr.length && i10 >= 0) {
            this.f3788h += (long) i9;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

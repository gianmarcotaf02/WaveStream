package W1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

public class b extends InputStream implements DataInput {

    public final DataInputStream f10543h;

    public int f10544i;
    public ByteOrder j;

    public byte[] f10545k;

    public final int f10546l;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f10546l = bArr.length;
    }

    @Override
    public final int available() {
        return this.f10543h.available();
    }

    public final void b(int i3) throws IOException {
        int i9 = 0;
        while (i9 < i3) {
            DataInputStream dataInputStream = this.f10543h;
            int i10 = i3 - i9;
            int iSkip = (int) dataInputStream.skip(i10);
            if (iSkip <= 0) {
                if (this.f10545k == null) {
                    this.f10545k = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f10545k, 0, Math.min(8192, i10));
                if (iSkip == -1) {
                    throw new EOFException(Y6.f.f(i3, "Reached EOF while skipping ", " bytes."));
                }
            }
            i9 += iSkip;
        }
        this.f10544i += i9;
    }

    @Override
    public final void mark(int i3) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override
    public final int read() {
        this.f10544i++;
        return this.f10543h.read();
    }

    @Override
    public final boolean readBoolean() {
        this.f10544i++;
        return this.f10543h.readBoolean();
    }

    @Override
    public final byte readByte() throws IOException {
        this.f10544i++;
        int i3 = this.f10543h.read();
        if (i3 >= 0) {
            return (byte) i3;
        }
        throw new EOFException();
    }

    @Override
    public final char readChar() {
        this.f10544i += 2;
        return this.f10543h.readChar();
    }

    @Override
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override
    public final void readFully(byte[] bArr, int i3, int i9) throws IOException {
        this.f10544i += i9;
        this.f10543h.readFully(bArr, i3, i9);
    }

    @Override
    public final int readInt() throws IOException {
        this.f10544i += 4;
        DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i3 | i9 | i10 | i11) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 24) + (i10 << 16) + (i9 << 8) + i3;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i3 << 24) + (i9 << 16) + (i10 << 8) + i11;
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override
    public final long readLong() throws IOException {
        long j;
        long j9;
        this.f10544i += 8;
        DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        if ((i3 | i9 | i10 | i11 | i12 | i13 | i14 | i15) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i15) << 56) + (((long) i14) << 48) + (((long) i13) << 40) + (((long) i12) << 32) + (((long) i11) << 24) + (((long) i10) << 16) + (((long) i9) << 8);
            j9 = i3;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.j);
            }
            j = (((long) i3) << 56) + (((long) i9) << 48) + (((long) i10) << 40) + (((long) i11) << 32) + (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8);
            j9 = i15;
        }
        return j + j9;
    }

    @Override
    public final short readShort() throws IOException {
        this.f10544i += 2;
        DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i3 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i9 << 8) + i3);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((i3 << 8) + i9);
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override
    public final String readUTF() {
        this.f10544i += 2;
        return this.f10543h.readUTF();
    }

    @Override
    public final int readUnsignedByte() {
        this.f10544i++;
        return this.f10543h.readUnsignedByte();
    }

    @Override
    public final int readUnsignedShort() throws IOException {
        this.f10544i += 2;
        DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i3 | i9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.j;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (i9 << 8) + i3;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (i3 << 8) + i9;
        }
        throw new IOException("Invalid byte order: " + this.j);
    }

    @Override
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override
    public final int read(byte[] bArr, int i3, int i9) throws IOException {
        int i10 = this.f10543h.read(bArr, i3, i9);
        this.f10544i += i10;
        return i10;
    }

    @Override
    public final void readFully(byte[] bArr) throws IOException {
        this.f10544i += bArr.length;
        this.f10543h.readFully(bArr);
    }

    public b(InputStream inputStream, int i3) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10543h = dataInputStream;
        dataInputStream.mark(0);
        this.f10544i = 0;
        this.j = byteOrder;
        this.f10546l = inputStream instanceof b ? ((b) inputStream).f10546l : -1;
    }
}

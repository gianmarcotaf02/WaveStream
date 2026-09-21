package W1;

/* JADX INFO: loaded from: classes.dex */
public class b extends java.io.InputStream implements java.io.DataInput {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.io.DataInputStream f10543h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10544i;
    public java.nio.ByteOrder j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public byte[] f10545k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10546l;

    public b(byte[] bArr) {
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(bArr);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
        this.f10546l = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10543h.available();
    }

    public final void b(int i3) throws java.io.IOException {
        int i9 = 0;
        while (i9 < i3) {
            java.io.DataInputStream dataInputStream = this.f10543h;
            int i10 = i3 - i9;
            int iSkip = (int) dataInputStream.skip(i10);
            if (iSkip <= 0) {
                if (this.f10545k == null) {
                    this.f10545k = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f10545k, 0, java.lang.Math.min(8192, i10));
                if (iSkip == -1) {
                    throw new java.io.EOFException(Y6.f.f(i3, "Reached EOF while skipping ", " bytes."));
                }
            }
            i9 += iSkip;
        }
        this.f10544i += i9;
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new java.lang.UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f10544i++;
        return this.f10543h.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10544i++;
        return this.f10543h.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws java.io.IOException {
        this.f10544i++;
        int i3 = this.f10543h.read();
        if (i3 >= 0) {
            return (byte) i3;
        }
        throw new java.io.EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f10544i += 2;
        return this.f10543h.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i9) throws java.io.IOException {
        this.f10544i += i9;
        this.f10543h.readFully(bArr, i3, i9);
    }

    @Override // java.io.DataInput
    public final int readInt() throws java.io.IOException {
        this.f10544i += 4;
        java.io.DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        if ((i3 | i9 | i10 | i11) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.j;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (i11 << 24) + (i10 << 16) + (i9 << 8) + i3;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (i3 << 24) + (i9 << 16) + (i10 << 8) + i11;
        }
        throw new java.io.IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
        android.util.Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws java.io.IOException {
        long j;
        long j9;
        this.f10544i += 8;
        java.io.DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        if ((i3 | i9 | i10 | i11 | i12 | i13 | i14 | i15) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.j;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            j = (((long) i15) << 56) + (((long) i14) << 48) + (((long) i13) << 40) + (((long) i12) << 32) + (((long) i11) << 24) + (((long) i10) << 16) + (((long) i9) << 8);
            j9 = i3;
        } else {
            if (byteOrder != java.nio.ByteOrder.BIG_ENDIAN) {
                throw new java.io.IOException("Invalid byte order: " + this.j);
            }
            j = (((long) i3) << 56) + (((long) i9) << 48) + (((long) i10) << 40) + (((long) i11) << 32) + (((long) i12) << 24) + (((long) i13) << 16) + (((long) i14) << 8);
            j9 = i15;
        }
        return j + j9;
    }

    @Override // java.io.DataInput
    public final short readShort() throws java.io.IOException {
        this.f10544i += 2;
        java.io.DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i3 | i9) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.j;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (short) ((i9 << 8) + i3);
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (short) ((i3 << 8) + i9);
        }
        throw new java.io.IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
        this.f10544i += 2;
        return this.f10543h.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10544i++;
        return this.f10543h.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws java.io.IOException {
        this.f10544i += 2;
        java.io.DataInputStream dataInputStream = this.f10543h;
        int i3 = dataInputStream.read();
        int i9 = dataInputStream.read();
        if ((i3 | i9) < 0) {
            throw new java.io.EOFException();
        }
        java.nio.ByteOrder byteOrder = this.j;
        if (byteOrder == java.nio.ByteOrder.LITTLE_ENDIAN) {
            return (i9 << 8) + i3;
        }
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            return (i3 << 8) + i9;
        }
        throw new java.io.IOException("Invalid byte order: " + this.j);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new java.lang.UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new java.lang.UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(java.io.InputStream inputStream) {
        this(inputStream, 0);
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i9) throws java.io.IOException {
        int i10 = this.f10543h.read(bArr, i3, i9);
        this.f10544i += i10;
        return i10;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws java.io.IOException {
        this.f10544i += bArr.length;
        this.f10543h.readFully(bArr);
    }

    public b(java.io.InputStream inputStream, int i3) {
        java.nio.ByteOrder byteOrder = java.nio.ByteOrder.BIG_ENDIAN;
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(inputStream);
        this.f10543h = dataInputStream;
        dataInputStream.mark(0);
        this.f10544i = 0;
        this.j = byteOrder;
        this.f10546l = inputStream instanceof W1.b ? ((W1.b) inputStream).f10546l : -1;
    }
}

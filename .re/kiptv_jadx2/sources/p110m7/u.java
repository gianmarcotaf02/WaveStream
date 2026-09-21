package p110m7;

import Y6.f;
import androidx.datastore.preferences.protobuf.C1497d;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class u extends AbstractC2632e {

    public final byte[] f25506i;
    public int j = 0;

    public u(byte[] bArr) {
        this.f25506i = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2632e) || size() != ((AbstractC2632e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof u) {
            return y((u) obj, 0, size());
        }
        if (obj instanceof z) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        throw new IllegalArgumentException(f.m(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
    }

    public final int hashCode() {
        int iS = this.j;
        if (iS == 0) {
            int size = size();
            iS = s(size, 0, size);
            if (iS == 0) {
                iS = 1;
            }
            this.j = iS;
        }
        return iS;
    }

    @Override
    public Iterator iterator() {
        return new C1497d(this);
    }

    @Override
    public void n(int i3, int i9, int i10, byte[] bArr) {
        System.arraycopy(this.f25506i, i3, bArr, i9, i10);
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final boolean p() {
        return true;
    }

    @Override
    public final boolean q() {
        byte[] bArr = this.f25506i;
        return D.c(bArr, 0, bArr.length) == 0;
    }

    @Override
    public final int s(int i3, int i9, int i10) {
        for (int i11 = i9; i11 < i9 + i10; i11++) {
            i3 = (i3 * 31) + this.f25506i[i11];
        }
        return i3;
    }

    @Override
    public int size() {
        return this.f25506i.length;
    }

    @Override
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int t(int i3, int i9, int i10) {
        byte b9;
        int i11;
        int i12;
        int i13 = i10 + i9;
        byte[] bArr = this.f25506i;
        if (i3 != 0) {
            if (i9 >= i13) {
                return i3;
            }
            byte b10 = (byte) i3;
            if (b10 < -32) {
                if (b10 >= -62) {
                    i12 = i9 + 1;
                }
                return -1;
            }
            if (b10 < -16) {
                byte b11 = (byte) (~(i3 >> 8));
                if (b11 == 0) {
                    int i14 = i9 + 1;
                    byte b12 = bArr[i9];
                    if (i14 >= i13) {
                        return D.a(b10, b12);
                    }
                    i9 = i14;
                    b11 = b12;
                }
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    i12 = i9 + 1;
                }
            } else {
                byte b13 = (byte) (~(i3 >> 8));
                if (b13 == 0) {
                    i11 = i9 + 1;
                    b13 = bArr[i9];
                    if (i11 >= i13) {
                        return D.a(b10, b13);
                    }
                    b9 = 0;
                } else {
                    b9 = (byte) (i3 >> 16);
                    i11 = i9;
                }
                if (b9 == 0) {
                    int i15 = i11 + 1;
                    byte b14 = bArr[i11];
                    if (i15 >= i13) {
                        if (b10 > -12 || b13 > -65 || b14 > -65) {
                            return -1;
                        }
                        return (b14 << 16) ^ ((b13 << 8) ^ b10);
                    }
                    b9 = b14;
                    i11 = i15;
                }
                if (b13 <= -65) {
                    if ((((b13 + 112) + (b10 << 28)) >> 30) == 0 && b9 <= -65) {
                        i9 = i11 + 1;
                    }
                }
            }
            return -1;
        }
        return D.c(bArr, i9, i13);
    }

    @Override
    public final int u() {
        return this.j;
    }

    @Override
    public final String v() {
        byte[] bArr = this.f25506i;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override
    public final void x(OutputStream outputStream, int i3, int i9) throws IOException {
        outputStream.write(this.f25506i, i3, i9);
    }

    public final boolean y(u uVar, int i3, int i9) {
        byte[] bArr = uVar.f25506i;
        int length = bArr.length;
        byte[] bArr2 = this.f25506i;
        if (i9 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i9);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i10 = i3 + i9;
        int length3 = bArr.length;
        byte[] bArr3 = uVar.f25506i;
        if (i10 <= length3) {
            int i11 = 0;
            while (i11 < i9) {
                if (bArr2[i11] != bArr3[i3]) {
                    return false;
                }
                i11++;
                i3++;
            }
            return true;
        }
        int length4 = bArr3.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i3);
        sb2.append(", ");
        sb2.append(i9);
        sb2.append(", ");
        sb2.append(length4);
        throw new IllegalArgumentException(sb2.toString());
    }
}

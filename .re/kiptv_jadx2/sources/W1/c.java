package W1;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class c {

    public final int f10547a;

    public final int f10548b;

    public final long f10549c;

    public final byte[] f10550d;

    public c(byte[] bArr, int i3, int i9) {
        this(-1L, bArr, i3, i9);
    }

    public static c a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f10559C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new c(byteBufferWrap.array(), 4, 1);
    }

    public static c b(e eVar, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f10559C[5]]);
        byteBufferWrap.order(byteOrder);
        e eVar2 = new e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f10555a);
        byteBufferWrap.putInt((int) eVar2.f10556b);
        return new c(byteBufferWrap.array(), 5, 1);
    }

    public static c c(int i3, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[g.f10559C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i3}[0]);
        return new c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof e[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        e[] eVarArr = (e[]) objG;
        if (eVarArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        e eVar = eVarArr[0];
        return eVar.f10555a / eVar.f10556b;
    }

    public final int e(ByteOrder byteOrder) {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i3 < jArr.length) {
                sb.append(jArr[i3]);
                i3++;
                if (i3 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i3 < iArr.length) {
                sb.append(iArr[i3]);
                i3++;
                if (i3 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i3 < dArr.length) {
                sb.append(dArr[i3]);
                i3++;
                if (i3 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof e[])) {
            return null;
        }
        e[] eVarArr = (e[]) objG;
        while (i3 < eVarArr.length) {
            sb.append(eVarArr[i3].f10555a);
            sb.append('/');
            sb.append(eVarArr[i3].f10556b);
            i3++;
            if (i3 != eVarArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        b bVar;
        InputStream inputStream;
        byte b9;
        String string;
        int length = 0;
        byte[] bArr = this.f10550d;
        InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.j = byteOrder;
                        int i3 = this.f10547a;
                        int i9 = this.f10548b;
                        switch (i3) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b9 = bArr[0]) < 0 || b9 > 1) {
                                    String str = new String(bArr, g.f10567L);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e6) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b9 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e9) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i9 >= g.f10560D.length) {
                                    int i10 = 0;
                                    while (true) {
                                        byte[] bArr2 = g.f10560D;
                                        if (i10 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i10] == bArr2[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                try {
                                    while (length < i9) {
                                        byte b10 = bArr[length];
                                        if (b10 == 0) {
                                            string = sb.toString();
                                            bVar.close();
                                            return string;
                                        }
                                        if (b10 >= 32) {
                                            sb.append((char) b10);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                    bVar.close();
                                    return string;
                                } catch (IOException e10) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                    return string;
                                }
                                string = sb.toString();
                            case 3:
                                ?? r15 = new int[i9];
                                while (length < i9) {
                                    r15[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r15;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return r15;
                                }
                            case 4:
                                ?? r16 = new long[i9];
                                while (length < i9) {
                                    r16[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r16;
                                } catch (IOException e12) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r16;
                                }
                            case 5:
                                ?? r17 = new e[i9];
                                while (length < i9) {
                                    r17[length] = new e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r17;
                                } catch (IOException e13) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
                                    return r17;
                                }
                            case 8:
                                ?? r18 = new int[i9];
                                while (length < i9) {
                                    r18[length] = bVar.readShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r18;
                                } catch (IOException e14) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                                    return r18;
                                }
                            case 9:
                                ?? r19 = new int[i9];
                                while (length < i9) {
                                    r19[length] = bVar.readInt();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r19;
                                } catch (IOException e15) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r19;
                                }
                            case 10:
                                ?? r110 = new e[i9];
                                while (length < i9) {
                                    r110[length] = new e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r110;
                                } catch (IOException e16) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                                    return r110;
                                }
                            case 11:
                                ?? r111 = new double[i9];
                                while (length < i9) {
                                    r111[length] = bVar.readFloat();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r111;
                                } catch (IOException e17) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
                                    return r111;
                                }
                            case 12:
                                ?? r112 = new double[i9];
                                while (length < i9) {
                                    r112[length] = bVar.readDouble();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r112;
                                } catch (IOException e18) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return r112;
                                }
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (IOException e19) {
                        e = e19;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e20) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                        }
                    }
                    throw th;
                }
            } catch (IOException e21) {
                e = e21;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (IOException e22) {
            Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(g.f10558B[this.f10547a]);
        sb.append(", data length:");
        return Y6.f.k(sb, this.f10550d.length, ")");
    }

    public c(long j, byte[] bArr, int i3, int i9) {
        this.f10547a = i3;
        this.f10548b = i9;
        this.f10549c = j;
        this.f10550d = bArr;
    }
}

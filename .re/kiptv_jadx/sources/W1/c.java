package W1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10550d;

    public c(byte[] bArr, int i3, int i9) {
        this(-1L, bArr, i3, i9);
    }

    public static W1.c a(long j, java.nio.ByteOrder byteOrder) {
        long[] jArr = {j};
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[W1.g.f10559C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new W1.c(byteBufferWrap.array(), 4, 1);
    }

    public static W1.c b(W1.e eVar, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[W1.g.f10559C[5]]);
        byteBufferWrap.order(byteOrder);
        W1.e eVar2 = new W1.e[]{eVar}[0];
        byteBufferWrap.putInt((int) eVar2.f10555a);
        byteBufferWrap.putInt((int) eVar2.f10556b);
        return new W1.c(byteBufferWrap.array(), 5, 1);
    }

    public static W1.c c(int i3, java.nio.ByteOrder byteOrder) {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(new byte[W1.g.f10559C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i3}[0]);
        return new W1.c(byteBufferWrap.array(), 3, 1);
    }

    public final double d(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objG = g(byteOrder);
        if (objG == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof java.lang.String) {
            return java.lang.Double.parseDouble((java.lang.String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof W1.e[])) {
            throw new java.lang.NumberFormatException("Couldn't find a double value");
        }
        W1.e[] eVarArr = (W1.e[]) objG;
        if (eVarArr.length != 1) {
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        W1.e eVar = eVarArr[0];
        return eVar.f10555a / eVar.f10556b;
    }

    public final int e(java.nio.ByteOrder byteOrder) {
        java.lang.Object objG = g(byteOrder);
        if (objG == null) {
            throw new java.lang.NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof java.lang.String) {
            return java.lang.Integer.parseInt((java.lang.String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new java.lang.NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new java.lang.NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new java.lang.NumberFormatException("There are more than one component");
    }

    public final java.lang.String f(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        java.lang.Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof java.lang.String) {
            return (java.lang.String) objG;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
        if (!(objG instanceof W1.e[])) {
            return null;
        }
        W1.e[] eVarArr = (W1.e[]) objG;
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

    /* JADX WARN: Code duplicated, block: B:153:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0033: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:52), block:B:16:0x0033 */
    /* JADX WARN: Type inference failed for: r15v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r15v24, types: [W1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v25, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v26, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v27, types: [W1.e[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v28, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r15v29, types: [double[], java.io.Serializable] */
    public final java.io.Serializable g(java.nio.ByteOrder byteOrder) throws java.lang.Throwable {
        W1.b bVar;
        java.io.InputStream inputStream;
        byte b9;
        java.lang.String string;
        int length = 0;
        byte[] bArr = this.f10550d;
        java.io.InputStream inputStream2 = null;
        try {
            try {
                try {
                    bVar = new W1.b(bArr);
                    try {
                        bVar.j = byteOrder;
                        int i3 = this.f10547a;
                        int i9 = this.f10548b;
                        switch (i3) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b9 = bArr[0]) < 0 || b9 > 1) {
                                    java.lang.String str = new java.lang.String(bArr, W1.g.f10567L);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (java.io.IOException e6) {
                                        android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return str;
                                    }
                                }
                                java.lang.String str2 = new java.lang.String(new char[]{(char) (b9 + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (java.io.IOException e9) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i9 >= W1.g.f10560D.length) {
                                    int i10 = 0;
                                    while (true) {
                                        byte[] bArr2 = W1.g.f10560D;
                                        if (i10 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i10] == bArr2[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
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
                                } catch (java.io.IOException e10) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
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
                                } catch (java.io.IOException e11) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
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
                                } catch (java.io.IOException e12) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                                    return r16;
                                }
                            case 5:
                                ?? r17 = new W1.e[i9];
                                while (length < i9) {
                                    r17[length] = new W1.e(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r17;
                                } catch (java.io.IOException e13) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e13);
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
                                } catch (java.io.IOException e14) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
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
                                } catch (java.io.IOException e15) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                                    return r19;
                                }
                            case 10:
                                ?? r110 = new W1.e[i9];
                                while (length < i9) {
                                    r110[length] = new W1.e(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r110;
                                } catch (java.io.IOException e16) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
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
                                } catch (java.io.IOException e17) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e17);
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
                                } catch (java.io.IOException e18) {
                                    android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e18);
                                    return r112;
                                }
                            default:
                                bVar.close();
                                return null;
                        }
                    } catch (java.io.IOException e19) {
                        e = e19;
                        android.util.Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            bVar.close();
                        }
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (java.io.IOException e20) {
                            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e20);
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e21) {
                e = e21;
                bVar = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        } catch (java.io.IOException e22) {
            android.util.Log.e("ExifInterface", "IOException occurred while closing InputStream", e22);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(W1.g.f10558B[this.f10547a]);
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

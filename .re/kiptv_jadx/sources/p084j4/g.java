package p084j4;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    static {
        new p084j4.f();
    }

    public static byte[] a(java.util.ArrayDeque arrayDeque, int i3) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i3) {
            return bArr;
        }
        int length = i3 - bArr.length;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i3);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = java.lang.Math.min(length, bArr2.length);
            java.lang.System.arraycopy(bArr2, 0, bArrCopyOf, i3 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static byte[] b(java.io.InputStream inputStream) throws java.io.IOException {
        inputStream.getClass();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(20);
        int iMin = java.lang.Math.min(8192, java.lang.Math.max(128, java.lang.Integer.highestOneBit(0) * 2));
        int i3 = 0;
        while (i3 < 2147483639) {
            int iMin2 = java.lang.Math.min(iMin, 2147483639 - i3);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i9 = 0;
            while (i9 < iMin2) {
                int i10 = inputStream.read(bArr, i9, iMin2 - i9);
                if (i10 == -1) {
                    return a(arrayDeque, i3);
                }
                i9 += i10;
                i3 += i10;
            }
            iMin = com.google.crypto.tink.shaded.protobuf.q0.F(((long) iMin) * ((long) (iMin < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(arrayDeque, 2147483639);
        }
        throw new java.lang.OutOfMemoryError("input is too large to fit in a byte array");
    }
}

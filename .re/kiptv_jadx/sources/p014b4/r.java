package p014b4;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char[] f17904h = "0123456789abcdef".toCharArray();

    public final boolean equals(java.lang.Object obj) {
        boolean z6;
        if (obj instanceof p014b4.r) {
            p014b4.r rVar = (p014b4.r) obj;
            byte[] bArr = ((p014b4.q) this).f17903i;
            if (bArr.length * 8 == ((p014b4.q) rVar).f17903i.length * 8) {
                byte[] bArr2 = ((p014b4.q) rVar).f17903i;
                if (bArr.length == bArr2.length) {
                    z6 = true;
                    for (int i3 = 0; i3 < bArr.length; i3++) {
                        z6 &= bArr[i3] == bArr2[i3];
                    }
                } else {
                    z6 = false;
                }
                if (z6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((p014b4.q) this).f17903i;
        if (bArr.length * 8 < 32) {
            int i3 = bArr[0] & 255;
            for (int i9 = 1; i9 < bArr.length; i9++) {
                i3 |= (bArr[i9] & 255) << (i9 * 8);
            }
            return i3;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new java.lang.IllegalStateException(p014b4.AbstractC1659a.b("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", java.lang.Integer.valueOf(length)));
        }
        int i10 = bArr[0] & 255;
        int i11 = bArr[1] & 255;
        int i12 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i10 | (i11 << 8) | (i12 << 16);
    }

    public final java.lang.String toString() {
        byte[] bArr = ((p014b4.q) this).f17903i;
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b9 : bArr) {
            char[] cArr = f17904h;
            sb.append(cArr[(b9 >> 4) & 15]);
            sb.append(cArr[b9 & 15]);
        }
        return sb.toString();
    }
}

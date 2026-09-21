package p102l8;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements java.lang.Comparable {
    public static final p102l8.a j = new p102l8.a(new byte[0]);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final char[] f24870k;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f24871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f24872i;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        kotlin.jvm.internal.m.d(charArray, "toCharArray(...)");
        f24870k = charArray;
    }

    public a(byte[] bArr) {
        this.f24871h = bArr;
    }

    public final byte a(int i3) {
        byte[] bArr = this.f24871h;
        if (i3 < 0 || i3 >= bArr.length) {
            throw new java.lang.IndexOutOfBoundsException(Y6.f.j(p121o0.p.t(i3, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        }
        return bArr[i3];
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        p102l8.a other = (p102l8.a) obj;
        kotlin.jvm.internal.m.e(other, "other");
        if (other == this) {
            return 0;
        }
        byte[] bArr = this.f24871h;
        int length = bArr.length;
        byte[] bArr2 = other.f24871h;
        int iMin = java.lang.Math.min(length, bArr2.length);
        for (int i3 = 0; i3 < iMin; i3++) {
            int iF = kotlin.jvm.internal.m.f(bArr[i3] & 255, bArr2[i3] & 255);
            if (iF != 0) {
                return iF;
            }
        }
        return kotlin.jvm.internal.m.f(bArr.length, bArr2.length);
    }

    public final boolean equals(java.lang.Object obj) {
        int i3;
        if (this == obj) {
            return true;
        }
        if (obj == null || p102l8.a.class != obj.getClass()) {
            return false;
        }
        p102l8.a aVar = (p102l8.a) obj;
        byte[] bArr = aVar.f24871h;
        int length = bArr.length;
        byte[] bArr2 = this.f24871h;
        if (length != bArr2.length) {
            return false;
        }
        int i9 = aVar.f24872i;
        if (i9 == 0 || (i3 = this.f24872i) == 0 || i9 == i3) {
            return java.util.Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i3 = this.f24872i;
        if (i3 != 0) {
            return i3;
        }
        int iHashCode = java.util.Arrays.hashCode(this.f24871h);
        this.f24872i = iHashCode;
        return iHashCode;
    }

    public final java.lang.String toString() {
        byte[] bArr = this.f24871h;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        java.lang.String strValueOf = java.lang.String.valueOf(bArr.length);
        java.lang.StringBuilder sb = new java.lang.StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b9 : bArr) {
            char[] cArr = f24870k;
            sb.append(cArr[(b9 >>> 4) & 15]);
            sb.append(cArr[b9 & 15]);
        }
        sb.append(')');
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public /* synthetic */ a(byte[] bArr, int i3) {
        this(bArr, 0, bArr.length);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(byte[] data, int i3, int i9) {
        this(p078i6.m.f0(data, i3, i9));
        kotlin.jvm.internal.m.e(data, "data");
    }
}

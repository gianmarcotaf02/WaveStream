package o4;

/* JADX INFO: loaded from: classes.dex */
public final class l implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f26130h;

    public l(byte[] bArr) {
        this.f26130h = java.util.Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        o4.l lVar = (o4.l) obj;
        byte[] bArr = this.f26130h;
        int length = bArr.length;
        byte[] bArr2 = lVar.f26130h;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i3 = 0; i3 < bArr.length; i3++) {
            byte b9 = bArr[i3];
            byte b10 = lVar.f26130h[i3];
            if (b9 != b10) {
                return b9 - b10;
            }
        }
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof o4.l) {
            return java.util.Arrays.equals(this.f26130h, ((o4.l) obj).f26130h);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f26130h);
    }

    public final java.lang.String toString() {
        return B4.k.f(this.f26130h);
    }
}

package C4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f889a;

    public a(byte[] bArr, int i3) {
        byte[] bArr2 = new byte[i3];
        this.f889a = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static C4.a a(byte[] bArr) {
        if (bArr != null) {
            return new C4.a(bArr, bArr.length);
        }
        throw new java.lang.NullPointerException("data must be non-null");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof C4.a) {
            return java.util.Arrays.equals(((C4.a) obj).f889a, this.f889a);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.f889a);
    }

    public final java.lang.String toString() {
        return "Bytes(" + B4.k.f(this.f889a) + ")";
    }
}

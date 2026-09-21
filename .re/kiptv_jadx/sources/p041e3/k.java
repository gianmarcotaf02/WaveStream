package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p013b3.b f21403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21404b;

    public k(p013b3.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new java.lang.NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new java.lang.NullPointerException("bytes is null");
        }
        this.f21403a = bVar;
        this.f21404b = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p041e3.k)) {
            return false;
        }
        p041e3.k kVar = (p041e3.k) obj;
        if (this.f21403a.equals(kVar.f21403a)) {
            return java.util.Arrays.equals(this.f21404b, kVar.f21404b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f21403a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f21404b);
    }

    public final java.lang.String toString() {
        return "EncodedPayload{encoding=" + this.f21403a + ", bytes=[...]}";
    }
}

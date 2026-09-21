package p014b4;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p014b4.AbstractC1659a implements java.io.Serializable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.security.MessageDigest f17907l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f17908m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f17909n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.String f17910o;

    public u() {
        boolean z6;
        try {
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance("SHA-256");
            this.f17907l = messageDigest;
            this.f17908m = messageDigest.getDigestLength();
            this.f17910o = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z6 = true;
            } catch (java.lang.CloneNotSupportedException unused) {
                z6 = false;
            }
            this.f17909n = z6;
        } catch (java.security.NoSuchAlgorithmException e6) {
            throw new java.lang.AssertionError(e6);
        }
    }

    public final java.lang.String toString() {
        return this.f17910o;
    }
}

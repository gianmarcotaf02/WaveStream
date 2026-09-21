package p041e3;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p013b3.c f21397c;

    public i(java.lang.String str, byte[] bArr, p013b3.c cVar) {
        this.f21395a = str;
        this.f21396b = bArr;
        this.f21397c = cVar;
    }

    public static android.support.v4.media.session.q a() {
        android.support.v4.media.session.q qVar = new android.support.v4.media.session.q(23, false);
        qVar.f15618k = p013b3.c.f17869h;
        return qVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p041e3.i) {
            p041e3.i iVar = (p041e3.i) obj;
            if (this.f21395a.equals(iVar.f21395a) && java.util.Arrays.equals(this.f21396b, iVar.f21396b) && this.f21397c.equals(iVar.f21397c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f21395a.hashCode() ^ 1000003) * 1000003) ^ java.util.Arrays.hashCode(this.f21396b)) * 1000003) ^ this.f21397c.hashCode();
    }

    public final java.lang.String toString() {
        byte[] bArr = this.f21396b;
        return "TransportContext(" + this.f21395a + ", " + this.f21397c + ", " + (bArr == null ? "" : android.util.Base64.encodeToString(bArr, 2)) + ")";
    }
}

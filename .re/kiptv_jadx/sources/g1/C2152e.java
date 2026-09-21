package g1;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2152e implements g1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21814b;

    public C2152e(int i3, int i9) {
        this.f21813a = i3;
        this.f21814b = i9;
        if (i3 >= 0 && i9 >= 0) {
            return;
        }
        p065h1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i9 + " respectively.");
    }

    @Override // g1.g
    public final void a(g1.h hVar) {
        int i3 = hVar.f21819c;
        int i9 = this.f21814b;
        int iZ = i3 + i9;
        int i10 = (i3 ^ iZ) & (i9 ^ iZ);
        Z2.M m8 = (Z2.M) hVar.f21822f;
        if (i10 < 0) {
            iZ = m8.z();
        }
        hVar.a(hVar.f21819c, java.lang.Math.min(iZ, m8.z()));
        int i11 = hVar.f21818b;
        int i12 = this.f21813a;
        int i13 = i11 - i12;
        if (((i11 ^ i13) & (i12 ^ i11)) < 0) {
            i13 = 0;
        }
        hVar.a(java.lang.Math.max(0, i13), hVar.f21818b);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.C2152e)) {
            return false;
        }
        g1.C2152e c2152e = (g1.C2152e) obj;
        return this.f21813a == c2152e.f21813a && this.f21814b == c2152e.f21814b;
    }

    public final int hashCode() {
        return (this.f21813a * 31) + this.f21814b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f21813a);
        sb.append(", lengthAfterCursor=");
        return Y6.f.j(sb, this.f21814b, ')');
    }
}

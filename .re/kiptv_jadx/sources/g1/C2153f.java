package g1;

/* JADX INFO: renamed from: g1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2153f implements g1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f21816b;

    public C2153f(int i3, int i9) {
        this.f21815a = i3;
        this.f21816b = i9;
        if (i3 >= 0 && i9 >= 0) {
            return;
        }
        p065h1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i9 + " respectively.");
    }

    @Override // g1.g
    public final void a(g1.h hVar) {
        int i3 = 0;
        for (int i9 = 0; i9 < this.f21815a; i9++) {
            int i10 = i3 + 1;
            int i11 = hVar.f21818b;
            if (i11 <= i10) {
                i3 = i11;
                break;
            }
            i3 = (java.lang.Character.isHighSurrogate(hVar.b((i11 - i10) + (-1))) && java.lang.Character.isLowSurrogate(hVar.b(hVar.f21818b - i10))) ? i3 + 2 : i10;
        }
        int iZ = 0;
        for (int i12 = 0; i12 < this.f21816b; i12++) {
            int i13 = iZ + 1;
            int i14 = hVar.f21819c + i13;
            Z2.M m8 = (Z2.M) hVar.f21822f;
            if (i14 >= m8.z()) {
                iZ = m8.z() - hVar.f21819c;
                break;
            }
            iZ = (java.lang.Character.isHighSurrogate(hVar.b((hVar.f21819c + i13) + (-1))) && java.lang.Character.isLowSurrogate(hVar.b(hVar.f21819c + i13))) ? iZ + 2 : i13;
        }
        int i15 = hVar.f21819c;
        hVar.a(i15, iZ + i15);
        int i16 = hVar.f21818b;
        hVar.a(i16 - i3, i16);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1.C2153f)) {
            return false;
        }
        g1.C2153f c2153f = (g1.C2153f) obj;
        return this.f21815a == c2153f.f21815a && this.f21816b == c2153f.f21816b;
    }

    public final int hashCode() {
        return (this.f21815a * 31) + this.f21816b;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f21815a);
        sb.append(", lengthAfterCursor=");
        return Y6.f.j(sb, this.f21816b, ')');
    }
}

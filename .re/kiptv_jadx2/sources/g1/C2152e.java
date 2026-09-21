package g1;

import Z2.M;

public final class C2152e implements g {

    public final int f21813a;

    public final int f21814b;

    public C2152e(int i3, int i9) {
        this.f21813a = i3;
        this.f21814b = i9;
        if (i3 >= 0 && i9 >= 0) {
            return;
        }
        p065h1.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i3 + " and " + i9 + " respectively.");
    }

    @Override
    public final void a(h hVar) {
        int i3 = hVar.f21819c;
        int i9 = this.f21814b;
        int iZ = i3 + i9;
        int i10 = (i3 ^ iZ) & (i9 ^ iZ);
        M m8 = (M) hVar.f21822f;
        if (i10 < 0) {
            iZ = m8.z();
        }
        hVar.a(hVar.f21819c, Math.min(iZ, m8.z()));
        int i11 = hVar.f21818b;
        int i12 = this.f21813a;
        int i13 = i11 - i12;
        if (((i11 ^ i13) & (i12 ^ i11)) < 0) {
            i13 = 0;
        }
        hVar.a(Math.max(0, i13), hVar.f21818b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2152e)) {
            return false;
        }
        C2152e c2152e = (C2152e) obj;
        return this.f21813a == c2152e.f21813a && this.f21814b == c2152e.f21814b;
    }

    public final int hashCode() {
        return (this.f21813a * 31) + this.f21814b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f21813a);
        sb.append(", lengthAfterCursor=");
        return Y6.f.j(sb, this.f21814b, ')');
    }
}

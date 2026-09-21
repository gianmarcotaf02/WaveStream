package g1;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21817a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f21821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f21822f;

    public /* synthetic */ h() {
    }

    public void a(int i3, int i9) {
        long jB = p011b1.D.b(i3, i9);
        ((Z2.M) this.f21822f).V(i3, i9, "");
        long jM = com.google.crypto.tink.shaded.protobuf.q0.M(p011b1.D.b(this.f21818b, this.f21819c), jB);
        h(p011b1.L.f(jM));
        g(p011b1.L.e(jM));
        int i10 = this.f21820d;
        if (i10 != -1) {
            long jM2 = com.google.crypto.tink.shaded.protobuf.q0.M(p011b1.D.b(i10, this.f21821e), jB);
            if (p011b1.L.c(jM2)) {
                this.f21820d = -1;
                this.f21821e = -1;
            } else {
                this.f21820d = p011b1.L.f(jM2);
                this.f21821e = p011b1.L.e(jM2);
            }
        }
    }

    public char b(int i3) {
        Z2.M m8 = (Z2.M) this.f21822f;
        U.C0948v c0948v = (U.C0948v) m8.f12786e;
        if (c0948v == null) {
            return ((java.lang.String) m8.f12785d).charAt(i3);
        }
        if (i3 < m8.f12783b) {
            return ((java.lang.String) m8.f12785d).charAt(i3);
        }
        int iD = c0948v.f10086b - c0948v.d();
        int i9 = m8.f12783b;
        if (i3 >= iD + i9) {
            return ((java.lang.String) m8.f12785d).charAt(i3 - ((iD - m8.f12784c) + i9));
        }
        int i10 = i3 - i9;
        int i11 = c0948v.f10087c;
        return i10 < i11 ? ((char[]) c0948v.f10089e)[i10] : ((char[]) c0948v.f10089e)[(i10 - i11) + c0948v.f10088d];
    }

    public p011b1.L c() {
        int i3 = this.f21820d;
        if (i3 != -1) {
            return new p011b1.L(p011b1.D.b(i3, this.f21821e));
        }
        return null;
    }

    public void d(int i3, int i9, java.lang.String str) {
        Z2.M m8 = (Z2.M) this.f21822f;
        if (i3 < 0 || i3 > m8.z()) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "start (", ") offset is outside of text region ");
            sbT.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 < 0 || i9 > m8.z()) {
            java.lang.StringBuilder sbT2 = p121o0.p.t(i9, "end (", ") offset is outside of text region ");
            sbT2.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT2.toString());
        }
        if (i3 > i9) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Do not set reversed range: ", " > "));
        }
        m8.V(i3, i9, str);
        h(str.length() + i3);
        g(str.length() + i3);
        this.f21820d = -1;
        this.f21821e = -1;
    }

    public void e(int i3, int i9) {
        Z2.M m8 = (Z2.M) this.f21822f;
        if (i3 < 0 || i3 > m8.z()) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "start (", ") offset is outside of text region ");
            sbT.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 < 0 || i9 > m8.z()) {
            java.lang.StringBuilder sbT2 = p121o0.p.t(i9, "end (", ") offset is outside of text region ");
            sbT2.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT2.toString());
        }
        if (i3 >= i9) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Do not set reversed or empty range: ", " > "));
        }
        this.f21820d = i3;
        this.f21821e = i9;
    }

    public void f(int i3, int i9) {
        Z2.M m8 = (Z2.M) this.f21822f;
        if (i3 < 0 || i3 > m8.z()) {
            java.lang.StringBuilder sbT = p121o0.p.t(i3, "start (", ") offset is outside of text region ");
            sbT.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (i9 < 0 || i9 > m8.z()) {
            java.lang.StringBuilder sbT2 = p121o0.p.t(i9, "end (", ") offset is outside of text region ");
            sbT2.append(m8.z());
            throw new java.lang.IndexOutOfBoundsException(sbT2.toString());
        }
        if (i3 > i9) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(i3, i9, "Do not set reversed range: ", " > "));
        }
        h(i3);
        g(i9);
    }

    public void g(int i3) {
        if (!(i3 >= 0)) {
            p065h1.a.a("Cannot set selectionEnd to a negative value: " + i3);
        }
        this.f21819c = i3;
    }

    public void h(int i3) {
        if (!(i3 >= 0)) {
            p065h1.a.a("Cannot set selectionStart to a negative value: " + i3);
        }
        this.f21818b = i3;
    }

    public java.lang.String toString() {
        switch (this.f21817a) {
            case 0:
                return ((Z2.M) this.f21822f).toString();
            default:
                return super.toString();
        }
    }

    public h(p011b1.C1650g c1650g, long j) {
        java.lang.String str = c1650g.f17809i;
        Z2.M m8 = new Z2.M(3);
        m8.f12785d = str;
        m8.f12783b = -1;
        m8.f12784c = -1;
        this.f21822f = m8;
        this.f21818b = p011b1.L.f(j);
        this.f21819c = p011b1.L.e(j);
        this.f21820d = -1;
        this.f21821e = -1;
        int iF = p011b1.L.f(j);
        int iE = p011b1.L.e(j);
        java.lang.String str2 = c1650g.f17809i;
        if (iF < 0 || iF > str2.length()) {
            java.lang.StringBuilder sbT = p121o0.p.t(iF, "start (", ") offset is outside of text region ");
            sbT.append(str2.length());
            throw new java.lang.IndexOutOfBoundsException(sbT.toString());
        }
        if (iE < 0 || iE > str2.length()) {
            java.lang.StringBuilder sbT2 = p121o0.p.t(iE, "end (", ") offset is outside of text region ");
            sbT2.append(str2.length());
            throw new java.lang.IndexOutOfBoundsException(sbT2.toString());
        }
        if (iF > iE) {
            throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.play_billing.M0.k(iF, iE, "Do not set reversed range: ", " > "));
        }
    }
}

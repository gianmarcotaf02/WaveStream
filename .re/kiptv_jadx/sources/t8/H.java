package t8;

/* JADX INFO: loaded from: classes4.dex */
public class H extends t8.AbstractC2851a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t8.o f28574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final char[] f28575f;
    public int g = 128;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t8.C2854d f28576h;

    public H(t8.o oVar, char[] cArr) {
        this.f28574e = oVar;
        this.f28575f = cArr;
        this.f28576h = new t8.C2854d(cArr);
        E(0);
    }

    @Override // t8.AbstractC2851a
    public final java.lang.String A(int i3, int i9) {
        t8.C2854d c2854d = this.f28576h;
        return O7.x.m0(c2854d.f28616h, i3, java.lang.Math.min(i9, c2854d.f28617i));
    }

    public final void E(int i3) {
        t8.C2854d c2854d = this.f28576h;
        char[] cArr = c2854d.f28616h;
        if (i3 != 0) {
            int i9 = this.f28603a;
            p078i6.m.b0(cArr, cArr, 0, i9, i9 + i3);
        }
        int i10 = c2854d.f28617i;
        while (i3 != i10) {
            int iK = this.f28574e.K(cArr, i3, i10 - i3);
            if (iK == -1) {
                c2854d.f28617i = java.lang.Math.min(c2854d.f28616h.length, i3);
                this.g = -1;
                break;
            }
            i3 += iK;
        }
        this.f28603a = 0;
    }

    public final void F() {
        t8.C2860j c2860j = t8.C2860j.f28624c;
        c2860j.getClass();
        char[] array = this.f28575f;
        kotlin.jvm.internal.m.e(array, "array");
        if (array.length == 16384) {
            c2860j.b(array);
        } else {
            throw new java.lang.IllegalArgumentException(("Inconsistent internal invariant: unexpected array size " + array.length).toString());
        }
    }

    @Override // t8.AbstractC2851a
    public final void b(int i3, int i9) {
        this.f28606d.append(this.f28576h.f28616h, i3, i9 - i3);
    }

    @Override // t8.AbstractC2851a
    public boolean c() {
        o();
        int i3 = this.f28603a;
        while (true) {
            int iY = y(i3);
            if (iY == -1) {
                this.f28603a = iY;
                return false;
            }
            char c9 = this.f28576h.f28616h[iY];
            if (c9 != ' ' && c9 != '\n' && c9 != '\r' && c9 != '\t') {
                this.f28603a = iY;
                return t8.AbstractC2851a.u(c9);
            }
            i3 = iY + 1;
        }
    }

    @Override // t8.AbstractC2851a
    public final java.lang.String e() {
        char[] cArr;
        h('\"');
        int i3 = this.f28603a;
        t8.C2854d c2854d = this.f28576h;
        int i9 = c2854d.f28617i;
        int i10 = i3;
        while (true) {
            cArr = c2854d.f28616h;
            if (i10 >= i9) {
                i10 = -1;
                break;
            }
            if (cArr[i10] == '\"') {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            int iY = y(i3);
            if (iY != -1) {
                return k(c2854d, this.f28603a, iY);
            }
            int i11 = this.f28603a;
            int i12 = i11 - 1;
            t8.AbstractC2851a.r(this, Y6.f.h("Expected quotation mark '\"', but had '", (i11 == c2854d.f28617i || i12 < 0) ? "EOF" : java.lang.String.valueOf(c2854d.f28616h[i12]), "' instead"), i12, null, 4);
            throw null;
        }
        for (int i13 = i3; i13 < i10; i13++) {
            if (cArr[i13] == '\\') {
                return k(c2854d, this.f28603a, i13);
            }
        }
        this.f28603a = i10 + 1;
        return O7.x.m0(cArr, i3, java.lang.Math.min(i10, c2854d.f28617i));
    }

    @Override // t8.AbstractC2851a
    public byte f() {
        o();
        int i3 = this.f28603a;
        while (true) {
            int iY = y(i3);
            if (iY == -1) {
                this.f28603a = iY;
                return (byte) 10;
            }
            int i9 = iY + 1;
            byte bH = t8.x.h(this.f28576h.f28616h[iY]);
            if (bH != 3) {
                this.f28603a = i9;
                return bH;
            }
            i3 = i9;
        }
    }

    @Override // t8.AbstractC2851a
    public void h(char c9) {
        o();
        int i3 = this.f28603a;
        while (true) {
            int iY = y(i3);
            if (iY == -1) {
                this.f28603a = iY;
                D(c9);
                throw null;
            }
            int i9 = iY + 1;
            char c10 = this.f28576h.f28616h[iY];
            if (c10 != ' ' && c10 != '\n' && c10 != '\r' && c10 != '\t') {
                this.f28603a = i9;
                if (c10 == c9) {
                    return;
                }
                D(c9);
                throw null;
            }
            i3 = i9;
        }
    }

    @Override // t8.AbstractC2851a
    public final void o() {
        int i3 = this.f28576h.f28617i - this.f28603a;
        if (i3 > this.g) {
            return;
        }
        E(i3);
    }

    @Override // t8.AbstractC2851a
    public final java.lang.CharSequence t() {
        return this.f28576h;
    }

    @Override // t8.AbstractC2851a
    public final java.lang.String v(java.lang.String keyToMatch, boolean z6) {
        kotlin.jvm.internal.m.e(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // t8.AbstractC2851a
    public final int y(int i3) {
        t8.C2854d c2854d = this.f28576h;
        if (i3 < c2854d.f28617i) {
            return i3;
        }
        this.f28603a = i3;
        o();
        return (this.f28603a != 0 || c2854d.length() == 0) ? -1 : 0;
    }

    @Override // t8.AbstractC2851a
    public int z() {
        int iY;
        char c9;
        int i3 = this.f28603a;
        while (true) {
            iY = y(i3);
            if (iY == -1 || !((c9 = this.f28576h.f28616h[iY]) == ' ' || c9 == '\n' || c9 == '\r' || c9 == '\t')) {
                break;
            }
            i3 = iY + 1;
        }
        this.f28603a = iY;
        return iY;
    }
}

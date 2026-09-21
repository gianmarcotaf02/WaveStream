package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements j$.time.format.InterfaceC2508e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.format.InterfaceC2508e f23709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f23711c;

    @Override // j$.time.format.InterfaceC2508e
    public final int r(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i3) {
        boolean z6 = vVar.f23739c;
        if (i3 > charSequence.length()) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        if (i3 == charSequence.length()) {
            return ~i3;
        }
        int length = this.f23710b + i3;
        if (length > charSequence.length()) {
            if (z6) {
                return ~i3;
            }
            length = charSequence.length();
        }
        int i9 = i3;
        while (i9 < length && vVar.a(charSequence.charAt(i9), this.f23711c)) {
            i9++;
        }
        int iR = this.f23709a.r(vVar, charSequence.subSequence(0, length), i9);
        return (iR == length || !z6) ? iR : ~(i3 + i9);
    }

    public l(j$.time.format.InterfaceC2508e interfaceC2508e, int i3, char c9) {
        this.f23709a = interfaceC2508e;
        this.f23710b = i3;
        this.f23711c = c9;
    }

    @Override // j$.time.format.InterfaceC2508e
    public final boolean p(j$.time.format.x xVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        if (!this.f23709a.p(xVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i3 = this.f23710b;
        if (length2 <= i3) {
            for (int i9 = 0; i9 < i3 - length2; i9++) {
                sb.insert(length, this.f23711c);
            }
            return true;
        }
        throw new j$.time.DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i3);
    }

    public final java.lang.String toString() {
        java.lang.String str;
        char c9 = this.f23711c;
        if (c9 == ' ') {
            str = ")";
        } else {
            str = ",'" + c9 + "')";
        }
        return "Pad(" + this.f23709a + "," + this.f23710b + str;
    }
}

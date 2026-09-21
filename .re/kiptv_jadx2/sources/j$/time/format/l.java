package j$.time.format;

import j$.time.DateTimeException;

public final class l implements InterfaceC2508e {

    public final InterfaceC2508e f23709a;

    public final int f23710b;

    public final char f23711c;

    @Override
    public final int r(v vVar, CharSequence charSequence, int i3) {
        boolean z6 = vVar.f23739c;
        if (i3 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
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

    public l(InterfaceC2508e interfaceC2508e, int i3, char c9) {
        this.f23709a = interfaceC2508e;
        this.f23710b = i3;
        this.f23711c = c9;
    }

    @Override
    public final boolean p(x xVar, StringBuilder sb) {
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
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i3);
    }

    public final String toString() {
        String str;
        char c9 = this.f23711c;
        if (c9 == ' ') {
            str = ")";
        } else {
            str = ",'" + c9 + "')";
        }
        return "Pad(" + this.f23709a + "," + this.f23710b + str;
    }
}

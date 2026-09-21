package j$.time.format;

public final class C2506c implements InterfaceC2508e {

    public final char f23690a;

    public C2506c(char c9) {
        this.f23690a = c9;
    }

    @Override
    public final boolean p(x xVar, StringBuilder sb) {
        sb.append(this.f23690a);
        return true;
    }

    @Override
    public final int r(v vVar, CharSequence charSequence, int i3) {
        if (i3 == charSequence.length()) {
            return ~i3;
        }
        char cCharAt = charSequence.charAt(i3);
        char c9 = this.f23690a;
        return (cCharAt == c9 || (!vVar.f23738b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c9) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c9)))) ? i3 + 1 : ~i3;
    }

    public final String toString() {
        char c9 = this.f23690a;
        if (c9 == '\'') {
            return "''";
        }
        return "'" + c9 + "'";
    }
}

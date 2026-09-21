package j$.time.format;

public final class m extends n {
    @Override
    public final n d(String str, String str2, n nVar) {
        return new m(str, str2, nVar);
    }

    @Override
    public final boolean b(char c9, char c10) {
        return v.b(c9, c10);
    }

    @Override
    public final boolean e(CharSequence charSequence, int i3, int i9) {
        int length = this.f23712a.length();
        if (length > i9 - i3) {
            return false;
        }
        int i10 = 0;
        while (true) {
            int i11 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i12 = i10 + 1;
            int i13 = i3 + 1;
            if (!v.b(this.f23712a.charAt(i10), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i13;
            length = i11;
            i10 = i12;
        }
    }
}

package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends j$.time.format.n {
    @Override // j$.time.format.n
    public final j$.time.format.n d(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        return new j$.time.format.m(str, str2, nVar);
    }

    @Override // j$.time.format.n
    public final boolean b(char c9, char c10) {
        return j$.time.format.v.b(c9, c10);
    }

    @Override // j$.time.format.n
    public final boolean e(java.lang.CharSequence charSequence, int i3, int i9) {
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
            if (!j$.time.format.v.b(this.f23712a.charAt(i10), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i13;
            length = i11;
            i10 = i12;
        }
    }
}

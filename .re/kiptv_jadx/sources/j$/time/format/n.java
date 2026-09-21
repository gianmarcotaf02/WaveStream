package j$.time.format;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.String f23712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.String f23713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final char f23714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j$.time.format.n f23715d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j$.time.format.n f23716e;

    public boolean b(char c9, char c10) {
        return c9 == c10;
    }

    public n(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        this.f23712a = str;
        this.f23713b = str2;
        this.f23715d = nVar;
        if (str.isEmpty()) {
            this.f23714c = (char) 65535;
        } else {
            this.f23714c = this.f23712a.charAt(0);
        }
    }

    public final java.lang.String c(java.lang.CharSequence charSequence, java.text.ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f23712a.length() + index;
        j$.time.format.n nVar = this.f23715d;
        if (nVar != null && length2 != length) {
            while (!b(nVar.f23714c, charSequence.charAt(length2))) {
                nVar = nVar.f23716e;
                if (nVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            java.lang.String strC = nVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f23713b;
    }

    public j$.time.format.n d(java.lang.String str, java.lang.String str2, j$.time.format.n nVar) {
        return new j$.time.format.n(str, str2, nVar);
    }

    public boolean e(java.lang.CharSequence charSequence, int i3, int i9) {
        if (charSequence instanceof java.lang.String) {
            return ((java.lang.String) charSequence).startsWith(this.f23712a, i3);
        }
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
            if (!b(this.f23712a.charAt(i10), charSequence.charAt(i3))) {
                return false;
            }
            i3 = i13;
            length = i11;
            i10 = i12;
        }
    }

    public final boolean a(java.lang.String str, java.lang.String str2) {
        int i3 = 0;
        while (i3 < str.length() && i3 < this.f23712a.length() && b(str.charAt(i3), this.f23712a.charAt(i3))) {
            i3++;
        }
        if (i3 == this.f23712a.length()) {
            if (i3 < str.length()) {
                java.lang.String strSubstring = str.substring(i3);
                for (j$.time.format.n nVar = this.f23715d; nVar != null; nVar = nVar.f23716e) {
                    if (b(nVar.f23714c, strSubstring.charAt(0))) {
                        return nVar.a(strSubstring, str2);
                    }
                }
                j$.time.format.n nVarD = d(strSubstring, str2, null);
                nVarD.f23716e = this.f23715d;
                this.f23715d = nVarD;
                return true;
            }
            this.f23713b = str2;
            return true;
        }
        j$.time.format.n nVarD2 = d(this.f23712a.substring(i3), this.f23713b, this.f23715d);
        this.f23712a = str.substring(0, i3);
        this.f23715d = nVarD2;
        if (i3 < str.length()) {
            this.f23715d.f23716e = d(str.substring(i3), str2, null);
            this.f23713b = null;
            return true;
        }
        this.f23713b = str2;
        return true;
    }
}

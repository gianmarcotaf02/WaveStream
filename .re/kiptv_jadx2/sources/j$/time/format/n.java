package j$.time.format;

import java.text.ParsePosition;

public class n {

    public String f23712a;

    public String f23713b;

    public final char f23714c;

    public n f23715d;

    public n f23716e;

    public boolean b(char c9, char c10) {
        return c9 == c10;
    }

    public n(String str, String str2, n nVar) {
        this.f23712a = str;
        this.f23713b = str2;
        this.f23715d = nVar;
        if (str.isEmpty()) {
            this.f23714c = (char) 65535;
        } else {
            this.f23714c = this.f23712a.charAt(0);
        }
    }

    public final String c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f23712a.length() + index;
        n nVar = this.f23715d;
        if (nVar != null && length2 != length) {
            while (!b(nVar.f23714c, charSequence.charAt(length2))) {
                nVar = nVar.f23716e;
                if (nVar == null) {
                }
            }
            parsePosition.setIndex(length2);
            String strC = nVar.c(charSequence, parsePosition);
            if (strC != null) {
                return strC;
            }
        }
        parsePosition.setIndex(length2);
        return this.f23713b;
    }

    public n d(String str, String str2, n nVar) {
        return new n(str, str2, nVar);
    }

    public boolean e(CharSequence charSequence, int i3, int i9) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f23712a, i3);
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

    public final boolean a(String str, String str2) {
        int i3 = 0;
        while (i3 < str.length() && i3 < this.f23712a.length() && b(str.charAt(i3), this.f23712a.charAt(i3))) {
            i3++;
        }
        if (i3 == this.f23712a.length()) {
            if (i3 < str.length()) {
                String strSubstring = str.substring(i3);
                for (n nVar = this.f23715d; nVar != null; nVar = nVar.f23716e) {
                    if (b(nVar.f23714c, strSubstring.charAt(0))) {
                        return nVar.a(strSubstring, str2);
                    }
                }
                n nVarD = d(strSubstring, str2, null);
                nVarD.f23716e = this.f23715d;
                this.f23715d = nVarD;
                return true;
            }
            this.f23713b = str2;
            return true;
        }
        n nVarD2 = d(this.f23712a.substring(i3), this.f23713b, this.f23715d);
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

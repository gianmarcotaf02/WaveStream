package t8;

/* JADX INFO: loaded from: classes4.dex */
public class L extends t8.AbstractC2851a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f28593e;

    public L(java.lang.String source) {
        kotlin.jvm.internal.m.e(source, "source");
        this.f28593e = source;
    }

    @Override // t8.AbstractC2851a
    public boolean c() {
        int i3 = this.f28603a;
        if (i3 == -1) {
            return false;
        }
        while (true) {
            java.lang.String str = this.f28593e;
            if (i3 >= str.length()) {
                this.f28603a = i3;
                return false;
            }
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f28603a = i3;
                return t8.AbstractC2851a.u(cCharAt);
            }
            i3++;
        }
    }

    @Override // t8.AbstractC2851a
    public final java.lang.String e() {
        h('\"');
        int i3 = this.f28603a;
        java.lang.String str = this.f28593e;
        int iK0 = O7.q.K0(str, '\"', i3, 4);
        if (iK0 == -1) {
            l();
            int i9 = this.f28603a;
            t8.AbstractC2851a.r(this, Y6.f.h("Expected quotation mark '\"', but had '", (i9 == str.length() || i9 < 0) ? "EOF" : java.lang.String.valueOf(str.charAt(i9)), "' instead"), i9, null, 4);
            throw null;
        }
        for (int i10 = i3; i10 < iK0; i10++) {
            if (str.charAt(i10) == '\\') {
                return k(str, this.f28603a, i10);
            }
        }
        this.f28603a = iK0 + 1;
        java.lang.String strSubstring = str.substring(i3, iK0);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    @Override // t8.AbstractC2851a
    public byte f() {
        java.lang.String str;
        int i3 = this.f28603a;
        while (true) {
            str = this.f28593e;
            if (i3 == -1 || i3 >= str.length()) {
                break;
            }
            int i9 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f28603a = i9;
                return t8.x.h(cCharAt);
            }
            i3 = i9;
        }
        this.f28603a = str.length();
        return (byte) 10;
    }

    @Override // t8.AbstractC2851a
    public void h(char c9) {
        int i3 = this.f28603a;
        if (i3 == -1) {
            D(c9);
            throw null;
        }
        while (true) {
            java.lang.String str = this.f28593e;
            if (i3 >= str.length()) {
                this.f28603a = -1;
                D(c9);
                throw null;
            }
            int i9 = i3 + 1;
            char cCharAt = str.charAt(i3);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.f28603a = i9;
                if (cCharAt == c9) {
                    return;
                }
                D(c9);
                throw null;
            }
            i3 = i9;
        }
    }

    @Override // t8.AbstractC2851a
    public final java.lang.CharSequence t() {
        return this.f28593e;
    }

    @Override // t8.AbstractC2851a
    public final java.lang.String v(java.lang.String keyToMatch, boolean z6) {
        kotlin.jvm.internal.m.e(keyToMatch, "keyToMatch");
        int i3 = this.f28603a;
        try {
            if (f() != 6) {
                return null;
            }
            if (!kotlin.jvm.internal.m.a(x(z6), keyToMatch)) {
                return null;
            }
            this.f28605c = null;
            if (f() != 5) {
                return null;
            }
            return x(z6);
        } finally {
            this.f28603a = i3;
            this.f28605c = null;
        }
    }

    @Override // t8.AbstractC2851a
    public final int y(int i3) {
        if (i3 < this.f28593e.length()) {
            return i3;
        }
        return -1;
    }

    @Override // t8.AbstractC2851a
    public int z() {
        char cCharAt;
        int i3 = this.f28603a;
        if (i3 == -1) {
            return i3;
        }
        while (true) {
            java.lang.String str = this.f28593e;
            if (i3 >= str.length() || !((cCharAt = str.charAt(i3)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
                break;
            }
            i3++;
        }
        this.f28603a = i3;
        return i3;
    }
}

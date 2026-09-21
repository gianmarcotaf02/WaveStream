package t8;

/* JADX INFO: renamed from: t8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2851a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B8.h f28604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.lang.String f28605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.StringBuilder f28606d;

    public AbstractC2851a() {
        B8.h hVar = new B8.h((char) 0, 13);
        hVar.j = new java.lang.Object[8];
        int[] iArr = new int[8];
        for (int i3 = 0; i3 < 8; i3++) {
            iArr[i3] = -1;
        }
        hVar.f862k = iArr;
        hVar.f861i = -1;
        this.f28604b = hVar;
        this.f28606d = new java.lang.StringBuilder();
    }

    public static /* synthetic */ void r(t8.AbstractC2851a abstractC2851a, java.lang.String str, int i3, java.lang.String str2, int i9) {
        if ((i9 & 2) != 0) {
            i3 = abstractC2851a.f28603a;
        }
        if ((i9 & 4) != 0) {
            str2 = "";
        }
        abstractC2851a.q(i3, str, str2);
        throw null;
    }

    public static boolean u(char c9) {
        return (c9 == ',' || c9 == ':' || c9 == ']' || c9 == '}') ? false : true;
    }

    public java.lang.String A(int i3, int i9) {
        return t().subSequence(i3, i9).toString();
    }

    public final boolean B() {
        int iZ = z();
        java.lang.CharSequence charSequenceT = t();
        if (iZ >= charSequenceT.length() || iZ == -1 || charSequenceT.charAt(iZ) != ',') {
            return false;
        }
        this.f28603a++;
        return true;
    }

    public final boolean C(boolean z6) {
        int iY = y(z());
        int length = t().length() - iY;
        if (length >= 4 && iY != -1) {
            for (int i3 = 0; i3 < 4; i3++) {
                if ("null".charAt(i3) == t().charAt(iY + i3)) {
                }
            }
            if (length <= 4 || t8.x.h(t().charAt(iY + 4)) != 0) {
                if (!z6) {
                    return true;
                }
                this.f28603a = iY + 4;
                return true;
            }
        }
        return false;
    }

    public final void D(char c9) {
        int i3 = this.f28603a;
        if (i3 > 0 && c9 == '\"') {
            try {
                this.f28603a = i3 - 1;
                java.lang.String strL = l();
                this.f28603a = i3;
                if (kotlin.jvm.internal.m.a(strL, "null")) {
                    q(this.f28603a - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (java.lang.Throwable th) {
                this.f28603a = i3;
                throw th;
            }
        }
        java.lang.String strW = t8.x.w(t8.x.h(c9));
        int i9 = this.f28603a;
        int i10 = i9 - 1;
        r(this, Y6.f.i("Expected ", strW, ", but had '", (i9 == t().length() || i10 < 0) ? "EOF" : java.lang.String.valueOf(t().charAt(i10)), "' instead"), i10, null, 4);
        throw null;
    }

    public final int a(java.lang.CharSequence charSequence, int i3) {
        int i9 = i3 + 4;
        if (i9 < charSequence.length()) {
            this.f28606d.append((char) (s(charSequence, i3 + 3) + (s(charSequence, i3) << 12) + (s(charSequence, i3 + 1) << 8) + (s(charSequence, i3 + 2) << 4)));
            return i9;
        }
        this.f28603a = i3;
        o();
        if (this.f28603a + 4 < charSequence.length()) {
            return a(charSequence, this.f28603a);
        }
        r(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void b(int i3, int i9) {
        this.f28606d.append(t(), i3, i9);
    }

    public abstract boolean c();

    public final void d(int i3, java.lang.String str) {
        if (t().length() - i3 < str.length()) {
            r(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            if (str.charAt(i9) != (t().charAt(i3 + i9) | ' ')) {
                r(this, "Expected valid boolean literal prefix, but had '" + l() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.f28603a = str.length() + i3;
    }

    public abstract java.lang.String e();

    public abstract byte f();

    public final byte g(byte b9) {
        byte bF = f();
        if (bF == b9) {
            return bF;
        }
        java.lang.String strW = t8.x.w(b9);
        int i3 = this.f28603a;
        int i9 = i3 - 1;
        r(this, Y6.f.i("Expected ", strW, ", but had '", (i3 == t().length() || i9 < 0) ? "EOF" : java.lang.String.valueOf(t().charAt(i9)), "' instead"), i9, null, 4);
        throw null;
    }

    public abstract void h(char c9);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public final long i() {
        boolean z6;
        boolean z9;
        double dPow;
        int iY = y(z());
        ?? r9 = 0;
        if (iY >= t().length() || iY == -1) {
            r(this, "EOF", 0, null, 6);
            throw null;
        }
        if (t().charAt(iY) == '\"') {
            iY++;
            if (iY == t().length()) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            z6 = true;
        } else {
            z6 = false;
        }
        int i3 = iY;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        long j = 0;
        long j9 = 0;
        while (true) {
            if (i3 == t().length()) {
                z6 = z6;
                z9 = z11;
                break;
            }
            char cCharAt = t().charAt(i3);
            if ((cCharAt != 'e' && cCharAt != 'E') || z11) {
                z6 = z6;
                if (cCharAt == '-' && z11) {
                    if (i3 == iY) {
                        r(this, "Unexpected symbol '-' in numeric literal", 0, r9, 6);
                        throw r9;
                    }
                    i3++;
                    z10 = false;
                    r9 = r9;
                } else if (cCharAt != '+' || !z11) {
                    z9 = z11;
                    if (cCharAt != '-') {
                        if (t8.x.h(cCharAt) != 0) {
                            break;
                        }
                        i3++;
                        int i9 = cCharAt - '0';
                        if (i9 < 0 || i9 >= 10) {
                            ?? r12 = r9;
                            r(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", 0, r12, 6);
                            throw r12;
                        }
                        if (z9) {
                            j = (j * ((long) 10)) + ((long) i9);
                            z11 = z9;
                            r9 = r9;
                        } else {
                            boolean z13 = z10;
                            j9 = (j9 * ((long) 10)) - ((long) i9);
                            if (j9 > 0) {
                                r(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                            z10 = z13;
                            z11 = z9;
                            r9 = 0;
                        }
                    } else {
                        if (i3 != iY) {
                            r(this, "Unexpected symbol '-' in numeric literal", 0, r9, 6);
                            throw r9;
                        }
                        i3++;
                        z6 = z6;
                        z11 = z9;
                        z12 = true;
                    }
                } else {
                    if (i3 == iY) {
                        r(this, "Unexpected symbol '+' in numeric literal", 0, r9, 6);
                        throw r9;
                    }
                    i3++;
                    z10 = true;
                    r9 = r9;
                }
            } else {
                if (i3 == iY) {
                    r(this, "Unexpected symbol " + cCharAt + " in numeric literal", 0, r9, 6);
                    throw r9;
                }
                i3++;
                z10 = true;
                z11 = true;
            }
        }
        boolean z14 = z10;
        boolean z15 = i3 != iY;
        if (iY == i3 || (z12 && iY == i3 - 1)) {
            r(this, "Expected numeric literal", 0, null, 6);
            throw null;
        }
        if (z6) {
            if (!z15) {
                r(this, "EOF", 0, null, 6);
                throw null;
            }
            if (t().charAt(i3) != '\"') {
                r(this, "Expected closing quotation mark", 0, null, 6);
                throw null;
            }
            i3++;
        }
        this.f28603a = i3;
        if (z9) {
            double d4 = j9;
            if (!z14) {
                dPow = java.lang.Math.pow(10.0d, -j);
            } else {
                if (!z14) {
                    throw new I3.b();
                }
                dPow = java.lang.Math.pow(10.0d, j);
            }
            double d6 = d4 * dPow;
            if (d6 > 9.223372036854776E18d || d6 < -9.223372036854776E18d) {
                r(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (java.lang.Math.floor(d6) != d6) {
                r(this, "Can't convert " + d6 + " to Long", 0, null, 6);
                throw null;
            }
            j9 = (long) d6;
        }
        if (z12) {
            return j9;
        }
        if (j9 != Long.MIN_VALUE) {
            return -j9;
        }
        r(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public final java.lang.String j() {
        java.lang.String str = this.f28605c;
        if (str == null) {
            return e();
        }
        kotlin.jvm.internal.m.b(str);
        this.f28605c = null;
        return str;
    }

    public final java.lang.String k(java.lang.CharSequence source, int i3, int i9) {
        kotlin.jvm.internal.m.e(source, "source");
        char cCharAt = source.charAt(i9);
        boolean z6 = false;
        while (cCharAt != '\"') {
            if (cCharAt == '\\') {
                b(i3, i9);
                int iY = y(i9 + 1);
                if (iY == -1) {
                    r(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                    throw null;
                }
                int iA = iY + 1;
                char cCharAt2 = t().charAt(iY);
                if (cCharAt2 == 'u') {
                    iA = a(t(), iA);
                } else {
                    char c9 = cCharAt2 < 'u' ? t8.C2861k.f28625a[cCharAt2] : (char) 0;
                    if (c9 == 0) {
                        r(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                        throw null;
                    }
                    this.f28606d.append(c9);
                }
                i3 = y(iA);
                if (i3 == -1) {
                    r(this, "Unexpected EOF", i3, null, 4);
                    throw null;
                }
            } else {
                i9++;
                if (i9 >= source.length()) {
                    b(i3, i9);
                    i3 = y(i9);
                    if (i3 == -1) {
                        r(this, "Unexpected EOF", i3, null, 4);
                        throw null;
                    }
                } else {
                    continue;
                }
                cCharAt = source.charAt(i9);
            }
            i9 = i3;
            z6 = true;
            cCharAt = source.charAt(i9);
        }
        java.lang.String strA = !z6 ? A(i3, i9) : n(i3, i9);
        this.f28603a = i9 + 1;
        return strA;
    }

    public final java.lang.String l() {
        java.lang.String str = this.f28605c;
        if (str != null) {
            kotlin.jvm.internal.m.b(str);
            this.f28605c = null;
            return str;
        }
        int iZ = z();
        if (iZ >= t().length() || iZ == -1) {
            r(this, "EOF", iZ, null, 4);
            throw null;
        }
        byte bH = t8.x.h(t().charAt(iZ));
        if (bH == 1) {
            return j();
        }
        if (bH != 0) {
            r(this, "Expected beginning of the string, but got " + t().charAt(iZ), 0, null, 6);
            throw null;
        }
        boolean z6 = false;
        while (t8.x.h(t().charAt(iZ)) == 0) {
            iZ++;
            if (iZ >= t().length()) {
                b(this.f28603a, iZ);
                int iY = y(iZ);
                if (iY == -1) {
                    this.f28603a = iZ;
                    return n(0, 0);
                }
                iZ = iY;
                z6 = true;
            }
        }
        java.lang.String strA = !z6 ? A(this.f28603a, iZ) : n(this.f28603a, iZ);
        this.f28603a = iZ;
        return strA;
    }

    public final java.lang.String m() {
        java.lang.String strL = l();
        if (!kotlin.jvm.internal.m.a(strL, "null") || t().charAt(this.f28603a - 1) == '\"') {
            return strL;
        }
        r(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public final java.lang.String n(int i3, int i9) {
        b(i3, i9);
        java.lang.StringBuilder sb = this.f28606d;
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        sb.setLength(0);
        return string;
    }

    public final void p() {
        if (f() == 10) {
            return;
        }
        r(this, "Expected EOF after parsing, but had " + t().charAt(this.f28603a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final void q(int i3, java.lang.String message, java.lang.String hint) {
        kotlin.jvm.internal.m.e(message, "message");
        kotlin.jvm.internal.m.e(hint, "hint");
        java.lang.String strConcat = hint.length() == 0 ? "" : "\n".concat(hint);
        java.lang.StringBuilder sbN = Y6.f.n(message, " at path: ");
        sbN.append(this.f28604b.e());
        sbN.append(strConcat);
        throw t8.x.d(sbN.toString(), t(), i3);
    }

    public final int s(java.lang.CharSequence charSequence, int i3) {
        char cCharAt = charSequence.charAt(i3);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        r(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public abstract java.lang.CharSequence t();

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonReader(source='");
        sb.append((java.lang.Object) t());
        sb.append("', currentPosition=");
        return Y6.f.j(sb, this.f28603a, ')');
    }

    public abstract java.lang.String v(java.lang.String str, boolean z6);

    public byte w() {
        java.lang.CharSequence charSequenceT = t();
        int i3 = this.f28603a;
        while (true) {
            int iY = y(i3);
            if (iY == -1) {
                this.f28603a = iY;
                return (byte) 10;
            }
            char cCharAt = charSequenceT.charAt(iY);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.f28603a = iY;
                return t8.x.h(cCharAt);
            }
            i3 = iY + 1;
        }
    }

    public final java.lang.String x(boolean z6) {
        java.lang.String strJ;
        byte bW = w();
        if (z6) {
            if (bW != 1 && bW != 0) {
                return null;
            }
            strJ = l();
        } else {
            if (bW != 1) {
                return null;
            }
            strJ = j();
        }
        this.f28605c = strJ;
        return strJ;
    }

    public abstract int y(int i3);

    public abstract int z();

    public void o() {
    }
}

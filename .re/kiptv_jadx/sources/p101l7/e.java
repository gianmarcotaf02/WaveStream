package p101l7;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements java.lang.Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f24836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f24837i;

    public e(java.lang.String str, boolean z6) {
        if (str == null) {
            a(0);
            throw null;
        }
        this.f24836h = str;
        this.f24837i = z6;
    }

    public static /* synthetic */ void a(int i3) {
        java.lang.String str = (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) ? 2 : 3];
        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i3 == 1) {
            objArr[1] = "asString";
        } else if (i3 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i3 == 3 || i3 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i3) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = io.sentry.protocol.ViewHierarchyNode.JsonKeys.IDENTIFIER;
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String str2 = java.lang.String.format(str, objArr);
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            throw new java.lang.IllegalArgumentException(str2);
        }
        throw new java.lang.IllegalStateException(str2);
    }

    public static p101l7.e d(java.lang.String str) {
        if (str != null) {
            return str.startsWith("<") ? g(str) : e(str);
        }
        a(9);
        throw null;
    }

    public static p101l7.e e(java.lang.String str) {
        if (str != null) {
            return new p101l7.e(str, false);
        }
        a(5);
        throw null;
    }

    public static boolean f(java.lang.String str) {
        if (str == null) {
            a(6);
            throw null;
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i3 = 0; i3 < str.length(); i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '.' || cCharAt == '/' || cCharAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static p101l7.e g(java.lang.String str) {
        if (str == null) {
            a(8);
            throw null;
        }
        if (str.startsWith("<")) {
            return new p101l7.e(str, true);
        }
        throw new java.lang.IllegalArgumentException("special name must start with '<': ".concat(str));
    }

    public final java.lang.String b() {
        java.lang.String str = this.f24836h;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public final java.lang.String c() {
        if (this.f24837i) {
            throw new java.lang.IllegalStateException("not identifier: " + this);
        }
        java.lang.String strB = b();
        if (strB != null) {
            return strB;
        }
        a(2);
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        return this.f24836h.compareTo(((p101l7.e) obj).f24836h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p101l7.e)) {
            return false;
        }
        p101l7.e eVar = (p101l7.e) obj;
        return this.f24837i == eVar.f24837i && this.f24836h.equals(eVar.f24836h);
    }

    public final int hashCode() {
        return (this.f24836h.hashCode() * 31) + (this.f24837i ? 1 : 0);
    }

    public final java.lang.String toString() {
        return this.f24836h;
    }
}

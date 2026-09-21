package w8;

/* JADX INFO: loaded from: classes4.dex */
public final class o {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f30583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f30584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f30585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f30586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f30588f;
    public final java.lang.String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f30589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f30590i;

    public o(java.lang.String scheme, java.lang.String str, java.lang.String str2, java.lang.String host, int i3, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.m.e(scheme, "scheme");
        kotlin.jvm.internal.m.e(host, "host");
        this.f30583a = scheme;
        this.f30584b = str;
        this.f30585c = str2;
        this.f30586d = host;
        this.f30587e = i3;
        this.f30588f = arrayList2;
        this.g = str3;
        this.f30589h = str4;
        this.f30590i = scheme.equals("https");
    }

    public final java.lang.String a() {
        if (this.f30585c.length() == 0) {
            return "";
        }
        int length = this.f30583a.length() + 3;
        java.lang.String str = this.f30589h;
        java.lang.String strSubstring = str.substring(O7.q.K0(str, ':', length, 4) + 1, O7.q.K0(str, '@', 0, 6));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String b() {
        int length = this.f30583a.length() + 3;
        java.lang.String str = this.f30589h;
        int iK0 = O7.q.K0(str, '/', length, 4);
        java.lang.String strSubstring = str.substring(iK0, x8.b.e(iK0, str.length(), str, "?#"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.util.ArrayList c() {
        int length = this.f30583a.length() + 3;
        java.lang.String str = this.f30589h;
        int iK0 = O7.q.K0(str, '/', length, 4);
        int iE = x8.b.e(iK0, str.length(), str, "?#");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iK0 < iE) {
            int i3 = iK0 + 1;
            int iF = x8.b.f(str, i3, iE, '/');
            java.lang.String strSubstring = str.substring(i3, iF);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iK0 = iF;
        }
        return arrayList;
    }

    public final java.lang.String d() {
        if (this.f30588f == null) {
            return null;
        }
        java.lang.String str = this.f30589h;
        int iK0 = O7.q.K0(str, '?', 0, 6) + 1;
        java.lang.String strSubstring = str.substring(iK0, x8.b.f(str, iK0, str.length(), '#'));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final java.lang.String e() {
        if (this.f30584b.length() == 0) {
            return "";
        }
        int length = this.f30583a.length() + 3;
        java.lang.String str = this.f30589h;
        java.lang.String strSubstring = str.substring(length, x8.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof w8.o) && kotlin.jvm.internal.m.a(((w8.o) obj).f30589h, this.f30589h);
    }

    public final java.lang.String f() {
        w8.n nVar;
        try {
            nVar = new w8.n();
            nVar.c(this, "/...");
        } catch (java.lang.IllegalArgumentException unused) {
            nVar = null;
        }
        kotlin.jvm.internal.m.b(nVar);
        nVar.f30577b = w8.C3022b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        nVar.f30578c = w8.C3022b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return nVar.a().f30589h;
    }

    public final java.net.URI g() {
        java.lang.String strSubstring;
        java.lang.String strReplaceAll;
        w8.n nVar = new w8.n();
        java.lang.String scheme = this.f30583a;
        nVar.f30576a = scheme;
        nVar.f30577b = e();
        nVar.f30578c = a();
        nVar.f30579d = this.f30586d;
        kotlin.jvm.internal.m.e(scheme, "scheme");
        int i3 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i9 = this.f30587e;
        nVar.f30580e = i9 != i3 ? i9 : -1;
        java.util.ArrayList arrayList = nVar.f30581f;
        arrayList.clear();
        arrayList.addAll(c());
        java.lang.String strD = d();
        nVar.g = strD != null ? w8.C3022b.f(w8.C3022b.b(0, 0, 211, strD, " \"'<>#")) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            java.lang.String str = this.f30589h;
            strSubstring = str.substring(O7.q.K0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f30582h = strSubstring;
        java.lang.String str2 = nVar.f30579d;
        if (str2 != null) {
            java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        nVar.f30579d = strReplaceAll;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, w8.C3022b.b(0, 0, 227, (java.lang.String) arrayList.get(i10), "[]"));
        }
        java.util.ArrayList arrayList2 = nVar.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                java.lang.String str3 = (java.lang.String) arrayList2.get(i11);
                arrayList2.set(i11, str3 != null ? w8.C3022b.b(0, 0, 195, str3, "\\^`{|}") : null);
            }
        }
        java.lang.String str4 = nVar.f30582h;
        nVar.f30582h = str4 != null ? w8.C3022b.b(0, 0, 163, str4, " \"#<>\\^`{|}") : null;
        java.lang.String string = nVar.toString();
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e6) {
            try {
                java.util.regex.Pattern patternCompile2 = java.util.regex.Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
                java.lang.String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.m.d(strReplaceAll2, "replaceAll(...)");
                java.net.URI uriCreate = java.net.URI.create(strReplaceAll2);
                kotlin.jvm.internal.m.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f30589h.hashCode();
    }

    public final java.lang.String toString() {
        return this.f30589h;
    }
}

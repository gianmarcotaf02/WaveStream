package w8;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.regex.Pattern;

public final class o {
    public static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public final String f30583a;

    public final String f30584b;

    public final String f30585c;

    public final String f30586d;

    public final int f30587e;

    public final ArrayList f30588f;
    public final String g;

    public final String f30589h;

    public final boolean f30590i;

    public o(String scheme, String str, String str2, String host, int i3, ArrayList arrayList, ArrayList arrayList2, String str3, String str4) {
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

    public final String a() {
        if (this.f30585c.length() == 0) {
            return "";
        }
        int length = this.f30583a.length() + 3;
        String str = this.f30589h;
        String strSubstring = str.substring(O7.q.K0(str, ':', length, 4) + 1, O7.q.K0(str, '@', 0, 6));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.f30583a.length() + 3;
        String str = this.f30589h;
        int iK0 = O7.q.K0(str, '/', length, 4);
        String strSubstring = str.substring(iK0, x8.b.e(iK0, str.length(), str, "?#"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.f30583a.length() + 3;
        String str = this.f30589h;
        int iK0 = O7.q.K0(str, '/', length, 4);
        int iE = x8.b.e(iK0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iK0 < iE) {
            int i3 = iK0 + 1;
            int iF = x8.b.f(str, i3, iE, '/');
            String strSubstring = str.substring(i3, iF);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iK0 = iF;
        }
        return arrayList;
    }

    public final String d() {
        if (this.f30588f == null) {
            return null;
        }
        String str = this.f30589h;
        int iK0 = O7.q.K0(str, '?', 0, 6) + 1;
        String strSubstring = str.substring(iK0, x8.b.f(str, iK0, str.length(), '#'));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.f30584b.length() == 0) {
            return "";
        }
        int length = this.f30583a.length() + 3;
        String str = this.f30589h;
        String strSubstring = str.substring(length, x8.b.e(length, str.length(), str, ":@"));
        kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o) && kotlin.jvm.internal.m.a(((o) obj).f30589h, this.f30589h);
    }

    public final String f() {
        n nVar;
        try {
            nVar = new n();
            nVar.c(this, "/...");
        } catch (IllegalArgumentException unused) {
            nVar = null;
        }
        kotlin.jvm.internal.m.b(nVar);
        nVar.f30577b = C3022b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        nVar.f30578c = C3022b.b(0, 0, 251, "", " \"':;<=>@[]^`{}|/\\?#");
        return nVar.a().f30589h;
    }

    public final URI g() {
        String strSubstring;
        String strReplaceAll;
        n nVar = new n();
        String scheme = this.f30583a;
        nVar.f30576a = scheme;
        nVar.f30577b = e();
        nVar.f30578c = a();
        nVar.f30579d = this.f30586d;
        kotlin.jvm.internal.m.e(scheme, "scheme");
        int i3 = scheme.equals("http") ? 80 : scheme.equals("https") ? 443 : -1;
        int i9 = this.f30587e;
        nVar.f30580e = i9 != i3 ? i9 : -1;
        ArrayList arrayList = nVar.f30581f;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        nVar.g = strD != null ? C3022b.f(C3022b.b(0, 0, 211, strD, " \"'<>#")) : null;
        if (this.g == null) {
            strSubstring = null;
        } else {
            String str = this.f30589h;
            strSubstring = str.substring(O7.q.K0(str, '#', 0, 6) + 1);
            kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        nVar.f30582h = strSubstring;
        String str2 = nVar.f30579d;
        if (str2 != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str2).replaceAll("");
            kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        nVar.f30579d = strReplaceAll;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.set(i10, C3022b.b(0, 0, 227, (String) arrayList.get(i10), "[]"));
        }
        ArrayList arrayList2 = nVar.g;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str3 = (String) arrayList2.get(i11);
                arrayList2.set(i11, str3 != null ? C3022b.b(0, 0, 195, str3, "\\^`{|}") : null);
            }
        }
        String str4 = nVar.f30582h;
        nVar.f30582h = str4 != null ? C3022b.b(0, 0, 163, str4, " \"#<>\\^`{|}") : null;
        String string = nVar.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e6) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                kotlin.jvm.internal.m.d(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                kotlin.jvm.internal.m.d(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                kotlin.jvm.internal.m.d(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final int hashCode() {
        return this.f30589h.hashCode();
    }

    public final String toString() {
        return this.f30589h;
    }
}

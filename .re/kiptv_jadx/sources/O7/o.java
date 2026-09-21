package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements java.io.Serializable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.regex.Pattern f8060h;

    public o(java.lang.String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f8060h = patternCompile;
    }

    public static N7.l b(O7.o oVar, java.lang.String input) {
        oVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        if (input.length() >= 0) {
            return new N7.l(new C5.C0119j(oVar, input, 24), O7.n.f8059h, 0);
        }
        java.lang.StringBuilder sbT = p121o0.p.t(0, "Start index out of bounds: ", ", input length: ");
        sbT.append(input.length());
        throw new java.lang.IndexOutOfBoundsException(sbT.toString());
    }

    public final O7.m a(java.lang.String input) {
        kotlin.jvm.internal.m.e(input, "input");
        java.util.regex.Matcher matcher = this.f8060h.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        return p199y3.e.g(matcher, 0, input);
    }

    public final O7.m c(java.lang.CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        java.util.regex.Matcher matcher = this.f8060h.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new O7.m(matcher, input);
        }
        return null;
    }

    public final boolean d(java.lang.CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        return this.f8060h.matcher(input).matches();
    }

    public final java.lang.String e(java.lang.String input, java.lang.String replacement) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(replacement, "replacement");
        java.lang.String strReplaceAll = this.f8060h.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final java.lang.String f(java.lang.String input, p194x6.j transform) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(transform, "transform");
        O7.m mVarA = a(input);
        if (mVarA == null) {
            return input.toString();
        }
        int length = input.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
        int i3 = 0;
        do {
            sb.append((java.lang.CharSequence) input, i3, mVarA.b().f2458h);
            sb.append((java.lang.CharSequence) transform.invoke(mVarA));
            i3 = mVarA.b().f2459i + 1;
            mVarA = mVarA.c();
            if (i3 >= length) {
                break;
            }
        } while (mVarA != null);
        if (i3 < length) {
            sb.append((java.lang.CharSequence) input, i3, length);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final java.util.List g(java.lang.String input) {
        kotlin.jvm.internal.m.e(input, "input");
        int iEnd = 0;
        O7.q.Y0(0);
        java.util.regex.Matcher matcher = this.f8060h.matcher(input);
        if (!matcher.find()) {
            return com.google.common.util.concurrent.P.i0(input.toString());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.String string = this.f8060h.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public o(java.lang.String pattern, int i3) {
        O7.p[] pVarArr = O7.p.f8061h;
        kotlin.jvm.internal.m.e(pattern, "pattern");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(pattern, 66);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f8060h = patternCompile;
    }
}

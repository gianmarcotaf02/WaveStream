package O7;

import C5.C0119j;
import com.google.common.util.concurrent.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class o implements Serializable {

    public final Pattern f8060h;

    public o(String pattern) {
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f8060h = patternCompile;
    }

    public static N7.l b(o oVar, String input) {
        oVar.getClass();
        kotlin.jvm.internal.m.e(input, "input");
        if (input.length() >= 0) {
            return new N7.l(new C0119j(oVar, input, 24), n.f8059h, 0);
        }
        StringBuilder sbT = p121o0.p.t(0, "Start index out of bounds: ", ", input length: ");
        sbT.append(input.length());
        throw new IndexOutOfBoundsException(sbT.toString());
    }

    public final m a(String input) {
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = this.f8060h.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        return p199y3.e.g(matcher, 0, input);
    }

    public final m c(CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        Matcher matcher = this.f8060h.matcher(input);
        kotlin.jvm.internal.m.d(matcher, "matcher(...)");
        if (matcher.matches()) {
            return new m(matcher, input);
        }
        return null;
    }

    public final boolean d(CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        return this.f8060h.matcher(input).matches();
    }

    public final String e(String input, String replacement) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(replacement, "replacement");
        String strReplaceAll = this.f8060h.matcher(input).replaceAll(replacement);
        kotlin.jvm.internal.m.d(strReplaceAll, "replaceAll(...)");
        return strReplaceAll;
    }

    public final String f(String input, p194x6.j transform) {
        kotlin.jvm.internal.m.e(input, "input");
        kotlin.jvm.internal.m.e(transform, "transform");
        m mVarA = a(input);
        if (mVarA == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb = new StringBuilder(length);
        int i3 = 0;
        do {
            sb.append((CharSequence) input, i3, mVarA.b().f2458h);
            sb.append((CharSequence) transform.invoke(mVarA));
            i3 = mVarA.b().f2459i + 1;
            mVarA = mVarA.c();
            if (i3 >= length) {
                break;
            }
        } while (mVarA != null);
        if (i3 < length) {
            sb.append((CharSequence) input, i3, length);
        }
        String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public final List g(String input) {
        kotlin.jvm.internal.m.e(input, "input");
        int iEnd = 0;
        q.Y0(0);
        Matcher matcher = this.f8060h.matcher(input);
        if (!matcher.find()) {
            return P.i0(input.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        do {
            arrayList.add(input.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(input.subSequence(iEnd, input.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f8060h.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return string;
    }

    public o(String pattern, int i3) {
        p[] pVarArr = p.f8061h;
        kotlin.jvm.internal.m.e(pattern, "pattern");
        Pattern patternCompile = Pattern.compile(pattern, 66);
        kotlin.jvm.internal.m.d(patternCompile, "compile(...)");
        this.f8060h = patternCompile;
    }
}

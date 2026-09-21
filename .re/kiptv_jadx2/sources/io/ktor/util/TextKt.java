package io.ktor.util;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import p070h6.k;

@Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aE\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0005*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\u0002\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0002\u001a\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"", "escapeHTML", "(Ljava/lang/String;)Ljava/lang/String;", "separator", "Lkotlin/Function0;", "Lh6/k;", "onMissingDelimiter", "chomp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Lh6/k;", "toLowerCasePreservingASCIIRules", "toUpperCasePreservingASCIIRules", "", "ch", "toLowerCasePreservingASCII", "(C)C", "toUpperCasePreservingASCII", "Lio/ktor/util/CaseInsensitiveString;", "caseInsensitive", "(Ljava/lang/String;)Lio/ktor/util/CaseInsensitiveString;", "ktor-utils"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TextKt {
    public static final CaseInsensitiveString caseInsensitive(String str) {
        m.e(str, "<this>");
        return new CaseInsensitiveString(str);
    }

    public static final k chomp(String str, String separator, Function0 onMissingDelimiter) {
        m.e(str, "<this>");
        m.e(separator, "separator");
        m.e(onMissingDelimiter, "onMissingDelimiter");
        int iL0 = q.L0(str, separator, 0, false, 6);
        if (iL0 == -1) {
            return (k) onMissingDelimiter.invoke();
        }
        String strSubstring = str.substring(0, iL0);
        m.d(strSubstring, "substring(...)");
        String strSubstring2 = str.substring(separator.length() + iL0);
        m.d(strSubstring2, "substring(...)");
        return new k(strSubstring, strSubstring2);
    }

    public static final String escapeHTML(String str) {
        m.e(str, "<this>");
        if (str.length() == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\"') {
                sb.append("&quot;");
            } else if (cCharAt == '<') {
                sb.append("&lt;");
            } else if (cCharAt == '>') {
                sb.append("&gt;");
            } else if (cCharAt == '&') {
                sb.append("&amp;");
            } else if (cCharAt != '\'') {
                sb.append(cCharAt);
            } else {
                sb.append("&#x27;");
            }
        }
        return sb.toString();
    }

    private static final char toLowerCasePreservingASCII(char c9) {
        if ('A' > c9 || c9 >= '[') {
            return (c9 < 0 || c9 >= 128) ? Character.toLowerCase(c9) : c9;
        }
        return (char) (c9 + ' ');
    }

    public static final String toLowerCasePreservingASCIIRules(String str) {
        m.e(str, "<this>");
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            char cCharAt = str.charAt(i3);
            if (toLowerCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i3);
        int iH0 = q.H0(str);
        if (i3 <= iH0) {
            while (true) {
                sb.append(toLowerCasePreservingASCII(str.charAt(i3)));
                if (i3 == iH0) {
                    break;
                }
                i3++;
            }
        }
        return sb.toString();
    }

    private static final char toUpperCasePreservingASCII(char c9) {
        if ('a' > c9 || c9 >= '{') {
            return (c9 < 0 || c9 >= 128) ? Character.toLowerCase(c9) : c9;
        }
        return (char) (c9 - ' ');
    }

    public static final String toUpperCasePreservingASCIIRules(String str) {
        m.e(str, "<this>");
        int length = str.length();
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            char cCharAt = str.charAt(i3);
            if (toUpperCasePreservingASCII(cCharAt) != cCharAt) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append((CharSequence) str, 0, i3);
        int iH0 = q.H0(str);
        if (i3 <= iH0) {
            while (true) {
                sb.append(toUpperCasePreservingASCII(str.charAt(i3)));
                if (i3 == iH0) {
                    break;
                }
                i3++;
            }
        }
        return sb.toString();
    }
}

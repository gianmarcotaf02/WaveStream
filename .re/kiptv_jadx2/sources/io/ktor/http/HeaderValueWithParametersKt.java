package io.ktor.http;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.StringValuesBuilder;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import p078i6.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a \u0010\r\u001a\u00020\u0005*\u00020\u00012\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0082\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u000f*\u00020\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0001*\u00020\u0001¢\u0006\u0004\b\u0013\u0010\t\u001a\u001f\u0010\u0014\u001a\u00020\u0005*\u00020\u00012\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/ktor/util/StringValuesBuilder;", "", "name", "Lio/ktor/http/HeaderValueWithParameters;", "value", "Lh6/A;", "append", "(Lio/ktor/util/StringValuesBuilder;Ljava/lang/String;Lio/ktor/http/HeaderValueWithParameters;)V", "escapeIfNeeded", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "escapeIfNeededTo", "(Ljava/lang/String;Ljava/lang/StringBuilder;)V", "", "needQuotes", "(Ljava/lang/String;)Z", "isQuoted", "quote", "quoteTo", "", "", "HeaderFieldValueSeparators", "Ljava/util/Set;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HeaderValueWithParametersKt {
    private static final Set<Character> HeaderFieldValueSeparators = m.F0(new Character[]{'(', ')', '<', '>', '@', ',', ';', ':', '\\', '\"', '/', '[', ']', '?', '=', '{', '}', ' ', '\t', '\n', '\r'});

    public static final void append(StringValuesBuilder stringValuesBuilder, String name, HeaderValueWithParameters value) {
        kotlin.jvm.internal.m.e(stringValuesBuilder, "<this>");
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        stringValuesBuilder.append(name, value.toString());
    }

    public static final String escapeIfNeeded(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        return needQuotes(str) ? quote(str) : str;
    }

    private static final void escapeIfNeededTo(String str, StringBuilder sb) {
        if (needQuotes(str)) {
            sb.append(quote(str));
        } else {
            sb.append(str);
        }
    }

    private static final boolean isQuoted(String str) {
        if (str.length() >= 2) {
            if (str.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (str.charAt(0) == '\"' && q.O0(str) == '\"') {
                int i3 = 1;
                do {
                    int iK0 = q.K0(str, '\"', i3, 4);
                    if (iK0 == q.H0(str)) {
                        break;
                    }
                    int i9 = 0;
                    for (int i10 = iK0 - 1; str.charAt(i10) == '\\'; i10--) {
                        i9++;
                    }
                    if (i9 % 2 != 0) {
                        i3 = iK0 + 1;
                    }
                } while (i3 < str.length());
                return true;
            }
        }
        return false;
    }

    public static final boolean needQuotes(String str) {
        if (str.length() == 0) {
            return true;
        }
        if (isQuoted(str)) {
            return false;
        }
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (HeaderFieldValueSeparators.contains(Character.valueOf(str.charAt(i3)))) {
                return true;
            }
        }
        return false;
    }

    public static final String quote(String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        StringBuilder sb = new StringBuilder();
        quoteTo(str, sb);
        return sb.toString();
    }

    private static final void quoteTo(String str, StringBuilder sb) {
        sb.append("\"");
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\t') {
                sb.append("\\t");
            } else if (cCharAt == '\n') {
                sb.append("\\n");
            } else if (cCharAt == '\r') {
                sb.append("\\r");
            } else if (cCharAt == '\"') {
                sb.append("\\\"");
            } else if (cCharAt != '\\') {
                sb.append(cCharAt);
            } else {
                sb.append("\\\\");
            }
        }
        sb.append("\"");
    }
}

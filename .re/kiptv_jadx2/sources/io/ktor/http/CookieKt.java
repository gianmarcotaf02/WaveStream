package io.ktor.http;

import A5.f;
import O7.j;
import O7.l;
import O7.o;
import O7.q;
import O7.r;
import O7.x;
import R8.i;
import androidx.media3.container.NalUnitUtil;
import io.ktor.util.Base64Kt;
import io.ktor.util.TextKt;
import io.ktor.util.date.GMTDate;
import io.sentry.rrweb.RRWebVideoEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import p070h6.k;
import p078i6.C;
import p078i6.D;
import p078i6.m;
import p121o0.p;

@Metadata(d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u008d\u0001\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001e\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020#H\u0002¢\u0006\u0004\b$\u0010%\u001a*\u0010'\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082\b¢\u0006\u0004\b'\u0010(\u001a\"\u0010)\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&H\u0082\b¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b+\u0010,\u001a\"\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0082\b¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020\u0012*\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103¨\u00068"}, d2 = {"", "cookiesHeader", "Lio/ktor/http/Cookie;", "parseServerSetCookieHeader", "(Ljava/lang/String;)Lio/ktor/http/Cookie;", "", "skipEscaped", "", "parseClientCookiesHeader", "(Ljava/lang/String;Z)Ljava/util/Map;", "cookie", "renderSetCookieHeader", "(Lio/ktor/http/Cookie;)Ljava/lang/String;", "renderCookieHeader", "name", "value", "Lio/ktor/http/CookieEncoding;", RRWebVideoEvent.JsonKeys.ENCODING, "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "secure", "httpOnly", "extensions", "includeEncoding", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Z)Ljava/lang/String;", "encodeCookieValue", "(Ljava/lang/String;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "encodedValue", "decodeCookieValue", "assertCookieName", "(Ljava/lang/String;)Ljava/lang/String;", "", "shouldEscapeInCookies", "(C)Z", "", "cookiePart", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "cookiePartUnencoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "cookiePartFlag", "(Ljava/lang/String;Z)Ljava/lang/String;", "cookiePartExt", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toIntClamping", "(Ljava/lang/String;)I", "", "loweredPartNames", "Ljava/util/Set;", "LO7/o;", "clientCookieHeaderPattern", "LO7/o;", "cookieCharsShouldBeEscaped", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieKt {
    private static final Set<String> loweredPartNames = m.F0(new String[]{io.ktor.client.utils.CacheControl.MAX_AGE, "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    private static final o clientCookieHeaderPattern = new o("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    private static final Set<Character> cookieCharsShouldBeEscaped = m.F0(new Character[]{';', ',', '\"'});

    @Metadata(k = 3, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CookieEncoding.values().length];
            try {
                iArr[CookieEncoding.RAW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String assertCookieName(String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (shouldEscapeInCookies(str.charAt(i3))) {
                throw new IllegalArgumentException(p.C("Cookie name is not valid: ", str));
            }
        }
        return str;
    }

    private static final String cookiePart(String str, Object obj, CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + '=' + encodeCookieValue(obj.toString(), cookieEncoding);
    }

    private static final String cookiePartExt(String str, String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + encodeCookieValue(str2.toString(), CookieEncoding.RAW);
    }

    private static final String cookiePartFlag(String str, boolean z6) {
        return z6 ? str : "";
    }

    private static final String cookiePartUnencoded(String str, Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    public static final String decodeCookieValue(String encodedValue, CookieEncoding encoding) {
        CharSequence charSequenceSubSequence;
        CharSequence charSequenceSubSequence2;
        kotlin.jvm.internal.m.e(encodedValue, "encodedValue");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        int i3 = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                return Base64Kt.decodeBase64String(encodedValue);
            }
            if (i3 == 4) {
                return CodecsKt.decodeURLQueryComponent$default(encodedValue, 0, 0, true, null, 11, null);
            }
            throw new I3.b();
        }
        int length = encodedValue.length();
        int i9 = 0;
        while (true) {
            charSequenceSubSequence = "";
            if (i9 >= length) {
                charSequenceSubSequence2 = "";
                break;
            }
            if (!i.w(encodedValue.charAt(i9))) {
                charSequenceSubSequence2 = encodedValue.subSequence(i9, encodedValue.length());
                break;
            }
            i9++;
        }
        if (x.x0(charSequenceSubSequence2.toString(), "\"", false)) {
            int length2 = encodedValue.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (!i.w(encodedValue.charAt(length2))) {
                        charSequenceSubSequence = encodedValue.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
            if (x.q0(charSequenceSubSequence.toString(), "\"", false)) {
                return q.X0(q.r1(encodedValue).toString());
            }
        }
        return encodedValue;
    }

    public static final String encodeCookieValue(String value, CookieEncoding encoding) {
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        int i3 = WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return Base64Kt.encodeBase64(value);
                }
                if (i3 == 4) {
                    return CodecsKt.encodeURLParameter(value, true);
                }
                throw new I3.b();
            }
            if (q.C0(value, '\"')) {
                throw new IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
            }
            for (int i9 = 0; i9 < value.length(); i9++) {
                if (shouldEscapeInCookies(value.charAt(i9))) {
                    return B2.a.i('\"', "\"", value);
                }
            }
        }
        return value;
    }

    public static final Map<String, String> parseClientCookiesHeader(String cookiesHeader, boolean z6) {
        kotlin.jvm.internal.m.e(cookiesHeader, "cookiesHeader");
        return C.W0(N7.o.p0(N7.o.k0(N7.o.p0(o.b(clientCookieHeaderPattern, cookiesHeader), new io.ktor.client.plugins.sse.c(27)), new f(z6, 21)), new io.ktor.client.plugins.sse.c(28)));
    }

    public static Map parseClientCookiesHeader$default(String str, boolean z6, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        return parseClientCookiesHeader(str, z6);
    }

    public static final k parseClientCookiesHeader$lambda$4(j it) {
        String str;
        String str2;
        kotlin.jvm.internal.m.e(it, "it");
        l lVar = ((O7.m) it).f8057c;
        O7.i iVarE = lVar.e(2);
        String str3 = "";
        if (iVarE == null || (str = iVarE.f8049a) == null) {
            str = "";
        }
        O7.i iVarE2 = lVar.e(4);
        if (iVarE2 != null && (str2 = iVarE2.f8049a) != null) {
            str3 = str2;
        }
        return new k(str, str3);
    }

    public static final boolean parseClientCookiesHeader$lambda$5(boolean z6, k it) {
        kotlin.jvm.internal.m.e(it, "it");
        return (z6 && x.x0((String) it.f22539h, "$", false)) ? false : true;
    }

    public static final k parseClientCookiesHeader$lambda$6(k cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        String str = (String) cookie.f22540i;
        if (!x.x0(str, "\"", false) || !x.q0(str, "\"", false)) {
            return cookie;
        }
        return new k(cookie.f22539h, q.X0(str));
    }

    public static final Cookie parseServerSetCookieHeader(String cookiesHeader) {
        CookieEncoding cookieEncodingValueOf;
        kotlin.jvm.internal.m.e(cookiesHeader, "cookiesHeader");
        Map<String, String> clientCookiesHeader = parseClientCookiesHeader(cookiesHeader, false);
        Iterator<T> it = clientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!x.x0((String) entry.getKey(), "$", false)) {
                String str = clientCookiesHeader.get("$x-enc");
                if (str == null || (cookieEncodingValueOf = CookieEncoding.valueOf(str)) == null) {
                    cookieEncodingValueOf = CookieEncoding.RAW;
                }
                CookieEncoding cookieEncoding = cookieEncodingValueOf;
                LinkedHashMap linkedHashMap = new LinkedHashMap(D.I0(clientCookiesHeader.size()));
                Iterator<T> it2 = clientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it2.next();
                    linkedHashMap.put(TextKt.toLowerCasePreservingASCIIRules((String) entry2.getKey()), entry2.getValue());
                }
                String str2 = (String) entry.getKey();
                String strDecodeCookieValue = decodeCookieValue((String) entry.getValue(), cookieEncoding);
                String str3 = (String) linkedHashMap.get(io.ktor.client.utils.CacheControl.MAX_AGE);
                Integer numValueOf = str3 != null ? Integer.valueOf(toIntClamping(str3)) : null;
                String str4 = (String) linkedHashMap.get("expires");
                GMTDate gMTDateFromCookieToGmtDate = str4 != null ? DateUtilsKt.fromCookieToGmtDate(str4) : null;
                String str5 = (String) linkedHashMap.get("domain");
                String str6 = (String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey("secure");
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, String> entry3 : clientCookiesHeader.entrySet()) {
                    String key = entry3.getKey();
                    if (!loweredPartNames.contains(TextKt.toLowerCasePreservingASCIIRules(key)) && !kotlin.jvm.internal.m.a(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new Cookie(str2, strDecodeCookieValue, cookieEncoding, numValueOf, gMTDateFromCookieToGmtDate, str5, str6, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final String renderCookieHeader(Cookie cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        return cookie.getName() + '=' + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static final String renderSetCookieHeader(Cookie cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    public static String renderSetCookieHeader$default(String str, String str2, CookieEncoding cookieEncoding, Integer num, GMTDate gMTDate, String str3, String str4, boolean z6, boolean z9, Map map, boolean z10, int i3, Object obj) {
        return renderSetCookieHeader(str, str2, (i3 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : gMTDate, (i3 & 32) != 0 ? null : str3, (i3 & 64) == 0 ? str4 : null, (i3 & 128) != 0 ? false : z6, (i3 & 256) == 0 ? z9 : false, (i3 & 512) != 0 ? p078i6.x.f23206h : map, (i3 & 1024) != 0 ? true : z10);
    }

    private static final boolean shouldEscapeInCookies(char c9) {
        return i.w(c9) || kotlin.jvm.internal.m.f(c9, 32) < 0 || cookieCharsShouldBeEscaped.contains(Character.valueOf(c9));
    }

    private static final int toIntClamping(String str) {
        return (int) r.t(Long.parseLong(str), 0L, 2147483647L);
    }

    public static final String renderSetCookieHeader(String name, String value, CookieEncoding encoding, Integer num, GMTDate gMTDate, String str, String str2, boolean z6, boolean z9, Map<String, String> extensions, boolean z10) {
        String str3;
        String str4;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        kotlin.jvm.internal.m.e(extensions, "extensions");
        String str5 = assertCookieName(name) + '=' + encodeCookieValue(value.toString(), encoding);
        String str6 = "";
        String str7 = num != null ? "Max-Age=" + num : "";
        String httpDate = gMTDate != null ? DateUtilsKt.toHttpDate(gMTDate) : null;
        String str8 = httpDate == null ? "" : "Expires=" + ((Object) httpDate);
        CookieEncoding cookieEncoding = CookieEncoding.RAW;
        String str9 = str == null ? "" : "Domain=" + encodeCookieValue(str.toString(), cookieEncoding);
        String str10 = str2 == null ? "" : "Path=" + encodeCookieValue(str2.toString(), cookieEncoding);
        if (!z6) {
            str3 = "";
        } else {
            str3 = "Secure";
        }
        if (!z9) {
            str4 = "";
        } else {
            str4 = "HttpOnly";
        }
        List listB0 = p078i6.p.B0(str5, str7, str8, str9, str10, str3, str4);
        ArrayList arrayList = new ArrayList(extensions.size());
        for (Map.Entry<String, String> entry : extensions.entrySet()) {
            String strAssertCookieName = assertCookieName(entry.getKey());
            String value2 = entry.getValue();
            if (value2 != null) {
                strAssertCookieName = strAssertCookieName + '=' + encodeCookieValue(value2.toString(), CookieEncoding.RAW);
            }
            arrayList.add(strAssertCookieName);
        }
        ArrayList arrayListA1 = p078i6.o.A1(listB0, arrayList);
        if (z10) {
            String strName = encoding.name();
            str6 = strName == null ? "$x-enc" : "$x-enc=" + encodeCookieValue(strName.toString(), CookieEncoding.RAW);
        }
        ArrayList arrayListZ1 = p078i6.o.z1(str6, arrayListA1);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListZ1) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return p078i6.o.o1(arrayList2, "; ", null, null, null, 62);
    }
}

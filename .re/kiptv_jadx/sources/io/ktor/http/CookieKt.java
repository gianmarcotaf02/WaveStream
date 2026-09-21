package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\f\u001a\u008d\u0001\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\u001c\u001a\u001d\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b \u0010\u001e\u001a\u0013\u0010!\u001a\u00020\u0000*\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010$\u001a\u00020\u0005*\u00020#H\u0002¢\u0006\u0004\b$\u0010%\u001a*\u0010'\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082\b¢\u0006\u0004\b'\u0010(\u001a\"\u0010)\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010&H\u0082\b¢\u0006\u0004\b)\u0010*\u001a \u0010+\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0082\b¢\u0006\u0004\b+\u0010,\u001a\"\u0010-\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u0082\b¢\u0006\u0004\b-\u0010.\u001a\u0013\u0010/\u001a\u00020\u0012*\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0000018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103\"\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106\"\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020#018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00103¨\u00068"}, d2 = {"", "cookiesHeader", "Lio/ktor/http/Cookie;", "parseServerSetCookieHeader", "(Ljava/lang/String;)Lio/ktor/http/Cookie;", "", "skipEscaped", "", "parseClientCookiesHeader", "(Ljava/lang/String;Z)Ljava/util/Map;", "cookie", "renderSetCookieHeader", "(Lio/ktor/http/Cookie;)Ljava/lang/String;", "renderCookieHeader", "name", "value", "Lio/ktor/http/CookieEncoding;", io.sentry.rrweb.RRWebVideoEvent.JsonKeys.ENCODING, "", "maxAge", "Lio/ktor/util/date/GMTDate;", "expires", "domain", "path", "secure", "httpOnly", "extensions", "includeEncoding", "(Ljava/lang/String;Ljava/lang/String;Lio/ktor/http/CookieEncoding;Ljava/lang/Integer;Lio/ktor/util/date/GMTDate;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/Map;Z)Ljava/lang/String;", "encodeCookieValue", "(Ljava/lang/String;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "encodedValue", "decodeCookieValue", "assertCookieName", "(Ljava/lang/String;)Ljava/lang/String;", "", "shouldEscapeInCookies", "(C)Z", "", "cookiePart", "(Ljava/lang/String;Ljava/lang/Object;Lio/ktor/http/CookieEncoding;)Ljava/lang/String;", "cookiePartUnencoded", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;", "cookiePartFlag", "(Ljava/lang/String;Z)Ljava/lang/String;", "cookiePartExt", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "toIntClamping", "(Ljava/lang/String;)I", "", "loweredPartNames", "Ljava/util/Set;", "LO7/o;", "clientCookieHeaderPattern", "LO7/o;", "cookieCharsShouldBeEscaped", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class CookieKt {
    private static final java.util.Set<java.lang.String> loweredPartNames = p078i6.m.F0(new java.lang.String[]{io.ktor.client.utils.CacheControl.MAX_AGE, "expires", "domain", "path", "secure", "httponly", "$x-enc"});
    private static final O7.o clientCookieHeaderPattern = new O7.o("(^|;)\\s*([^;=\\{\\}\\s]+)\\s*(=\\s*(\"[^\"]*\"|[^;]*))?");
    private static final java.util.Set<java.lang.Character> cookieCharsShouldBeEscaped = p078i6.m.F0(new java.lang.Character[]{';', ',', '\"'});

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[io.ktor.http.CookieEncoding.values().length];
            try {
                iArr[io.ktor.http.CookieEncoding.RAW.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.DQUOTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.BASE64_ENCODING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[io.ktor.http.CookieEncoding.URI_ENCODING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final java.lang.String assertCookieName(java.lang.String str) {
        for (int i3 = 0; i3 < str.length(); i3++) {
            if (shouldEscapeInCookies(str.charAt(i3))) {
                throw new java.lang.IllegalArgumentException(p121o0.p.C("Cookie name is not valid: ", str));
            }
        }
        return str;
    }

    private static final java.lang.String cookiePart(java.lang.String str, java.lang.Object obj, io.ktor.http.CookieEncoding cookieEncoding) {
        if (obj == null) {
            return "";
        }
        return str + '=' + encodeCookieValue(obj.toString(), cookieEncoding);
    }

    private static final java.lang.String cookiePartExt(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return str;
        }
        return str + '=' + encodeCookieValue(str2.toString(), io.ktor.http.CookieEncoding.RAW);
    }

    private static final java.lang.String cookiePartFlag(java.lang.String str, boolean z6) {
        return z6 ? str : "";
    }

    private static final java.lang.String cookiePartUnencoded(java.lang.String str, java.lang.Object obj) {
        if (obj == null) {
            return "";
        }
        return str + '=' + obj;
    }

    public static final java.lang.String decodeCookieValue(java.lang.String encodedValue, io.ktor.http.CookieEncoding encoding) {
        java.lang.CharSequence charSequenceSubSequence;
        java.lang.CharSequence charSequenceSubSequence2;
        kotlin.jvm.internal.m.e(encodedValue, "encodedValue");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        int i3 = io.ktor.http.CookieKt.WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i3 != 1 && i3 != 2) {
            if (i3 == 3) {
                return io.ktor.util.Base64Kt.decodeBase64String(encodedValue);
            }
            if (i3 == 4) {
                return io.ktor.http.CodecsKt.decodeURLQueryComponent$default(encodedValue, 0, 0, true, null, 11, null);
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
            if (!R8.i.w(encodedValue.charAt(i9))) {
                charSequenceSubSequence2 = encodedValue.subSequence(i9, encodedValue.length());
                break;
            }
            i9++;
        }
        if (O7.x.x0(charSequenceSubSequence2.toString(), "\"", false)) {
            int length2 = encodedValue.length() - 1;
            if (length2 >= 0) {
                while (true) {
                    int i10 = length2 - 1;
                    if (!R8.i.w(encodedValue.charAt(length2))) {
                        charSequenceSubSequence = encodedValue.subSequence(0, length2 + 1);
                        break;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length2 = i10;
                }
            }
            if (O7.x.q0(charSequenceSubSequence.toString(), "\"", false)) {
                return O7.q.X0(O7.q.r1(encodedValue).toString());
            }
        }
        return encodedValue;
    }

    public static final java.lang.String encodeCookieValue(java.lang.String value, io.ktor.http.CookieEncoding encoding) {
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        int i3 = io.ktor.http.CookieKt.WhenMappings.$EnumSwitchMapping$0[encoding.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return io.ktor.util.Base64Kt.encodeBase64(value);
                }
                if (i3 == 4) {
                    return io.ktor.http.CodecsKt.encodeURLParameter(value, true);
                }
                throw new I3.b();
            }
            if (O7.q.C0(value, '\"')) {
                throw new java.lang.IllegalArgumentException("The cookie value contains characters that cannot be encoded in DQUOTES format. Consider URL_ENCODING mode");
            }
            for (int i9 = 0; i9 < value.length(); i9++) {
                if (shouldEscapeInCookies(value.charAt(i9))) {
                    return B2.a.i('\"', "\"", value);
                }
            }
        }
        return value;
    }

    public static final java.util.Map<java.lang.String, java.lang.String> parseClientCookiesHeader(java.lang.String cookiesHeader, boolean z6) {
        kotlin.jvm.internal.m.e(cookiesHeader, "cookiesHeader");
        return p078i6.C.W0(N7.o.p0(N7.o.k0(N7.o.p0(O7.o.b(clientCookieHeaderPattern, cookiesHeader), new io.ktor.client.plugins.sse.c(27)), new A5.f(z6, 21)), new io.ktor.client.plugins.sse.c(28)));
    }

    public static /* synthetic */ java.util.Map parseClientCookiesHeader$default(java.lang.String str, boolean z6, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            z6 = true;
        }
        return parseClientCookiesHeader(str, z6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.k parseClientCookiesHeader$lambda$4(O7.j it) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.m.e(it, "it");
        O7.l lVar = ((O7.m) it).f8057c;
        O7.i iVarE = lVar.e(2);
        java.lang.String str3 = "";
        if (iVarE == null || (str = iVarE.f8049a) == null) {
            str = "";
        }
        O7.i iVarE2 = lVar.e(4);
        if (iVarE2 != null && (str2 = iVarE2.f8049a) != null) {
            str3 = str2;
        }
        return new p070h6.k(str, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean parseClientCookiesHeader$lambda$5(boolean z6, p070h6.k it) {
        kotlin.jvm.internal.m.e(it, "it");
        return (z6 && O7.x.x0((java.lang.String) it.f22539h, "$", false)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.k parseClientCookiesHeader$lambda$6(p070h6.k cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        java.lang.String str = (java.lang.String) cookie.f22540i;
        if (!O7.x.x0(str, "\"", false) || !O7.x.q0(str, "\"", false)) {
            return cookie;
        }
        return new p070h6.k(cookie.f22539h, O7.q.X0(str));
    }

    public static final io.ktor.http.Cookie parseServerSetCookieHeader(java.lang.String cookiesHeader) {
        io.ktor.http.CookieEncoding cookieEncodingValueOf;
        kotlin.jvm.internal.m.e(cookiesHeader, "cookiesHeader");
        java.util.Map<java.lang.String, java.lang.String> clientCookiesHeader = parseClientCookiesHeader(cookiesHeader, false);
        java.util.Iterator<T> it = clientCookiesHeader.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (!O7.x.x0((java.lang.String) entry.getKey(), "$", false)) {
                java.lang.String str = clientCookiesHeader.get("$x-enc");
                if (str == null || (cookieEncodingValueOf = io.ktor.http.CookieEncoding.valueOf(str)) == null) {
                    cookieEncodingValueOf = io.ktor.http.CookieEncoding.RAW;
                }
                io.ktor.http.CookieEncoding cookieEncoding = cookieEncodingValueOf;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(clientCookiesHeader.size()));
                java.util.Iterator<T> it2 = clientCookiesHeader.entrySet().iterator();
                while (it2.hasNext()) {
                    java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                    linkedHashMap.put(io.ktor.util.TextKt.toLowerCasePreservingASCIIRules((java.lang.String) entry2.getKey()), entry2.getValue());
                }
                java.lang.String str2 = (java.lang.String) entry.getKey();
                java.lang.String strDecodeCookieValue = decodeCookieValue((java.lang.String) entry.getValue(), cookieEncoding);
                java.lang.String str3 = (java.lang.String) linkedHashMap.get(io.ktor.client.utils.CacheControl.MAX_AGE);
                java.lang.Integer numValueOf = str3 != null ? java.lang.Integer.valueOf(toIntClamping(str3)) : null;
                java.lang.String str4 = (java.lang.String) linkedHashMap.get("expires");
                io.ktor.util.date.GMTDate gMTDateFromCookieToGmtDate = str4 != null ? io.ktor.http.DateUtilsKt.fromCookieToGmtDate(str4) : null;
                java.lang.String str5 = (java.lang.String) linkedHashMap.get("domain");
                java.lang.String str6 = (java.lang.String) linkedHashMap.get("path");
                boolean zContainsKey = linkedHashMap.containsKey("secure");
                boolean zContainsKey2 = linkedHashMap.containsKey("httponly");
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry3 : clientCookiesHeader.entrySet()) {
                    java.lang.String key = entry3.getKey();
                    if (!loweredPartNames.contains(io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(key)) && !kotlin.jvm.internal.m.a(key, entry.getKey())) {
                        linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                    }
                }
                return new io.ktor.http.Cookie(str2, strDecodeCookieValue, cookieEncoding, numValueOf, gMTDateFromCookieToGmtDate, str5, str6, zContainsKey, zContainsKey2, linkedHashMap2);
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final java.lang.String renderCookieHeader(io.ktor.http.Cookie cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        return cookie.getName() + '=' + encodeCookieValue(cookie.getValue(), cookie.getEncoding());
    }

    public static final java.lang.String renderSetCookieHeader(io.ktor.http.Cookie cookie) {
        kotlin.jvm.internal.m.e(cookie, "cookie");
        return renderSetCookieHeader$default(cookie.getName(), cookie.getValue(), cookie.getEncoding(), cookie.getMaxAgeInt(), cookie.getExpires(), cookie.getDomain(), cookie.getPath(), cookie.getSecure(), cookie.getHttpOnly(), cookie.getExtensions(), false, 1024, null);
    }

    public static /* synthetic */ java.lang.String renderSetCookieHeader$default(java.lang.String str, java.lang.String str2, io.ktor.http.CookieEncoding cookieEncoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str3, java.lang.String str4, boolean z6, boolean z9, java.util.Map map, boolean z10, int i3, java.lang.Object obj) {
        return renderSetCookieHeader(str, str2, (i3 & 4) != 0 ? io.ktor.http.CookieEncoding.URI_ENCODING : cookieEncoding, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? null : gMTDate, (i3 & 32) != 0 ? null : str3, (i3 & 64) == 0 ? str4 : null, (i3 & 128) != 0 ? false : z6, (i3 & 256) == 0 ? z9 : false, (i3 & 512) != 0 ? p078i6.x.f23206h : map, (i3 & 1024) != 0 ? true : z10);
    }

    private static final boolean shouldEscapeInCookies(char c9) {
        return R8.i.w(c9) || kotlin.jvm.internal.m.f(c9, 32) < 0 || cookieCharsShouldBeEscaped.contains(java.lang.Character.valueOf(c9));
    }

    private static final int toIntClamping(java.lang.String str) {
        return (int) O7.r.t(java.lang.Long.parseLong(str), 0L, 2147483647L);
    }

    public static final java.lang.String renderSetCookieHeader(java.lang.String name, java.lang.String value, io.ktor.http.CookieEncoding encoding, java.lang.Integer num, io.ktor.util.date.GMTDate gMTDate, java.lang.String str, java.lang.String str2, boolean z6, boolean z9, java.util.Map<java.lang.String, java.lang.String> extensions, boolean z10) {
        java.lang.String str3;
        java.lang.String str4;
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        kotlin.jvm.internal.m.e(encoding, "encoding");
        kotlin.jvm.internal.m.e(extensions, "extensions");
        java.lang.String str5 = assertCookieName(name) + '=' + encodeCookieValue(value.toString(), encoding);
        java.lang.String str6 = "";
        java.lang.String str7 = num != null ? "Max-Age=" + num : "";
        java.lang.String httpDate = gMTDate != null ? io.ktor.http.DateUtilsKt.toHttpDate(gMTDate) : null;
        java.lang.String str8 = httpDate == null ? "" : "Expires=" + ((java.lang.Object) httpDate);
        io.ktor.http.CookieEncoding cookieEncoding = io.ktor.http.CookieEncoding.RAW;
        java.lang.String str9 = str == null ? "" : "Domain=" + encodeCookieValue(str.toString(), cookieEncoding);
        java.lang.String str10 = str2 == null ? "" : "Path=" + encodeCookieValue(str2.toString(), cookieEncoding);
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
        java.util.List listB0 = p078i6.p.B0(str5, str7, str8, str9, str10, str3, str4);
        java.util.ArrayList arrayList = new java.util.ArrayList(extensions.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extensions.entrySet()) {
            java.lang.String strAssertCookieName = assertCookieName(entry.getKey());
            java.lang.String value2 = entry.getValue();
            if (value2 != null) {
                strAssertCookieName = strAssertCookieName + '=' + encodeCookieValue(value2.toString(), io.ktor.http.CookieEncoding.RAW);
            }
            arrayList.add(strAssertCookieName);
        }
        java.util.ArrayList arrayListA1 = p078i6.o.A1(listB0, arrayList);
        if (z10) {
            java.lang.String strName = encoding.name();
            str6 = strName == null ? "$x-enc" : "$x-enc=" + encodeCookieValue(strName.toString(), io.ktor.http.CookieEncoding.RAW);
        }
        java.util.ArrayList arrayListZ1 = p078i6.o.z1(str6, arrayListA1);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayListZ1) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return p078i6.o.o1(arrayList2, "; ", null, null, null, 62);
    }
}

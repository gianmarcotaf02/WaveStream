package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\b\u0010\u000b\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\r0\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0011*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a#\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aE\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001c\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u001aj\b\u0012\u0004\u0012\u00020\u0003`\u001b0\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a=\u0010 \u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u001c\u0010\u001f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\u001aj\b\u0012\u0004\u0012\u00020\u000e`\u001b0\u0012H\u0002¢\u0006\u0004\b \u0010!\u001a+\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010$\u001a+\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00000\r2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010$\u001a\u001b\u0010&\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b&\u0010'¨\u0006("}, d2 = {"", "header", "", "Lio/ktor/http/HeaderValue;", "parseAndSortHeader", "(Ljava/lang/String;)Ljava/util/List;", "parseAndSortContentTypeHeader", "text", "parseHeaderValue", "", "parametersOnly", "(Ljava/lang/String;Z)Ljava/util/List;", "", "Lh6/k;", "Lio/ktor/http/HeaderValueParam;", "toHeaderParamsList", "(Ljava/lang/Iterable;)Ljava/util/List;", "T", "Lh6/h;", "valueOrEmpty", "(Lh6/h;)Ljava/util/List;", "", androidx.media3.extractor.text.ttml.TtmlNode.START, androidx.media3.extractor.text.ttml.TtmlNode.END, "subtrim", "(Ljava/lang/String;II)Ljava/lang/String;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "items", "parseHeaderValueItem", "(Ljava/lang/String;ILh6/h;Z)I", "parameters", "parseHeaderValueParameter", "(Ljava/lang/String;ILh6/h;)I", "value", "parseHeaderValueParameterValue", "(Ljava/lang/String;I)Lh6/k;", "parseHeaderValueParameterValueQuoted", "nextIsSemicolonOrEnd", "(Ljava/lang/String;I)Z", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class HttpHeaderValueParserKt {
    private static final boolean nextIsSemicolonOrEnd(java.lang.String str, int i3) {
        int i9 = i3 + 1;
        while (i9 < str.length() && str.charAt(i9) == ' ') {
            i9++;
        }
        return i9 == str.length() || str.charAt(i9) == ';';
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseAndSortContentTypeHeader(java.lang.String str) {
        java.util.List<io.ktor.http.HeaderValue> headerValue = parseHeaderValue(str);
        final java.util.Comparator comparator = new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t10).getQuality()), java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t9).getQuality()));
            }
        };
        final java.util.Comparator comparator2 = new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) throws io.ktor.http.BadContentTypeFormatException {
                int iCompare = comparator.compare(t9, t10);
                if (iCompare != 0) {
                    return iCompare;
                }
                io.ktor.http.ContentType.Companion companion = io.ktor.http.ContentType.INSTANCE;
                io.ktor.http.ContentType contentType = companion.parse(((io.ktor.http.HeaderValue) t9).getValue());
                int i3 = kotlin.jvm.internal.m.a(contentType.getContentType(), "*") ? 2 : 0;
                if (kotlin.jvm.internal.m.a(contentType.getContentSubtype(), "*")) {
                    i3++;
                }
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
                io.ktor.http.ContentType contentType2 = companion.parse(((io.ktor.http.HeaderValue) t10).getValue());
                int i9 = kotlin.jvm.internal.m.a(contentType2.getContentType(), "*") ? 2 : 0;
                if (kotlin.jvm.internal.m.a(contentType2.getContentSubtype(), "*")) {
                    i9++;
                }
                return com.google.crypto.tink.shaded.protobuf.q0.o(numValueOf, java.lang.Integer.valueOf(i9));
            }
        };
        return p078i6.o.I1(headerValue, new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortContentTypeHeader$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                int iCompare = comparator2.compare(t9, t10);
                return iCompare != 0 ? iCompare : com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Integer.valueOf(((io.ktor.http.HeaderValue) t10).getParams().size()), java.lang.Integer.valueOf(((io.ktor.http.HeaderValue) t9).getParams().size()));
            }
        });
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseAndSortHeader(java.lang.String str) {
        return p078i6.o.I1(parseHeaderValue(str), new java.util.Comparator() { // from class: io.ktor.http.HttpHeaderValueParserKt$parseAndSortHeader$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t9, T t10) {
                return com.google.crypto.tink.shaded.protobuf.q0.o(java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t10).getQuality()), java.lang.Double.valueOf(((io.ktor.http.HeaderValue) t9).getQuality()));
            }
        });
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseHeaderValue(java.lang.String str) {
        return parseHeaderValue(str, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList parseHeaderValue$lambda$4() {
        return new java.util.ArrayList();
    }

    private static final int parseHeaderValueItem(java.lang.String str, int i3, p070h6.h hVar, boolean z6) {
        p070h6.h hVarA = com.google.common.util.concurrent.D.A(p070h6.i.j, new io.ktor.http.a(2));
        java.lang.Integer numValueOf = z6 ? java.lang.Integer.valueOf(i3) : null;
        int headerValueParameter = i3;
        while (headerValueParameter <= O7.q.H0(str)) {
            char cCharAt = str.charAt(headerValueParameter);
            if (cCharAt == ',') {
                ((java.util.ArrayList) hVar.getValue()).add(new io.ktor.http.HeaderValue(subtrim(str, i3, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(hVarA)));
                return headerValueParameter + 1;
            }
            if (cCharAt != ';') {
                headerValueParameter = z6 ? parseHeaderValueParameter(str, headerValueParameter, hVarA) : headerValueParameter + 1;
            } else {
                if (numValueOf == null) {
                    numValueOf = java.lang.Integer.valueOf(headerValueParameter);
                }
                headerValueParameter = parseHeaderValueParameter(str, headerValueParameter + 1, hVarA);
            }
        }
        ((java.util.ArrayList) hVar.getValue()).add(new io.ktor.http.HeaderValue(subtrim(str, i3, numValueOf != null ? numValueOf.intValue() : headerValueParameter), valueOrEmpty(hVarA)));
        return headerValueParameter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.ArrayList parseHeaderValueItem$lambda$6() {
        return new java.util.ArrayList();
    }

    private static final int parseHeaderValueParameter(java.lang.String str, int i3, p070h6.h hVar) {
        int i9 = i3;
        while (i9 <= O7.q.H0(str)) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == ',' || cCharAt == ';') {
                parseHeaderValueParameter$addParam(hVar, str, i3, i9, "");
                return i9;
            }
            if (cCharAt == '=') {
                p070h6.k headerValueParameterValue = parseHeaderValueParameterValue(str, i9 + 1);
                int iIntValue = ((java.lang.Number) headerValueParameterValue.f22539h).intValue();
                parseHeaderValueParameter$addParam(hVar, str, i3, i9, (java.lang.String) headerValueParameterValue.f22540i);
                return iIntValue;
            }
            i9++;
        }
        parseHeaderValueParameter$addParam(hVar, str, i3, i9, "");
        return i9;
    }

    private static final void parseHeaderValueParameter$addParam(p070h6.h hVar, java.lang.String str, int i3, int i9, java.lang.String str2) {
        java.lang.String strSubtrim = subtrim(str, i3, i9);
        if (strSubtrim.length() == 0) {
            return;
        }
        ((java.util.ArrayList) hVar.getValue()).add(new io.ktor.http.HeaderValueParam(strSubtrim, str2));
    }

    private static final p070h6.k parseHeaderValueParameterValue(java.lang.String str, int i3) {
        if (str.length() == i3) {
            return new p070h6.k(java.lang.Integer.valueOf(i3), "");
        }
        if (str.charAt(i3) == '\"') {
            return parseHeaderValueParameterValueQuoted(str, i3 + 1);
        }
        int i9 = i3;
        while (i9 <= O7.q.H0(str)) {
            char cCharAt = str.charAt(i9);
            if (cCharAt == ',' || cCharAt == ';') {
                return new p070h6.k(java.lang.Integer.valueOf(i9), subtrim(str, i3, i9));
            }
            i9++;
        }
        return new p070h6.k(java.lang.Integer.valueOf(i9), subtrim(str, i3, i9));
    }

    private static final p070h6.k parseHeaderValueParameterValueQuoted(java.lang.String str, int i3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (i3 <= O7.q.H0(str)) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '\"' && nextIsSemicolonOrEnd(str, i3)) {
                return new p070h6.k(java.lang.Integer.valueOf(i3 + 1), sb.toString());
            }
            if (cCharAt != '\\' || i3 >= O7.q.H0(str) - 2) {
                sb.append(cCharAt);
                i3++;
            } else {
                sb.append(str.charAt(i3 + 1));
                i3 += 2;
            }
        }
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.m.d(string, "toString(...)");
        return new p070h6.k(numValueOf, "\"".concat(string));
    }

    private static final java.lang.String subtrim(java.lang.String str, int i3, int i9) {
        java.lang.String strSubstring = str.substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return O7.q.r1(strSubstring).toString();
    }

    public static final java.util.List<io.ktor.http.HeaderValueParam> toHeaderParamsList(java.lang.Iterable<p070h6.k> iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
        for (p070h6.k kVar : iterable) {
            arrayList.add(new io.ktor.http.HeaderValueParam((java.lang.String) kVar.f22539h, (java.lang.String) kVar.f22540i));
        }
        return arrayList;
    }

    private static final <T> java.util.List<T> valueOrEmpty(p070h6.h hVar) {
        return hVar.isInitialized() ? (java.util.List) hVar.getValue() : p078i6.w.f23205h;
    }

    public static final java.util.List<io.ktor.http.HeaderValue> parseHeaderValue(java.lang.String str, boolean z6) {
        if (str == null) {
            return p078i6.w.f23205h;
        }
        p070h6.h hVarA = com.google.common.util.concurrent.D.A(p070h6.i.j, new io.ktor.http.a(1));
        int headerValueItem = 0;
        while (headerValueItem <= O7.q.H0(str)) {
            headerValueItem = parseHeaderValueItem(str, headerValueItem, hVarA, z6);
        }
        return valueOrEmpty(hVarA);
    }
}

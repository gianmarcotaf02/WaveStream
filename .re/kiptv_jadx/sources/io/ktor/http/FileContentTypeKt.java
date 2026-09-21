package io.ktor.http;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u001a\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"-\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"-\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "extension", "Lio/ktor/http/ContentType;", "defaultForFileExtension", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Lio/ktor/http/ContentType;", "path", "defaultForFilePath", "", "fromFilePath", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Ljava/util/List;", "ext", "fromFileExtension", "fileExtensions", "(Lio/ktor/http/ContentType;)Ljava/util/List;", "selectDefault", "(Ljava/util/List;)Lio/ktor/http/ContentType;", "", "matchApplicationTypeWithCharset", "(Lio/ktor/http/ContentType;)Z", "withCharsetUTF8IfNeeded", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentType;", "A", "B", "LN7/m;", "Lh6/k;", "", "groupByPairs", "(LN7/m;)Ljava/util/Map;", "toContentType", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "contentTypesByExtensions$delegate", "Lh6/h;", "getContentTypesByExtensions", "()Ljava/util/Map;", "contentTypesByExtensions", "extensionsByContentType$delegate", "getExtensionsByContentType", "extensionsByContentType", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileContentTypeKt {
    private static final p070h6.h contentTypesByExtensions$delegate = com.google.common.util.concurrent.D.B(new p026c6.a(29));
    private static final p070h6.h extensionsByContentType$delegate = com.google.common.util.concurrent.D.B(new io.ktor.http.a(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map contentTypesByExtensions_delegate$lambda$1() {
        java.util.Map mapCaseInsensitiveMap = io.ktor.util.CollectionsKt.caseInsensitiveMap();
        mapCaseInsensitiveMap.putAll(groupByPairs(p078i6.o.Y0(io.ktor.http.MimesKt.getMimes())));
        return mapCaseInsensitiveMap;
    }

    public static final io.ktor.http.ContentType defaultForFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String extension) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(extension, "extension");
        return selectDefault(fromFileExtension(io.ktor.http.ContentType.INSTANCE, extension));
    }

    public static final io.ktor.http.ContentType defaultForFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String path) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(path, "path");
        return selectDefault(fromFilePath(io.ktor.http.ContentType.INSTANCE, path));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Map extensionsByContentType_delegate$lambda$3() {
        return groupByPairs(N7.o.p0(p078i6.o.Y0(io.ktor.http.MimesKt.getMimes()), new io.ktor.client.plugins.sse.c(29)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.k extensionsByContentType_delegate$lambda$3$lambda$2(p070h6.k kVar) {
        kotlin.jvm.internal.m.e(kVar, "<destruct>");
        return new p070h6.k((io.ktor.http.ContentType) kVar.f22540i, (java.lang.String) kVar.f22539h);
    }

    public static final java.util.List<java.lang.String> fileExtensions(io.ktor.http.ContentType contentType) {
        kotlin.jvm.internal.m.e(contentType, "<this>");
        java.util.List<java.lang.String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        java.util.List<java.lang.String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? p078i6.w.f23205h : list2;
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFileExtension(io.ktor.http.ContentType.Companion companion, java.lang.String ext) {
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(ext, "ext");
        for (java.lang.String lowerCasePreservingASCIIRules = io.ktor.util.TextKt.toLowerCasePreservingASCIIRules(O7.q.V0(ext, ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = O7.q.j1(lowerCasePreservingASCIIRules, ".", "")) {
            java.util.List<io.ktor.http.ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return p078i6.w.f23205h;
    }

    public static final java.util.List<io.ktor.http.ContentType> fromFilePath(io.ktor.http.ContentType.Companion companion, java.lang.String path) {
        int iLastIndexOf;
        kotlin.jvm.internal.m.e(companion, "<this>");
        kotlin.jvm.internal.m.e(path, "path");
        char[] chars = io.ktor.util.CharsetKt.toCharArray("/\\");
        int iH0 = O7.q.H0(path);
        kotlin.jvm.internal.m.e(path, "<this>");
        kotlin.jvm.internal.m.e(chars, "chars");
        if (chars.length != 1) {
            int iH1 = O7.q.H0(path);
            if (iH0 > iH1) {
                iH0 = iH1;
            }
            loop0: while (true) {
                if (-1 >= iH0) {
                    iLastIndexOf = -1;
                    break;
                }
                char cCharAt = path.charAt(iH0);
                for (char c9 : chars) {
                    if (R8.i.q(c9, cCharAt, false)) {
                        iLastIndexOf = iH0;
                        break loop0;
                    }
                }
                iH0--;
            }
        } else {
            iLastIndexOf = path.lastIndexOf(p078i6.m.y0(chars), iH0);
        }
        int iK0 = O7.q.K0(path, '.', iLastIndexOf + 1, 4);
        if (iK0 == -1) {
            return p078i6.w.f23205h;
        }
        java.lang.String strSubstring = path.substring(iK0 + 1);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        return fromFileExtension(companion, strSubstring);
    }

    private static final java.util.Map<java.lang.String, java.util.List<io.ktor.http.ContentType>> getContentTypesByExtensions() {
        return (java.util.Map) contentTypesByExtensions$delegate.getValue();
    }

    private static final java.util.Map<io.ktor.http.ContentType, java.util.List<java.lang.String>> getExtensionsByContentType() {
        return (java.util.Map) extensionsByContentType$delegate.getValue();
    }

    public static final <A, B> java.util.Map<A, java.util.List<B>> groupByPairs(N7.m mVar) {
        kotlin.jvm.internal.m.e(mVar, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.lang.Object obj : mVar) {
            java.lang.Object obj2 = ((p070h6.k) obj).f22539h;
            java.lang.Object arrayList = linkedHashMap.get(obj2);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
                linkedHashMap.put(obj2, arrayList);
            }
            ((java.util.List) arrayList).add(obj);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(p078i6.D.I0(linkedHashMap.size()));
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            java.lang.Object key = entry.getKey();
            java.lang.Iterable iterable = (java.lang.Iterable) entry.getValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(iterable, 10));
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((p070h6.k) it.next()).f22540i);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    private static final boolean matchApplicationTypeWithCharset(io.ktor.http.ContentType contentType) {
        io.ktor.http.ContentType.Application application = io.ktor.http.ContentType.Application.INSTANCE;
        if (contentType.match(application.getAny())) {
            return contentType.match(application.getAtom()) || contentType.match(application.getJavaScript()) || contentType.match(application.getRss()) || contentType.match(application.getXml()) || contentType.match(application.getXml_Dtd());
        }
        return false;
    }

    public static final io.ktor.http.ContentType selectDefault(java.util.List<io.ktor.http.ContentType> list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        io.ktor.http.ContentType octetStream = (io.ktor.http.ContentType) p078i6.o.j1(list);
        if (octetStream == null) {
            octetStream = io.ktor.http.ContentType.Application.INSTANCE.getOctetStream();
        }
        if (octetStream.match(io.ktor.http.ContentType.Text.INSTANCE.getAny())) {
            return withCharsetUTF8IfNeeded(octetStream);
        }
        if (octetStream.match(io.ktor.http.ContentType.Image.INSTANCE.getSVG())) {
            return withCharsetUTF8IfNeeded(octetStream);
        }
        return matchApplicationTypeWithCharset(octetStream) ? withCharsetUTF8IfNeeded(octetStream) : octetStream;
    }

    public static final io.ktor.http.ContentType toContentType(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        try {
            return io.ktor.http.ContentType.INSTANCE.parse(str);
        } catch (java.lang.Throwable th) {
            throw new java.lang.IllegalArgumentException("Failed to parse ".concat(str), th);
        }
    }

    private static final io.ktor.http.ContentType withCharsetUTF8IfNeeded(io.ktor.http.ContentType contentType) {
        return io.ktor.http.ContentTypesKt.charset(contentType) != null ? contentType : io.ktor.http.ContentTypesKt.withCharset(contentType, O7.a.f8024b);
    }
}

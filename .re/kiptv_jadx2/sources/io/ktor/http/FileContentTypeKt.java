package io.ktor.http;

import O7.q;
import R8.i;
import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.D;
import io.ktor.util.CharsetKt;
import io.ktor.util.CollectionsKt;
import io.ktor.util.TextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.h;
import p070h6.k;
import p078i6.o;
import p078i6.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b*\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u000f\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00030\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0003*\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b0\u001a\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00190\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"-\u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"-\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"¨\u0006'"}, d2 = {"Lio/ktor/http/ContentType$Companion;", "", "extension", "Lio/ktor/http/ContentType;", "defaultForFileExtension", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Lio/ktor/http/ContentType;", "path", "defaultForFilePath", "", "fromFilePath", "(Lio/ktor/http/ContentType$Companion;Ljava/lang/String;)Ljava/util/List;", "ext", "fromFileExtension", "fileExtensions", "(Lio/ktor/http/ContentType;)Ljava/util/List;", "selectDefault", "(Ljava/util/List;)Lio/ktor/http/ContentType;", "", "matchApplicationTypeWithCharset", "(Lio/ktor/http/ContentType;)Z", "withCharsetUTF8IfNeeded", "(Lio/ktor/http/ContentType;)Lio/ktor/http/ContentType;", "A", "B", "LN7/m;", "Lh6/k;", "", "groupByPairs", "(LN7/m;)Ljava/util/Map;", "toContentType", "(Ljava/lang/String;)Lio/ktor/http/ContentType;", "contentTypesByExtensions$delegate", "Lh6/h;", "getContentTypesByExtensions", "()Ljava/util/Map;", "contentTypesByExtensions", "extensionsByContentType$delegate", "getExtensionsByContentType", "extensionsByContentType", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FileContentTypeKt {
    private static final h contentTypesByExtensions$delegate = D.B(new p026c6.a(29));
    private static final h extensionsByContentType$delegate = D.B(new a(0));

    public static final Map contentTypesByExtensions_delegate$lambda$1() {
        Map mapCaseInsensitiveMap = CollectionsKt.caseInsensitiveMap();
        mapCaseInsensitiveMap.putAll(groupByPairs(o.Y0(MimesKt.getMimes())));
        return mapCaseInsensitiveMap;
    }

    public static final ContentType defaultForFileExtension(ContentType.Companion companion, String extension) {
        m.e(companion, "<this>");
        m.e(extension, "extension");
        return selectDefault(fromFileExtension(ContentType.INSTANCE, extension));
    }

    public static final ContentType defaultForFilePath(ContentType.Companion companion, String path) {
        m.e(companion, "<this>");
        m.e(path, "path");
        return selectDefault(fromFilePath(ContentType.INSTANCE, path));
    }

    public static final Map extensionsByContentType_delegate$lambda$3() {
        return groupByPairs(N7.o.p0(o.Y0(MimesKt.getMimes()), new io.ktor.client.plugins.sse.c(29)));
    }

    public static final k extensionsByContentType_delegate$lambda$3$lambda$2(k kVar) {
        m.e(kVar, "<destruct>");
        return new k((ContentType) kVar.f22540i, (String) kVar.f22539h);
    }

    public static final List<String> fileExtensions(ContentType contentType) {
        m.e(contentType, "<this>");
        List<String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        List<String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? w.f23205h : list2;
    }

    public static final List<ContentType> fromFileExtension(ContentType.Companion companion, String ext) {
        m.e(companion, "<this>");
        m.e(ext, "ext");
        for (String lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(q.V0(ext, ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = q.j1(lowerCasePreservingASCIIRules, ".", "")) {
            List<ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return w.f23205h;
    }

    public static final List<ContentType> fromFilePath(ContentType.Companion companion, String path) {
        int iLastIndexOf;
        m.e(companion, "<this>");
        m.e(path, "path");
        char[] chars = CharsetKt.toCharArray("/\\");
        int iH0 = q.H0(path);
        m.e(path, "<this>");
        m.e(chars, "chars");
        if (chars.length != 1) {
            int iH1 = q.H0(path);
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
                    if (i.q(c9, cCharAt, false)) {
                        iLastIndexOf = iH0;
                        break loop0;
                    }
                }
                iH0--;
            }
        } else {
            iLastIndexOf = path.lastIndexOf(p078i6.m.y0(chars), iH0);
        }
        int iK0 = q.K0(path, '.', iLastIndexOf + 1, 4);
        if (iK0 == -1) {
            return w.f23205h;
        }
        String strSubstring = path.substring(iK0 + 1);
        m.d(strSubstring, "substring(...)");
        return fromFileExtension(companion, strSubstring);
    }

    private static final Map<String, List<ContentType>> getContentTypesByExtensions() {
        return (Map) contentTypesByExtensions$delegate.getValue();
    }

    private static final Map<ContentType, List<String>> getExtensionsByContentType() {
        return (Map) extensionsByContentType$delegate.getValue();
    }

    public static final <A, B> Map<A, List<B>> groupByPairs(N7.m mVar) {
        m.e(mVar, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : mVar) {
            Object obj2 = ((k) obj).f22539h;
            Object arrayList = linkedHashMap.get(obj2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(obj2, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(p078i6.D.I0(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(p078i6.q.I0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((k) it.next()).f22540i);
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }

    private static final boolean matchApplicationTypeWithCharset(ContentType contentType) {
        ContentType.Application application = ContentType.Application.INSTANCE;
        if (contentType.match(application.getAny())) {
            return contentType.match(application.getAtom()) || contentType.match(application.getJavaScript()) || contentType.match(application.getRss()) || contentType.match(application.getXml()) || contentType.match(application.getXml_Dtd());
        }
        return false;
    }

    public static final ContentType selectDefault(List<ContentType> list) {
        m.e(list, "<this>");
        ContentType octetStream = (ContentType) o.j1(list);
        if (octetStream == null) {
            octetStream = ContentType.Application.INSTANCE.getOctetStream();
        }
        if (octetStream.match(ContentType.Text.INSTANCE.getAny())) {
            return withCharsetUTF8IfNeeded(octetStream);
        }
        if (octetStream.match(ContentType.Image.INSTANCE.getSVG())) {
            return withCharsetUTF8IfNeeded(octetStream);
        }
        return matchApplicationTypeWithCharset(octetStream) ? withCharsetUTF8IfNeeded(octetStream) : octetStream;
    }

    public static final ContentType toContentType(String str) {
        m.e(str, "<this>");
        try {
            return ContentType.INSTANCE.parse(str);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Failed to parse ".concat(str), th);
        }
    }

    private static final ContentType withCharsetUTF8IfNeeded(ContentType contentType) {
        return ContentTypesKt.charset(contentType) != null ? contentType : ContentTypesKt.withCharset(contentType, O7.a.f8024b);
    }
}

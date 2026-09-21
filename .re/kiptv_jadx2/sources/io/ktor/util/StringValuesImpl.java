package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.x;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00190\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J/\u0010\u001e\u001a\u00020\u001c2\u001e\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0006\u0012\u0004\u0012\u00020\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00022\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0018R,\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/util/StringValuesImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", "", "", "values", "<init>", "(ZLjava/util/Map;)V", "name", "listForKey", "(Ljava/lang/String;)Ljava/util/List;", "get", "(Ljava/lang/String;)Ljava/lang/String;", "getAll", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "Lkotlin/Function2;", "Lh6/A;", TtmlNode.TAG_BODY, "forEach", "(Lx6/m;)V", "toString", "()Ljava/lang/String;", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "getCaseInsensitiveName", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class StringValuesImpl implements StringValues {
    private final boolean caseInsensitiveName;
    private final Map<String, List<String>> values;

    public StringValuesImpl() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final List<String> listForKey(String name) {
        return this.values.get(name);
    }

    @Override
    public boolean contains(String name) {
        m.e(name, "name");
        return listForKey(name) != null;
    }

    @Override
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) other;
        if (this.caseInsensitiveName != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override
    public void forEach(p194x6.m body) {
        m.e(body, "body");
        for (Map.Entry<String, List<String>> entry : this.values.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public String get(String name) {
        m.e(name, "name");
        List<String> listListForKey = listForKey(name);
        if (listListForKey != null) {
            return (String) o.j1(listListForKey);
        }
        return null;
    }

    @Override
    public List<String> getAll(String name) {
        m.e(name, "name");
        return listForKey(name);
    }

    @Override
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final Map<String, List<String>> getValues() {
        return this.values;
    }

    public int hashCode() {
        return StringValuesKt.entriesHashCode(entries(), Boolean.hashCode(this.caseInsensitiveName) * 31);
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override
    public Set<String> names() {
        return CollectionsJvmKt.unmodifiable(this.values.keySet());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!this.caseInsensitiveName);
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    public StringValuesImpl(boolean z6, Map<String, ? extends List<String>> values) {
        m.e(values, "values");
        this.caseInsensitiveName = z6;
        Map mapCaseInsensitiveMap = z6 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(value.get(i3));
            }
            mapCaseInsensitiveMap.put(key, arrayList);
        }
        this.values = mapCaseInsensitiveMap;
    }

    @Override
    public boolean contains(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        List<String> listListForKey = listForKey(name);
        if (listListForKey != null) {
            return listListForKey.contains(value);
        }
        return false;
    }

    public StringValuesImpl(boolean z6, Map map, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? false : z6, (i3 & 2) != 0 ? x.f23206h : map);
    }
}

package io.ktor.util;

import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.OperatingSystem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p070h6.A;
import p078i6.o;
import p078i6.u;
import p078i6.y;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00180\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J%\u0010\"\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b\"\u0010'J%\u0010$\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b$\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010,\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u0010)J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/util/StringValuesBuilder;", "", "caseInsensitiveName", "", "size", "<init>", "(ZI)V", "", "name", "", "ensureListForKey", "(Ljava/lang/String;)Ljava/util/List;", "", "getAll", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "Lh6/A;", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "append", "Lio/ktor/util/StringValues;", "stringValues", "appendAll", "(Lio/ktor/util/StringValues;)V", "appendMissing", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "remove", "(Ljava/lang/String;)V", "removeKeysWithNoEntries", "()V", "clear", OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/util/StringValues;", "validateName", "validateValue", "Z", "getCaseInsensitiveName", "", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class StringValuesBuilderImpl implements StringValuesBuilder {
    private final boolean caseInsensitiveName;
    private final Map<String, List<String>> values;

    public StringValuesBuilderImpl() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static final A appendAll$lambda$0(StringValuesBuilderImpl stringValuesBuilderImpl, String name, List values) {
        m.e(name, "name");
        m.e(values, "values");
        stringValuesBuilderImpl.appendAll(name, values);
        return A.f22523a;
    }

    public static final A appendMissing$lambda$1(StringValuesBuilderImpl stringValuesBuilderImpl, String name, List values) {
        m.e(name, "name");
        m.e(values, "values");
        stringValuesBuilderImpl.appendMissing(name, values);
        return A.f22523a;
    }

    private final List<String> ensureListForKey(String name) {
        List<String> list = this.values.get(name);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        validateName(name);
        this.values.put(name, arrayList);
        return arrayList;
    }

    @Override
    public void append(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        validateValue(value);
        ensureListForKey(name).add(value);
    }

    @Override
    public void appendAll(StringValues stringValues) {
        m.e(stringValues, "stringValues");
        stringValues.forEach(new d(this, 1));
    }

    @Override
    public void appendMissing(StringValues stringValues) {
        m.e(stringValues, "stringValues");
        stringValues.forEach(new d(this, 0));
    }

    @Override
    public StringValues build() {
        return new StringValuesImpl(this.caseInsensitiveName, this.values);
    }

    @Override
    public void clear() {
        this.values.clear();
    }

    @Override
    public boolean contains(String name) {
        m.e(name, "name");
        return this.values.containsKey(name);
    }

    @Override
    public Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Override
    public String get(String name) {
        m.e(name, "name");
        List<String> all = getAll(name);
        if (all != null) {
            return (String) o.j1(all);
        }
        return null;
    }

    @Override
    public List<String> getAll(String name) {
        m.e(name, "name");
        return this.values.get(name);
    }

    @Override
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final Map<String, List<String>> getValues() {
        return this.values;
    }

    @Override
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override
    public Set<String> names() {
        return this.values.keySet();
    }

    @Override
    public void remove(String name) {
        m.e(name, "name");
        this.values.remove(name);
    }

    @Override
    public void removeKeysWithNoEntries() {
        Map<String, List<String>> map = this.values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override
    public void set(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        validateValue(value);
        List<String> listEnsureListForKey = ensureListForKey(name);
        listEnsureListForKey.clear();
        listEnsureListForKey.add(value);
    }

    public void validateName(String name) {
        m.e(name, "name");
    }

    public void validateValue(String value) {
        m.e(value, "value");
    }

    public StringValuesBuilderImpl(boolean z6, int i3) {
        this.caseInsensitiveName = z6;
        this.values = z6 ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap<>(i3);
    }

    @Override
    public void appendAll(String name, Iterable<String> values) {
        m.e(name, "name");
        m.e(values, "values");
        List<String> listEnsureListForKey = ensureListForKey(name);
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            validateValue(it.next());
        }
        u.M0(listEnsureListForKey, values);
    }

    @Override
    public void appendMissing(String name, Iterable<String> values) {
        m.e(name, "name");
        m.e(values, "values");
        List<String> list = this.values.get(name);
        Set setR1 = list != null ? o.R1(list) : y.f23207h;
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            if (!setR1.contains(str)) {
                arrayList.add(str);
            }
        }
        appendAll(name, arrayList);
    }

    @Override
    public boolean contains(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override
    public boolean remove(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    public StringValuesBuilderImpl(boolean z6, int i3, int i9, AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? false : z6, (i9 & 2) != 0 ? 8 : i3);
    }
}

package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\r0\u00180\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010#J%\u0010\"\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b\"\u0010'J%\u0010$\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%H\u0016¢\u0006\u0004\b$\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010(\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010,\u001a\u00020\u001aH\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u001a2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b/\u0010)J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b0\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b&\u00104\u001a\u0004\b5\u00106¨\u00067"}, d2 = {"Lio/ktor/util/StringValuesBuilderImpl;", "Lio/ktor/util/StringValuesBuilder;", "", "caseInsensitiveName", "", "size", "<init>", "(ZI)V", "", "name", "", "ensureListForKey", "(Ljava/lang/String;)Ljava/util/List;", "", "getAll", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "names", "()Ljava/util/Set;", "isEmpty", "()Z", "", "entries", "Lh6/A;", "set", "(Ljava/lang/String;Ljava/lang/String;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "append", "Lio/ktor/util/StringValues;", "stringValues", "appendAll", "(Lio/ktor/util/StringValues;)V", "appendMissing", "", "values", "(Ljava/lang/String;Ljava/lang/Iterable;)V", "remove", "(Ljava/lang/String;)V", "removeKeysWithNoEntries", "()V", "clear", io.sentry.protocol.OperatingSystem.JsonKeys.BUILD, "()Lio/ktor/util/StringValues;", "validateName", "validateValue", "Z", "getCaseInsensitiveName", "", "Ljava/util/Map;", "getValues", "()Ljava/util/Map;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class StringValuesBuilderImpl implements io.ktor.util.StringValuesBuilder {
    private final boolean caseInsensitiveName;
    private final java.util.Map<java.lang.String, java.util.List<java.lang.String>> values;

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesBuilderImpl() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A appendAll$lambda$0(io.ktor.util.StringValuesBuilderImpl stringValuesBuilderImpl, java.lang.String name, java.util.List values) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(values, "values");
        stringValuesBuilderImpl.appendAll(name, values);
        return p070h6.A.f22523a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p070h6.A appendMissing$lambda$1(io.ktor.util.StringValuesBuilderImpl stringValuesBuilderImpl, java.lang.String name, java.util.List values) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(values, "values");
        stringValuesBuilderImpl.appendMissing(name, values);
        return p070h6.A.f22523a;
    }

    private final java.util.List<java.lang.String> ensureListForKey(java.lang.String name) {
        java.util.List<java.lang.String> list = this.values.get(name);
        if (list != null) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        validateName(name);
        this.values.put(name, arrayList);
        return arrayList;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void append(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        validateValue(value);
        ensureListForKey(name).add(value);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.m.e(stringValues, "stringValues");
        stringValues.forEach(new io.ktor.util.d(this, 1));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(io.ktor.util.StringValues stringValues) {
        kotlin.jvm.internal.m.e(stringValues, "stringValues");
        stringValues.forEach(new io.ktor.util.d(this, 0));
    }

    @Override // io.ktor.util.StringValuesBuilder
    public io.ktor.util.StringValues build() {
        return new io.ktor.util.StringValuesImpl(this.caseInsensitiveName, this.values);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void clear() {
        this.values.clear();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.values.containsKey(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return io.ktor.util.CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.lang.String get(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        java.util.List<java.lang.String> all = getAll(name);
        if (all != null) {
            return (java.lang.String) p078i6.o.j1(all);
        }
        return null;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.List<java.lang.String> getAll(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return this.values.get(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> getValues() {
        return this.values;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public java.util.Set<java.lang.String> names() {
        return this.values.keySet();
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void remove(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.values.remove(name);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void removeKeysWithNoEntries() {
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map = this.values;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
        }
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void set(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        validateValue(value);
        java.util.List<java.lang.String> listEnsureListForKey = ensureListForKey(name);
        listEnsureListForKey.clear();
        listEnsureListForKey.add(value);
    }

    public void validateName(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
    }

    public void validateValue(java.lang.String value) {
        kotlin.jvm.internal.m.e(value, "value");
    }

    public StringValuesBuilderImpl(boolean z6, int i3) {
        this.caseInsensitiveName = z6;
        this.values = z6 ? io.ktor.util.CollectionsKt.caseInsensitiveMap() : new java.util.LinkedHashMap<>(i3);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendAll(java.lang.String name, java.lang.Iterable<java.lang.String> values) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(values, "values");
        java.util.List<java.lang.String> listEnsureListForKey = ensureListForKey(name);
        java.util.Iterator<java.lang.String> it = values.iterator();
        while (it.hasNext()) {
            validateValue(it.next());
        }
        p078i6.u.M0(listEnsureListForKey, values);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public void appendMissing(java.lang.String name, java.lang.Iterable<java.lang.String> values) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(values, "values");
        java.util.List<java.lang.String> list = this.values.get(name);
        java.util.Set setR1 = list != null ? p078i6.o.R1(list) : p078i6.y.f23207h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : values) {
            if (!setR1.contains(str)) {
                arrayList.add(str);
            }
        }
        appendAll(name, arrayList);
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean contains(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        java.util.List<java.lang.String> list = this.values.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // io.ktor.util.StringValuesBuilder
    public boolean remove(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        java.util.List<java.lang.String> list = this.values.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    public /* synthetic */ StringValuesBuilderImpl(boolean z6, int i3, int i9, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i9 & 1) != 0 ? false : z6, (i9 & 2) != 0 ? 8 : i3);
    }
}

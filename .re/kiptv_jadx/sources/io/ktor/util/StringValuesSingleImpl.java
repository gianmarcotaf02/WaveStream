package io.ktor.util;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", "name", "", "values", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "", "entries", "()Ljava/util/Set;", "isEmpty", "()Z", "names", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lh6/A;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_BODY, "forEach", "(Lx6/m;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "Z", "getCaseInsensitiveName", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class StringValuesSingleImpl implements io.ktor.util.StringValues {
    private final boolean caseInsensitiveName;
    private final java.lang.String name;
    private final java.util.List<java.lang.String> values;

    /* JADX INFO: renamed from: io.ktor.util.StringValuesSingleImpl$entries$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001J\u000f\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/ktor/util/StringValuesSingleImpl$entries$1", "", "", "", "toString", "()Ljava/lang/String;", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "value", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 implements java.util.Map.Entry<java.lang.String, java.util.List<? extends java.lang.String>>, p201y6.a {
        private final java.lang.String key;
        private final java.util.List<java.lang.String> value;

        public AnonymousClass1(io.ktor.util.StringValuesSingleImpl stringValuesSingleImpl) {
            this.key = stringValuesSingleImpl.getName();
            this.value = stringValuesSingleImpl.getValues();
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object other) {
            if (!(other instanceof java.util.Map.Entry)) {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) other;
            return kotlin.jvm.internal.m.a(entry.getKey(), getKey()) && kotlin.jvm.internal.m.a(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.util.List<? extends java.lang.String> setValue(java.util.List<? extends java.lang.String> list) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public java.lang.String toString() {
            return getKey() + '=' + getValue();
        }

        @Override // java.util.Map.Entry
        public java.lang.String getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public java.util.List<? extends java.lang.String> getValue() {
            return this.value;
        }

        /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
        public java.util.List<java.lang.String> setValue2(java.util.List<java.lang.String> list) {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public StringValuesSingleImpl(boolean z6, java.lang.String name, java.util.List<java.lang.String> values) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(values, "values");
        this.caseInsensitiveName = z6;
        this.name = name;
        this.values = values;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        return O7.x.r0(name, this.name, getCaseInsensitiveName());
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>>> entries() {
        return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(new io.ktor.util.StringValuesSingleImpl.AnonymousClass1(this));
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof io.ktor.util.StringValues)) {
            return false;
        }
        io.ktor.util.StringValues stringValues = (io.ktor.util.StringValues) other;
        if (getCaseInsensitiveName() != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return io.ktor.util.StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override // io.ktor.util.StringValues
    public void forEach(p194x6.m body) {
        kotlin.jvm.internal.m.e(body, "body");
        body.invoke(this.name, this.values);
    }

    @Override // io.ktor.util.StringValues
    public java.lang.String get(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        if (O7.x.r0(name, this.name, getCaseInsensitiveName())) {
            return (java.lang.String) p078i6.o.j1(this.values);
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public java.util.List<java.lang.String> getAll(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        if (O7.x.r0(this.name, name, getCaseInsensitiveName())) {
            return this.values;
        }
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.util.List<java.lang.String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return io.ktor.util.StringValuesKt.entriesHashCode(entries(), java.lang.Boolean.hashCode(getCaseInsensitiveName()) * 31);
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return false;
    }

    @Override // io.ktor.util.StringValues
    public java.util.Set<java.lang.String> names() {
        return com.google.crypto.tink.shaded.protobuf.AbstractC1909d.h0(this.name);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StringValues(case=");
        sb.append(!getCaseInsensitiveName());
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(java.lang.String name, java.lang.String value) {
        kotlin.jvm.internal.m.e(name, "name");
        kotlin.jvm.internal.m.e(value, "value");
        return O7.x.r0(name, this.name, getCaseInsensitiveName()) && this.values.contains(value);
    }
}

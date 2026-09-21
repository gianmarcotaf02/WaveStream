package io.ktor.util;

import O7.x;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.crypto.tink.shaded.protobuf.AbstractC1909d;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.protocol.Request;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010\u001f\u001a\u00020\u001d2\u001e\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/ktor/util/StringValuesSingleImpl;", "Lio/ktor/util/StringValues;", "", "caseInsensitiveName", "", "name", "", "values", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getAll", "(Ljava/lang/String;)Ljava/util/List;", "", "", "entries", "()Ljava/util/Set;", "isEmpty", "()Z", "names", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Lkotlin/Function2;", "Lh6/A;", TtmlNode.TAG_BODY, "forEach", "(Lx6/m;)V", "get", "(Ljava/lang/String;)Ljava/lang/String;", "contains", "(Ljava/lang/String;)Z", "value", "(Ljava/lang/String;Ljava/lang/String;)Z", "Z", "getCaseInsensitiveName", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class StringValuesSingleImpl implements StringValues {
    private final boolean caseInsensitiveName;
    private final String name;
    private final List<String> values;

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001J\u000f\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0005R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"io/ktor/util/StringValuesSingleImpl$entries$1", "", "", "", "toString", "()Ljava/lang/String;", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", SubscriberAttributeKt.JSON_NAME_KEY, "Ljava/lang/String;", "getKey", "value", "Ljava/util/List;", "getValue", "()Ljava/util/List;", "ktor-utils"}, k = 1, mv = {2, 1, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 implements Map.Entry<String, List<? extends String>>, p201y6.a {
        private final String key;
        private final List<String> value;

        public AnonymousClass1(StringValuesSingleImpl stringValuesSingleImpl) {
            this.key = stringValuesSingleImpl.getName();
            this.value = stringValuesSingleImpl.getValues();
        }

        @Override
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return m.a(entry.getKey(), getKey()) && m.a(entry.getValue(), getValue());
        }

        @Override
        public int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        @Override
        public List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return getKey() + '=' + getValue();
        }

        @Override
        public String getKey() {
            return this.key;
        }

        @Override
        public List<? extends String> getValue() {
            return this.value;
        }

        public List<String> setValue2(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public StringValuesSingleImpl(boolean z6, String name, List<String> values) {
        m.e(name, "name");
        m.e(values, "values");
        this.caseInsensitiveName = z6;
        this.name = name;
        this.values = values;
    }

    @Override
    public boolean contains(String name) {
        m.e(name, "name");
        return x.r0(name, this.name, getCaseInsensitiveName());
    }

    @Override
    public Set<Map.Entry<String, List<String>>> entries() {
        return AbstractC1909d.h0(new AnonymousClass1(this));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StringValues)) {
            return false;
        }
        StringValues stringValues = (StringValues) other;
        if (getCaseInsensitiveName() != stringValues.getCaseInsensitiveName()) {
            return false;
        }
        return StringValuesKt.entriesEquals(entries(), stringValues.entries());
    }

    @Override
    public void forEach(p194x6.m body) {
        m.e(body, "body");
        body.invoke(this.name, this.values);
    }

    @Override
    public String get(String name) {
        m.e(name, "name");
        if (x.r0(name, this.name, getCaseInsensitiveName())) {
            return (String) o.j1(this.values);
        }
        return null;
    }

    @Override
    public List<String> getAll(String name) {
        m.e(name, "name");
        if (x.r0(this.name, name, getCaseInsensitiveName())) {
            return this.values;
        }
        return null;
    }

    @Override
    public boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        return StringValuesKt.entriesHashCode(entries(), Boolean.hashCode(getCaseInsensitiveName()) * 31);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Set<String> names() {
        return AbstractC1909d.h0(this.name);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StringValues(case=");
        sb.append(!getCaseInsensitiveName());
        sb.append(") ");
        sb.append(entries());
        return sb.toString();
    }

    @Override
    public boolean contains(String name, String value) {
        m.e(name, "name");
        m.e(value, "value");
        return x.r0(name, this.name, getCaseInsensitiveName()) && this.values.contains(value);
    }
}

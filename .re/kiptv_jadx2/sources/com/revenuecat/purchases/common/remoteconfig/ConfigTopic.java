package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.revenuecat.purchases.common.JsonProvider;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import io.sentry.protocol.Request;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import p070h6.h;
import p078i6.D;
import p078i6.o;
import p078i6.q;
import p119n8.i;
import p121o0.p;
import p201y6.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u0081\b\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001b\u0010$\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0017R&\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&0%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020%8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010(R\u0014\u0010-\u001a\u00020\u00188\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010\u001aR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "items", "<init>", "(Ljava/util/Map;)V", SubscriberAttributeKt.JSON_NAME_KEY, "", "containsKey", "(Ljava/lang/String;)Z", "value", "containsValue", "(Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;)Z", "get", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "isEmpty", "()Z", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", Request.JsonKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getItems", "contentHash$delegate", "Lh6/h;", "getContentHash", "contentHash", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "getSize", "size", "", "getValues", "()Ljava/util/Collection;", "values", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i(with = ConfigTopicSerializer.class)
public final class ConfigTopic implements Map<String, RemoteConfiguration.ConfigItem>, a {
    private static final Companion Companion = new Companion(null);
    private static final int HEX_BYTE_MASK = 255;

    private final h contentHash;
    private final Map<String, RemoteConfiguration.ConfigItem> items;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic$Companion;", "", "<init>", "()V", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/RemoteConfiguration$ConfigItem;", "items", "computeHash", "(Ljava/util/Map;)Ljava/lang/String;", "Lkotlinx/serialization/json/b;", "element", "canonicalize", "(Lkotlinx/serialization/json/b;)Lkotlinx/serialization/json/b;", "input", "sha256Hex", "(Ljava/lang/String;)Ljava/lang/String;", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "HEX_BYTE_MASK", "I", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        private final b canonicalize(b element) {
            if (!(element instanceof c)) {
                if (!(element instanceof kotlinx.serialization.json.a)) {
                    return element;
                }
                Iterable iterable = (Iterable) element;
                ArrayList arrayList = new ArrayList(q.I0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(ConfigTopic.Companion.canonicalize((b) it.next()));
                }
                return new kotlinx.serialization.json.a(arrayList);
            }
            List<Map.Entry> listI1 = o.I1(((c) element).f24558h.entrySet(), new Comparator() {
                @Override
                public final int compare(T t9, T t10) {
                    return q0.o((String) ((Map.Entry) t9).getKey(), (String) ((Map.Entry) t10).getKey());
                }
            });
            int iI0 = D.I0(q.I0(listI1, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
            for (Map.Entry entry : listI1) {
                linkedHashMap.put(entry.getKey(), ConfigTopic.Companion.canonicalize((b) entry.getValue()));
            }
            return new c(linkedHashMap);
        }

        public final String computeHash(Map<String, RemoteConfiguration.ConfigItem> items) {
            return sha256Hex(canonicalize(JsonProvider.INSTANCE.getDefaultJson().c(RemoteConfigurationKt.configItemMapSerializer, items)).toString());
        }

        private final String sha256Hex(String input) throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = input.getBytes(O7.a.f8024b);
            m.d(bytes, "getBytes(...)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            m.d(bArrDigest, "getInstance(\"SHA-256\")\n …yteArray(Charsets.UTF_8))");
            return p078i6.m.u0(bArrDigest, "", ConfigTopic$Companion$sha256Hex$1.INSTANCE, 30);
        }

        public final KSerializer serializer() {
            return ConfigTopicSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ConfigTopic(Map<String, RemoteConfiguration.ConfigItem> items) {
        m.e(items, "items");
        this.items = items;
        this.contentHash = com.google.common.util.concurrent.D.B(new ConfigTopic$contentHash$2(this));
    }

    public static ConfigTopic copy$default(ConfigTopic configTopic, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            map = configTopic.items;
        }
        return configTopic.copy(map);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Map<String, RemoteConfiguration.ConfigItem> component1() {
        return this.items;
    }

    public RemoteConfiguration.ConfigItem compute2(String str, BiFunction<? super String, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteConfiguration.ConfigItem computeIfAbsent2(String str, Function<? super String, ? extends RemoteConfiguration.ConfigItem> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteConfiguration.ConfigItem computeIfPresent2(String str, BiFunction<? super String, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(String key) {
        m.e(key, "key");
        return this.items.containsKey(key);
    }

    public boolean containsValue(RemoteConfiguration.ConfigItem value) {
        m.e(value, "value");
        return this.items.containsValue(value);
    }

    public final ConfigTopic copy(Map<String, RemoteConfiguration.ConfigItem> items) {
        m.e(items, "items");
        return new ConfigTopic(items);
    }

    @Override
    public final Set<Map.Entry<String, RemoteConfiguration.ConfigItem>> entrySet() {
        return getEntries();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ConfigTopic) && m.a(this.items, ((ConfigTopic) other).items);
    }

    public RemoteConfiguration.ConfigItem get(String key) {
        m.e(key, "key");
        return this.items.get(key);
    }

    public final String getContentHash() {
        return (String) this.contentHash.getValue();
    }

    public Set<Map.Entry<String, RemoteConfiguration.ConfigItem>> getEntries() {
        return this.items.entrySet();
    }

    public final Map<String, RemoteConfiguration.ConfigItem> getItems() {
        return this.items;
    }

    public Set<String> getKeys() {
        return this.items.keySet();
    }

    public int getSize() {
        return this.items.size();
    }

    public Collection<RemoteConfiguration.ConfigItem> getValues() {
        return this.items.values();
    }

    @Override
    public int hashCode() {
        return this.items.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public final Set<String> keySet() {
        return getKeys();
    }

    public RemoteConfiguration.ConfigItem merge2(String str, RemoteConfiguration.ConfigItem configItem, BiFunction<? super RemoteConfiguration.ConfigItem, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteConfiguration.ConfigItem put2(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map<? extends String, ? extends RemoteConfiguration.ConfigItem> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteConfiguration.ConfigItem putIfAbsent2(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public RemoteConfiguration.ConfigItem replace2(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(BiFunction<? super String, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return getSize();
    }

    public String toString() {
        return p.r(new StringBuilder("ConfigTopic(items="), this.items, ')');
    }

    @Override
    public final Collection<RemoteConfiguration.ConfigItem> values() {
        return getValues();
    }

    @Override
    public RemoteConfiguration.ConfigItem compute(String str, BiFunction<? super String, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem computeIfAbsent(String str, Function<? super String, ? extends RemoteConfiguration.ConfigItem> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem computeIfPresent(String str, BiFunction<? super String, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof RemoteConfiguration.ConfigItem) {
            return containsValue((RemoteConfiguration.ConfigItem) obj);
        }
        return false;
    }

    @Override
    public final RemoteConfiguration.ConfigItem get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override
    public RemoteConfiguration.ConfigItem merge(String str, RemoteConfiguration.ConfigItem configItem, BiFunction<? super RemoteConfiguration.ConfigItem, ? super RemoteConfiguration.ConfigItem, ? extends RemoteConfiguration.ConfigItem> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem put(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem putIfAbsent(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public RemoteConfiguration.ConfigItem replace(String str, RemoteConfiguration.ConfigItem configItem) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final RemoteConfiguration.ConfigItem get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    @Override
    public boolean replace(String str, RemoteConfiguration.ConfigItem configItem, RemoteConfiguration.ConfigItem configItem2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean replace2(String str, RemoteConfiguration.ConfigItem configItem, RemoteConfiguration.ConfigItem configItem2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

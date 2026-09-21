package com.revenuecat.purchases.utils;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p194x6.j;

@Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a9\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001ac\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\b\b\u0002\u0010\u0006*\u00020\u0005*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022 \u0010\t\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00018\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\f*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"K", "V", "", "filterNotNullValues", "(Ljava/util/Map;)Ljava/util/Map;", "", "R", "Lkotlin/Function1;", "", "transform", "mapNotNullKeys", "(Ljava/util/Map;Lx6/j;)Ljava/util/Map;", "", SubscriberAttributeKt.JSON_NAME_KEY, "getStringValueForPrimitive", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class MapExtensionsKt {
    public static final <K, V> Map<K, V> filterNotNullValues(Map<K, ? extends V> map) {
        m.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getValue() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final String getStringValueForPrimitive(Map<?, ?> map, String key) {
        m.e(map, "<this>");
        m.e(key, "key");
        Object obj = map.get(key);
        if (obj == null) {
            return null;
        }
        if (obj instanceof String ? true : obj instanceof Number ? true : obj instanceof Boolean ? true : obj instanceof Character) {
            String string = obj.toString();
            if (!q.N0(string)) {
                return string;
            }
        }
        return null;
    }

    public static final <K, V, R> Map<R, V> mapNotNullKeys(Map<K, ? extends V> map, j transform) {
        m.e(map, "<this>");
        m.e(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            Object objInvoke = transform.invoke(entry);
            if (objInvoke != null) {
                linkedHashMap.put(objInvoke, entry.getValue());
            }
        }
        return linkedHashMap;
    }
}

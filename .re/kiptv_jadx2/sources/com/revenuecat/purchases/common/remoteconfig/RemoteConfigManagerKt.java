package com.revenuecat.purchases.common.remoteconfig;

import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p078i6.D;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u0000¨\u0006\u0005"}, d2 = {"toTopicBlobRefs", "", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigManagerKt {
    public static final Map<String, List<String>> toTopicBlobRefs(Map<String, ConfigTopic> map) {
        m.e(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(D.I0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection<RemoteConfiguration.ConfigItem> collectionValues = ((ConfigTopic) entry.getValue()).values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                String blobRef = ((RemoteConfiguration.ConfigItem) it2.next()).getBlobRef();
                if (blobRef != null) {
                    arrayList.add(blobRef);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }
}

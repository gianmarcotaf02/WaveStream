package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a*\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u0000¨\u0006\u0005"}, d2 = {"toTopicBlobRefs", "", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigManagerKt {
    public static final java.util.Map<java.lang.String, java.util.List<java.lang.String>> toTopicBlobRefs(java.util.Map<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(p078i6.D.I0(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            java.lang.Object key = entry.getKey();
            java.util.Collection<com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem> collectionValues = ((com.revenuecat.purchases.common.remoteconfig.ConfigTopic) entry.getValue()).values();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                java.lang.String blobRef = ((com.revenuecat.purchases.common.remoteconfig.RemoteConfiguration.ConfigItem) it2.next()).getBlobRef();
                if (blobRef != null) {
                    arrayList.add(blobRef);
                }
            }
            linkedHashMap.put(key, arrayList);
        }
        return linkedHashMap;
    }
}

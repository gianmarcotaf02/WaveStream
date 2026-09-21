package com.revenuecat.purchases.common.uiconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "Lkotlinx/serialization/json/c;", "merged", "invoke", "(Lkotlinx/serialization/json/c;)Ljava/lang/Object;", "com/revenuecat/purchases/common/remoteconfig/RemoteConfigManager$mergeItemsBlobData$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class UiConfigProvider$resolve$$inlined$mergeItemsBlobData$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic $topic;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiConfigProvider$resolve$$inlined$mergeItemsBlobData$1(com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic) {
        super(1);
        this.$topic = remoteConfigTopic;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [com.revenuecat.purchases.UiConfig, java.lang.Object] */
    @Override // p194x6.j
    public final com.revenuecat.purchases.UiConfig invoke(kotlinx.serialization.json.c merged) {
        kotlin.jvm.internal.m.e(merged, "merged");
        try {
            p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
            json.getClass();
            return json.a(com.revenuecat.purchases.UiConfig.INSTANCE.serializer(), merged);
        } catch (p119n8.j e6) {
            com.revenuecat.purchases.common.remoteconfig.RemoteConfigTopic remoteConfigTopic = this.$topic;
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to decode merged remote config blobs from topic '" + remoteConfigTopic.getWireName() + "' as JSON.", e6);
            return null;
        }
    }
}

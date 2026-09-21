package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ConfigTopic$contentHash$2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.common.remoteconfig.ConfigTopic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigTopic$contentHash$2(com.revenuecat.purchases.common.remoteconfig.ConfigTopic configTopic) {
        super(0);
        this.this$0 = configTopic;
    }

    @Override // kotlin.jvm.functions.Function0
    public final java.lang.String invoke() {
        return com.revenuecat.purchases.common.remoteconfig.ConfigTopic.Companion.computeHash(this.this$0.getItems());
    }
}

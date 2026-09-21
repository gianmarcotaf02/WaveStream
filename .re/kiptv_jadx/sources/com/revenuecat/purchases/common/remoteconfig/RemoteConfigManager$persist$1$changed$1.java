package com.revenuecat.purchases.common.remoteconfig;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<name for destructuring parameter 0>", "", "", "Lcom/revenuecat/purchases/common/remoteconfig/ConfigTopic;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class RemoteConfigManager$persist$1$changed$1 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$persist$1$changed$1 INSTANCE = new com.revenuecat.purchases.common.remoteconfig.RemoteConfigManager$persist$1$changed$1();

    public RemoteConfigManager$persist$1$changed$1() {
        super(1);
    }

    @Override // p194x6.j
    public final java.lang.CharSequence invoke(java.util.Map.Entry<java.lang.String, com.revenuecat.purchases.common.remoteconfig.ConfigTopic> entry) {
        kotlin.jvm.internal.m.e(entry, "<name for destructuring parameter 0>");
        java.lang.String key = entry.getKey();
        com.revenuecat.purchases.common.remoteconfig.ConfigTopic value = entry.getValue();
        java.lang.StringBuilder sbN = Y6.f.n(key, " -> items=");
        sbN.append(value.keySet());
        return sbN.toString();
    }
}

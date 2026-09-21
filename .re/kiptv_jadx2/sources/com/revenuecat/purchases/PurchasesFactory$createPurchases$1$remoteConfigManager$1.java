package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.caching.DeviceCache;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesFactory$createPurchases$1$remoteConfigManager$1 extends o implements Function0 {
    final DeviceCache $cache;

    public PurchasesFactory$createPurchases$1$remoteConfigManager$1(DeviceCache deviceCache) {
        super(0);
        this.$cache = deviceCache;
    }

    @Override
    public final String invoke() {
        return this.$cache.getCachedAppUserID$purchases_defaultsRelease();
    }
}

package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/PurchasesServices;", "", "()V", "default", "Lcom/revenuecat/purchases/PurchasesServiceDispatcher;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PurchasesServices {
    public static final PurchasesServices INSTANCE = new PurchasesServices();

    private PurchasesServices() {
    }

    public final PurchasesServiceDispatcher m74default() {
        return new ServiceLoaderDispatcher();
    }
}

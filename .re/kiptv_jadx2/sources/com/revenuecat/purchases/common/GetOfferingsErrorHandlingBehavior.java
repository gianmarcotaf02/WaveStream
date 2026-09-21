package com.revenuecat.purchases.common;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/GetOfferingsErrorHandlingBehavior;", "", "(Ljava/lang/String;I)V", "SHOULD_FALLBACK_TO_CACHED_OFFERINGS", "SHOULD_NOT_FALLBACK", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public enum GetOfferingsErrorHandlingBehavior {
    SHOULD_FALLBACK_TO_CACHED_OFFERINGS,
    SHOULD_NOT_FALLBACK
}

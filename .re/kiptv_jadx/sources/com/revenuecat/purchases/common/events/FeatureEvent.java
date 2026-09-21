package com.revenuecat.purchases.common.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/events/FeatureEvent;", "", "isPriorityEvent", "", "()Z", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public interface FeatureEvent {

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isPriorityEvent(com.revenuecat.purchases.common.events.FeatureEvent featureEvent) {
            return com.revenuecat.purchases.common.events.FeatureEvent.super.isPriorityEvent();
        }
    }

    default boolean isPriorityEvent() {
        return false;
    }
}

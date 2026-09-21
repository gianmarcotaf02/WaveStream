package com.revenuecat.purchases.ads.events;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\rJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0017\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/ads/events/AdTracker;", "", "Lcom/revenuecat/purchases/common/events/EventsManager;", "eventsManager", "<init>", "(Lcom/revenuecat/purchases/common/events/EventsManager;)V", "Lcom/revenuecat/purchases/ads/events/types/AdDisplayedData;", "data", "Lh6/A;", "trackAdDisplayed", "(Lcom/revenuecat/purchases/ads/events/types/AdDisplayedData;)V", "Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;", "captureMethod", "(Lcom/revenuecat/purchases/ads/events/types/AdDisplayedData;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;)V", "Lcom/revenuecat/purchases/ads/events/types/AdOpenedData;", "trackAdOpened", "(Lcom/revenuecat/purchases/ads/events/types/AdOpenedData;)V", "(Lcom/revenuecat/purchases/ads/events/types/AdOpenedData;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;)V", "Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;", "trackAdRevenue", "(Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;)V", "(Lcom/revenuecat/purchases/ads/events/types/AdRevenueData;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;)V", "Lcom/revenuecat/purchases/ads/events/types/AdLoadedData;", "trackAdLoaded", "(Lcom/revenuecat/purchases/ads/events/types/AdLoadedData;)V", "(Lcom/revenuecat/purchases/ads/events/types/AdLoadedData;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;)V", "Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;", "trackAdFailedToLoad", "(Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;)V", "(Lcom/revenuecat/purchases/ads/events/types/AdFailedToLoadData;Lcom/revenuecat/purchases/ads/events/AdCaptureMethod;)V", "Lcom/revenuecat/purchases/common/events/EventsManager;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AdTracker {
    private final com.revenuecat.purchases.common.events.EventsManager eventsManager;

    public AdTracker(com.revenuecat.purchases.common.events.EventsManager eventsManager) {
        kotlin.jvm.internal.m.e(eventsManager, "eventsManager");
        this.eventsManager = eventsManager;
    }

    public final void trackAdDisplayed(com.revenuecat.purchases.ads.events.types.AdDisplayedData data) {
        kotlin.jvm.internal.m.e(data, "data");
        trackAdDisplayed(data, com.revenuecat.purchases.ads.events.AdCaptureMethod.MANUAL);
    }

    public final void trackAdFailedToLoad(com.revenuecat.purchases.ads.events.types.AdFailedToLoadData data) {
        kotlin.jvm.internal.m.e(data, "data");
        trackAdFailedToLoad(data, com.revenuecat.purchases.ads.events.AdCaptureMethod.MANUAL);
    }

    public final void trackAdLoaded(com.revenuecat.purchases.ads.events.types.AdLoadedData data) {
        kotlin.jvm.internal.m.e(data, "data");
        trackAdLoaded(data, com.revenuecat.purchases.ads.events.AdCaptureMethod.MANUAL);
    }

    public final void trackAdOpened(com.revenuecat.purchases.ads.events.types.AdOpenedData data) {
        kotlin.jvm.internal.m.e(data, "data");
        trackAdOpened(data, com.revenuecat.purchases.ads.events.AdCaptureMethod.MANUAL);
    }

    public final void trackAdRevenue(com.revenuecat.purchases.ads.events.types.AdRevenueData data) {
        kotlin.jvm.internal.m.e(data, "data");
        trackAdRevenue(data, com.revenuecat.purchases.ads.events.AdCaptureMethod.MANUAL);
    }

    public final void trackAdDisplayed(com.revenuecat.purchases.ads.events.types.AdDisplayedData data, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
        this.eventsManager.track(new com.revenuecat.purchases.ads.events.AdEvent.Displayed(null, 0, null, 0L, data.getNetworkName(), data.getMediatorName(), data.getAdFormat(), data.getPlacement(), data.getAdUnitId(), data.getImpressionId(), captureMethod, 15, null));
    }

    public final void trackAdFailedToLoad(com.revenuecat.purchases.ads.events.types.AdFailedToLoadData data, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
        this.eventsManager.track(new com.revenuecat.purchases.ads.events.AdEvent.FailedToLoad(null, 0, null, 0L, data.getMediatorName(), data.getAdFormat(), data.getPlacement(), data.getAdUnitId(), null, captureMethod, data.getMediatorErrorCode(), 15, null));
    }

    public final void trackAdLoaded(com.revenuecat.purchases.ads.events.types.AdLoadedData data, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
        this.eventsManager.track(new com.revenuecat.purchases.ads.events.AdEvent.Loaded(null, 0, null, 0L, data.getNetworkName(), data.getMediatorName(), data.getAdFormat(), data.getPlacement(), data.getAdUnitId(), data.getImpressionId(), captureMethod, 15, null));
    }

    public final void trackAdOpened(com.revenuecat.purchases.ads.events.types.AdOpenedData data, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
        this.eventsManager.track(new com.revenuecat.purchases.ads.events.AdEvent.Open(null, 0, null, 0L, data.getNetworkName(), data.getMediatorName(), data.getAdFormat(), data.getPlacement(), data.getAdUnitId(), data.getImpressionId(), captureMethod, 15, null));
    }

    public final void trackAdRevenue(com.revenuecat.purchases.ads.events.types.AdRevenueData data, com.revenuecat.purchases.ads.events.AdCaptureMethod captureMethod) {
        kotlin.jvm.internal.m.e(data, "data");
        kotlin.jvm.internal.m.e(captureMethod, "captureMethod");
        this.eventsManager.track(new com.revenuecat.purchases.ads.events.AdEvent.Revenue(null, 0, null, 0L, data.getNetworkName(), data.getMediatorName(), data.getAdFormat(), data.getPlacement(), data.getAdUnitId(), data.getImpressionId(), captureMethod, data.getRevenueMicros(), data.getCurrency(), data.getPrecision(), 15, null));
    }
}

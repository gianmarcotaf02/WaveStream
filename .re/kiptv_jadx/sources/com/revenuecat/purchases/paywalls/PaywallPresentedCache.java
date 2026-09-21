package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\f8B@BX\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/PaywallPresentedCache;", "", "<init>", "()V", "", "hasCachedPurchaseInitiatedData", "()Z", "", "", "purchasedProductIDs", "", "purchaseTimestamp", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "getAndRemovePurchaseInitiatedEventIfNeeded", "(Ljava/util/List;Ljava/lang/Long;)Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "event", "Lh6/A;", "receiveEvent", "(Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;)V", "<set-?>", "lastPurchaseInitiatedEvent", "Lcom/revenuecat/purchases/paywalls/events/PaywallEvent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallPresentedCache {
    private com.revenuecat.purchases.paywalls.events.PaywallEvent lastPurchaseInitiatedEvent;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.paywalls.events.PaywallEventType.values().length];
            try {
                iArr[com.revenuecat.purchases.paywalls.events.PaywallEventType.PURCHASE_INITIATED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.paywalls.events.PaywallEventType.CANCEL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.paywalls.events.PaywallEventType.PURCHASE_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final synchronized com.revenuecat.purchases.paywalls.events.PaywallEvent getAndRemovePurchaseInitiatedEventIfNeeded(java.util.List<java.lang.String> purchasedProductIDs, java.lang.Long purchaseTimestamp) {
        try {
            kotlin.jvm.internal.m.e(purchasedProductIDs, "purchasedProductIDs");
            com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent = this.lastPurchaseInitiatedEvent;
            if (paywallEvent != null) {
                boolean z6 = false;
                if (purchaseTimestamp != null) {
                    if (paywallEvent.getCreationData().getDate().getTime() <= purchaseTimestamp.longValue()) {
                        z6 = true;
                    }
                }
                if (paywallEvent.getType() == com.revenuecat.purchases.paywalls.events.PaywallEventType.PURCHASE_INITIATED && p078i6.o.b1(purchasedProductIDs, paywallEvent.getData().getProductIdentifier()) && z6) {
                    com.revenuecat.purchases.paywalls.events.PaywallEvent paywallEvent2 = this.lastPurchaseInitiatedEvent;
                    this.lastPurchaseInitiatedEvent = null;
                    return paywallEvent2;
                }
            }
            return null;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }

    public final boolean hasCachedPurchaseInitiatedData() {
        return this.lastPurchaseInitiatedEvent != null;
    }

    public final synchronized void receiveEvent(com.revenuecat.purchases.paywalls.events.PaywallEvent event) {
        try {
            kotlin.jvm.internal.m.e(event, "event");
            int i3 = com.revenuecat.purchases.paywalls.PaywallPresentedCache.WhenMappings.$EnumSwitchMapping$0[event.getType().ordinal()];
            if (i3 == 1) {
                com.revenuecat.purchases.LogLevel logLevel = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.v("[Purchases] - " + logLevel.name(), "Caching paywall purchase initiated event.");
                }
                this.lastPurchaseInitiatedEvent = event;
            } else if (i3 == 2 || i3 == 3) {
                com.revenuecat.purchases.LogLevel logLevel2 = com.revenuecat.purchases.LogLevel.VERBOSE;
                com.revenuecat.purchases.LogHandler currentLogHandler2 = com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler();
                if (com.revenuecat.purchases.common.Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
                    currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "Clearing cached paywall purchase initiated event.");
                }
                this.lastPurchaseInitiatedEvent = null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}

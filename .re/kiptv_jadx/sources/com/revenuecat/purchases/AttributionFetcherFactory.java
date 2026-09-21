package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/revenuecat/purchases/AttributionFetcherFactory;", "", "()V", "createAttributionFetcher", "Lcom/revenuecat/purchases/common/subscriberattributes/DeviceIdentifiersFetcher;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "dispatcher", "Lcom/revenuecat/purchases/common/Dispatcher;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class AttributionFetcherFactory {
    public static final com.revenuecat.purchases.AttributionFetcherFactory INSTANCE = new com.revenuecat.purchases.AttributionFetcherFactory();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.Store.values().length];
            try {
                iArr[com.revenuecat.purchases.Store.PLAY_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.AMAZON.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.GALAXY.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private AttributionFetcherFactory() {
    }

    public final com.revenuecat.purchases.common.subscriberattributes.DeviceIdentifiersFetcher createAttributionFetcher(com.revenuecat.purchases.Store store, com.revenuecat.purchases.common.Dispatcher dispatcher) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(dispatcher, "dispatcher");
        int i3 = com.revenuecat.purchases.AttributionFetcherFactory.WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i3 == 1) {
            return new com.revenuecat.purchases.google.attribution.GoogleDeviceIdentifiersFetcher(dispatcher);
        }
        if (i3 == 2) {
            return new com.revenuecat.purchases.amazon.attribution.AmazonDeviceIdentifiersFetcher();
        }
        if (i3 == 3) {
            return new com.revenuecat.purchases.galaxy.attribution.GalaxyDeviceIdentifiersFetcher();
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Incompatible store (" + store + ") used", null);
        throw new java.lang.IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}

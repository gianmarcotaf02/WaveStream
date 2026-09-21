package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/OfferingParserFactory;", "", "()V", "createOfferingParser", "Lcom/revenuecat/purchases/common/OfferingParser;", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "shouldParsePaywallComponents", "Lkotlin/Function0;", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingParserFactory {
    public static final com.revenuecat.purchases.OfferingParserFactory INSTANCE = new com.revenuecat.purchases.OfferingParserFactory();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.revenuecat.purchases.Store.values().length];
            try {
                iArr[com.revenuecat.purchases.Store.TEST_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.PLAY_STORE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.AMAZON.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.GALAXY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.OfferingParserFactory$createOfferingParser$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.OfferingParserFactory.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.OfferingParserFactory.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Boolean invoke() {
            return java.lang.Boolean.TRUE;
        }
    }

    private OfferingParserFactory() {
    }

    public static /* synthetic */ com.revenuecat.purchases.common.OfferingParser createOfferingParser$default(com.revenuecat.purchases.OfferingParserFactory offeringParserFactory, com.revenuecat.purchases.Store store, kotlin.jvm.functions.Function0 function0, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            function0 = com.revenuecat.purchases.OfferingParserFactory.AnonymousClass1.INSTANCE;
        }
        return offeringParserFactory.createOfferingParser(store, function0);
    }

    public final com.revenuecat.purchases.common.OfferingParser createOfferingParser(com.revenuecat.purchases.Store store, kotlin.jvm.functions.Function0 shouldParsePaywallComponents) {
        kotlin.jvm.internal.m.e(store, "store");
        kotlin.jvm.internal.m.e(shouldParsePaywallComponents, "shouldParsePaywallComponents");
        int i3 = com.revenuecat.purchases.OfferingParserFactory.WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i3 == 1) {
            return new com.revenuecat.purchases.simulatedstore.SimulatedStoreOfferingParser(shouldParsePaywallComponents);
        }
        if (i3 == 2) {
            return new com.revenuecat.purchases.common.GoogleOfferingParser(shouldParsePaywallComponents);
        }
        if (i3 == 3) {
            return new com.revenuecat.purchases.amazon.AmazonOfferingParser(shouldParsePaywallComponents);
        }
        if (i3 == 4) {
            return new com.revenuecat.purchases.galaxy.GalaxyOfferingParser(shouldParsePaywallComponents);
        }
        com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Incompatible store (" + store + ") used", null);
        throw new java.lang.IllegalArgumentException("Couldn't configure SDK. Incompatible store (" + store + ") used");
    }
}

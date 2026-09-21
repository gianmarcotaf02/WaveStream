package com.revenuecat.purchases.models;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0002H\u0000\u001a\u0016\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\f\u0010\f\u001a\u00020\r*\u00020\u0002H\u0000\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0000\u001a\f\u0010\u0010\u001a\u00020\u0002*\u00020\rH\u0000\u001a\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0012H\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0013"}, d2 = {"storeReplacementModeMappings", "", "Lcom/revenuecat/purchases/models/StoreReplacementMode;", "Lcom/revenuecat/purchases/models/StoreReplacementModeMapping;", "mapping", "getMapping", "(Lcom/revenuecat/purchases/models/StoreReplacementMode;)Lcom/revenuecat/purchases/models/StoreReplacementModeMapping;", "legacyPlayBackendName", "", "storeBackendName", com.revenuecat.purchases.common.responses.ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "toGoogleReplacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "toPlayBillingClientMode", "", "toStoreReplacementMode", "toStoreReplacementModeOrNull", "Lcom/revenuecat/purchases/ReplacementMode;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class StoreReplacementModeConversionsKt {
    private static final java.util.Map<com.revenuecat.purchases.models.StoreReplacementMode, com.revenuecat.purchases.models.StoreReplacementModeMapping> storeReplacementModeMappings = p078i6.C.N0(new p070h6.k(com.revenuecat.purchases.models.StoreReplacementMode.WITHOUT_PRORATION, new com.revenuecat.purchases.models.StoreReplacementModeMapping(3, "IMMEDIATE_WITHOUT_PRORATION", "INSTANT_NO_PRORATION", com.revenuecat.purchases.models.GoogleReplacementMode.WITHOUT_PRORATION)), new p070h6.k(com.revenuecat.purchases.models.StoreReplacementMode.WITH_TIME_PRORATION, new com.revenuecat.purchases.models.StoreReplacementModeMapping(1, "IMMEDIATE_WITH_TIME_PRORATION", "INSTANT_PRORATED_DATE", com.revenuecat.purchases.models.GoogleReplacementMode.WITH_TIME_PRORATION)), new p070h6.k(com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_FULL_PRICE, new com.revenuecat.purchases.models.StoreReplacementModeMapping(5, "IMMEDIATE_AND_CHARGE_FULL_PRICE", null, com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_FULL_PRICE)), new p070h6.k(com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_PRORATED_PRICE, new com.revenuecat.purchases.models.StoreReplacementModeMapping(2, "IMMEDIATE_AND_CHARGE_PRORATED_PRICE", "INSTANT_PRORATED_CHARGE", com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_PRORATED_PRICE)), new p070h6.k(com.revenuecat.purchases.models.StoreReplacementMode.DEFERRED, new com.revenuecat.purchases.models.StoreReplacementModeMapping(6, "DEFERRED", "DEFERRED", com.revenuecat.purchases.models.GoogleReplacementMode.DEFERRED)));

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.revenuecat.purchases.Store.values().length];
            try {
                iArr[com.revenuecat.purchases.Store.PLAY_STORE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.revenuecat.purchases.Store.GALAXY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.revenuecat.purchases.models.GoogleReplacementMode.values().length];
            try {
                iArr2[com.revenuecat.purchases.models.GoogleReplacementMode.WITHOUT_PRORATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.revenuecat.purchases.models.GoogleReplacementMode.WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.revenuecat.purchases.models.GoogleReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.revenuecat.purchases.models.GoogleReplacementMode.DEFERRED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final com.revenuecat.purchases.models.StoreReplacementModeMapping getMapping(com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode) {
        return (com.revenuecat.purchases.models.StoreReplacementModeMapping) p078i6.C.M0(storeReplacementMode, storeReplacementModeMappings);
    }

    public static final java.lang.String legacyPlayBackendName(com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode) {
        kotlin.jvm.internal.m.e(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getLegacyPlayBackendName();
    }

    public static final java.lang.String storeBackendName(com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode, com.revenuecat.purchases.Store store) {
        kotlin.jvm.internal.m.e(storeReplacementMode, "<this>");
        kotlin.jvm.internal.m.e(store, "store");
        int i3 = com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.WhenMappings.$EnumSwitchMapping$0[store.ordinal()];
        if (i3 == 1) {
            return legacyPlayBackendName(storeReplacementMode);
        }
        if (i3 != 2) {
            return null;
        }
        return getMapping(storeReplacementMode).getGalaxyBackendName();
    }

    public static final com.revenuecat.purchases.models.GoogleReplacementMode toGoogleReplacementMode(com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode) {
        kotlin.jvm.internal.m.e(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getGoogleReplacementMode();
    }

    public static final int toPlayBillingClientMode(com.revenuecat.purchases.models.StoreReplacementMode storeReplacementMode) {
        kotlin.jvm.internal.m.e(storeReplacementMode, "<this>");
        return getMapping(storeReplacementMode).getPlayBillingClientMode();
    }

    public static final com.revenuecat.purchases.models.StoreReplacementMode toStoreReplacementMode(com.revenuecat.purchases.models.GoogleReplacementMode googleReplacementMode) {
        kotlin.jvm.internal.m.e(googleReplacementMode, "<this>");
        int i3 = com.revenuecat.purchases.models.StoreReplacementModeConversionsKt.WhenMappings.$EnumSwitchMapping$1[googleReplacementMode.ordinal()];
        if (i3 == 1) {
            return com.revenuecat.purchases.models.StoreReplacementMode.WITHOUT_PRORATION;
        }
        if (i3 == 2) {
            return com.revenuecat.purchases.models.StoreReplacementMode.WITH_TIME_PRORATION;
        }
        if (i3 == 3) {
            return com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_FULL_PRICE;
        }
        if (i3 == 4) {
            return com.revenuecat.purchases.models.StoreReplacementMode.CHARGE_PRORATED_PRICE;
        }
        if (i3 == 5) {
            return com.revenuecat.purchases.models.StoreReplacementMode.DEFERRED;
        }
        throw new I3.b();
    }

    public static final com.revenuecat.purchases.models.StoreReplacementMode toStoreReplacementModeOrNull(com.revenuecat.purchases.ReplacementMode replacementMode) {
        if (replacementMode == null) {
            return null;
        }
        if (replacementMode instanceof com.revenuecat.purchases.models.StoreReplacementMode) {
            return (com.revenuecat.purchases.models.StoreReplacementMode) replacementMode;
        }
        if (replacementMode instanceof com.revenuecat.purchases.models.GoogleReplacementMode) {
            return toStoreReplacementMode((com.revenuecat.purchases.models.GoogleReplacementMode) replacementMode);
        }
        return null;
    }
}

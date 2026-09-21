package com.revenuecat.purchases.galaxy;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;", "", "()V", "createGalaxyBillingWrapper", "Lcom/revenuecat/purchases/common/BillingAbstract;", "stateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "context", "Landroid/content/Context;", "billingMode", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "handleMissingConstructor", "", "e", "Ljava/lang/NoSuchMethodException;", "handleMissingGalaxyModule", "Ljava/lang/ClassNotFoundException;", "handleWrapperCreationFailure", "Ljava/lang/ReflectiveOperationException;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GalaxyBillingWrapperFactory {
    public static final com.revenuecat.purchases.galaxy.GalaxyBillingWrapperFactory INSTANCE = new com.revenuecat.purchases.galaxy.GalaxyBillingWrapperFactory();

    private GalaxyBillingWrapperFactory() {
    }

    private final java.lang.Void handleMissingConstructor(java.lang.NoSuchMethodException e6) {
        throw new java.lang.IllegalStateException("Failed to find GalaxyBillingWrapper constructor. Please ensure that you've declared a dependency on the purchases-galaxy module.", e6);
    }

    private final java.lang.Void handleMissingGalaxyModule(java.lang.ClassNotFoundException e6) {
        java.lang.NoClassDefFoundError noClassDefFoundError = new java.lang.NoClassDefFoundError(e6.getMessage());
        noClassDefFoundError.initCause(e6);
        throw noClassDefFoundError;
    }

    private final java.lang.Void handleWrapperCreationFailure(java.lang.ReflectiveOperationException e6) {
        throw new java.lang.IllegalStateException("Failed to create GalaxyBillingWrapper", e6);
    }

    public final com.revenuecat.purchases.common.BillingAbstract createGalaxyBillingWrapper(com.revenuecat.purchases.PurchasesStateProvider stateProvider, android.content.Context context, com.revenuecat.purchases.galaxy.GalaxyBillingMode billingMode, com.revenuecat.purchases.common.caching.DeviceCache deviceCache) {
        kotlin.jvm.internal.m.e(stateProvider, "stateProvider");
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(billingMode, "billingMode");
        kotlin.jvm.internal.m.e(deviceCache, "deviceCache");
        try {
            java.lang.Object wrapperInstance = java.lang.Class.forName("com.revenuecat.purchases.galaxy.GalaxyBillingWrapper").getDeclaredConstructor(com.revenuecat.purchases.PurchasesStateProvider.class, android.content.Context.class, com.revenuecat.purchases.galaxy.GalaxyBillingMode.class, com.revenuecat.purchases.common.caching.DeviceCache.class).newInstance(stateProvider, context, billingMode, deviceCache);
            if (!(wrapperInstance instanceof com.revenuecat.purchases.common.BillingAbstract)) {
                throw new java.lang.IllegalStateException("GalaxyBillingWrapper does not implement BillingAbstract");
            }
            kotlin.jvm.internal.m.d(wrapperInstance, "wrapperInstance");
            return (com.revenuecat.purchases.common.BillingAbstract) wrapperInstance;
        } catch (java.lang.ClassNotFoundException e6) {
            handleMissingGalaxyModule(e6);
            throw new I3.b();
        } catch (java.lang.NoSuchMethodException e9) {
            handleMissingConstructor(e9);
            throw new I3.b();
        } catch (java.lang.ReflectiveOperationException e10) {
            handleWrapperCreationFailure(e10);
            throw new I3.b();
        }
    }
}

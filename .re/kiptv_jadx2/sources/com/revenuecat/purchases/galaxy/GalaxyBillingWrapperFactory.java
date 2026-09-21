package com.revenuecat.purchases.galaxy;

import I3.b;
import android.content.Context;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.PurchasesStateProvider;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.caching.DeviceCache;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014H\u0002¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/galaxy/GalaxyBillingWrapperFactory;", "", "()V", "createGalaxyBillingWrapper", "Lcom/revenuecat/purchases/common/BillingAbstract;", "stateProvider", "Lcom/revenuecat/purchases/PurchasesStateProvider;", "context", "Landroid/content/Context;", "billingMode", "Lcom/revenuecat/purchases/galaxy/GalaxyBillingMode;", "deviceCache", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "handleMissingConstructor", "", "e", "Ljava/lang/NoSuchMethodException;", "handleMissingGalaxyModule", "Ljava/lang/ClassNotFoundException;", "handleWrapperCreationFailure", "Ljava/lang/ReflectiveOperationException;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class GalaxyBillingWrapperFactory {
    public static final GalaxyBillingWrapperFactory INSTANCE = new GalaxyBillingWrapperFactory();

    private GalaxyBillingWrapperFactory() {
    }

    private final Void handleMissingConstructor(NoSuchMethodException e6) {
        throw new IllegalStateException("Failed to find GalaxyBillingWrapper constructor. Please ensure that you've declared a dependency on the purchases-galaxy module.", e6);
    }

    private final Void handleMissingGalaxyModule(ClassNotFoundException e6) {
        NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError(e6.getMessage());
        noClassDefFoundError.initCause(e6);
        throw noClassDefFoundError;
    }

    private final Void handleWrapperCreationFailure(ReflectiveOperationException e6) {
        throw new IllegalStateException("Failed to create GalaxyBillingWrapper", e6);
    }

    public final BillingAbstract createGalaxyBillingWrapper(PurchasesStateProvider stateProvider, Context context, GalaxyBillingMode billingMode, DeviceCache deviceCache) {
        m.e(stateProvider, "stateProvider");
        m.e(context, "context");
        m.e(billingMode, "billingMode");
        m.e(deviceCache, "deviceCache");
        try {
            Object wrapperInstance = Class.forName("com.revenuecat.purchases.galaxy.GalaxyBillingWrapper").getDeclaredConstructor(PurchasesStateProvider.class, Context.class, GalaxyBillingMode.class, DeviceCache.class).newInstance(stateProvider, context, billingMode, deviceCache);
            if (!(wrapperInstance instanceof BillingAbstract)) {
                throw new IllegalStateException("GalaxyBillingWrapper does not implement BillingAbstract");
            }
            m.d(wrapperInstance, "wrapperInstance");
            return (BillingAbstract) wrapperInstance;
        } catch (ClassNotFoundException e6) {
            handleMissingGalaxyModule(e6);
            throw new b();
        } catch (NoSuchMethodException e9) {
            handleMissingConstructor(e9);
            throw new b();
        } catch (ReflectiveOperationException e10) {
            handleWrapperCreationFailure(e10);
            throw new b();
        }
    }
}

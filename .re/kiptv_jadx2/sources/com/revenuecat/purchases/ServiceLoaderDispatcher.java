package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.LogWrapperKt;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p070h6.A;
import p070h6.n;
import p078i6.o;
import p078i6.w;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u0004*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/ServiceLoaderDispatcher;", "Lcom/revenuecat/purchases/PurchasesServiceDispatcher;", "<init>", "()V", "Lh6/A;", "closeServices", "Lcom/revenuecat/purchases/PurchasesService;", "Lcom/revenuecat/purchases/Purchases;", "purchases", "safelyInitialize", "(Lcom/revenuecat/purchases/PurchasesService;Lcom/revenuecat/purchases/Purchases;)V", "safelyClose", "", "loadServices", "()Ljava/util/List;", "initialize", "(Lcom/revenuecat/purchases/Purchases;)V", "close", "services", "Ljava/util/List;", "configuredPurchases", "Lcom/revenuecat/purchases/Purchases;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
final class ServiceLoaderDispatcher implements PurchasesServiceDispatcher {
    private Purchases configuredPurchases;
    private List<? extends PurchasesService> services = w.f23205h;

    private final void closeServices() {
        Purchases purchases = this.configuredPurchases;
        if (purchases == null) {
            return;
        }
        Iterator<T> it = this.services.iterator();
        while (it.hasNext()) {
            safelyClose((PurchasesService) it.next(), purchases);
        }
        this.services = w.f23205h;
        this.configuredPurchases = null;
    }

    private final List<PurchasesService> loadServices() {
        Object objT;
        try {
            ServiceLoader serviceLoaderLoad = ServiceLoader.load(PurchasesService.class, PurchasesService.class.getClassLoader());
            m.d(serviceLoaderLoad, "load(\n            Purcha…va.classLoader,\n        )");
            objT = o.N1(serviceLoaderLoad);
        } catch (Throwable th) {
            objT = P.T(th);
        }
        Throwable thA = n.a(objT);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Failed to load PurchasesService implementations.", thA);
            objT = w.f23205h;
        }
        return (List) objT;
    }

    private final void safelyClose(PurchasesService purchasesService, Purchases purchases) {
        Object objT;
        try {
            purchasesService.close(purchases);
            objT = A.f22523a;
        } catch (Throwable th) {
            objT = P.T(th);
        }
        Throwable thA = n.a(objT);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "PurchasesService " + purchasesService.getClass().getName() + " threw during close.", thA);
        }
    }

    private final void safelyInitialize(PurchasesService purchasesService, Purchases purchases) {
        Object objT;
        try {
            purchasesService.initialize(purchases);
            objT = A.f22523a;
        } catch (Throwable th) {
            objT = P.T(th);
        }
        Throwable thA = n.a(objT);
        if (thA != null) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "PurchasesService " + purchasesService.getClass().getName() + " threw during initialize.", thA);
        }
    }

    @Override
    public synchronized void close(Purchases purchases) {
        m.e(purchases, "purchases");
        closeServices();
    }

    @Override
    public synchronized void initialize(Purchases purchases) {
        m.e(purchases, "purchases");
        closeServices();
        List<PurchasesService> listLoadServices = loadServices();
        this.services = listLoadServices;
        this.configuredPurchases = purchases;
        Iterator<T> it = listLoadServices.iterator();
        while (it.hasNext()) {
            safelyInitialize((PurchasesService) it.next(), purchases);
        }
    }
}

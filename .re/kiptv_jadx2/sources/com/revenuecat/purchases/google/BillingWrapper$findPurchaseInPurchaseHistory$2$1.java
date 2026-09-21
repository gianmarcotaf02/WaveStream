package com.revenuecat.purchases.google;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchasesList", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class BillingWrapper$findPurchaseInPurchaseHistory$2$1 extends o implements j {
    final j $onCompletion;
    final j $onError;
    final String $productId;

    public BillingWrapper$findPurchaseInPurchaseHistory$2$1(j jVar, String str, j jVar2) {
        super(1);
        this.$onCompletion = jVar;
        this.$productId = str;
        this.$onError = jVar2;
    }

    public final void invoke(List<StoreTransaction> purchasesList) {
        Object next;
        m.e(purchasesList, "purchasesList");
        String str = this.$productId;
        Iterator<T> it = purchasesList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((StoreTransaction) next).getProductIds().contains(str));
        StoreTransaction storeTransaction = (StoreTransaction) next;
        if (storeTransaction != null) {
            this.$onCompletion.invoke(storeTransaction);
            return;
        }
        this.$onError.invoke(new PurchasesError(PurchasesErrorCode.PurchaseInvalidError, String.format(PurchaseStrings.NO_EXISTING_PURCHASE, Arrays.copyOf(new Object[]{this.$productId}, 1))));
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<StoreTransaction>) obj);
        return A.f22523a;
    }
}

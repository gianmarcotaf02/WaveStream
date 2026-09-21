package com.revenuecat.purchases;

import S7.InterfaceC0894j;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "", "userCancelled", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitPurchase$2$2 extends o implements m {
    final InterfaceC0894j $continuation;

    public CoroutinesExtensionsCommonKt$awaitPurchase$2$2(InterfaceC0894j interfaceC0894j) {
        super(2);
        this.$continuation = interfaceC0894j;
    }

    @Override
    public Object invoke(Object obj, Object obj2) {
        invoke((PurchasesError) obj, ((Boolean) obj2).booleanValue());
        return A.f22523a;
    }

    public final void invoke(PurchasesError purchasesError, boolean z6) {
        kotlin.jvm.internal.m.e(purchasesError, "purchasesError");
        CancellableContinuationExtensionsKt.safeResumeWithException(this.$continuation, new PurchasesTransactionException(purchasesError, z6));
    }
}

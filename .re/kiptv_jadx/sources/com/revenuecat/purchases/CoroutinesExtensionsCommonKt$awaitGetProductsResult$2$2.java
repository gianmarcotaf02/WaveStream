package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ S7.InterfaceC0894j $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(S7.InterfaceC0894j interfaceC0894j) {
        super(1);
        this.$continuation = interfaceC0894j;
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(java.util.List<? extends com.revenuecat.purchases.models.StoreProduct> storeProducts) {
        kotlin.jvm.internal.m.e(storeProducts, "storeProducts");
        com.revenuecat.purchases.common.CancellableContinuationExtensionsKt.safeResume(this.$continuation, new p070h6.n(storeProducts));
    }
}

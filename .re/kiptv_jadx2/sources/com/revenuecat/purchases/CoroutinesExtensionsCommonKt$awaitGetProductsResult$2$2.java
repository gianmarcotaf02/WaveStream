package com.revenuecat.purchases;

import S7.InterfaceC0894j;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p070h6.n;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProducts", "Lh6/A;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2 extends o implements j {
    final InterfaceC0894j $continuation;

    public CoroutinesExtensionsCommonKt$awaitGetProductsResult$2$2(InterfaceC0894j interfaceC0894j) {
        super(1);
        this.$continuation = interfaceC0894j;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return A.f22523a;
    }

    public final void invoke(List<? extends StoreProduct> storeProducts) {
        m.e(storeProducts, "storeProducts");
        CancellableContinuationExtensionsKt.safeResume(this.$continuation, new n(storeProducts));
    }
}

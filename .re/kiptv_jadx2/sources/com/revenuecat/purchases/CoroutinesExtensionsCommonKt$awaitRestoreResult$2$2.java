package com.revenuecat.purchases;

import S7.InterfaceC0894j;
import com.revenuecat.purchases.common.CancellableContinuationExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p070h6.n;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2 extends o implements j {
    final InterfaceC0894j $continuation;

    public CoroutinesExtensionsCommonKt$awaitRestoreResult$2$2(InterfaceC0894j interfaceC0894j) {
        super(1);
        this.$continuation = interfaceC0894j;
    }

    @Override
    public Object invoke(Object obj) {
        invoke((CustomerInfo) obj);
        return A.f22523a;
    }

    public final void invoke(CustomerInfo customerInfo) {
        m.e(customerInfo, "customerInfo");
        CancellableContinuationExtensionsKt.safeResume(this.$continuation, new n(customerInfo));
    }
}

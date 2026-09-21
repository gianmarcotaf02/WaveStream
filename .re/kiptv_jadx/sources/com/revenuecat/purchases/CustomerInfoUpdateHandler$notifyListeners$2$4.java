package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomerInfoUpdateHandler$notifyListeners$2$4 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ com.revenuecat.purchases.CustomerInfo $customerInfo;
    final /* synthetic */ com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerInfoUpdateHandler$notifyListeners$2$4(com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener updatedCustomerInfoListener, com.revenuecat.purchases.CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m35invoke();
        return p070h6.A.f22523a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m35invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}

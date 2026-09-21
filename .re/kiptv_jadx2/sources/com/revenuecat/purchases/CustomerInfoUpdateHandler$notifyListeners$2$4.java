package com.revenuecat.purchases;

import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.o;
import p070h6.A;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh6/A;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CustomerInfoUpdateHandler$notifyListeners$2$4 extends o implements Function0 {
    final CustomerInfo $customerInfo;
    final UpdatedCustomerInfoListener $listener;

    public CustomerInfoUpdateHandler$notifyListeners$2$4(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override
    public Object invoke() {
        m35invoke();
        return A.f22523a;
    }

    public final void m35invoke() {
        this.$listener.onReceived(this.$customerInfo);
    }
}

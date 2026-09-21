package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends kotlin.jvm.internal.o implements p194x6.m {
    final /* synthetic */ S7.InterfaceC0894j $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitLogIn$2$2(S7.InterfaceC0894j interfaceC0894j) {
        super(2);
        this.$continuation = interfaceC0894j;
    }

    @Override // p194x6.m
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        invoke((com.revenuecat.purchases.CustomerInfo) obj, ((java.lang.Boolean) obj2).booleanValue());
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.CustomerInfo customerInfo, boolean z6) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        com.revenuecat.purchases.common.CancellableContinuationExtensionsKt.safeResume(this.$continuation, new com.revenuecat.purchases.data.LogInResult(customerInfo, z6));
    }
}

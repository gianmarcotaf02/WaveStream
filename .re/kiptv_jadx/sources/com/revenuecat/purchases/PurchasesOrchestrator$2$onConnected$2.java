package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$2$onConnected$2 extends kotlin.jvm.internal.o implements p194x6.j {
    public static final com.revenuecat.purchases.PurchasesOrchestrator$2$onConnected$2 INSTANCE = new com.revenuecat.purchases.PurchasesOrchestrator$2$onConnected$2();

    public PurchasesOrchestrator$2$onConnected$2() {
        super(1);
    }

    @Override // p194x6.j
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke((com.revenuecat.purchases.PurchasesError) obj);
        return p070h6.A.f22523a;
    }

    public final void invoke(com.revenuecat.purchases.PurchasesError error) {
        kotlin.jvm.internal.m.e(error, "error");
        com.revenuecat.purchases.common.LogUtilsKt.errorLog(error);
    }
}

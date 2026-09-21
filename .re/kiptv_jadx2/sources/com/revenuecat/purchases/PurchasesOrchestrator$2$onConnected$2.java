package com.revenuecat.purchases;

import com.revenuecat.purchases.common.LogUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p070h6.A;
import p194x6.j;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lh6/A;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class PurchasesOrchestrator$2$onConnected$2 extends o implements j {
    public static final PurchasesOrchestrator$2$onConnected$2 INSTANCE = new PurchasesOrchestrator$2$onConnected$2();

    public PurchasesOrchestrator$2$onConnected$2() {
        super(1);
    }

    @Override
    public Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return A.f22523a;
    }

    public final void invoke(PurchasesError error) {
        m.e(error, "error");
        LogUtilsKt.errorLog(error);
    }
}

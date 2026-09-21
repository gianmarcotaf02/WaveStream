package com.revenuecat.purchases;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public /* synthetic */ class PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2$1 extends kotlin.jvm.internal.j implements p194x6.n {
    public PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2$1(java.lang.Object obj) {
        super(3, 0, com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer.class, obj, "onCurrentWorkflowLoaded", "onCurrentWorkflowLoaded(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.String str, p194x6.m mVar, p100l6.c cVar) {
        return ((com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer) this.receiver).onCurrentWorkflowLoaded(str, mVar, cVar);
    }
}

package com.revenuecat.purchases;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.workflows.WorkflowAssetPrewarmer;
import kotlin.Metadata;
import kotlin.jvm.internal.j;
import p194x6.m;
import p194x6.n;

@Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public class PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2$1 extends j implements n {
    public PurchasesFactory$createPurchases$1$workflowsConfigProvider$1$2$1(Object obj) {
        super(3, 0, WorkflowAssetPrewarmer.class, obj, "onCurrentWorkflowLoaded", "onCurrentWorkflowLoaded(Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override
    public final Object invoke(String str, m mVar, p100l6.c cVar) {
        return ((WorkflowAssetPrewarmer) this.receiver).onCurrentWorkflowLoaded(str, mVar, cVar);
    }
}

package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowsConfigProvider$warm$workflows$2$1$1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
    final /* synthetic */ java.lang.String $id;
    final /* synthetic */ byte[] $it;
    final /* synthetic */ com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkflowsConfigProvider$warm$workflows$2$1$1(com.revenuecat.purchases.common.workflows.WorkflowsConfigProvider workflowsConfigProvider, java.lang.String str, byte[] bArr) {
        super(0);
        this.this$0 = workflowsConfigProvider;
        this.$id = str;
        this.$it = bArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final com.revenuecat.purchases.common.workflows.PublishedWorkflow invoke() {
        return this.this$0.decodeWorkflow(this.$id, this.$it);
    }
}

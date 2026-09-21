package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowJsonParser;", "", "()V", "parsePublishedWorkflow", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "payload", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowJsonParser {
    public static final com.revenuecat.purchases.common.workflows.WorkflowJsonParser INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowJsonParser();

    private WorkflowJsonParser() {
    }

    public final com.revenuecat.purchases.common.workflows.PublishedWorkflow parsePublishedWorkflow(java.lang.String payload) {
        kotlin.jvm.internal.m.e(payload, "payload");
        p162s8.d json = com.revenuecat.purchases.JsonTools.INSTANCE.getJson();
        json.getClass();
        return (com.revenuecat.purchases.common.workflows.PublishedWorkflow) json.b(payload, com.revenuecat.purchases.common.workflows.PublishedWorkflow.INSTANCE.serializer());
    }
}

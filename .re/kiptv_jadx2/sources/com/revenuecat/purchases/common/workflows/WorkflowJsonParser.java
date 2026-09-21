package com.revenuecat.purchases.common.workflows;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.JsonTools;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p162s8.d;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowJsonParser;", "", "()V", "parsePublishedWorkflow", "Lcom/revenuecat/purchases/common/workflows/PublishedWorkflow;", "payload", "", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowJsonParser {
    public static final WorkflowJsonParser INSTANCE = new WorkflowJsonParser();

    private WorkflowJsonParser() {
    }

    public final PublishedWorkflow parsePublishedWorkflow(String payload) {
        m.e(payload, "payload");
        d json = JsonTools.INSTANCE.getJson();
        json.getClass();
        return (PublishedWorkflow) json.b(payload, PublishedWorkflow.INSTANCE.serializer());
    }
}

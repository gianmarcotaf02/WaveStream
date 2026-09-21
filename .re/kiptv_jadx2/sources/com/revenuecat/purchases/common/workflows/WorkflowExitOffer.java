package com.revenuecat.purchases.common.workflows;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "", "offeringId", "", "stepId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getStepId", "component1", "component2", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowExitOffer {
    private final String offeringId;
    private final String stepId;

    public WorkflowExitOffer(String offeringId, String stepId) {
        m.e(offeringId, "offeringId");
        m.e(stepId, "stepId");
        this.offeringId = offeringId;
        this.stepId = stepId;
    }

    public static WorkflowExitOffer copy$default(WorkflowExitOffer workflowExitOffer, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = workflowExitOffer.offeringId;
        }
        if ((i3 & 2) != 0) {
            str2 = workflowExitOffer.stepId;
        }
        return workflowExitOffer.copy(str, str2);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final WorkflowExitOffer copy(String offeringId, String stepId) {
        m.e(offeringId, "offeringId");
        m.e(stepId, "stepId");
        return new WorkflowExitOffer(offeringId, stepId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowExitOffer)) {
            return false;
        }
        WorkflowExitOffer workflowExitOffer = (WorkflowExitOffer) other;
        return m.a(this.offeringId, workflowExitOffer.offeringId) && m.a(this.stepId, workflowExitOffer.stepId);
    }

    public final String getOfferingId() {
        return this.offeringId;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.offeringId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowExitOffer(offeringId=");
        sb.append(this.offeringId);
        sb.append(", stepId=");
        return f.l(sb, this.stepId, ')');
    }
}

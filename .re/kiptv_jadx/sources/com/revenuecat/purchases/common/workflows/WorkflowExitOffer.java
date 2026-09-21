package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowExitOffer;", "", "offeringId", "", "stepId", "(Ljava/lang/String;Ljava/lang/String;)V", "getOfferingId", "()Ljava/lang/String;", "getStepId", "component1", "component2", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class WorkflowExitOffer {
    private final java.lang.String offeringId;
    private final java.lang.String stepId;

    public WorkflowExitOffer(java.lang.String offeringId, java.lang.String stepId) {
        kotlin.jvm.internal.m.e(offeringId, "offeringId");
        kotlin.jvm.internal.m.e(stepId, "stepId");
        this.offeringId = offeringId;
        this.stepId = stepId;
    }

    public static /* synthetic */ com.revenuecat.purchases.common.workflows.WorkflowExitOffer copy$default(com.revenuecat.purchases.common.workflows.WorkflowExitOffer workflowExitOffer, java.lang.String str, java.lang.String str2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = workflowExitOffer.offeringId;
        }
        if ((i3 & 2) != 0) {
            str2 = workflowExitOffer.stepId;
        }
        return workflowExitOffer.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getOfferingId() {
        return this.offeringId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getStepId() {
        return this.stepId;
    }

    public final com.revenuecat.purchases.common.workflows.WorkflowExitOffer copy(java.lang.String offeringId, java.lang.String stepId) {
        kotlin.jvm.internal.m.e(offeringId, "offeringId");
        kotlin.jvm.internal.m.e(stepId, "stepId");
        return new com.revenuecat.purchases.common.workflows.WorkflowExitOffer(offeringId, stepId);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.workflows.WorkflowExitOffer)) {
            return false;
        }
        com.revenuecat.purchases.common.workflows.WorkflowExitOffer workflowExitOffer = (com.revenuecat.purchases.common.workflows.WorkflowExitOffer) other;
        return kotlin.jvm.internal.m.a(this.offeringId, workflowExitOffer.offeringId) && kotlin.jvm.internal.m.a(this.stepId, workflowExitOffer.stepId);
    }

    public final java.lang.String getOfferingId() {
        return this.offeringId;
    }

    public final java.lang.String getStepId() {
        return this.stepId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.offeringId.hashCode() * 31);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkflowExitOffer(offeringId=");
        sb.append(this.offeringId);
        sb.append(", stepId=");
        return Y6.f.l(sb, this.stepId, ')');
    }
}

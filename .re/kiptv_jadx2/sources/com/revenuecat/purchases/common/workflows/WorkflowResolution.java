package com.revenuecat.purchases.common.workflows;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "", "()V", "Disabled", "Found", "NoWorkflow", "Unavailable", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Disabled;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Found;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$NoWorkflow;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Unavailable;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public abstract class WorkflowResolution {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Disabled;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Disabled extends WorkflowResolution {
        public static final Disabled INSTANCE = new Disabled();

        private Disabled() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Found;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "workflowId", "", "(Ljava/lang/String;)V", "getWorkflowId", "()Ljava/lang/String;", "component1", "copy", "equals", "", Request.JsonKeys.OTHER, "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Found extends WorkflowResolution {
        private final String workflowId;

        public Found(String workflowId) {
            super(null);
            m.e(workflowId, "workflowId");
            this.workflowId = workflowId;
        }

        public static Found copy$default(Found found, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = found.workflowId;
            }
            return found.copy(str);
        }

        public final String getWorkflowId() {
            return this.workflowId;
        }

        public final Found copy(String workflowId) {
            m.e(workflowId, "workflowId");
            return new Found(workflowId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Found) && m.a(this.workflowId, ((Found) other).workflowId);
        }

        public final String getWorkflowId() {
            return this.workflowId;
        }

        public int hashCode() {
            return this.workflowId.hashCode();
        }

        public String toString() {
            return f.l(new StringBuilder("Found(workflowId="), this.workflowId, ')');
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$NoWorkflow;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class NoWorkflow extends WorkflowResolution {
        public static final NoWorkflow INSTANCE = new NoWorkflow();

        private NoWorkflow() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowResolution$Unavailable;", "Lcom/revenuecat/purchases/common/workflows/WorkflowResolution;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Unavailable extends WorkflowResolution {
        public static final Unavailable INSTANCE = new Unavailable();

        private Unavailable() {
            super(null);
        }
    }

    public WorkflowResolution(AbstractC2541f abstractC2541f) {
        this();
    }

    private WorkflowResolution() {
    }
}

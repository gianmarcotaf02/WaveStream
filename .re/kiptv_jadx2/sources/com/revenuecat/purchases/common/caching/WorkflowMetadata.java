package com.revenuecat.purchases.common.caching;

import Y6.f;
import androidx.media3.container.NalUnitUtil;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002('B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B3\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J$\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "", "", "workflowId", "stepId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "toString", "hashCode", "()I", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWorkflowId", "getWorkflowId$annotations", "()V", "getStepId", "getStepId$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class WorkflowMetadata {

    public static final Companion INSTANCE = new Companion(null);
    private final String stepId;
    private final String workflowId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\tHÆ\u0001¨\u0006\n"}, d2 = {"Lcom/revenuecat/purchases/common/caching/WorkflowMetadata$Companion;", "", "()V", "from", "Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "workflowId", "", "stepId", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final WorkflowMetadata from(String workflowId, String stepId) {
            if (workflowId == null || stepId == null) {
                return null;
            }
            return new WorkflowMetadata(workflowId, stepId);
        }

        public final KSerializer serializer() {
            return WorkflowMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public WorkflowMetadata(int i3, @h("workflow_id") String str, @h("step_id") String str2, k0 k0Var) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, WorkflowMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.workflowId = str;
        this.stepId = str2;
    }

    public static WorkflowMetadata copy$default(WorkflowMetadata workflowMetadata, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = workflowMetadata.workflowId;
        }
        if ((i3 & 2) != 0) {
            str2 = workflowMetadata.stepId;
        }
        return workflowMetadata.copy(str, str2);
    }

    @h("step_id")
    public static void getStepId$annotations() {
    }

    @h("workflow_id")
    public static void getWorkflowId$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(WorkflowMetadata self, b output, SerialDescriptor serialDesc) {
        output.s(serialDesc, 0, self.workflowId);
        output.s(serialDesc, 1, self.stepId);
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final WorkflowMetadata copy(String workflowId, String stepId) {
        m.e(workflowId, "workflowId");
        m.e(stepId, "stepId");
        return new WorkflowMetadata(workflowId, stepId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkflowMetadata)) {
            return false;
        }
        WorkflowMetadata workflowMetadata = (WorkflowMetadata) other;
        return m.a(this.workflowId, workflowMetadata.workflowId) && m.a(this.stepId, workflowMetadata.stepId);
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final String getWorkflowId() {
        return this.workflowId;
    }

    public int hashCode() {
        return this.stepId.hashCode() + (this.workflowId.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("WorkflowMetadata(workflowId=");
        sb.append(this.workflowId);
        sb.append(", stepId=");
        return f.l(sb, this.stepId, ')');
    }

    public WorkflowMetadata(String workflowId, String stepId) {
        m.e(workflowId, "workflowId");
        m.e(stepId, "stepId");
        this.workflowId = workflowId;
        this.stepId = stepId;
    }
}

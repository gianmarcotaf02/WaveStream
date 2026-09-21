package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "", "()V", "Companion", "Step", "Unknown", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Unknown;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.class)
public abstract class WorkflowTriggerAction {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Companion INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Companion(null);

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "", "stepId", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "toString", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStepId", "getStepId$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final /* data */ class Step extends com.revenuecat.purchases.common.workflows.WorkflowTriggerAction {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step.Companion INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step.Companion(null);
        private final java.lang.String stepId;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.common.workflows.WorkflowTriggerAction$Step$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @p070h6.c
        public /* synthetic */ Step(int i3, @p119n8.h("step_id") java.lang.String str, p153r8.k0 k0Var) {
            kotlin.jvm.internal.AbstractC2541f abstractC2541f = null;
            if (1 != (i3 & 1)) {
                p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.common.workflows.WorkflowTriggerAction$Step$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            super(abstractC2541f);
            this.stepId = str;
        }

        public static /* synthetic */ com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step copy$default(com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step step, java.lang.String str, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                str = step.stepId;
            }
            return step.copy(str);
        }

        @p119n8.h("step_id")
        public static /* synthetic */ void getStepId$annotations() {
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final java.lang.String getStepId() {
            return this.stepId;
        }

        public final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step copy(java.lang.String stepId) {
            kotlin.jvm.internal.m.e(stepId, "stepId");
            return new com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step(stepId);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step) && kotlin.jvm.internal.m.a(this.stepId, ((com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step) other).stepId);
        }

        public final java.lang.String getStepId() {
            return this.stepId;
        }

        public int hashCode() {
            return this.stepId.hashCode();
        }

        public java.lang.String toString() {
            return Y6.f.l(new java.lang.StringBuilder("Step(stepId="), this.stepId, ')');
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Step(java.lang.String stepId) {
            super(null);
            kotlin.jvm.internal.m.e(stepId, "stepId");
            this.stepId = stepId;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Unknown;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Unknown extends com.revenuecat.purchases.common.workflows.WorkflowTriggerAction {
        public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown();
        private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown.AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowTriggerAction$Unknown$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return new p153r8.C2714z("com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown", com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        }

        private Unknown() {
            super(null);
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }
    }

    public /* synthetic */ WorkflowTriggerAction(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this();
    }

    private WorkflowTriggerAction() {
    }
}

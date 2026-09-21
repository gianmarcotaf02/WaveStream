package com.revenuecat.purchases.common.workflows;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerActionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowTriggerActionSerializer extends com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault<com.revenuecat.purchases.common.workflows.WorkflowTriggerAction> {
    public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Step.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass2 INSTANCE = new com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // p194x6.j
        public final com.revenuecat.purchases.common.workflows.WorkflowTriggerAction invoke(java.lang.String it) {
            kotlin.jvm.internal.m.e(it, "it");
            return com.revenuecat.purchases.common.workflows.WorkflowTriggerAction.Unknown.INSTANCE;
        }
    }

    private WorkflowTriggerActionSerializer() {
        super("WorkflowTriggerAction", p078i6.D.J0(new p070h6.k("step", com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass1.INSTANCE)), com.revenuecat.purchases.common.workflows.WorkflowTriggerActionSerializer.AnonymousClass2.INSTANCE, null, 8, null);
    }
}

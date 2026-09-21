package com.revenuecat.purchases.common.workflows;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import kotlinx.serialization.KSerializer;
import p070h6.k;
import p078i6.D;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerActionSerializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class WorkflowTriggerActionSerializer extends SealedDeserializerWithDefault<WorkflowTriggerAction> {
    public static final WorkflowTriggerActionSerializer INSTANCE = new WorkflowTriggerActionSerializer();

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction$Step;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends o implements Function0 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override
        public final KSerializer invoke() {
            return WorkflowTriggerAction.Step.INSTANCE.serializer();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/common/workflows/WorkflowTriggerAction;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends o implements j {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override
        public final WorkflowTriggerAction invoke(String it) {
            m.e(it, "it");
            return WorkflowTriggerAction.Unknown.INSTANCE;
        }
    }

    private WorkflowTriggerActionSerializer() {
        super("WorkflowTriggerAction", D.J0(new k("step", AnonymousClass1.INSTANCE)), AnonymousClass2.INSTANCE, null, 8, null);
    }
}

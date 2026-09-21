package com.revenuecat.purchases.customercenter;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B'\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "customerCenter", "<init>", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter", "()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;", "getCustomerCenter$annotations", "()V", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class CustomerCenterRoot {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.customercenter.CustomerCenterRoot.Companion INSTANCE = new com.revenuecat.purchases.customercenter.CustomerCenterRoot.Companion(null);
    private final com.revenuecat.purchases.customercenter.CustomerCenterConfigData customerCenter;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterRoot;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.customercenter.CustomerCenterRoot$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ CustomerCenterRoot(int i3, @p119n8.h("customer_center") com.revenuecat.purchases.customercenter.CustomerCenterConfigData customerCenterConfigData, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.customerCenter = customerCenterConfigData;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.customercenter.CustomerCenterRoot$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    @p119n8.h("customer_center")
    public static /* synthetic */ void getCustomerCenter$annotations() {
    }

    public final com.revenuecat.purchases.customercenter.CustomerCenterConfigData getCustomerCenter() {
        return this.customerCenter;
    }

    public CustomerCenterRoot(com.revenuecat.purchases.customercenter.CustomerCenterConfigData customerCenter) {
        kotlin.jvm.internal.m.e(customerCenter, "customerCenter");
        this.customerCenter = customerCenter;
    }
}

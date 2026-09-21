package com.revenuecat.purchases.common.caching;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002@?B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBW\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b$\u0010%JF\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001dR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b8\u00102\u001a\u0004\b7\u0010!R \u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\b;\u00102\u001a\u0004\b:\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010<\u0012\u0004\b>\u00102\u001a\u0004\b=\u0010%¨\u0006A"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "", "", "token", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "receiptInfo", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "paywallPostReceiptData", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "purchasesAreCompletedBy", "Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "workflowMetadata", "<init>", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/revenuecat/purchases/common/ReceiptInfo;", "component3", "()Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "component4", "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "component5", "()Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "copy", "(Ljava/lang/String;Lcom/revenuecat/purchases/common/ReceiptInfo;Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;Lcom/revenuecat/purchases/PurchasesAreCompletedBy;Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "toString", "hashCode", "()I", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getToken", "getToken$annotations", "()V", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "getReceiptInfo", "getReceiptInfo$annotations", "Lcom/revenuecat/purchases/paywalls/events/PaywallPostReceiptData;", "getPaywallPostReceiptData", "getPaywallPostReceiptData$annotations", "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;", "getPurchasesAreCompletedBy", "getPurchasesAreCompletedBy$annotations", "Lcom/revenuecat/purchases/common/caching/WorkflowMetadata;", "getWorkflowMetadata", "getWorkflowMetadata$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final /* data */ class LocalTransactionMetadata {
    private final com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData;
    private final com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy;
    private final com.revenuecat.purchases.common.ReceiptInfo receiptInfo;
    private final java.lang.String token;
    private final com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.common.caching.LocalTransactionMetadata.Companion INSTANCE = new com.revenuecat.purchases.common.caching.LocalTransactionMetadata.Companion(null);
    private static final kotlinx.serialization.KSerializer[] $childSerializers = {null, null, null, p153r8.AbstractC2686a0.f("com.revenuecat.purchases.PurchasesAreCompletedBy", com.revenuecat.purchases.PurchasesAreCompletedBy.values()), null};

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.common.caching.LocalTransactionMetadata$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ LocalTransactionMetadata(int i3, @p119n8.h("token") java.lang.String str, @p119n8.h("receipt_info") com.revenuecat.purchases.common.ReceiptInfo receiptInfo, @p119n8.h("paywall_data") com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, @p119n8.h("purchases_are_completed_by") com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, @p119n8.h("workflow_metadata") com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata, p153r8.k0 k0Var) {
        if (11 != (i3 & 11)) {
            p153r8.AbstractC2686a0.l(i3, 11, com.revenuecat.purchases.common.caching.LocalTransactionMetadata$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.token = str;
        this.receiptInfo = receiptInfo;
        if ((i3 & 4) == 0) {
            this.paywallPostReceiptData = null;
        } else {
            this.paywallPostReceiptData = paywallPostReceiptData;
        }
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        if ((i3 & 16) == 0) {
            this.workflowMetadata = null;
        } else {
            this.workflowMetadata = workflowMetadata;
        }
    }

    public static /* synthetic */ com.revenuecat.purchases.common.caching.LocalTransactionMetadata copy$default(com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata, java.lang.String str, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = localTransactionMetadata.token;
        }
        if ((i3 & 2) != 0) {
            receiptInfo = localTransactionMetadata.receiptInfo;
        }
        if ((i3 & 4) != 0) {
            paywallPostReceiptData = localTransactionMetadata.paywallPostReceiptData;
        }
        if ((i3 & 8) != 0) {
            purchasesAreCompletedBy = localTransactionMetadata.purchasesAreCompletedBy;
        }
        if ((i3 & 16) != 0) {
            workflowMetadata = localTransactionMetadata.workflowMetadata;
        }
        com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata2 = workflowMetadata;
        com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData2 = paywallPostReceiptData;
        return localTransactionMetadata.copy(str, receiptInfo, paywallPostReceiptData2, purchasesAreCompletedBy, workflowMetadata2);
    }

    @p119n8.h("paywall_data")
    public static /* synthetic */ void getPaywallPostReceiptData$annotations() {
    }

    @p119n8.h("purchases_are_completed_by")
    public static /* synthetic */ void getPurchasesAreCompletedBy$annotations() {
    }

    @p119n8.h("receipt_info")
    public static /* synthetic */ void getReceiptInfo$annotations() {
    }

    @p119n8.h("token")
    public static /* synthetic */ void getToken$annotations() {
    }

    @p119n8.h("workflow_metadata")
    public static /* synthetic */ void getWorkflowMetadata$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.common.caching.LocalTransactionMetadata self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.s(serialDesc, 0, self.token);
        output.h(serialDesc, 1, com.revenuecat.purchases.common.ReceiptInfo$$serializer.INSTANCE, self.receiptInfo);
        if (output.E(serialDesc) || self.paywallPostReceiptData != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer.INSTANCE, self.paywallPostReceiptData);
        }
        output.h(serialDesc, 3, kSerializerArr[3], self.purchasesAreCompletedBy);
        if (!output.E(serialDesc) && self.workflowMetadata == null) {
            return;
        }
        output.t(serialDesc, 4, com.revenuecat.purchases.common.caching.WorkflowMetadata$$serializer.INSTANCE, self.workflowMetadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getToken() {
        return this.token;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final com.revenuecat.purchases.common.ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData getPaywallPostReceiptData() {
        return this.paywallPostReceiptData;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.revenuecat.purchases.common.caching.WorkflowMetadata getWorkflowMetadata() {
        return this.workflowMetadata;
    }

    public final com.revenuecat.purchases.common.caching.LocalTransactionMetadata copy(java.lang.String token, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata) {
        kotlin.jvm.internal.m.e(token, "token");
        kotlin.jvm.internal.m.e(receiptInfo, "receiptInfo");
        kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        return new com.revenuecat.purchases.common.caching.LocalTransactionMetadata(token, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy, workflowMetadata);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.common.caching.LocalTransactionMetadata)) {
            return false;
        }
        com.revenuecat.purchases.common.caching.LocalTransactionMetadata localTransactionMetadata = (com.revenuecat.purchases.common.caching.LocalTransactionMetadata) other;
        return kotlin.jvm.internal.m.a(this.token, localTransactionMetadata.token) && kotlin.jvm.internal.m.a(this.receiptInfo, localTransactionMetadata.receiptInfo) && kotlin.jvm.internal.m.a(this.paywallPostReceiptData, localTransactionMetadata.paywallPostReceiptData) && this.purchasesAreCompletedBy == localTransactionMetadata.purchasesAreCompletedBy && kotlin.jvm.internal.m.a(this.workflowMetadata, localTransactionMetadata.workflowMetadata);
    }

    public final com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData getPaywallPostReceiptData() {
        return this.paywallPostReceiptData;
    }

    public final com.revenuecat.purchases.PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchasesAreCompletedBy;
    }

    public final com.revenuecat.purchases.common.ReceiptInfo getReceiptInfo() {
        return this.receiptInfo;
    }

    public final java.lang.String getToken() {
        return this.token;
    }

    public final com.revenuecat.purchases.common.caching.WorkflowMetadata getWorkflowMetadata() {
        return this.workflowMetadata;
    }

    public int hashCode() {
        int iHashCode = (this.receiptInfo.hashCode() + (this.token.hashCode() * 31)) * 31;
        com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData = this.paywallPostReceiptData;
        int iHashCode2 = (this.purchasesAreCompletedBy.hashCode() + ((iHashCode + (paywallPostReceiptData == null ? 0 : paywallPostReceiptData.hashCode())) * 31)) * 31;
        com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata = this.workflowMetadata;
        return iHashCode2 + (workflowMetadata != null ? workflowMetadata.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LocalTransactionMetadata(token=" + this.token + ", receiptInfo=" + this.receiptInfo + ", paywallPostReceiptData=" + this.paywallPostReceiptData + ", purchasesAreCompletedBy=" + this.purchasesAreCompletedBy + ", workflowMetadata=" + this.workflowMetadata + ')';
    }

    public LocalTransactionMetadata(java.lang.String token, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata) {
        kotlin.jvm.internal.m.e(token, "token");
        kotlin.jvm.internal.m.e(receiptInfo, "receiptInfo");
        kotlin.jvm.internal.m.e(purchasesAreCompletedBy, "purchasesAreCompletedBy");
        this.token = token;
        this.receiptInfo = receiptInfo;
        this.paywallPostReceiptData = paywallPostReceiptData;
        this.purchasesAreCompletedBy = purchasesAreCompletedBy;
        this.workflowMetadata = workflowMetadata;
    }

    public /* synthetic */ LocalTransactionMetadata(java.lang.String str, com.revenuecat.purchases.common.ReceiptInfo receiptInfo, com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData paywallPostReceiptData, com.revenuecat.purchases.PurchasesAreCompletedBy purchasesAreCompletedBy, com.revenuecat.purchases.common.caching.WorkflowMetadata workflowMetadata, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(str, receiptInfo, (i3 & 4) != 0 ? null : paywallPostReceiptData, purchasesAreCompletedBy, (i3 & 16) != 0 ? null : workflowMetadata);
    }
}

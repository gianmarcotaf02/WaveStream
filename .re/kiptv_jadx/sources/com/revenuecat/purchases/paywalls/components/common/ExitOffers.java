package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;", "dismiss", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/ExitOffer;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;", "getDismiss", "()Lcom/revenuecat/purchases/paywalls/components/common/ExitOffer;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ExitOffers {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.ExitOffers.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ExitOffers.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.common.ExitOffer dismiss;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ExitOffers;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.ExitOffers$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExitOffers() {
        this((com.revenuecat.purchases.paywalls.components.common.ExitOffer) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.ExitOffers self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (!output.E(serialDesc) && self.dismiss == null) {
            return;
        }
        output.t(serialDesc, 0, com.revenuecat.purchases.paywalls.components.common.ExitOffer$$serializer.INSTANCE, self.dismiss);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.paywalls.components.common.ExitOffers) && kotlin.jvm.internal.m.a(this.dismiss, ((com.revenuecat.purchases.paywalls.components.common.ExitOffers) obj).dismiss);
    }

    public final com.revenuecat.purchases.paywalls.components.common.ExitOffer getDismiss() {
        return this.dismiss;
    }

    public int hashCode() {
        com.revenuecat.purchases.paywalls.components.common.ExitOffer exitOffer = this.dismiss;
        if (exitOffer == null) {
            return 0;
        }
        return exitOffer.hashCode();
    }

    public java.lang.String toString() {
        return "ExitOffers(dismiss=" + this.dismiss + ')';
    }

    @p070h6.c
    public /* synthetic */ ExitOffers(int i3, com.revenuecat.purchases.paywalls.components.common.ExitOffer exitOffer, p153r8.k0 k0Var) {
        if ((i3 & 1) == 0) {
            this.dismiss = null;
        } else {
            this.dismiss = exitOffer;
        }
    }

    public ExitOffers(com.revenuecat.purchases.paywalls.components.common.ExitOffer exitOffer) {
        this.dismiss = exitOffer;
    }

    public /* synthetic */ ExitOffers(com.revenuecat.purchases.paywalls.components.common.ExitOffer exitOffer, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? null : exitOffer);
    }
}

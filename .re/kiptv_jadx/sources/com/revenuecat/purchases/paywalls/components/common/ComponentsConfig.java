package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "<init>", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "getBase", "()Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ComponentsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.ComponentsConfig.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.ComponentsConfig.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig base;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/ComponentsConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ ComponentsConfig(int i3, com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig paywallComponentsConfig, p153r8.k0 k0Var) {
        if (1 == (i3 & 1)) {
            this.base = paywallComponentsConfig;
        } else {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.common.ComponentsConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.revenuecat.purchases.paywalls.components.common.ComponentsConfig) && kotlin.jvm.internal.m.a(this.base, ((com.revenuecat.purchases.paywalls.components.common.ComponentsConfig) obj).base);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig getBase() {
        return this.base;
    }

    public int hashCode() {
        return this.base.hashCode();
    }

    public java.lang.String toString() {
        return "ComponentsConfig(base=" + this.base + ')';
    }

    public ComponentsConfig(com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig base) {
        kotlin.jvm.internal.m.e(base, "base");
        this.base = base;
    }
}

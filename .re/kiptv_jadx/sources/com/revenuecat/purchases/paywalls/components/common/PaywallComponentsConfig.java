package com.revenuecat.purchases.paywalls.components.common;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBE\b\u0011\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J(\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "stack", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "stickyFooter", "Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "header", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/StackComponent;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "getStack", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter", "()Lcom/revenuecat/purchases/paywalls/components/StickyFooterComponent;", "getStickyFooter$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "getHeader", "()Lcom/revenuecat/purchases/paywalls/components/HeaderComponent;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PaywallComponentsConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.common.Background background;
    private final com.revenuecat.purchases.paywalls.components.HeaderComponent header;
    private final com.revenuecat.purchases.paywalls.components.StackComponent stack;
    private final com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooter;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsConfig;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ PaywallComponentsConfig(int i3, com.revenuecat.purchases.paywalls.components.StackComponent stackComponent, com.revenuecat.purchases.paywalls.components.common.Background background, @p119n8.h("sticky_footer") com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooterComponent, com.revenuecat.purchases.paywalls.components.HeaderComponent headerComponent, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.stack = stackComponent;
        this.background = background;
        if ((i3 & 4) == 0) {
            this.stickyFooter = null;
        } else {
            this.stickyFooter = stickyFooterComponent;
        }
        if ((i3 & 8) == 0) {
            this.header = null;
        } else {
            this.header = headerComponent;
        }
    }

    @p119n8.h("sticky_footer")
    public static /* synthetic */ void getStickyFooter$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.StackComponent$$serializer.INSTANCE, self.stack);
        output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer.INSTANCE, self.background);
        if (output.E(serialDesc) || self.stickyFooter != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer.INSTANCE, self.stickyFooter);
        }
        if (!output.E(serialDesc) && self.header == null) {
            return;
        }
        output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.components.HeaderComponent$$serializer.INSTANCE, self.header);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig paywallComponentsConfig = (com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig) obj;
        return kotlin.jvm.internal.m.a(this.stack, paywallComponentsConfig.stack) && kotlin.jvm.internal.m.a(this.background, paywallComponentsConfig.background) && kotlin.jvm.internal.m.a(this.stickyFooter, paywallComponentsConfig.stickyFooter) && kotlin.jvm.internal.m.a(this.header, paywallComponentsConfig.header);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.HeaderComponent getHeader() {
        return this.header;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.StackComponent getStack() {
        return this.stack;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.StickyFooterComponent getStickyFooter() {
        return this.stickyFooter;
    }

    public int hashCode() {
        int iHashCode = (this.background.hashCode() + (this.stack.hashCode() * 31)) * 31;
        com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooterComponent = this.stickyFooter;
        int iHashCode2 = (iHashCode + (stickyFooterComponent == null ? 0 : stickyFooterComponent.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.HeaderComponent headerComponent = this.header;
        return iHashCode2 + (headerComponent != null ? headerComponent.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PaywallComponentsConfig(stack=" + this.stack + ", background=" + this.background + ", stickyFooter=" + this.stickyFooter + ", header=" + this.header + ')';
    }

    public PaywallComponentsConfig(com.revenuecat.purchases.paywalls.components.StackComponent stack, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooterComponent, com.revenuecat.purchases.paywalls.components.HeaderComponent headerComponent) {
        kotlin.jvm.internal.m.e(stack, "stack");
        kotlin.jvm.internal.m.e(background, "background");
        this.stack = stack;
        this.background = background;
        this.stickyFooter = stickyFooterComponent;
        this.header = headerComponent;
    }

    public /* synthetic */ PaywallComponentsConfig(com.revenuecat.purchases.paywalls.components.StackComponent stackComponent, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.StickyFooterComponent stickyFooterComponent, com.revenuecat.purchases.paywalls.components.HeaderComponent headerComponent, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(stackComponent, background, (i3 & 4) != 0 ? null : stickyFooterComponent, (i3 & 8) != 0 ? null : headerComponent);
    }
}

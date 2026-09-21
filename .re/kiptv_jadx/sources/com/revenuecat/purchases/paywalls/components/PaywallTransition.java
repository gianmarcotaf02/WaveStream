package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004$#%&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "type", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "displacementStrategy", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "animation", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "getAnimation", "()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "Companion", "$serializer", "DisplacementStrategy", "TransitionType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PaywallTransition {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PaywallTransition.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PaywallTransition.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.PaywallAnimation animation;
    private final com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy displacementStrategy;
    private final com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType type;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PaywallTransition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "", "(Ljava/lang/String;I)V", "GREEDY", "LAZY", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.DisplacementStrategyDeserializer.class)
    public enum DisplacementStrategy {
        GREEDY,
        LAZY;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.DisplacementStrategyDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "FADE_AND_SCALE", "SCALE", "SLIDE", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i(with = com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.class)
    public enum TransitionType {
        FADE,
        FADE_AND_SCALE,
        SCALE,
        SLIDE;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.Companion(null);

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @p070h6.c
    public /* synthetic */ PaywallTransition(int i3, com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType transitionType, @p119n8.h("displacement_strategy") com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy displacementStrategy, com.revenuecat.purchases.paywalls.components.PaywallAnimation paywallAnimation, p153r8.k0 k0Var) {
        if (2 != (i3 & 2)) {
            p153r8.AbstractC2686a0.l(i3, 2, com.revenuecat.purchases.paywalls.components.PaywallTransition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = (i3 & 1) == 0 ? com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE : transitionType;
        this.displacementStrategy = displacementStrategy;
        if ((i3 & 4) == 0) {
            this.animation = null;
        } else {
            this.animation = paywallAnimation;
        }
    }

    @p119n8.h("displacement_strategy")
    public static /* synthetic */ void getDisplacementStrategy$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PaywallTransition self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.type != com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE) {
            output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.INSTANCE, self.type);
        }
        output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.DisplacementStrategyDeserializer.INSTANCE, self.displacementStrategy);
        if (!output.E(serialDesc) && self.animation == null) {
            return;
        }
        output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.PaywallAnimation$$serializer.INSTANCE, self.animation);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.PaywallTransition)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.PaywallTransition paywallTransition = (com.revenuecat.purchases.paywalls.components.PaywallTransition) obj;
        return this.type == paywallTransition.type && this.displacementStrategy == paywallTransition.displacementStrategy && kotlin.jvm.internal.m.a(this.animation, paywallTransition.animation);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PaywallAnimation getAnimation() {
        return this.animation;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy getDisplacementStrategy() {
        return this.displacementStrategy;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.displacementStrategy.hashCode() + (this.type.hashCode() * 31)) * 31;
        com.revenuecat.purchases.paywalls.components.PaywallAnimation paywallAnimation = this.animation;
        return iHashCode + (paywallAnimation == null ? 0 : paywallAnimation.hashCode());
    }

    public java.lang.String toString() {
        return "PaywallTransition(type=" + this.type + ", displacementStrategy=" + this.displacementStrategy + ", animation=" + this.animation + ')';
    }

    public PaywallTransition(com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType type, com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy displacementStrategy, com.revenuecat.purchases.paywalls.components.PaywallAnimation paywallAnimation) {
        kotlin.jvm.internal.m.e(type, "type");
        kotlin.jvm.internal.m.e(displacementStrategy, "displacementStrategy");
        this.type = type;
        this.displacementStrategy = displacementStrategy;
        this.animation = paywallAnimation;
    }

    public /* synthetic */ PaywallTransition(com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType transitionType, com.revenuecat.purchases.paywalls.components.PaywallTransition.DisplacementStrategy displacementStrategy, com.revenuecat.purchases.paywalls.components.PaywallAnimation paywallAnimation, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE : transitionType, displacementStrategy, (i3 & 4) != 0 ? null : paywallAnimation);
    }
}

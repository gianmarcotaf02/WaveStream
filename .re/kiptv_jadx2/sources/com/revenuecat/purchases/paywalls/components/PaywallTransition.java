package com.revenuecat.purchases.paywalls.components;

import androidx.media3.container.NalUnitUtil;
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

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 #2\u00020\u0001:\u0004$#%&B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB;\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "type", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "displacementStrategy", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "animation", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "getType", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy", "()Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "getDisplacementStrategy$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "getAnimation", "()Lcom/revenuecat/purchases/paywalls/components/PaywallAnimation;", "Companion", "$serializer", "DisplacementStrategy", "TransitionType", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class PaywallTransition {

    public static final Companion INSTANCE = new Companion(null);
    private final PaywallAnimation animation;
    private final DisplacementStrategy displacementStrategy;
    private final TransitionType type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return PaywallTransition$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "", "(Ljava/lang/String;I)V", "GREEDY", "LAZY", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = DisplacementStrategyDeserializer.class)
    public enum DisplacementStrategy {
        GREEDY,
        LAZY;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return DisplacementStrategyDeserializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "", "(Ljava/lang/String;I)V", "FADE", "FADE_AND_SCALE", "SCALE", "SLIDE", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @i(with = TransitionTypeSerializer.class)
    public enum TransitionType {
        FADE,
        FADE_AND_SCALE,
        SCALE,
        SLIDE;


        public static final Companion INSTANCE = new Companion(null);

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public Companion(AbstractC2541f abstractC2541f) {
                this();
            }

            public final KSerializer serializer() {
                return TransitionTypeSerializer.INSTANCE;
            }

            private Companion() {
            }
        }
    }

    @c
    public PaywallTransition(int i3, TransitionType transitionType, @h("displacement_strategy") DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, k0 k0Var) {
        if (2 != (i3 & 2)) {
            AbstractC2686a0.l(i3, 2, PaywallTransition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = (i3 & 1) == 0 ? TransitionType.FADE : transitionType;
        this.displacementStrategy = displacementStrategy;
        if ((i3 & 4) == 0) {
            this.animation = null;
        } else {
            this.animation = paywallAnimation;
        }
    }

    @h("displacement_strategy")
    public static void getDisplacementStrategy$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(PaywallTransition self, b output, SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || self.type != TransitionType.FADE) {
            output.h(serialDesc, 0, TransitionTypeSerializer.INSTANCE, self.type);
        }
        output.h(serialDesc, 1, DisplacementStrategyDeserializer.INSTANCE, self.displacementStrategy);
        if (!output.E(serialDesc) && self.animation == null) {
            return;
        }
        output.t(serialDesc, 2, PaywallAnimation$$serializer.INSTANCE, self.animation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallTransition)) {
            return false;
        }
        PaywallTransition paywallTransition = (PaywallTransition) obj;
        return this.type == paywallTransition.type && this.displacementStrategy == paywallTransition.displacementStrategy && m.a(this.animation, paywallTransition.animation);
    }

    public final PaywallAnimation getAnimation() {
        return this.animation;
    }

    public final DisplacementStrategy getDisplacementStrategy() {
        return this.displacementStrategy;
    }

    public final TransitionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.displacementStrategy.hashCode() + (this.type.hashCode() * 31)) * 31;
        PaywallAnimation paywallAnimation = this.animation;
        return iHashCode + (paywallAnimation == null ? 0 : paywallAnimation.hashCode());
    }

    public String toString() {
        return "PaywallTransition(type=" + this.type + ", displacementStrategy=" + this.displacementStrategy + ", animation=" + this.animation + ')';
    }

    public PaywallTransition(TransitionType type, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation) {
        m.e(type, "type");
        m.e(displacementStrategy, "displacementStrategy");
        this.type = type;
        this.displacementStrategy = displacementStrategy;
        this.animation = paywallAnimation;
    }

    public PaywallTransition(TransitionType transitionType, DisplacementStrategy displacementStrategy, PaywallAnimation paywallAnimation, int i3, AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? TransitionType.FADE : transitionType, displacementStrategy, (i3 & 4) != 0 ? null : paywallAnimation);
    }
}

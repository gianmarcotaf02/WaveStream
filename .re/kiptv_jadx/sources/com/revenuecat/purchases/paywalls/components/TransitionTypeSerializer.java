package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/TransitionTypeSerializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class TransitionTypeSerializer extends com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType> {
    public static final com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer INSTANCE = new com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$TransitionType;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.AnonymousClass1();

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer$1$WhenMappings */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.values().length];
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE_AND_SCALE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.SCALE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.SLIDE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.String invoke(com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType value) {
            kotlin.jvm.internal.m.e(value, "value");
            int i3 = com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i3 == 1) {
                return "fade";
            }
            if (i3 == 2) {
                return "fade_and_scale";
            }
            if (i3 == 3) {
                return "scale";
            }
            if (i3 == 4) {
                return "slide";
            }
            throw new I3.b();
        }
    }

    private TransitionTypeSerializer() {
        super(com.revenuecat.purchases.paywalls.components.PaywallTransition.TransitionType.FADE, com.revenuecat.purchases.paywalls.components.TransitionTypeSerializer.AnonymousClass1.INSTANCE);
    }
}

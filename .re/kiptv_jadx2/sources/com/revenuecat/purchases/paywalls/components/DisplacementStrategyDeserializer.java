package com.revenuecat.purchases.paywalls.components;

import I3.b;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/DisplacementStrategyDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DisplacementStrategyDeserializer extends EnumDeserializerWithDefault<PaywallTransition.DisplacementStrategy> {
    public static final DisplacementStrategyDeserializer INSTANCE = new DisplacementStrategyDeserializer();

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/PaywallTransition$DisplacementStrategy;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends o implements j {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Metadata(k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public class WhenMappings {
            public static final int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PaywallTransition.DisplacementStrategy.values().length];
                try {
                    iArr[PaywallTransition.DisplacementStrategy.GREEDY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PaywallTransition.DisplacementStrategy.LAZY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final String invoke(PaywallTransition.DisplacementStrategy value) {
            m.e(value, "value");
            int i3 = WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i3 == 1) {
                return "greedy";
            }
            if (i3 == 2) {
                return "lazy";
            }
            throw new b();
        }
    }

    private DisplacementStrategyDeserializer() {
        super(PaywallTransition.DisplacementStrategy.GREEDY, AnonymousClass1.INSTANCE);
    }
}

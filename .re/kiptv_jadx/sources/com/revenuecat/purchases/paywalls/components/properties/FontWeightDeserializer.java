package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FontWeightDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontWeightDeserializer extends com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.properties.FontWeight> {
    public static final com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/FontWeight;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer.AnonymousClass1();

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer$1$WhenMappings */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.paywalls.components.properties.FontWeight.values().length];
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.EXTRA_LIGHT.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.THIN.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.LIGHT.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.REGULAR.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.MEDIUM.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.SEMI_BOLD.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.BOLD.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.EXTRA_BOLD.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontWeight.BLACK.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.String invoke(com.revenuecat.purchases.paywalls.components.properties.FontWeight value) {
            kotlin.jvm.internal.m.e(value, "value");
            switch (com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
                case 1:
                    return "extra_light";
                case 2:
                    return "thin";
                case 3:
                    return "light";
                case 4:
                    return "regular";
                case 5:
                    return "medium";
                case 6:
                    return "semibold";
                case 7:
                    return androidx.media3.extractor.text.ttml.TtmlNode.BOLD;
                case 8:
                    return "extra_bold";
                case 9:
                    return "black";
                default:
                    throw new I3.b();
            }
        }
    }

    private FontWeightDeserializer() {
        super(com.revenuecat.purchases.paywalls.components.properties.FontWeight.REGULAR, com.revenuecat.purchases.paywalls.components.properties.FontWeightDeserializer.AnonymousClass1.INSTANCE);
    }
}

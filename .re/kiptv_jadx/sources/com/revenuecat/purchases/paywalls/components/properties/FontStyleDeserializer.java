package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/FontStyleDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontStyleDeserializer extends com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.properties.FontStyle> {
    public static final com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "value", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer.AnonymousClass1();

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer$1$WhenMappings */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.paywalls.components.properties.FontStyle.values().length];
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontStyle.NORMAL.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.FontStyle.ITALIC.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.String invoke(com.revenuecat.purchases.paywalls.components.properties.FontStyle value) {
            kotlin.jvm.internal.m.e(value, "value");
            int i3 = com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[value.ordinal()];
            if (i3 == 1) {
                return io.sentry.ProfilingTraceData.TRUNCATION_REASON_NORMAL;
            }
            if (i3 == 2) {
                return androidx.media3.extractor.text.ttml.TtmlNode.ITALIC;
            }
            throw new I3.b();
        }
    }

    private FontStyleDeserializer() {
        super(com.revenuecat.purchases.paywalls.components.properties.FontStyle.NORMAL, com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer.AnonymousClass1.INSTANCE);
    }
}

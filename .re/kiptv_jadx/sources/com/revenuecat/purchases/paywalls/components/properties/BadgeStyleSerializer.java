package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/BadgeStyleSerializer;", "Lcom/revenuecat/purchases/utils/serializers/EnumDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class BadgeStyleSerializer extends com.revenuecat.purchases.utils.serializers.EnumDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.properties.Badge.Style> {
    public static final com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "style", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge$Style;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer.AnonymousClass1();

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer$1$WhenMappings */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[com.revenuecat.purchases.paywalls.components.properties.Badge.Style.values().length];
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.Badge.Style.Overlay.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.Badge.Style.EdgeToEdge.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[com.revenuecat.purchases.paywalls.components.properties.Badge.Style.Nested.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override // p194x6.j
        public final java.lang.String invoke(com.revenuecat.purchases.paywalls.components.properties.Badge.Style style) {
            kotlin.jvm.internal.m.e(style, "style");
            int i3 = com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer.AnonymousClass1.WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i3 == 1) {
                return "overlay";
            }
            if (i3 == 2) {
                return "edge_to_edge";
            }
            if (i3 == 3) {
                return "nested";
            }
            throw new I3.b();
        }
    }

    private BadgeStyleSerializer() {
        super(com.revenuecat.purchases.paywalls.components.properties.Badge.Style.Overlay, com.revenuecat.purchases.paywalls.components.properties.BadgeStyleSerializer.AnonymousClass1.INSTANCE);
    }
}

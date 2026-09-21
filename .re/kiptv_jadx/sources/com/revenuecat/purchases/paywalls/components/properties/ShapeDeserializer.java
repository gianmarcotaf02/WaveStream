package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ShapeDeserializer;", "Lcom/revenuecat/purchases/utils/serializers/SealedDeserializerWithDefault;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class ShapeDeserializer extends com.revenuecat.purchases.utils.serializers.SealedDeserializerWithDefault<com.revenuecat.purchases.paywalls.components.properties.Shape> {
    public static final com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer();

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer$1, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer$2, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Pill;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
        public static final com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass2 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.KSerializer invoke() {
            return com.revenuecat.purchases.paywalls.components.properties.Shape.Pill.INSTANCE.serializer();
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer$3, reason: invalid class name */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class AnonymousClass3 extends kotlin.jvm.internal.o implements p194x6.j {
        public static final com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass3 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p194x6.j
        public final com.revenuecat.purchases.paywalls.components.properties.Shape invoke(java.lang.String it) {
            kotlin.jvm.internal.m.e(it, "it");
            return new com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle((com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
        }
    }

    private ShapeDeserializer() {
        super("Shape", p078i6.C.N0(new p070h6.k("rectangle", com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass1.INSTANCE), new p070h6.k("pill", com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass2.INSTANCE)), com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.AnonymousClass3.INSTANCE, null, 8, null);
    }
}

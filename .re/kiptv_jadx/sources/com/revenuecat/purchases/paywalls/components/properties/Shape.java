package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u0007\bR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "", "cornerRadiuses", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "getCornerRadiuses", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Companion", "Pill", "Rectangle", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Pill;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i(with = com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.class)
public interface Shape {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.Shape.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.properties.Shape.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Companion;", "", "()V", "pillCornerRadiuses", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Percentage;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Shape.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Shape.Companion();
        private static final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage pillCornerRadiuses = new com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Percentage(50);

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.INSTANCE;
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses getCornerRadiuses(com.revenuecat.purchases.paywalls.components.properties.Shape shape) {
            return com.revenuecat.purchases.paywalls.components.properties.Shape.super.getCornerRadiuses();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Pill;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Pill implements com.revenuecat.purchases.paywalls.components.properties.Shape {
        public static final com.revenuecat.purchases.paywalls.components.properties.Shape.Pill INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Shape.Pill();
        private static final /* synthetic */ p070h6.h $cachedSerializer$delegate = com.google.common.util.concurrent.D.A(p070h6.i.f22537i, com.revenuecat.purchases.paywalls.components.properties.Shape.Pill.AnonymousClass1.INSTANCE);

        /* JADX INFO: renamed from: com.revenuecat.purchases.paywalls.components.properties.Shape$Pill$1, reason: invalid class name */
        @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class AnonymousClass1 extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {
            public static final com.revenuecat.purchases.paywalls.components.properties.Shape.Pill.AnonymousClass1 INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Shape.Pill.AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer invoke() {
                return new p153r8.C2714z("com.revenuecat.purchases.paywalls.components.properties.Shape.Pill", com.revenuecat.purchases.paywalls.components.properties.Shape.Pill.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        }

        private Pill() {
        }

        private final /* synthetic */ kotlinx.serialization.KSerializer get$cachedSerializer() {
            return (kotlinx.serialization.KSerializer) $cachedSerializer$delegate.getValue();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return get$cachedSerializer();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "corners", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "getCorners", "()Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    public static final class Rectangle implements com.revenuecat.purchases.paywalls.components.properties.Shape {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses corners;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape$Rectangle;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.Shape$Rectangle$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Rectangle() {
            this((com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses) null, 1, (kotlin.jvm.internal.AbstractC2541f) (0 == true ? 1 : 0));
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            if (!output.E(serialDesc) && self.corners == null) {
                return;
            }
            output.t(serialDesc, 0, com.revenuecat.purchases.paywalls.components.properties.CornerRadiusesSerializer.INSTANCE, self.corners);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle) && kotlin.jvm.internal.m.a(this.corners, ((com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle) obj).corners);
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses getCorners() {
            return this.corners;
        }

        public int hashCode() {
            com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses cornerRadiuses = this.corners;
            if (cornerRadiuses == null) {
                return 0;
            }
            return cornerRadiuses.hashCode();
        }

        public java.lang.String toString() {
            return "Rectangle(corners=" + this.corners + ')';
        }

        @p070h6.c
        public /* synthetic */ Rectangle(int i3, com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses cornerRadiuses, p153r8.k0 k0Var) {
            if ((i3 & 1) == 0) {
                this.corners = null;
            } else {
                this.corners = cornerRadiuses;
            }
        }

        public Rectangle(com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses cornerRadiuses) {
            this.corners = cornerRadiuses;
        }

        public /* synthetic */ Rectangle(com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses cornerRadiuses, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this((i3 & 1) != 0 ? null : cornerRadiuses);
        }
    }

    default com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses getCornerRadiuses() {
        if (!(this instanceof com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle)) {
            return com.revenuecat.purchases.paywalls.components.properties.Shape.Companion.pillCornerRadiuses;
        }
        com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses corners = ((com.revenuecat.purchases.paywalls.components.properties.Shape.Rectangle) this).getCorners();
        return corners == null ? com.revenuecat.purchases.paywalls.components.properties.CornerRadiuses.Dp.INSTANCE.getZero() : corners;
    }
}

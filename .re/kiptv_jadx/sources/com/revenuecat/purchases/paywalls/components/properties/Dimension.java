package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "", "Companion", "Horizontal", "Vertical", "ZLayer", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public interface Dimension {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.Dimension.Companion INSTANCE = com.revenuecat.purchases.paywalls.components.properties.Dimension.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        static final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Dimension.Companion $$INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Dimension.Companion();

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer serializer() {
            kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
            return new p119n8.f("com.revenuecat.purchases.paywalls.components.properties.Dimension", c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.class), new E6.InterfaceC0331d[]{c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer.class)}, new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "alignment", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "distribution", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/VerticalAlignment;", "getAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "getDistribution", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    @p119n8.h("horizontal")
    public static final /* data */ class Horizontal implements com.revenuecat.purchases.paywalls.components.properties.Dimension {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment alignment;
        private final com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Horizontal;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ Horizontal(int i3, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment verticalAlignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution flexDistribution, p153r8.k0 k0Var) {
            if (3 != (i3 & 3)) {
                p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.alignment = verticalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal copy$default(com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal horizontal, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment verticalAlignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution flexDistribution, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                verticalAlignment = horizontal.alignment;
            }
            if ((i3 & 2) != 0) {
                flexDistribution = horizontal.distribution;
            }
            return horizontal.copy(verticalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer.INSTANCE, self.alignment);
            output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.properties.FlexDistributionDeserializer.INSTANCE, self.distribution);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.revenuecat.purchases.paywalls.components.properties.FlexDistribution getDistribution() {
            return this.distribution;
        }

        public final com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal copy(com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment alignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            kotlin.jvm.internal.m.e(distribution, "distribution");
            return new com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal(alignment, distribution);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal horizontal = (com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal) other;
            return this.alignment == horizontal.alignment && this.distribution == horizontal.distribution;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return this.distribution.hashCode() + (this.alignment.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Horizontal(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }

        public Horizontal(com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment alignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            kotlin.jvm.internal.m.e(distribution, "distribution");
            this.alignment = alignment;
            this.distribution = distribution;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0011\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÁ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0019¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "alignment", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "distribution", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "component2", "()Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;)Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/HorizontalAlignment;", "getAlignment", "Lcom/revenuecat/purchases/paywalls/components/properties/FlexDistribution;", "getDistribution", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    @p119n8.h("vertical")
    public static final /* data */ class Vertical implements com.revenuecat.purchases.paywalls.components.properties.Dimension {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment alignment;
        private final com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$Vertical;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ Vertical(int i3, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment horizontalAlignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution flexDistribution, p153r8.k0 k0Var) {
            if (3 != (i3 & 3)) {
                p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.alignment = horizontalAlignment;
            this.distribution = flexDistribution;
        }

        public static /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical copy$default(com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical vertical, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment horizontalAlignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution flexDistribution, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                horizontalAlignment = vertical.alignment;
            }
            if ((i3 & 2) != 0) {
                flexDistribution = vertical.distribution;
            }
            return vertical.copy(horizontalAlignment, flexDistribution);
        }

        public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignmentDeserializer.INSTANCE, self.alignment);
            output.h(serialDesc, 1, com.revenuecat.purchases.paywalls.components.properties.FlexDistributionDeserializer.INSTANCE, self.distribution);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment getAlignment() {
            return this.alignment;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final com.revenuecat.purchases.paywalls.components.properties.FlexDistribution getDistribution() {
            return this.distribution;
        }

        public final com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical copy(com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment alignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            kotlin.jvm.internal.m.e(distribution, "distribution");
            return new com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical(alignment, distribution);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical)) {
                return false;
            }
            com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical vertical = (com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical) other;
            return this.alignment == vertical.alignment && this.distribution == vertical.distribution;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment getAlignment() {
            return this.alignment;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FlexDistribution getDistribution() {
            return this.distribution;
        }

        public int hashCode() {
            return this.distribution.hashCode() + (this.alignment.hashCode() * 31);
        }

        public java.lang.String toString() {
            return "Vertical(alignment=" + this.alignment + ", distribution=" + this.distribution + ')';
        }

        public Vertical(com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment alignment, com.revenuecat.purchases.paywalls.components.properties.FlexDistribution distribution) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            kotlin.jvm.internal.m.e(distribution, "distribution");
            this.alignment = alignment;
            this.distribution = distribution;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÁ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015¨\u0006&"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;", "alignment", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;", "copy", "(Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;)Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", io.sentry.protocol.Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/revenuecat/purchases/paywalls/components/properties/TwoDimensionalAlignment;", "getAlignment", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    @p119n8.i
    @p119n8.h("zlayer")
    public static final /* data */ class ZLayer implements com.revenuecat.purchases.paywalls.components.properties.Dimension {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer.Companion(null);
        private final com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment alignment;

        @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension$ZLayer;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
                this();
            }

            public final kotlinx.serialization.KSerializer serializer() {
                return com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @p070h6.c
        public /* synthetic */ ZLayer(int i3, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment twoDimensionalAlignment, p153r8.k0 k0Var) {
            if (1 == (i3 & 1)) {
                this.alignment = twoDimensionalAlignment;
            } else {
                p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer copy$default(com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer zLayer, com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment twoDimensionalAlignment, int i3, java.lang.Object obj) {
            if ((i3 & 1) != 0) {
                twoDimensionalAlignment = zLayer.alignment;
            }
            return zLayer.copy(twoDimensionalAlignment);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment getAlignment() {
            return this.alignment;
        }

        public final com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer copy(com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment alignment) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            return new com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer(alignment);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer) && this.alignment == ((com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer) other).alignment;
        }

        public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment getAlignment() {
            return this.alignment;
        }

        public int hashCode() {
            return this.alignment.hashCode();
        }

        public java.lang.String toString() {
            return "ZLayer(alignment=" + this.alignment + ')';
        }

        public ZLayer(com.revenuecat.purchases.paywalls.components.properties.TwoDimensionalAlignment alignment) {
            kotlin.jvm.internal.m.e(alignment, "alignment");
            this.alignment = alignment;
        }
    }
}

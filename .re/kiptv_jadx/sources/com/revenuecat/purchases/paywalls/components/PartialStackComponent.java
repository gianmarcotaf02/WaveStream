package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002XWB¯\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eB©\u0001\b\u0011\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J(\u0010,\u001a\u00020)2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'HÁ\u0001¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u00108R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00109\u0012\u0004\b<\u0010=\u001a\u0004\b:\u0010;R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010Q\u001a\u0004\bR\u0010SR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "dimension", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "", "spacing", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "badge", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "overflow", "", "name", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/lang/String;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/Float;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lcom/revenuecat/purchases/paywalls/components/properties/Badge;Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;Ljava/lang/String;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "getDimension", "()Lcom/revenuecat/purchases/paywalls/components/properties/Dimension;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/Float;", "getSpacing", "()Ljava/lang/Float;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "getBadge", "()Lcom/revenuecat/purchases/paywalls/components/properties/Badge;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "getOverflow", "()Lcom/revenuecat/purchases/paywalls/components/StackComponent$Overflow;", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PartialStackComponent implements com.revenuecat.purchases.paywalls.components.PartialComponent {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PartialStackComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PartialStackComponent.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.common.Background background;
    private final com.revenuecat.purchases.paywalls.components.properties.ColorScheme backgroundColor;
    private final com.revenuecat.purchases.paywalls.components.properties.Badge badge;
    private final com.revenuecat.purchases.paywalls.components.properties.Border border;
    private final com.revenuecat.purchases.paywalls.components.properties.Dimension dimension;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding margin;
    private final java.lang.String name;
    private final com.revenuecat.purchases.paywalls.components.StackComponent.Overflow overflow;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding padding;
    private final com.revenuecat.purchases.paywalls.components.properties.Shadow shadow;
    private final com.revenuecat.purchases.paywalls.components.properties.Shape shape;
    private final com.revenuecat.purchases.paywalls.components.properties.Size size;
    private final java.lang.Float spacing;
    private final java.lang.Boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PartialStackComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        $childSerializers = new kotlinx.serialization.KSerializer[]{null, new p119n8.f("com.revenuecat.purchases.paywalls.components.properties.Dimension", c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.class), new E6.InterfaceC0331d[]{c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.Horizontal.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.Vertical.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.Dimension.ZLayer.class)}, new kotlinx.serialization.KSerializer[]{com.revenuecat.purchases.paywalls.components.properties.Dimension$Horizontal$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.properties.Dimension$Vertical$$serializer.INSTANCE, com.revenuecat.purchases.paywalls.components.properties.Dimension$ZLayer$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]), null, null, null, null, null, null, null, null, null, null, null, null};
    }

    public PartialStackComponent() {
        this((java.lang.Boolean) null, (com.revenuecat.purchases.paywalls.components.properties.Dimension) null, (com.revenuecat.purchases.paywalls.components.properties.Size) null, (java.lang.Float) null, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) null, (com.revenuecat.purchases.paywalls.components.common.Background) null, (com.revenuecat.purchases.paywalls.components.properties.Padding) null, (com.revenuecat.purchases.paywalls.components.properties.Padding) null, (com.revenuecat.purchases.paywalls.components.properties.Shape) null, (com.revenuecat.purchases.paywalls.components.properties.Border) null, (com.revenuecat.purchases.paywalls.components.properties.Shadow) null, (com.revenuecat.purchases.paywalls.components.properties.Badge) null, (com.revenuecat.purchases.paywalls.components.StackComponent.Overflow) null, (java.lang.String) null, 16383, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    @p119n8.h("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PartialStackComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.visible, java.lang.Boolean.TRUE)) {
            output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || self.dimension != null) {
            output.t(serialDesc, 1, kSerializerArr[1], self.dimension);
        }
        if (output.E(serialDesc) || self.size != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || self.spacing != null) {
            output.t(serialDesc, 3, p153r8.C.f26895a, self.spacing);
        }
        if (output.E(serialDesc) || self.backgroundColor != null) {
            output.t(serialDesc, 4, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.E(serialDesc) || self.background != null) {
            output.t(serialDesc, 5, com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.E(serialDesc) || self.padding != null) {
            output.t(serialDesc, 6, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || self.margin != null) {
            output.t(serialDesc, 7, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.E(serialDesc) || self.shape != null) {
            output.t(serialDesc, 8, com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.E(serialDesc) || self.border != null) {
            output.t(serialDesc, 9, com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE, self.border);
        }
        if (output.E(serialDesc) || self.shadow != null) {
            output.t(serialDesc, 10, com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE, self.shadow);
        }
        if (output.E(serialDesc) || self.badge != null) {
            output.t(serialDesc, 11, com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer.INSTANCE, self.badge);
        }
        if (output.E(serialDesc) || self.overflow != null) {
            output.t(serialDesc, 12, com.revenuecat.purchases.paywalls.components.StackOverflowDeserializer.INSTANCE, self.overflow);
        }
        if (!output.E(serialDesc) && self.name == null) {
            return;
        }
        output.t(serialDesc, 13, p153r8.p0.f26988a, self.name);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.PartialStackComponent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.PartialStackComponent partialStackComponent = (com.revenuecat.purchases.paywalls.components.PartialStackComponent) obj;
        return kotlin.jvm.internal.m.a(this.visible, partialStackComponent.visible) && kotlin.jvm.internal.m.a(this.dimension, partialStackComponent.dimension) && kotlin.jvm.internal.m.a(this.size, partialStackComponent.size) && kotlin.jvm.internal.m.a(this.spacing, partialStackComponent.spacing) && kotlin.jvm.internal.m.a(this.backgroundColor, partialStackComponent.backgroundColor) && kotlin.jvm.internal.m.a(this.background, partialStackComponent.background) && kotlin.jvm.internal.m.a(this.padding, partialStackComponent.padding) && kotlin.jvm.internal.m.a(this.margin, partialStackComponent.margin) && kotlin.jvm.internal.m.a(this.shape, partialStackComponent.shape) && kotlin.jvm.internal.m.a(this.border, partialStackComponent.border) && kotlin.jvm.internal.m.a(this.shadow, partialStackComponent.shadow) && kotlin.jvm.internal.m.a(this.badge, partialStackComponent.badge) && this.overflow == partialStackComponent.overflow && kotlin.jvm.internal.m.a(this.name, partialStackComponent.name);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Badge getBadge() {
        return this.badge;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Dimension getDimension() {
        return this.dimension;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ java.lang.String getName() {
        return this.name;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.StackComponent.Overflow getOverflow() {
        return this.overflow;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Shape getShape() {
        return this.shape;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Size getSize() {
        return this.size;
    }

    public final /* synthetic */ java.lang.Float getSpacing() {
        return this.spacing;
    }

    public final /* synthetic */ java.lang.Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Dimension dimension = this.dimension;
        int iHashCode2 = (iHashCode + (dimension == null ? 0 : dimension.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Size size = this.size;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        java.lang.Float f9 = this.spacing;
        int iHashCode4 = (iHashCode3 + (f9 == null ? 0 : f9.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.common.Background background = this.background;
        int iHashCode6 = (iHashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding = this.padding;
        int iHashCode7 = (iHashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding2 = this.margin;
        int iHashCode8 = (iHashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Shape shape = this.shape;
        int iHashCode9 = (iHashCode8 + (shape == null ? 0 : shape.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Border border = this.border;
        int iHashCode10 = (iHashCode9 + (border == null ? 0 : border.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Shadow shadow = this.shadow;
        int iHashCode11 = (iHashCode10 + (shadow == null ? 0 : shadow.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Badge badge = this.badge;
        int iHashCode12 = (iHashCode11 + (badge == null ? 0 : badge.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.StackComponent.Overflow overflow = this.overflow;
        int iHashCode13 = (iHashCode12 + (overflow == null ? 0 : overflow.hashCode())) * 31;
        java.lang.String str = this.name;
        return iHashCode13 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialStackComponent(visible=");
        sb.append(this.visible);
        sb.append(", dimension=");
        sb.append(this.dimension);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", spacing=");
        sb.append(this.spacing);
        sb.append(", backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", shape=");
        sb.append(this.shape);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(", badge=");
        sb.append(this.badge);
        sb.append(", overflow=");
        sb.append(this.overflow);
        sb.append(", name=");
        return Y6.f.l(sb, this.name, ')');
    }

    @p070h6.c
    public /* synthetic */ PartialStackComponent(int i3, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Dimension dimension, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.Float f9, @p119n8.h("background_color") com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, com.revenuecat.purchases.paywalls.components.properties.Badge badge, com.revenuecat.purchases.paywalls.components.StackComponent.Overflow overflow, java.lang.String str, p153r8.k0 k0Var) {
        this.visible = (i3 & 1) == 0 ? java.lang.Boolean.TRUE : bool;
        if ((i3 & 2) == 0) {
            this.dimension = null;
        } else {
            this.dimension = dimension;
        }
        if ((i3 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i3 & 8) == 0) {
            this.spacing = null;
        } else {
            this.spacing = f9;
        }
        if ((i3 & 16) == 0) {
            this.backgroundColor = null;
        } else {
            this.backgroundColor = colorScheme;
        }
        if ((i3 & 32) == 0) {
            this.background = null;
        } else {
            this.background = background;
        }
        if ((i3 & 64) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i3 & 128) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
        }
        if ((i3 & 256) == 0) {
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i3 & 512) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i3 & 1024) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
        if ((i3 & 2048) == 0) {
            this.badge = null;
        } else {
            this.badge = badge;
        }
        if ((i3 & 4096) == 0) {
            this.overflow = null;
        } else {
            this.overflow = overflow;
        }
        if ((i3 & 8192) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
    }

    public PartialStackComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Dimension dimension, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.Float f9, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, com.revenuecat.purchases.paywalls.components.properties.Badge badge, com.revenuecat.purchases.paywalls.components.StackComponent.Overflow overflow, java.lang.String str) {
        this.visible = bool;
        this.dimension = dimension;
        this.size = size;
        this.spacing = f9;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.padding = padding;
        this.margin = padding2;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
        this.badge = badge;
        this.overflow = overflow;
        this.name = str;
    }

    public /* synthetic */ PartialStackComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Dimension dimension, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.Float f9, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, com.revenuecat.purchases.paywalls.components.properties.Badge badge, com.revenuecat.purchases.paywalls.components.StackComponent.Overflow overflow, java.lang.String str, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? java.lang.Boolean.TRUE : bool, (i3 & 2) != 0 ? null : dimension, (i3 & 4) != 0 ? null : size, (i3 & 8) != 0 ? null : f9, (i3 & 16) != 0 ? null : colorScheme, (i3 & 32) != 0 ? null : background, (i3 & 64) != 0 ? null : padding, (i3 & 128) != 0 ? null : padding2, (i3 & 256) != 0 ? null : shape, (i3 & 512) != 0 ? null : border, (i3 & 1024) != 0 ? null : shadow, (i3 & 2048) != 0 ? null : badge, (i3 & 4096) != 0 ? null : overflow, (i3 & 8192) != 0 ? null : str);
    }
}

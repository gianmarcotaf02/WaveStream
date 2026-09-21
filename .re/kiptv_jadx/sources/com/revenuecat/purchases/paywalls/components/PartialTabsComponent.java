package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 >2\u00020\u0001:\u0002?>Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bw\b\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J(\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÁ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b,\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010-\u0012\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "background", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "shape", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/common/Background;Lcom/revenuecat/purchases/paywalls/components/properties/Shape;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getBackgroundColor$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "getBackground", "()Lcom/revenuecat/purchases/paywalls/components/common/Background;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "getShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shape;", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PartialTabsComponent implements com.revenuecat.purchases.paywalls.components.PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PartialTabsComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PartialTabsComponent.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.common.Background background;
    private final com.revenuecat.purchases.paywalls.components.properties.ColorScheme backgroundColor;
    private final com.revenuecat.purchases.paywalls.components.properties.Border border;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding margin;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding padding;
    private final com.revenuecat.purchases.paywalls.components.properties.Shadow shadow;
    private final com.revenuecat.purchases.paywalls.components.properties.Shape shape;
    private final com.revenuecat.purchases.paywalls.components.properties.Size size;
    private final java.lang.Boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PartialTabsComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public PartialTabsComponent() {
        this((java.lang.Boolean) null, (com.revenuecat.purchases.paywalls.components.properties.Size) null, (com.revenuecat.purchases.paywalls.components.properties.Padding) null, (com.revenuecat.purchases.paywalls.components.properties.Padding) null, (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) null, (com.revenuecat.purchases.paywalls.components.common.Background) null, (com.revenuecat.purchases.paywalls.components.properties.Shape) null, (com.revenuecat.purchases.paywalls.components.properties.Border) null, (com.revenuecat.purchases.paywalls.components.properties.Shadow) null, 511, (kotlin.jvm.internal.AbstractC2541f) null);
    }

    @p119n8.h("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PartialTabsComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.visible, java.lang.Boolean.TRUE)) {
            output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || self.size != null) {
            output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || self.padding != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || self.margin != null) {
            output.t(serialDesc, 3, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.E(serialDesc) || self.backgroundColor != null) {
            output.t(serialDesc, 4, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE, self.backgroundColor);
        }
        if (output.E(serialDesc) || self.background != null) {
            output.t(serialDesc, 5, com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer.INSTANCE, self.background);
        }
        if (output.E(serialDesc) || self.shape != null) {
            output.t(serialDesc, 6, com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer.INSTANCE, self.shape);
        }
        if (output.E(serialDesc) || self.border != null) {
            output.t(serialDesc, 7, com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE, self.border);
        }
        if (!output.E(serialDesc) && self.shadow == null) {
            return;
        }
        output.t(serialDesc, 8, com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE, self.shadow);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.PartialTabsComponent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.PartialTabsComponent partialTabsComponent = (com.revenuecat.purchases.paywalls.components.PartialTabsComponent) obj;
        return kotlin.jvm.internal.m.a(this.visible, partialTabsComponent.visible) && kotlin.jvm.internal.m.a(this.size, partialTabsComponent.size) && kotlin.jvm.internal.m.a(this.padding, partialTabsComponent.padding) && kotlin.jvm.internal.m.a(this.margin, partialTabsComponent.margin) && kotlin.jvm.internal.m.a(this.backgroundColor, partialTabsComponent.backgroundColor) && kotlin.jvm.internal.m.a(this.background, partialTabsComponent.background) && kotlin.jvm.internal.m.a(this.shape, partialTabsComponent.shape) && kotlin.jvm.internal.m.a(this.border, partialTabsComponent.border) && kotlin.jvm.internal.m.a(this.shadow, partialTabsComponent.shadow);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.common.Background getBackground() {
        return this.background;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorScheme getBackgroundColor() {
        return this.backgroundColor;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Padding getMargin() {
        return this.margin;
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

    public final /* synthetic */ java.lang.Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Size size = this.size;
        int iHashCode2 = (iHashCode + (size == null ? 0 : size.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding = this.padding;
        int iHashCode3 = (iHashCode2 + (padding == null ? 0 : padding.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding2 = this.margin;
        int iHashCode4 = (iHashCode3 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme = this.backgroundColor;
        int iHashCode5 = (iHashCode4 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.common.Background background = this.background;
        int iHashCode6 = (iHashCode5 + (background == null ? 0 : background.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Shape shape = this.shape;
        int iHashCode7 = (iHashCode6 + (shape == null ? 0 : shape.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Border border = this.border;
        int iHashCode8 = (iHashCode7 + (border == null ? 0 : border.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Shadow shadow = this.shadow;
        return iHashCode8 + (shadow != null ? shadow.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "PartialTabsComponent(visible=" + this.visible + ", size=" + this.size + ", padding=" + this.padding + ", margin=" + this.margin + ", backgroundColor=" + this.backgroundColor + ", background=" + this.background + ", shape=" + this.shape + ", border=" + this.border + ", shadow=" + this.shadow + ')';
    }

    @p070h6.c
    public /* synthetic */ PartialTabsComponent(int i3, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Size size, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, @p119n8.h("background_color") com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, p153r8.k0 k0Var) {
        this.visible = (i3 & 1) == 0 ? java.lang.Boolean.TRUE : bool;
        if ((i3 & 2) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i3 & 4) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i3 & 8) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
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
            this.shape = null;
        } else {
            this.shape = shape;
        }
        if ((i3 & 128) == 0) {
            this.border = null;
        } else {
            this.border = border;
        }
        if ((i3 & 256) == 0) {
            this.shadow = null;
        } else {
            this.shadow = shadow;
        }
    }

    public PartialTabsComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Size size, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow) {
        this.visible = bool;
        this.size = size;
        this.padding = padding;
        this.margin = padding2;
        this.backgroundColor = colorScheme;
        this.background = background;
        this.shape = shape;
        this.border = border;
        this.shadow = shadow;
    }

    public /* synthetic */ PartialTabsComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.Size size, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.common.Background background, com.revenuecat.purchases.paywalls.components.properties.Shape shape, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this((i3 & 1) != 0 ? java.lang.Boolean.TRUE : bool, (i3 & 2) != 0 ? null : size, (i3 & 4) != 0 ? null : padding, (i3 & 8) != 0 ? null : padding2, (i3 & 16) != 0 ? null : colorScheme, (i3 & 32) != 0 ? null : background, (i3 & 64) != 0 ? null : shape, (i3 & 128) != 0 ? null : border, (i3 & 256) != 0 ? null : shadow);
    }
}

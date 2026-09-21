package com.revenuecat.purchases.paywalls.components;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0007\u0018\u0000 K2\u00020\u0001:\u0002LKB\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0091\u0001\b\u0011\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ(\u0010&\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!HÁ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R(\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u00104\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u00104\u001a\u0004\b6\u00107R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u00109\u0012\u0004\b<\u00104\u001a\u0004\b:\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010=\u0012\u0004\b@\u00104\u001a\u0004\b>\u0010?R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bB\u0010CR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010A\u001a\u0004\bD\u0010CR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bF\u0010GR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "Lcom/revenuecat/purchases/paywalls/components/PartialComponent;", "", "visible", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "source", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "size", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationKey;", "overrideSourceLid", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "fitMode", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "maskShape", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "colorOverlay", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "padding", "margin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "border", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "shadow", "<init>", "(Ljava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;Lcom/revenuecat/purchases/paywalls/components/properties/Size;Ljava/lang/String;Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Padding;Lcom/revenuecat/purchases/paywalls/components/properties/Border;Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Boolean;", "getVisible", "()Ljava/lang/Boolean;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "getSource", "()Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "getSize", "()Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q", "()Ljava/lang/String;", "getOverrideSourceLid-sa7TU9Q$annotations", "()V", "Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode", "()Lcom/revenuecat/purchases/paywalls/components/properties/FitMode;", "getFitMode$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape", "()Lcom/revenuecat/purchases/paywalls/components/properties/MaskShape;", "getMaskShape$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColorOverlay$annotations", "Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getPadding", "()Lcom/revenuecat/purchases/paywalls/components/properties/Padding;", "getMargin", "Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "getBorder", "()Lcom/revenuecat/purchases/paywalls/components/properties/Border;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "getShadow", "()Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class PartialImageComponent implements com.revenuecat.purchases.paywalls.components.PartialComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.PartialImageComponent.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.PartialImageComponent.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.properties.Border border;
    private final com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorOverlay;
    private final com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding margin;
    private final com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape;
    private final java.lang.String overrideSourceLid;
    private final com.revenuecat.purchases.paywalls.components.properties.Padding padding;
    private final com.revenuecat.purchases.paywalls.components.properties.Shadow shadow;
    private final com.revenuecat.purchases.paywalls.components.properties.Size size;
    private final com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls source;
    private final java.lang.Boolean visible;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/PartialImageComponent;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.PartialImageComponent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ PartialImageComponent(int i3, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size size, @p119n8.h("override_source_lid") java.lang.String str, @p119n8.h("fit_mode") com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode, @p119n8.h("mask_shape") com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape, @p119n8.h("color_overlay") com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, p153r8.k0 k0Var, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(i3, bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding, padding2, border, shadow, k0Var);
    }

    @p119n8.h("color_overlay")
    public static /* synthetic */ void getColorOverlay$annotations() {
    }

    @p119n8.h("fit_mode")
    public static /* synthetic */ void getFitMode$annotations() {
    }

    @p119n8.h("mask_shape")
    public static /* synthetic */ void getMaskShape$annotations() {
    }

    @p119n8.h("override_source_lid")
    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q$annotations, reason: not valid java name */
    public static /* synthetic */ void m201getOverrideSourceLidsa7TU9Q$annotations() {
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.PartialImageComponent self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        if (output.E(serialDesc) || !kotlin.jvm.internal.m.a(self.visible, java.lang.Boolean.TRUE)) {
            output.t(serialDesc, 0, p153r8.C2696g.f26961a, self.visible);
        }
        if (output.E(serialDesc) || self.source != null) {
            output.t(serialDesc, 1, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer.INSTANCE, self.source);
        }
        if (output.E(serialDesc) || self.size != null) {
            output.t(serialDesc, 2, com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE, self.size);
        }
        if (output.E(serialDesc) || self.overrideSourceLid != null) {
            com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer localizationKey$$serializer = com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer.INSTANCE;
            java.lang.String str = self.overrideSourceLid;
            output.t(serialDesc, 3, localizationKey$$serializer, str != null ? com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m257boximpl(str) : null);
        }
        if (output.E(serialDesc) || self.fitMode != null) {
            output.t(serialDesc, 4, com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer.INSTANCE, self.fitMode);
        }
        if (output.E(serialDesc) || self.maskShape != null) {
            output.t(serialDesc, 5, com.revenuecat.purchases.paywalls.components.properties.MaskShapeDeserializer.INSTANCE, self.maskShape);
        }
        if (output.E(serialDesc) || self.colorOverlay != null) {
            output.t(serialDesc, 6, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE, self.colorOverlay);
        }
        if (output.E(serialDesc) || self.padding != null) {
            output.t(serialDesc, 7, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.padding);
        }
        if (output.E(serialDesc) || self.margin != null) {
            output.t(serialDesc, 8, com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer.INSTANCE, self.margin);
        }
        if (output.E(serialDesc) || self.border != null) {
            output.t(serialDesc, 9, com.revenuecat.purchases.paywalls.components.properties.Border$$serializer.INSTANCE, self.border);
        }
        if (!output.E(serialDesc) && self.shadow == null) {
            return;
        }
        output.t(serialDesc, 10, com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE, self.shadow);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0037  */
    public boolean equals(java.lang.Object obj) {
        boolean zM260equalsimpl0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.PartialImageComponent)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.PartialImageComponent partialImageComponent = (com.revenuecat.purchases.paywalls.components.PartialImageComponent) obj;
        if (!kotlin.jvm.internal.m.a(this.visible, partialImageComponent.visible) || !kotlin.jvm.internal.m.a(this.source, partialImageComponent.source) || !kotlin.jvm.internal.m.a(this.size, partialImageComponent.size)) {
            return false;
        }
        java.lang.String str = this.overrideSourceLid;
        java.lang.String str2 = partialImageComponent.overrideSourceLid;
        if (str == null) {
            if (str2 == null) {
                zM260equalsimpl0 = true;
            } else {
                zM260equalsimpl0 = false;
            }
        } else if (str2 == null) {
            zM260equalsimpl0 = false;
        } else {
            zM260equalsimpl0 = com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m260equalsimpl0(str, str2);
        }
        return zM260equalsimpl0 && this.fitMode == partialImageComponent.fitMode && kotlin.jvm.internal.m.a(this.maskShape, partialImageComponent.maskShape) && kotlin.jvm.internal.m.a(this.colorOverlay, partialImageComponent.colorOverlay) && kotlin.jvm.internal.m.a(this.padding, partialImageComponent.padding) && kotlin.jvm.internal.m.a(this.margin, partialImageComponent.margin) && kotlin.jvm.internal.m.a(this.border, partialImageComponent.border) && kotlin.jvm.internal.m.a(this.shadow, partialImageComponent.shadow);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Border getBorder() {
        return this.border;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorScheme getColorOverlay() {
        return this.colorOverlay;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FitMode getFitMode() {
        return this.fitMode;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Padding getMargin() {
        return this.margin;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.MaskShape getMaskShape() {
        return this.maskShape;
    }

    /* JADX INFO: renamed from: getOverrideSourceLid-sa7TU9Q, reason: not valid java name and from getter */
    public final /* synthetic */ java.lang.String getOverrideSourceLid() {
        return this.overrideSourceLid;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Padding getPadding() {
        return this.padding;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Shadow getShadow() {
        return this.shadow;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.Size getSize() {
        return this.size;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls getSource() {
        return this.source;
    }

    public final /* synthetic */ java.lang.Boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        java.lang.Boolean bool = this.visible;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls = this.source;
        int iHashCode2 = (iHashCode + (themeImageUrls == null ? 0 : themeImageUrls.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Size size = this.size;
        int iHashCode3 = (iHashCode2 + (size == null ? 0 : size.hashCode())) * 31;
        java.lang.String str = this.overrideSourceLid;
        int iM261hashCodeimpl = (iHashCode3 + (str == null ? 0 : com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m261hashCodeimpl(str))) * 31;
        com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode = this.fitMode;
        int iHashCode4 = (iM261hashCodeimpl + (fitMode == null ? 0 : fitMode.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape = this.maskShape;
        int iHashCode5 = (iHashCode4 + (maskShape == null ? 0 : maskShape.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme = this.colorOverlay;
        int iHashCode6 = (iHashCode5 + (colorScheme == null ? 0 : colorScheme.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding = this.padding;
        int iHashCode7 = (iHashCode6 + (padding == null ? 0 : padding.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding2 = this.margin;
        int iHashCode8 = (iHashCode7 + (padding2 == null ? 0 : padding2.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Border border = this.border;
        int iHashCode9 = (iHashCode8 + (border == null ? 0 : border.hashCode())) * 31;
        com.revenuecat.purchases.paywalls.components.properties.Shadow shadow = this.shadow;
        return iHashCode9 + (shadow != null ? shadow.hashCode() : 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartialImageComponent(visible=");
        sb.append(this.visible);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", size=");
        sb.append(this.size);
        sb.append(", overrideSourceLid=");
        java.lang.String str = this.overrideSourceLid;
        sb.append((java.lang.Object) (str == null ? "null" : com.revenuecat.purchases.paywalls.components.common.LocalizationKey.m262toStringimpl(str)));
        sb.append(", fitMode=");
        sb.append(this.fitMode);
        sb.append(", maskShape=");
        sb.append(this.maskShape);
        sb.append(", colorOverlay=");
        sb.append(this.colorOverlay);
        sb.append(", padding=");
        sb.append(this.padding);
        sb.append(", margin=");
        sb.append(this.margin);
        sb.append(", border=");
        sb.append(this.border);
        sb.append(", shadow=");
        sb.append(this.shadow);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ PartialImageComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.String str, com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode, com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(bool, themeImageUrls, size, str, fitMode, maskShape, colorScheme, padding, padding2, border, shadow);
    }

    private PartialImageComponent(int i3, java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.String str, com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode, com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, p153r8.k0 k0Var) {
        this.visible = (i3 & 1) == 0 ? java.lang.Boolean.TRUE : bool;
        if ((i3 & 2) == 0) {
            this.source = null;
        } else {
            this.source = themeImageUrls;
        }
        if ((i3 & 4) == 0) {
            this.size = null;
        } else {
            this.size = size;
        }
        if ((i3 & 8) == 0) {
            this.overrideSourceLid = null;
        } else {
            this.overrideSourceLid = str;
        }
        if ((i3 & 16) == 0) {
            this.fitMode = null;
        } else {
            this.fitMode = fitMode;
        }
        if ((i3 & 32) == 0) {
            this.maskShape = null;
        } else {
            this.maskShape = maskShape;
        }
        if ((i3 & 64) == 0) {
            this.colorOverlay = null;
        } else {
            this.colorOverlay = colorScheme;
        }
        if ((i3 & 128) == 0) {
            this.padding = null;
        } else {
            this.padding = padding;
        }
        if ((i3 & 256) == 0) {
            this.margin = null;
        } else {
            this.margin = padding2;
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
    }

    private PartialImageComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.String str, com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode, com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow) {
        this.visible = bool;
        this.source = themeImageUrls;
        this.size = size;
        this.overrideSourceLid = str;
        this.fitMode = fitMode;
        this.maskShape = maskShape;
        this.colorOverlay = colorScheme;
        this.padding = padding;
        this.margin = padding2;
        this.border = border;
        this.shadow = shadow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PartialImageComponent(java.lang.Boolean bool, com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls, com.revenuecat.purchases.paywalls.components.properties.Size size, java.lang.String str, com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode, com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, com.revenuecat.purchases.paywalls.components.properties.Padding padding, com.revenuecat.purchases.paywalls.components.properties.Padding padding2, com.revenuecat.purchases.paywalls.components.properties.Border border, com.revenuecat.purchases.paywalls.components.properties.Shadow shadow, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        java.lang.Boolean bool2 = (i3 & 1) != 0 ? java.lang.Boolean.TRUE : bool;
        com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls themeImageUrls2 = (i3 & 2) != 0 ? null : themeImageUrls;
        com.revenuecat.purchases.paywalls.components.properties.Size size2 = (i3 & 4) != 0 ? null : size;
        java.lang.String str2 = (i3 & 8) != 0 ? null : str;
        com.revenuecat.purchases.paywalls.components.properties.FitMode fitMode2 = (i3 & 16) != 0 ? null : fitMode;
        com.revenuecat.purchases.paywalls.components.properties.MaskShape maskShape2 = (i3 & 32) != 0 ? null : maskShape;
        com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme2 = (i3 & 64) != 0 ? null : colorScheme;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding3 = (i3 & 128) != 0 ? null : padding;
        com.revenuecat.purchases.paywalls.components.properties.Padding padding4 = (i3 & 256) != 0 ? null : padding2;
        com.revenuecat.purchases.paywalls.components.properties.Border border2 = (i3 & 512) != 0 ? null : border;
        this(bool2, themeImageUrls2, size2, str2, fitMode2, maskShape2, colorScheme2, padding3, padding4, border2, (i3 & 1024) == 0 ? shadow : null, null);
    }
}

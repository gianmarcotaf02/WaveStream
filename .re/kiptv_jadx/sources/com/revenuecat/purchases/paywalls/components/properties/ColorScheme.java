package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorInfo;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ColorScheme {
    private static final kotlinx.serialization.KSerializer[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.ColorScheme.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ColorScheme.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.properties.ColorInfo dark;
    private final com.revenuecat.purchases.paywalls.components.properties.ColorInfo light;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        kotlin.jvm.internal.C c9 = kotlin.jvm.internal.B.f24540a;
        E6.InterfaceC0331d interfaceC0331dB = c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.class);
        E6.InterfaceC0331d[] interfaceC0331dArr = {c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Alias.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Linear.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Radial.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Hex.class)};
        com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Alias$$serializer.INSTANCE;
        com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Gradient$Linear$$serializer.INSTANCE;
        com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Gradient$Radial$$serializer.INSTANCE;
        com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = com.revenuecat.purchases.paywalls.components.properties.ColorInfo$Hex$$serializer.INSTANCE;
        $childSerializers = new kotlinx.serialization.KSerializer[]{new p119n8.f("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", interfaceC0331dB, interfaceC0331dArr, new kotlinx.serialization.KSerializer[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new java.lang.annotation.Annotation[0]), new p119n8.f("com.revenuecat.purchases.paywalls.components.properties.ColorInfo", c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.class), new E6.InterfaceC0331d[]{c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Alias.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Linear.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Radial.class), c9.b(com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Hex.class)}, new kotlinx.serialization.KSerializer[]{colorInfo$Alias$$serializer, colorInfo$Gradient$Linear$$serializer, colorInfo$Gradient$Radial$$serializer, colorInfo$Hex$$serializer}, new java.lang.annotation.Annotation[0])};
    }

    @p070h6.c
    public /* synthetic */ ColorScheme(int i3, com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo, com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo2, p153r8.k0 k0Var) {
        if (1 != (i3 & 1)) {
            p153r8.AbstractC2686a0.l(i3, 1, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = colorInfo;
        if ((i3 & 2) == 0) {
            this.dark = null;
        } else {
            this.dark = colorInfo2;
        }
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.ColorScheme self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlinx.serialization.KSerializer[] kSerializerArr = $childSerializers;
        output.h(serialDesc, 0, kSerializerArr[0], self.light);
        if (!output.E(serialDesc) && self.dark == null) {
            return;
        }
        output.t(serialDesc, 1, kSerializerArr[1], self.dark);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.ColorScheme)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme = (com.revenuecat.purchases.paywalls.components.properties.ColorScheme) obj;
        return kotlin.jvm.internal.m.a(this.light, colorScheme.light) && kotlin.jvm.internal.m.a(this.dark, colorScheme.dark);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorInfo getDark() {
        return this.dark;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorInfo getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo = this.dark;
        return iHashCode + (colorInfo == null ? 0 : colorInfo.hashCode());
    }

    public java.lang.String toString() {
        return "ColorScheme(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ColorScheme(com.revenuecat.purchases.paywalls.components.properties.ColorInfo light, com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo) {
        kotlin.jvm.internal.m.e(light, "light");
        this.light = light;
        this.dark = colorInfo;
    }

    public /* synthetic */ ColorScheme(com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo, com.revenuecat.purchases.paywalls.components.properties.ColorInfo colorInfo2, int i3, kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
        this(colorInfo, (i3 & 2) != 0 ? null : colorInfo2);
    }
}

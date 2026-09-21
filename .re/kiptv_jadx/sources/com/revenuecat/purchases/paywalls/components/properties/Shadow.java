package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000  2\u00020\u0001:\u0002! B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tB=\b\u0011\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ(\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012HÁ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", androidx.media3.extractor.text.ttml.TtmlNode.ATTR_TTS_COLOR, "", "radius", "x", "y", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDD)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;DDDLr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "getColor", "()Lcom/revenuecat/purchases/paywalls/components/properties/ColorScheme;", "D", "getRadius", "()D", "getX", "getY", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class Shadow {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.Shadow.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Shadow.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.properties.ColorScheme color;
    private final double radius;
    private final double x;
    private final double y;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Shadow$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Shadow;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ Shadow(int i3, com.revenuecat.purchases.paywalls.components.properties.ColorScheme colorScheme, double d4, double d6, double d9, p153r8.k0 k0Var) {
        if (15 != (i3 & 15)) {
            p153r8.AbstractC2686a0.l(i3, 15, com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.color = colorScheme;
        this.radius = d4;
        this.x = d6;
        this.y = d9;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.Shadow self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.h(serialDesc, 0, com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer.INSTANCE, self.color);
        output.B(serialDesc, 1, self.radius);
        output.B(serialDesc, 2, self.x);
        output.B(serialDesc, 3, self.y);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.Shadow)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.properties.Shadow shadow = (com.revenuecat.purchases.paywalls.components.properties.Shadow) obj;
        return kotlin.jvm.internal.m.a(this.color, shadow.color) && java.lang.Double.compare(this.radius, shadow.radius) == 0 && java.lang.Double.compare(this.x, shadow.x) == 0 && java.lang.Double.compare(this.y, shadow.y) == 0;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.ColorScheme getColor() {
        return this.color;
    }

    public final /* synthetic */ double getRadius() {
        return this.radius;
    }

    public final /* synthetic */ double getX() {
        return this.x;
    }

    public final /* synthetic */ double getY() {
        return this.y;
    }

    public int hashCode() {
        return java.lang.Double.hashCode(this.y) + ((java.lang.Double.hashCode(this.x) + ((java.lang.Double.hashCode(this.radius) + (this.color.hashCode() * 31)) * 31)) * 31);
    }

    public java.lang.String toString() {
        return "Shadow(color=" + this.color + ", radius=" + this.radius + ", x=" + this.x + ", y=" + this.y + ')';
    }

    public Shadow(com.revenuecat.purchases.paywalls.components.properties.ColorScheme color, double d4, double d6, double d9) {
        kotlin.jvm.internal.m.e(color, "color");
        this.color = color;
        this.radius = d4;
        this.x = d6;
        this.y = d9;
    }
}

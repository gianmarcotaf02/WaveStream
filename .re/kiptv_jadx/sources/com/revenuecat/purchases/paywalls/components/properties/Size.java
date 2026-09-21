package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "width", "height", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/Size;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "getWidth", "()Lcom/revenuecat/purchases/paywalls/components/properties/SizeConstraint;", "getHeight", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class Size {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.Size.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.Size.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint height;
    private final com.revenuecat.purchases.paywalls.components.properties.SizeConstraint width;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/Size$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/Size;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ Size(int i3, com.revenuecat.purchases.paywalls.components.properties.SizeConstraint sizeConstraint, com.revenuecat.purchases.paywalls.components.properties.SizeConstraint sizeConstraint2, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.properties.Size$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = sizeConstraint;
        this.height = sizeConstraint2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.Size self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer sizeConstraintDeserializer = com.revenuecat.purchases.paywalls.components.properties.SizeConstraintDeserializer.INSTANCE;
        output.h(serialDesc, 0, sizeConstraintDeserializer, self.width);
        output.h(serialDesc, 1, sizeConstraintDeserializer, self.height);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.Size)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.properties.Size size = (com.revenuecat.purchases.paywalls.components.properties.Size) obj;
        return kotlin.jvm.internal.m.a(this.width, size.width) && kotlin.jvm.internal.m.a(this.height, size.height);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.SizeConstraint getHeight() {
        return this.height;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.SizeConstraint getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.height.hashCode() + (this.width.hashCode() * 31);
    }

    public java.lang.String toString() {
        return "Size(width=" + this.width + ", height=" + this.height + ')';
    }

    public Size(com.revenuecat.purchases.paywalls.components.properties.SizeConstraint width, com.revenuecat.purchases.paywalls.components.properties.SizeConstraint height) {
        kotlin.jvm.internal.m.e(width, "width");
        kotlin.jvm.internal.m.e(height, "height");
        this.width = width;
        this.height = height;
    }
}

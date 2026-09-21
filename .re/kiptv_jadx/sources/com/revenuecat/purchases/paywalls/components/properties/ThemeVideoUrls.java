package com.revenuecat.purchases.paywalls.components.properties;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@p119n8.i
public final class ThemeVideoUrls {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls.Companion INSTANCE = new com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls.Companion(null);
    private final com.revenuecat.purchases.paywalls.components.properties.VideoUrls dark;
    private final com.revenuecat.purchases.paywalls.components.properties.VideoUrls light;

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.AbstractC2541f abstractC2541f) {
            this();
        }

        public final kotlinx.serialization.KSerializer serializer() {
            return com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @p070h6.c
    public /* synthetic */ ThemeVideoUrls(int i3, com.revenuecat.purchases.paywalls.components.properties.VideoUrls videoUrls, com.revenuecat.purchases.paywalls.components.properties.VideoUrls videoUrls2, p153r8.k0 k0Var) {
        if (3 != (i3 & 3)) {
            p153r8.AbstractC2686a0.l(i3, 3, com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = videoUrls;
        this.dark = videoUrls2;
    }

    public static final /* synthetic */ void write$Self$purchases_defaultsRelease(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls self, p143q8.b output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        com.revenuecat.purchases.paywalls.components.properties.VideoUrls$$serializer videoUrls$$serializer = com.revenuecat.purchases.paywalls.components.properties.VideoUrls$$serializer.INSTANCE;
        output.h(serialDesc, 0, videoUrls$$serializer, self.light);
        output.t(serialDesc, 1, videoUrls$$serializer, self.dark);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls = (com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls) obj;
        return kotlin.jvm.internal.m.a(this.light, themeVideoUrls.light) && kotlin.jvm.internal.m.a(this.dark, themeVideoUrls.dark);
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.VideoUrls getDark() {
        return this.dark;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.VideoUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        com.revenuecat.purchases.paywalls.components.properties.VideoUrls videoUrls = this.dark;
        return iHashCode + (videoUrls == null ? 0 : videoUrls.hashCode());
    }

    public java.lang.String toString() {
        return "ThemeVideoUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeVideoUrls(com.revenuecat.purchases.paywalls.components.properties.VideoUrls light, com.revenuecat.purchases.paywalls.components.properties.VideoUrls videoUrls) {
        kotlin.jvm.internal.m.e(light, "light");
        this.light = light;
        this.dark = videoUrls;
    }
}

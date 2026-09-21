package com.revenuecat.purchases.paywalls.components.properties;

import androidx.media3.container.NalUnitUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u0019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0011\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÁ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "light", "dark", "<init>", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lr8/k0;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "getLight", "()Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "getDark", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class ThemeVideoUrls {

    public static final Companion INSTANCE = new Companion(null);
    private final VideoUrls dark;
    private final VideoUrls light;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return ThemeVideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public ThemeVideoUrls(int i3, VideoUrls videoUrls, VideoUrls videoUrls2, k0 k0Var) {
        if (3 != (i3 & 3)) {
            AbstractC2686a0.l(i3, 3, ThemeVideoUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.light = videoUrls;
        this.dark = videoUrls2;
    }

    public static final void write$Self$purchases_defaultsRelease(ThemeVideoUrls self, b output, SerialDescriptor serialDesc) {
        VideoUrls$$serializer videoUrls$$serializer = VideoUrls$$serializer.INSTANCE;
        output.h(serialDesc, 0, videoUrls$$serializer, self.light);
        output.t(serialDesc, 1, videoUrls$$serializer, self.dark);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThemeVideoUrls)) {
            return false;
        }
        ThemeVideoUrls themeVideoUrls = (ThemeVideoUrls) obj;
        return m.a(this.light, themeVideoUrls.light) && m.a(this.dark, themeVideoUrls.dark);
    }

    public final VideoUrls getDark() {
        return this.dark;
    }

    public final VideoUrls getLight() {
        return this.light;
    }

    public int hashCode() {
        int iHashCode = this.light.hashCode() * 31;
        VideoUrls videoUrls = this.dark;
        return iHashCode + (videoUrls == null ? 0 : videoUrls.hashCode());
    }

    public String toString() {
        return "ThemeVideoUrls(light=" + this.light + ", dark=" + this.dark + ')';
    }

    public ThemeVideoUrls(VideoUrls light, VideoUrls videoUrls) {
        m.e(light, "light");
        this.light = light;
        this.dark = videoUrls;
    }
}

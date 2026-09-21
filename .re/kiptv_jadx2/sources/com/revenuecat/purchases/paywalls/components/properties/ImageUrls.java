package com.revenuecat.purchases.paywalls.components.properties;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p070h6.c;
import p070h6.t;
import p119n8.h;
import p119n8.i;
import p143q8.b;
import p153r8.AbstractC2686a0;
import p153r8.k0;
import p153r8.w0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002'&B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nBS\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u0012\u0004\b!\u0010\u001d\u001a\u0004\b \u0010\u001bR\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\b\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "", "Ljava/net/URL;", "original", "webp", "webpLowRes", "Lh6/t;", "width", "height", "<init>", "(Ljava/net/URL;Ljava/net/URL;Ljava/net/URL;IILkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILjava/net/URL;Ljava/net/URL;Ljava/net/URL;Lh6/t;Lh6/t;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/net/URL;", "getOriginal", "()Ljava/net/URL;", "getOriginal$annotations", "()V", "getWebp", "getWebp$annotations", "getWebpLowRes", "getWebpLowRes$annotations", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class ImageUrls {

    public static final Companion INSTANCE = new Companion(null);
    private final int height;
    private final URL original;
    private final URL webp;
    private final URL webpLowRes;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return ImageUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @c
    public ImageUrls(int i3, @i(with = URLSerializer.class) URL url, @i(with = URLSerializer.class) URL url2, @h("webp_low_res") @i(with = URLSerializer.class) URL url3, t tVar, t tVar2, k0 k0Var, AbstractC2541f abstractC2541f) {
        this(i3, url, url2, url3, tVar, tVar2, k0Var);
    }

    @i(with = URLSerializer.class)
    public static void getOriginal$annotations() {
    }

    @i(with = URLSerializer.class)
    public static void getWebp$annotations() {
    }

    @h("webp_low_res")
    @i(with = URLSerializer.class)
    public static void getWebpLowRes$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(ImageUrls self, b output, SerialDescriptor serialDesc) {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        output.h(serialDesc, 0, uRLSerializer, self.original);
        output.h(serialDesc, 1, uRLSerializer, self.webp);
        output.h(serialDesc, 2, uRLSerializer, self.webpLowRes);
        w0 w0Var = w0.f27015a;
        output.h(serialDesc, 3, w0Var, new t(self.width));
        output.h(serialDesc, 4, w0Var, new t(self.height));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageUrls)) {
            return false;
        }
        ImageUrls imageUrls = (ImageUrls) obj;
        return m.a(this.original, imageUrls.original) && m.a(this.webp, imageUrls.webp) && m.a(this.webpLowRes, imageUrls.webpLowRes) && this.width == imageUrls.width && this.height == imageUrls.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final URL getOriginal() {
        return this.original;
    }

    public final URL getWebp() {
        return this.webp;
    }

    public final URL getWebpLowRes() {
        return this.webpLowRes;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.webpLowRes.hashCode() + ((this.webp.hashCode() + (this.original.hashCode() * 31)) * 31)) * 31) + this.width) * 31) + this.height;
    }

    public String toString() {
        return "ImageUrls(original=" + this.original + ", webp=" + this.webp + ", webpLowRes=" + this.webpLowRes + ", width=" + ((Object) t.a(this.width)) + ", height=" + ((Object) t.a(this.height)) + ')';
    }

    public ImageUrls(URL url, URL url2, URL url3, int i3, int i9, AbstractC2541f abstractC2541f) {
        this(url, url2, url3, i3, i9);
    }

    private ImageUrls(int i3, URL url, URL url2, URL url3, t tVar, t tVar2, k0 k0Var) {
        if (31 != (i3 & 31)) {
            AbstractC2686a0.l(i3, 31, ImageUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.original = url;
        this.webp = url2;
        this.webpLowRes = url3;
        this.width = tVar.f22551h;
        this.height = tVar2.f22551h;
    }

    private ImageUrls(URL original, URL webp, URL webpLowRes, int i3, int i9) {
        m.e(original, "original");
        m.e(webp, "webp");
        m.e(webpLowRes, "webpLowRes");
        this.original = original;
        this.webp = webp;
        this.webpLowRes = webpLowRes;
        this.width = i3;
        this.height = i9;
    }
}

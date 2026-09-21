package com.revenuecat.purchases.paywalls.components.properties;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import io.sentry.protocol.Request;
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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fB]\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b%\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u0012\u0004\b(\u0010#\u001a\u0004\b'\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010$\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010&\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "", "Lh6/t;", "width", "height", "Ljava/net/URL;", Request.JsonKeys.URL, "Lcom/revenuecat/purchases/models/Checksum;", "checksum", "urlLowRes", "checksumLowRes", "<init>", "(IILjava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lkotlin/jvm/internal/f;)V", "", "seen1", "Lr8/k0;", "serializationConstructorMarker", "(ILh6/t;Lh6/t;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Ljava/net/URL;Lcom/revenuecat/purchases/models/Checksum;Lr8/k0;Lkotlin/jvm/internal/f;)V", "self", "Lq8/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lh6/A;", "write$Self$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;Lq8/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getWidth-pVg5ArA", "()I", "getHeight-pVg5ArA", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "getUrl$annotations", "()V", "Lcom/revenuecat/purchases/models/Checksum;", "getChecksum", "()Lcom/revenuecat/purchases/models/Checksum;", "getUrlLowRes", "getUrlLowRes$annotations", "getChecksumLowRes", "getChecksumLowRes$annotations", "Companion", "$serializer", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
@i
public final class VideoUrls {

    public static final Companion INSTANCE = new Companion(null);
    private final Checksum checksum;
    private final Checksum checksumLowRes;
    private final int height;
    private final URL url;
    private final URL urlLowRes;
    private final int width;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
    public static final class Companion {
        public Companion(AbstractC2541f abstractC2541f) {
            this();
        }

        public final KSerializer serializer() {
            return VideoUrls$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public VideoUrls(int i3, int i9, URL url, Checksum checksum, URL url2, Checksum checksum2, AbstractC2541f abstractC2541f) {
        this(i3, i9, url, checksum, url2, checksum2);
    }

    @h("checksum_low_res")
    public static void getChecksumLowRes$annotations() {
    }

    @i(with = URLSerializer.class)
    public static void getUrl$annotations() {
    }

    @h("url_low_res")
    @i(with = URLSerializer.class)
    public static void getUrlLowRes$annotations() {
    }

    public static final void write$Self$purchases_defaultsRelease(VideoUrls self, b output, SerialDescriptor serialDesc) {
        w0 w0Var = w0.f27015a;
        output.h(serialDesc, 0, w0Var, new t(self.width));
        output.h(serialDesc, 1, w0Var, new t(self.height));
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        output.h(serialDesc, 2, uRLSerializer, self.url);
        if (output.E(serialDesc) || self.checksum != null) {
            output.t(serialDesc, 3, Checksum$$serializer.INSTANCE, self.checksum);
        }
        if (output.E(serialDesc) || self.urlLowRes != null) {
            output.t(serialDesc, 4, uRLSerializer, self.urlLowRes);
        }
        if (!output.E(serialDesc) && self.checksumLowRes == null) {
            return;
        }
        output.t(serialDesc, 5, Checksum$$serializer.INSTANCE, self.checksumLowRes);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoUrls)) {
            return false;
        }
        VideoUrls videoUrls = (VideoUrls) obj;
        return this.width == videoUrls.width && this.height == videoUrls.height && m.a(this.url, videoUrls.url) && m.a(this.checksum, videoUrls.checksum) && m.a(this.urlLowRes, videoUrls.urlLowRes) && m.a(this.checksumLowRes, videoUrls.checksumLowRes);
    }

    public final Checksum getChecksum() {
        return this.checksum;
    }

    public final Checksum getChecksumLowRes() {
        return this.checksumLowRes;
    }

    public final int getHeight() {
        return this.height;
    }

    public final URL getUrl() {
        return this.url;
    }

    public final URL getUrlLowRes() {
        return this.urlLowRes;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.url.hashCode() + (((this.width * 31) + this.height) * 31)) * 31;
        Checksum checksum = this.checksum;
        int iHashCode2 = (iHashCode + (checksum == null ? 0 : checksum.hashCode())) * 31;
        URL url = this.urlLowRes;
        int iHashCode3 = (iHashCode2 + (url == null ? 0 : url.hashCode())) * 31;
        Checksum checksum2 = this.checksumLowRes;
        return iHashCode3 + (checksum2 != null ? checksum2.hashCode() : 0);
    }

    public String toString() {
        return "VideoUrls(width=" + ((Object) t.a(this.width)) + ", height=" + ((Object) t.a(this.height)) + ", url=" + this.url + ", checksum=" + this.checksum + ", urlLowRes=" + this.urlLowRes + ", checksumLowRes=" + this.checksumLowRes + ')';
    }

    @c
    public VideoUrls(int i3, t tVar, t tVar2, @i(with = URLSerializer.class) URL url, Checksum checksum, @h("url_low_res") @i(with = URLSerializer.class) URL url2, @h("checksum_low_res") Checksum checksum2, k0 k0Var, AbstractC2541f abstractC2541f) {
        this(i3, tVar, tVar2, url, checksum, url2, checksum2, k0Var);
    }

    private VideoUrls(int i3, int i9, URL url, Checksum checksum, URL url2, Checksum checksum2) {
        m.e(url, "url");
        this.width = i3;
        this.height = i9;
        this.url = url;
        this.checksum = checksum;
        this.urlLowRes = url2;
        this.checksumLowRes = checksum2;
    }

    private VideoUrls(int i3, t tVar, t tVar2, URL url, Checksum checksum, URL url2, Checksum checksum2, k0 k0Var) {
        if (7 != (i3 & 7)) {
            AbstractC2686a0.l(i3, 7, VideoUrls$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.width = tVar.f22551h;
        this.height = tVar2.f22551h;
        this.url = url;
        if ((i3 & 8) == 0) {
            this.checksum = null;
        } else {
            this.checksum = checksum;
        }
        if ((i3 & 16) == 0) {
            this.urlLowRes = null;
        } else {
            this.urlLowRes = url2;
        }
        if ((i3 & 32) == 0) {
            this.checksumLowRes = null;
        } else {
            this.checksumLowRes = checksum2;
        }
    }

    public VideoUrls(int i3, int i9, URL url, Checksum checksum, URL url2, Checksum checksum2, int i10, AbstractC2541f abstractC2541f) {
        this(i3, i9, url, (i10 & 8) != 0 ? null : checksum, (i10 & 16) != 0 ? null : url2, (i10 & 32) != 0 ? null : checksum2, null);
    }
}

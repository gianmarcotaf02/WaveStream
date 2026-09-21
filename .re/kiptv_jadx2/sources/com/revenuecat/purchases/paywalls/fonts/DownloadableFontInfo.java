package com.revenuecat.purchases.paywalls.fonts;

import B2.a;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import io.sentry.protocol.Device;
import io.sentry.protocol.Request;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p121o0.p;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", Request.JsonKeys.URL, "", "expectedMd5", Device.JsonKeys.FAMILY, "weight", "", "style", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/revenuecat/purchases/paywalls/components/properties/FontStyle;)V", "getExpectedMd5", "()Ljava/lang/String;", "getFamily", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "getUrl", "getWeight", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadableFontInfo {
    private final String expectedMd5;
    private final String family;
    private final FontStyle style;
    private final String url;
    private final int weight;

    public DownloadableFontInfo(String url, String expectedMd5, String family, int i3, FontStyle style) {
        m.e(url, "url");
        m.e(expectedMd5, "expectedMd5");
        m.e(family, "family");
        m.e(style, "style");
        this.url = url;
        this.expectedMd5 = expectedMd5;
        this.family = family;
        this.weight = i3;
        this.style = style;
    }

    public static DownloadableFontInfo copy$default(DownloadableFontInfo downloadableFontInfo, String str, String str2, String str3, int i3, FontStyle fontStyle, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = downloadableFontInfo.url;
        }
        if ((i9 & 2) != 0) {
            str2 = downloadableFontInfo.expectedMd5;
        }
        if ((i9 & 4) != 0) {
            str3 = downloadableFontInfo.family;
        }
        if ((i9 & 8) != 0) {
            i3 = downloadableFontInfo.weight;
        }
        if ((i9 & 16) != 0) {
            fontStyle = downloadableFontInfo.style;
        }
        FontStyle fontStyle2 = fontStyle;
        String str4 = str3;
        return downloadableFontInfo.copy(str, str2, str4, i3, fontStyle2);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getExpectedMd5() {
        return this.expectedMd5;
    }

    public final String getFamily() {
        return this.family;
    }

    public final int getWeight() {
        return this.weight;
    }

    public final FontStyle getStyle() {
        return this.style;
    }

    public final DownloadableFontInfo copy(String url, String expectedMd5, String family, int weight, FontStyle style) {
        m.e(url, "url");
        m.e(expectedMd5, "expectedMd5");
        m.e(family, "family");
        m.e(style, "style");
        return new DownloadableFontInfo(url, expectedMd5, family, weight, style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DownloadableFontInfo)) {
            return false;
        }
        DownloadableFontInfo downloadableFontInfo = (DownloadableFontInfo) other;
        return m.a(this.url, downloadableFontInfo.url) && m.a(this.expectedMd5, downloadableFontInfo.expectedMd5) && m.a(this.family, downloadableFontInfo.family) && this.weight == downloadableFontInfo.weight && this.style == downloadableFontInfo.style;
    }

    public final String getExpectedMd5() {
        return this.expectedMd5;
    }

    public final String getFamily() {
        return this.family;
    }

    public final FontStyle getStyle() {
        return this.style;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.style.hashCode() + p.d(this.weight, a.a(a.a(this.url.hashCode() * 31, 31, this.expectedMd5), 31, this.family), 31);
    }

    public String toString() {
        return "DownloadableFontInfo(url=" + this.url + ", expectedMd5=" + this.expectedMd5 + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
    }
}

package com.revenuecat.purchases.paywalls.fonts;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", io.sentry.protocol.Request.JsonKeys.URL, "", "expectedMd5", io.sentry.protocol.Device.JsonKeys.FAMILY, "weight", "", "style", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/revenuecat/purchases/paywalls/components/properties/FontStyle;)V", "getExpectedMd5", "()Ljava/lang/String;", "getFamily", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "getUrl", "getWeight", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", io.sentry.protocol.Request.JsonKeys.OTHER, "hashCode", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final /* data */ class DownloadableFontInfo {
    private final java.lang.String expectedMd5;
    private final java.lang.String family;
    private final com.revenuecat.purchases.paywalls.components.properties.FontStyle style;
    private final java.lang.String url;
    private final int weight;

    public DownloadableFontInfo(java.lang.String url, java.lang.String expectedMd5, java.lang.String family, int i3, com.revenuecat.purchases.paywalls.components.properties.FontStyle style) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(expectedMd5, "expectedMd5");
        kotlin.jvm.internal.m.e(family, "family");
        kotlin.jvm.internal.m.e(style, "style");
        this.url = url;
        this.expectedMd5 = expectedMd5;
        this.family = family;
        this.weight = i3;
        this.style = style;
    }

    public static /* synthetic */ com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo copy$default(com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i3, com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle, int i9, java.lang.Object obj) {
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
        com.revenuecat.purchases.paywalls.components.properties.FontStyle fontStyle2 = fontStyle;
        java.lang.String str4 = str3;
        return downloadableFontInfo.copy(str, str2, str4, i3, fontStyle2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getExpectedMd5() {
        return this.expectedMd5;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final java.lang.String getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final com.revenuecat.purchases.paywalls.components.properties.FontStyle getStyle() {
        return this.style;
    }

    public final com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo copy(java.lang.String url, java.lang.String expectedMd5, java.lang.String family, int weight, com.revenuecat.purchases.paywalls.components.properties.FontStyle style) {
        kotlin.jvm.internal.m.e(url, "url");
        kotlin.jvm.internal.m.e(expectedMd5, "expectedMd5");
        kotlin.jvm.internal.m.e(family, "family");
        kotlin.jvm.internal.m.e(style, "style");
        return new com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo(url, expectedMd5, family, weight, style);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo downloadableFontInfo = (com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo) other;
        return kotlin.jvm.internal.m.a(this.url, downloadableFontInfo.url) && kotlin.jvm.internal.m.a(this.expectedMd5, downloadableFontInfo.expectedMd5) && kotlin.jvm.internal.m.a(this.family, downloadableFontInfo.family) && this.weight == downloadableFontInfo.weight && this.style == downloadableFontInfo.style;
    }

    public final /* synthetic */ java.lang.String getExpectedMd5() {
        return this.expectedMd5;
    }

    public final /* synthetic */ java.lang.String getFamily() {
        return this.family;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FontStyle getStyle() {
        return this.style;
    }

    public final /* synthetic */ java.lang.String getUrl() {
        return this.url;
    }

    public final /* synthetic */ int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.style.hashCode() + p121o0.p.d(this.weight, B2.a.a(B2.a.a(this.url.hashCode() * 31, 31, this.expectedMd5), 31, this.family), 31);
    }

    public java.lang.String toString() {
        return "DownloadableFontInfo(url=" + this.url + ", expectedMd5=" + this.expectedMd5 + ", family=" + this.family + ", weight=" + this.weight + ", style=" + this.style + ')';
    }
}

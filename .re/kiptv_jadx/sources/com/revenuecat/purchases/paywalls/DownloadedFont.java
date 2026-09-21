package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/DownloadedFont;", "", "weight", "", "style", "Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "file", "Ljava/io/File;", "(ILcom/revenuecat/purchases/paywalls/components/properties/FontStyle;Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "getStyle", "()Lcom/revenuecat/purchases/paywalls/components/properties/FontStyle;", "getWeight", "()I", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadedFont {
    private final java.io.File file;
    private final com.revenuecat.purchases.paywalls.components.properties.FontStyle style;
    private final int weight;

    public DownloadedFont(int i3, com.revenuecat.purchases.paywalls.components.properties.FontStyle style, java.io.File file) {
        kotlin.jvm.internal.m.e(style, "style");
        kotlin.jvm.internal.m.e(file, "file");
        this.weight = i3;
        this.style = style;
        this.file = file;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.revenuecat.purchases.paywalls.DownloadedFont)) {
            return false;
        }
        com.revenuecat.purchases.paywalls.DownloadedFont downloadedFont = (com.revenuecat.purchases.paywalls.DownloadedFont) obj;
        return this.weight == downloadedFont.weight && this.style == downloadedFont.style && kotlin.jvm.internal.m.a(this.file, downloadedFont.file);
    }

    public final /* synthetic */ java.io.File getFile() {
        return this.file;
    }

    public final /* synthetic */ com.revenuecat.purchases.paywalls.components.properties.FontStyle getStyle() {
        return this.style;
    }

    public final /* synthetic */ int getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.file.hashCode() + ((this.style.hashCode() + (this.weight * 31)) * 31);
    }

    public java.lang.String toString() {
        return "DownloadedFont(weight=" + this.weight + ", style=" + this.style + ", file=" + this.file + ')';
    }
}

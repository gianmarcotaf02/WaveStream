package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroid/net/Uri;", "it", "Lcom/revenuecat/purchases/paywalls/components/PartialVideoComponent;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$5 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaywallComponentsImagePreDownloader$findImageUrisToDownload$2$5(com.revenuecat.purchases.utils.PaywallComponentsImagePreDownloader paywallComponentsImagePreDownloader) {
        super(1);
        this.this$0 = paywallComponentsImagePreDownloader;
    }

    @Override // p194x6.j
    public final java.util.Set<android.net.Uri> invoke(com.revenuecat.purchases.paywalls.components.PartialVideoComponent it) {
        kotlin.jvm.internal.m.e(it, "it");
        com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls fallbackSource = it.getFallbackSource();
        java.util.Set<android.net.Uri> setFindImageUrisToDownload = fallbackSource != null ? this.this$0.findImageUrisToDownload(fallbackSource) : null;
        return setFindImageUrisToDownload == null ? p078i6.y.f23207h : setFindImageUrisToDownload;
    }
}

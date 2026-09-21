package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;", "", "Lh6/k;", "Ljava/net/URL;", "Lcom/revenuecat/purchases/models/Checksum;", "checkedUrls", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeVideoUrls;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class OfferingVideoPredownloaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List<p070h6.k> checkedUrls(com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls themeVideoUrls) {
        java.net.URL urlLowRes;
        java.net.URL url;
        p070h6.k kVar = new p070h6.k(themeVideoUrls.getLight().getUrl(), themeVideoUrls.getLight().getChecksum());
        com.revenuecat.purchases.paywalls.components.properties.VideoUrls dark = themeVideoUrls.getDark();
        p070h6.k kVar2 = null;
        p070h6.k kVar3 = (dark == null || (url = dark.getUrl()) == null) ? null : new p070h6.k(url, themeVideoUrls.getDark().getChecksum());
        java.net.URL urlLowRes2 = themeVideoUrls.getLight().getUrlLowRes();
        p070h6.k kVar4 = urlLowRes2 != null ? new p070h6.k(urlLowRes2, themeVideoUrls.getLight().getChecksumLowRes()) : null;
        com.revenuecat.purchases.paywalls.components.properties.VideoUrls dark2 = themeVideoUrls.getDark();
        if (dark2 != null && (urlLowRes = dark2.getUrlLowRes()) != null) {
            kVar2 = new p070h6.k(urlLowRes, themeVideoUrls.getDark().getChecksumLowRes());
        }
        return p078i6.m.l0(new p070h6.k[]{kVar, kVar3, kVar4, kVar2});
    }
}

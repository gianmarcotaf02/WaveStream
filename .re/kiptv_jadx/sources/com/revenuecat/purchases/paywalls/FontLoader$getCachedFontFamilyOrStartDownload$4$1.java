package com.revenuecat.purchases.paywalls;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader$getCachedFontFamilyOrStartDownload$4$1 extends kotlin.jvm.internal.o implements p194x6.j {
    final /* synthetic */ kotlin.jvm.internal.A $cachedFontFamily;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontLoader$getCachedFontFamilyOrStartDownload$4$1(kotlin.jvm.internal.A a2) {
        super(1);
        this.$cachedFontFamily = a2;
    }

    @Override // p194x6.j
    public final java.lang.Boolean invoke(java.util.Map.Entry<com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo, java.lang.String> it) {
        kotlin.jvm.internal.m.e(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.m.a(it.getValue(), ((com.revenuecat.purchases.paywalls.DownloadedFontFamily) this.$cachedFontFamily.f24539h).getFamily()));
    }
}

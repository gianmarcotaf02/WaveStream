package com.revenuecat.purchases.paywalls;

import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.paywalls.fonts.DownloadableFontInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.o;
import p194x6.j;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "it", "", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "invoke", "(Ljava/util/Map$Entry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class FontLoader$getCachedFontFamilyOrStartDownload$4$1 extends o implements j {
    final A $cachedFontFamily;

    public FontLoader$getCachedFontFamilyOrStartDownload$4$1(A a2) {
        super(1);
        this.$cachedFontFamily = a2;
    }

    @Override
    public final Boolean invoke(Map.Entry<DownloadableFontInfo, String> it) {
        m.e(it, "it");
        return Boolean.valueOf(m.a(it.getValue(), ((DownloadedFontFamily) this.$cachedFontFamily.f24539h).getFamily()));
    }
}

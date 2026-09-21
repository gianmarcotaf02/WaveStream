package com.revenuecat.purchases.paywalls.fonts;

import O7.q;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.UiConfig;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.utils.Result;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toDownloadableFontInfo", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/paywalls/fonts/DownloadableFontInfo;", "", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadableFontInfoKt {
    public static final Result toDownloadableFontInfo(UiConfig.AppConfig.FontsConfig.FontInfo.Name name) {
        String str;
        m.e(name, "<this>");
        String url = name.getUrl();
        if (url == null || q.N0(url)) {
            str = "Font URL is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
        } else {
            String hash = name.getHash();
            if (hash == null || q.N0(hash)) {
                str = "Font hash is empty for " + name.getValue() + ". Cannot validate downloaded font. Please try to re-upload your font in the RevenueCat dashboard.";
            } else {
                String family = name.getFamily();
                if (family == null || q.N0(family)) {
                    str = "Font family is empty for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else if (name.getWeight() == null) {
                    str = "Font weight is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else if (name.getStyle() == null) {
                    str = "Font style is null for " + name.getValue() + ". Cannot download font. Please try to re-upload your font in the RevenueCat dashboard.";
                } else {
                    str = null;
                }
            }
        }
        if (str != null) {
            return new Result.Error(str);
        }
        String url2 = name.getUrl();
        m.b(url2);
        String hash2 = name.getHash();
        m.b(hash2);
        String family2 = name.getFamily();
        m.b(family2);
        Integer weight = name.getWeight();
        m.b(weight);
        int iIntValue = weight.intValue();
        FontStyle style = name.getStyle();
        m.b(style);
        return new Result.Success(new DownloadableFontInfo(url2, hash2, family2, iIntValue, style));
    }
}

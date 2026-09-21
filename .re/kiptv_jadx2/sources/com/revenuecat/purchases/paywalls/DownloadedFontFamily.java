package com.revenuecat.purchases.paywalls;

import androidx.media3.container.NalUnitUtil;
import com.google.android.gms.internal.play_billing.M0;
import io.sentry.protocol.Device;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2541f;
import kotlin.jvm.internal.m;
import p078i6.w;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;", "", Device.JsonKeys.FAMILY, "", "fonts", "", "Lcom/revenuecat/purchases/paywalls/DownloadedFont;", "(Ljava/lang/String;Ljava/util/List;)V", "getFamily", "()Ljava/lang/String;", "getFonts", "()Ljava/util/List;", "purchases_defaultsRelease"}, k = 1, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class DownloadedFontFamily {
    private final String family;
    private final List<DownloadedFont> fonts;

    public DownloadedFontFamily(String family, List<DownloadedFont> fonts) {
        m.e(family, "family");
        m.e(fonts, "fonts");
        this.family = family;
        this.fonts = fonts;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadedFontFamily)) {
            return false;
        }
        DownloadedFontFamily downloadedFontFamily = (DownloadedFontFamily) obj;
        return m.a(this.family, downloadedFontFamily.family) && m.a(this.fonts, downloadedFontFamily.fonts);
    }

    public final String getFamily() {
        return this.family;
    }

    public final List getFonts() {
        return this.fonts;
    }

    public int hashCode() {
        return this.fonts.hashCode() + (this.family.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DownloadedFontFamily(family=");
        sb.append(this.family);
        sb.append(", fonts=");
        return M0.n(sb, this.fonts, ')');
    }

    public DownloadedFontFamily(String str, List list, int i3, AbstractC2541f abstractC2541f) {
        this(str, (i3 & 2) != 0 ? w.f23205h : list);
    }
}

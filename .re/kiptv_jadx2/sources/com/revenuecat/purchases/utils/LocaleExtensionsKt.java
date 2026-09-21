package com.revenuecat.purchases.utils;

import O7.x;
import android.os.LocaleList;
import androidx.media3.container.NalUnitUtil;
import com.revenuecat.purchases.common.LogWrapperKt;
import io.sentry.protocol.Device;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p204z1.c;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", Device.JsonKeys.LOCALE, "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "Lz1/b;", "toList", "(Lz1/b;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LocaleExtensionsKt {
    public static final Locale convertToCorrectlyFormattedLocale(Locale locale) {
        m.e(locale, "<this>");
        String string = locale.toString();
        m.d(string, "toString()");
        return toLocale(string);
    }

    public static final List<Locale> getDefaultLocales() {
        p204z1.b bVar = p204z1.b.f32139b;
        return toList(new p204z1.b(new c(LocaleList.getDefault())));
    }

    private static final String inferScript(Locale locale) {
        String country;
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            String script2 = locale.getScript();
            m.d(script2, "script");
            return script2;
        }
        if (m.a(locale.getLanguage(), "zh") && (country = locale.getCountry()) != null) {
            int iHashCode = country.hashCode();
            if (iHashCode != 2155) {
                if (iHashCode != 2307) {
                    if (iHashCode != 2466) {
                        if (iHashCode != 2644) {
                            if (iHashCode == 2691 && country.equals("TW")) {
                                return "Hant";
                            }
                        } else if (country.equals("SG")) {
                            return "Hans";
                        }
                    } else if (country.equals("MO")) {
                        return "Hant";
                    }
                } else if (country.equals("HK")) {
                    return "Hant";
                }
            } else if (country.equals("CN")) {
                return "Hans";
            }
        }
        return "";
    }

    public static final boolean sharedLanguageCodeWith(Locale locale, Locale locale2) {
        m.e(locale, "<this>");
        m.e(locale2, "locale");
        try {
            return m.a(locale.getISO3Language(), locale2.getISO3Language()) && m.a(inferScript(locale), inferScript(locale2));
        } catch (MissingResourceException e6) {
            LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e6 + "). Falling back to language.", null);
            return m.a(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final List<Locale> toList(p204z1.b bVar) {
        int size = bVar.f32140a.f32141a.size();
        Locale[] localeArr = new Locale[size];
        for (int i3 = 0; i3 < size; i3++) {
            localeArr[i3] = bVar.f32140a.f32141a.get(i3);
        }
        return p078i6.m.l0(localeArr);
    }

    public static final Locale toLocale(String str) {
        m.e(str, "<this>");
        Locale localeForLanguageTag = Locale.forLanguageTag(x.w0(str, "_", "-"));
        m.d(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}

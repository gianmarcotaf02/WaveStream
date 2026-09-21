package com.revenuecat.purchases.utils;

/* JADX INFO: loaded from: classes4.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ljava/util/Locale;", "convertToCorrectlyFormattedLocale", "(Ljava/util/Locale;)Ljava/util/Locale;", "", "toLocale", "(Ljava/lang/String;)Ljava/util/Locale;", io.sentry.protocol.Device.JsonKeys.LOCALE, "", "sharedLanguageCodeWith", "(Ljava/util/Locale;Ljava/util/Locale;)Z", "", "getDefaultLocales", "()Ljava/util/List;", "inferScript", "(Ljava/util/Locale;)Ljava/lang/String;", "Lz1/b;", "toList", "(Lz1/b;)Ljava/util/List;", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = androidx.media3.container.NalUnitUtil.H265_NAL_UNIT_TYPE_UNSPECIFIED)
public final class LocaleExtensionsKt {
    public static final java.util.Locale convertToCorrectlyFormattedLocale(java.util.Locale locale) {
        kotlin.jvm.internal.m.e(locale, "<this>");
        java.lang.String string = locale.toString();
        kotlin.jvm.internal.m.d(string, "toString()");
        return toLocale(string);
    }

    public static final java.util.List<java.util.Locale> getDefaultLocales() {
        p204z1.b bVar = p204z1.b.f32139b;
        return toList(new p204z1.b(new p204z1.c(android.os.LocaleList.getDefault())));
    }

    private static final java.lang.String inferScript(java.util.Locale locale) {
        java.lang.String country;
        java.lang.String script = locale.getScript();
        if (script != null && script.length() != 0) {
            java.lang.String script2 = locale.getScript();
            kotlin.jvm.internal.m.d(script2, "script");
            return script2;
        }
        if (kotlin.jvm.internal.m.a(locale.getLanguage(), "zh") && (country = locale.getCountry()) != null) {
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

    public static final boolean sharedLanguageCodeWith(java.util.Locale locale, java.util.Locale locale2) {
        kotlin.jvm.internal.m.e(locale, "<this>");
        kotlin.jvm.internal.m.e(locale2, "locale");
        try {
            return kotlin.jvm.internal.m.a(locale.getISO3Language(), locale2.getISO3Language()) && kotlin.jvm.internal.m.a(inferScript(locale), inferScript(locale2));
        } catch (java.util.MissingResourceException e6) {
            com.revenuecat.purchases.common.LogWrapperKt.getCurrentLogHandler().e("[Purchases] - ERROR", "Locale " + locale + " or " + locale2 + " can't obtain ISO3 language code (" + e6 + "). Falling back to language.", null);
            return kotlin.jvm.internal.m.a(locale.getLanguage(), locale2.getLanguage());
        }
    }

    private static final java.util.List<java.util.Locale> toList(p204z1.b bVar) {
        int size = bVar.f32140a.f32141a.size();
        java.util.Locale[] localeArr = new java.util.Locale[size];
        for (int i3 = 0; i3 < size; i3++) {
            localeArr[i3] = bVar.f32140a.f32141a.get(i3);
        }
        return p078i6.m.l0(localeArr);
    }

    public static final java.util.Locale toLocale(java.lang.String str) {
        kotlin.jvm.internal.m.e(str, "<this>");
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(O7.x.w0(str, "_", "-"));
        kotlin.jvm.internal.m.d(localeForLanguageTag, "forLanguageTag(replace(\"_\", \"-\"))");
        return localeForLanguageTag;
    }
}

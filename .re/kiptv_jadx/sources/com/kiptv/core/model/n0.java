package com.kiptv.core.model;

/* JADX INFO: loaded from: classes.dex */
public abstract class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f20801a;

    static {
        p078i6.p.B0("af-ZA", "ar-EG", "ar-SA", "be-BY", "bg-BG", "bn-BD", "bn-IN", "ca-AD", "ca-ES", "cs-CZ", "da-DK", "de-DE", "el-GR", "en-AU", "en-CA", "en-GB", "en-US", "es-AR", "es-ES", "es-MX", "eu-ES", "fa-IR", "fi-FI", "fr-CA", "fr-FR", "gl-ES", "hi-IN", "hr-HR", "hu-HU", "id-ID", "it-IT", "ja-JP", "ka-GE", "kk-KZ", "kn-IN", "ko-KR", "ku-TR", "lt-LT", "lv-LV", "ml-IN", "nb-NO", "nl-BE", "nl-NL", "no-NO", "pl-PL", "pt-BR", "pt-PT", "ro-RO", "ru-RU", "sk-SK", "sl-SI", "so-SO", "sq-AL", "sr-RS", "sv-SE", "ta-IN", "te-IN", "th-TH", "tr-TR", "uk-UA", "uz-UZ", "vi-VN", "zh-CN", "zh-HK", "zh-SG", "zh-TW");
        p078i6.m.F0(new java.lang.String[]{"ar", "bn", "ca", "en", "es", "fr", "nl", "pt", "zh"});
        f20801a = p078i6.C.N0(new p070h6.k("ar", "ar-SA"), new p070h6.k("bn", "bn-BD"), new p070h6.k("da", "da-DK"), new p070h6.k("de", "de-DE"), new p070h6.k("el", "el-GR"), new p070h6.k("en-GB", "en-GB"), new p070h6.k("en-US", "en-US"), new p070h6.k("es-419", "es-MX"), new p070h6.k("es-ES", "es-ES"), new p070h6.k("fi", "fi-FI"), new p070h6.k("fr", "fr-FR"), new p070h6.k("hi", "hi-IN"), new p070h6.k("it", "it-IT"), new p070h6.k("ja", "ja-JP"), new p070h6.k("ko", "ko-KR"), new p070h6.k("nb", "nb-NO"), new p070h6.k("nl", "nl-NL"), new p070h6.k("pl", "pl-PL"), new p070h6.k("pt-BR", "pt-BR"), new p070h6.k("pt-PT", "pt-PT"), new p070h6.k("ru", "ru-RU"), new p070h6.k("sq", "sq-AL"), new p070h6.k("sv", "sv-SE"), new p070h6.k("tr", "tr-TR"), new p070h6.k("ur", "ur-PK"), new p070h6.k("zh-Hans", "zh-CN"), new p070h6.k("zh-Hant", "zh-TW"));
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    public static java.lang.String a(java.lang.String storedValue, java.lang.String appLanguage) {
        kotlin.jvm.internal.m.e(storedValue, "storedValue");
        kotlin.jvm.internal.m.e(appLanguage, "appLanguage");
        if (storedValue.equals(androidx.media3.extractor.text.ttml.TtmlNode.TEXT_EMPHASIS_AUTO)) {
            return a(appLanguage, appLanguage);
        }
        if (O7.q.B0(storedValue, "-", false)) {
            return storedValue;
        }
        java.lang.String str = (java.lang.String) f20801a.get(storedValue);
        if (str != null) {
            return str;
        }
        if (storedValue.length() != 2) {
            return "en-US";
        }
        java.lang.String upperCase = storedValue.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(upperCase, "toUpperCase(...)");
        return storedValue + "-" + upperCase;
    }
}

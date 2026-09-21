package p072i;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static void a(android.content.res.Configuration configuration, android.content.res.Configuration configuration2, android.content.res.Configuration configuration3) {
        android.os.LocaleList locales = configuration.getLocales();
        android.os.LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static p204z1.b b(android.content.res.Configuration configuration) {
        java.lang.String languageTags = configuration.getLocales().toLanguageTags();
        if (languageTags != null) {
            p204z1.b bVar = p204z1.b.f32139b;
            if (!languageTags.isEmpty()) {
                java.lang.String[] strArrSplit = languageTags.split(",", -1);
                int length = strArrSplit.length;
                java.util.Locale[] localeArr = new java.util.Locale[length];
                for (int i3 = 0; i3 < length; i3++) {
                    java.lang.String str = strArrSplit[i3];
                    int i9 = p204z1.a.f32138a;
                    localeArr[i3] = java.util.Locale.forLanguageTag(str);
                }
                return new p204z1.b(new p204z1.c(new android.os.LocaleList(localeArr)));
            }
        }
        return p204z1.b.f32139b;
    }

    public static void c(p204z1.b bVar) {
        android.os.LocaleList.setDefault(android.os.LocaleList.forLanguageTags(bVar.f32140a.f32141a.toLanguageTags()));
    }

    public static void d(android.content.res.Configuration configuration, p204z1.b bVar) {
        configuration.setLocales(android.os.LocaleList.forLanguageTags(bVar.f32140a.f32141a.toLanguageTags()));
    }
}

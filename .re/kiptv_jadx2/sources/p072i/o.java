package p072i;

import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.Locale;
import p204z1.a;
import p204z1.b;
import p204z1.c;

public abstract class o {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static b b(Configuration configuration) {
        String languageTags = configuration.getLocales().toLanguageTags();
        if (languageTags != null) {
            b bVar = b.f32139b;
            if (!languageTags.isEmpty()) {
                String[] strArrSplit = languageTags.split(",", -1);
                int length = strArrSplit.length;
                Locale[] localeArr = new Locale[length];
                for (int i3 = 0; i3 < length; i3++) {
                    String str = strArrSplit[i3];
                    int i9 = a.f32138a;
                    localeArr[i3] = Locale.forLanguageTag(str);
                }
                return new b(new c(new LocaleList(localeArr)));
            }
        }
        return b.f32139b;
    }

    public static void c(b bVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(bVar.f32140a.f32141a.toLanguageTags()));
    }

    public static void d(Configuration configuration, b bVar) {
        configuration.setLocales(LocaleList.forLanguageTags(bVar.f32140a.f32141a.toLanguageTags()));
    }
}

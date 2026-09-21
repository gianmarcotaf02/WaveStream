package p015b5;

import O7.q;
import com.kiptv.core.service.a;
import java.util.Locale;
import kotlin.jvm.internal.m;

public final class x {
    public static String a(String language) {
        m.e(language, "language");
        String lowerCase = q.p1(2, language).toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return a.f20984f.contains(lowerCase) ? lowerCase : "en";
    }
}

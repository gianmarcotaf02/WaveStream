package Y4;

import java.util.Locale;
import java.util.Map;

public final class Y0 {

    public final int f11782a;

    public final String f11783b;

    public final Map f11784c;

    public Y0(String body, int i3, Map headers) {
        kotlin.jvm.internal.m.e(body, "body");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.f11782a = i3;
        this.f11783b = body;
        this.f11784c = headers;
    }

    public final String a(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return (String) this.f11784c.get(lowerCase);
    }
}

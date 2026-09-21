package O7;

import java.util.List;
import java.util.regex.Matcher;

public final class m implements j {

    public final Matcher f8055a;

    public final CharSequence f8056b;

    public final l f8057c;

    public k f8058d;

    public m(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f8055a = matcher;
        this.f8056b = input;
        this.f8057c = new l(0, this);
    }

    public final List a() {
        if (this.f8058d == null) {
            this.f8058d = new k(this);
        }
        k kVar = this.f8058d;
        kotlin.jvm.internal.m.b(kVar);
        return kVar;
    }

    public final D6.g b() {
        Matcher matcher = this.f8055a;
        return r.W(matcher.start(), matcher.end());
    }

    public final m c() {
        Matcher matcher = this.f8055a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f8056b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.m.d(matcher2, "matcher(...)");
        return p199y3.e.g(matcher2, iEnd, charSequence);
    }
}

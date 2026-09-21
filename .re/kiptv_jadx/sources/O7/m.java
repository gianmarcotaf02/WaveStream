package O7;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements O7.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.regex.Matcher f8055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.CharSequence f8056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O7.l f8057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O7.k f8058d;

    public m(java.util.regex.Matcher matcher, java.lang.CharSequence input) {
        kotlin.jvm.internal.m.e(input, "input");
        this.f8055a = matcher;
        this.f8056b = input;
        this.f8057c = new O7.l(0, this);
    }

    public final java.util.List a() {
        if (this.f8058d == null) {
            this.f8058d = new O7.k(this);
        }
        O7.k kVar = this.f8058d;
        kotlin.jvm.internal.m.b(kVar);
        return kVar;
    }

    public final D6.g b() {
        java.util.regex.Matcher matcher = this.f8055a;
        return O7.r.W(matcher.start(), matcher.end());
    }

    public final O7.m c() {
        java.util.regex.Matcher matcher = this.f8055a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        java.lang.CharSequence charSequence = this.f8056b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        java.util.regex.Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.m.d(matcher2, "matcher(...)");
        return p199y3.e.g(matcher2, iEnd, charSequence);
    }
}

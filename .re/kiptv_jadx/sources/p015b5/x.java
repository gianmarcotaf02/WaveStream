package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static java.lang.String a(java.lang.String language) {
        kotlin.jvm.internal.m.e(language, "language");
        java.lang.String lowerCase = O7.q.p1(2, language).toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return com.kiptv.core.service.a.f20984f.contains(lowerCase) ? lowerCase : "en";
    }
}

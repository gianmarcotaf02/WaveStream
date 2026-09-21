package Y4;

/* JADX INFO: loaded from: classes.dex */
public final class Y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f11783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.Map f11784c;

    public Y0(java.lang.String body, int i3, java.util.Map headers) {
        kotlin.jvm.internal.m.e(body, "body");
        kotlin.jvm.internal.m.e(headers, "headers");
        this.f11782a = i3;
        this.f11783b = body;
        this.f11784c = headers;
    }

    public final java.lang.String a(java.lang.String str) {
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.m.d(lowerCase, "toLowerCase(...)");
        return (java.lang.String) this.f11784c.get(lowerCase);
    }
}

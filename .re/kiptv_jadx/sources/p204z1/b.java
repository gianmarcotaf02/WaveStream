package p204z1;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p204z1.b f32139b = new p204z1.b(new p204z1.c(new android.os.LocaleList(new java.util.Locale[0])));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p204z1.c f32140a;

    public b(p204z1.c cVar) {
        this.f32140a = cVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p204z1.b) {
            return this.f32140a.equals(((p204z1.b) obj).f32140a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32140a.f32141a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f32140a.f32141a.toString();
    }
}

package p200y4;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p200y4.a f31883b = new p200y4.a(java.util.Collections.unmodifiableMap(new java.util.HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Map f31884a;

    public a(java.util.Map map) {
        this.f31884a = map;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof p200y4.a) {
            return this.f31884a.equals(((p200y4.a) obj).f31884a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31884a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f31884a.toString();
    }
}

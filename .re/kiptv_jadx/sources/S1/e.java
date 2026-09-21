package S1;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9205a;

    public e(java.lang.String name) {
        kotlin.jvm.internal.m.e(name, "name");
        this.f9205a = name;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof S1.e)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.f9205a, ((S1.e) obj).f9205a);
    }

    public final int hashCode() {
        return this.f9205a.hashCode();
    }

    public final java.lang.String toString() {
        return this.f9205a;
    }
}

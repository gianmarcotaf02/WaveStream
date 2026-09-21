package p099l5;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p099l5.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p099l5.v f24782a;

    public g(p099l5.v vVar) {
        this.f24782a = vVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p099l5.g) && kotlin.jvm.internal.m.a(this.f24782a, ((p099l5.g) obj).f24782a);
    }

    public final int hashCode() {
        return this.f24782a.hashCode();
    }

    public final java.lang.String toString() {
        return "Error(error=" + this.f24782a + ")";
    }
}

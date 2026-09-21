package J;

/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J.V f5713b = new J.V(63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p194x6.j f5714a;

    public V(int i3, p194x6.j jVar) {
        this.f5714a = (i3 & 1) != 0 ? null : jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J.V) {
            return this.f5714a == ((J.V) obj).f5714a;
        }
        return false;
    }

    public final int hashCode() {
        p194x6.j jVar = this.f5714a;
        return (jVar != null ? jVar.hashCode() : 0) * 28629151;
    }
}

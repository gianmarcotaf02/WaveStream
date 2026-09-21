package F3;

/* JADX INFO: renamed from: F3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0368h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B3.j f3598a;

    public C0368h(B3.j jVar) {
        this.f3598a = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F3.C0368h) {
            return this.f3598a == ((F3.C0368h) obj).f3598a;
        }
        return false;
    }

    public final int hashCode() {
        return (java.lang.System.identityHashCode(this.f3598a) * 31) + 1520230490;
    }
}

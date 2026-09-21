package U;

/* JADX INFO: renamed from: U.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0950x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p104m1.j f10092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10094c;

    public C0950x(p104m1.j jVar, int i3, long j) {
        this.f10092a = jVar;
        this.f10093b = i3;
        this.f10094c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U.C0950x)) {
            return false;
        }
        U.C0950x c0950x = (U.C0950x) obj;
        return this.f10092a == c0950x.f10092a && this.f10093b == c0950x.f10093b && this.f10094c == c0950x.f10094c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f10094c) + p121o0.p.d(this.f10093b, this.f10092a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "AnchorInfo(direction=" + this.f10092a + ", offset=" + this.f10093b + ", selectableId=" + this.f10094c + ')';
    }
}

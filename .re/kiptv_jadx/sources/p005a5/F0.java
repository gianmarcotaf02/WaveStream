package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Long f13385c;

    public F0(int i3, int i9, java.lang.Long l2) {
        this.f13383a = i3;
        this.f13384b = i9;
        this.f13385c = l2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p005a5.F0)) {
            return false;
        }
        p005a5.F0 f9 = (p005a5.F0) obj;
        return this.f13383a == f9.f13383a && this.f13384b == f9.f13384b && kotlin.jvm.internal.m.a(this.f13385c, f9.f13385c);
    }

    public final int hashCode() {
        int iD = p121o0.p.d(this.f13384b, java.lang.Integer.hashCode(this.f13383a) * 31, 31);
        java.lang.Long l2 = this.f13385c;
        return iD + (l2 == null ? 0 : l2.hashCode());
    }

    public final java.lang.String toString() {
        return "Ep(season=" + this.f13383a + ", episode=" + this.f13384b + ", addedMs=" + this.f13385c + ")";
    }
}

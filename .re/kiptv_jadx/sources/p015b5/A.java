package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17920c;

    public A(int i3, int i9, int i10) {
        this.f17918a = i3;
        this.f17919b = i9;
        this.f17920c = i10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p015b5.A)) {
            return false;
        }
        p015b5.A a2 = (p015b5.A) obj;
        return this.f17918a == a2.f17918a && this.f17919b == a2.f17919b && this.f17920c == a2.f17920c;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f17920c) + p121o0.p.d(this.f17919b, java.lang.Integer.hashCode(this.f17918a) * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MigrationResult(migratedCount=");
        sb.append(this.f17918a);
        sb.append(", conflictsResolved=");
        sb.append(this.f17919b);
        sb.append(", skippedCount=");
        return Y6.f.k(sb, this.f17920c, ")");
    }
}

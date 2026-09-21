package p011b1;

/* JADX INFO: renamed from: b1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1646c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f17797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f17800d;

    public C1646c(java.lang.Object obj, int i3, int i9, java.lang.String str) {
        this.f17797a = obj;
        this.f17798b = i3;
        this.f17799c = i9;
        this.f17800d = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.C1646c)) {
            return false;
        }
        p011b1.C1646c c1646c = (p011b1.C1646c) obj;
        return kotlin.jvm.internal.m.a(this.f17797a, c1646c.f17797a) && this.f17798b == c1646c.f17798b && this.f17799c == c1646c.f17799c && kotlin.jvm.internal.m.a(this.f17800d, c1646c.f17800d);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f17797a;
        return this.f17800d.hashCode() + p121o0.p.d(this.f17799c, p121o0.p.d(this.f17798b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableRange(item=");
        sb.append(this.f17797a);
        sb.append(", start=");
        sb.append(this.f17798b);
        sb.append(", end=");
        sb.append(this.f17799c);
        sb.append(", tag=");
        return Y6.f.l(sb, this.f17800d, ')');
    }
}

package p011b1;

/* JADX INFO: renamed from: b1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1648e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f17803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f17806d;

    public C1648e(java.lang.Object obj, int i3, int i9, java.lang.String str) {
        this.f17803a = obj;
        this.f17804b = i3;
        this.f17805c = i9;
        this.f17806d = str;
        if (i3 <= i9) {
            return;
        }
        p065h1.a.a("Reversed range is not supported");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.C1648e)) {
            return false;
        }
        p011b1.C1648e c1648e = (p011b1.C1648e) obj;
        return kotlin.jvm.internal.m.a(this.f17803a, c1648e.f17803a) && this.f17804b == c1648e.f17804b && this.f17805c == c1648e.f17805c && kotlin.jvm.internal.m.a(this.f17806d, c1648e.f17806d);
    }

    public final int hashCode() {
        java.lang.Object obj = this.f17803a;
        return this.f17806d.hashCode() + p121o0.p.d(this.f17805c, p121o0.p.d(this.f17804b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Range(item=");
        sb.append(this.f17803a);
        sb.append(", start=");
        sb.append(this.f17804b);
        sb.append(", end=");
        sb.append(this.f17805c);
        sb.append(", tag=");
        return Y6.f.l(sb, this.f17806d, ')');
    }

    public C1648e(java.lang.Object obj, int i3, int i9) {
        this(obj, i3, i9, "");
    }
}

package p011b1;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1.c f17843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17845c;

    public r(j1.c cVar, int i3, int i9) {
        this.f17843a = cVar;
        this.f17844b = i3;
        this.f17845c = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.r)) {
            return false;
        }
        p011b1.r rVar = (p011b1.r) obj;
        return this.f17843a.equals(rVar.f17843a) && this.f17844b == rVar.f17844b && this.f17845c == rVar.f17845c;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f17845c) + p121o0.p.d(this.f17844b, this.f17843a.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f17843a);
        sb.append(", startIndex=");
        sb.append(this.f17844b);
        sb.append(", endIndex=");
        return Y6.f.j(sb, this.f17845c, ')');
    }
}

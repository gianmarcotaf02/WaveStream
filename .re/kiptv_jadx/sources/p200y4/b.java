package p200y4;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4.f f31885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f31887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f31888d;

    public b(o4.f fVar, int i3, java.lang.String str, java.lang.String str2) {
        this.f31885a = fVar;
        this.f31886b = i3;
        this.f31887c = str;
        this.f31888d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p200y4.b)) {
            return false;
        }
        p200y4.b bVar = (p200y4.b) obj;
        return this.f31885a == bVar.f31885a && this.f31886b == bVar.f31886b && this.f31887c.equals(bVar.f31887c) && this.f31888d.equals(bVar.f31888d);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f31885a, java.lang.Integer.valueOf(this.f31886b), this.f31887c, this.f31888d);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(status=");
        sb.append(this.f31885a);
        sb.append(", keyId=");
        sb.append(this.f31886b);
        sb.append(", keyType='");
        sb.append(this.f31887c);
        sb.append("', keyPrefix='");
        return Y6.f.m(sb, this.f31888d, "')");
    }
}

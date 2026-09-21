package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class n extends p131p4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p131p4.j f26225e;

    public n(int i3, int i9, int i10, p131p4.j jVar) {
        this.f26222b = i3;
        this.f26223c = i9;
        this.f26224d = i10;
        this.f26225e = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p131p4.n)) {
            return false;
        }
        p131p4.n nVar = (p131p4.n) obj;
        return nVar.f26222b == this.f26222b && nVar.f26223c == this.f26223c && nVar.f26224d == this.f26224d && nVar.f26225e == this.f26225e;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f26222b), java.lang.Integer.valueOf(this.f26223c), java.lang.Integer.valueOf(this.f26224d), this.f26225e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcm Parameters (variant: ");
        sb.append(this.f26225e);
        sb.append(", ");
        sb.append(this.f26223c);
        sb.append("-byte IV, ");
        sb.append(this.f26224d);
        sb.append("-byte tag, and ");
        return Y6.f.k(sb, this.f26222b, "-byte key)");
    }
}

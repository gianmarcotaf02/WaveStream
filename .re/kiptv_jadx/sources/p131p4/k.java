package p131p4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p131p4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p131p4.j f26217e;

    public k(int i3, int i9, int i10, p131p4.j jVar) {
        this.f26214b = i3;
        this.f26215c = i9;
        this.f26216d = i10;
        this.f26217e = jVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p131p4.k)) {
            return false;
        }
        p131p4.k kVar = (p131p4.k) obj;
        return kVar.f26214b == this.f26214b && kVar.f26215c == this.f26215c && kVar.f26216d == this.f26216d && kVar.f26217e == this.f26217e;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f26214b), java.lang.Integer.valueOf(this.f26215c), java.lang.Integer.valueOf(this.f26216d), this.f26217e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.f26217e);
        sb.append(", ");
        sb.append(this.f26215c);
        sb.append("-byte IV, ");
        sb.append(this.f26216d);
        sb.append("-byte tag, and ");
        return Y6.f.k(sb, this.f26214b, "-byte key)");
    }
}

package p185w4;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p131p4.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p185w4.d f29983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p185w4.d f29984e;

    public k(int i3, int i9, p185w4.d dVar, p185w4.d dVar2) {
        this.f29981b = i3;
        this.f29982c = i9;
        this.f29983d = dVar;
        this.f29984e = dVar2;
    }

    public final int b() {
        p185w4.d dVar = p185w4.d.f29968o;
        int i3 = this.f29982c;
        p185w4.d dVar2 = this.f29983d;
        if (dVar2 == dVar) {
            return i3;
        }
        if (dVar2 == p185w4.d.f29965l) {
            return i3 + 5;
        }
        if (dVar2 == p185w4.d.f29966m) {
            return i3 + 5;
        }
        if (dVar2 == p185w4.d.f29967n) {
            return i3 + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p185w4.k)) {
            return false;
        }
        p185w4.k kVar = (p185w4.k) obj;
        return kVar.f29981b == this.f29981b && kVar.b() == b() && kVar.f29983d == this.f29983d && kVar.f29984e == this.f29984e;
    }

    public final int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf(this.f29981b), java.lang.Integer.valueOf(this.f29982c), this.f29983d, this.f29984e);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.f29983d);
        sb.append(", hashType: ");
        sb.append(this.f29984e);
        sb.append(", ");
        sb.append(this.f29982c);
        sb.append("-byte tags, and ");
        return Y6.f.k(sb, this.f29981b, "-byte key)");
    }
}

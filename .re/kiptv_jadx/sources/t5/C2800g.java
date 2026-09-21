package t5;

/* JADX INFO: renamed from: t5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2800g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t5.EnumC2803h f28182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f28183c;

    public C2800g(int i3, t5.EnumC2803h enumC2803h, int i9) {
        this.f28181a = i3;
        this.f28182b = enumC2803h;
        this.f28183c = i9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5.C2800g)) {
            return false;
        }
        t5.C2800g c2800g = (t5.C2800g) obj;
        return this.f28181a == c2800g.f28181a && this.f28182b == c2800g.f28182b && this.f28183c == c2800g.f28183c;
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(this.f28183c) + ((this.f28182b.hashCode() + (java.lang.Integer.hashCode(this.f28181a) * 31)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RowConfig(startIndex=");
        sb.append(this.f28181a);
        sb.append(", direction=");
        sb.append(this.f28182b);
        sb.append(", durationMs=");
        return Y6.f.k(sb, this.f28183c, ")");
    }
}

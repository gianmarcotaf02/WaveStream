package D0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1919d;

    public n(float f9, float f10) {
        super(3);
        this.f1918c = f9;
        this.f1919d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.n)) {
            return false;
        }
        D0.n nVar = (D0.n) obj;
        return java.lang.Float.compare(this.f1918c, nVar.f1918c) == 0 && java.lang.Float.compare(this.f1919d, nVar.f1919d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1919d) + (java.lang.Float.hashCode(this.f1918c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LineTo(x=");
        sb.append(this.f1918c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1919d, ')');
    }
}

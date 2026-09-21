package D0;

/* JADX INFO: loaded from: classes.dex */
public final class v extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1945d;

    public v(float f9, float f10) {
        super(3);
        this.f1944c = f9;
        this.f1945d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.v)) {
            return false;
        }
        D0.v vVar = (D0.v) obj;
        return java.lang.Float.compare(this.f1944c, vVar.f1944c) == 0 && java.lang.Float.compare(this.f1945d, vVar.f1945d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1945d) + (java.lang.Float.hashCode(this.f1944c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeLineTo(dx=");
        sb.append(this.f1944c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1945d, ')');
    }
}

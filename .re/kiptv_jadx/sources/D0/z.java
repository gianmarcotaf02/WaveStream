package D0;

/* JADX INFO: loaded from: classes.dex */
public final class z extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1956c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1957d;

    public z(float f9, float f10) {
        super(1);
        this.f1956c = f9;
        this.f1957d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.z)) {
            return false;
        }
        D0.z zVar = (D0.z) obj;
        return java.lang.Float.compare(this.f1956c, zVar.f1956c) == 0 && java.lang.Float.compare(this.f1957d, zVar.f1957d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1957d) + (java.lang.Float.hashCode(this.f1956c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.f1956c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1957d, ')');
    }
}

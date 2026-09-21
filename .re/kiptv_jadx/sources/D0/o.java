package D0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1921d;

    public o(float f9, float f10) {
        super(3);
        this.f1920c = f9;
        this.f1921d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.o)) {
            return false;
        }
        D0.o oVar = (D0.o) obj;
        return java.lang.Float.compare(this.f1920c, oVar.f1920c) == 0 && java.lang.Float.compare(this.f1921d, oVar.f1921d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1921d) + (java.lang.Float.hashCode(this.f1920c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MoveTo(x=");
        sb.append(this.f1920c);
        sb.append(", y=");
        return p121o0.p.q(sb, this.f1921d, ')');
    }
}

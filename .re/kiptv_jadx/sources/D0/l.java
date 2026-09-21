package D0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1915f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1916h;

    public l(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f1912c = f9;
        this.f1913d = f10;
        this.f1914e = f11;
        this.f1915f = f12;
        this.g = f13;
        this.f1916h = f14;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.l)) {
            return false;
        }
        D0.l lVar = (D0.l) obj;
        return java.lang.Float.compare(this.f1912c, lVar.f1912c) == 0 && java.lang.Float.compare(this.f1913d, lVar.f1913d) == 0 && java.lang.Float.compare(this.f1914e, lVar.f1914e) == 0 && java.lang.Float.compare(this.f1915f, lVar.f1915f) == 0 && java.lang.Float.compare(this.g, lVar.g) == 0 && java.lang.Float.compare(this.f1916h, lVar.f1916h) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1916h) + p121o0.p.c(this.g, p121o0.p.c(this.f1915f, p121o0.p.c(this.f1914e, p121o0.p.c(this.f1913d, java.lang.Float.hashCode(this.f1912c) * 31, 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CurveTo(x1=");
        sb.append(this.f1912c);
        sb.append(", y1=");
        sb.append(this.f1913d);
        sb.append(", x2=");
        sb.append(this.f1914e);
        sb.append(", y2=");
        sb.append(this.f1915f);
        sb.append(", x3=");
        sb.append(this.g);
        sb.append(", y3=");
        return p121o0.p.q(sb, this.f1916h, ')');
    }
}

package D0;

/* JADX INFO: loaded from: classes.dex */
public final class t extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f1940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f1941f;
    public final float g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f1942h;

    public t(float f9, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.f1938c = f9;
        this.f1939d = f10;
        this.f1940e = f11;
        this.f1941f = f12;
        this.g = f13;
        this.f1942h = f14;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.t)) {
            return false;
        }
        D0.t tVar = (D0.t) obj;
        return java.lang.Float.compare(this.f1938c, tVar.f1938c) == 0 && java.lang.Float.compare(this.f1939d, tVar.f1939d) == 0 && java.lang.Float.compare(this.f1940e, tVar.f1940e) == 0 && java.lang.Float.compare(this.f1941f, tVar.f1941f) == 0 && java.lang.Float.compare(this.g, tVar.g) == 0 && java.lang.Float.compare(this.f1942h, tVar.f1942h) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1942h) + p121o0.p.c(this.g, p121o0.p.c(this.f1941f, p121o0.p.c(this.f1940e, p121o0.p.c(this.f1939d, java.lang.Float.hashCode(this.f1938c) * 31, 31), 31), 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeCurveTo(dx1=");
        sb.append(this.f1938c);
        sb.append(", dy1=");
        sb.append(this.f1939d);
        sb.append(", dx2=");
        sb.append(this.f1940e);
        sb.append(", dy2=");
        sb.append(this.f1941f);
        sb.append(", dx3=");
        sb.append(this.g);
        sb.append(", dy3=");
        return p121o0.p.q(sb, this.f1942h, ')');
    }
}

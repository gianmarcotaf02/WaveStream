package D0;

/* JADX INFO: loaded from: classes.dex */
public final class w extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1947d;

    public w(float f9, float f10) {
        super(3);
        this.f1946c = f9;
        this.f1947d = f10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D0.w)) {
            return false;
        }
        D0.w wVar = (D0.w) obj;
        return java.lang.Float.compare(this.f1946c, wVar.f1946c) == 0 && java.lang.Float.compare(this.f1947d, wVar.f1947d) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1947d) + (java.lang.Float.hashCode(this.f1946c) * 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.f1946c);
        sb.append(", dy=");
        return p121o0.p.q(sb, this.f1947d, ')');
    }
}

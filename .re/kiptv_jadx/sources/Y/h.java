package Y;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10980d;

    public h(float f9, float f10, float f11, float f12) {
        this.f10977a = f9;
        this.f10978b = f10;
        this.f10979c = f11;
        this.f10980d = f12;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Y.h)) {
            return false;
        }
        Y.h hVar = (Y.h) obj;
        return this.f10977a == hVar.f10977a && this.f10978b == hVar.f10978b && this.f10979c == hVar.f10979c && this.f10980d == hVar.f10980d;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f10980d) + p121o0.p.c(this.f10979c, p121o0.p.c(this.f10978b, java.lang.Float.hashCode(this.f10977a) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.f10977a);
        sb.append(", focusedAlpha=");
        sb.append(this.f10978b);
        sb.append(", hoveredAlpha=");
        sb.append(this.f10979c);
        sb.append(", pressedAlpha=");
        return p121o0.p.q(sb, this.f10980d, ')');
    }
}

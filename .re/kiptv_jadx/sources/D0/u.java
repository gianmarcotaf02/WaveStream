package D0;

/* JADX INFO: loaded from: classes.dex */
public final class u extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1943c;

    public u(float f9) {
        super(3);
        this.f1943c = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0.u) && java.lang.Float.compare(this.f1943c, ((D0.u) obj).f1943c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1943c);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("RelativeHorizontalTo(dx="), this.f1943c, ')');
    }
}

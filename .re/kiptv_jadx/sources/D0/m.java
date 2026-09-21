package D0;

/* JADX INFO: loaded from: classes.dex */
public final class m extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1917c;

    public m(float f9) {
        super(3);
        this.f1917c = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0.m) && java.lang.Float.compare(this.f1917c, ((D0.m) obj).f1917c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1917c);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("HorizontalTo(x="), this.f1917c, ')');
    }
}

package D0;

/* JADX INFO: loaded from: classes.dex */
public final class A extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1792c;

    public A(float f9) {
        super(3);
        this.f1792c = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0.A) && java.lang.Float.compare(this.f1792c, ((D0.A) obj).f1792c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1792c);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("RelativeVerticalTo(dy="), this.f1792c, ')');
    }
}

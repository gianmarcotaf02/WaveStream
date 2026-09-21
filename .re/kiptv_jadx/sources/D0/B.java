package D0;

/* JADX INFO: loaded from: classes.dex */
public final class B extends D0.C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1793c;

    public B(float f9) {
        super(3);
        this.f1793c = f9;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D0.B) && java.lang.Float.compare(this.f1793c, ((D0.B) obj).f1793c) == 0;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f1793c);
    }

    public final java.lang.String toString() {
        return p121o0.p.q(new java.lang.StringBuilder("VerticalTo(y="), this.f1793c, ')');
    }
}

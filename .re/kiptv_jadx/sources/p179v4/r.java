package p179v4;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f29187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Class f29188b;

    public r(java.lang.Class cls, java.lang.Class cls2) {
        this.f29187a = cls;
        this.f29188b = cls2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof p179v4.r)) {
            return false;
        }
        p179v4.r rVar = (p179v4.r) obj;
        return rVar.f29187a.equals(this.f29187a) && rVar.f29188b.equals(this.f29188b);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.f29187a, this.f29188b);
    }

    public final java.lang.String toString() {
        return this.f29187a.getSimpleName() + " with serialization type: " + this.f29188b.getSimpleName();
    }
}

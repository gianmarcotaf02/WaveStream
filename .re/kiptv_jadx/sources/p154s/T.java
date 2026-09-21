package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f27099c;

    public T(float f9, float f10, long j) {
        this.f27097a = f9;
        this.f27098b = f10;
        this.f27099c = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p154s.T)) {
            return false;
        }
        p154s.T t9 = (p154s.T) obj;
        return java.lang.Float.compare(this.f27097a, t9.f27097a) == 0 && java.lang.Float.compare(this.f27098b, t9.f27098b) == 0 && this.f27099c == t9.f27099c;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f27099c) + p121o0.p.c(this.f27098b, java.lang.Float.hashCode(this.f27097a) * 31, 31);
    }

    public final java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.f27097a + ", distance=" + this.f27098b + ", duration=" + this.f27099c + ')';
    }
}

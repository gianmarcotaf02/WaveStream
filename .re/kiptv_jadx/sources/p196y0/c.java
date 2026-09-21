package p196y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f31729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31731c;

    public c(java.lang.String str, long j, int i3) {
        this.f31729a = str;
        this.f31730b = j;
        this.f31731c = i3;
        if (str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i3 < -1 || i3 > 63) {
            throw new java.lang.IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i3);

    public abstract float b(int i3);

    public boolean c() {
        return false;
    }

    public abstract long d(float f9, float f10, float f11);

    public abstract float e(float f9, float f10, float f11);

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p196y0.c cVar = (p196y0.c) obj;
        if (this.f31731c == cVar.f31731c && kotlin.jvm.internal.m.a(this.f31729a, cVar.f31729a)) {
            return p196y0.b.a(this.f31730b, cVar.f31730b);
        }
        return false;
    }

    public abstract long f(float f9, float f10, float f11, float f12, p196y0.c cVar);

    public int hashCode() {
        int iHashCode = this.f31729a.hashCode() * 31;
        int i3 = p196y0.b.f31728e;
        return p121o0.p.e(iHashCode, 31, this.f31730b) + this.f31731c;
    }

    public final java.lang.String toString() {
        return this.f31729a + " (id=" + this.f31731c + ", model=" + ((java.lang.Object) p196y0.b.b(this.f31730b)) + ')';
    }
}

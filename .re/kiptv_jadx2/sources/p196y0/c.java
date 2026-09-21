package p196y0;

import kotlin.jvm.internal.m;
import p121o0.p;

public abstract class c {

    public final String f31729a;

    public final long f31730b;

    public final int f31731c;

    public c(String str, long j, int i3) {
        this.f31729a = str;
        this.f31730b = j;
        this.f31731c = i3;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i3 < -1 || i3 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public abstract float a(int i3);

    public abstract float b(int i3);

    public boolean c() {
        return false;
    }

    public abstract long d(float f9, float f10, float f11);

    public abstract float e(float f9, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f31731c == cVar.f31731c && m.a(this.f31729a, cVar.f31729a)) {
            return b.a(this.f31730b, cVar.f31730b);
        }
        return false;
    }

    public abstract long f(float f9, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int iHashCode = this.f31729a.hashCode() * 31;
        int i3 = b.f31728e;
        return p.e(iHashCode, 31, this.f31730b) + this.f31731c;
    }

    public final String toString() {
        return this.f31729a + " (id=" + this.f31731c + ", model=" + ((Object) b.b(this.f31730b)) + ')';
    }
}

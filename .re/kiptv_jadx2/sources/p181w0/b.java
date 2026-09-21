package p181w0;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import p121o0.p;

public final class b {

    public static final b f29745e = new b(0.0f, 0.0f, 0.0f, 0.0f);

    public final float f29746a;

    public final float f29747b;

    public final float f29748c;

    public final float f29749d;

    public b(float f9, float f10, float f11, float f12) {
        this.f29746a = f9;
        this.f29747b = f10;
        this.f29748c = f11;
        this.f29749d = f12;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f29746a) & (fIntBitsToFloat < this.f29748c) & (fIntBitsToFloat2 >= this.f29747b) & (fIntBitsToFloat2 < this.f29749d);
    }

    public final long b() {
        float f9 = this.f29748c;
        float f10 = this.f29746a;
        float f11 = ((f9 - f10) / 2.0f) + f10;
        float f12 = this.f29749d;
        float f13 = this.f29747b;
        return (((long) Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long c() {
        float f9 = this.f29748c - this.f29746a;
        return (((long) Float.floatToRawIntBits(this.f29749d - this.f29747b)) & 4294967295L) | (Float.floatToRawIntBits(f9) << 32);
    }

    public final long d() {
        return (((long) Float.floatToRawIntBits(this.f29746a)) << 32) | (((long) Float.floatToRawIntBits(this.f29747b)) & 4294967295L);
    }

    public final b e(b bVar) {
        return new b(Math.max(this.f29746a, bVar.f29746a), Math.max(this.f29747b, bVar.f29747b), Math.min(this.f29748c, bVar.f29748c), Math.min(this.f29749d, bVar.f29749d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f29746a, bVar.f29746a) == 0 && Float.compare(this.f29747b, bVar.f29747b) == 0 && Float.compare(this.f29748c, bVar.f29748c) == 0 && Float.compare(this.f29749d, bVar.f29749d) == 0;
    }

    public final boolean f() {
        return (this.f29746a >= this.f29748c) | (this.f29747b >= this.f29749d);
    }

    public final boolean g(b bVar) {
        return (this.f29746a < bVar.f29748c) & (bVar.f29746a < this.f29748c) & (this.f29747b < bVar.f29749d) & (bVar.f29747b < this.f29749d);
    }

    public final b h(float f9, float f10) {
        return new b(this.f29746a + f9, this.f29747b + f10, this.f29748c + f9, this.f29749d + f10);
    }

    public final int hashCode() {
        return Float.hashCode(this.f29749d) + p.c(this.f29748c, p.c(this.f29747b, Float.hashCode(this.f29746a) * 31, 31), 31);
    }

    public final b i(long j) {
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        return new b(Float.intBitsToFloat(i3) + this.f29746a, Float.intBitsToFloat(i9) + this.f29747b, Float.intBitsToFloat(i3) + this.f29748c, Float.intBitsToFloat(i9) + this.f29749d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + AbstractC1864o0.q0(this.f29746a) + ", " + AbstractC1864o0.q0(this.f29747b) + ", " + AbstractC1864o0.q0(this.f29748c) + ", " + AbstractC1864o0.q0(this.f29749d) + ')';
    }
}

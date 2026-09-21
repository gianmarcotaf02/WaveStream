package p181w0;

import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.android.gms.internal.play_billing.AbstractC1853k0;
import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import com.google.android.gms.internal.play_billing.M0;
import p121o0.p;

public final class c {

    public final float f29750a;

    public final float f29751b;

    public final float f29752c;

    public final float f29753d;

    public final long f29754e;

    public final long f29755f;
    public final long g;

    public final long f29756h;

    static {
        AbstractC1833d1.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public c(float f9, float f10, float f11, float f12, long j, long j9, long j10, long j11) {
        this.f29750a = f9;
        this.f29751b = f10;
        this.f29752c = f11;
        this.f29753d = f12;
        this.f29754e = j;
        this.f29755f = j9;
        this.g = j10;
        this.f29756h = j11;
    }

    public final float a() {
        return this.f29753d - this.f29751b;
    }

    public final float b() {
        return this.f29752c - this.f29750a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f29750a, cVar.f29750a) == 0 && Float.compare(this.f29751b, cVar.f29751b) == 0 && Float.compare(this.f29752c, cVar.f29752c) == 0 && Float.compare(this.f29753d, cVar.f29753d) == 0 && AbstractC1853k0.n(this.f29754e, cVar.f29754e) && AbstractC1853k0.n(this.f29755f, cVar.f29755f) && AbstractC1853k0.n(this.g, cVar.g) && AbstractC1853k0.n(this.f29756h, cVar.f29756h);
    }

    public final int hashCode() {
        return Long.hashCode(this.f29756h) + p.e(p.e(p.e(p.c(this.f29753d, p.c(this.f29752c, p.c(this.f29751b, Float.hashCode(this.f29750a) * 31, 31), 31), 31), 31, this.f29754e), 31, this.f29755f), 31, this.g);
    }

    public final String toString() {
        String str = AbstractC1864o0.q0(this.f29750a) + ", " + AbstractC1864o0.q0(this.f29751b) + ", " + AbstractC1864o0.q0(this.f29752c) + ", " + AbstractC1864o0.q0(this.f29753d);
        long j = this.f29754e;
        long j9 = this.f29755f;
        boolean zN = AbstractC1853k0.n(j, j9);
        long j10 = this.g;
        long j11 = this.f29756h;
        if (!zN || !AbstractC1853k0.n(j9, j10) || !AbstractC1853k0.n(j10, j11)) {
            StringBuilder sbQ = M0.q("RoundRect(rect=", str, ", topLeft=");
            sbQ.append((Object) AbstractC1853k0.F(j));
            sbQ.append(", topRight=");
            sbQ.append((Object) AbstractC1853k0.F(j9));
            sbQ.append(", bottomRight=");
            sbQ.append((Object) AbstractC1853k0.F(j10));
            sbQ.append(", bottomLeft=");
            sbQ.append((Object) AbstractC1853k0.F(j11));
            sbQ.append(')');
            return sbQ.toString();
        }
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i3) == Float.intBitsToFloat(i9)) {
            StringBuilder sbQ2 = M0.q("RoundRect(rect=", str, ", radius=");
            sbQ2.append(AbstractC1864o0.q0(Float.intBitsToFloat(i3)));
            sbQ2.append(')');
            return sbQ2.toString();
        }
        StringBuilder sbQ3 = M0.q("RoundRect(rect=", str, ", x=");
        sbQ3.append(AbstractC1864o0.q0(Float.intBitsToFloat(i3)));
        sbQ3.append(", y=");
        sbQ3.append(AbstractC1864o0.q0(Float.intBitsToFloat(i9)));
        sbQ3.append(')');
        return sbQ3.toString();
    }
}

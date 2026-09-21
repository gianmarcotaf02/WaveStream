package Z2;

import com.google.android.gms.internal.play_billing.AbstractC1864o0;
import io.ktor.sse.ServerSentEventKt;

public final class C1209t {

    public final int f12940a;

    public float f12941b;

    public float f12942c;

    public float f12943d;

    public float f12944e;

    public C1209t() {
        this.f12940a = 1;
        this.f12941b = 0.0f;
        this.f12942c = 0.0f;
        this.f12943d = 0.0f;
        this.f12944e = 0.0f;
    }

    public void a(float f9, float f10, float f11, float f12) {
        this.f12941b = Math.max(f9, this.f12941b);
        this.f12942c = Math.max(f10, this.f12942c);
        this.f12943d = Math.min(f11, this.f12943d);
        this.f12944e = Math.min(f12, this.f12944e);
    }

    public boolean b() {
        return (this.f12941b >= this.f12943d) | (this.f12942c >= this.f12944e);
    }

    public float c() {
        return this.f12941b + this.f12943d;
    }

    public float d() {
        return this.f12942c + this.f12944e;
    }

    public void e(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.f12941b += fIntBitsToFloat;
        this.f12942c += fIntBitsToFloat2;
        this.f12943d += fIntBitsToFloat;
        this.f12944e += fIntBitsToFloat2;
    }

    public final String toString() {
        switch (this.f12940a) {
            case 0:
                return "[" + this.f12941b + ServerSentEventKt.SPACE + this.f12942c + ServerSentEventKt.SPACE + this.f12943d + ServerSentEventKt.SPACE + this.f12944e + "]";
            default:
                return "MutableRect(" + AbstractC1864o0.q0(this.f12941b) + ", " + AbstractC1864o0.q0(this.f12942c) + ", " + AbstractC1864o0.q0(this.f12943d) + ", " + AbstractC1864o0.q0(this.f12944e) + ')';
        }
    }

    public C1209t(float f9, float f10, float f11, float f12) {
        this.f12940a = 0;
        this.f12941b = f9;
        this.f12942c = f10;
        this.f12943d = f11;
        this.f12944e = f12;
    }

    public C1209t(C1209t c1209t) {
        this.f12940a = 0;
        this.f12941b = c1209t.f12941b;
        this.f12942c = c1209t.f12942c;
        this.f12943d = c1209t.f12943d;
        this.f12944e = c1209t.f12944e;
    }
}

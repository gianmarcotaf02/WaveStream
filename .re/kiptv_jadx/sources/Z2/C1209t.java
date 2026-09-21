package Z2;

/* JADX INFO: renamed from: Z2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1209t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12944e;

    public C1209t() {
        this.f12940a = 1;
        this.f12941b = 0.0f;
        this.f12942c = 0.0f;
        this.f12943d = 0.0f;
        this.f12944e = 0.0f;
    }

    public void a(float f9, float f10, float f11, float f12) {
        this.f12941b = java.lang.Math.max(f9, this.f12941b);
        this.f12942c = java.lang.Math.max(f10, this.f12942c);
        this.f12943d = java.lang.Math.min(f11, this.f12943d);
        this.f12944e = java.lang.Math.min(f12, this.f12944e);
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
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        this.f12941b += fIntBitsToFloat;
        this.f12942c += fIntBitsToFloat2;
        this.f12943d += fIntBitsToFloat;
        this.f12944e += fIntBitsToFloat2;
    }

    public final java.lang.String toString() {
        switch (this.f12940a) {
            case 0:
                return "[" + this.f12941b + io.ktor.sse.ServerSentEventKt.SPACE + this.f12942c + io.ktor.sse.ServerSentEventKt.SPACE + this.f12943d + io.ktor.sse.ServerSentEventKt.SPACE + this.f12944e + "]";
            default:
                return "MutableRect(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f12941b) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f12942c) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f12943d) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f12944e) + ')';
        }
    }

    public C1209t(float f9, float f10, float f11, float f12) {
        this.f12940a = 0;
        this.f12941b = f9;
        this.f12942c = f10;
        this.f12943d = f11;
        this.f12944e = f12;
    }

    public C1209t(Z2.C1209t c1209t) {
        this.f12940a = 0;
        this.f12941b = c1209t.f12941b;
        this.f12942c = c1209t.f12942c;
        this.f12943d = c1209t.f12943d;
        this.f12944e = c1209t.f12944e;
    }
}

package p181w0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f29754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f29755f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f29756h;

    static {
        com.google.android.gms.internal.play_billing.AbstractC1833d1.e(0.0f, 0.0f, 0.0f, 0.0f, 0L);
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

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p181w0.c)) {
            return false;
        }
        p181w0.c cVar = (p181w0.c) obj;
        return java.lang.Float.compare(this.f29750a, cVar.f29750a) == 0 && java.lang.Float.compare(this.f29751b, cVar.f29751b) == 0 && java.lang.Float.compare(this.f29752c, cVar.f29752c) == 0 && java.lang.Float.compare(this.f29753d, cVar.f29753d) == 0 && com.google.android.gms.internal.play_billing.AbstractC1853k0.n(this.f29754e, cVar.f29754e) && com.google.android.gms.internal.play_billing.AbstractC1853k0.n(this.f29755f, cVar.f29755f) && com.google.android.gms.internal.play_billing.AbstractC1853k0.n(this.g, cVar.g) && com.google.android.gms.internal.play_billing.AbstractC1853k0.n(this.f29756h, cVar.f29756h);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.f29756h) + p121o0.p.e(p121o0.p.e(p121o0.p.e(p121o0.p.c(this.f29753d, p121o0.p.c(this.f29752c, p121o0.p.c(this.f29751b, java.lang.Float.hashCode(this.f29750a) * 31, 31), 31), 31), 31, this.f29754e), 31, this.f29755f), 31, this.g);
    }

    public final java.lang.String toString() {
        java.lang.String str = com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29750a) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29751b) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29752c) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29753d);
        long j = this.f29754e;
        long j9 = this.f29755f;
        boolean zN = com.google.android.gms.internal.play_billing.AbstractC1853k0.n(j, j9);
        long j10 = this.g;
        long j11 = this.f29756h;
        if (!zN || !com.google.android.gms.internal.play_billing.AbstractC1853k0.n(j9, j10) || !com.google.android.gms.internal.play_billing.AbstractC1853k0.n(j10, j11)) {
            java.lang.StringBuilder sbQ = com.google.android.gms.internal.play_billing.M0.q("RoundRect(rect=", str, ", topLeft=");
            sbQ.append((java.lang.Object) com.google.android.gms.internal.play_billing.AbstractC1853k0.F(j));
            sbQ.append(", topRight=");
            sbQ.append((java.lang.Object) com.google.android.gms.internal.play_billing.AbstractC1853k0.F(j9));
            sbQ.append(", bottomRight=");
            sbQ.append((java.lang.Object) com.google.android.gms.internal.play_billing.AbstractC1853k0.F(j10));
            sbQ.append(", bottomLeft=");
            sbQ.append((java.lang.Object) com.google.android.gms.internal.play_billing.AbstractC1853k0.F(j11));
            sbQ.append(')');
            return sbQ.toString();
        }
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i3) == java.lang.Float.intBitsToFloat(i9)) {
            java.lang.StringBuilder sbQ2 = com.google.android.gms.internal.play_billing.M0.q("RoundRect(rect=", str, ", radius=");
            sbQ2.append(com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i3)));
            sbQ2.append(')');
            return sbQ2.toString();
        }
        java.lang.StringBuilder sbQ3 = com.google.android.gms.internal.play_billing.M0.q("RoundRect(rect=", str, ", x=");
        sbQ3.append(com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i3)));
        sbQ3.append(", y=");
        sbQ3.append(com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(java.lang.Float.intBitsToFloat(i9)));
        sbQ3.append(')');
        return sbQ3.toString();
    }
}

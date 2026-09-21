package p181w0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p181w0.b f29745e = new p181w0.b(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f29747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f29748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f29749d;

    public b(float f9, float f10, float f11, float f12) {
        this.f29746a = f9;
        this.f29747b = f10;
        this.f29748c = f11;
        this.f29749d = f12;
    }

    public final boolean a(long j) {
        float fIntBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f29746a) & (fIntBitsToFloat < this.f29748c) & (fIntBitsToFloat2 >= this.f29747b) & (fIntBitsToFloat2 < this.f29749d);
    }

    public final long b() {
        float f9 = this.f29748c;
        float f10 = this.f29746a;
        float f11 = ((f9 - f10) / 2.0f) + f10;
        float f12 = this.f29749d;
        float f13 = this.f29747b;
        return (((long) java.lang.Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f11) << 32);
    }

    public final long c() {
        float f9 = this.f29748c - this.f29746a;
        return (((long) java.lang.Float.floatToRawIntBits(this.f29749d - this.f29747b)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f9) << 32);
    }

    public final long d() {
        return (((long) java.lang.Float.floatToRawIntBits(this.f29746a)) << 32) | (((long) java.lang.Float.floatToRawIntBits(this.f29747b)) & 4294967295L);
    }

    public final p181w0.b e(p181w0.b bVar) {
        return new p181w0.b(java.lang.Math.max(this.f29746a, bVar.f29746a), java.lang.Math.max(this.f29747b, bVar.f29747b), java.lang.Math.min(this.f29748c, bVar.f29748c), java.lang.Math.min(this.f29749d, bVar.f29749d));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p181w0.b)) {
            return false;
        }
        p181w0.b bVar = (p181w0.b) obj;
        return java.lang.Float.compare(this.f29746a, bVar.f29746a) == 0 && java.lang.Float.compare(this.f29747b, bVar.f29747b) == 0 && java.lang.Float.compare(this.f29748c, bVar.f29748c) == 0 && java.lang.Float.compare(this.f29749d, bVar.f29749d) == 0;
    }

    public final boolean f() {
        return (this.f29746a >= this.f29748c) | (this.f29747b >= this.f29749d);
    }

    public final boolean g(p181w0.b bVar) {
        return (this.f29746a < bVar.f29748c) & (bVar.f29746a < this.f29748c) & (this.f29747b < bVar.f29749d) & (bVar.f29747b < this.f29749d);
    }

    public final p181w0.b h(float f9, float f10) {
        return new p181w0.b(this.f29746a + f9, this.f29747b + f10, this.f29748c + f9, this.f29749d + f10);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.f29749d) + p121o0.p.c(this.f29748c, p121o0.p.c(this.f29747b, java.lang.Float.hashCode(this.f29746a) * 31, 31), 31);
    }

    public final p181w0.b i(long j) {
        int i3 = (int) (j >> 32);
        int i9 = (int) (j & 4294967295L);
        return new p181w0.b(java.lang.Float.intBitsToFloat(i3) + this.f29746a, java.lang.Float.intBitsToFloat(i9) + this.f29747b, java.lang.Float.intBitsToFloat(i3) + this.f29748c, java.lang.Float.intBitsToFloat(i9) + this.f29749d);
    }

    public final java.lang.String toString() {
        return "Rect.fromLTRB(" + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29746a) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29747b) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29748c) + ", " + com.google.android.gms.internal.play_billing.AbstractC1864o0.q0(this.f29749d) + ')';
    }
}

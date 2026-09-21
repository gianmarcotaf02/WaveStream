package p154s;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f27100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f27101b;

    public U(float f9, p113n1.c cVar) {
        this.f27100a = f9;
        float density = cVar.getDensity();
        float f10 = p154s.V.f27102a;
        this.f27101b = density * 386.0878f * 160.0f * 0.84f;
    }

    public final p154s.T a(float f9) {
        double dB = b(f9);
        double d4 = p154s.V.f27102a;
        double d6 = d4 - 1.0d;
        return new p154s.T(f9, (float) (java.lang.Math.exp((d4 / d6) * dB) * ((double) (this.f27100a * this.f27101b))), (long) (java.lang.Math.exp(dB / d6) * 1000.0d));
    }

    public final double b(float f9) {
        float[] fArr = p154s.AbstractC2716b.f27110a;
        return java.lang.Math.log(((double) (java.lang.Math.abs(f9) * 0.35f)) / ((double) (this.f27100a * this.f27101b)));
    }
}

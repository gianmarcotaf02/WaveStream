package p154s;

import p113n1.c;

public final class U {

    public final float f27100a;

    public final float f27101b;

    public U(float f9, c cVar) {
        this.f27100a = f9;
        float density = cVar.getDensity();
        float f10 = V.f27102a;
        this.f27101b = density * 386.0878f * 160.0f * 0.84f;
    }

    public final T a(float f9) {
        double dB = b(f9);
        double d4 = V.f27102a;
        double d6 = d4 - 1.0d;
        return new T(f9, (float) (Math.exp((d4 / d6) * dB) * ((double) (this.f27100a * this.f27101b))), (long) (Math.exp(dB / d6) * 1000.0d));
    }

    public final double b(float f9) {
        float[] fArr = AbstractC2716b.f27110a;
        return Math.log(((double) (Math.abs(f9) * 0.35f)) / ((double) (this.f27100a * this.f27101b)));
    }
}

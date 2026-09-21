package p163t;

import A7.m;

public interface B extends InterfaceC2766l {
    @Override
    default G0 a(E0 e6) {
        return new m(this);
    }

    float b(long j, float f9, float f10, float f11);

    long c(float f9, float f10, float f11);

    default float d(float f9, float f10, float f11) {
        return b(c(f9, f10, f11), f9, f10, f11);
    }

    float e(long j, float f9, float f10, float f11);
}

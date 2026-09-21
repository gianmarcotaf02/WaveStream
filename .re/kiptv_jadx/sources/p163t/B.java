package p163t;

/* JADX INFO: loaded from: classes.dex */
public interface B extends p163t.InterfaceC2766l {
    @Override // p163t.InterfaceC2766l
    default p163t.G0 a(p163t.E0 e6) {
        return new A7.m(this);
    }

    float b(long j, float f9, float f10, float f11);

    long c(float f9, float f10, float f11);

    default float d(float f9, float f10, float f11) {
        return b(c(f9, f10, f11), f9, f10, f11);
    }

    float e(long j, float f9, float f10, float f11);
}

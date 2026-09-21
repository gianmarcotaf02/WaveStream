package t5;

/* JADX INFO: renamed from: t5.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2836s0 implements x.InterfaceC3034c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f28374d;

    public C2836s0(float f9, float f10, boolean z6) {
        this.f28372b = f9;
        this.f28373c = f10;
        this.f28374d = z6;
    }

    @Override // x.InterfaceC3034c
    public final float a(float f9, float f10, float f11) {
        boolean z6 = this.f28374d;
        float f12 = this.f28372b;
        float f13 = z6 ? (f9 + f10) - (f11 - f12) : f9 - f12;
        if (java.lang.Math.abs(f13) <= this.f28373c) {
            return 0.0f;
        }
        return f13;
    }
}

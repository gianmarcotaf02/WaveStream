package t5;

/* JADX INFO: renamed from: t5.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2802g1 implements x.InterfaceC3034c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28191c;

    public C2802g1(float f9, float f10) {
        this.f28190b = f9;
        this.f28191c = f10;
    }

    @Override // x.InterfaceC3034c
    public final float a(float f9, float f10, float f11) {
        float f12 = f9 - this.f28190b;
        if (java.lang.Math.abs(f12) <= this.f28191c) {
            return 0.0f;
        }
        return f12;
    }
}

package x;

/* JADX INFO: renamed from: x.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3036d implements x.InterfaceC3034c {
    @Override // x.InterfaceC3034c
    public final float a(float f9, float f10, float f11) {
        float fAbs = java.lang.Math.abs((f10 + f9) - f9);
        float f12 = (0.3f * f11) - (0.0f * fAbs);
        float f13 = f11 - f12;
        if ((fAbs <= f11) && f13 < fAbs) {
            f12 = f11 - fAbs;
        }
        return f9 - f12;
    }
}

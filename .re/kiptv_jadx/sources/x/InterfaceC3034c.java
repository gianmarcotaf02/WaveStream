package x;

/* JADX INFO: renamed from: x.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3034c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x.C3032b f30856a = x.C3032b.f30850a;

    default float a(float f9, float f10, float f11) {
        f30856a.getClass();
        float f12 = f10 + f9;
        if ((f9 >= 0.0f && f12 <= f11) || (f9 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return java.lang.Math.abs(f9) < java.lang.Math.abs(f13) ? f9 : f13;
    }
}

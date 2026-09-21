package x;

public interface InterfaceC3034c {

    public static final C3032b f30856a = C3032b.f30850a;

    default float a(float f9, float f10, float f11) {
        f30856a.getClass();
        float f12 = f10 + f9;
        if ((f9 >= 0.0f && f12 <= f11) || (f9 < 0.0f && f12 > f11)) {
            return 0.0f;
        }
        float f13 = f12 - f11;
        return Math.abs(f9) < Math.abs(f13) ? f9 : f13;
    }
}

package x;

public final class C3056n implements InterfaceC3076x0 {

    public final C3058o f30956a;

    public C3056n(C3058o c3058o) {
        this.f30956a = c3058o;
    }

    @Override
    public final float a(float f9) {
        if (Float.isNaN(f9)) {
            return 0.0f;
        }
        C3058o c3058o = this.f30956a;
        float fFloatValue = ((Number) c3058o.f30960a.invoke(Float.valueOf(f9))).floatValue();
        c3058o.f30964e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        c3058o.f30965f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

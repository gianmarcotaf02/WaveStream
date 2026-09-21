package x;

/* JADX INFO: renamed from: x.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3056n implements x.InterfaceC3076x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x.C3058o f30956a;

    public C3056n(x.C3058o c3058o) {
        this.f30956a = c3058o;
    }

    @Override // x.InterfaceC3076x0
    public final float a(float f9) {
        if (java.lang.Float.isNaN(f9)) {
            return 0.0f;
        }
        x.C3058o c3058o = this.f30956a;
        float fFloatValue = ((java.lang.Number) c3058o.f30960a.invoke(java.lang.Float.valueOf(f9))).floatValue();
        c3058o.f30964e.setValue(java.lang.Boolean.valueOf(fFloatValue > 0.0f));
        c3058o.f30965f.setValue(java.lang.Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}

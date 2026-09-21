package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Z2.N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f12963a = new android.graphics.Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12965c;

    public w0(Z2.M m8) {
        if (m8 == null) {
            return;
        }
        m8.x(this);
    }

    @Override // Z2.N
    public final void a(float f9, float f10, float f11, float f12) {
        this.f12963a.quadTo(f9, f10, f11, f12);
        this.f12964b = f11;
        this.f12965c = f12;
    }

    @Override // Z2.N
    public final void b(float f9, float f10) {
        this.f12963a.moveTo(f9, f10);
        this.f12964b = f9;
        this.f12965c = f10;
    }

    @Override // Z2.N
    public final void c(float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f12963a.cubicTo(f9, f10, f11, f12, f13, f14);
        this.f12964b = f13;
        this.f12965c = f14;
    }

    @Override // Z2.N
    public final void close() {
        this.f12963a.close();
    }

    @Override // Z2.N
    public final void d(float f9, float f10, float f11, boolean z6, boolean z9, float f12, float f13) {
        Z2.C0.a(this.f12964b, this.f12965c, f9, f10, f11, z6, z9, f12, f13, this);
        this.f12964b = f12;
        this.f12965c = f13;
    }

    @Override // Z2.N
    public final void e(float f9, float f10) {
        this.f12963a.lineTo(f9, f10);
        this.f12964b = f9;
        this.f12965c = f10;
    }
}

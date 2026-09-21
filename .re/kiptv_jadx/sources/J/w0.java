package J;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public static final p079i7.f g = p112n0.l.b(new B.C0063a(22), new I5.W0(26));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p020c0.C1673c0 f5945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.C1673c0 f5946b = new p020c0.C1673c0(0.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p020c0.C1675d0 f5947c = new p020c0.C1675d0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p181w0.b f5948d = p181w0.b.f29745e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5949e = p011b1.L.f17782b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p020c0.C1681g0 f5950f;

    public w0(x.EnumC3061p0 enumC3061p0, float f9) {
        this.f5945a = new p020c0.C1673c0(f9);
        this.f5950f = new p020c0.C1681g0(enumC3061p0, p020c0.C1676e.f18243n);
    }

    public final void a(x.EnumC3061p0 enumC3061p0, p181w0.b bVar, int i3, int i9) {
        float f9;
        float f10 = i9 - i3;
        this.f5946b.h(f10);
        p181w0.b bVar2 = this.f5948d;
        float f11 = bVar2.f29746a;
        float f12 = bVar.f29746a;
        p020c0.C1673c0 c1673c0 = this.f5945a;
        float f13 = bVar.f29747b;
        if (f12 != f11 || f13 != bVar2.f29747b) {
            boolean z6 = enumC3061p0 == x.EnumC3061p0.f30978h;
            if (z6) {
                f12 = f13;
            }
            float f14 = z6 ? bVar.f29749d : bVar.f29748c;
            float fG = c1673c0.g();
            float f15 = i3;
            float f16 = fG + f15;
            if (f14 <= f16 && (f12 >= fG || f14 - f12 <= f15)) {
                f9 = (f12 >= fG || f14 - f12 > f15) ? 0.0f : f12 - fG;
            } else {
                f9 = f14 - f16;
            }
            c1673c0.h(c1673c0.g() + f9);
            this.f5948d = bVar;
        }
        c1673c0.h(O7.r.r(c1673c0.g(), 0.0f, f10));
        this.f5947c.h(i3);
    }
}

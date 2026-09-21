package p171u0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements p113n1.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p171u0.a f28652h = p171u0.j.f28659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p020c0.C1704s0 f28653i;

    @Override // p113n1.c
    public final float S() {
        return this.f28652h.getDensity().S();
    }

    public final p020c0.C1704s0 a(p194x6.j jVar) {
        p020c0.C1704s0 c1704s0 = new p020c0.C1704s0(23, false);
        c1704s0.f18362i = jVar;
        this.f28653i = c1704s0;
        return c1704s0;
    }

    @Override // p113n1.c
    public final float getDensity() {
        return this.f28652h.getDensity().getDensity();
    }
}

package Z2;

/* JADX INFO: loaded from: classes.dex */
public final class x0 extends Z2.y0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final android.graphics.Path f12967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Z2.C0 f12968r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Z2.C0 c9, android.graphics.Path path, float f9) {
        super(c9, f9, 0.0f);
        this.f12968r = c9;
        this.f12967q = path;
    }

    @Override // Z2.y0, R8.i
    public final void A(java.lang.String str) {
        Z2.C0 c9 = this.f12968r;
        if (c9.c0()) {
            Z2.A0 a2 = (Z2.A0) c9.f12657c;
            if (a2.f12641b) {
                ((android.graphics.Canvas) c9.f12655a).drawTextOnPath(str, this.f12967q, this.f12969n, this.f12970o, a2.f12643d);
            }
            Z2.A0 a9 = (Z2.A0) c9.f12657c;
            if (a9.f12642c) {
                ((android.graphics.Canvas) c9.f12655a).drawTextOnPath(str, this.f12967q, this.f12969n, this.f12970o, a9.f12644e);
            }
        }
        this.f12969n = ((Z2.A0) c9.f12657c).f12643d.measureText(str) + this.f12969n;
    }
}

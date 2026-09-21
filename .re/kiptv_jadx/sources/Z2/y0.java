package Z2;

/* JADX INFO: loaded from: classes.dex */
public class y0 extends R8.i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f12969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f12970o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Z2.C0 f12971p;

    public y0(Z2.C0 c9, float f9, float f10) {
        this.f12971p = c9;
        this.f12969n = f9;
        this.f12970o = f10;
    }

    @Override // R8.i
    public void A(java.lang.String str) {
        Z2.C0 c9 = this.f12971p;
        if (c9.c0()) {
            Z2.A0 a2 = (Z2.A0) c9.f12657c;
            if (a2.f12641b) {
                ((android.graphics.Canvas) c9.f12655a).drawText(str, this.f12969n, this.f12970o, a2.f12643d);
            }
            Z2.A0 a9 = (Z2.A0) c9.f12657c;
            if (a9.f12642c) {
                ((android.graphics.Canvas) c9.f12655a).drawText(str, this.f12969n, this.f12970o, a9.f12644e);
            }
        }
        this.f12969n = ((Z2.A0) c9.f12657c).f12643d.measureText(str) + this.f12969n;
    }
}

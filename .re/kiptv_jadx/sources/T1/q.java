package T1;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f9703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public java.lang.Object f9704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.lang.Object f9705f;

    public q(j1.l lVar, int i3, int i9, int i10, java.lang.String str) {
        this.f9705f = lVar;
        this.f9700a = i3;
        this.f9701b = i9;
        this.f9702c = i10;
        this.f9703d = str;
    }

    public android.media.VolumeProvider a() {
        T1.q qVar;
        if (((android.media.VolumeProvider) this.f9704e) != null) {
            qVar = this;
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            qVar = this;
            qVar.f9704e = new p082j2.d(qVar, this.f9700a, this.f9701b, this.f9702c, (java.lang.String) this.f9703d);
        } else {
            qVar = this;
            qVar.f9704e = new p082j2.e(this, qVar.f9700a, qVar.f9701b, qVar.f9702c);
        }
        return (android.media.VolumeProvider) qVar.f9704e;
    }

    public void b() {
        this.f9700a = 1;
        this.f9704e = (T1.t) this.f9703d;
        this.f9702c = 0;
    }

    public boolean c() {
        U1.a aVarB = ((T1.t) this.f9704e).f9715b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || ((java.nio.ByteBuffer) aVarB.f1972k).get(iA + aVarB.f1970h) == 0) || this.f9701b == 65039;
    }

    public q(T1.t tVar) {
        this.f9700a = 1;
        this.f9703d = tVar;
        this.f9704e = tVar;
    }
}

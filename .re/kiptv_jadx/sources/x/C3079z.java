package x;

/* JADX INFO: renamed from: x.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3079z implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f31036i;

    public /* synthetic */ C3079z(int i3, java.lang.Object obj) {
        this.f31035h = i3;
        this.f31036i = obj;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        switch (this.f31035h) {
            case 0:
                ((J.Z) this.f31036i).invoke();
                return p070h6.A.f22523a;
            default:
                x.W0 w6 = (x.W0) this.f31036i;
                return new p181w0.a(w6.c(w6.f30827k, ((p181w0.a) obj).f29744a, w6.j));
        }
    }
}

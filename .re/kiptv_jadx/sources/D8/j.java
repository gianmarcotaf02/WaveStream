package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D8.n f2534f;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2535h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(java.lang.String str, D8.n nVar, int i3, int i9, int i10) {
        super(str, true);
        this.f2533e = i10;
        this.f2534f = nVar;
        this.g = i3;
        this.f2535h = i9;
    }

    @Override // z8.a
    public final long a() {
        switch (this.f2533e) {
            case 0:
                int i3 = this.g;
                int i9 = this.f2535h;
                D8.n nVar = this.f2534f;
                nVar.getClass();
                try {
                    nVar.f2547D.u(i3, i9, true);
                    return -1L;
                } catch (java.io.IOException e6) {
                    nVar.b(2, 2, e6);
                    return -1L;
                }
            case 1:
                D8.z zVar = this.f2534f.f2559r;
                int i10 = this.f2535h;
                zVar.getClass();
                com.google.android.gms.internal.play_billing.M0.s(i10, "errorCode");
                synchronized (this.f2534f) {
                    this.f2534f.f2549F.remove(java.lang.Integer.valueOf(this.g));
                }
                return -1L;
            default:
                D8.n nVar2 = this.f2534f;
                try {
                    int i11 = this.g;
                    int i12 = this.f2535h;
                    nVar2.getClass();
                    com.google.android.gms.internal.play_billing.M0.s(i12, "statusCode");
                    nVar2.f2547D.v(i11, i12);
                    return -1L;
                } catch (java.io.IOException e9) {
                    nVar2.b(2, 2, e9);
                    return -1L;
                }
        }
    }
}

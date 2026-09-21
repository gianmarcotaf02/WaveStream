package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D8.n f2536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2537f;
    public final /* synthetic */ M8.C0682j g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, D8.n nVar, int i3, M8.C0682j c0682j, int i9, boolean z6) {
        super(str, true);
        this.f2536e = nVar;
        this.f2537f = i3;
        this.g = c0682j;
        this.f2538h = i9;
    }

    @Override // z8.a
    public final long a() {
        try {
            D8.z zVar = this.f2536e.f2559r;
            M8.C0682j c0682j = this.g;
            int i3 = this.f2538h;
            zVar.getClass();
            c0682j.C(i3);
            this.f2536e.f2547D.v(this.f2537f, 9);
            synchronized (this.f2536e) {
                this.f2536e.f2549F.remove(java.lang.Integer.valueOf(this.f2537f));
            }
            return -1L;
        } catch (java.io.IOException unused) {
            return -1L;
        }
    }
}

package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2539e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D8.n f2540f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, D8.n nVar, int i3, java.util.List list) {
        super(str, true);
        this.f2540f = nVar;
        this.g = i3;
    }

    @Override // z8.a
    public final long a() {
        switch (this.f2539e) {
            case 0:
                this.f2540f.f2559r.getClass();
                try {
                    this.f2540f.f2547D.v(this.g, 9);
                    synchronized (this.f2540f) {
                        this.f2540f.f2549F.remove(java.lang.Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (java.io.IOException unused) {
                    return -1L;
                }
            default:
                this.f2540f.f2559r.getClass();
                try {
                    this.f2540f.f2547D.v(this.g, 9);
                    synchronized (this.f2540f) {
                        this.f2540f.f2549F.remove(java.lang.Integer.valueOf(this.g));
                    }
                    return -1L;
                } catch (java.io.IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, D8.n nVar, int i3, java.util.List list, boolean z6) {
        super(str, true);
        this.f2540f = nVar;
        this.g = i3;
    }
}

package D8;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends z8.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D8.n f2541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f2542f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, D8.n nVar, int i3, long j) {
        super(str, true);
        this.f2541e = nVar;
        this.f2542f = i3;
        this.g = j;
    }

    @Override // z8.a
    public final long a() {
        D8.n nVar = this.f2541e;
        try {
            nVar.f2547D.z(this.f2542f, this.g);
            return -1L;
        } catch (java.io.IOException e6) {
            nVar.b(2, 2, e6);
            return -1L;
        }
    }
}

package F3;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.lang.Object f3605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public java.lang.Object f3608d;

    public static F3.n b() {
        F3.n nVar = new F3.n();
        nVar.f3606b = true;
        nVar.f3607c = 0;
        return nVar;
    }

    public F3.n a() {
        H3.q.a("execute parameter required", ((F3.l) this.f3608d) != null);
        D3.d[] dVarArr = (D3.d[]) this.f3605a;
        boolean z6 = this.f3606b;
        int i3 = this.f3607c;
        F3.n nVar = new F3.n();
        nVar.f3608d = this;
        nVar.f3605a = dVarArr;
        boolean z9 = false;
        if (dVarArr != null && z6) {
            z9 = true;
        }
        nVar.f3606b = z9;
        nVar.f3607c = i3;
        return nVar;
    }
}

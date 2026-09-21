package F;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f3438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List[] f3439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F.h0 f3443f;

    public g0(F.h0 h0Var, java.util.List list) {
        this.f3443f = h0Var;
        this.f3438a = list;
        this.f3439b = new java.util.List[list.size()];
        if (list.isEmpty()) {
            A.b.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}

package p048f1;

/* JADX INFO: renamed from: f1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2144b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.List f21634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p048f1.y f21635i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f21637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p048f1.C2145c f21638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f21639n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2144b(p048f1.C2145c c2145c, p117n6.c cVar) {
        super(cVar);
        this.f21638m = c2145c;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f21637l = obj;
        this.f21639n |= Integer.MIN_VALUE;
        return this.f21638m.c(this);
    }
}

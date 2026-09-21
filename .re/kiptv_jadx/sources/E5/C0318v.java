package E5;

/* JADX INFO: renamed from: E5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0318v implements p194x6.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ t5.C2785b f3162h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f3163i;
    public final /* synthetic */ t5.C2796e1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.functions.Function0 f3164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p194x6.j f3165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p020c0.X f3166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f3167n;

    public C0318v(t5.C2785b c2785b, boolean z6, t5.C2796e1 c2796e1, kotlin.jvm.functions.Function0 function0, p194x6.j jVar, p020c0.X x9, int i3) {
        this.f3162h = c2785b;
        this.f3163i = z6;
        this.j = c2796e1;
        this.f3164k = function0;
        this.f3165l = jVar;
        this.f3166m = x9;
        this.f3167n = i3;
    }

    @Override // p194x6.j
    public final java.lang.Object invoke(java.lang.Object obj) {
        D.j LazyRow = (D.j) obj;
        kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
        t5.C2785b c2785b = this.f3162h;
        java.util.List list = c2785b.f28132e;
        LazyRow.q(list.size(), new C5.L(7, list), new C5.L(8, list), new p089k0.e(2039820996, new E5.C0316u(list, c2785b, this.f3163i, this.j, this.f3164k, this.f3165l, this.f3166m, this.f3167n), true));
        return p070h6.A.f22523a;
    }
}

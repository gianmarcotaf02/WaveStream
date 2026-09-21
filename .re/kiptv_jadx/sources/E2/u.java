package E2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E2.w f2805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public S2.p f2806i;
    public S2.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public E2.g f2807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public E2.l f2808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f2809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E2.w f2810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2811o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(E2.w wVar, p117n6.c cVar) {
        super(cVar);
        this.f2810n = wVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f2809m = obj;
        this.f2811o |= Integer.MIN_VALUE;
        return this.f2810n.a(null, 0, this);
    }
}

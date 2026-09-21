package O1;

/* JADX INFO: renamed from: O1.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0758w extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f7870h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public O1.N f7871i;
    public S7.C0901q j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7872k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O1.N f7873l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7874m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0758w(O1.N n3, p117n6.c cVar) {
        super(cVar);
        this.f7873l = n3;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7872k = obj;
        this.f7874m |= Integer.MIN_VALUE;
        return O1.N.c(this.f7873l, null, this);
    }
}

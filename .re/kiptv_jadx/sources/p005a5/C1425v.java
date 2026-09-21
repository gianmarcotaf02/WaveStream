package p005a5;

/* JADX INFO: renamed from: a5.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425v extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1455y f15160h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f15161i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.C1455y f15162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15163l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425v(p005a5.C1455y c1455y, p117n6.c cVar) {
        super(cVar);
        this.f15162k = c1455y;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f15163l |= Integer.MIN_VALUE;
        return this.f15162k.d(null, this);
    }
}

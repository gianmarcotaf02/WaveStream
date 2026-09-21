package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class q extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p015b5.t f17983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17984i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p015b5.t f17985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17986l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p015b5.t tVar, p117n6.c cVar) {
        super(cVar);
        this.f17985k = tVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f17986l |= Integer.MIN_VALUE;
        return this.f17985k.a(null, this);
    }
}

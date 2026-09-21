package p015b5;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p015b5.k f17954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17955i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p015b5.k f17956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17957l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p015b5.k kVar, p117n6.c cVar) {
        super(cVar);
        this.f17956k = kVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f17957l |= Integer.MIN_VALUE;
        return this.f17956k.c(0, this);
    }
}

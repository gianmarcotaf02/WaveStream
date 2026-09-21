package K2;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K2.k f6829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K2.h f6830i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ K2.k f6831k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6832l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(K2.k kVar, p117n6.c cVar) {
        super(cVar);
        this.f6831k = kVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f6832l |= Integer.MIN_VALUE;
        return this.f6831k.a(this);
    }
}

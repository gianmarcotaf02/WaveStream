package F2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S2.h f3535h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f3536i;
    public final /* synthetic */ F2.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3537k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(F2.j jVar, p117n6.c cVar) {
        super(cVar);
        this.j = jVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f3536i = obj;
        this.f3537k |= Integer.MIN_VALUE;
        return this.j.a(null, null, this);
    }
}

package p085j5;

/* JADX INFO: loaded from: classes.dex */
public final class S extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p085j5.a0 f24046h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f24047i;
    public final /* synthetic */ p085j5.a0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24048k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(p085j5.a0 a0Var, p117n6.c cVar) {
        super(cVar);
        this.j = a0Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f24047i = obj;
        this.f24048k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}

package K2;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public K2.k f6807h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6808i;
    public final /* synthetic */ K2.h j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6809k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(K2.h hVar, p117n6.c cVar) {
        super(cVar);
        this.j = hVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6808i = obj;
        this.f6809k |= Integer.MIN_VALUE;
        return this.j.d(null, this);
    }
}

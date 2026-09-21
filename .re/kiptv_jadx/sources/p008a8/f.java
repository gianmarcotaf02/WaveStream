package p008a8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p008a8.g f15530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15531i;
    public final /* synthetic */ p008a8.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15532k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p008a8.g gVar, p117n6.c cVar) {
        super(cVar);
        this.j = gVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15531i = obj;
        this.f15532k |= Integer.MIN_VALUE;
        return this.j.d(this);
    }
}

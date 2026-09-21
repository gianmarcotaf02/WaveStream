package p005a5;

/* JADX INFO: renamed from: a5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1445x extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.C1455y f15278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15279i;
    public final /* synthetic */ p005a5.C1455y j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15280k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445x(p005a5.C1455y c1455y, p117n6.c cVar) {
        super(cVar);
        this.j = c1455y;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15279i = obj;
        this.f15280k |= Integer.MIN_VALUE;
        return this.j.e(this);
    }
}

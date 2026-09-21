package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class w9 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p005a5.x9 f15275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f15276i;
    public final /* synthetic */ p005a5.x9 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15277k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w9(p005a5.x9 x9Var, p117n6.c cVar) {
        super(cVar);
        this.j = x9Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f15276i = obj;
        this.f15277k |= Integer.MIN_VALUE;
        return this.j.i(this);
    }
}

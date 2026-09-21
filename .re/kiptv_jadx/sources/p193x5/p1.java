package p193x5;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p193x5.s1 f31573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f31574i;
    public final /* synthetic */ p193x5.s1 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f31575k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p193x5.s1 s1Var, p117n6.c cVar) {
        super(cVar);
        this.j = s1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f31574i = obj;
        this.f31575k |= Integer.MIN_VALUE;
        return this.j.z(null, null, this);
    }
}

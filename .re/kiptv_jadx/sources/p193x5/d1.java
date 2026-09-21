package p193x5;

/* JADX INFO: loaded from: classes4.dex */
public final class d1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p193x5.s1 f31443h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f31444i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p193x5.s1 f31445k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f31446l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(p193x5.s1 s1Var, p117n6.c cVar) {
        super(cVar);
        this.f31445k = s1Var;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f31446l |= Integer.MIN_VALUE;
        return this.f31445k.w(this);
    }
}

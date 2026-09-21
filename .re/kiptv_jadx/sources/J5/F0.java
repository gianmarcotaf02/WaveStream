package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class F0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J5.J0 f6086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f6087i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ J5.J0 f6088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f6089l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F0(J5.J0 j9, p117n6.c cVar) {
        super(cVar);
        this.f6088k = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f6089l |= Integer.MIN_VALUE;
        return this.f6088k.e(null, this);
    }
}

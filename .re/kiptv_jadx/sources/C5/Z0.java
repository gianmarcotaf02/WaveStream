package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class Z0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5.K0 f1193h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1194i;
    public final /* synthetic */ C5.K0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1195k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C5.K0 k1, p100l6.c cVar) {
        super(cVar);
        this.j = k1;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1194i = obj;
        this.f1195k |= Integer.MIN_VALUE;
        return this.j.a(false, this);
    }
}

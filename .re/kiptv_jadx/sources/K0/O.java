package K0;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public S7.w0 f6663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6664i;
    public final /* synthetic */ K0.S j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6665k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(K0.S s9, p117n6.c cVar) {
        super(cVar);
        this.j = s9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6664i = obj;
        this.f6665k |= Integer.MIN_VALUE;
        return this.j.f(0L, null, this);
    }
}

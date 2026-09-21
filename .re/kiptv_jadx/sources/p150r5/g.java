package p150r5;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E5.C0298k0 f26875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f26876i;
    public final /* synthetic */ E5.C0298k0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f26877k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(E5.C0298k0 c0298k0, p100l6.c cVar) {
        super(cVar);
        this.j = c0298k0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f26876i = obj;
        this.f26877k |= Integer.MIN_VALUE;
        return this.j.a(null, this);
    }
}

package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class E6 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f13351h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p194x6.m f13352i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p005a5.F6 f13353k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13354l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E6(p005a5.F6 f9, p100l6.c cVar) {
        super(cVar);
        this.f13353k = f9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13354l |= Integer.MIN_VALUE;
        return this.f13353k.d(null, this);
    }
}

package J5;

/* JADX INFO: loaded from: classes4.dex */
public final class U extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f6278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f6279i;
    public final /* synthetic */ J5.V j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(J5.V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f6278h = obj;
        this.f6279i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}

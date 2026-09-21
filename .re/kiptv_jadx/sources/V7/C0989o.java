package V7;

/* JADX INFO: renamed from: V7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0989o extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10495h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E5.C0298k0 f10496i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0989o(E5.C0298k0 c0298k0, p100l6.c cVar) {
        super(cVar);
        this.f10496i = c0298k0;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10495h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10496i.emit(null, this);
    }
}

package V4;

/* JADX INFO: renamed from: V4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0972o extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10322i;
    public final /* synthetic */ U.O j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0972o(U.O o8, p100l6.c cVar) {
        super(cVar);
        this.j = o8;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10321h = obj;
        this.f10322i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}

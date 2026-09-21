package V4;

/* JADX INFO: loaded from: classes.dex */
public final class O extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10286i;
    public final /* synthetic */ V4.H j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(V4.H h9, p100l6.c cVar) {
        super(cVar);
        this.j = h9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10285h = obj;
        this.f10286i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}

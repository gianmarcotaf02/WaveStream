package V7;

/* JADX INFO: loaded from: classes4.dex */
public final class I extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public V7.F f10389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10390i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ V7.F f10391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.Object f10392l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(V7.F f9, p100l6.c cVar) {
        super(cVar);
        this.f10391k = f9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10390i = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10391k.emit(null, this);
    }
}

package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.kiptv.core.repository.a f13529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p028c8.d f13530i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.kiptv.core.repository.a f13531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(com.kiptv.core.repository.a aVar, p117n6.c cVar) {
        super(cVar);
        this.f13531k = aVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f13532l |= Integer.MIN_VALUE;
        return this.f13531k.b(this);
    }
}

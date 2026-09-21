package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class Q6 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.kiptv.core.repository.b f13828h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13829i;
    public final /* synthetic */ com.kiptv.core.repository.b j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13830k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q6(com.kiptv.core.repository.b bVar, p117n6.c cVar) {
        super(cVar);
        this.j = bVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13829i = obj;
        this.f13830k |= Integer.MIN_VALUE;
        return com.kiptv.core.repository.b.b(this.j, null, null, null, this);
    }
}

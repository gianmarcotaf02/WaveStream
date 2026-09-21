package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U7.j f10185i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(U7.j jVar, p117n6.c cVar) {
        super(cVar);
        this.f10185i = jVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10184h = obj;
        this.j |= Integer.MIN_VALUE;
        java.lang.Object objZ = this.f10185i.z(null, 0, 0L, this);
        return objZ == p109m6.a.f25430h ? objZ : new U7.r(objZ);
    }
}

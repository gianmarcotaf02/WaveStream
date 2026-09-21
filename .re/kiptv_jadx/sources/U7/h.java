package U7;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U7.j f10183i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(U7.j jVar, p117n6.c cVar) {
        super(cVar);
        this.f10183i = jVar;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10182h = obj;
        this.j |= Integer.MIN_VALUE;
        java.lang.Object objY = U7.j.y(this.f10183i, this);
        return objY == p109m6.a.f25430h ? objY : new U7.r(objY);
    }
}

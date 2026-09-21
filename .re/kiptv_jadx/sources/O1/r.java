package O1;

/* JADX INFO: loaded from: classes.dex */
public final class r extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f7857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7858i;
    public final /* synthetic */ J5.V j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J5.V v6, p100l6.c cVar) {
        super(cVar);
        this.j = v6;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f7857h = obj;
        this.f7858i |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}

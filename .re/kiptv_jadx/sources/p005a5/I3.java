package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class I3 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f13505h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p005a5.J3 f13506i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(p005a5.J3 j9, p117n6.c cVar) {
        super(cVar);
        this.f13506i = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f13505h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f13506i.e(null, null, null, this);
    }
}

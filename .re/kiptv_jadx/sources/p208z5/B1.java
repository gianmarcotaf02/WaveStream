package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class B1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32426i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32426i = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32425h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f32426i.v(null, this);
    }
}

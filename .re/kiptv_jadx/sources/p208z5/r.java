package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.X f32805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32806i;
    public final /* synthetic */ p208z5.X j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32807k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p208z5.X x9, p117n6.c cVar) {
        super(cVar);
        this.j = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32806i = obj;
        this.f32807k |= Integer.MIN_VALUE;
        return this.j.h(null, this);
    }
}

package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class M extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J f32525h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32526i;
    public final /* synthetic */ p208z5.J j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32527k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(p208z5.J j, p100l6.c cVar) {
        super(cVar);
        this.j = j;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32526i = obj;
        this.f32527k |= Integer.MIN_VALUE;
        return this.j.a(this);
    }
}

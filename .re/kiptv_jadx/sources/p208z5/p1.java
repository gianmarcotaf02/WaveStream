package p208z5;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.J1 f32783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.util.LinkedHashMap f32784i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p208z5.J1 f32785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f32786l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p208z5.J1 j9, p117n6.c cVar) {
        super(cVar);
        this.f32785k = j9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f32786l |= Integer.MIN_VALUE;
        return p208z5.J1.f(this.f32785k, this);
    }
}

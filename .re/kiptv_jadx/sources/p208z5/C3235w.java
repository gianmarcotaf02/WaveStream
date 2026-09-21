package p208z5;

/* JADX INFO: renamed from: z5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3235w extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p208z5.X f32868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f32869i;
    public final /* synthetic */ p208z5.X j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32870k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3235w(p208z5.X x9, p117n6.c cVar) {
        super(cVar);
        this.j = x9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f32869i = obj;
        this.f32870k |= Integer.MIN_VALUE;
        return p208z5.X.e(this.j, 0, this);
    }
}

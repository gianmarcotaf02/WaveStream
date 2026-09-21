package I5;

/* JADX INFO: renamed from: I5.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0437a0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.D0 f5026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5027i;
    public /* synthetic */ java.lang.Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f5028k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5029l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0437a0(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.f5028k = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.j = obj;
        this.f5029l |= Integer.MIN_VALUE;
        return I5.D0.e(this.f5028k, 0, 0, this);
    }
}

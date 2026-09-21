package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class B0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.D0 f4629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f4630i;
    public final /* synthetic */ I5.D0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4631k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B0(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.j = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f4630i = obj;
        this.f4631k |= Integer.MIN_VALUE;
        return I5.D0.i(this.j, this);
    }
}

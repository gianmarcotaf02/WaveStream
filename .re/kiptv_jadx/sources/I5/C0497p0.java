package I5;

/* JADX INFO: renamed from: I5.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0497p0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.D0 f5311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5312i;
    public final /* synthetic */ I5.D0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5313k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0497p0(I5.D0 d4, p100l6.c cVar) {
        super(cVar);
        this.j = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5312i = obj;
        this.f5313k |= Integer.MIN_VALUE;
        return I5.D0.g(this.j, this);
    }
}

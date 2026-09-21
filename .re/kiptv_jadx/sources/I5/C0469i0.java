package I5;

/* JADX INFO: renamed from: I5.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0469i0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I5.D0 f5163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public java.lang.String f5164i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5165k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f5166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5167m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0469i0(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.f5166l = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5165k = obj;
        this.f5167m |= Integer.MIN_VALUE;
        return this.f5166l.s(null, false, this);
    }
}

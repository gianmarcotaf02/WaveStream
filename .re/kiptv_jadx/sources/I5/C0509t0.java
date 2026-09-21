package I5;

/* JADX INFO: renamed from: I5.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0509t0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f5360i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0509t0(I5.D0 d4, p117n6.c cVar) {
        super(cVar);
        this.f5360i = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f5359h = obj;
        this.j |= Integer.MIN_VALUE;
        return I5.D0.h(this.f5360i, null, this);
    }
}

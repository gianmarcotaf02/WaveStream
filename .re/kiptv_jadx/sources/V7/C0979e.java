package V7;

/* JADX INFO: renamed from: V7.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0979e extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ E5.D0 f10456i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0979e(E5.D0 d4, p100l6.c cVar) {
        super(cVar);
        this.f10456i = d4;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10455h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.f10456i.emit(null, this);
    }
}

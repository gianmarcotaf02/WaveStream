package C5;

/* JADX INFO: loaded from: classes4.dex */
public final class X0 extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C5.Y0 f1168h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1169i;
    public final /* synthetic */ C5.Y0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1170k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(C5.Y0 y9, p100l6.c cVar) {
        super(cVar);
        this.j = y9;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f1169i = obj;
        this.f1170k |= Integer.MIN_VALUE;
        return this.j.emit(null, this);
    }
}

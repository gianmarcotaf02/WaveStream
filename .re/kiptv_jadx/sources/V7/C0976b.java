package V7;

/* JADX INFO: renamed from: V7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0976b extends p117n6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public U7.A f10440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f10441i;
    public final /* synthetic */ V7.C0977c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10442k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0976b(V7.C0977c c0977c, p117n6.c cVar) {
        super(cVar);
        this.j = c0977c;
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f10441i = obj;
        this.f10442k |= Integer.MIN_VALUE;
        return this.j.c(null, this);
    }
}

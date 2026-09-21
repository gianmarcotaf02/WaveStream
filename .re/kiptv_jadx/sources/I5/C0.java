package I5;

/* JADX INFO: loaded from: classes4.dex */
public final class C0 extends p117n6.i implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4676h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ int f4677i;
    public /* synthetic */ int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ I5.D0 f4678k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0(I5.D0 d4, p100l6.c cVar) {
        super(3, cVar);
        this.f4678k = d4;
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int iIntValue = ((java.lang.Number) obj).intValue();
        int iIntValue2 = ((java.lang.Number) obj2).intValue();
        I5.C0 c9 = new I5.C0(this.f4678k, (p100l6.c) obj3);
        c9.f4677i = iIntValue;
        c9.j = iIntValue2;
        return c9.invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f4676h;
        try {
            if (i3 == 0) {
                com.google.common.util.concurrent.P.u0(obj);
                int i9 = this.f4677i;
                int i10 = this.j;
                p005a5.C1451x5 c1451x5 = this.f4678k.f4695c;
                this.f4676h = 1;
                obj = c1451x5.v(i9, i10, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.common.util.concurrent.P.u0(obj);
            }
            return (com.kiptv.core.model.TMDBSeasonDetail) obj;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}

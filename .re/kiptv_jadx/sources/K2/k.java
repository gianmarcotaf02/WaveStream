package K2;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S2.h f6833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f6834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final S2.h f6836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final T2.h f6837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E2.g f6838f;
    public final boolean g;

    public k(S2.h hVar, java.util.List list, int i3, S2.h hVar2, T2.h hVar3, E2.g gVar, boolean z6) {
        this.f6833a = hVar;
        this.f6834b = list;
        this.f6835c = i3;
        this.f6836d = hVar2;
        this.f6837e = hVar3;
        this.f6838f = gVar;
        this.g = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(p117n6.c cVar) throws java.lang.Throwable {
        K2.j jVar;
        K2.h hVar;
        K2.k kVar;
        if (cVar instanceof K2.j) {
            jVar = (K2.j) cVar;
            int i3 = jVar.f6832l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f6832l = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new K2.j(this, cVar);
            }
        } else {
            jVar = new K2.j(this, cVar);
        }
        java.lang.Object obj = jVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = jVar.f6832l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.util.List list = this.f6834b;
            int i10 = this.f6835c;
            K2.h hVar2 = (K2.h) list.get(i10);
            K2.k kVar2 = new K2.k(this.f6833a, this.f6834b, i10 + 1, this.f6836d, this.f6837e, this.f6838f, this.g);
            jVar.f6829h = this;
            jVar.f6830i = hVar2;
            jVar.f6832l = 1;
            java.lang.Object objD = hVar2.d(kVar2, jVar);
            if (objD == aVar) {
                return aVar;
            }
            hVar = hVar2;
            obj = objD;
            kVar = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = jVar.f6830i;
            kVar = jVar.f6829h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        S2.k kVar3 = (S2.k) obj;
        S2.h request = kVar3.getRequest();
        kVar.getClass();
        android.content.Context context = request.f9253a;
        S2.h hVar3 = kVar.f6833a;
        if (context != hVar3.f9253a) {
            throw new java.lang.IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
        }
        if (request.f9254b == S2.m.f9283a) {
            throw new java.lang.IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        if (request.f9255c != hVar3.f9255c) {
            throw new java.lang.IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
        }
        if (request.f9265o == hVar3.f9265o) {
            return kVar3;
        }
        throw new java.lang.IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }
}

package O1;

/* JADX INFO: renamed from: O1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0753q extends p117n6.i implements p194x6.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f7855h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7856i;
    public /* synthetic */ java.lang.Object j;

    public /* synthetic */ C0753q(int i3, p100l6.c cVar) {
        super(i3, cVar);
    }

    @Override // p194x6.n
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        switch (this.f7855h) {
            case 0:
                return new O1.C0753q((O1.N) this.j, (p100l6.c) obj3).invokeSuspend(p070h6.A.f22523a);
            default:
                ((java.lang.Boolean) obj2).getClass();
                O1.C0753q c0753q = new O1.C0753q(3, (p100l6.c) obj3);
                c0753q.j = (Q1.c) obj;
                return c0753q.invokeSuspend(p070h6.A.f22523a);
        }
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        switch (this.f7855h) {
            case 0:
                p109m6.a aVar = p109m6.a.f25430h;
                int i3 = this.f7856i;
                if (i3 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    this.f7856i = 1;
                    if (O1.N.b((O1.N) this.j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                return p070h6.A.f22523a;
            default:
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i9 = this.f7856i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    return obj;
                }
                com.google.common.util.concurrent.P.u0(obj);
                Q1.c cVar = (Q1.c) this.j;
                this.f7856i = 1;
                cVar.getClass();
                java.lang.Object objA = Q1.c.a(cVar, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0753q(O1.N n3, p100l6.c cVar) {
        super(3, cVar);
        this.j = n3;
    }
}

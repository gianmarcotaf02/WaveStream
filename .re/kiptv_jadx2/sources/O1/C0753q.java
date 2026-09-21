package O1;

public final class C0753q extends p117n6.i implements p194x6.n {

    public final int f7855h = 1;

    public int f7856i;
    public Object j;

    public C0753q(int i3, p100l6.c cVar) {
        super(i3, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7855h) {
            case 0:
                return new C0753q((N) this.j, (p100l6.c) obj3).invokeSuspend(p070h6.A.f22523a);
            default:
                ((Boolean) obj2).getClass();
                C0753q c0753q = new C0753q(3, (p100l6.c) obj3);
                c0753q.j = (Q1.c) obj;
                return c0753q.invokeSuspend(p070h6.A.f22523a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.f7855h) {
            case 0:
                p109m6.a aVar = p109m6.a.f25430h;
                int i3 = this.f7856i;
                if (i3 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    this.f7856i = 1;
                    if (N.b((N) this.j, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                }
                return p070h6.A.f22523a;
            default:
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i9 = this.f7856i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj);
                    return obj;
                }
                com.google.common.util.concurrent.P.u0(obj);
                Q1.c cVar = (Q1.c) this.j;
                this.f7856i = 1;
                cVar.getClass();
                Object objA = Q1.c.a(cVar, this);
                return objA == aVar2 ? aVar2 : objA;
        }
    }

    public C0753q(N n3, p100l6.c cVar) {
        super(3, cVar);
        this.j = n3;
    }
}

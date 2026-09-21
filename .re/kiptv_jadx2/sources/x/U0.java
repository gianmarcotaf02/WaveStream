package x;

public final class U0 extends p117n6.i implements p194x6.m {

    public long f30810h;

    public int f30811i;
    public long j;

    public final W0 f30812k;

    public U0(W0 w6, p100l6.c cVar) {
        super(2, cVar);
        this.f30812k = w6;
    }

    @Override
    public final p100l6.c create(Object obj, p100l6.c cVar) {
        U0 u1 = new U0(this.f30812k, cVar);
        u1.j = ((p113n1.r) obj).f25573a;
        return u1;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        long j = ((p113n1.r) obj).f25573a;
        U0 u1 = new U0(this.f30812k, (p100l6.c) obj2);
        u1.j = j;
        return u1.invokeSuspend(p070h6.A.f22523a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        long j;
        long j9;
        long j10;
        long j11;
        long j12;
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f30811i;
        W0 w6 = this.f30812k;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            j = this.j;
            J0.d dVar = w6.f30824f;
            this.j = j;
            this.f30811i = 1;
            obj = dVar.b(j, this);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i3 == 1) {
            j = this.j;
            com.google.common.util.concurrent.P.u0(obj);
        } else {
            if (i3 == 2) {
                j9 = this.f30810h;
                j = this.j;
                com.google.common.util.concurrent.P.u0(obj);
                j10 = ((p113n1.r) obj).f25573a;
                J0.d dVar2 = w6.f30824f;
                long jD = p113n1.r.d(j9, j10);
                this.j = j;
                this.f30810h = j10;
                this.f30811i = 3;
                obj = dVar2.a(jD, j10, this);
                if (obj != aVar) {
                    j11 = j;
                    j12 = j10;
                }
                return aVar;
            }
            if (i3 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j12 = this.f30810h;
            j11 = this.j;
            com.google.common.util.concurrent.P.u0(obj);
        }
        return new p113n1.r(p113n1.r.d(j11, p113n1.r.d(j12, ((p113n1.r) obj).f25573a)));
        long jD2 = p113n1.r.d(j, ((p113n1.r) obj).f25573a);
        this.j = j;
        this.f30810h = jD2;
        this.f30811i = 2;
        obj = w6.a(jD2, this);
        if (obj != aVar) {
            j9 = jD2;
            j10 = ((p113n1.r) obj).f25573a;
            J0.d dVar3 = w6.f30824f;
            long jD3 = p113n1.r.d(j9, j10);
            this.j = j;
            this.f30810h = j10;
            this.f30811i = 3;
            obj = dVar3.a(jD3, j10, this);
            if (obj != aVar) {
                j11 = j;
                j12 = j10;
                return new p113n1.r(p113n1.r.d(j11, p113n1.r.d(j12, ((p113n1.r) obj).f25573a)));
            }
        }
        return aVar;
    }
}

package T4;

import com.google.common.util.concurrent.P;
import p070h6.A;

public final class g {
    public static final a Companion = new a();

    public final int f9831a;

    public final p028c8.d f9832b = new p028c8.d();

    public final e f9833c = new e(this);

    public g(int i3) {
        this.f9831a = i3;
    }

    public final Object a(p117n6.c cVar) {
        c cVar2;
        g gVar;
        p028c8.d dVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i3 = cVar2.f9818l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f9818l = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = cVar2.f9818l;
        if (i9 == 0) {
            P.u0(obj);
            cVar2.f9815h = this;
            p028c8.d dVar2 = this.f9832b;
            cVar2.f9816i = dVar2;
            cVar2.f9818l = 1;
            if (dVar2.e(cVar2) == aVar) {
                return aVar;
            }
            gVar = this;
            dVar = dVar2;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = cVar2.f9816i;
            gVar = cVar2.f9815h;
            P.u0(obj);
        }
        try {
            gVar.getClass();
            e eVar = gVar.f9833c;
            eVar.size();
            eVar.clear();
            return A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    public final Object b(String str, p117n6.c cVar) {
        d dVar;
        p028c8.d dVar2;
        g gVar;
        U4.a aVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i3 = dVar.f9823m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.f9823m = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object obj = dVar.f9821k;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = dVar.f9823m;
        if (i9 == 0) {
            P.u0(obj);
            dVar.f9819h = this;
            dVar.f9820i = str;
            dVar2 = this.f9832b;
            dVar.j = dVar2;
            dVar.f9823m = 1;
            if (dVar2.e(dVar) == aVar2) {
                return aVar2;
            }
            gVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar3 = dVar.j;
            String str2 = dVar.f9820i;
            gVar = dVar.f9819h;
            P.u0(obj);
            dVar2 = dVar3;
            str = str2;
        }
        try {
            b bVar = (b) gVar.f9833c.get(str);
            if (bVar == null) {
                aVar = null;
            } else if (System.currentTimeMillis() - bVar.f9814b >= 300000) {
                gVar.f9833c.remove(str);
                aVar = null;
            } else {
                aVar = bVar.f9813a;
            }
            return aVar;
        } finally {
            dVar2.g(null);
        }
    }

    public final Object c(String str, U4.a aVar, p117n6.c cVar) {
        f fVar;
        p028c8.d dVar;
        g gVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i3 = fVar.f9830n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f9830n = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.f9828l;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = fVar.f9830n;
        if (i9 == 0) {
            P.u0(obj);
            fVar.f9825h = this;
            fVar.f9826i = str;
            fVar.j = aVar;
            dVar = this.f9832b;
            fVar.f9827k = dVar;
            fVar.f9830n = 1;
            if (dVar.e(fVar) == aVar2) {
                return aVar2;
            }
            gVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = fVar.f9827k;
            aVar = fVar.j;
            String str2 = fVar.f9826i;
            gVar = fVar.f9825h;
            P.u0(obj);
            dVar = dVar2;
            str = str2;
        }
        try {
            e eVar = gVar.f9833c;
            int size = eVar.size();
            eVar.put(str, new b(aVar, System.currentTimeMillis()));
            if (size >= gVar.f9831a) {
                eVar.containsKey(str);
            }
            return A.f22523a;
        } finally {
            dVar.g(null);
        }
    }
}

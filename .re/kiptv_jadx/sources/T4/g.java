package T4;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final T4.a Companion = new T4.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p028c8.d f9832b = new p028c8.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T4.e f9833c = new T4.e(this);

    public g(int i3) {
        this.f9831a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(p117n6.c cVar) {
        T4.c cVar2;
        T4.g gVar;
        p028c8.d dVar;
        if (cVar instanceof T4.c) {
            cVar2 = (T4.c) cVar;
            int i3 = cVar2.f9818l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar2.f9818l = i3 - Integer.MIN_VALUE;
            } else {
                cVar2 = new T4.c(this, cVar);
            }
        } else {
            cVar2 = new T4.c(this, cVar);
        }
        java.lang.Object obj = cVar2.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = cVar2.f9818l;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = cVar2.f9816i;
            gVar = cVar2.f9815h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        try {
            gVar.getClass();
            T4.e eVar = gVar.f9833c;
            eVar.size();
            eVar.clear();
            return p070h6.A.f22523a;
        } finally {
            dVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object b(java.lang.String str, p117n6.c cVar) {
        T4.d dVar;
        p028c8.d dVar2;
        T4.g gVar;
        U4.a aVar;
        if (cVar instanceof T4.d) {
            dVar = (T4.d) cVar;
            int i3 = dVar.f9823m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dVar.f9823m = i3 - Integer.MIN_VALUE;
            } else {
                dVar = new T4.d(this, cVar);
            }
        } else {
            dVar = new T4.d(this, cVar);
        }
        java.lang.Object obj = dVar.f9821k;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = dVar.f9823m;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar3 = dVar.j;
            java.lang.String str2 = dVar.f9820i;
            gVar = dVar.f9819h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar2 = dVar3;
            str = str2;
        }
        try {
            T4.b bVar = (T4.b) gVar.f9833c.get(str);
            if (bVar == null) {
                aVar = null;
            } else if (java.lang.System.currentTimeMillis() - bVar.f9814b >= 300000) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(java.lang.String str, U4.a aVar, p117n6.c cVar) {
        T4.f fVar;
        p028c8.d dVar;
        T4.g gVar;
        if (cVar instanceof T4.f) {
            fVar = (T4.f) cVar;
            int i3 = fVar.f9830n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                fVar.f9830n = i3 - Integer.MIN_VALUE;
            } else {
                fVar = new T4.f(this, cVar);
            }
        } else {
            fVar = new T4.f(this, cVar);
        }
        java.lang.Object obj = fVar.f9828l;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = fVar.f9830n;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
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
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p028c8.d dVar2 = fVar.f9827k;
            aVar = fVar.j;
            java.lang.String str2 = fVar.f9826i;
            gVar = fVar.f9825h;
            com.google.common.util.concurrent.P.u0(obj);
            dVar = dVar2;
            str = str2;
        }
        try {
            T4.e eVar = gVar.f9833c;
            int size = eVar.size();
            eVar.put(str, new T4.b(aVar, java.lang.System.currentTimeMillis()));
            if (size >= gVar.f9831a) {
                eVar.containsKey(str);
            }
            return p070h6.A.f22523a;
        } finally {
            dVar.g(null);
        }
    }
}

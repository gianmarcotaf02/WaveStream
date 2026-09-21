package U;

/* JADX INFO: loaded from: classes.dex */
public final class X extends p117n6.i implements p194x6.m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ U.i0 f9953i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(U.i0 i0Var, p100l6.c cVar) {
        super(2, cVar);
        this.f9953i = i0Var;
    }

    @Override // p117n6.a
    public final p100l6.c create(java.lang.Object obj, p100l6.c cVar) {
        U.X x9 = new U.X(this.f9953i, cVar);
        long j = ((p181w0.a) obj).f29744a;
        return x9;
    }

    @Override // p194x6.m
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long j = ((p181w0.a) obj).f29744a;
        return new U.X(this.f9953i, (p100l6.c) obj2).invokeSuspend(p070h6.A.f22523a);
    }

    @Override // p117n6.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) throws java.lang.Throwable {
        java.lang.Object objK;
        p109m6.a aVar = p109m6.a.f25430h;
        int i3 = this.f9952h;
        p070h6.A a2 = p070h6.A.f22523a;
        U.i0 i0Var = this.f9953i;
        if (i3 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            this.f9952h = 1;
            if (i0Var.s(this) != aVar) {
            }
            return aVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        com.google.common.util.concurrent.P.u0(obj);
        p070h6.k kVarA = U.i0.a(i0Var);
        if (kVarA != null) {
            java.lang.String str = (java.lang.String) kVarA.f22539h;
            long j = ((p011b1.L) kVarA.f22540i).f17784a;
            U.C0945s c0945s = i0Var.j;
            if (c0945s != null) {
                this.f9952h = 2;
                if (str.length() == 0 || p011b1.L.c(j)) {
                    objK = a2;
                } else {
                    objK = S7.C.K(c0945s.f10072a, new U.C0943p(c0945s, new U.C0940m(c0945s, str, j, null), null), this);
                }
                if (objK != aVar) {
                    objK = a2;
                }
                if (objK == aVar) {
                    return aVar;
                }
            }
        }
        return a2;
    }
}

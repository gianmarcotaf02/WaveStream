package R0;

/* JADX INFO: loaded from: classes.dex */
public final class T implements S7.A {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.view.View f8846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g1.y f8847i;
    public final S7.A j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f8848k = new java.util.concurrent.atomic.AtomicReference(null);

    public T(android.view.View view, g1.y yVar, S7.A a2) {
        this.f8846h = view;
        this.f8847i = yVar;
        this.j = a2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(S.x xVar, p117n6.c cVar) {
        R0.Q q9;
        if (cVar instanceof R0.Q) {
            q9 = (R0.Q) cVar;
            int i3 = q9.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9.j = i3 - Integer.MIN_VALUE;
            } else {
                q9 = new R0.Q(this, cVar);
            }
        } else {
            q9 = new R0.Q(this, cVar);
        }
        java.lang.Object obj = q9.f8840h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q9.j;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.util.concurrent.atomic.AtomicReference atomicReference = this.f8848k;
            K0.D d4 = new K0.D(xVar, this, 4);
            R0.S s9 = new R0.S(this, null);
            q9.j = 1;
            if (S7.C.m(new p137q0.s(d4, atomicReference, s9, null), q9) == aVar) {
                return;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
        }
        throw new I3.b();
    }

    @Override // S7.A
    public final p100l6.h getCoroutineContext() {
        return this.j.getCoroutineContext();
    }
}

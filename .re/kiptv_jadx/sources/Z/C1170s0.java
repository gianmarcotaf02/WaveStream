package Z;

/* JADX INFO: renamed from: Z.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1170s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p028c8.d f12500a = new p028c8.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p020c0.C1681g0 f12501b = p020c0.AbstractC1703s.y(null);

    public static java.lang.Object b(Z.C1170s0 c1170s0, java.lang.String str, p117n6.i iVar) {
        c1170s0.getClass();
        return c1170s0.a(new Z.C1167q0(str, 1), iVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object a(Z.C1167q0 c1167q0, p117n6.c cVar) {
        Z.C1168r0 c1168r0;
        Z.C1170s0 c1170s0;
        p028c8.a aVar;
        Z.C1167q0 c1167q1;
        java.lang.Throwable th;
        Z.C1170s0 c1170s1;
        p028c8.a aVar2;
        if (cVar instanceof Z.C1168r0) {
            c1168r0 = (Z.C1168r0) cVar;
            int i3 = c1168r0.f12491m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1168r0.f12491m = i3 - Integer.MIN_VALUE;
            } else {
                c1168r0 = new Z.C1168r0(this, cVar);
            }
        } else {
            c1168r0 = new Z.C1168r0(this, cVar);
        }
        java.lang.Object obj = c1168r0.f12489k;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i9 = c1168r0.f12491m;
        try {
            try {
                if (i9 == 0) {
                    com.google.common.util.concurrent.P.u0(obj);
                    c1168r0.f12487h = this;
                    c1168r0.f12488i = c1167q0;
                    p028c8.d dVar = this.f12500a;
                    c1168r0.j = dVar;
                    c1168r0.f12491m = 1;
                    if (dVar.e(c1168r0) != aVar3) {
                        c1170s0 = this;
                        c1167q1 = c1167q0;
                        aVar = dVar;
                    }
                    return aVar3;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p028c8.a aVar4 = c1168r0.j;
                    c1170s1 = c1168r0.f12487h;
                    try {
                        com.google.common.util.concurrent.P.u0(obj);
                        aVar2 = aVar4;
                        c1170s1.f12501b.setValue(null);
                        ((p028c8.d) aVar2).g(null);
                        return obj;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        c1170s1.f12501b.setValue(null);
                        throw th;
                    }
                }
                p028c8.a aVar5 = c1168r0.j;
                Z.C1167q0 c1167q2 = c1168r0.f12488i;
                c1170s0 = c1168r0.f12487h;
                com.google.common.util.concurrent.P.u0(obj);
                aVar = aVar5;
                c1167q1 = c1167q2;
                c1168r0.f12487h = c1170s0;
                c1168r0.f12488i = c1167q1;
                c1168r0.j = aVar;
                c1168r0.f12491m = 2;
                S7.C0895k c0895k = new S7.C0895k(1, com.google.common.util.concurrent.P.h0(c1168r0));
                c0895k.r();
                c1170s0.f12501b.setValue(new Z.C1165p0(c1167q1, c0895k));
                java.lang.Object objQ = c0895k.q();
                if (objQ != aVar3) {
                    p028c8.a aVar6 = aVar;
                    obj = objQ;
                    aVar2 = aVar6;
                    c1170s1 = c1170s0;
                    c1170s1.f12501b.setValue(null);
                    ((p028c8.d) aVar2).g(null);
                    return obj;
                }
                return aVar3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                c1170s1 = c1170s0;
                c1170s1.f12501b.setValue(null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            ((p028c8.d) c1167q0).g(null);
            throw th4;
        }
    }
}

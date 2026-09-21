package p019c;

import p194x6.j;

public final class o extends kotlin.jvm.internal.o implements j {

    public final int f18075h;

    public final u f18076i;

    public o(u uVar, int i3) {
        super(1);
        this.f18075h = i3;
        this.f18076i = uVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v5 java.lang.Object, still in use, count: 2, list:
          (r2v5 java.lang.Object) from 0x005f: PHI (r2 I:??) = (r2v2 java.lang.Object), (r2v5 java.lang.Object) binds: [B:24:0x005e, B:37:0x005f] A[DONT_GENERATE, DONT_INLINE]
          (r2v5 java.lang.Object) from 0x0057: CHECK_CAST (c.n) (r2v5 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override
    public final java.lang.Object invoke(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.f18075h
            switch(r0) {
                case 0: goto L39;
                default: goto L5;
            }
        L5:
            c.a r5 = (p019c.a) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.m.e(r5, r0)
            c.u r0 = r4.f18076i
            c.n r1 = r0.f18092c
            if (r1 != 0) goto L31
            i6.l r0 = r0.f18091b
            int r1 = r0.d()
            java.util.ListIterator r0 = r0.listIterator(r1)
        L1c:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.previous()
            r2 = r1
            c.n r2 = (p019c.n) r2
            boolean r2 = r2.f18072a
            if (r2 == 0) goto L1c
            goto L2f
        L2e:
            r1 = 0
        L2f:
            c.n r1 = (p019c.n) r1
        L31:
            if (r1 == 0) goto L36
            r1.c(r5)
        L36:
            h6.A r5 = p070h6.A.f22523a
            return r5
        L39:
            c.a r5 = (p019c.a) r5
            java.lang.String r0 = "backEvent"
            kotlin.jvm.internal.m.e(r5, r0)
            c.u r0 = r4.f18076i
            i6.l r1 = r0.f18091b
            int r2 = r1.d()
            java.util.ListIterator r1 = r1.listIterator(r2)
        L4c:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L5e
            java.lang.Object r2 = r1.previous()
            r3 = r2
            c.n r3 = (p019c.n) r3
            boolean r3 = r3.f18072a
            if (r3 == 0) goto L4c
            goto L5f
        L5e:
            r2 = 0
        L5f:
            c.n r2 = (p019c.n) r2
            c.n r1 = r0.f18092c
            if (r1 == 0) goto L68
            r0.b()
        L68:
            r0.f18092c = r2
            if (r2 == 0) goto L6f
            r2.d(r5)
        L6f:
            h6.A r5 = p070h6.A.f22523a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p019c.o.invoke(java.lang.Object):java.lang.Object");
    }
}

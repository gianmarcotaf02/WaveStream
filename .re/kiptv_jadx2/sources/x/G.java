package x;

import K0.C0667o;
import K0.C0669q;

public abstract class G {

    public static final float f30721a = ((float) 0.125d) / 18;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(K0.S r17, long r18, p117n6.c r20) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.G.a(K0.S, long, n6.c):java.lang.Object");
    }

    public static final Object b(K0.S s9, long j, p117n6.c cVar) {
        B b9;
        Object obj;
        K0.x xVar;
        kotlin.jvm.internal.w wVar;
        if (cVar instanceof B) {
            b9 = (B) cVar;
            int i3 = b9.f30678l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                b9.f30678l = i3 - Integer.MIN_VALUE;
            } else {
                b9 = new B(cVar);
            }
        } else {
            b9 = new B(cVar);
        }
        Object obj2 = b9.f30677k;
        Object obj3 = p109m6.a.f25430h;
        int i9 = b9.f30678l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj2);
                if (!e(s9.f6674m.f6685z, j)) {
                    ?? r12 = s9.f6674m.f6685z.f6724a;
                    int size = r12.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            obj = null;
                            break;
                        }
                        obj = r12.get(i10);
                        if (K0.w.e(((K0.x) obj).f6738a, j)) {
                            break;
                        }
                        i10++;
                    }
                    xVar = (K0.x) obj;
                    if (xVar != null) {
                        kotlin.jvm.internal.A a2 = new kotlin.jvm.internal.A();
                        kotlin.jvm.internal.A a9 = new kotlin.jvm.internal.A();
                        a9.f24539h = xVar;
                        long jB = s9.c().b();
                        kotlin.jvm.internal.w wVar2 = new kotlin.jvm.internal.w();
                        p194x6.m c9 = new C(wVar2, a9, a2, null);
                        b9.f30675h = xVar;
                        b9.f30676i = a2;
                        b9.j = wVar2;
                        b9.f30678l = 1;
                        if (s9.f(jB, c9, b9) == obj3) {
                            return obj3;
                        }
                        wVar = wVar2;
                        j = a2;
                    }
                }
                return null;
            }
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = b9.j;
            kotlin.jvm.internal.A a10 = b9.f30676i;
            xVar = b9.f30675h;
            com.google.common.util.concurrent.P.u0(obj2);
            j = a10;
            if (wVar.f24553h) {
                K0.x xVar2 = (K0.x) j.f24539h;
                return xVar2 == null ? xVar : xVar2;
            }
            return null;
        } catch (C0669q unused) {
            K0.x xVar3 = (K0.x) j.f24539h;
            return xVar3 == null ? xVar : xVar3;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(K0.S r21, long r22, B.d0 r24, p117n6.a r25) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.G.c(K0.S, long, B.d0, n6.a):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(K0.S r4, long r5, p194x6.j r7, p117n6.c r8) {
        /*
            boolean r0 = r8 instanceof x.F
            if (r0 == 0) goto L13
            r0 = r8
            x.F r0 = (x.F) r0
            int r1 = r0.f30716k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30716k = r1
            goto L18
        L13:
            x.F r0 = new x.F
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.j
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.f30716k
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            x6.j r4 = r0.f30715i
            K0.S r5 = r0.f30714h
            com.google.common.util.concurrent.P.u0(r8)
            r7 = r4
            r4 = r5
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            com.google.common.util.concurrent.P.u0(r8)
        L38:
            r0.f30714h = r4
            r0.f30715i = r7
            r0.f30716k = r3
            java.lang.Object r8 = a(r4, r5, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            K0.x r8 = (K0.x) r8
            if (r8 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            boolean r5 = K0.w.d(r8)
            if (r5 == 0) goto L55
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L55:
            r7.invoke(r8)
            long r5 = r8.f6738a
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: x.G.d(K0.S, long, x6.j, n6.c):java.lang.Object");
    }

    public static final boolean e(C0667o c0667o, long j) {
        Object obj;
        ?? r9 = c0667o.f6724a;
        int size = r9.size();
        boolean z6 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = r9.get(i3);
            if (K0.w.e(((K0.x) obj).f6738a, j)) {
                break;
            }
            i3++;
        }
        K0.x xVar = (K0.x) obj;
        if (xVar != null && xVar.f6741d) {
            z6 = true;
        }
        return true ^ z6;
    }

    public static final float f(R0.V0 v6, int i3) {
        return i3 == 2 ? v6.f() * f30721a : v6.f();
    }
}

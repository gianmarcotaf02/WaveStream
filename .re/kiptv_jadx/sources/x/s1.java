package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x.N f31004a = new x.N(3, null, 2);

    /* JADX WARN: Code duplicated, block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(K0.S r5, boolean r6, K0.EnumC0668p r7, p117n6.a r8) {
        /*
            boolean r0 = r8 instanceof x.X0
            if (r0 == 0) goto L13
            r0 = r8
            x.X0 r0 = (x.X0) r0
            int r1 = r0.f30834l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30834l = r1
            goto L18
        L13:
            x.X0 r0 = new x.X0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f30833k
            m6.a r1 = p109m6.a.f25430h
            int r2 = r0.f30834l
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            boolean r5 = r0.j
            K0.p r6 = r0.f30832i
            K0.S r7 = r0.f30831h
            com.google.common.util.concurrent.P.u0(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.google.common.util.concurrent.P.u0(r8)
        L3c:
            r0.f30831h = r5
            r0.f30832i = r7
            r0.j = r6
            r0.f30834l = r3
            java.lang.Object r8 = r5.a(r7, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            K0.o r8 = (K0.C0667o) r8
            boolean r2 = c(r8, r6)
            if (r2 == 0) goto L3c
            java.lang.Object r5 = r8.f6724a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x.s1.a(K0.S, boolean, K0.p, n6.a):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static boolean c(K0.C0667o c0667o, boolean z6) {
        ?? r9 = c0667o.f6724a;
        int size = r9.size();
        for (int i3 = 0; i3 < size; i3++) {
            K0.x xVar = (K0.x) r9.get(i3);
            if (!(z6 ? K0.w.a(xVar) : K0.w.b(xVar))) {
                return false;
            }
        }
        return true;
    }

    public static S7.w0 d(S7.A a2, S7.InterfaceC0891h0 interfaceC0891h0, p194x6.m mVar) {
        S7.B b9 = S7.B.f9521h;
        return S7.C.A(a2, null, new x.q1(interfaceC0891h0, mVar, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2 A[LOOP:1: B:23:0x006f->B:46:0x00d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ca A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:13:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:25:0x0073
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(K0.S r17, K0.EnumC0668p r18, p117n6.a r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.s1.e(K0.S, K0.p, n6.a):java.lang.Object");
    }
}

package p193x5;

/* JADX INFO: renamed from: x5.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C3140s implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f31614h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ S4.p f31615i;
    public final /* synthetic */ p194x6.j j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p193x5.s1 f31616k;

    public /* synthetic */ C3140s(S4.p pVar, p194x6.j jVar, p193x5.s1 s1Var) {
        this.f31615i = pVar;
        this.j = jVar;
        this.f31616k = s1Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v7 java.lang.Object, still in use, count: 2, list:
          (r3v7 java.lang.Object) from 0x002b: PHI (r3 I:??) = (r3v4 java.lang.Object), (r3v7 java.lang.Object) binds: [B:12:0x002a, B:30:0x002b] A[DONT_GENERATE, DONT_INLINE]
          (r3v7 java.lang.Object) from 0x001f: CHECK_CAST (S4.f) (r3v7 java.lang.Object)
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
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            r5 = this;
            int r0 = r5.f31614h
            switch(r0) {
                case 0: goto L63;
                default: goto L5;
            }
        L5:
            S4.p r0 = r5.f31615i
            r1 = 0
            if (r0 == 0) goto L32
            java.util.List r2 = r0.f9431c
            int r3 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r3)
        L14:
            boolean r3 = r2.hasPrevious()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r2.previous()
            r4 = r3
            S4.f r4 = (S4.C0867f) r4
            com.kiptv.core.model.XtreamLiveStream r4 = r4.f9387a
            boolean r4 = r4.a()
            if (r4 == 0) goto L14
            goto L2b
        L2a:
            r3 = r1
        L2b:
            S4.f r3 = (S4.C0867f) r3
            if (r3 == 0) goto L32
            com.kiptv.core.model.XtreamLiveStream r2 = r3.f9387a
            goto L33
        L32:
            r2 = r1
        L33:
            if (r0 == 0) goto L49
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "group:"
            r3.<init>(r4)
            int r4 = r0.f9429a
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            x5.s1 r4 = r5.f31616k
            r4.f31628o = r3
        L49:
            if (r2 != 0) goto L53
            if (r0 == 0) goto L52
            com.kiptv.core.model.XtreamLiveStream r2 = r0.e()
            goto L53
        L52:
            r2 = r1
        L53:
            if (r2 == 0) goto L5b
            int r0 = r2.f20657d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L5b:
            x6.j r0 = r5.j
            r0.invoke(r1)
            h6.A r0 = p070h6.A.f22523a
            return r0
        L63:
            x5.s1 r0 = r5.f31616k
            S4.p r1 = r5.f31615i
            x6.j r2 = r5.j
            r0.s(r1, r2)
            h6.A r0 = p070h6.A.f22523a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p193x5.C3140s.invoke():java.lang.Object");
    }

    public /* synthetic */ C3140s(p193x5.s1 s1Var, S4.p pVar, p194x6.j jVar) {
        this.f31616k = s1Var;
        this.f31615i = pVar;
        this.j = jVar;
    }
}

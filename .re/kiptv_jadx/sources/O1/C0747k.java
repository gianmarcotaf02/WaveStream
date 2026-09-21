package O1;

/* JADX INFO: renamed from: O1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p028c8.a f7836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f7837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.A f7838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O1.N f7839d;

    public C0747k(p028c8.a aVar, kotlin.jvm.internal.w wVar, kotlin.jvm.internal.A a2, O1.N n3) {
        this.f7836a = aVar;
        this.f7837b = wVar;
        this.f7838c = a2;
        this.f7839d = n3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:36:0x00ae, B:38:0x00b6), top: B:53:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(O1.C0743g c0743g, p117n6.c cVar) throws java.lang.Throwable {
        O1.C0746j c0746j;
        O1.N n3;
        kotlin.jvm.internal.w wVar;
        kotlin.jvm.internal.A a2;
        p028c8.a aVar;
        p194x6.m mVar;
        p028c8.a aVar2;
        p028c8.a aVar3;
        O1.N n9;
        java.lang.Object obj;
        kotlin.jvm.internal.A a9;
        p028c8.a aVar4;
        if (cVar instanceof O1.C0746j) {
            c0746j = (O1.C0746j) cVar;
            int i3 = c0746j.f7835o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c0746j.f7835o = i3 - Integer.MIN_VALUE;
            } else {
                c0746j = new O1.C0746j(this, cVar);
            }
        } else {
            c0746j = new O1.C0746j(this, cVar);
        }
        java.lang.Object obj2 = c0746j.f7833m;
        p109m6.a aVar5 = p109m6.a.f25430h;
        int i9 = c0746j.f7835o;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(obj2);
                c0746j.f7829h = c0743g;
                p028c8.a aVar6 = this.f7836a;
                c0746j.f7830i = aVar6;
                kotlin.jvm.internal.w wVar2 = this.f7837b;
                c0746j.j = wVar2;
                kotlin.jvm.internal.A a10 = this.f7838c;
                c0746j.f7831k = a10;
                n3 = this.f7839d;
                c0746j.f7832l = n3;
                c0746j.f7835o = 1;
                p028c8.d dVar = (p028c8.d) aVar6;
                if (dVar.e(c0746j) != aVar5) {
                    wVar = wVar2;
                    a2 = a10;
                    mVar = c0743g;
                    aVar = dVar;
                }
                return aVar5;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c0746j.j;
                    a9 = (kotlin.jvm.internal.A) c0746j.f7830i;
                    aVar2 = (p028c8.a) c0746j.f7829h;
                    try {
                        com.google.common.util.concurrent.P.u0(obj2);
                        aVar4 = aVar2;
                        a9.f24539h = obj;
                        a2 = a9;
                        aVar2 = aVar4;
                        java.lang.Object obj3 = a2.f24539h;
                        ((p028c8.d) aVar2).g(null);
                        return obj3;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        ((p028c8.d) aVar2).g(null);
                        throw th;
                    }
                }
                n9 = (O1.N) c0746j.j;
                a2 = (kotlin.jvm.internal.A) c0746j.f7830i;
                aVar3 = (p028c8.a) c0746j.f7829h;
                try {
                    com.google.common.util.concurrent.P.u0(obj2);
                    aVar3 = aVar3;
                    if (!kotlin.jvm.internal.m.a(obj2, a2.f24539h)) {
                        c0746j.f7829h = aVar3;
                        c0746j.f7830i = a2;
                        c0746j.j = obj2;
                        c0746j.f7835o = 3;
                        if (n9.j(obj2, false, c0746j) != aVar5) {
                            obj = obj2;
                            a9 = a2;
                            aVar4 = aVar3;
                            a9.f24539h = obj;
                            a2 = a9;
                            aVar2 = aVar4;
                        }
                        return aVar5;
                    }
                    aVar2 = aVar3;
                    java.lang.Object obj4 = a2.f24539h;
                    ((p028c8.d) aVar2).g(null);
                    return obj4;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    aVar2 = aVar3;
                    ((p028c8.d) aVar2).g(null);
                    throw th;
                }
            }
            O1.N n10 = c0746j.f7832l;
            a2 = c0746j.f7831k;
            wVar = (kotlin.jvm.internal.w) c0746j.j;
            p028c8.a aVar7 = (p028c8.a) c0746j.f7830i;
            p194x6.m mVar2 = (p194x6.m) c0746j.f7829h;
            com.google.common.util.concurrent.P.u0(obj2);
            n3 = n10;
            mVar = mVar2;
            aVar = aVar7;
            if (wVar.f24553h) {
                throw new java.lang.IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            java.lang.Object obj5 = a2.f24539h;
            c0746j.f7829h = aVar;
            c0746j.f7830i = a2;
            c0746j.j = n3;
            c0746j.f7831k = null;
            c0746j.f7832l = null;
            c0746j.f7835o = 2;
            java.lang.Object objInvoke = mVar.invoke(obj5, c0746j);
            if (objInvoke != aVar5) {
                aVar3 = aVar;
                obj2 = objInvoke;
                n9 = n3;
                if (!kotlin.jvm.internal.m.a(obj2, a2.f24539h)) {
                    c0746j.f7829h = aVar3;
                    c0746j.f7830i = a2;
                    c0746j.j = obj2;
                    c0746j.f7835o = 3;
                    if (n9.j(obj2, false, c0746j) != aVar5) {
                        obj = obj2;
                        a9 = a2;
                        aVar4 = aVar3;
                        a9.f24539h = obj;
                        a2 = a9;
                        aVar2 = aVar4;
                    }
                } else {
                    aVar2 = aVar3;
                }
                java.lang.Object obj6 = a2.f24539h;
                ((p028c8.d) aVar2).g(null);
                return obj6;
            }
            return aVar5;
        } catch (java.lang.Throwable th3) {
            th = th3;
            aVar2 = aVar;
            ((p028c8.d) aVar2).g(null);
            throw th;
        }
    }
}

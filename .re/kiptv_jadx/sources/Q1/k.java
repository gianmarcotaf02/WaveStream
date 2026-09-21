package Q1;

/* JADX INFO: loaded from: classes.dex */
public final class k extends Q1.c {
    /* JADX WARN: Code duplicated, block: B:72:0x009f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object b(java.lang.Object obj, p117n6.c cVar) throws java.lang.Throwable {
        Q1.j jVar;
        M8.v vVar;
        M8.v vVar2;
        java.lang.Throwable th;
        M8.D d4;
        M8.v vVar3;
        p070h6.A a2;
        java.lang.Throwable th2;
        M8.v vVar4;
        p070h6.A a9;
        if (cVar instanceof Q1.j) {
            jVar = (Q1.j) cVar;
            int i3 = jVar.f8529m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f8529m = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new Q1.j(this, cVar);
            }
        } else {
            jVar = new Q1.j(this, cVar);
        }
        java.lang.Object obj2 = jVar.f8527k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = jVar.f8529m;
        p070h6.A a10 = p070h6.A.f22523a;
        java.lang.Throwable th3 = null;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj2);
            if (this.f8498c.f8491a.get()) {
                throw new java.lang.IllegalStateException("This scope has already been closed.");
            }
            M8.w wVar = this.f8496a;
            wVar.getClass();
            M8.A file = this.f8497b;
            kotlin.jvm.internal.m.e(file, "file");
            wVar.getClass();
            kotlin.jvm.internal.m.e(file, "file");
            vVar = new M8.v(true, new java.io.RandomAccessFile(file.f(), "rw"));
            try {
                M8.D dB = M8.AbstractC0674b.b(M8.v.b(vVar));
                try {
                    S1.i iVar = S1.i.f9209a;
                    jVar.f8525h = vVar;
                    jVar.f8526i = vVar;
                    jVar.j = dB;
                    jVar.f8529m = 1;
                    iVar.b(obj, dB);
                    if (a10 == aVar) {
                        return aVar;
                    }
                    vVar2 = vVar;
                    vVar3 = vVar2;
                    d4 = dB;
                } catch (java.lang.Throwable th4) {
                    vVar2 = vVar;
                    th = th4;
                    d4 = dB;
                    if (d4 != null) {
                        d4.close();
                    }
                    th2 = th;
                    vVar4 = vVar2;
                    a9 = null;
                }
            } catch (java.lang.Throwable th5) {
                th = th5;
                if (vVar != null) {
                    vVar.close();
                }
                th3 = th;
                a2 = null;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4 = jVar.j;
            vVar3 = jVar.f8526i;
            vVar2 = jVar.f8525h;
            try {
                com.google.common.util.concurrent.P.u0(obj2);
            } catch (java.lang.Throwable th6) {
                th = th6;
                if (d4 != null) {
                    try {
                        d4.close();
                    } catch (java.lang.Throwable th7) {
                        try {
                            com.google.common.util.concurrent.AbstractC1903s.j(th, th7);
                        } catch (java.lang.Throwable th8) {
                            th = th8;
                            vVar = vVar2;
                            if (vVar != null) {
                                try {
                                    vVar.close();
                                } catch (java.lang.Throwable th9) {
                                    com.google.common.util.concurrent.AbstractC1903s.j(th, th9);
                                }
                            }
                            th3 = th;
                            a2 = null;
                        }
                    }
                }
                th2 = th;
                vVar4 = vVar2;
                a9 = null;
            }
        }
        vVar3.flush();
        if (d4 != null) {
            try {
                d4.close();
            } catch (java.lang.Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        vVar4 = vVar2;
        a9 = a10;
        if (th2 != null) {
            throw th2;
        }
        kotlin.jvm.internal.m.b(a9);
        if (vVar4 != null) {
            try {
                vVar4.close();
            } catch (java.lang.Throwable th11) {
                th3 = th11;
            }
        }
        a2 = a10;
        if (th3 != null) {
            throw th3;
        }
        kotlin.jvm.internal.m.b(a2);
        return a10;
    }
}

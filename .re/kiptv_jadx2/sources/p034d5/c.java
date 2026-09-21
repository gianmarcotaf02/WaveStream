package p034d5;

import I3.b;
import com.google.common.util.concurrent.P;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import p028c8.d;
import p109m6.a;
import p194x6.j;

public final class c {

    public int f21238a;

    public long f21239b;

    public final d f21240c;

    public Serializable f21241d;

    public c(int i3, long j) {
        this.f21238a = i3;
        this.f21239b = j;
        this.f21240c = new d();
        this.f21241d = new ArrayList();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(p117n6.c r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p034d5.c.a(n6.c):java.lang.Object");
    }

    public Object b(j jVar, p117n6.c cVar) {
        b bVar;
        d dVar;
        c cVar2;
        Exception e6;
        c cVar3;
        d dVar2;
        c cVar4;
        d dVar3;
        Object obj;
        d dVar4;
        c cVar5;
        Exception exc;
        d dVar5;
        int i3;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i9 = bVar.f21237m;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f21237m = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objInvoke = bVar.f21235k;
        a aVar = a.f25430h;
        int i10 = bVar.f21237m;
        try {
            try {
                try {
                    if (i10 == 0) {
                        P.u0(objInvoke);
                        bVar.f21233h = this;
                        bVar.f21234i = jVar;
                        dVar = this.f21240c;
                        bVar.j = dVar;
                        bVar.f21237m = 1;
                        if (dVar.e(bVar) != aVar) {
                            cVar2 = this;
                        }
                        return aVar;
                    }
                    if (i10 != 1) {
                        if (i10 == 2) {
                            cVar3 = bVar.f21233h;
                            try {
                                P.u0(objInvoke);
                                dVar2 = cVar3.f21240c;
                                bVar.f21233h = cVar3;
                                bVar.f21234i = objInvoke;
                                bVar.j = dVar2;
                                bVar.f21237m = 3;
                                if (dVar2.e(bVar) != aVar) {
                                    cVar4 = cVar3;
                                    dVar3 = dVar2;
                                    obj = objInvoke;
                                }
                            } catch (Exception e9) {
                                e6 = e9;
                                dVar4 = cVar3.f21240c;
                                bVar.f21233h = cVar3;
                                bVar.f21234i = e6;
                                bVar.j = dVar4;
                                bVar.f21237m = 4;
                                if (dVar4.e(bVar) != aVar) {
                                    cVar5 = cVar3;
                                    exc = e6;
                                    dVar5 = dVar4;
                                    i3 = cVar5.f21238a + 1;
                                    cVar5.f21238a = i3;
                                    if (i3 >= 5) {
                                        cVar5.f21241d = a.f21231i;
                                        cVar5.f21239b = System.currentTimeMillis();
                                    }
                                    throw exc;
                                }
                            }
                            return aVar;
                        }
                        if (i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            dVar5 = bVar.j;
                            exc = (Exception) bVar.f21234i;
                            cVar5 = bVar.f21233h;
                            P.u0(objInvoke);
                            try {
                                i3 = cVar5.f21238a + 1;
                                cVar5.f21238a = i3;
                                if (i3 >= 5) {
                                    cVar5.f21241d = a.f21231i;
                                    cVar5.f21239b = System.currentTimeMillis();
                                }
                                throw exc;
                            } finally {
                                dVar5.g(null);
                            }
                        }
                        dVar3 = bVar.j;
                        obj = bVar.f21234i;
                        cVar4 = bVar.f21233h;
                        try {
                            P.u0(objInvoke);
                        } catch (Exception e10) {
                            e6 = e10;
                            cVar3 = cVar4;
                            dVar4 = cVar3.f21240c;
                            bVar.f21233h = cVar3;
                            bVar.f21234i = e6;
                            bVar.j = dVar4;
                            bVar.f21237m = 4;
                            if (dVar4.e(bVar) != aVar) {
                                cVar5 = cVar3;
                                exc = e6;
                                dVar5 = dVar4;
                                i3 = cVar5.f21238a + 1;
                                cVar5.f21238a = i3;
                                if (i3 >= 5) {
                                    cVar5.f21241d = a.f21231i;
                                    cVar5.f21239b = System.currentTimeMillis();
                                }
                                throw exc;
                            }
                            return aVar;
                        }
                        try {
                            cVar4.f21238a = 0;
                            cVar4.f21241d = a.f21230h;
                            return obj;
                        } finally {
                            dVar3.g(null);
                        }
                    }
                    d dVar6 = bVar.j;
                    j jVar2 = (j) bVar.f21234i;
                    cVar2 = bVar.f21233h;
                    P.u0(objInvoke);
                    dVar = dVar6;
                    jVar = jVar2;
                    bVar.f21233h = cVar2;
                    bVar.f21234i = null;
                    bVar.j = null;
                    bVar.f21237m = 2;
                    objInvoke = jVar.invoke(bVar);
                    if (objInvoke != aVar) {
                        cVar3 = cVar2;
                        dVar2 = cVar3.f21240c;
                        bVar.f21233h = cVar3;
                        bVar.f21234i = objInvoke;
                        bVar.j = dVar2;
                        bVar.f21237m = 3;
                        if (dVar2.e(bVar) != aVar) {
                            cVar4 = cVar3;
                            dVar3 = dVar2;
                            obj = objInvoke;
                            cVar4.f21238a = 0;
                            cVar4.f21241d = a.f21230h;
                            return obj;
                        }
                    }
                } catch (Exception e11) {
                    e6 = e11;
                    cVar3 = cVar2;
                    dVar4 = cVar3.f21240c;
                    bVar.f21233h = cVar3;
                    bVar.f21234i = e6;
                    bVar.j = dVar4;
                    bVar.f21237m = 4;
                    if (dVar4.e(bVar) != aVar) {
                        cVar5 = cVar3;
                        exc = e6;
                        dVar5 = dVar4;
                        i3 = cVar5.f21238a + 1;
                        cVar5.f21238a = i3;
                        if (i3 >= 5) {
                            cVar5.f21241d = a.f21231i;
                            cVar5.f21239b = System.currentTimeMillis();
                        }
                        throw exc;
                    }
                }
                int iOrdinal = ((a) cVar2.f21241d).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new b();
                        }
                    } else {
                        if (System.currentTimeMillis() - cVar2.f21239b < 30000) {
                            throw new d("Service TMDB temporarily unavailable");
                        }
                        cVar2.f21241d = a.j;
                    }
                }
                dVar.g(null);
                return aVar;
            } catch (Throwable th) {
                dVar.g(null);
                throw th;
            }
        } catch (CancellationException e12) {
            throw e12;
        }
    }

    public c() {
        this.f21240c = new d();
        this.f21241d = a.f21230h;
    }
}

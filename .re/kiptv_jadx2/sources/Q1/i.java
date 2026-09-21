package Q1;

import M8.A;
import M8.w;
import O1.C0753q;
import O1.InterfaceC0737a;
import O1.M;
import O1.X;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import com.revenuecat.purchases.common.networking.ETagPayloadStore;
import java.io.IOException;
import kotlin.jvm.internal.m;

public final class i implements InterfaceC0737a {

    public final w f8519a;

    public final A f8520b;

    public final X f8521c;

    public final e f8522d;

    public final a f8523e;

    public final p028c8.d f8524f;

    public i(w fileSystem, A path, X coordinator, e eVar) {
        m.e(fileSystem, "fileSystem");
        m.e(path, "path");
        m.e(coordinator, "coordinator");
        this.f8519a = fileSystem;
        this.f8520b = path;
        this.f8521c = coordinator;
        this.f8522d = eVar;
        this.f8523e = new a();
        this.f8524f = new p028c8.d();
    }

    public final Object a(C0753q c0753q, p117n6.c cVar) throws Throwable {
        ?? gVar;
        Throwable th;
        c cVar2;
        ?? r9;
        ?? r10;
        if (cVar instanceof g) {
            g gVar2 = (g) cVar;
            int i3 = gVar2.f8512m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar2.f8512m = i3 - Integer.MIN_VALUE;
                gVar = gVar2;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object obj = gVar.f8510k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = gVar.f8512m;
        try {
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0753q = gVar.j;
                cVar2 = gVar.f8509i;
                gVar = gVar.f8508h;
                try {
                    P.u0(obj);
                    r10 = gVar;
                    r9 = c0753q;
                    try {
                        cVar2.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r10.f8524f.g(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        cVar2.close();
                    } catch (Throwable th4) {
                        AbstractC1903s.j(th, th4);
                    }
                    throw th;
                }
            }
            P.u0(obj);
            if (this.f8523e.f8491a.get()) {
                throw new IllegalStateException("StorageConnection has already been disposed.");
            }
            boolean zF = this.f8524f.f();
            try {
                c cVar3 = new c(this.f8519a, this.f8520b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zF);
                    gVar.f8508h = this;
                    gVar.f8509i = cVar3;
                    gVar.j = zF;
                    gVar.f8512m = 1;
                    Object objInvoke = c0753q.invoke(cVar3, boolValueOf, gVar);
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    r9 = zF;
                    r10 = this;
                    cVar2 = cVar3;
                    cVar2.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r9 != 0) {
                        r10.f8524f.g(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    c0753q = zF;
                    gVar = this;
                    cVar2 = cVar3;
                    cVar2.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                c0753q = zF;
                gVar = this;
                if (c0753q != 0) {
                    gVar.f8524f.g(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            if (c0753q != 0) {
                gVar.f8524f.g(null);
            }
            throw th;
        }
    }

    public final Object b(M m8, p117n6.c cVar) throws Throwable {
        ?? hVar;
        ?? r11;
        ?? r9;
        A aC;
        ?? r10;
        ?? r12;
        k kVar;
        Throwable th;
        InterfaceC0737a interfaceC0737a;
        ?? r13;
        ?? r14;
        ?? r15;
        ?? E9 = ETagPayloadStore.TEMP_SUFFIX;
        if (cVar instanceof h) {
            h hVar2 = (h) cVar;
            int i3 = hVar2.f8518n;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                hVar2.f8518n = i3 - Integer.MIN_VALUE;
                hVar = hVar2;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object obj = hVar.f8516l;
        ?? r16 = p109m6.a.f25430h;
        int i9 = hVar.f8518n;
        try {
            try {
                try {
                    try {
                        if (i9 == 0) {
                            P.u0(obj);
                            if (this.f8523e.f8491a.get()) {
                                throw new IllegalStateException("StorageConnection has already been disposed.");
                            }
                            aC = this.f8520b.c();
                            if (aC == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            this.f8519a.b(aC);
                            hVar.f8513h = this;
                            hVar.f8514i = m8;
                            hVar.j = aC;
                            ?? r17 = this.f8524f;
                            hVar.f8515k = r17;
                            hVar.f8518n = 1;
                            if (r17.e(hVar) != r16) {
                                r9 = this;
                                r10 = m8;
                                r11 = r17;
                            }
                            return r16;
                        }
                        if (i9 != 1) {
                            if (i9 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            interfaceC0737a = (InterfaceC0737a) hVar.f8515k;
                            E9 = hVar.j;
                            r16 = (p028c8.a) hVar.f8514i;
                            hVar = hVar.f8513h;
                            try {
                                P.u0(obj);
                                r15 = E9;
                                r14 = hVar;
                                r13 = r16;
                                try {
                                    interfaceC0737a.close();
                                    th = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r14.f8519a.t(r15)) {
                                    r14.f8519a.P(r15, r14.f8520b);
                                }
                                ((p028c8.d) r13).g(null);
                                return p070h6.A.f22523a;
                            } catch (Throwable th3) {
                                th = th3;
                                try {
                                    interfaceC0737a.close();
                                } catch (Throwable th4) {
                                    AbstractC1903s.j(th, th4);
                                }
                                throw th;
                            }
                        }
                        p028c8.a aVar = (p028c8.a) hVar.f8515k;
                        aC = hVar.j;
                        p194x6.m mVar = (p194x6.m) hVar.f8514i;
                        i iVar = hVar.f8513h;
                        P.u0(obj);
                        r11 = aVar;
                        r10 = mVar;
                        r9 = iVar;
                        hVar.f8513h = r9;
                        hVar.f8514i = r11;
                        hVar.j = E9;
                        hVar.f8515k = kVar;
                        hVar.f8518n = 2;
                        if (r10.invoke(kVar, hVar) != r16) {
                            r13 = r11;
                            interfaceC0737a = kVar;
                            r14 = r9;
                            r15 = E9;
                            interfaceC0737a.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r14.f8519a.t(r15)) {
                                r14.f8519a.P(r15, r14.f8520b);
                            }
                            ((p028c8.d) r13).g(null);
                            return p070h6.A.f22523a;
                        }
                        return r16;
                    } catch (Throwable th5) {
                        r16 = r11;
                        hVar = r9;
                        th = th5;
                        interfaceC0737a = kVar;
                        interfaceC0737a.close();
                        throw th;
                    }
                    r12.i(E9);
                    kVar = new k(r12, E9);
                } catch (IOException e6) {
                    e = e6;
                    if (r9.f8519a.t(E9)) {
                        try {
                            ?? r18 = r9.f8519a;
                            r18.getClass();
                            r18.i(E9);
                        } catch (IOException unused) {
                        }
                    }
                    throw e;
                }
                A a2 = r9.f8520b;
                r12 = r9.f8519a;
                E9 = aC.e(a2.b().concat(ETagPayloadStore.TEMP_SUFFIX));
            } catch (Throwable th6) {
                th = th6;
                ((p028c8.d) r11).g(null);
                throw th;
            }
        } catch (IOException e9) {
            e = e9;
            r9 = hVar;
            r11 = r16;
            if (r9.f8519a.t(E9)) {
                ?? r19 = r9.f8519a;
                r19.getClass();
                r19.i(E9);
            }
            throw e;
        } catch (Throwable th7) {
            th = th7;
            r11 = r16;
            ((p028c8.d) r11).g(null);
            throw th;
        }
    }

    @Override
    public final void close() {
        this.f8523e.f8491a.set(true);
        this.f8522d.invoke();
    }
}

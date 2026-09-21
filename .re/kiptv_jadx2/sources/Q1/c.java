package Q1;

import M8.A;
import M8.AbstractC0674b;
import M8.E;
import M8.w;
import O1.InterfaceC0737a;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import java.io.Closeable;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.m;

public class c implements InterfaceC0737a {

    public final w f8496a;

    public final A f8497b;

    public final a f8498c;

    public c(w fileSystem, A path) {
        m.e(fileSystem, "fileSystem");
        m.e(path, "path");
        this.f8496a = fileSystem;
        this.f8497b = path;
        this.f8498c = new a();
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(c cVar, p117n6.c cVar2) throws Throwable {
        b bVar;
        E e6;
        Throwable th;
        Throwable th2;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i3 = bVar.f8495l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f8495l = i3 - Integer.MIN_VALUE;
            } else {
                bVar = new b(cVar, cVar2);
            }
        } else {
            bVar = new b(cVar, cVar2);
        }
        Object objA = bVar.j;
        p109m6.a aVar = p109m6.a.f25430h;
        ?? r9 = bVar.f8495l;
        S1.i iVar = S1.i.f9209a;
        boolean z6 = true;
        Throwable th3 = null;
        try {
            try {
                if (r9 == 0) {
                    P.u0(objA);
                    if (cVar.f8498c.f8491a.get()) {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                    try {
                        E eC = AbstractC0674b.c(cVar.f8496a.N(cVar.f8497b));
                        try {
                            bVar.f8492h = cVar;
                            bVar.f8493i = eC;
                            bVar.f8495l = 1;
                            S1.b bVarA = iVar.a(eC);
                            if (bVarA != aVar) {
                                e6 = eC;
                                objA = bVarA;
                                if (e6 != null) {
                                    e6.close();
                                }
                                th2 = null;
                            }
                        } catch (Throwable th4) {
                            r9 = cVar;
                            e6 = eC;
                            th = th4;
                            if (e6 != null) {
                                e6.close();
                            }
                            th2 = th;
                            objA = null;
                        }
                    } catch (FileNotFoundException unused) {
                        w wVar = cVar.f8496a;
                        A a2 = cVar.f8497b;
                        if (!wVar.t(a2)) {
                            return new S1.b(z6);
                        }
                        E eC2 = AbstractC0674b.c(cVar.f8496a.N(a2));
                        bVar.f8492h = eC2;
                        bVar.f8493i = null;
                        bVar.f8495l = 2;
                        objA = iVar.a(eC2);
                        cVar = eC2;
                    }
                    return aVar;
                }
                if (r9 != 1) {
                    if (r9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Closeable closeable = (Closeable) bVar.f8492h;
                    P.u0(objA);
                    cVar = closeable;
                    if (cVar != 0) {
                        try {
                            cVar.close();
                        } catch (Throwable th5) {
                            th3 = th5;
                        }
                    }
                    if (th3 != null) {
                        throw th3;
                    }
                    m.b(objA);
                    return objA;
                }
                e6 = bVar.f8493i;
                r9 = (c) bVar.f8492h;
                try {
                    P.u0(objA);
                    if (e6 != null) {
                        try {
                            e6.close();
                        } catch (Throwable th6) {
                            th2 = th6;
                        }
                    }
                    th2 = null;
                } catch (Throwable th7) {
                    th = th7;
                    if (e6 != null) {
                        try {
                            e6.close();
                        } catch (Throwable th8) {
                            AbstractC1903s.j(th, th8);
                        }
                    }
                    th2 = th;
                    objA = null;
                }
                if (th2 != null) {
                    throw th2;
                }
                m.b(objA);
                return objA;
            } catch (Throwable th9) {
                if (cVar != 0) {
                    try {
                        cVar.close();
                    } catch (Throwable th10) {
                        AbstractC1903s.j(th9, th10);
                    }
                }
                th3 = th9;
                objA = null;
            }
        } catch (FileNotFoundException unused2) {
            cVar = r9;
        }
    }

    @Override
    public final void close() {
        this.f8498c.f8491a.set(true);
    }
}

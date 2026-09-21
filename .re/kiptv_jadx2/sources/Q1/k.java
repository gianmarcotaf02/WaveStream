package Q1;

import M8.AbstractC0674b;
import M8.D;
import M8.v;
import M8.w;
import com.google.common.util.concurrent.AbstractC1903s;
import com.google.common.util.concurrent.P;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.m;
import p070h6.A;

public final class k extends c {
    public final Object b(Object obj, p117n6.c cVar) throws Throwable {
        j jVar;
        v vVar;
        v vVar2;
        Throwable th;
        D d4;
        v vVar3;
        A a2;
        Throwable th2;
        v vVar4;
        A a9;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i3 = jVar.f8529m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.f8529m = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object obj2 = jVar.f8527k;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = jVar.f8529m;
        A a10 = A.f22523a;
        Throwable th3 = null;
        if (i9 == 0) {
            P.u0(obj2);
            if (this.f8498c.f8491a.get()) {
                throw new IllegalStateException("This scope has already been closed.");
            }
            w wVar = this.f8496a;
            wVar.getClass();
            M8.A file = this.f8497b;
            m.e(file, "file");
            wVar.getClass();
            m.e(file, "file");
            vVar = new v(true, new RandomAccessFile(file.f(), "rw"));
            try {
                D dB = AbstractC0674b.b(v.b(vVar));
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
                } catch (Throwable th4) {
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
            } catch (Throwable th5) {
                th = th5;
                if (vVar != null) {
                    vVar.close();
                }
                th3 = th;
                a2 = null;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4 = jVar.j;
            vVar3 = jVar.f8526i;
            vVar2 = jVar.f8525h;
            try {
                P.u0(obj2);
            } catch (Throwable th6) {
                th = th6;
                if (d4 != null) {
                    try {
                        d4.close();
                    } catch (Throwable th7) {
                        try {
                            AbstractC1903s.j(th, th7);
                        } catch (Throwable th8) {
                            th = th8;
                            vVar = vVar2;
                            if (vVar != null) {
                                try {
                                    vVar.close();
                                } catch (Throwable th9) {
                                    AbstractC1903s.j(th, th9);
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
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        vVar4 = vVar2;
        a9 = a10;
        if (th2 != null) {
            throw th2;
        }
        m.b(a9);
        if (vVar4 != null) {
            try {
                vVar4.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        a2 = a10;
        if (th3 != null) {
            throw th3;
        }
        m.b(a2);
        return a10;
    }
}

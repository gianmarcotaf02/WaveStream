package I2;

import C5.C0132n0;
import F.i0;
import M8.A;
import M8.AbstractC0674b;
import M8.C0676d;
import M8.D;
import M8.E;
import M8.w;
import M8.y;
import O7.o;
import O7.q;
import O7.x;
import S7.AbstractC0906w;
import S7.C;
import S7.C0905v;
import S7.M;
import S7.y0;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.play_billing.AbstractC1833d1;
import com.google.common.util.concurrent.AbstractC1903s;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Logger;
import kotlin.jvm.internal.m;

public final class e implements AutoCloseable {
    public static final o y = new o("[a-z0-9_-]{1,120}");

    public final A f4584h;

    public final long f4585i;
    public final A j;

    public final A f4586k;

    public final A f4587l;

    public final LinkedHashMap f4588m;

    public final X7.c f4589n;

    public final Object f4590o;

    public long f4591p;

    public int f4592q;

    public D f4593r;

    public boolean f4594s;

    public boolean f4595t;

    public boolean f4596u;

    public boolean f4597v;

    public boolean f4598w;

    public final c f4599x;

    public e(long j, w wVar, A a2) {
        this.f4584h = a2;
        this.f4585i = j;
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.j = a2.e("journal");
        this.f4586k = a2.e("journal.tmp");
        this.f4587l = a2.e("journal.bkp");
        this.f4588m = new LinkedHashMap(0, 0.75f, true);
        y0 y0VarE = C.e();
        C0905v key = AbstractC0906w.f9624h;
        m.e(key, "key");
        Z7.e eVar = M.f9549a;
        this.f4589n = C.c(AbstractC1833d1.H(y0VarE, Z7.d.f13044i.Y(1)));
        this.f4590o = new Object();
        this.f4599x = new c(wVar);
    }

    public static void P(String str) {
        if (!y.d(str)) {
            throw new IllegalArgumentException(B2.a.i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public static final void b(e eVar, i0 i0Var, boolean z6) {
        synchronized (eVar.f4590o) {
            a aVar = (a) i0Var.f3465b;
            if (!m.a(aVar.g, i0Var)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z6 || aVar.f4578f) {
                for (int i3 = 0; i3 < 2; i3++) {
                    eVar.f4599x.j((A) aVar.f4576d.get(i3));
                }
            } else {
                for (int i9 = 0; i9 < 2; i9++) {
                    if (((boolean[]) i0Var.f3466c)[i9] && !eVar.f4599x.t((A) aVar.f4576d.get(i9))) {
                        i0Var.d(false);
                        return;
                    }
                }
                for (int i10 = 0; i10 < 2; i10++) {
                    A a2 = (A) aVar.f4576d.get(i10);
                    A a9 = (A) aVar.f4575c.get(i10);
                    if (eVar.f4599x.t(a2)) {
                        eVar.f4599x.P(a2, a9);
                    } else {
                        p000a.a.n(eVar.f4599x, (A) aVar.f4575c.get(i10));
                    }
                    long j = aVar.f4574b[i10];
                    Long l2 = eVar.f4599x.v(a9).f7271d;
                    long jLongValue = l2 != null ? l2.longValue() : 0L;
                    aVar.f4574b[i10] = jLongValue;
                    eVar.f4591p = (eVar.f4591p - j) + jLongValue;
                }
            }
            aVar.g = null;
            if (aVar.f4578f) {
                eVar.G(aVar);
                return;
            }
            eVar.f4592q++;
            D d4 = eVar.f4593r;
            m.b(d4);
            if (z6 || aVar.f4577e) {
                aVar.f4577e = true;
                d4.w("CLEAN");
                d4.p(32);
                d4.w(aVar.f4573a);
                for (long j9 : aVar.f4574b) {
                    d4.p(32);
                    d4.i(j9);
                }
                d4.p(10);
            } else {
                eVar.f4588m.remove(aVar.f4573a);
                d4.w("REMOVE");
                d4.p(32);
                d4.w(aVar.f4573a);
                d4.p(10);
            }
            d4.flush();
            if (eVar.f4591p > eVar.f4585i) {
                eVar.t();
            } else if (eVar.f4592q >= 2000) {
                eVar.t();
            }
        }
    }

    public final void B(String str) throws IOException {
        String strSubstring;
        int iK0 = q.K0(str, ' ', 0, 6);
        if (iK0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i3 = iK0 + 1;
        int iK1 = q.K0(str, ' ', i3, 4);
        LinkedHashMap linkedHashMap = this.f4588m;
        if (iK1 == -1) {
            strSubstring = str.substring(i3);
            m.d(strSubstring, "substring(...)");
            if (iK0 == 6 && x.x0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i3, iK1);
            m.d(strSubstring, "substring(...)");
        }
        Object aVar = linkedHashMap.get(strSubstring);
        if (aVar == null) {
            aVar = new a(this, strSubstring);
            linkedHashMap.put(strSubstring, aVar);
        }
        a aVar2 = (a) aVar;
        if (iK1 == -1 || iK0 != 5 || !x.x0(str, "CLEAN", false)) {
            if (iK1 == -1 && iK0 == 5 && x.x0(str, "DIRTY", false)) {
                aVar2.g = new i0(this, aVar2);
                return;
            } else {
                if (iK1 != -1 || iK0 != 4 || !x.x0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iK1 + 1);
        m.d(strSubstring2, "substring(...)");
        List listC1 = q.c1(strSubstring2, new char[]{' '});
        aVar2.f4577e = true;
        aVar2.g = null;
        int size = listC1.size();
        aVar2.f4580i.getClass();
        if (size != 2) {
            throw new IOException("unexpected journal line: " + listC1);
        }
        try {
            int size2 = listC1.size();
            for (int i9 = 0; i9 < size2; i9++) {
                aVar2.f4574b[i9] = Long.parseLong((String) listC1.get(i9));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listC1);
        }
    }

    public final void G(a aVar) {
        D d4;
        int i3 = aVar.f4579h;
        String str = aVar.f4573a;
        if (i3 > 0 && (d4 = this.f4593r) != null) {
            d4.w("DIRTY");
            d4.p(32);
            d4.w(str);
            d4.p(10);
            d4.flush();
        }
        if (aVar.f4579h > 0 || aVar.g != null) {
            aVar.f4578f = true;
            return;
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.f4599x.j((A) aVar.f4575c.get(i9));
            long j = this.f4591p;
            long[] jArr = aVar.f4574b;
            this.f4591p = j - jArr[i9];
            jArr[i9] = 0;
        }
        this.f4592q++;
        D d6 = this.f4593r;
        if (d6 != null) {
            d6.w("REMOVE");
            d6.p(32);
            d6.w(str);
            d6.p(10);
            d6.flush();
        }
        this.f4588m.remove(str);
        if (this.f4592q >= 2000) {
            t();
        }
    }

    public final void N() {
        while (this.f4591p > this.f4585i) {
            for (a aVar : this.f4588m.values()) {
                if (!aVar.f4578f) {
                    G(aVar);
                }
            }
            return;
        }
        this.f4597v = false;
    }

    public final void T() {
        Throwable th;
        synchronized (this.f4590o) {
            try {
                D d4 = this.f4593r;
                if (d4 != null) {
                    d4.close();
                }
                D dB = AbstractC0674b.b(this.f4599x.G(this.f4586k, false));
                try {
                    dB.w("libcore.io.DiskLruCache");
                    dB.p(10);
                    dB.w(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
                    dB.p(10);
                    dB.i(3);
                    dB.p(10);
                    dB.i(2);
                    dB.p(10);
                    dB.p(10);
                    for (a aVar : this.f4588m.values()) {
                        if (aVar.g != null) {
                            dB.w("DIRTY");
                            dB.p(32);
                            dB.w(aVar.f4573a);
                            dB.p(10);
                        } else {
                            dB.w("CLEAN");
                            dB.p(32);
                            dB.w(aVar.f4573a);
                            for (long j : aVar.f4574b) {
                                dB.p(32);
                                dB.i(j);
                            }
                            dB.p(10);
                        }
                    }
                    try {
                        dB.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Throwable th3) {
                    try {
                        dB.close();
                    } catch (Throwable th4) {
                        AbstractC1903s.j(th3, th4);
                    }
                    th = th3;
                }
                if (th != null) {
                    throw th;
                }
                if (this.f4599x.t(this.j)) {
                    this.f4599x.P(this.j, this.f4587l);
                    this.f4599x.P(this.f4586k, this.j);
                    this.f4599x.j(this.f4587l);
                } else {
                    this.f4599x.P(this.f4586k, this.j);
                }
                this.f4593r = u();
                this.f4592q = 0;
                this.f4594s = false;
                this.f4598w = false;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    @Override
    public final void close() {
        synchronized (this.f4590o) {
            try {
                if (this.f4595t && !this.f4596u) {
                    for (a aVar : (a[]) this.f4588m.values().toArray(new a[0])) {
                        i0 i0Var = aVar.g;
                        if (i0Var != null) {
                            a aVar2 = (a) i0Var.f3465b;
                            if (m.a(aVar2.g, i0Var)) {
                                aVar2.f4578f = true;
                            }
                        }
                    }
                    N();
                    C.i(this.f4589n, null);
                    D d4 = this.f4593r;
                    m.b(d4);
                    d4.close();
                    this.f4593r = null;
                    this.f4596u = true;
                    return;
                }
                this.f4596u = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final i0 e(String str) {
        synchronized (this.f4590o) {
            try {
                if (this.f4596u) {
                    throw new IllegalStateException("cache is closed");
                }
                P(str);
                j();
                a aVar = (a) this.f4588m.get(str);
                if ((aVar != null ? aVar.g : null) != null) {
                    return null;
                }
                if (aVar != null && aVar.f4579h != 0) {
                    return null;
                }
                if (!this.f4597v && !this.f4598w) {
                    D d4 = this.f4593r;
                    m.b(d4);
                    d4.w("DIRTY");
                    d4.p(32);
                    d4.w(str);
                    d4.p(10);
                    d4.flush();
                    if (this.f4594s) {
                        return null;
                    }
                    if (aVar == null) {
                        aVar = new a(this, str);
                        this.f4588m.put(str, aVar);
                    }
                    i0 i0Var = new i0(this, aVar);
                    aVar.g = i0Var;
                    return i0Var;
                }
                t();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b i(String str) {
        b bVarA;
        synchronized (this.f4590o) {
            if (this.f4596u) {
                throw new IllegalStateException("cache is closed");
            }
            P(str);
            j();
            a aVar = (a) this.f4588m.get(str);
            if (aVar != null && (bVarA = aVar.a()) != null) {
                boolean z6 = true;
                this.f4592q++;
                D d4 = this.f4593r;
                m.b(d4);
                d4.w("READ");
                d4.p(32);
                d4.w(str);
                d4.p(10);
                d4.flush();
                if (this.f4592q < 2000) {
                    z6 = false;
                }
                if (z6) {
                    t();
                }
                return bVarA;
            }
            return null;
        }
    }

    public final void j() {
        synchronized (this.f4590o) {
            try {
                if (this.f4595t) {
                    return;
                }
                this.f4599x.j(this.f4586k);
                if (this.f4599x.t(this.f4587l)) {
                    if (this.f4599x.t(this.j)) {
                        this.f4599x.j(this.f4587l);
                    } else {
                        this.f4599x.P(this.f4587l, this.j);
                    }
                }
                if (this.f4599x.t(this.j)) {
                    try {
                        z();
                        v();
                        this.f4595t = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            p000a.a.p(this.f4599x, this.f4584h);
                            this.f4596u = false;
                            T();
                            this.f4595t = true;
                        } catch (Throwable th) {
                            this.f4596u = false;
                            throw th;
                        }
                    }
                }
                T();
                this.f4595t = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void t() {
        C.A(this.f4589n, null, new d(this, null), 3);
    }

    public final D u() {
        c cVar = this.f4599x;
        cVar.getClass();
        A file = this.j;
        m.e(file, "file");
        cVar.getClass();
        m.e(file, "file");
        cVar.j.getClass();
        File fileF = file.f();
        Logger logger = y.f7290a;
        return AbstractC0674b.b(new C8.f(new C0676d(new FileOutputStream(fileF, true), new M8.M(), 1), new C0132n0(10, this)));
    }

    public final void v() {
        Iterator it = this.f4588m.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            int i3 = 0;
            if (aVar.g == null) {
                while (i3 < 2) {
                    j += aVar.f4574b[i3];
                    i3++;
                }
            } else {
                aVar.g = null;
                while (i3 < 2) {
                    A a2 = (A) aVar.f4575c.get(i3);
                    c cVar = this.f4599x;
                    cVar.j(a2);
                    cVar.j((A) aVar.f4576d.get(i3));
                    i3++;
                }
                it.remove();
            }
        }
        this.f4591p = j;
    }

    public final void z() throws Throwable {
        E eC = AbstractC0674b.c(this.f4599x.N(this.j));
        try {
            String strU = eC.u(Long.MAX_VALUE);
            String strU2 = eC.u(Long.MAX_VALUE);
            String strU3 = eC.u(Long.MAX_VALUE);
            String strU4 = eC.u(Long.MAX_VALUE);
            String strU5 = eC.u(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strU) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(strU2) || !m.a(String.valueOf(3), strU3) || !m.a(String.valueOf(2), strU4) || strU5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strU + ", " + strU2 + ", " + strU3 + ", " + strU4 + ", " + strU5 + ']');
            }
            int i3 = 0;
            while (true) {
                try {
                    B(eC.u(Long.MAX_VALUE));
                    i3++;
                } catch (EOFException unused) {
                    this.f4592q = i3 - this.f4588m.size();
                    if (eC.o()) {
                        this.f4593r = u();
                    } else {
                        T();
                    }
                    try {
                        eC.close();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                eC.close();
            } catch (Throwable th3) {
                AbstractC1903s.j(th, th3);
            }
        }
        if (th != null) {
            throw th;
        }
    }
}

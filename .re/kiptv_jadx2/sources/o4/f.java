package o4;

import A4.W;
import A4.X;
import A4.Y;
import A4.b0;
import A4.d0;
import A4.e0;
import A4.f0;
import A4.g0;
import A4.r0;
import D1.AbstractC0220e0;
import com.google.crypto.tink.shaded.protobuf.AbstractC1906a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1915j;
import com.google.crypto.tink.shaded.protobuf.AbstractC1928x;
import com.google.crypto.tink.shaded.protobuf.C1914i;
import com.google.crypto.tink.shaded.protobuf.C1918m;
import com.google.crypto.tink.shaded.protobuf.D;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p179v4.t;

public final class f {

    public static final f f26115c;

    public static final f f26116d;

    public static final f f26117e;

    public final int f26118a;

    public final Object f26119b;

    static {
        int i3 = 0;
        f26115c = new f(i3, "ENABLED");
        f26116d = new f(i3, "DISABLED");
        f26117e = new f(i3, "DESTROYED");
    }

    public f(int i3, Object obj) {
        this.f26118a = i3;
        this.f26119b = obj;
    }

    public synchronized void a(b0 b0Var) {
        f0 f0VarB;
        synchronized (this) {
            f0VarB = b(n.e(b0Var), b0Var.A());
        }
        d0 d0Var = (d0) this.f26119b;
        d0Var.e();
        g0.x((g0) d0Var.f19594i, f0VarB);
    }

    public synchronized f0 b(Y y, r0 r0Var) {
        int iA;
        synchronized (this) {
            iA = t.a();
            while (d(iA)) {
                iA = t.a();
            }
        }
        return (f0) e0VarF.b();
        if (r0Var == r0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        e0 e0VarF = f0.F();
        e0VarF.e();
        f0.w((f0) e0VarF.f19594i, y);
        e0VarF.e();
        f0.z((f0) e0VarF.f19594i, iA);
        e0VarF.e();
        f0.y((f0) e0VarF.f19594i);
        e0VarF.e();
        f0.x((f0) e0VarF.f19594i, r0Var);
        return (f0) e0VarF.b();
    }

    public synchronized j1.l c() {
        return j1.l.h((g0) ((d0) this.f26119b).b());
    }

    public synchronized boolean d(int i3) {
        Iterator it = Collections.unmodifiableList(((g0) ((d0) this.f26119b).f19594i).A()).iterator();
        while (it.hasNext()) {
            if (((f0) it.next()).B() == i3) {
                return true;
            }
        }
        return false;
    }

    public Y e(AbstractC1915j abstractC1915j) throws GeneralSecurityException {
        p179v4.d dVar = (p179v4.d) this.f26119b;
        try {
            AbstractC0220e0 abstractC0220e0E = dVar.e();
            AbstractC1906a abstractC1906aZ0 = abstractC0220e0E.z0(abstractC1915j);
            abstractC0220e0E.D0(abstractC1906aZ0);
            AbstractC1906a abstractC1906aP0 = abstractC0220e0E.p0(abstractC1906aZ0);
            W wD = Y.D();
            String strC = dVar.c();
            wD.e();
            Y.w((Y) wD.f19594i, strC);
            try {
                int iB = ((AbstractC1928x) abstractC1906aP0).b(null);
                byte[] bArr = new byte[iB];
                C1918m c1918m = new C1918m(bArr, iB);
                abstractC1906aP0.f(c1918m);
                if (c1918m.f19561f - c1918m.g != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                C1914i c1914i = new C1914i(bArr);
                wD.e();
                Y.x((Y) wD.f19594i, c1914i);
                X xF = dVar.f();
                wD.e();
                Y.y((Y) wD.f19594i, xF);
                return (Y) wD.b();
            } catch (IOException e6) {
                throw new RuntimeException(abstractC1906aP0.c("ByteString"), e6);
            }
        } catch (D e9) {
            throw new GeneralSecurityException("Unexpected proto", e9);
        }
    }

    public String toString() {
        switch (this.f26118a) {
            case 0:
                return (String) this.f26119b;
            default:
                return super.toString();
        }
    }

    public f(p179v4.d dVar, Class cls) {
        this.f26118a = 2;
        if (!((Map) dVar.f29163d).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(B2.a.m("Given internalKeyMananger ", dVar.toString(), " does not support primitive class ", cls.getName()));
        }
        this.f26119b = dVar;
    }
}

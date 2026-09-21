package p020c0;

import H3.q;
import N6.InterfaceC0691e;
import N6.InterfaceC0694h;
import N6.P;
import V7.n0;
import Y1.w;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.H;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p007a7.v;
import p044e7.l;
import p059g4.c;
import p063g8.r;
import p068h4.s;
import p068h4.t;
import p068h4.u;
import p069h5.d;
import p076i4.E0;
import p080i8.a;
import p095l.j;
import p101l7.e;
import p103m.InterfaceC2576m;
import p113n1.k;
import p113n1.n;
import p136q.y;
import p146r1.E;
import p154s.U;
import p154s.a0;
import p163t.B;
import p163t.C;
import p163t.InterfaceC2774s;
import p191x3.C3100a;
import p191x3.C3102c;
import p191x3.f;
import p191x3.h;
import t8.C2862l;
import t8.o;
import w.b;

public final class C1704s0 implements P, l, a, t, h, E0, j, InterfaceC2576m, InterfaceC2774s, o, E, c {

    public final int f18361h;

    public Object f18362i;

    public C1704s0(int i3, Object obj) {
        this.f18361h = i3;
        this.f18362i = obj;
    }

    @Override
    public int K(char[] cArr, int i3, int i9) {
        return ((C2862l) this.f18362i).a(cArr, i3, i9);
    }

    @Override
    public Object a(Object obj, Object obj2) {
        return ((p068h4.j) this.f18362i).apply(obj2);
    }

    @Override
    public long b(p113n1.l lVar, long j, n nVar, long j9) {
        long j10 = ((k) ((Function0) this.f18362i).invoke()).f25559a;
        return (((long) b.a(nVar == n.f25566h, lVar.f25561a + ((int) (j10 >> 32)), (int) (j9 >> 32), (int) (j >> 32))) << 32) | (((long) b.a(true, lVar.f25562b + ((int) (j10 & 4294967295L)), (int) (j9 & 4294967295L), (int) (j & 4294967295L))) & 4294967295L);
    }

    @Override
    public void d(f fVar, int i3) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        n0 n0Var = ((d) this.f18362i).f22522c;
        Boolean bool = Boolean.FALSE;
        n0Var.getClass();
        n0Var.i(null, bool);
    }

    @Override
    public void e(f fVar, String sessionId) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        m.e(sessionId, "sessionId");
        n0 n0Var = ((d) this.f18362i).f22521b;
        p069h5.b bVar = p069h5.b.f22518e;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    @Override
    public void f(f fVar, int i3) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        d dVar = (d) this.f18362i;
        n0 n0Var = dVar.f22521b;
        p069h5.b bVar = p069h5.b.f22519f;
        n0Var.getClass();
        n0Var.i(null, bVar);
        Boolean bool = Boolean.FALSE;
        n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override
    public p044e7.m g(e eVar) {
        if ("b".equals(eVar.b())) {
            return new p054f7.c(this, 2);
        }
        return null;
    }

    @Override
    public B get(int i3) {
        switch (this.f18361h) {
            case 18:
                return ((C[]) this.f18362i)[i3];
            default:
                return (B) this.f18362i;
        }
    }

    @Override
    public void h(f fVar, boolean z6) {
        String str;
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        d dVar = (d) this.f18362i;
        dVar.getClass();
        q.d();
        CastDevice castDevice = session.f31190k;
        if (castDevice == null || (str = castDevice.f18619k) == null) {
            str = "Cast";
        }
        p069h5.a aVar = new p069h5.a(str);
        n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, aVar);
        Boolean bool = Boolean.TRUE;
        n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override
    public void j(f fVar, int i3) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        d dVar = (d) this.f18362i;
        n0 n0Var = dVar.f22521b;
        p069h5.b bVar = p069h5.b.f22519f;
        n0Var.getClass();
        n0Var.i(null, bVar);
        Boolean bool = Boolean.FALSE;
        n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override
    public void k(f fVar, String sessionId) {
        String str;
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        m.e(sessionId, "sessionId");
        d dVar = (d) this.f18362i;
        dVar.getClass();
        q.d();
        CastDevice castDevice = session.f31190k;
        if (castDevice == null || (str = castDevice.f18619k) == null) {
            str = "Cast";
        }
        p069h5.a aVar = new p069h5.a(str);
        n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, aVar);
        Boolean bool = Boolean.TRUE;
        n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override
    public Iterator l(u uVar, CharSequence charSequence) {
        return new s(this, uVar, charSequence, 0);
    }

    @Override
    public void m(p095l.l lVar) {
        p008a8.c cVar = ((ActionMenuView) this.f18362i).f15717B;
        if (cVar != null) {
            cVar.m(lVar);
        }
    }

    @Override
    public void n(f fVar) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
    }

    @Override
    public void o(f fVar) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        n0 n0Var = ((d) this.f18362i).f22521b;
        p069h5.b bVar = p069h5.b.f22518e;
        n0Var.getClass();
        n0Var.i(null, bVar);
    }

    @Override
    public void onSuccess(Object obj) {
        ((C3100a) this.f18362i).getClass();
        H.h("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void q(f fVar, int i3) {
        C3102c session = (C3102c) fVar;
        m.e(session, "session");
        d dVar = (d) this.f18362i;
        dVar.getClass();
        p069h5.b bVar = p069h5.b.f22519f;
        n0 n0Var = dVar.f22521b;
        n0Var.getClass();
        n0Var.i(null, bVar);
        Boolean bool = Boolean.FALSE;
        n0 n0Var2 = dVar.f22522c;
        n0Var2.getClass();
        n0Var2.i(null, bool);
    }

    @Override
    public Object r(Object obj, Object obj2) {
        String newValue = (String) obj2;
        m.e(newValue, "newValue");
        p063g8.m mVar = (p063g8.m) this.f18362i;
        r rVar = mVar.f22383a.f22395a;
        List list = mVar.f22384b;
        int iIndexOf = list.indexOf(newValue);
        p063g8.u uVar = mVar.f22383a;
        Integer num = (Integer) rVar.r(obj, Integer.valueOf(iIndexOf + uVar.f22396b));
        if (num != null) {
            return (String) list.get(num.intValue() - uVar.f22396b);
        }
        return null;
    }

    @Override
    public l t(p101l7.b bVar, e eVar) {
        return null;
    }

    public String toString() {
        switch (this.f18361h) {
            case 1:
                StringBuilder sb = new StringBuilder();
                p007a7.q qVar = (p007a7.q) this.f18362i;
                sb.append(qVar);
                sb.append(": ");
                sb.append(((Map) p000a.a.v(qVar.f15498p, p007a7.q.f15495t[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public p184w3.o u() {
        p184w3.o oVar = (p184w3.o) this.f18362i;
        if (oVar.f29890h == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.f29892k) && oVar.f29892k < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.f29893l)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f29894m) || oVar.f29894m < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override
    public boolean v(p095l.l lVar, MenuItem menuItem) {
        InterfaceC2576m interfaceC2576m = ((ActionMenuView) this.f18362i).f15722G;
        if (interfaceC2576m == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((C1704s0) interfaceC2576m).f18362i).f15751N.j).iterator();
        while (it.hasNext()) {
            if (((w) it.next()).f11351a.o()) {
                return true;
            }
        }
        return false;
    }

    public void w() {
        Socket socket;
        A8.q qVar = (A8.q) this.f18362i;
        Iterator it = qVar.f446d.iterator();
        m.d(it, "connections.iterator()");
        while (it.hasNext()) {
            A8.o connection = (A8.o) it.next();
            m.d(connection, "connection");
            synchronized (connection) {
                if (connection.f439p.isEmpty()) {
                    it.remove();
                    connection.j = true;
                    socket = connection.f429d;
                    m.b(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                x8.b.d(socket);
            }
        }
        if (qVar.f446d.isEmpty()) {
            qVar.f444b.a();
        }
    }

    public void x(View view, int i3, boolean z6) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.f18362i).notifyViewVisibilityChanged(view, i3, z6);
        }
    }

    public InterfaceC0691e y(T6.o javaClass) {
        m.e(javaClass, "javaClass");
        p101l7.c cVarC = javaClass.c();
        if (cVarC != null) {
            p027c7.f[] fVarArr = p027c7.f.f18515h;
        }
        Class<?> declaringClass = javaClass.f9865a.getDeclaringClass();
        T6.o oVar = declaringClass != null ? new T6.o(declaringClass) : null;
        if (oVar != null) {
            InterfaceC0691e interfaceC0691eY = y(oVar);
            p180v7.o oVarG0 = interfaceC0691eY != null ? interfaceC0691eY.g0() : null;
            InterfaceC0694h interfaceC0694hF = oVarG0 != null ? oVarG0.f(javaClass.e(), V6.c.f10363o) : null;
            if (interfaceC0694hF instanceof InterfaceC0691e) {
                return (InterfaceC0691e) interfaceC0694hF;
            }
        } else if (cVarC != null) {
            p007a7.q qVar = (p007a7.q) p078i6.o.j1(com.google.common.util.concurrent.P.i0(((Z6.e) this.f18362i).c(cVarC.b())));
            if (qVar != null) {
                v vVar = qVar.f15499q.f15444d;
                vVar.getClass();
                return vVar.v(javaClass.e(), javaClass);
            }
        }
        return null;
    }

    public C1704s0(int i3, boolean z6) {
        this.f18361h = i3;
    }

    public C1704s0(MediaInfo mediaInfo) {
        this.f18361h = 25;
        p184w3.o oVar = new p184w3.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f18362i = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public C1704s0(JSONObject jSONObject) {
        this.f18361h = 25;
        this.f18362i = new p184w3.o(jSONObject);
    }

    public C1704s0(int i3) {
        V1.b bVar;
        this.f18361h = i3;
        switch (i3) {
            case 26:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                m.e(timeUnit, "timeUnit");
                this.f18362i = new A8.q(z8.c.f32967i);
                break;
            default:
                if (Build.VERSION.SDK_INT >= 28) {
                    bVar = new V1.b(16);
                } else {
                    bVar = new V1.b(17);
                }
                this.f18362i = bVar;
                break;
        }
    }

    public C1704s0(p007a7.q packageFragment) {
        this.f18361h = 1;
        m.e(packageFragment, "packageFragment");
        this.f18362i = packageFragment;
    }

    public C1704s0(p113n1.c cVar) {
        this.f18361h = 17;
        this.f18362i = new U(a0.f27109a, cVar);
    }

    @Override
    public void c() {
    }

    public C1704s0(long[] jArr) {
        y yVar;
        this.f18361h = 15;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            yVar = new y(jArrCopyOf.length);
            int i3 = yVar.f26439b;
            if (i3 >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i3;
                    long[] jArr2 = yVar.f26438a;
                    if (jArr2.length < length) {
                        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                        m.d(jArrCopyOf2, "copyOf(...)");
                        yVar.f26438a = jArrCopyOf2;
                    }
                    long[] jArr3 = yVar.f26438a;
                    int i9 = yVar.f26439b;
                    if (i3 != i9) {
                        p078i6.m.c0(jArr3, jArr3, jArrCopyOf.length + i3, i3, i9);
                    }
                    p078i6.m.c0(jArrCopyOf, jArr3, i3, 0, jArrCopyOf.length);
                    yVar.f26439b += jArrCopyOf.length;
                }
            } else {
                p144r.a.d("");
                throw null;
            }
        } else {
            yVar = new y(16);
        }
        this.f18362i = yVar;
    }

    @Override
    public void i(e eVar, Object obj) {
    }

    @Override
    public void p(e eVar, p142q7.f fVar) {
    }

    public C1704s0(InputStream inputStream) {
        this.f18361h = 22;
        this.f18362i = new C2862l(inputStream, O7.a.f8024b);
    }

    public C1704s0(float f9, float f10, p163t.r rVar) {
        this.f18361h = 18;
        int iB = rVar.b();
        C[] cArr = new C[iB];
        for (int i3 = 0; i3 < iB; i3++) {
            cArr[i3] = new C(f9, f10, rVar.a(i3));
        }
        this.f18362i = cArr;
    }

    @Override
    public void s(e eVar, p101l7.b bVar, e eVar2) {
    }
}

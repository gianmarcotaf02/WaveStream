package A8;

import K0.C0656d;
import O0.E;
import O0.InterfaceC0732v;
import O0.N;
import O0.q0;
import Q0.AbstractC0777k;
import Q0.F;
import Q0.J;
import Q0.S;
import R0.E0;
import R0.T;
import R0.U;
import S7.C;
import S7.C0895k;
import Y.C1012a;
import Y.C1013b;
import Z.A0;
import Z.C1165p0;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.graphics.vector.VectorPainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import java.io.File;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.functions.Function0;
import p020c0.C1715y;
import p020c0.X;
import p070h6.A;
import p078i6.w;
import p136q.H;
import p154s.D;
import p163t.y0;

public final class m extends kotlin.jvm.internal.o implements Function0 {

    public final int f423h;

    public final Object f424i;

    public m(int i3, Object obj) {
        super(0);
        this.f423h = i3;
        this.f424i = obj;
    }

    @Override
    public final Object invoke() {
        C1715y c1715y;
        InterfaceC0732v interfaceC0732v = null;
        boolean z6 = false;
        A a2 = A.f22523a;
        Object obj = this.f424i;
        switch (this.f423h) {
            case 0:
                w8.l lVar = ((o) obj).f430e;
                kotlin.jvm.internal.m.b(lVar);
                List<Certificate> listA = lVar.a();
                ArrayList arrayList = new ArrayList(p078i6.q.I0(listA, 10));
                for (Certificate certificate : listA) {
                    kotlin.jvm.internal.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                ((VectorPainter) obj).f15838p.setValue(a2);
                return a2;
            case 2:
                return ((J0.d) obj).f5983d;
            case 3:
                return ((J0.i) obj).N0();
            case 4:
                E e6 = (E) obj;
                if (!((Boolean) e6.g.getValue()).booleanValue() && (c1715y = e6.f7566c) != null) {
                    c1715y.l();
                }
                return a2;
            case 5:
                N nA = ((q0) obj).a();
                F f9 = nA.f7595h;
                if (nA.f7607u != ((p038e0.e) ((p038e0.b) f9.p()).f21318i).j) {
                    H h9 = nA.f7599m;
                    Object[] objArr = h9.f26324c;
                    long[] jArr = h9.f26322a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((255 & j) < 128) {
                                        ((E) objArr[(i3 << 3) + i10]).f7567d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i9 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    if (f9.f8248p != null) {
                        if (!f9.f8233O.f8273e) {
                            F.Y(f9, false, 7);
                        }
                    } else if (!f9.s()) {
                        F.a0(f9, false, 7);
                    }
                }
                return a2;
            case 6:
                J j9 = ((F) obj).f8233O;
                j9.f8282p.f8355G = true;
                S s9 = j9.f8283q;
                if (s9 != null) {
                    s9.f8315A = true;
                }
                return a2;
            case 7:
                C.i(((T) obj).j, null);
                return a2;
            case 8:
                ((U) obj).getClass();
                return a2;
            case 9:
                p096l0.c cVar = (p096l0.c) ((E0) obj).f8779a.f9i;
                if (!cVar.f24710i) {
                    if (cVar.j) {
                        m0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.j = true;
                }
                return a2;
            case 10:
                File file = (File) ((C0656d) obj).invoke();
                String name = file.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (O7.q.k1('.', name, "").equals("preferences_pb")) {
                    String str = M8.A.f7207i;
                    File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.m.d(absoluteFile, "file.absoluteFile");
                    return B3.o.l(absoluteFile);
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 11:
                C1012a c1012a = (C1012a) obj;
                c1012a.f10960q.setValue(Boolean.valueOf(!((Boolean) c1012a.f10960q.getValue()).booleanValue()));
                return a2;
            case 12:
                AbstractC0777k.j((C1013b) obj);
                return a2;
            case 13:
                return (Y.h) ((X) obj).getValue();
            case 14:
                C0895k c0895k = ((C1165p0) obj).f12475b;
                if (c0895k.isActive()) {
                    c0895k.resumeWith(A0.f12185h);
                }
                return Boolean.TRUE;
            case 15:
                Z0.b bVar = (Z0.b) obj;
                bVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    return a2;
                } finally {
                    Trace.endSection();
                }
            case 16:
                return new p003a3.a((DrawablePainter) obj);
            case 17:
                Object systemService = ((View) ((android.support.v4.media.session.q) obj).f15617i).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 18:
                return new BaseInputConnection(((g1.A) obj).f21771a, false);
            case 19:
                return "Unexpected end of input: yet to parse " + ((p080i8.h) obj).b();
            case 20:
                return Y6.f.l(new StringBuilder("Unexpected end of input: yet to parse '"), ((p080i8.r) obj).f23280a, '\'');
            case 21:
                return (p181w0.b) obj;
            case 22:
                p146r1.A a9 = (p146r1.A) obj;
                InterfaceC0732v parentLayoutCoordinates = a9.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.i()) {
                    interfaceC0732v = parentLayoutCoordinates;
                }
                if (interfaceC0732v != null && a9.m522getPopupContentSizebOM6tXw() != null) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 23:
                y0 y0Var = (y0) obj;
                Object objS0 = y0Var.f27727a.s0();
                D d4 = D.j;
                if (objS0 == d4 && y0Var.f27730d.getValue() == d4) {
                    z6 = true;
                }
                return Boolean.valueOf(z6);
            case 24:
                ((p175v0.F) obj).P0();
                return a2;
            case 25:
                return (List) obj;
            default:
                try {
                    return (List) ((kotlin.jvm.internal.o) obj).invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return w.f23205h;
                }
        }
    }

    public m(Function0 function0) {
        super(0);
        this.f423h = 26;
        this.f424i = (kotlin.jvm.internal.o) function0;
    }
}

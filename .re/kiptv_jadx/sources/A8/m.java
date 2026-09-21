package A8;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends kotlin.jvm.internal.o implements kotlin.jvm.functions.Function0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f423h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i3, java.lang.Object obj) {
        super(0);
        this.f423h = i3;
        this.f424i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:128:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd A[LOOP:0: B:87:0x01a9->B:97:0x01dd, LOOP_END] */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.o] */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        p020c0.C1715y c1715y;
        O0.InterfaceC0732v interfaceC0732v = null;
        boolean z6 = false;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object obj = this.f424i;
        switch (this.f423h) {
            case 0:
                w8.l lVar = ((A8.o) obj).f430e;
                kotlin.jvm.internal.m.b(lVar);
                java.util.List<java.security.cert.Certificate> listA = lVar.a();
                java.util.ArrayList arrayList = new java.util.ArrayList(p078i6.q.I0(listA, 10));
                for (java.security.cert.Certificate certificate : listA) {
                    kotlin.jvm.internal.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList.add((java.security.cert.X509Certificate) certificate);
                }
                return arrayList;
            case 1:
                ((androidx.compose.ui.graphics.vector.VectorPainter) obj).f15838p.setValue(a2);
                return a2;
            case 2:
                return ((J0.d) obj).f5983d;
            case 3:
                return ((J0.i) obj).N0();
            case 4:
                O0.E e6 = (O0.E) obj;
                if (!((java.lang.Boolean) e6.g.getValue()).booleanValue() && (c1715y = e6.f7566c) != null) {
                    c1715y.l();
                }
                return a2;
            case 5:
                O0.N nA = ((O0.q0) obj).a();
                Q0.F f9 = nA.f7595h;
                if (nA.f7607u != ((p038e0.e) ((p038e0.b) f9.p()).f21318i).j) {
                    p136q.H h9 = nA.f7599m;
                    java.lang.Object[] objArr = h9.f26324c;
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
                                        ((O0.E) objArr[(i3 << 3) + i10]).f7567d = true;
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
                            Q0.F.Y(f9, false, 7);
                        }
                    } else if (!f9.s()) {
                        Q0.F.a0(f9, false, 7);
                    }
                }
                return a2;
            case 6:
                Q0.J j9 = ((Q0.F) obj).f8233O;
                j9.f8282p.f8355G = true;
                Q0.S s9 = j9.f8283q;
                if (s9 != null) {
                    s9.f8315A = true;
                }
                return a2;
            case 7:
                S7.C.i(((R0.T) obj).j, null);
                return a2;
            case 8:
                ((R0.U) obj).getClass();
                return a2;
            case 9:
                p096l0.c cVar = (p096l0.c) ((R0.E0) obj).f8779a.f9i;
                if (!cVar.f24710i) {
                    if (cVar.j) {
                        m0.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.j = true;
                }
                return a2;
            case 10:
                java.io.File file = (java.io.File) ((K0.C0656d) obj).invoke();
                java.lang.String name = file.getName();
                kotlin.jvm.internal.m.d(name, "getName(...)");
                if (O7.q.k1('.', name, "").equals("preferences_pb")) {
                    java.lang.String str = M8.A.f7207i;
                    java.io.File absoluteFile = file.getAbsoluteFile();
                    kotlin.jvm.internal.m.d(absoluteFile, "file.absoluteFile");
                    return B3.o.l(absoluteFile);
                }
                throw new java.lang.IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 11:
                Y.C1012a c1012a = (Y.C1012a) obj;
                c1012a.f10960q.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) c1012a.f10960q.getValue()).booleanValue()));
                return a2;
            case 12:
                Q0.AbstractC0777k.j((Y.C1013b) obj);
                return a2;
            case 13:
                return (Y.h) ((p020c0.X) obj).getValue();
            case 14:
                S7.C0895k c0895k = ((Z.C1165p0) obj).f12475b;
                if (c0895k.isActive()) {
                    c0895k.resumeWith(Z.A0.f12185h);
                }
                return java.lang.Boolean.TRUE;
            case 15:
                Z0.b bVar = (Z0.b) obj;
                bVar.g = null;
                android.os.Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    return a2;
                } finally {
                    android.os.Trace.endSection();
                }
            case 16:
                return new p003a3.a((com.google.accompanist.drawablepainter.DrawablePainter) obj);
            case 17:
                java.lang.Object systemService = ((android.view.View) ((android.support.v4.media.session.q) obj).f15617i).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (android.view.inputmethod.InputMethodManager) systemService;
            case 18:
                return new android.view.inputmethod.BaseInputConnection(((g1.A) obj).f21771a, false);
            case 19:
                return "Unexpected end of input: yet to parse " + ((p080i8.h) obj).b();
            case 20:
                return Y6.f.l(new java.lang.StringBuilder("Unexpected end of input: yet to parse '"), ((p080i8.r) obj).f23280a, '\'');
            case 21:
                return (p181w0.b) obj;
            case 22:
                p146r1.A a9 = (p146r1.A) obj;
                O0.InterfaceC0732v parentLayoutCoordinates = a9.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.i()) {
                    interfaceC0732v = parentLayoutCoordinates;
                }
                if (interfaceC0732v != null && a9.m522getPopupContentSizebOM6tXw() != null) {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            case 23:
                p163t.y0 y0Var = (p163t.y0) obj;
                java.lang.Object objS0 = y0Var.f27727a.s0();
                p154s.D d4 = p154s.D.j;
                if (objS0 == d4 && y0Var.f27730d.getValue() == d4) {
                    z6 = true;
                }
                return java.lang.Boolean.valueOf(z6);
            case 24:
                ((p175v0.F) obj).P0();
                return a2;
            case 25:
                return (java.util.List) obj;
            default:
                try {
                    return (java.util.List) ((kotlin.jvm.internal.o) obj).invoke();
                } catch (javax.net.ssl.SSLPeerUnverifiedException unused) {
                    return p078i6.w.f23205h;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(kotlin.jvm.functions.Function0 function0) {
        super(0);
        this.f423h = 26;
        this.f424i = (kotlin.jvm.internal.o) function0;
    }
}

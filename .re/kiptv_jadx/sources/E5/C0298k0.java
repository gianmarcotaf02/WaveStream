package E5;

/* JADX INFO: renamed from: E5.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0298k0 implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f3086h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f3087i;

    public /* synthetic */ C0298k0(int i3, java.lang.Object obj) {
        this.f3086h = i3;
        this.f3087i = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public java.lang.Object a(p005a5.InterfaceC1268f1 interfaceC1268f1, p100l6.c cVar) {
        p150r5.g gVar;
        java.lang.Exception exc;
        E5.C0298k0 c0298k0;
        java.lang.Object value;
        java.lang.Object value2;
        V7.n0 n0Var;
        java.lang.Object value3;
        p150r5.c cVar2;
        java.lang.String message;
        java.lang.Object value4;
        if (cVar instanceof p150r5.g) {
            gVar = (p150r5.g) cVar;
            int i3 = gVar.f26877k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.f26877k = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new p150r5.g(this, cVar);
            }
        } else {
            gVar = new p150r5.g(this, cVar);
        }
        p150r5.g gVar2 = gVar;
        java.lang.Object obj = gVar2.f26876i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = gVar2.f26877k;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            if (!kotlin.jvm.internal.m.a(interfaceC1268f1, p005a5.C1258e1.f14389a)) {
                boolean z6 = interfaceC1268f1 instanceof p005a5.C1228b1;
                p150r5.i iVar = (p150r5.i) this.f3087i;
                if (z6) {
                    try {
                        p005a5.C5 c9 = iVar.f26880b;
                        java.lang.String str = ((p005a5.C1228b1) interfaceC1268f1).f14238a;
                        java.lang.String str2 = ((p005a5.C1228b1) interfaceC1268f1).f14239b;
                        gVar2.f26875h = this;
                        gVar2.f26877k = 1;
                        try {
                            java.lang.Object objImportAuthToken = io.github.jan.supabase.auth.AuthKt.getAuth(c9.f13258a).importAuthToken(str, str2, true, true, gVar2);
                            if (objImportAuthToken != aVar) {
                                objImportAuthToken = a2;
                            }
                            if (objImportAuthToken == aVar) {
                                return aVar;
                            }
                            c0298k0 = this;
                        } catch (java.lang.Exception e6) {
                            exc = e6;
                            c0298k0 = this;
                            n0Var = ((p150r5.i) c0298k0.f3087i).f26881c;
                            do {
                                value3 = n0Var.getValue();
                                cVar2 = (p150r5.c) value3;
                                message = exc.getMessage();
                                if (message == null) {
                                    message = "auth.errors.default";
                                }
                            } while (!n0Var.g(value3, p150r5.c.a(cVar2, null, null, 0, message, 47)));
                        }
                    } catch (java.lang.Exception e9) {
                        exc = e9;
                    }
                } else if (kotlin.jvm.internal.m.a(interfaceC1268f1, p005a5.C1248d1.f14346a)) {
                    V7.n0 n0Var2 = iVar.f26881c;
                    do {
                        value2 = n0Var2.getValue();
                    } while (!n0Var2.g(value2, p150r5.c.a((p150r5.c) value2, null, null, 0, "linkTV.error", 47)));
                } else {
                    if (!(interfaceC1268f1 instanceof p005a5.C1238c1)) {
                        throw new I3.b();
                    }
                    V7.n0 n0Var3 = iVar.f26881c;
                    do {
                        value = n0Var3.getValue();
                    } while (!n0Var3.g(value, p150r5.c.a((p150r5.c) value, null, null, 0, ((p005a5.C1238c1) interfaceC1268f1).f14289a, 47)));
                }
            }
            return a2;
        }
        if (i9 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0298k0 = gVar2.f26875h;
        try {
            com.google.common.util.concurrent.P.u0(obj);
        } catch (java.lang.Exception e10) {
            exc = e10;
            n0Var = ((p150r5.i) c0298k0.f3087i).f26881c;
            do {
                value3 = n0Var.getValue();
                cVar2 = (p150r5.c) value3;
                message = exc.getMessage();
                if (message == null) {
                    message = "auth.errors.default";
                }
            } while (!n0Var.g(value3, p150r5.c.a(cVar2, null, null, 0, message, 47)));
        }
        V7.n0 n0Var4 = ((p150r5.i) c0298k0.f3087i).f26881c;
        do {
            value4 = n0Var4.getValue();
        } while (!n0Var4.g(value4, p150r5.c.a((p150r5.c) value4, null, null, 0, null, 31)));
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0337  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bd  */
    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) throws java.lang.Throwable {
        V7.n0 n0Var;
        java.lang.Object value;
        E5.C0296j0 c0296j0A;
        int i3;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStream;
        java.lang.Object value2;
        J5.C0619o1 c0619o1A;
        java.lang.Object objE;
        V7.C0989o c0989o;
        java.lang.Object objA;
        int i9 = 0;
        java.lang.Object obj2 = null;
        switch (this.f3086h) {
            case 0:
                R4.d dVar = (R4.d) obj;
                E5.C0308p0 c0308p0 = (E5.C0308p0) this.f3087i;
                boolean z6 = ((E5.C0296j0) c0308p0.f3123h.getValue()).f3072d;
                p070h6.A a2 = p070h6.A.f22523a;
                if (!z6) {
                    java.util.List list = dVar.f9054a;
                    if (list == null || !list.isEmpty()) {
                        java.util.Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (((R4.e) it.next()).f9067f == R4.f.f9070i && (i9 = i9 + 1) < 0) {
                                p078i6.p.G0();
                                throw null;
                            }
                        }
                    }
                    float fR = O7.r.r(i9 / java.lang.Math.max(dVar.f9054a.size(), 7), 0.0f, 0.97f);
                    do {
                        n0Var = c0308p0.f3123h;
                        value = n0Var.getValue();
                        c0296j0A = (E5.C0296j0) value;
                        if (fR > c0296j0A.f3073e) {
                            c0296j0A = E5.C0296j0.a(c0296j0A, null, null, null, fR, null, 111);
                        }
                    } while (!n0Var.g(value, c0296j0A));
                }
                return a2;
            case 1:
                java.util.List list2 = (java.util.List) obj;
                V7.n0 n0Var2 = ((E5.X0) this.f3087i).f2965h;
                while (true) {
                    java.lang.Object value3 = n0Var2.getValue();
                    java.util.List list3 = list2;
                    if (n0Var2.g(value3, E5.K0.a((E5.K0) value3, list2, false, null, false, null, false, 126))) {
                        return p070h6.A.f22523a;
                    }
                    list2 = list3;
                }
                break;
            case 2:
                V7.n0 n0Var3 = ((F5.q) this.f3087i).f3710d;
                n0Var3.i(null, F5.k.a((F5.k) n0Var3.getValue(), null, ((com.kiptv.core.model.l0) obj).b(), false, null, 29));
                return p070h6.A.f22523a;
            case 3:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : (java.util.List) obj) {
                    com.kiptv.core.model.XtreamLiveStream xtreamLiveStream2 = (com.kiptv.core.model.XtreamLiveStream) obj3;
                    if (!xtreamLiveStream2.a()) {
                        java.lang.Integer num = xtreamLiveStream2.f20663l;
                        if ((num != null ? num.intValue() : 0) > 0) {
                        }
                    }
                    arrayList.add(obj3);
                }
                G5.g gVar = (G5.g) this.f3087i;
                V7.n0 n0Var4 = gVar.f3826e;
                n0Var4.i(null, G5.d.a((G5.d) n0Var4.getValue(), arrayList, null, null, false, null, 30));
                if (((G5.d) gVar.f3826e.getValue()).f3815b == null && (i3 = gVar.f3825d) > 0) {
                    for (java.lang.Object obj4 : arrayList) {
                        if (((com.kiptv.core.model.XtreamLiveStream) obj4).f20657d == i3) {
                            obj2 = obj4;
                            xtreamLiveStream = (com.kiptv.core.model.XtreamLiveStream) obj2;
                            if (xtreamLiveStream != null) {
                                gVar.e(xtreamLiveStream);
                            }
                        }
                    }
                    xtreamLiveStream = (com.kiptv.core.model.XtreamLiveStream) obj2;
                    if (xtreamLiveStream != null) {
                        gVar.e(xtreamLiveStream);
                    }
                }
                return p070h6.A.f22523a;
            case 4:
                p005a5.Q0 q9 = (p005a5.Q0) obj;
                V7.n0 n0Var5 = ((J5.C0615n1) this.f3087i).f6515c;
                do {
                    value2 = n0Var5.getValue();
                    J5.C0619o1 c0619o1 = (J5.C0619o1) value2;
                    if (q9 instanceof p005a5.P0) {
                        c0619o1A = J5.C0619o1.a(c0619o1, false, null, null, null, false, null, null, 118);
                    } else {
                        if (!(q9 instanceof p005a5.O0)) {
                            throw new I3.b();
                        }
                        p005a5.O0 o8 = (p005a5.O0) q9;
                        c0619o1A = J5.C0619o1.a(c0619o1, true, o8.f13724a, "", o8.f13725b, false, null, null, 112);
                    }
                } while (!n0Var5.g(value2, c0619o1A));
                return p070h6.A.f22523a;
            case 5:
                com.kiptv.core.model.ParentalControlSettings parentalControlSettings = (com.kiptv.core.model.ParentalControlSettings) obj;
                V7.n0 n0Var6 = ((J5.C0643w1) this.f3087i).f6599c;
                n0Var6.i(null, J5.C0646x1.a((J5.C0646x1) n0Var6.getValue(), parentalControlSettings.f20017d, parentalControlSettings.b(), parentalControlSettings.f20018e, null, null, 24));
                return p070h6.A.f22523a;
            case 6:
                com.kiptv.core.model.UserSettings userSettings = (com.kiptv.core.model.UserSettings) obj;
                V7.n0 n0Var7 = ((J5.p2) this.f3087i).f6536c;
                J5.C0616n2 c0616n2 = new J5.C0616n2(userSettings.f20586k, userSettings.f20587l, userSettings.f20588m);
                n0Var7.getClass();
                n0Var7.i(null, c0616n2);
                return p070h6.A.f22523a;
            case 7:
                O1.N n3 = (O1.N) this.f3087i;
                boolean z9 = n3.f7781h.p() instanceof O1.O;
                p070h6.A a9 = p070h6.A.f22523a;
                return (z9 || (objE = O1.N.e(n3, true, cVar)) != p109m6.a.f25430h) ? a9 : objE;
            case 8:
                ((R0.G0) this.f3087i).f8786h.h(((java.lang.Number) obj).floatValue());
                return p070h6.A.f22523a;
            case 9:
                S.p pVar = (S.p) this.f3087i;
                if (android.os.Build.VERSION.SDK_INT >= 34) {
                    pVar.m().startStylusHandwriting((android.view.View) pVar.f9153i);
                }
                return p070h6.A.f22523a;
            case 10:
                if (cVar instanceof V7.C0989o) {
                    c0989o = (V7.C0989o) cVar;
                    int i10 = c0989o.j;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0989o.j = i10 - Integer.MIN_VALUE;
                    } else {
                        c0989o = new V7.C0989o(this, cVar);
                    }
                } else {
                    c0989o = new V7.C0989o(this, cVar);
                }
                java.lang.Object obj5 = c0989o.f10495h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i11 = c0989o.j;
                if (i11 == 0) {
                    com.google.common.util.concurrent.P.u0(obj5);
                    if (obj == null) {
                        obj = W7.AbstractC1009c.f10731b;
                    }
                    c0989o.j = 1;
                    if (((U7.o) ((U7.A) this.f3087i)).f10216k.send(obj, c0989o) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj5);
                }
                return p070h6.A.f22523a;
            case 11:
                ((kotlin.jvm.internal.A) this.f3087i).f24539h = obj;
                throw new W7.C1007a(this);
            case 12:
                p202z.j jVar = (p202z.j) obj;
                boolean z10 = jVar instanceof p202z.h;
                p121o0.n nVar = (p121o0.n) this.f3087i;
                if (z10) {
                    nVar.add(jVar);
                } else if (jVar instanceof p202z.i) {
                    nVar.remove(((p202z.i) jVar).f32116a);
                } else if (jVar instanceof p202z.d) {
                    nVar.add(jVar);
                } else if (jVar instanceof p202z.e) {
                    nVar.remove(((p202z.e) jVar).f32111a);
                } else if (jVar instanceof p202z.m) {
                    nVar.add(jVar);
                } else if (jVar instanceof p202z.n) {
                    nVar.remove(((p202z.n) jVar).f32120a);
                } else if (jVar instanceof p202z.l) {
                    nVar.remove(((p202z.l) jVar).f32118a);
                }
                return p070h6.A.f22523a;
            case 13:
                V7.a0 a0Var = ((p005a5.C1455y) this.f3087i).f15339e;
                p070h6.A a10 = p070h6.A.f22523a;
                a0Var.o(a10);
                return a10;
            case 14:
                java.lang.Object objP = ((p005a5.C1379q2) this.f3087i).p(cVar);
                return objP == p109m6.a.f25430h ? objP : p070h6.A.f22523a;
            case 15:
                if (!((java.util.List) obj).isEmpty()) {
                    p005a5.B2 b9 = (p005a5.B2) this.f3087i;
                    java.util.List list4 = b9.j;
                    if (((java.util.List) b9.g.getValue()).isEmpty() && !list4.isEmpty()) {
                        b9.f(list4);
                    }
                }
                return p070h6.A.f22523a;
            case 16:
                ((p005a5.C1291h4) this.f3087i).j.h((com.kiptv.core.model.LocalDeviceSettings) obj);
                return p070h6.A.f22523a;
            case 17:
                ((p194x6.j) this.f3087i).invoke((io.github.jan.supabase.realtime.PostgresAction) obj);
                return p070h6.A.f22523a;
            case 18:
                com.kiptv.core.model.UserSettings userSettings2 = (com.kiptv.core.model.UserSettings) obj;
                int length = userSettings2.f20578a.length();
                p070h6.A a11 = p070h6.A.f22523a;
                return (length != 0 && (objA = p005a5.I5.a((p005a5.I5) this.f3087i, userSettings2.f20590o, cVar)) == p109m6.a.f25430h) ? objA : a11;
            case 19:
                java.lang.String str = (java.lang.String) obj;
                p070h6.A a12 = p070h6.A.f22523a;
                p078i6.y yVar = p078i6.y.f23207h;
                p005a5.i9 i9Var = (p005a5.i9) this.f3087i;
                if (str != null) {
                    V7.n0 n0Var8 = i9Var.f14629m;
                    n0Var8.getClass();
                    n0Var8.i(null, yVar);
                    V7.n0 n0Var9 = i9Var.f14635s;
                    n0Var9.getClass();
                    n0Var9.i(null, yVar);
                    V7.n0 n0Var10 = i9Var.f14633q;
                    n0Var10.getClass();
                    n0Var10.i(null, yVar);
                    V7.n0 n0Var11 = i9Var.f14637u;
                    n0Var11.getClass();
                    n0Var11.i(null, yVar);
                    V7.n0 n0Var12 = i9Var.f14631o;
                    n0Var12.getClass();
                    n0Var12.i(null, yVar);
                    V7.n0 n0Var13 = i9Var.f14639w;
                    n0Var13.getClass();
                    n0Var13.i(null, yVar);
                    java.lang.Object objM = i9Var.m(str, cVar);
                    return objM == p109m6.a.f25430h ? objM : a12;
                }
                V7.n0 n0Var14 = i9Var.f14627k;
                p078i6.w wVar = p078i6.w.f23205h;
                n0Var14.getClass();
                n0Var14.i(null, wVar);
                V7.n0 n0Var15 = i9Var.f14629m;
                n0Var15.getClass();
                n0Var15.i(null, yVar);
                V7.n0 n0Var16 = i9Var.f14635s;
                n0Var16.getClass();
                n0Var16.i(null, yVar);
                V7.n0 n0Var17 = i9Var.f14633q;
                n0Var17.getClass();
                n0Var17.i(null, yVar);
                V7.n0 n0Var18 = i9Var.f14637u;
                n0Var18.getClass();
                n0Var18.i(null, yVar);
                V7.n0 n0Var19 = i9Var.f14631o;
                n0Var19.getClass();
                n0Var19.i(null, yVar);
                V7.n0 n0Var20 = i9Var.f14639w;
                n0Var20.getClass();
                n0Var20.i(null, yVar);
                return a12;
            case 20:
                int i12 = com.kiptv.tv.TvActivity.f21002Z;
                com.kiptv.tv.TvActivity tvActivity = (com.kiptv.tv.TvActivity) this.f3087i;
                android.content.Intent launchIntentForPackage = tvActivity.getPackageManager().getLaunchIntentForPackage(tvActivity.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268468224);
                    tvActivity.startActivity(launchIntentForPackage);
                }
                return p070h6.A.f22523a;
            case 21:
                C5.C0110g c0110g = (C5.C0110g) obj;
                if (!(c0110g instanceof C5.C0110g)) {
                    throw new I3.b();
                }
                p114n2.y.b((p114n2.y) this.f3087i, com.google.common.util.concurrent.D.F(c0110g.f1332a));
                return p070h6.A.f22523a;
            default:
                return a((p005a5.InterfaceC1268f1) obj, cVar);
        }
    }
}

package U;

/* JADX INFO: loaded from: classes.dex */
public final class O implements V7.InterfaceC0982h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f9928h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f9929i;
    public final /* synthetic */ java.lang.Object j;

    /* JADX WARN: Multi-variable type inference failed */
    public O(V7.InterfaceC0982h interfaceC0982h, p194x6.m mVar) {
        this.f9928h = 6;
        this.f9929i = interfaceC0982h;
        this.j = (p117n6.i) mVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public java.lang.Object a(int i3, p100l6.c cVar) {
        V7.g0 g0Var;
        if (cVar instanceof V7.g0) {
            g0Var = (V7.g0) cVar;
            int i9 = g0Var.j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                g0Var.j = i9 - Integer.MIN_VALUE;
            } else {
                g0Var = new V7.g0(this, cVar);
            }
        } else {
            g0Var = new V7.g0(this, cVar);
        }
        java.lang.Object obj = g0Var.f10460h;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = g0Var.j;
        p070h6.A a2 = p070h6.A.f22523a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.google.common.util.concurrent.P.u0(obj);
            return a2;
        }
        com.google.common.util.concurrent.P.u0(obj);
        if (i3 > 0) {
            kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f9929i;
            if (!wVar.f24553h) {
                wVar.f24553h = true;
                V7.c0 c0Var = V7.c0.f10447h;
                g0Var.j = 1;
                if (((V7.InterfaceC0982h) this.j).emit(c0Var, g0Var) == aVar) {
                    return aVar;
                }
            }
        }
        return a2;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0294  */
    /* JADX WARN: Code duplicated, block: B:145:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x0345  */
    /* JADX WARN: Code duplicated, block: B:174:0x035c  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:219:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:241:0x0465  */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0158  */
    /* JADX WARN: Type inference failed for: r9v10, types: [n6.i, x6.m] */
    @Override // V7.InterfaceC0982h
    public final java.lang.Object emit(java.lang.Object obj, p100l6.c cVar) throws java.lang.Throwable {
        V4.C0962e c0962e;
        V4.C0972o c0972o;
        com.kiptv.core.model.LocalDeviceSettings localDeviceSettings;
        V4.N n3;
        V7.C0998y c0998y;
        U.O o8;
        V7.C c9;
        U.O o9;
        U.O o10;
        V7.O o11;
        V7.InterfaceC0982h interfaceC0982h;
        boolean z6;
        com.kiptv.core.model.XtreamLiveStream xtreamLiveStreamE;
        java.lang.Object obj2 = obj;
        boolean z9 = false;
        com.kiptv.core.model.SubscriptionStatus subscriptionStatus = null;
        java.lang.Object obj3 = this.j;
        p070h6.A a2 = p070h6.A.f22523a;
        java.lang.Object obj4 = this.f9929i;
        switch (this.f9928h) {
            case 0:
                long j = ((p181w0.a) obj2).f29744a;
                p163t.C2748c c2748c = (p163t.C2748c) obj4;
                if ((((p181w0.a) c2748c.d()).f29744a & 9223372034707292159L) == 9205357640488583168L || (j & 9223372034707292159L) == 9205357640488583168L || java.lang.Float.intBitsToFloat((int) (((p181w0.a) c2748c.d()).f29744a & 4294967295L)) == java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) {
                    java.lang.Object objE = c2748c.e(new p181w0.a(j), cVar);
                    return objE == p109m6.a.f25430h ? objE : a2;
                }
                S7.C.A((S7.A) obj3, null, new U.N(c2748c, j, null), 3);
                return a2;
            case 1:
                if (cVar instanceof V4.C0962e) {
                    c0962e = (V4.C0962e) cVar;
                    int i3 = c0962e.f10302i;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c0962e.f10302i = i3 - Integer.MIN_VALUE;
                    } else {
                        c0962e = new V4.C0962e(this, cVar);
                    }
                } else {
                    c0962e = new V4.C0962e(this, cVar);
                }
                java.lang.Object obj5 = c0962e.f10301h;
                p109m6.a aVar = p109m6.a.f25430h;
                int i9 = c0962e.f10302i;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj5);
                    return a2;
                }
                com.google.common.util.concurrent.P.u0(obj5);
                java.util.List listI1 = p078i6.o.I1(V4.C0967j.a((V4.C0967j) obj3, (java.lang.String) ((S1.b) obj2).c(V4.C0967j.f10312c)), new C5.O1(21));
                c0962e.f10302i = 1;
                return ((V7.InterfaceC0982h) obj4).emit(listI1, c0962e) == aVar ? aVar : a2;
            case 2:
                if (cVar instanceof V4.C0972o) {
                    c0972o = (V4.C0972o) cVar;
                    int i10 = c0972o.f10322i;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c0972o.f10322i = i10 - Integer.MIN_VALUE;
                    } else {
                        c0972o = new V4.C0972o(this, cVar);
                    }
                } else {
                    c0972o = new V4.C0972o(this, cVar);
                }
                java.lang.Object obj6 = c0972o.f10321h;
                p109m6.a aVar2 = p109m6.a.f25430h;
                int i11 = c0972o.f10322i;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj6);
                    return a2;
                }
                com.google.common.util.concurrent.P.u0(obj6);
                java.lang.String str = (java.lang.String) ((S1.b) obj2).c(V4.C0974q.f10325e);
                if (str != null) {
                    try {
                        p162s8.d dVar = ((V4.C0974q) obj3).f10328b;
                        dVar.getClass();
                        localDeviceSettings = (com.kiptv.core.model.LocalDeviceSettings) dVar.b(str, com.kiptv.core.model.LocalDeviceSettings.INSTANCE.serializer());
                    } catch (java.lang.Exception unused) {
                        com.kiptv.core.model.LocalDeviceSettings.INSTANCE.getClass();
                        localDeviceSettings = com.kiptv.core.model.LocalDeviceSettings.f19822v;
                    }
                    break;
                } else {
                    com.kiptv.core.model.LocalDeviceSettings.INSTANCE.getClass();
                    localDeviceSettings = com.kiptv.core.model.LocalDeviceSettings.f19822v;
                }
                c0972o.f10322i = 1;
                return ((V7.InterfaceC0982h) obj4).emit(localDeviceSettings, c0972o) == aVar2 ? aVar2 : a2;
            case 3:
                if (cVar instanceof V4.N) {
                    n3 = (V4.N) cVar;
                    int i12 = n3.f10284i;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        n3.f10284i = i12 - Integer.MIN_VALUE;
                    } else {
                        n3 = new V4.N(this, cVar);
                    }
                } else {
                    n3 = new V4.N(this, cVar);
                }
                java.lang.Object obj7 = n3.f10283h;
                p109m6.a aVar3 = p109m6.a.f25430h;
                int i13 = n3.f10284i;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj7);
                    return a2;
                }
                com.google.common.util.concurrent.P.u0(obj7);
                java.lang.String str2 = (java.lang.String) ((S1.b) obj2).c(V4.P.f10288d);
                if (str2 != null) {
                    try {
                        p162s8.d dVar2 = ((V4.P) obj3).f10291b;
                        dVar2.getClass();
                        subscriptionStatus = (com.kiptv.core.model.SubscriptionStatus) dVar2.b(str2, com.kiptv.core.model.SubscriptionStatus.INSTANCE.serializer());
                    } catch (java.lang.Exception unused2) {
                    }
                }
                n3.f10284i = 1;
                return ((V7.InterfaceC0982h) obj4).emit(subscriptionStatus, n3) == aVar3 ? aVar3 : a2;
            case 4:
                if (cVar instanceof V7.C0998y) {
                    c0998y = (V7.C0998y) cVar;
                    int i14 = c0998y.f10532k;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c0998y.f10532k = i14 - Integer.MIN_VALUE;
                    } else {
                        c0998y = new V7.C0998y(this, cVar);
                    }
                } else {
                    c0998y = new V7.C0998y(this, cVar);
                }
                java.lang.Object obj8 = c0998y.f10531i;
                p109m6.a aVar4 = p109m6.a.f25430h;
                int i15 = c0998y.f10532k;
                if (i15 == 0) {
                    com.google.common.util.concurrent.P.u0(obj8);
                    try {
                        c0998y.f10530h = this;
                        c0998y.f10532k = 1;
                        return ((V7.InterfaceC0982h) obj4).emit(obj2, c0998y) == aVar4 ? aVar4 : a2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        o8 = this;
                    }
                } else {
                    if (i15 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o8 = c0998y.f10530h;
                    try {
                        com.google.common.util.concurrent.P.u0(obj8);
                        return a2;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                    }
                }
                ((kotlin.jvm.internal.A) o8.j).f24539h = th;
                throw th;
            case 5:
                if (cVar instanceof V7.C) {
                    c9 = (V7.C) cVar;
                    int i16 = c9.j;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        c9.j = i16 - Integer.MIN_VALUE;
                    } else {
                        c9 = new V7.C(this, cVar);
                    }
                } else {
                    c9 = new V7.C(this, cVar);
                }
                java.lang.Object objInvoke = c9.f10373i;
                p109m6.a aVar5 = p109m6.a.f25430h;
                int i17 = c9.j;
                if (i17 == 0) {
                    com.google.common.util.concurrent.P.u0(objInvoke);
                    c9.f10372h = this;
                    c9.f10375l = obj2;
                    c9.j = 1;
                    objInvoke = ((O1.C0751o) obj4).invoke(obj2, c9);
                    if (objInvoke != aVar5) {
                        o9 = this;
                    }
                    return aVar5;
                }
                if (i17 == 1) {
                    obj2 = c9.f10375l;
                    o9 = c9.f10372h;
                    com.google.common.util.concurrent.P.u0(objInvoke);
                } else {
                    if (i17 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o10 = c9.f10372h;
                    com.google.common.util.concurrent.P.u0(objInvoke);
                }
                o9 = o10;
                z9 = true;
                if (z9) {
                    return a2;
                }
                throw new W7.C1007a(o9);
                if (((java.lang.Boolean) objInvoke).booleanValue()) {
                    V7.InterfaceC0982h interfaceC0982h2 = (V7.InterfaceC0982h) o9.j;
                    c9.f10372h = o9;
                    c9.f10375l = null;
                    c9.j = 2;
                    if (interfaceC0982h2.emit(obj2, c9) != aVar5) {
                        o10 = o9;
                        o9 = o10;
                        z9 = true;
                    }
                    return aVar5;
                }
                if (z9) {
                    return a2;
                }
                throw new W7.C1007a(o9);
            case 6:
                if (cVar instanceof V7.O) {
                    o11 = (V7.O) cVar;
                    int i18 = o11.f10408i;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        o11.f10408i = i18 - Integer.MIN_VALUE;
                    } else {
                        o11 = new V7.O(this, cVar);
                    }
                } else {
                    o11 = new V7.O(this, cVar);
                }
                java.lang.Object obj9 = o11.f10407h;
                p109m6.a aVar6 = p109m6.a.f25430h;
                int i19 = o11.f10408i;
                if (i19 == 0) {
                    com.google.common.util.concurrent.P.u0(obj9);
                    o11.f10409k = obj2;
                    interfaceC0982h = (V7.InterfaceC0982h) obj4;
                    o11.f10410l = interfaceC0982h;
                    o11.f10408i = 1;
                    if (((p117n6.i) obj3).invoke(obj2, o11) != aVar6) {
                    }
                    return aVar6;
                }
                if (i19 != 1) {
                    if (i19 != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.common.util.concurrent.P.u0(obj9);
                    return a2;
                }
                V7.InterfaceC0982h interfaceC0982h3 = o11.f10410l;
                java.lang.Object obj10 = o11.f10409k;
                com.google.common.util.concurrent.P.u0(obj9);
                interfaceC0982h = interfaceC0982h3;
                obj2 = obj10;
                o11.f10409k = null;
                o11.f10410l = null;
                o11.f10408i = 2;
                if (interfaceC0982h.emit(obj2, o11) != aVar6) {
                    return a2;
                }
                return aVar6;
            case 7:
                return a(((java.lang.Number) obj2).intValue(), cVar);
            case 8:
                p202z.j jVar = (p202z.j) obj2;
                Y.C1012a c1012a = (Y.C1012a) obj4;
                if (jVar instanceof p202z.m) {
                    p202z.m mVar = (p202z.m) jVar;
                    Y.r rVarA = c1012a.f10958o;
                    if (rVarA == null) {
                        rVarA = Y.z.a(c1012a.f10957n);
                        c1012a.f10958o = rVarA;
                        kotlin.jvm.internal.m.b(rVarA);
                    }
                    Y.t tVarA = rVarA.a(c1012a);
                    tVarA.b(mVar, c1012a.j, c1012a.f10961r, c1012a.f10962s, ((p188x0.C3098s) c1012a.f10955l.getValue()).f31129a, ((Y.h) c1012a.f10956m.getValue()).f10980d, c1012a.f10963t);
                    c1012a.f10959p.setValue(tVarA);
                } else if (jVar instanceof p202z.n) {
                    p202z.m mVar2 = ((p202z.n) jVar).f32120a;
                    Y.t tVar = (Y.t) c1012a.f10959p.getValue();
                    if (tVar != null) {
                        tVar.d();
                    }
                } else if (jVar instanceof p202z.l) {
                    p202z.m mVar3 = ((p202z.l) jVar).f32118a;
                    Y.t tVar2 = (Y.t) c1012a.f10959p.getValue();
                    if (tVar2 != null) {
                        tVar2.d();
                    }
                } else {
                    c1012a.f10953i.g(jVar, (S7.A) obj3);
                }
                return a2;
            case 9:
                p202z.j jVar2 = (p202z.j) obj2;
                androidx.compose.material.ripple.RippleNode rippleNode = (androidx.compose.material.ripple.RippleNode) obj4;
                if (!(jVar2 instanceof p202z.o)) {
                    A0.a aVar7 = rippleNode.f15812z;
                    if (aVar7 == null) {
                        aVar7 = new A0.a(rippleNode.f15810w, rippleNode.y);
                        Q0.AbstractC0777k.j(rippleNode);
                        rippleNode.f15812z = aVar7;
                    }
                    aVar7.g(jVar2, (S7.A) obj3);
                } else if (rippleNode.f15807C) {
                    rippleNode.Q0((p202z.o) jVar2);
                } else {
                    rippleNode.f15808D.a(jVar2);
                }
                return a2;
            case 10:
                p202z.j jVar3 = (p202z.j) obj2;
                kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) obj4;
                if (jVar3 instanceof p202z.m) {
                    yVar.f24555h++;
                } else if ((jVar3 instanceof p202z.n) || (jVar3 instanceof p202z.l)) {
                    yVar.f24555h--;
                }
                z9 = yVar.f24555h > 0;
                Z.Q0 q9 = (Z.Q0) obj3;
                if (q9.f12306x != z9) {
                    q9.f12306x = z9;
                    Q0.AbstractC0777k.k(q9);
                }
                return a2;
            case 11:
                p114n2.C2650i c2650i = (p114n2.C2650i) obj2;
                com.kiptv.tv.TvActivity tvActivity = (com.kiptv.tv.TvActivity) obj4;
                tvActivity.f21007F.f(kotlin.jvm.internal.m.a((java.lang.String) c2650i.f25625i.f25671i.f8486e, io.sentry.protocol.SentryThread.JsonKeys.MAIN));
                java.lang.String str3 = (java.lang.String) c2650i.f25625i.f25671i.f8486e;
                if (!tvActivity.f21022Y) {
                    p005a5.M1 m8 = tvActivity.f21018R;
                    if (m8 == null) {
                        kotlin.jvm.internal.m.k("playlistRepository");
                        throw null;
                    }
                    com.kiptv.core.model.Playlist playlist = (com.kiptv.core.model.Playlist) ((V7.n0) m8.f13659k.f10419h).getValue();
                    if (playlist == null) {
                        z6 = false;
                    } else {
                        p005a5.C1366p c1366p = tvActivity.f21019S;
                        if (c1366p == null) {
                            kotlin.jvm.internal.m.k("contentCacheRepository");
                            throw null;
                        }
                        if (kotlin.jvm.internal.m.a(((V7.n0) c1366p.f14908b.f10419h).getValue(), playlist.f20033a)) {
                            p005a5.C1366p c1366p2 = tvActivity.f21019S;
                            if (c1366p2 == null) {
                                kotlin.jvm.internal.m.k("contentCacheRepository");
                                throw null;
                            }
                            if (((java.lang.Boolean) ((V7.n0) c1366p2.f14913h.f10419h).getValue()).booleanValue()) {
                                p005a5.C1366p c1366p3 = tvActivity.f21019S;
                                if (c1366p3 == null) {
                                    kotlin.jvm.internal.m.k("contentCacheRepository");
                                    throw null;
                                }
                                if (((java.lang.Boolean) ((V7.n0) c1366p3.f14918n.f10419h).getValue()).booleanValue()) {
                                    p005a5.C1366p c1366p4 = tvActivity.f21019S;
                                    if (c1366p4 == null) {
                                        kotlin.jvm.internal.m.k("contentCacheRepository");
                                        throw null;
                                    }
                                    if (((java.lang.Boolean) ((V7.n0) c1366p4.f14926v.f10419h).getValue()).booleanValue()) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                } else {
                                    z6 = false;
                                }
                            } else {
                                z6 = false;
                            }
                        } else {
                            z6 = false;
                        }
                    }
                    java.util.Set set = q5.l.f26650a;
                    if (!z6 && str3 != null) {
                        z9 = !q5.l.f26650a.contains(str3);
                    }
                    if (z9) {
                        tvActivity.f21022Y = true;
                        java.util.Set set2 = p015b5.AbstractC1664a.f17935a;
                        if (str3 == null) {
                            str3 = "unknown";
                        }
                        p015b5.AbstractC1664a.a("session_recovery route=".concat(str3), "navigation");
                        ((p114n2.y) obj3).a("playlist/loading?force=false&epgOnly=false", new p108m5.c(12));
                    }
                }
                return a2;
            case 12:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Iterator it = ((java.util.List) obj2).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((java.lang.Number) it.next()).intValue();
                    float f9 = v5.AbstractC2930h0.f29480a;
                    S4.p pVar = (S4.p) p078i6.o.k1(iIntValue, ((v5.C2932i0) ((p020c0.X) obj3).getValue()).f29504b);
                    java.lang.Integer num = (pVar == null || (xtreamLiveStreamE = pVar.e()) == null) ? null : new java.lang.Integer(xtreamLiveStreamE.f20657d);
                    if (num != null) {
                        arrayList.add(num);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((v5.d1) obj4).f29448r.o(arrayList);
                }
                return a2;
            default:
                ((java.lang.Number) obj2).longValue();
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj4;
                if (wVar.f24553h) {
                    wVar.f24553h = false;
                } else {
                    p186w5.k1 k1Var = (p186w5.k1) obj3;
                    k1Var.f30277L.clear();
                    k1Var.f30278M.clear();
                    k1Var.f30279N.clear();
                    V7.n0 n0Var = k1Var.f30296r;
                    p186w5.H0 h9 = (p186w5.H0) n0Var.getValue();
                    p078i6.x xVar = p078i6.x.f23206h;
                    n0Var.i(null, p186w5.H0.a(h9, false, null, false, false, null, null, null, null, false, xVar, xVar, xVar, 511));
                    k1Var.y();
                }
                return a2;
        }
    }

    public /* synthetic */ O(java.lang.Object obj, java.lang.Object obj2, int i3) {
        this.f9928h = i3;
        this.f9929i = obj;
        this.j = obj2;
    }
}

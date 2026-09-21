package p005a5;

/* JADX INFO: loaded from: classes.dex */
public final class x9 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f15309A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f15310B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4.v2 f15311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V7.n0 f15312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V7.n0 f15313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V7.n0 f15314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V7.n0 f15315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V7.n0 f15316f;
    public final V7.n0 g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V7.W f15317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V7.n0 f15318i;
    public final V7.W j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final V7.n0 f15319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final V7.W f15320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V7.n0 f15321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V7.W f15322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final V7.n0 f15323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final V7.W f15324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V7.n0 f15325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V7.W f15326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V7.n0 f15327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V7.W f15328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final V7.n0 f15329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final V7.W f15330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V7.n0 f15331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final V7.W f15332x;
    public final V7.n0 y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V7.n0 f15333z;

    public x9(Y4.v2 xtreamApiClient, io.ktor.client.HttpClient httpClient, p162s8.d json) {
        kotlin.jvm.internal.m.e(xtreamApiClient, "xtreamApiClient");
        kotlin.jvm.internal.m.e(httpClient, "httpClient");
        kotlin.jvm.internal.m.e(json, "json");
        this.f15311a = xtreamApiClient;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f15312b = V7.r.b(bool);
        this.f15313c = V7.r.b(null);
        this.f15314d = V7.r.b(null);
        this.f15315e = V7.r.b(bool);
        this.f15316f = V7.r.b(null);
        V7.n0 n0VarB = V7.r.b(null);
        this.g = n0VarB;
        this.f15317h = new V7.W(n0VarB);
        V7.n0 n0VarB2 = V7.r.b(null);
        this.f15318i = n0VarB2;
        this.j = new V7.W(n0VarB2);
        V7.n0 n0VarB3 = V7.r.b(null);
        this.f15319k = n0VarB3;
        this.f15320l = new V7.W(n0VarB3);
        V7.n0 n0VarB4 = V7.r.b(null);
        this.f15321m = n0VarB4;
        this.f15322n = new V7.W(n0VarB4);
        V7.n0 n0VarB5 = V7.r.b(null);
        this.f15323o = n0VarB5;
        this.f15324p = new V7.W(n0VarB5);
        V7.n0 n0VarB6 = V7.r.b(null);
        this.f15325q = n0VarB6;
        this.f15326r = new V7.W(n0VarB6);
        V7.n0 n0VarB7 = V7.r.b(bool);
        this.f15327s = n0VarB7;
        this.f15328t = new V7.W(n0VarB7);
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0VarB8 = V7.r.b(xVar);
        this.f15329u = n0VarB8;
        this.f15330v = new V7.W(n0VarB8);
        V7.n0 n0VarB9 = V7.r.b(xVar);
        this.f15331w = n0VarB9;
        this.f15332x = new V7.W(n0VarB9);
        this.y = V7.r.b(xVar);
        this.f15333z = V7.r.b(xVar);
        this.f15309A = new java.util.concurrent.ConcurrentHashMap();
        this.f15310B = 300000L;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object a(p117n6.c cVar) throws java.lang.Exception {
        p005a5.p9 p9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.p9) {
            p9Var = (p005a5.p9) cVar;
            int i3 = p9Var.f14958k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p9Var.f14958k = i3 - Integer.MIN_VALUE;
            } else {
                p9Var = new p005a5.p9(this, cVar);
            }
        } else {
            p9Var = new p005a5.p9(this, cVar);
        }
        java.lang.Object objB = p9Var.f14957i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = p9Var.f14958k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objB);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            V7.n0 n0Var = this.f15315e;
            n0Var.getClass();
            n0Var.i(null, bool);
            this.f15316f.h(null);
            try {
                Y4.v2 v2Var = this.f15311a;
                p9Var.f14956h = this;
                p9Var.f14958k = 1;
                objB = v2Var.b(p9Var);
                if (objB == aVar) {
                    return aVar;
                }
                x9Var = this;
            } catch (java.lang.Exception e6) {
                e = e6;
                x9Var = this;
                V7.n0 n0Var2 = x9Var.f15315e;
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                n0Var2.getClass();
                n0Var2.i(null, bool2);
                x9Var.f15316f.h(e.getMessage());
                throw e;
            }
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = p9Var.f14956h;
            try {
                com.google.common.util.concurrent.P.u0(objB);
            } catch (java.lang.Exception e9) {
                e = e9;
                V7.n0 n0Var3 = x9Var.f15315e;
                java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
                n0Var3.getClass();
                n0Var3.i(null, bool3);
                x9Var.f15316f.h(e.getMessage());
                throw e;
            }
        }
        com.kiptv.core.model.XtreamAuthResponse xtreamAuthResponse = (com.kiptv.core.model.XtreamAuthResponse) objB;
        x9Var.f15314d.h(xtreamAuthResponse.f20647a);
        x9Var.f15313c.h(xtreamAuthResponse.f20648b);
        V7.n0 n0Var4 = x9Var.f15312b;
        java.lang.Boolean bool4 = java.lang.Boolean.TRUE;
        n0Var4.getClass();
        n0Var4.i(null, bool4);
        V7.n0 n0Var5 = x9Var.f15315e;
        java.lang.Boolean bool5 = java.lang.Boolean.FALSE;
        n0Var5.getClass();
        n0Var5.i(null, bool5);
        return xtreamAuthResponse;
    }

    public final void b() {
        this.g.h(null);
        this.f15318i.h(null);
        this.f15319k.h(null);
        this.f15321m.h(null);
        this.f15323o.h(null);
        this.f15325q.h(null);
        p078i6.x xVar = p078i6.x.f23206h;
        V7.n0 n0Var = this.f15329u;
        n0Var.getClass();
        n0Var.i(null, xVar);
        V7.n0 n0Var2 = this.f15331w;
        n0Var2.getClass();
        n0Var2.i(null, xVar);
        V7.n0 n0Var3 = this.y;
        n0Var3.getClass();
        n0Var3.i(null, xVar);
        V7.n0 n0Var4 = this.f15333z;
        n0Var4.getClass();
        n0Var4.i(null, xVar);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        V7.n0 n0Var5 = this.f15327s;
        n0Var5.getClass();
        n0Var5.i(null, bool);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object c(p117n6.c cVar) {
        p005a5.q9 q9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.q9) {
            q9Var = (p005a5.q9) cVar;
            int i3 = q9Var.f15012k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9Var.f15012k = i3 - Integer.MIN_VALUE;
            } else {
                q9Var = new p005a5.q9(this, cVar);
            }
        } else {
            q9Var = new p005a5.q9(this, cVar);
        }
        java.lang.Object objI = q9Var.f15011i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = q9Var.f15012k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objI);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.f15319k.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            q9Var.f15010h = this;
            q9Var.f15012k = 1;
            objI = this.f15311a.i(q9Var);
            if (objI == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = q9Var.f15010h;
            com.google.common.util.concurrent.P.u0(objI);
        }
        java.util.List list2 = (java.util.List) objI;
        x9Var.f15319k.h(list2);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object d(p117n6.c cVar) {
        p005a5.r9 r9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.r9) {
            r9Var = (p005a5.r9) cVar;
            int i3 = r9Var.f15041k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r9Var.f15041k = i3 - Integer.MIN_VALUE;
            } else {
                r9Var = new p005a5.r9(this, cVar);
            }
        } else {
            r9Var = new p005a5.r9(this, cVar);
        }
        java.lang.Object objJ = r9Var.f15040i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = r9Var.f15041k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objJ);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.f15325q.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            r9Var.f15039h = this;
            r9Var.f15041k = 1;
            objJ = this.f15311a.j(r9Var);
            if (objJ == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = r9Var.f15039h;
            com.google.common.util.concurrent.P.u0(objJ);
        }
        java.util.List list2 = (java.util.List) objJ;
        x9Var.f15325q.h(list2);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object e(p117n6.c cVar) {
        p005a5.s9 s9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.s9) {
            s9Var = (p005a5.s9) cVar;
            int i3 = s9Var.f15086k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9Var.f15086k = i3 - Integer.MIN_VALUE;
            } else {
                s9Var = new p005a5.s9(this, cVar);
            }
        } else {
            s9Var = new p005a5.s9(this, cVar);
        }
        java.lang.Object objK = s9Var.f15085i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = s9Var.f15086k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objK);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.f15323o.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            s9Var.f15084h = this;
            s9Var.f15086k = 1;
            objK = this.f15311a.k(s9Var);
            if (objK == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = s9Var.f15084h;
            com.google.common.util.concurrent.P.u0(objK);
        }
        java.util.List list2 = (java.util.List) objK;
        x9Var.f15323o.h(list2);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object f(p117n6.c cVar) {
        p005a5.t9 t9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.t9) {
            t9Var = (p005a5.t9) cVar;
            int i3 = t9Var.f15114k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t9Var.f15114k = i3 - Integer.MIN_VALUE;
            } else {
                t9Var = new p005a5.t9(this, cVar);
            }
        } else {
            t9Var = new p005a5.t9(this, cVar);
        }
        java.lang.Object objL = t9Var.f15113i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = t9Var.f15114k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objL);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.f15318i.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            t9Var.f15112h = this;
            t9Var.f15114k = 1;
            objL = this.f15311a.l(t9Var);
            if (objL == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = t9Var.f15112h;
            com.google.common.util.concurrent.P.u0(objL);
        }
        java.util.List list2 = (java.util.List) objL;
        x9Var.f15318i.h(list2);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final java.lang.Object g(int i3, p117n6.c cVar) {
        p005a5.u9 u9Var;
        java.lang.String str;
        p005a5.x9 x9Var;
        java.util.List list;
        com.kiptv.core.model.E0 e6;
        java.lang.Integer num;
        if (cVar instanceof p005a5.u9) {
            u9Var = (p005a5.u9) cVar;
            int i9 = u9Var.f15159l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                u9Var.f15159l = i9 - Integer.MIN_VALUE;
            } else {
                u9Var = new p005a5.u9(this, cVar);
            }
        } else {
            u9Var = new p005a5.u9(this, cVar);
        }
        java.lang.Object obj = u9Var.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = u9Var.f15159l;
        int i11 = 1;
        if (i10 == 0) {
            com.google.common.util.concurrent.P.u0(obj);
            java.lang.String str2 = "series_info_" + i3;
            p005a5.o9 o9Var = (p005a5.o9) this.f15309A.get(str2);
            if (o9Var != null && java.lang.System.currentTimeMillis() - o9Var.f14903b < this.f15310B) {
                return o9Var.f14902a;
            }
            u9Var.f15156h = this;
            u9Var.f15157i = str2;
            u9Var.f15159l = 1;
            java.lang.Object objM = this.f15311a.m(i3, u9Var);
            if (objM == aVar) {
                return aVar;
            }
            obj = objM;
            str = str2;
            x9Var = this;
        } else {
            if (i10 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = u9Var.f15157i;
            x9Var = u9Var.f15156h;
            com.google.common.util.concurrent.P.u0(obj);
        }
        com.kiptv.core.model.I0 i12 = (com.kiptv.core.model.I0) obj;
        java.util.Map map = i12.f19803c;
        if (map != null) {
            java.util.Map linkedHashMap = new java.util.LinkedHashMap();
            java.util.Set setKeySet = map.keySet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                java.lang.Integer numZ0 = O7.x.z0((java.lang.String) it.next());
                if (numZ0 != null) {
                    arrayList.add(numZ0);
                }
            }
            java.util.List listH1 = p078i6.o.H1(arrayList);
            if (listH1.size() <= 1) {
                linkedHashMap = p078i6.x.f23206h;
            } else {
                java.util.Iterator it2 = listH1.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((java.lang.Number) it2.next()).intValue();
                    if (iIntValue > 1 && (list = (java.util.List) map.get(java.lang.String.valueOf(iIntValue))) != null && (e6 = (com.kiptv.core.model.E0) p078i6.o.j1(p078i6.o.I1(list, new C5.O1(11)))) != null) {
                        int iA = e6.a();
                        if (iA > 20) {
                            linkedHashMap.put(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(iA - 1));
                        } else {
                            java.util.List list2 = (java.util.List) map.get(java.lang.String.valueOf(iIntValue - 1));
                            if (list2 != null && !list2.isEmpty()) {
                                java.util.Iterator it3 = list2.iterator();
                                if (!it3.hasNext()) {
                                    throw new java.util.NoSuchElementException();
                                }
                                int iA2 = ((com.kiptv.core.model.E0) it3.next()).a();
                                while (it3.hasNext()) {
                                    int iA3 = ((com.kiptv.core.model.E0) it3.next()).a();
                                    if (iA2 < iA3) {
                                        iA2 = iA3;
                                    }
                                }
                                if (iA == iA2 + 1) {
                                    linkedHashMap.put(java.lang.Integer.valueOf(iIntValue), java.lang.Integer.valueOf(iA2));
                                }
                            }
                        }
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                if (!linkedHashMap.isEmpty()) {
                    java.util.LinkedHashMap linkedHashMapZ0 = p078i6.C.Z0(map);
                    for (java.util.Map.Entry entry : map.entrySet()) {
                        java.lang.String str3 = (java.lang.String) entry.getKey();
                        java.util.List<com.kiptv.core.model.E0> list3 = (java.util.List) entry.getValue();
                        java.lang.Integer numZ1 = O7.x.z0(str3);
                        if (numZ1 != null && (num = (java.lang.Integer) linkedHashMap.get(numZ1)) != null) {
                            int iIntValue2 = num.intValue();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList(p078i6.q.I0(list3, 10));
                            for (com.kiptv.core.model.E0 e9 : list3) {
                                java.lang.Integer numValueOf = java.lang.Integer.valueOf(java.lang.Math.max(e9.a() - iIntValue2, i11));
                                java.lang.String id = e9.f19731a;
                                kotlin.jvm.internal.m.e(id, "id");
                                arrayList2.add(new com.kiptv.core.model.E0(id, e9.f19732b, e9.f19733c, e9.f19734d, e9.f19735e, e9.f19736f, e9.g, numValueOf));
                                i11 = 1;
                            }
                            linkedHashMapZ0.put(str3, arrayList2);
                            i11 = 1;
                        }
                    }
                    map = linkedHashMapZ0;
                }
                i12 = new com.kiptv.core.model.I0(i12.f19801a, i12.f19802b, map);
            }
        }
        x9Var.f15309A.put(str, new p005a5.o9(i12, java.lang.System.currentTimeMillis()));
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object h(p117n6.c cVar) {
        p005a5.v9 v9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.v9) {
            v9Var = (p005a5.v9) cVar;
            int i3 = v9Var.f15221k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v9Var.f15221k = i3 - Integer.MIN_VALUE;
            } else {
                v9Var = new p005a5.v9(this, cVar);
            }
        } else {
            v9Var = new p005a5.v9(this, cVar);
        }
        java.lang.Object objN = v9Var.f15220i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = v9Var.f15221k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objN);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.g.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            v9Var.f15219h = this;
            v9Var.f15221k = 1;
            objN = this.f15311a.n(v9Var);
            if (objN == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = v9Var.f15219h;
            com.google.common.util.concurrent.P.u0(objN);
        }
        java.util.List list2 = (java.util.List) objN;
        x9Var.g.h(list2);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object i(p117n6.c cVar) {
        p005a5.w9 w9Var;
        p005a5.x9 x9Var;
        if (cVar instanceof p005a5.w9) {
            w9Var = (p005a5.w9) cVar;
            int i3 = w9Var.f15277k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w9Var.f15277k = i3 - Integer.MIN_VALUE;
            } else {
                w9Var = new p005a5.w9(this, cVar);
            }
        } else {
            w9Var = new p005a5.w9(this, cVar);
        }
        java.lang.Object objO = w9Var.f15276i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = w9Var.f15277k;
        if (i9 == 0) {
            com.google.common.util.concurrent.P.u0(objO);
            if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
                java.util.List list = (java.util.List) this.f15321m.getValue();
                return list == null ? p078i6.w.f23205h : list;
            }
            w9Var.f15275h = this;
            w9Var.f15277k = 1;
            objO = this.f15311a.o(w9Var);
            if (objO == aVar) {
                return aVar;
            }
            x9Var = this;
        } else {
            if (i9 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = w9Var.f15275h;
            com.google.common.util.concurrent.P.u0(objO);
        }
        java.util.List list2 = (java.util.List) objO;
        x9Var.f15321m.h(list2);
        return list2;
    }

    public final java.lang.String j(int i3, java.lang.String str) {
        if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
            return (java.lang.String) ((java.util.Map) this.f15329u.getValue()).get(java.lang.Integer.valueOf(i3));
        }
        Y4.v2 v2Var = this.f15311a;
        v2Var.getClass();
        Y4.X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw Y4.B2.f11545h;
        }
        return x9.f11774a + "/live/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final java.lang.String k(int i3, java.lang.String str) {
        if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
            return (java.lang.String) ((java.util.Map) this.f15329u.getValue()).get(java.lang.Integer.valueOf(i3));
        }
        Y4.v2 v2Var = this.f15311a;
        v2Var.getClass();
        Y4.X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw Y4.B2.f11545h;
        }
        return x9.f11774a + "/series/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final java.lang.String l(int i3, java.lang.String str) {
        if (((java.lang.Boolean) this.f15327s.getValue()).booleanValue()) {
            return (java.lang.String) ((java.util.Map) this.f15329u.getValue()).get(java.lang.Integer.valueOf(i3));
        }
        Y4.v2 v2Var = this.f15311a;
        v2Var.getClass();
        Y4.X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw Y4.B2.f11545h;
        }
        return x9.f11774a + "/movie/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final void m(java.util.List vodCategories, java.util.List vodStreams, java.util.List seriesCategories, java.util.List seriesStreams, java.util.List liveCategories, java.util.List liveStreams, java.util.Map map, java.util.Map map2) {
        kotlin.jvm.internal.m.e(vodCategories, "vodCategories");
        kotlin.jvm.internal.m.e(vodStreams, "vodStreams");
        kotlin.jvm.internal.m.e(seriesCategories, "seriesCategories");
        kotlin.jvm.internal.m.e(seriesStreams, "seriesStreams");
        kotlin.jvm.internal.m.e(liveCategories, "liveCategories");
        kotlin.jvm.internal.m.e(liveStreams, "liveStreams");
        V7.n0 n0Var = this.g;
        n0Var.getClass();
        n0Var.i(null, vodCategories);
        V7.n0 n0Var2 = this.f15318i;
        n0Var2.getClass();
        n0Var2.i(null, seriesCategories);
        V7.n0 n0Var3 = this.f15319k;
        n0Var3.getClass();
        n0Var3.i(null, liveCategories);
        V7.n0 n0Var4 = this.f15321m;
        n0Var4.getClass();
        n0Var4.i(null, vodStreams);
        V7.n0 n0Var5 = this.f15323o;
        n0Var5.getClass();
        n0Var5.i(null, seriesStreams);
        V7.n0 n0Var6 = this.f15325q;
        n0Var6.getClass();
        n0Var6.i(null, liveStreams);
        V7.n0 n0Var7 = this.f15329u;
        n0Var7.getClass();
        n0Var7.i(null, map);
        V7.n0 n0Var8 = this.f15331w;
        n0Var8.getClass();
        n0Var8.i(null, map2);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        V7.n0 n0Var9 = this.f15327s;
        n0Var9.getClass();
        n0Var9.i(null, bool);
        V7.n0 n0Var10 = this.f15312b;
        n0Var10.getClass();
        n0Var10.i(null, bool);
    }
}

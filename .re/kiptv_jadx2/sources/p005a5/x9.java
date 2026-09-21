package p005a5;

import C5.O1;
import V7.W;
import V7.n0;
import V7.r;
import Y4.B2;
import Y4.X1;
import Y4.v2;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.E0;
import com.kiptv.core.model.I0;
import com.kiptv.core.model.XtreamAuthResponse;
import io.ktor.client.HttpClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import p078i6.C;
import p078i6.o;
import p078i6.q;
import p078i6.w;
import p078i6.x;
import p109m6.a;
import p117n6.c;
import p162s8.d;

public final class x9 {

    public final ConcurrentHashMap f15309A;

    public final long f15310B;

    public final v2 f15311a;

    public final n0 f15312b;

    public final n0 f15313c;

    public final n0 f15314d;

    public final n0 f15315e;

    public final n0 f15316f;
    public final n0 g;

    public final W f15317h;

    public final n0 f15318i;
    public final W j;

    public final n0 f15319k;

    public final W f15320l;

    public final n0 f15321m;

    public final W f15322n;

    public final n0 f15323o;

    public final W f15324p;

    public final n0 f15325q;

    public final W f15326r;

    public final n0 f15327s;

    public final W f15328t;

    public final n0 f15329u;

    public final W f15330v;

    public final n0 f15331w;

    public final W f15332x;
    public final n0 y;

    public final n0 f15333z;

    public x9(v2 xtreamApiClient, HttpClient httpClient, d json) {
        m.e(xtreamApiClient, "xtreamApiClient");
        m.e(httpClient, "httpClient");
        m.e(json, "json");
        this.f15311a = xtreamApiClient;
        Boolean bool = Boolean.FALSE;
        this.f15312b = r.b(bool);
        this.f15313c = r.b(null);
        this.f15314d = r.b(null);
        this.f15315e = r.b(bool);
        this.f15316f = r.b(null);
        n0 n0VarB = r.b(null);
        this.g = n0VarB;
        this.f15317h = new W(n0VarB);
        n0 n0VarB2 = r.b(null);
        this.f15318i = n0VarB2;
        this.j = new W(n0VarB2);
        n0 n0VarB3 = r.b(null);
        this.f15319k = n0VarB3;
        this.f15320l = new W(n0VarB3);
        n0 n0VarB4 = r.b(null);
        this.f15321m = n0VarB4;
        this.f15322n = new W(n0VarB4);
        n0 n0VarB5 = r.b(null);
        this.f15323o = n0VarB5;
        this.f15324p = new W(n0VarB5);
        n0 n0VarB6 = r.b(null);
        this.f15325q = n0VarB6;
        this.f15326r = new W(n0VarB6);
        n0 n0VarB7 = r.b(bool);
        this.f15327s = n0VarB7;
        this.f15328t = new W(n0VarB7);
        x xVar = x.f23206h;
        n0 n0VarB8 = r.b(xVar);
        this.f15329u = n0VarB8;
        this.f15330v = new W(n0VarB8);
        n0 n0VarB9 = r.b(xVar);
        this.f15331w = n0VarB9;
        this.f15332x = new W(n0VarB9);
        this.y = r.b(xVar);
        this.f15333z = r.b(xVar);
        this.f15309A = new ConcurrentHashMap();
        this.f15310B = 300000L;
    }

    public final Object a(c cVar) throws Exception {
        p9 p9Var;
        x9 x9Var;
        if (cVar instanceof p9) {
            p9Var = (p9) cVar;
            int i3 = p9Var.f14958k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                p9Var.f14958k = i3 - Integer.MIN_VALUE;
            } else {
                p9Var = new p9(this, cVar);
            }
        } else {
            p9Var = new p9(this, cVar);
        }
        Object objB = p9Var.f14957i;
        a aVar = a.f25430h;
        int i9 = p9Var.f14958k;
        if (i9 == 0) {
            P.u0(objB);
            Boolean bool = Boolean.TRUE;
            n0 n0Var = this.f15315e;
            n0Var.getClass();
            n0Var.i(null, bool);
            this.f15316f.h(null);
            try {
                v2 v2Var = this.f15311a;
                p9Var.f14956h = this;
                p9Var.f14958k = 1;
                objB = v2Var.b(p9Var);
                if (objB == aVar) {
                    return aVar;
                }
                x9Var = this;
            } catch (Exception e6) {
                e = e6;
                x9Var = this;
                n0 n0Var2 = x9Var.f15315e;
                Boolean bool2 = Boolean.FALSE;
                n0Var2.getClass();
                n0Var2.i(null, bool2);
                x9Var.f15316f.h(e.getMessage());
                throw e;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = p9Var.f14956h;
            try {
                P.u0(objB);
            } catch (Exception e9) {
                e = e9;
                n0 n0Var3 = x9Var.f15315e;
                Boolean bool3 = Boolean.FALSE;
                n0Var3.getClass();
                n0Var3.i(null, bool3);
                x9Var.f15316f.h(e.getMessage());
                throw e;
            }
        }
        XtreamAuthResponse xtreamAuthResponse = (XtreamAuthResponse) objB;
        x9Var.f15314d.h(xtreamAuthResponse.f20647a);
        x9Var.f15313c.h(xtreamAuthResponse.f20648b);
        n0 n0Var4 = x9Var.f15312b;
        Boolean bool4 = Boolean.TRUE;
        n0Var4.getClass();
        n0Var4.i(null, bool4);
        n0 n0Var5 = x9Var.f15315e;
        Boolean bool5 = Boolean.FALSE;
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
        x xVar = x.f23206h;
        n0 n0Var = this.f15329u;
        n0Var.getClass();
        n0Var.i(null, xVar);
        n0 n0Var2 = this.f15331w;
        n0Var2.getClass();
        n0Var2.i(null, xVar);
        n0 n0Var3 = this.y;
        n0Var3.getClass();
        n0Var3.i(null, xVar);
        n0 n0Var4 = this.f15333z;
        n0Var4.getClass();
        n0Var4.i(null, xVar);
        Boolean bool = Boolean.FALSE;
        n0 n0Var5 = this.f15327s;
        n0Var5.getClass();
        n0Var5.i(null, bool);
    }

    public final Object c(c cVar) throws Throwable {
        q9 q9Var;
        x9 x9Var;
        if (cVar instanceof q9) {
            q9Var = (q9) cVar;
            int i3 = q9Var.f15012k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q9Var.f15012k = i3 - Integer.MIN_VALUE;
            } else {
                q9Var = new q9(this, cVar);
            }
        } else {
            q9Var = new q9(this, cVar);
        }
        Object objI = q9Var.f15011i;
        a aVar = a.f25430h;
        int i9 = q9Var.f15012k;
        if (i9 == 0) {
            P.u0(objI);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.f15319k.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = q9Var.f15010h;
            P.u0(objI);
        }
        List list2 = (List) objI;
        x9Var.f15319k.h(list2);
        return list2;
    }

    public final Object d(c cVar) throws Throwable {
        r9 r9Var;
        x9 x9Var;
        if (cVar instanceof r9) {
            r9Var = (r9) cVar;
            int i3 = r9Var.f15041k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r9Var.f15041k = i3 - Integer.MIN_VALUE;
            } else {
                r9Var = new r9(this, cVar);
            }
        } else {
            r9Var = new r9(this, cVar);
        }
        Object objJ = r9Var.f15040i;
        a aVar = a.f25430h;
        int i9 = r9Var.f15041k;
        if (i9 == 0) {
            P.u0(objJ);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.f15325q.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = r9Var.f15039h;
            P.u0(objJ);
        }
        List list2 = (List) objJ;
        x9Var.f15325q.h(list2);
        return list2;
    }

    public final Object e(c cVar) throws Throwable {
        s9 s9Var;
        x9 x9Var;
        if (cVar instanceof s9) {
            s9Var = (s9) cVar;
            int i3 = s9Var.f15086k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s9Var.f15086k = i3 - Integer.MIN_VALUE;
            } else {
                s9Var = new s9(this, cVar);
            }
        } else {
            s9Var = new s9(this, cVar);
        }
        Object objK = s9Var.f15085i;
        a aVar = a.f25430h;
        int i9 = s9Var.f15086k;
        if (i9 == 0) {
            P.u0(objK);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.f15323o.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = s9Var.f15084h;
            P.u0(objK);
        }
        List list2 = (List) objK;
        x9Var.f15323o.h(list2);
        return list2;
    }

    public final Object f(c cVar) throws Throwable {
        t9 t9Var;
        x9 x9Var;
        if (cVar instanceof t9) {
            t9Var = (t9) cVar;
            int i3 = t9Var.f15114k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t9Var.f15114k = i3 - Integer.MIN_VALUE;
            } else {
                t9Var = new t9(this, cVar);
            }
        } else {
            t9Var = new t9(this, cVar);
        }
        Object objL = t9Var.f15113i;
        a aVar = a.f25430h;
        int i9 = t9Var.f15114k;
        if (i9 == 0) {
            P.u0(objL);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.f15318i.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = t9Var.f15112h;
            P.u0(objL);
        }
        List list2 = (List) objL;
        x9Var.f15318i.h(list2);
        return list2;
    }

    public final Object g(int i3, c cVar) {
        u9 u9Var;
        String str;
        x9 x9Var;
        List list;
        E0 e6;
        Integer num;
        if (cVar instanceof u9) {
            u9Var = (u9) cVar;
            int i9 = u9Var.f15159l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                u9Var.f15159l = i9 - Integer.MIN_VALUE;
            } else {
                u9Var = new u9(this, cVar);
            }
        } else {
            u9Var = new u9(this, cVar);
        }
        Object obj = u9Var.j;
        a aVar = a.f25430h;
        int i10 = u9Var.f15159l;
        int i11 = 1;
        if (i10 == 0) {
            P.u0(obj);
            String str2 = "series_info_" + i3;
            o9 o9Var = (o9) this.f15309A.get(str2);
            if (o9Var != null && System.currentTimeMillis() - o9Var.f14903b < this.f15310B) {
                return o9Var.f14902a;
            }
            u9Var.f15156h = this;
            u9Var.f15157i = str2;
            u9Var.f15159l = 1;
            Object objM = this.f15311a.m(i3, u9Var);
            if (objM == aVar) {
                return aVar;
            }
            obj = objM;
            str = str2;
            x9Var = this;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = u9Var.f15157i;
            x9Var = u9Var.f15156h;
            P.u0(obj);
        }
        I0 i12 = (I0) obj;
        Map map = i12.f19803c;
        if (map != null) {
            Map linkedHashMap = new LinkedHashMap();
            Set setKeySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                Integer numZ0 = O7.x.z0((String) it.next());
                if (numZ0 != null) {
                    arrayList.add(numZ0);
                }
            }
            List listH1 = o.H1(arrayList);
            if (listH1.size() <= 1) {
                linkedHashMap = x.f23206h;
            } else {
                Iterator it2 = listH1.iterator();
                while (it2.hasNext()) {
                    int iIntValue = ((Number) it2.next()).intValue();
                    if (iIntValue > 1 && (list = (List) map.get(String.valueOf(iIntValue))) != null && (e6 = (E0) o.j1(o.I1(list, new O1(11)))) != null) {
                        int iA = e6.a();
                        if (iA > 20) {
                            linkedHashMap.put(Integer.valueOf(iIntValue), Integer.valueOf(iA - 1));
                        } else {
                            List list2 = (List) map.get(String.valueOf(iIntValue - 1));
                            if (list2 != null && !list2.isEmpty()) {
                                Iterator it3 = list2.iterator();
                                if (!it3.hasNext()) {
                                    throw new NoSuchElementException();
                                }
                                int iA2 = ((E0) it3.next()).a();
                                while (it3.hasNext()) {
                                    int iA3 = ((E0) it3.next()).a();
                                    if (iA2 < iA3) {
                                        iA2 = iA3;
                                    }
                                }
                                if (iA == iA2 + 1) {
                                    linkedHashMap.put(Integer.valueOf(iIntValue), Integer.valueOf(iA2));
                                }
                            }
                        }
                    }
                }
            }
            if (!linkedHashMap.isEmpty()) {
                if (!linkedHashMap.isEmpty()) {
                    LinkedHashMap linkedHashMapZ0 = C.Z0(map);
                    for (Map.Entry entry : map.entrySet()) {
                        String str3 = (String) entry.getKey();
                        List<E0> list3 = (List) entry.getValue();
                        Integer numZ1 = O7.x.z0(str3);
                        if (numZ1 != null && (num = (Integer) linkedHashMap.get(numZ1)) != null) {
                            int iIntValue2 = num.intValue();
                            ArrayList arrayList2 = new ArrayList(q.I0(list3, 10));
                            for (E0 e9 : list3) {
                                Integer numValueOf = Integer.valueOf(Math.max(e9.a() - iIntValue2, i11));
                                String id = e9.f19731a;
                                m.e(id, "id");
                                arrayList2.add(new E0(id, e9.f19732b, e9.f19733c, e9.f19734d, e9.f19735e, e9.f19736f, e9.g, numValueOf));
                                i11 = 1;
                            }
                            linkedHashMapZ0.put(str3, arrayList2);
                            i11 = 1;
                        }
                    }
                    map = linkedHashMapZ0;
                }
                i12 = new I0(i12.f19801a, i12.f19802b, map);
            }
        }
        x9Var.f15309A.put(str, new o9(i12, System.currentTimeMillis()));
        return i12;
    }

    public final Object h(c cVar) throws Throwable {
        v9 v9Var;
        x9 x9Var;
        if (cVar instanceof v9) {
            v9Var = (v9) cVar;
            int i3 = v9Var.f15221k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v9Var.f15221k = i3 - Integer.MIN_VALUE;
            } else {
                v9Var = new v9(this, cVar);
            }
        } else {
            v9Var = new v9(this, cVar);
        }
        Object objN = v9Var.f15220i;
        a aVar = a.f25430h;
        int i9 = v9Var.f15221k;
        if (i9 == 0) {
            P.u0(objN);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.g.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = v9Var.f15219h;
            P.u0(objN);
        }
        List list2 = (List) objN;
        x9Var.g.h(list2);
        return list2;
    }

    public final Object i(c cVar) throws Throwable {
        w9 w9Var;
        x9 x9Var;
        if (cVar instanceof w9) {
            w9Var = (w9) cVar;
            int i3 = w9Var.f15277k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w9Var.f15277k = i3 - Integer.MIN_VALUE;
            } else {
                w9Var = new w9(this, cVar);
            }
        } else {
            w9Var = new w9(this, cVar);
        }
        Object objO = w9Var.f15276i;
        a aVar = a.f25430h;
        int i9 = w9Var.f15277k;
        if (i9 == 0) {
            P.u0(objO);
            if (((Boolean) this.f15327s.getValue()).booleanValue()) {
                List list = (List) this.f15321m.getValue();
                return list == null ? w.f23205h : list;
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
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            x9Var = w9Var.f15275h;
            P.u0(objO);
        }
        List list2 = (List) objO;
        x9Var.f15321m.h(list2);
        return list2;
    }

    public final String j(int i3, String str) {
        if (((Boolean) this.f15327s.getValue()).booleanValue()) {
            return (String) ((Map) this.f15329u.getValue()).get(Integer.valueOf(i3));
        }
        v2 v2Var = this.f15311a;
        v2Var.getClass();
        X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw B2.f11545h;
        }
        return x9.f11774a + "/live/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final String k(int i3, String str) {
        if (((Boolean) this.f15327s.getValue()).booleanValue()) {
            return (String) ((Map) this.f15329u.getValue()).get(Integer.valueOf(i3));
        }
        v2 v2Var = this.f15311a;
        v2Var.getClass();
        X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw B2.f11545h;
        }
        return x9.f11774a + "/series/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final String l(int i3, String str) {
        if (((Boolean) this.f15327s.getValue()).booleanValue()) {
            return (String) ((Map) this.f15329u.getValue()).get(Integer.valueOf(i3));
        }
        v2 v2Var = this.f15311a;
        v2Var.getClass();
        X1 x9 = v2Var.f12123e;
        if (x9 == null) {
            throw B2.f11545h;
        }
        return x9.f11774a + "/movie/" + x9.f11775b + "/" + x9.f11776c + "/" + i3 + "." + str;
    }

    public final void m(List vodCategories, List vodStreams, List seriesCategories, List seriesStreams, List liveCategories, List liveStreams, Map map, Map map2) {
        m.e(vodCategories, "vodCategories");
        m.e(vodStreams, "vodStreams");
        m.e(seriesCategories, "seriesCategories");
        m.e(seriesStreams, "seriesStreams");
        m.e(liveCategories, "liveCategories");
        m.e(liveStreams, "liveStreams");
        n0 n0Var = this.g;
        n0Var.getClass();
        n0Var.i(null, vodCategories);
        n0 n0Var2 = this.f15318i;
        n0Var2.getClass();
        n0Var2.i(null, seriesCategories);
        n0 n0Var3 = this.f15319k;
        n0Var3.getClass();
        n0Var3.i(null, liveCategories);
        n0 n0Var4 = this.f15321m;
        n0Var4.getClass();
        n0Var4.i(null, vodStreams);
        n0 n0Var5 = this.f15323o;
        n0Var5.getClass();
        n0Var5.i(null, seriesStreams);
        n0 n0Var6 = this.f15325q;
        n0Var6.getClass();
        n0Var6.i(null, liveStreams);
        n0 n0Var7 = this.f15329u;
        n0Var7.getClass();
        n0Var7.i(null, map);
        n0 n0Var8 = this.f15331w;
        n0Var8.getClass();
        n0Var8.i(null, map2);
        Boolean bool = Boolean.TRUE;
        n0 n0Var9 = this.f15327s;
        n0Var9.getClass();
        n0Var9.i(null, bool);
        n0 n0Var10 = this.f15312b;
        n0Var10.getClass();
        n0Var10.i(null, bool);
    }
}

package Y4;

import android.util.Log;
import io.ktor.client.HttpClient;
import io.ktor.client.request.HttpRequestBuilder;
import io.ktor.client.request.HttpRequestKt;
import io.ktor.client.statement.HttpResponse;
import io.ktor.client.statement.HttpResponseKt;
import io.ktor.client.statement.HttpStatement;
import io.ktor.http.HttpMethod;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class C1075g {
    public static final C1051a Companion = new C1051a();
    public static final O7.o j = new O7.o("^\\s*[A-Za-z]{2,3}\\s*[:|\\\\-]\\s*");

    public static final O7.o f11886k = new O7.o("\\[.*?]");

    public static final O7.o f11887l = new O7.o("\\(.*?\\)");

    public static final O7.o f11888m;

    public static final O7.o f11889n;

    public static final O7.o f11890o;

    public static final O7.o f11891p;

    public final HttpClient f11892a;

    public final p162s8.d f11893b;

    public final p132p5.a f11894c;

    public Object f11895d;

    public Object f11896e;

    public boolean f11897f;
    public Map g;

    public Map f11898h;

    public boolean f11899i;

    static {
        O7.p[] pVarArr = O7.p.f8061h;
        f11888m = new O7.o("\\b(4k|uhd|2160p|1080p|fhd|720p|hd|sd|hevc|h265|h\\.265)\\b", 0);
        f11889n = new O7.o("\\s*\\+\\d+h?\\s*$");
        f11890o = new O7.o("\\b(backup|bak)\\b", 0);
        f11891p = new O7.o("\\s+");
    }

    public C1075g(HttpClient httpClient, p162s8.d dVar, p132p5.a aVar) {
        this.f11892a = httpClient;
        this.f11893b = dVar;
        this.f11894c = aVar;
        p078i6.x xVar = p078i6.x.f23206h;
        this.f11895d = xVar;
        this.f11896e = xVar;
        this.g = xVar;
        this.f11898h = xVar;
    }

    public static final void e(ArrayList arrayList, LinkedHashSet linkedHashSet, List list) {
        if (list == null) {
            list = p078i6.w.f23205h;
        }
        for (String str : list) {
            if (arrayList.size() >= 20) {
                return;
            }
            if (linkedHashSet.add(str)) {
                arrayList.add(str);
            }
        }
    }

    public final String a(String str) {
        this.f11894c.getClass();
        return "https://image.tmdb.org/t/p/w154" + str;
    }

    public final ArrayList b(String channelName, String str, String str2) {
        double d4;
        String strA;
        ?? arrayList;
        kotlin.jvm.internal.m.e(channelName, "channelName");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        if (str != null) {
            String str3 = !O7.q.N0(str) ? str : null;
            if (str3 != null && linkedHashSet.add(str3)) {
                arrayList2.add(str3);
            }
        }
        if (str2 != null) {
            String str4 = !O7.q.N0(str2) ? str2 : null;
            if (str4 != null) {
                Companion.getClass();
                String strB = C1051a.b(str4);
                if (linkedHashSet.add(strB)) {
                    arrayList2.add(strB);
                }
            }
        }
        Companion.getClass();
        String strA2 = C1051a.a(channelName);
        if (strA2.length() > 0) {
            boolean z6 = false;
            if (this.f11897f) {
                String strA3 = C1051a.a(channelName);
                if (strA3.length() != 0) {
                    String str5 = (String) this.f11895d.get(strA3);
                    if (str5 != null) {
                        strA = a(str5);
                    } else {
                        String str6 = (String) this.f11896e.get(O7.x.w0(strA3, ServerSentEventKt.SPACE, ""));
                        if (str6 != null) {
                            strA = a(str6);
                        } else {
                            Iterator it = this.f11895d.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Map.Entry entry = (Map.Entry) it.next();
                                    String str7 = (String) entry.getKey();
                                    String str8 = (String) entry.getValue();
                                    if (str7.length() >= 2 && strA3.length() >= 2) {
                                        d4 = 0.5d;
                                        if (((double) Math.min(str7.length(), strA3.length())) / ((double) Math.max(str7.length(), strA3.length())) >= 0.5d && (O7.q.B0(str7, strA3, false) || O7.q.B0(strA3, str7, false))) {
                                            strA = a(str8);
                                        }
                                    }
                                } else {
                                    d4 = 0.5d;
                                    strA = null;
                                }
                            }
                        }
                    }
                    d4 = 0.5d;
                } else {
                    d4 = 0.5d;
                    strA = null;
                }
            } else {
                d4 = 0.5d;
                strA = null;
            }
            if (strA != null && linkedHashSet.add(strA) && arrayList2.size() < 20) {
                arrayList2.add(strA);
            }
            if (this.f11899i) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                ArrayList arrayList3 = new ArrayList();
                e(arrayList3, linkedHashSet2, (List) this.g.get(strA2));
                if (arrayList3.size() < 20) {
                    e(arrayList3, linkedHashSet2, (List) this.f11898h.get(O7.x.w0(strA2, ServerSentEventKt.SPACE, "")));
                }
                if (arrayList3.size() < 20) {
                    int i3 = 3;
                    if (strA2.length() >= 3) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Map.Entry entry2 : this.g.entrySet()) {
                            String str9 = (String) entry2.getKey();
                            List list = (List) entry2.getValue();
                            if (str9.length() >= i3 && (O7.q.B0(str9, strA2, z6) || O7.q.B0(strA2, str9, z6))) {
                                if (((double) Math.min(str9.length(), strA2.length())) / ((double) Math.max(str9.length(), strA2.length())) >= d4) {
                                    int iAbs = Math.abs(str9.length() - strA2.length());
                                    Iterator it2 = list.iterator();
                                    while (it2.hasNext()) {
                                        arrayList4.add(new p070h6.q(Integer.valueOf(iAbs), str9, (String) it2.next()));
                                    }
                                }
                                i3 = 3;
                                z6 = false;
                            }
                        }
                        if (arrayList4.size() > 1) {
                            p078i6.t.L0(new C5.O1(22), arrayList4);
                        }
                        Iterator it3 = arrayList4.iterator();
                        while (it3.hasNext()) {
                            String str10 = (String) ((p070h6.q) it3.next()).j;
                            if (arrayList3.size() >= 20) {
                                break;
                            }
                            if (linkedHashSet2.add(str10)) {
                                arrayList3.add(str10);
                            }
                        }
                    }
                }
                arrayList = new ArrayList(p078i6.q.I0(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    arrayList.add("https://cdn.jsdelivr.net/gh/tv-logo/tv-logos@main/" + ((String) it4.next()));
                }
            } else {
                arrayList = p078i6.w.f23205h;
            }
            for (String str11 : arrayList) {
                if (arrayList2.size() >= 20) {
                    break;
                }
                if (linkedHashSet.add(str11)) {
                    arrayList2.add(str11);
                }
            }
        }
        return arrayList2;
    }

    public final Object c(p117n6.c cVar) throws Throwable {
        C1055b c1055b;
        C1075g c1075g;
        Map map;
        Z7.e eVar;
        C1059c c1059c;
        Map map2;
        C1075g c1075g2;
        if (cVar instanceof C1055b) {
            c1055b = (C1055b) cVar;
            int i3 = c1055b.f11814l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1055b.f11814l = i3 - Integer.MIN_VALUE;
            } else {
                c1055b = new C1055b(this, cVar);
            }
        } else {
            c1055b = new C1055b(this, cVar);
        }
        Object objExecute = c1055b.j;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1055b.f11814l;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                HttpClient httpClient = this.f11892a;
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, "https://jaruba.github.io/channel-logos/logo_paths.json");
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                c1055b.f11811h = this;
                c1055b.f11814l = 1;
                objExecute = httpStatement.execute(c1055b);
                if (objExecute != aVar) {
                    c1075g = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                c1075g = c1055b.f11811h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    c1075g = c1055b.f11811h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    Z7.e eVar2 = S7.M.f9549a;
                    C1063d c1063d = new C1063d(c1075g, (String) objExecute, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11814l = 3;
                    objExecute = S7.C.K(eVar2, c1063d, c1055b);
                    if (objExecute == aVar) {
                        map = (Map) objExecute;
                        eVar = S7.M.f9549a;
                        c1059c = new C1059c(c1075g, map, null);
                        c1055b.f11811h = c1075g;
                        c1055b.f11812i = map;
                        c1055b.f11814l = 4;
                        if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                            map2 = map;
                            c1075g2 = c1075g;
                        }
                    }
                    return aVar;
                }
                if (i9 == 3) {
                    c1075g = c1055b.f11811h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    map = (Map) objExecute;
                    eVar = S7.M.f9549a;
                    c1059c = new C1059c(c1075g, map, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11812i = map;
                    c1055b.f11814l = 4;
                    if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                        map2 = map;
                        c1075g2 = c1075g;
                    }
                    return aVar;
                }
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map2 = c1055b.f11812i;
                c1075g2 = c1055b.f11811h;
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            c1075g2.getClass();
            c1075g2.f11897f = true;
            Log.d("ChannelLogoClient", "Loaded " + map2.size() + " channel logo mappings");
            return p070h6.A.f22523a;
            c1055b.f11811h = c1075g;
            c1055b.f11814l = 2;
            objExecute = HttpResponseKt.bodyAsText$default((HttpResponse) objExecute, null, c1055b, 1, null);
            if (objExecute != aVar) {
                Z7.e eVar3 = S7.M.f9549a;
                C1063d c1063d2 = new C1063d(c1075g, (String) objExecute, null);
                c1055b.f11811h = c1075g;
                c1055b.f11814l = 3;
                objExecute = S7.C.K(eVar3, c1063d2, c1055b);
                if (objExecute == aVar) {
                    map = (Map) objExecute;
                    eVar = S7.M.f9549a;
                    c1059c = new C1059c(c1075g, map, null);
                    c1055b.f11811h = c1075g;
                    c1055b.f11812i = map;
                    c1055b.f11814l = 4;
                    if (S7.C.K(eVar, c1059c, c1055b) != aVar) {
                        map2 = map;
                        c1075g2 = c1075g;
                        c1075g2.getClass();
                        c1075g2.f11897f = true;
                        Log.d("ChannelLogoClient", "Loaded " + map2.size() + " channel logo mappings");
                        return p070h6.A.f22523a;
                    }
                }
            }
            return aVar;
        } catch (Exception e6) {
            Log.e("ChannelLogoClient", "Failed to load channel logo mapping: " + e6.getMessage());
        }
    }

    public final Object d(p117n6.c cVar) throws Throwable {
        C1067e c1067e;
        C1075g c1075g;
        C1075g c1075g2;
        if (cVar instanceof C1067e) {
            c1067e = (C1067e) cVar;
            int i3 = c1067e.f11859k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c1067e.f11859k = i3 - Integer.MIN_VALUE;
            } else {
                c1067e = new C1067e(this, cVar);
            }
        } else {
            c1067e = new C1067e(this, cVar);
        }
        Object objExecute = c1067e.f11858i;
        p109m6.a aVar = p109m6.a.f25430h;
        int i9 = c1067e.f11859k;
        try {
            if (i9 == 0) {
                com.google.common.util.concurrent.P.u0(objExecute);
                HttpClient httpClient = this.f11892a;
                HttpRequestBuilder httpRequestBuilder = new HttpRequestBuilder();
                HttpRequestKt.url(httpRequestBuilder, "https://kiptv.app/tvlogos_manifest.json");
                httpRequestBuilder.setMethod(HttpMethod.INSTANCE.getGet());
                HttpStatement httpStatement = new HttpStatement(httpRequestBuilder, httpClient);
                c1067e.f11857h = this;
                c1067e.f11859k = 1;
                objExecute = httpStatement.execute(c1067e);
                if (objExecute != aVar) {
                    c1075g = this;
                }
                return aVar;
            }
            if (i9 == 1) {
                c1075g = c1067e.f11857h;
                com.google.common.util.concurrent.P.u0(objExecute);
            } else {
                if (i9 == 2) {
                    c1075g = c1067e.f11857h;
                    com.google.common.util.concurrent.P.u0(objExecute);
                    Z7.e eVar = S7.M.f9549a;
                    C1071f c1071f = new C1071f(c1075g, (String) objExecute, null);
                    c1067e.f11857h = c1075g;
                    c1067e.f11859k = 3;
                    objExecute = S7.C.K(eVar, c1071f, c1067e);
                    if (objExecute != aVar) {
                        c1075g2 = c1075g;
                    }
                    return aVar;
                }
                if (i9 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1075g2 = c1067e.f11857h;
                com.google.common.util.concurrent.P.u0(objExecute);
            }
            p070h6.q qVar = (p070h6.q) objExecute;
            Map map = (Map) qVar.f22547h;
            Map map2 = (Map) qVar.f22548i;
            Map map3 = (Map) qVar.j;
            c1075g2.g = map2;
            c1075g2.f11898h = map3;
            c1075g2.f11899i = true;
            Log.d("ChannelLogoClient", "Loaded " + map.size() + " tv-logos mappings");
            return p070h6.A.f22523a;
            c1067e.f11857h = c1075g;
            c1067e.f11859k = 2;
            objExecute = HttpResponseKt.bodyAsText$default((HttpResponse) objExecute, null, c1067e, 1, null);
            if (objExecute != aVar) {
                Z7.e eVar2 = S7.M.f9549a;
                C1071f c1071f2 = new C1071f(c1075g, (String) objExecute, null);
                c1067e.f11857h = c1075g;
                c1067e.f11859k = 3;
                objExecute = S7.C.K(eVar2, c1071f2, c1067e);
                if (objExecute != aVar) {
                    c1075g2 = c1075g;
                    p070h6.q qVar2 = (p070h6.q) objExecute;
                    Map map4 = (Map) qVar2.f22547h;
                    Map map5 = (Map) qVar2.f22548i;
                    Map map6 = (Map) qVar2.j;
                    c1075g2.g = map5;
                    c1075g2.f11898h = map6;
                    c1075g2.f11899i = true;
                    Log.d("ChannelLogoClient", "Loaded " + map4.size() + " tv-logos mappings");
                    return p070h6.A.f22523a;
                }
            }
            return aVar;
        } catch (Exception e6) {
            Log.e("ChannelLogoClient", "Failed to load tv-logos manifest: " + e6.getMessage());
        }
    }
}

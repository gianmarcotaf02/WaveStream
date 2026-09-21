package p005a5;

import J.C0537c;
import N7.h;
import O7.q;
import O7.x;
import S7.C;
import S7.C0901q;
import S7.InterfaceC0900p;
import V7.W;
import V7.n0;
import V7.r;
import Y4.v2;
import android.util.Log;
import com.google.common.util.concurrent.P;
import com.google.crypto.tink.shaded.protobuf.AbstractC1911f;
import com.kiptv.core.model.B0;
import com.kiptv.core.model.C1947i;
import com.kiptv.core.model.C1949j;
import com.kiptv.core.model.C1951k;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.PlaylistSettings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.m;
import p028c8.d;
import p034d5.c;
import p070h6.k;
import p078i6.o;
import p109m6.a;
import p121o0.p;

public final class O {
    public static final J Companion = new J();

    public final v2 f13716a;

    public final C1291h4 f13717b;

    public final n9 f13718c;

    public final ConcurrentHashMap f13719d;

    public final c f13720e;

    public final d f13721f;
    public final LinkedHashMap g;

    public final n0 f13722h;

    public final W f13723i;

    public O(v2 xtreamApiClient, C1291h4 settingsRepository, n9 xmlTvRepository) {
        m.e(xtreamApiClient, "xtreamApiClient");
        m.e(settingsRepository, "settingsRepository");
        m.e(xmlTvRepository, "xmlTvRepository");
        this.f13716a = xtreamApiClient;
        this.f13717b = settingsRepository;
        this.f13718c = xmlTvRepository;
        this.f13719d = new ConcurrentHashMap();
        this.f13720e = new c(5, 1000L);
        this.f13721f = new d();
        this.g = new LinkedHashMap();
        n0 n0VarB = r.b(0L);
        this.f13722h = n0VarB;
        this.f13723i = new W(n0VarB);
    }

    public static Object g(O o8, int i3, String str, int i9, int i10, p117n6.c cVar, int i11) {
        if ((i11 & 8) != 0) {
            i10 = 0;
        }
        return o8.f(i3, i9, i10, str, null, cVar);
    }

    public static C1949j j(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            EPGProgram ePGProgram = (EPGProgram) obj;
            long j = ePGProgram.f19742e;
            long j9 = ePGProgram.f19741d;
            if (j > j9 && j - j9 <= 43200000) {
                arrayList.add(obj);
            }
        }
        List<EPGProgram> listI1 = o.I1(arrayList, new C1951k(0));
        ArrayList arrayList2 = new ArrayList(listI1.size());
        for (EPGProgram ePGProgram2 : listI1) {
            EPGProgram ePGProgram3 = (EPGProgram) o.s1(arrayList2);
            if (ePGProgram3 == null || ePGProgram2.f19741d >= ePGProgram3.f19742e) {
                arrayList2.add(ePGProgram2);
            }
        }
        return new C1949j(arrayList2, (String) null, 6);
    }

    public final k a(int i3, String str, String str2) {
        Object next;
        Object next2;
        List listI = this.f13718c.i(str, str2);
        if (listI != null) {
            if (listI.isEmpty()) {
                listI = null;
            }
            if (listI != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - (((long) i3) * 60000);
                Iterator it = listI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    EPGProgram ePGProgram = (EPGProgram) next;
                    if (ePGProgram.f19741d <= jCurrentTimeMillis && jCurrentTimeMillis < ePGProgram.f19742e) {
                        break;
                    }
                }
                EPGProgram ePGProgram2 = (EPGProgram) next;
                h hVar = new h(N7.o.k0(o.Y0(listI), new C0537c(jCurrentTimeMillis, 3)));
                if (hVar.hasNext()) {
                    next2 = hVar.next();
                    if (hVar.hasNext()) {
                        long j = ((EPGProgram) next2).f19741d;
                        do {
                            Object next3 = hVar.next();
                            long j9 = ((EPGProgram) next3).f19741d;
                            if (j > j9) {
                                next2 = next3;
                                j = j9;
                            }
                        } while (hVar.hasNext());
                    }
                } else {
                    next2 = null;
                }
                EPGProgram ePGProgram3 = (EPGProgram) next2;
                if (ePGProgram2 != null || ePGProgram3 != null) {
                    return new k(ePGProgram2 != null ? ePGProgram2.h(i3) : null, ePGProgram3 != null ? ePGProgram3.h(i3) : null);
                }
            }
        }
        return null;
    }

    public final void b() {
        ConcurrentHashMap concurrentHashMap = this.f13719d;
        if (concurrentHashMap.size() <= 200) {
            return;
        }
        PlaylistSettings playlistSettingsA = this.f13717b.a();
        int i3 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
        if (i3 < 1) {
            i3 = 1;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() / (((long) i3) * 60000);
        Set setF0 = p078i6.m.F0(new Long[]{Long.valueOf(jCurrentTimeMillis), Long.valueOf(jCurrentTimeMillis + 1)});
        Set setKeySet = concurrentHashMap.keySet();
        m.d(setKeySet, "<get-keys>(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            m.b(str);
            Long lA0 = x.A0(q.k1('-', str, str));
            if (lA0 == null || !setF0.contains(lA0)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentHashMap.remove((String) it.next());
        }
        Log.d("EPGRepository", "EPG cache cleanup removed " + arrayList.size() + ", now=" + concurrentHashMap.size());
    }

    public final void c() {
        this.f13719d.clear();
    }

    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i3, int i9, String str, p117n6.c cVar) {
        K k9;
        O o8;
        int i10;
        String str2;
        K k10;
        O o9;
        Exception e6;
        int i11;
        int i12;
        String str3;
        int i13;
        String str4;
        int i14;
        int i15;
        String message;
        if (cVar instanceof K) {
            k9 = (K) cVar;
            int i16 = k9.f13566p;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                k9.f13566p = i16 - Integer.MIN_VALUE;
                o8 = this;
            } else {
                o8 = this;
                k9 = new K(o8, cVar);
            }
        } else {
            o8 = this;
            k9 = new K(o8, cVar);
        }
        Object objH = k9.f13564n;
        a aVar = a.f25430h;
        int i17 = k9.f13566p;
        int i18 = 1;
        int i19 = 3;
        String str5 = "TvEPGDiag";
        Exception exc = null;
        String str6 = 0;
        try {
            if (i17 == 0) {
                P.u0(objH);
                i10 = i9;
                str2 = str;
                k10 = k9;
                o9 = o8;
                e6 = null;
                i11 = 0;
                i12 = i3;
                if (i11 < i19) {
                    if (e6 != null) {
                        message = e6.getMessage();
                    } else {
                        message = null;
                    }
                    Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                    return C1947i.a(C1949j.Companion, "livetv.epgRateLimited", 2);
                }
                v2 v2Var = o9.f13716a;
                i15 = 200;
                if (i10 < 200) {
                    i15 = i10;
                }
                k10.f13559h = o9;
                k10.f13560i = str2;
                k10.j = exc;
                k10.f13561k = i12;
                k10.f13562l = i10;
                k10.f13563m = i11;
                k10.f13566p = i18;
                objH = v2Var.h(i12, i15, str2, k10);
                if (objH != aVar) {
                    i14 = i12;
                    str3 = str2;
                    str6 = exc;
                }
                return aVar;
            }
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i20 = k9.f13563m;
                int i21 = k9.f13562l;
                int i22 = k9.f13561k;
                Exception exc2 = k9.j;
                String str7 = k9.f13560i;
                O o10 = k9.f13559h;
                P.u0(objH);
                k10 = k9;
                i12 = i22;
                o9 = o10;
                str2 = str7;
                i11 = i20;
                i10 = i21;
                str4 = "TvEPGDiag";
                e6 = exc2;
                str5 = str4;
                i18 = 1;
                i19 = 3;
                exc = null;
                if (i11 < i19) {
                    if (e6 != null) {
                        message = e6.getMessage();
                    } else {
                        message = null;
                    }
                    Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                    return C1947i.a(C1949j.Companion, "livetv.epgRateLimited", 2);
                }
                v2 v2Var2 = o9.f13716a;
                i15 = 200;
                if (i10 < 200) {
                    i15 = i10;
                }
                k10.f13559h = o9;
                k10.f13560i = str2;
                k10.j = exc;
                k10.f13561k = i12;
                k10.f13562l = i10;
                k10.f13563m = i11;
                k10.f13566p = i18;
                objH = v2Var2.h(i12, i15, str2, k10);
                if (objH != aVar) {
                    i14 = i12;
                    str3 = str2;
                    str6 = exc;
                }
                return aVar;
            }
            int i23 = k9.f13563m;
            int i24 = k9.f13562l;
            i14 = k9.f13561k;
            str3 = k9.f13560i;
            o9 = k9.f13559h;
            try {
                P.u0(objH);
            } catch (Exception e9) {
                e6 = e9;
                k10 = k9;
                i12 = i14;
                String message2 = e6.getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                if (q.B0(message2, "429", false)) {
                    i13 = 1;
                } else {
                    i13 = 1;
                    if (!q.B0(message2, "rate", true)) {
                        Log.w(str5, "api FAIL stream=" + i12 + " epgId=" + str3 + ": " + message2);
                        return C1947i.a(C1949j.Companion, "livetv.epgLoadError", 2);
                    }
                }
                int i25 = i23 + 1;
                if (i25 < i19) {
                    str4 = str5;
                    long j = (1 << i23) * 5000;
                    StringBuilder sbS = p.s(i12, i25, "api rate limited stream=", ", retry ", " in ");
                    sbS.append(j);
                    sbS.append("ms");
                    Log.w(str4, sbS.toString());
                    k10.f13559h = o9;
                    k10.f13560i = str3;
                    k10.j = e6;
                    k10.f13561k = i12;
                    k10.f13562l = i24;
                    k10.f13563m = i25;
                    k10.f13566p = 2;
                    if (C.n(j, k10) != aVar) {
                        i10 = i24;
                        str2 = str3;
                        i11 = i25;
                        str5 = str4;
                        i18 = 1;
                        i19 = 3;
                        exc = null;
                        if (i11 < i19) {
                            if (e6 != null) {
                                message = e6.getMessage();
                            } else {
                                message = null;
                            }
                            Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                            return C1947i.a(C1949j.Companion, "livetv.epgRateLimited", 2);
                        }
                        v2 v2Var3 = o9.f13716a;
                        i15 = 200;
                        if (i10 < 200) {
                            i15 = i10;
                        }
                        k10.f13559h = o9;
                        k10.f13560i = str2;
                        k10.j = exc;
                        k10.f13561k = i12;
                        k10.f13562l = i10;
                        k10.f13563m = i11;
                        k10.f13566p = i18;
                        objH = v2Var3.h(i12, i15, str2, k10);
                        if (objH != aVar) {
                            i14 = i12;
                            str3 = str2;
                            str6 = exc;
                        }
                    }
                } else {
                    i10 = i24;
                    str2 = str3;
                    exc = null;
                    i11 = i25;
                    i18 = i13;
                    if (i11 < i19) {
                        if (e6 != null) {
                            message = e6.getMessage();
                        } else {
                            message = null;
                        }
                        Log.d("EPGRepository", "EPG fetch exhausted retries for " + i12 + ": " + message);
                        return C1947i.a(C1949j.Companion, "livetv.epgRateLimited", 2);
                    }
                    v2 v2Var4 = o9.f13716a;
                    i15 = 200;
                    if (i10 < 200) {
                        i15 = i10;
                    }
                    k10.f13559h = o9;
                    k10.f13560i = str2;
                    k10.j = exc;
                    k10.f13561k = i12;
                    k10.f13562l = i10;
                    k10.f13563m = i11;
                    k10.f13566p = i18;
                    objH = v2Var4.h(i12, i15, str2, k10);
                    if (objH != aVar) {
                        i14 = i12;
                        str3 = str2;
                        str6 = exc;
                    }
                }
                return aVar;
            }
            ArrayList arrayList = new ArrayList();
            for (B0 b9 : (Iterable) objH) {
                EPGProgram.INSTANCE.getClass();
                EPGProgram ePGProgramA = EPGProgram.Companion.a(b9);
                if (ePGProgramA != null) {
                    arrayList.add(ePGProgramA);
                }
            }
            List listI1 = o.I1(arrayList, new B(1));
            if (listI1.isEmpty()) {
                Log.d(str5, "api empty stream=" + i14 + " epgId=" + str3);
                return C1947i.a(C1949j.Companion, str6, i19);
            }
            Log.d(str5, "api ok stream=" + i14 + " programs=" + listI1.size());
            o9.getClass();
            return j(listI1);
        } catch (CancellationException e10) {
            throw e10;
        }
    }

    public final Object e(int i3, int i9, int i10, String str, String str2, p117n6.c cVar) {
        L l2;
        O o8;
        String channelName;
        int i11;
        C1949j c1949j;
        int i12;
        List list;
        if (cVar instanceof L) {
            l2 = (L) cVar;
            int i13 = l2.f13605l;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                l2.f13605l = i13 - Integer.MIN_VALUE;
                o8 = this;
            } else {
                o8 = this;
                l2 = new L(o8, cVar);
            }
        } else {
            o8 = this;
            l2 = new L(o8, cVar);
        }
        L l9 = l2;
        Object objG = l9.j;
        a aVar = a.f25430h;
        int i14 = l9.f13605l;
        ArrayList arrayList = null;
        if (i14 == 0) {
            P.u0(objG);
            channelName = str2;
            try {
                l9.f13603i = channelName;
                i11 = i9;
                try {
                    l9.f13602h = i11;
                    l9.f13605l = 1;
                    objG = g(o8, i3, str, 200, i10, l9, 16);
                    if (objG == aVar) {
                        return aVar;
                    }
                    c1949j = (C1949j) objG;
                } catch (Exception e6) {
                    e = e6;
                    Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                    c1949j = null;
                }
            } catch (Exception e9) {
                e = e9;
                i11 = i9;
                Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                c1949j = null;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i15 = l9.f13602h;
            String str3 = l9.f13603i;
            try {
                P.u0(objG);
                i11 = i15;
                channelName = str3;
                c1949j = (C1949j) objG;
            } catch (Exception e10) {
                e = e10;
                i11 = i15;
                channelName = str3;
                Log.d("EPGRepository", "getCatchupEPG live fetch failed: " + e.getMessage());
                c1949j = null;
            }
        }
        if (c1949j != null && (list = c1949j.f20780a) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                EPGProgram ePGProgram = (EPGProgram) obj;
                if (ePGProgram.g() || ePGProgram.f()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return o.I1(arrayList, new B(2));
        }
        EPGProgram.INSTANCE.getClass();
        m.e(channelName, "channelName");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        ArrayList arrayList2 = new ArrayList();
        int iMax = Math.max(i11, 1);
        int i16 = 0;
        int i17 = 0;
        while (i17 < iMax) {
            calendar.setTimeInMillis(jCurrentTimeMillis);
            calendar.add(6, -i17);
            calendar.set(11, i16);
            calendar.set(12, i16);
            calendar.set(13, i16);
            calendar.set(14, i16);
            long timeInMillis = calendar.getTimeInMillis();
            long j = timeInMillis / ((long) 1000);
            int iX = AbstractC1911f.x(i16, 20, 4);
            if (iX >= 0) {
                int i18 = i16;
                while (true) {
                    calendar.setTimeInMillis(timeInMillis);
                    calendar.set(11, i18);
                    long timeInMillis2 = calendar.getTimeInMillis();
                    if (timeInMillis2 < jCurrentTimeMillis) {
                        calendar.add(11, 4);
                        i12 = i17;
                        long jMin = Math.min(calendar.getTimeInMillis(), jCurrentTimeMillis);
                        if (jMin - timeInMillis2 > 60000) {
                            arrayList2.add(new EPGProgram("synthetic-block-" + j + "-" + i18, String.format("%02d:00 – %02d:00", Arrays.copyOf(new Object[]{Integer.valueOf(i18), Integer.valueOf((i18 + 4) % 24)}, 2)), (String) null, timeInMillis2, jMin, 36));
                        }
                    } else {
                        i12 = i17;
                    }
                    if (i18 != iX) {
                        i18 += 4;
                        i17 = i12;
                    }
                }
            } else {
                i12 = i17;
            }
            i17 = i12 + 1;
            i16 = 0;
        }
        return o.I1(arrayList2, new C1951k(1));
    }

    public final Object f(int i3, int i9, int i10, String str, String str2, p117n6.c cVar) throws Throwable {
        M m8;
        if (cVar instanceof M) {
            m8 = (M) cVar;
            int i11 = m8.f13640k;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                m8.f13640k = i11 - Integer.MIN_VALUE;
            } else {
                m8 = new M(this, cVar);
            }
        } else {
            m8 = new M(this, cVar);
        }
        M m9 = m8;
        Object objH = m9.f13639i;
        Object obj = a.f25430h;
        int i12 = m9.f13640k;
        if (i12 == 0) {
            P.u0(objH);
            m9.f13638h = i10;
            m9.f13640k = 1;
            objH = h(i3, str, i9, str2, m9);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = m9.f13638h;
            P.u0(objH);
        }
        C1949j c1949j = (C1949j) objH;
        c1949j.getClass();
        if (i10 == 0) {
            return c1949j;
        }
        List list = c1949j.f20780a;
        ArrayList arrayList = new ArrayList(p078i6.q.I0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((EPGProgram) it.next()).h(i10));
        }
        return new C1949j(c1949j.f20781b, c1949j.f20782c, arrayList);
    }

    public final Object h(int i3, String str, int i9, String str2, p117n6.c cVar) throws Throwable {
        N n3;
        int i10;
        O o8;
        String str3;
        p028c8.a aVar;
        String str4;
        InterfaceC0900p interfaceC0900p;
        k kVar;
        InterfaceC0900p interfaceC0900p2;
        I i11;
        c cVar2;
        int i12;
        int i13;
        String str5;
        C1949j c1949j;
        d dVar;
        String str6;
        O o9;
        Object objK;
        p028c8.a aVar2;
        InterfaceC0900p interfaceC0900p3;
        Object objD;
        String str7;
        O o10;
        Throwable th;
        String str8;
        O o11;
        d dVar2;
        String str9;
        O o12;
        p028c8.a aVar3;
        p028c8.a aVar4;
        p028c8.a aVar5;
        if (cVar instanceof N) {
            n3 = (N) cVar;
            int i14 = n3.f13686p;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                n3.f13686p = i14 - Integer.MIN_VALUE;
            } else {
                n3 = new N(this, cVar);
            }
        } else {
            n3 = new N(this, cVar);
        }
        Object obj = n3.f13684n;
        a aVar6 = a.f25430h;
        switch (n3.f13686p) {
            case 0:
                P.u0(obj);
                PlaylistSettings playlistSettingsA = this.f13717b.a();
                int i15 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
                if (i15 < 1) {
                    i15 = 1;
                }
                String str10 = "epg-" + i3 + "-" + (System.currentTimeMillis() / (((long) i15) * 60000));
                ConcurrentHashMap concurrentHashMap = this.f13719d;
                I i16 = (I) concurrentHashMap.get(str10);
                if (i16 != null) {
                    return i16.f13495a;
                }
                n9 n9Var = this.f13718c;
                List listI = n9Var.i(str, str2);
                if (listI != null) {
                    if (listI.isEmpty()) {
                        listI = null;
                    }
                    if (listI != null) {
                        C1949j c1949jJ = j(o.I1(listI, new B(3)));
                        concurrentHashMap.put(str10, new I(c1949jJ, System.currentTimeMillis()));
                        b();
                        return c1949jJ;
                    }
                }
                boolean zF = n9Var.f();
                l9 l9Var = n9Var.f14840c;
                Log.d("TvEPGDiag", "source=api (xmltv miss) stream=" + i3 + " epgId=" + str + " xmltvAvailable=" + zF + " xmltvChannels=" + (l9Var != null ? l9Var.f14747a.size() : 0));
                d dVar3 = this.f13721f;
                n3.f13679h = this;
                n3.f13680i = str;
                n3.j = str10;
                n3.f13681k = dVar3;
                n3.f13682l = i3;
                i10 = i9;
                n3.f13683m = i10;
                n3.f13686p = 1;
                if (dVar3.e(n3) != aVar6) {
                    o8 = this;
                    str3 = str;
                    aVar = dVar3;
                    str4 = str10;
                    try {
                        interfaceC0900p = (InterfaceC0900p) o8.g.get(str4);
                        if (interfaceC0900p != null) {
                            kVar = new k(interfaceC0900p, Boolean.FALSE);
                        } else {
                            C0901q c0901qB = C.b();
                            o8.g.put(str4, c0901qB);
                            kVar = new k(c0901qB, Boolean.TRUE);
                        }
                        ((d) aVar).g(null);
                        interfaceC0900p2 = (InterfaceC0900p) kVar.f22539h;
                        if (((Boolean) kVar.f22540i).booleanValue()) {
                            try {
                                i11 = (I) o8.f13719d.get(str4);
                                if (i11 != null) {
                                    c1949j = i11.f13495a;
                                    try {
                                        try {
                                            ((C0901q) interfaceC0900p2).J(c1949j);
                                            dVar = o8.f13721f;
                                            n3.f13679h = o8;
                                            n3.f13680i = str4;
                                            n3.j = c1949j;
                                            n3.f13681k = dVar;
                                            n3.f13686p = 3;
                                            if (dVar.e(n3) != aVar6) {
                                                str6 = str4;
                                                o9 = o8;
                                                aVar2 = dVar;
                                                aVar3 = aVar2;
                                                return c1949j;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            interfaceC0900p3 = interfaceC0900p2;
                                            try {
                                                ((C0901q) interfaceC0900p3).Z(th);
                                                try {
                                                    throw th;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    d dVar4 = o8.f13721f;
                                                    n3.f13679h = o8;
                                                    n3.f13680i = str4;
                                                    n3.j = th;
                                                    n3.f13681k = dVar4;
                                                    n3.f13686p = 7;
                                                    if (dVar4.e(n3) != aVar6) {
                                                        str8 = str4;
                                                        o11 = o8;
                                                        aVar5 = dVar4;
                                                        try {
                                                            throw th;
                                                        } finally {
                                                            ((d) aVar5).g(null);
                                                        }
                                                    }
                                                    return aVar6;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } else {
                                    cVar2 = o8.f13720e;
                                    n3.f13679h = o8;
                                    n3.f13680i = str3;
                                    n3.j = str4;
                                    n3.f13681k = interfaceC0900p2;
                                    n3.f13682l = i3;
                                    n3.f13683m = i10;
                                    n3.f13686p = 4;
                                    if (cVar2.a(n3) == aVar6) {
                                        String str11 = str3;
                                        i12 = i3;
                                        i13 = i10;
                                        str5 = str11;
                                        n3.f13679h = o8;
                                        n3.f13680i = str4;
                                        n3.j = interfaceC0900p2;
                                        n3.f13681k = null;
                                        n3.f13686p = 5;
                                        objD = o8.d(i12, i13, str5, n3);
                                        if (objD != aVar6) {
                                            InterfaceC0900p interfaceC0900p4 = interfaceC0900p2;
                                            obj = objD;
                                            interfaceC0900p3 = interfaceC0900p4;
                                            str7 = str4;
                                            o10 = o8;
                                            c1949j = (C1949j) obj;
                                            o10.f13719d.put(str7, new I(c1949j, System.currentTimeMillis()));
                                            o10.b();
                                            ((C0901q) interfaceC0900p3).J(c1949j);
                                            dVar2 = o10.f13721f;
                                            n3.f13679h = o10;
                                            n3.f13680i = str7;
                                            n3.j = c1949j;
                                            n3.f13681k = dVar2;
                                            n3.f13686p = 6;
                                            if (dVar2.e(n3) != aVar6) {
                                                str9 = str7;
                                                o12 = o10;
                                                aVar4 = dVar2;
                                                try {
                                                    aVar3 = aVar4;
                                                    return c1949j;
                                                } finally {
                                                    ((d) aVar4).g(null);
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                            }
                        } else {
                            n3.f13679h = null;
                            n3.f13680i = null;
                            n3.j = null;
                            n3.f13681k = null;
                            n3.f13686p = 2;
                            objK = ((C0901q) interfaceC0900p2).k(n3);
                            if (objK == aVar6) {
                                return objK;
                            }
                        }
                    } catch (Throwable th7) {
                        ((d) aVar).g(null);
                        throw th7;
                    }
                }
                return aVar6;
            case 1:
                int i17 = n3.f13683m;
                int i18 = n3.f13682l;
                aVar = (p028c8.a) n3.f13681k;
                str4 = (String) n3.j;
                String str12 = n3.f13680i;
                o8 = n3.f13679h;
                P.u0(obj);
                i10 = i17;
                i3 = i18;
                str3 = str12;
                interfaceC0900p = (InterfaceC0900p) o8.g.get(str4);
                if (interfaceC0900p != null) {
                    kVar = new k(interfaceC0900p, Boolean.FALSE);
                } else {
                    C0901q c0901qB2 = C.b();
                    o8.g.put(str4, c0901qB2);
                    kVar = new k(c0901qB2, Boolean.TRUE);
                }
                ((d) aVar).g(null);
                interfaceC0900p2 = (InterfaceC0900p) kVar.f22539h;
                if (((Boolean) kVar.f22540i).booleanValue()) {
                    n3.f13679h = null;
                    n3.f13680i = null;
                    n3.j = null;
                    n3.f13681k = null;
                    n3.f13686p = 2;
                    objK = ((C0901q) interfaceC0900p2).k(n3);
                    if (objK == aVar6) {
                        return objK;
                    }
                } else {
                    i11 = (I) o8.f13719d.get(str4);
                    if (i11 != null) {
                        c1949j = i11.f13495a;
                        ((C0901q) interfaceC0900p2).J(c1949j);
                        dVar = o8.f13721f;
                        n3.f13679h = o8;
                        n3.f13680i = str4;
                        n3.j = c1949j;
                        n3.f13681k = dVar;
                        n3.f13686p = 3;
                        if (dVar.e(n3) != aVar6) {
                            str6 = str4;
                            o9 = o8;
                            aVar2 = dVar;
                            aVar3 = aVar2;
                            return c1949j;
                        }
                    } else {
                        cVar2 = o8.f13720e;
                        n3.f13679h = o8;
                        n3.f13680i = str3;
                        n3.j = str4;
                        n3.f13681k = interfaceC0900p2;
                        n3.f13682l = i3;
                        n3.f13683m = i10;
                        n3.f13686p = 4;
                        if (cVar2.a(n3) == aVar6) {
                            String str13 = str3;
                            i12 = i3;
                            i13 = i10;
                            str5 = str13;
                            n3.f13679h = o8;
                            n3.f13680i = str4;
                            n3.j = interfaceC0900p2;
                            n3.f13681k = null;
                            n3.f13686p = 5;
                            objD = o8.d(i12, i13, str5, n3);
                            if (objD != aVar6) {
                                InterfaceC0900p interfaceC0900p5 = interfaceC0900p2;
                                obj = objD;
                                interfaceC0900p3 = interfaceC0900p5;
                                str7 = str4;
                                o10 = o8;
                                c1949j = (C1949j) obj;
                                o10.f13719d.put(str7, new I(c1949j, System.currentTimeMillis()));
                                o10.b();
                                ((C0901q) interfaceC0900p3).J(c1949j);
                                dVar2 = o10.f13721f;
                                n3.f13679h = o10;
                                n3.f13680i = str7;
                                n3.j = c1949j;
                                n3.f13681k = dVar2;
                                n3.f13686p = 6;
                                if (dVar2.e(n3) != aVar6) {
                                    str9 = str7;
                                    o12 = o10;
                                    aVar4 = dVar2;
                                    aVar3 = aVar4;
                                    return c1949j;
                                }
                            }
                        }
                    }
                }
                return aVar6;
            case 2:
                P.u0(obj);
                return obj;
            case 3:
                p028c8.a aVar7 = (p028c8.a) n3.f13681k;
                c1949j = (C1949j) n3.j;
                str6 = n3.f13680i;
                o9 = n3.f13679h;
                P.u0(obj);
                aVar2 = aVar7;
                aVar3 = aVar2;
                return c1949j;
            case 4:
                i13 = n3.f13683m;
                i12 = n3.f13682l;
                InterfaceC0900p interfaceC0900p6 = (InterfaceC0900p) n3.f13681k;
                str4 = (String) n3.j;
                str5 = n3.f13680i;
                o8 = n3.f13679h;
                try {
                    P.u0(obj);
                    interfaceC0900p2 = interfaceC0900p6;
                    n3.f13679h = o8;
                    n3.f13680i = str4;
                    n3.j = interfaceC0900p2;
                    n3.f13681k = null;
                    n3.f13686p = 5;
                    objD = o8.d(i12, i13, str5, n3);
                    if (objD != aVar6) {
                        InterfaceC0900p interfaceC0900p7 = interfaceC0900p2;
                        obj = objD;
                        interfaceC0900p3 = interfaceC0900p7;
                        str7 = str4;
                        o10 = o8;
                        c1949j = (C1949j) obj;
                        o10.f13719d.put(str7, new I(c1949j, System.currentTimeMillis()));
                        o10.b();
                        ((C0901q) interfaceC0900p3).J(c1949j);
                        dVar2 = o10.f13721f;
                        n3.f13679h = o10;
                        n3.f13680i = str7;
                        n3.j = c1949j;
                        n3.f13681k = dVar2;
                        n3.f13686p = 6;
                        if (dVar2.e(n3) != aVar6) {
                            str9 = str7;
                            o12 = o10;
                            aVar4 = dVar2;
                            aVar3 = aVar4;
                            return c1949j;
                        }
                    }
                    return aVar6;
                } catch (Throwable th8) {
                    th = th8;
                    interfaceC0900p3 = interfaceC0900p6;
                    ((C0901q) interfaceC0900p3).Z(th);
                    throw th;
                }
            case 5:
                interfaceC0900p3 = (InterfaceC0900p) n3.j;
                str7 = n3.f13680i;
                o10 = n3.f13679h;
                try {
                    P.u0(obj);
                    c1949j = (C1949j) obj;
                    o10.f13719d.put(str7, new I(c1949j, System.currentTimeMillis()));
                    o10.b();
                    ((C0901q) interfaceC0900p3).J(c1949j);
                    dVar2 = o10.f13721f;
                    n3.f13679h = o10;
                    n3.f13680i = str7;
                    n3.j = c1949j;
                    n3.f13681k = dVar2;
                    n3.f13686p = 6;
                    if (dVar2.e(n3) != aVar6) {
                        str9 = str7;
                        o12 = o10;
                        aVar4 = dVar2;
                        aVar3 = aVar4;
                        return c1949j;
                    }
                    return aVar6;
                } catch (Throwable th9) {
                    th = th9;
                    o8 = o10;
                    str4 = str7;
                    ((C0901q) interfaceC0900p3).Z(th);
                    throw th;
                }
            case 6:
                p028c8.a aVar8 = (p028c8.a) n3.f13681k;
                c1949j = (C1949j) n3.j;
                str9 = n3.f13680i;
                o12 = n3.f13679h;
                P.u0(obj);
                aVar4 = aVar8;
                aVar3 = aVar4;
                return c1949j;
            case 7:
                p028c8.a aVar9 = (p028c8.a) n3.f13681k;
                th = (Throwable) n3.j;
                str8 = n3.f13680i;
                o11 = n3.f13679h;
                P.u0(obj);
                aVar5 = aVar9;
                throw th;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void i() {
        n0 n0Var;
        Object value;
        this.f13719d.clear();
        do {
            n0Var = this.f13722h;
            value = n0Var.getValue();
        } while (!n0Var.g(value, Long.valueOf(((Number) value).longValue() + 1)));
    }
}

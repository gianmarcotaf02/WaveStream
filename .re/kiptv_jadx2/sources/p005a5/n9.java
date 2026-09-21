package p005a5;

import D5.C0260n;
import N7.l;
import O7.o;
import O7.q;
import S7.C;
import S7.M;
import Y4.O1;
import Y4.P1;
import Y4.T1;
import Y4.V1;
import Z7.e;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.Playlist;
import com.kiptv.core.model.PlaylistSettings;
import io.ktor.sse.ServerSentEventKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.m;
import p028c8.a;
import p028c8.d;
import p078i6.D;
import p078i6.w;
import p117n6.c;

public final class n9 {
    private static final k9 Companion = new k9();

    public static final o f14836e = new o("\\.[a-z]{2,4}$");

    public static final o f14837f = new o("\\b(hd|fhd|uhd|4k|2k|8k|sd|hevc|h265|h264)\\b");
    public static final o g = new o("[^a-z0-9]+");

    public final V1 f14838a;

    public final C1291h4 f14839b;

    public volatile l9 f14840c;

    public final d f14841d;

    public n9(V1 xmltvParser, C1291h4 settingsRepository) {
        m.e(xmltvParser, "xmltvParser");
        m.e(settingsRepository, "settingsRepository");
        this.f14838a = xmltvParser;
        this.f14839b = settingsRepository;
        this.f14841d = new d();
    }

    public static HashMap b(Map map, Map map2) {
        HashMap map3 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String strG = g(((O1) entry.getValue()).f11691a);
            if (strG.length() != 0) {
                List list = (List) map2.get(str);
                int size = list != null ? list.size() : 0;
                if (size != 0) {
                    String str2 = (String) map3.get(strG);
                    if (str2 != null) {
                        List list2 = (List) map2.get(str2);
                        if (size > (list2 != null ? list2.size() : 0)) {
                        }
                    }
                    map3.put(strG, str);
                }
            }
        }
        return map3;
    }

    public static String c(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        StringBuilder sb = new StringBuilder();
        int length = lowerCase.length();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = lowerCase.charAt(i3);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static String g(String raw) {
        m.e(raw, "raw");
        String lowerCase = raw.toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        return q.r1(g.e(f14837f.e(f14836e.e(lowerCase, ""), ServerSentEventKt.SPACE), ServerSentEventKt.SPACE)).toString();
    }

    public final List a() {
        l9 l9Var = this.f14840c;
        if (l9Var == null) {
            return w.f23205h;
        }
        ?? r9 = l9Var.f14749c;
        ArrayList arrayList = new ArrayList(r9.size());
        for (Map.Entry entry : r9.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = ((O1) entry.getValue()).f11691a;
            List list = (List) l9Var.f14747a.get(str);
            arrayList.add(new j9(true, str, list != null ? list.size() : 0, str2));
        }
        return p078i6.o.I1(arrayList, new B(18));
    }

    public final int d() {
        Collection collectionValues;
        l9 l9Var = this.f14840c;
        int size = 0;
        if (l9Var != null && (collectionValues = l9Var.f14747a.values()) != null) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                size += ((List) it.next()).size();
            }
        }
        return size;
    }

    public final String e(String str, String str2) {
        Object next;
        String str3;
        String lowerCase;
        Object next2;
        O1 o8;
        String str4;
        String lowerCase2;
        String str5;
        l9 l9Var = this.f14840c;
        if (l9Var != null) {
            if (str != null && !q.N0(str)) {
                O1 o9 = (O1) l9Var.f14749c.get(str);
                if (o9 != null && (str5 = o9.f11692b) != null) {
                    return str5;
                }
                String lowerCase3 = str.toLowerCase(Locale.ROOT);
                m.d(lowerCase3, "toLowerCase(...)");
                Iterator it = l9Var.f14749c.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                    lowerCase2 = ((String) ((Map.Entry) next2).getKey()).toLowerCase(Locale.ROOT);
                    m.d(lowerCase2, "toLowerCase(...)");
                } while (!lowerCase2.equals(lowerCase3));
                Map.Entry entry = (Map.Entry) next2;
                if (entry != null && (o8 = (O1) entry.getValue()) != null && (str4 = o8.f11692b) != null) {
                    return str4;
                }
            }
            if (str2 != null && !q.N0(str2)) {
                String lowerCase4 = q.r1(str2).toString().toLowerCase(Locale.ROOT);
                m.d(lowerCase4, "toLowerCase(...)");
                Iterator it2 = l9Var.f14749c.values().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    lowerCase = q.r1(((O1) next).f11691a).toString().toLowerCase(Locale.ROOT);
                    m.d(lowerCase, "toLowerCase(...)");
                } while (!lowerCase.equals(lowerCase4));
                O1 o10 = (O1) next;
                if (o10 != null && (str3 = o10.f11692b) != null) {
                    return str3;
                }
            }
        }
        return null;
    }

    public final boolean f() {
        return this.f14840c != null;
    }

    public final Serializable h(Playlist playlist, c cVar) throws Throwable {
        m9 m9Var;
        Playlist playlist2;
        a aVar;
        n9 n9Var;
        l9 l9Var;
        a aVar2;
        Playlist playlist3;
        n9 n9Var2;
        Serializable num;
        P1 p2;
        LinkedHashMap linkedHashMap;
        int size;
        if (cVar instanceof m9) {
            m9Var = (m9) cVar;
            int i3 = m9Var.f14796m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m9Var.f14796m = i3 - Integer.MIN_VALUE;
            } else {
                m9Var = new m9(this, cVar);
            }
        } else {
            m9Var = new m9(this, cVar);
        }
        Object objK = m9Var.f14794k;
        p109m6.a aVar3 = p109m6.a.f25430h;
        int i9 = m9Var.f14796m;
        int i10 = 1;
        try {
            try {
                if (i9 == 0) {
                    P.u0(objK);
                    d dVar = this.f14841d;
                    m9Var.f14792h = this;
                    playlist2 = playlist;
                    m9Var.f14793i = playlist2;
                    m9Var.j = dVar;
                    m9Var.f14796m = 1;
                    if (dVar.e(m9Var) != aVar3) {
                        aVar = dVar;
                        n9Var = this;
                    }
                    return aVar3;
                }
                if (i9 != 1) {
                    if (i9 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n9Var2 = (n9) m9Var.j;
                    aVar2 = (a) m9Var.f14793i;
                    playlist3 = (Playlist) m9Var.f14792h;
                    try {
                        P.u0(objK);
                        p2 = (P1) objK;
                        if (p2.f11710b.isEmpty() || !p2.f11709a.isEmpty()) {
                            ?? r9 = p2.f11710b;
                            linkedHashMap = new LinkedHashMap(D.I0(r9.size()));
                            for (Object obj : r9.entrySet()) {
                                String lowerCase = ((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT);
                                m.d(lowerCase, "toLowerCase(...)");
                                linkedHashMap.put(lowerCase, ((Map.Entry) obj).getValue());
                            }
                            ?? r11 = p2.f11709a;
                            ?? r10 = p2.f11710b;
                            n9Var2.getClass();
                            n9Var2.f14840c = new l9(r9, linkedHashMap, r11, b(r11, r10), System.currentTimeMillis(), playlist3.f20033a);
                            size = p2.f11710b.size();
                        } else {
                            n9Var2.f14840c = null;
                            size = 0;
                        }
                        num = new Integer(size);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            num = P.T(th);
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((d) aVar).g(null);
                            throw th;
                        }
                    }
                    aVar = aVar2;
                    ((d) aVar).g(null);
                    return num;
                }
                a aVar4 = (a) m9Var.j;
                Playlist playlist4 = (Playlist) m9Var.f14793i;
                n9Var = (n9) m9Var.f14792h;
                P.u0(objK);
                aVar = aVar4;
                playlist2 = playlist4;
                if (l9Var != null && m.a(l9Var.f14752f, playlist2.f20033a)) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - l9Var.f14751e;
                    PlaylistSettings playlistSettingsA = n9Var.f14839b.a();
                    int i11 = playlistSettingsA != null ? playlistSettingsA.f20063k : 60;
                    if (i11 >= 1) {
                        i10 = i11;
                    }
                    if (jCurrentTimeMillis < ((long) i10) * 60000) {
                        num = new Integer(l9Var.f14747a.size());
                    }
                    ((d) aVar).g(null);
                    return num;
                }
                V1 v6 = n9Var.f14838a;
                String str = playlist2.g;
                String str2 = playlist2.d() ? playlist2.f20036d : null;
                String str3 = playlist2.d() ? playlist2.f20037e : null;
                String str4 = playlist2.d() ? playlist2.f20038f : null;
                m9Var.f14792h = playlist2;
                m9Var.f14793i = aVar;
                m9Var.j = n9Var;
                m9Var.f14796m = 2;
                v6.getClass();
                e eVar = M.f9549a;
                objK = C.K(Z7.d.f13044i, new T1(v6, str, str2, str3, str4, null), m9Var);
                if (objK != aVar3) {
                    playlist3 = playlist2;
                    aVar2 = aVar;
                    n9Var2 = n9Var;
                    p2 = (P1) objK;
                    if (p2.f11710b.isEmpty()) {
                        ?? r12 = p2.f11710b;
                        linkedHashMap = new LinkedHashMap(D.I0(r12.size()));
                        while (r5.hasNext()) {
                            String lowerCase2 = ((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT);
                            m.d(lowerCase2, "toLowerCase(...)");
                            linkedHashMap.put(lowerCase2, ((Map.Entry) obj).getValue());
                        }
                        ?? r13 = p2.f11709a;
                        ?? r14 = p2.f11710b;
                        n9Var2.getClass();
                        n9Var2.f14840c = new l9(r12, linkedHashMap, r13, b(r13, r14), System.currentTimeMillis(), playlist3.f20033a);
                        size = p2.f11710b.size();
                    } else {
                        ?? r15 = p2.f11710b;
                        linkedHashMap = new LinkedHashMap(D.I0(r15.size()));
                        while (r5.hasNext()) {
                            String lowerCase3 = ((String) ((Map.Entry) obj).getKey()).toLowerCase(Locale.ROOT);
                            m.d(lowerCase3, "toLowerCase(...)");
                            linkedHashMap.put(lowerCase3, ((Map.Entry) obj).getValue());
                        }
                        ?? r16 = p2.f11709a;
                        ?? r17 = p2.f11710b;
                        n9Var2.getClass();
                        n9Var2.f14840c = new l9(r15, linkedHashMap, r16, b(r16, r17), System.currentTimeMillis(), playlist3.f20033a);
                        size = p2.f11710b.size();
                    }
                    num = new Integer(size);
                    aVar = aVar2;
                    ((d) aVar).g(null);
                    return num;
                }
                return aVar3;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                num = P.T(th);
            }
            l9Var = n9Var.f14840c;
        } catch (Throwable th4) {
            th = th4;
            ((d) aVar).g(null);
            throw th;
        }
    }

    public final List i(String str, String str2) {
        String str3;
        List list;
        l9 l9Var = this.f14840c;
        if (l9Var != null) {
            if (str != null && !q.N0(str)) {
                List list2 = (List) l9Var.f14747a.get(str);
                if (list2 != null) {
                    if (list2.isEmpty()) {
                        list2 = null;
                    }
                    if (list2 != null) {
                        return list2;
                    }
                }
                LinkedHashMap linkedHashMap = l9Var.f14748b;
                String lowerCase = str.toLowerCase(Locale.ROOT);
                m.d(lowerCase, "toLowerCase(...)");
                List list3 = (List) linkedHashMap.get(lowerCase);
                if (list3 != null) {
                    if (list3.isEmpty()) {
                        list3 = null;
                    }
                    if (list3 != null) {
                        return list3;
                    }
                }
            }
            if (str2 != null) {
                String strG = g(str2);
                if (strG.length() != 0 && (str3 = (String) l9Var.f14750d.get(strG)) != null && (list = (List) l9Var.f14747a.get(str3)) != null && !list.isEmpty()) {
                    return list;
                }
            }
        }
        return null;
    }

    public final List j(String query) {
        m.e(query, "query");
        String lowerCase = q.r1(query).toString().toLowerCase(Locale.ROOT);
        m.d(lowerCase, "toLowerCase(...)");
        if (lowerCase.length() == 0) {
            return a();
        }
        String strC = c(lowerCase);
        List listA = a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            j9 j9Var = (j9) obj;
            String lowerCase2 = j9Var.f14676b.toLowerCase(Locale.ROOT);
            m.d(lowerCase2, "toLowerCase(...)");
            if (q.B0(lowerCase2, lowerCase, false) || (strC.length() > 0 && q.B0(c(j9Var.f14675a), strC, false))) {
                arrayList.add(obj);
            }
        }
        l9 l9Var = this.f14840c;
        return (l9Var == null || strC.length() == 0) ? arrayList : p078i6.o.A1(arrayList, N7.o.s0(new l(N7.o.p0(N7.o.k0(p078i6.o.Y0(l9Var.f14747a.entrySet()), new C0260n(l9Var, this, strC, 16)), new J6(1)), new B(19), 1)));
    }
}

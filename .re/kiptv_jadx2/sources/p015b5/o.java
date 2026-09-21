package p015b5;

import O7.q;
import S4.AbstractC0874m;
import S4.K;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.EPGProgram;
import com.kiptv.core.model.EPGTMDBMatchResult;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import p005a5.C1451x5;
import p028c8.a;
import p028c8.d;
import p117n6.c;

public final class o {
    private static final m Companion = new m();

    public final C1451x5 f17980a;

    public final d f17981b;

    public final LinkedHashMap f17982c;

    public o(C1451x5 tmdbRepository) {
        m.e(tmdbRepository, "tmdbRepository");
        this.f17980a = tmdbRepository;
        this.f17981b = new d();
        this.f17982c = new LinkedHashMap(64, 0.75f, true);
    }

    public final Object a(EPGProgram ePGProgram, c cVar) {
        n nVar;
        EPGTMDBMatchResult ePGTMDBMatchResult;
        String str;
        o oVar;
        d dVar;
        EPGTMDBMatchResult ePGTMDBMatchResult2;
        o oVar2;
        Object obj;
        a aVar;
        LinkedHashMap linkedHashMap;
        Iterator it;
        String strC;
        String str2;
        d dVar2;
        String str3;
        o oVar3;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i3 = nVar.f17979o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                nVar.f17979o = i3 - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, cVar);
            }
        } else {
            nVar = new n(this, cVar);
        }
        Object objH = nVar.f17977m;
        p109m6.a aVar2 = p109m6.a.f25430h;
        int i9 = nVar.f17979o;
        try {
            try {
                if (i9 == 0) {
                    P.u0(objH);
                    String string = q.r1(ePGProgram.f19739b).toString();
                    if (string.length() != 0) {
                        List list = AbstractC0874m.f9411a;
                        if (string.length() == 0) {
                            strC = "";
                        } else {
                            String string2 = q.r1(string).toString();
                            Iterator it2 = AbstractC0874m.f9411a.iterator();
                            while (it2.hasNext()) {
                                string2 = ((O7.o) it2.next()).e(string2, "");
                            }
                            Iterator it3 = AbstractC0874m.f9412b.iterator();
                            while (it3.hasNext()) {
                                string2 = ((O7.o) it3.next()).e(string2, "");
                            }
                            Iterator it4 = AbstractC0874m.f9413c.iterator();
                            while (it4.hasNext()) {
                                string2 = ((O7.o) it4.next()).e(string2, "");
                            }
                            strC = K.c(K.f9329a, q.r1(string2).toString(), false, 6);
                        }
                        if (strC.length() != 0) {
                            List list2 = AbstractC0874m.f9411a;
                            String lowerCase = strC.toLowerCase(Locale.ROOT);
                            m.d(lowerCase, "toLowerCase(...)");
                            String string3 = q.r1(lowerCase).toString();
                            if (!AbstractC0874m.f9414d.contains(string3)) {
                                Iterator it5 = AbstractC0874m.f9415e.iterator();
                                while (it5.hasNext()) {
                                    if (q.B0(string3, (String) it5.next(), false)) {
                                    }
                                }
                                if (string3.length() > 2 && !AbstractC0874m.f9416f.f8060h.matcher(string3).find()) {
                                    String lowerCase2 = strC.toLowerCase(Locale.ROOT);
                                    m.d(lowerCase2, "toLowerCase(...)");
                                    nVar.f17973h = this;
                                    nVar.f17974i = string;
                                    nVar.j = strC;
                                    nVar.f17975k = lowerCase2;
                                    d dVar3 = this.f17981b;
                                    nVar.f17976l = dVar3;
                                    nVar.f17979o = 1;
                                    if (dVar3.e(nVar) != aVar2) {
                                        str2 = strC;
                                        dVar2 = dVar3;
                                        str3 = lowerCase2;
                                        oVar3 = this;
                                    }
                                    return aVar2;
                                }
                            }
                        }
                    }
                    return null;
                }
                if (i9 == 1) {
                    d dVar4 = nVar.f17976l;
                    String str4 = (String) nVar.f17975k;
                    str2 = (String) nVar.j;
                    o oVar4 = nVar.f17973h;
                    P.u0(objH);
                    dVar2 = dVar4;
                    str3 = str4;
                    oVar3 = oVar4;
                } else {
                    if (i9 == 2) {
                        String str5 = nVar.f17974i;
                        o oVar5 = nVar.f17973h;
                        P.u0(objH);
                        i9 = oVar5;
                        ePGProgram = str5;
                        i9 = oVar3;
                        ePGProgram = str3;
                        ePGTMDBMatchResult = (EPGTMDBMatchResult) objH;
                        oVar = i9;
                        str = ePGProgram;
                        dVar = oVar.f17981b;
                        nVar.f17973h = oVar;
                        nVar.f17974i = str;
                        nVar.j = ePGTMDBMatchResult;
                        nVar.f17975k = dVar;
                        nVar.f17976l = null;
                        nVar.f17979o = 3;
                        if (dVar.e(nVar) != aVar2) {
                            ePGTMDBMatchResult2 = ePGTMDBMatchResult;
                            oVar2 = oVar;
                            obj = str;
                            aVar = dVar;
                        }
                        return aVar2;
                    }
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) nVar.f17975k;
                    ePGTMDBMatchResult2 = (EPGTMDBMatchResult) nVar.j;
                    Object obj2 = nVar.f17974i;
                    o oVar6 = nVar.f17973h;
                    P.u0(objH);
                    oVar2 = oVar6;
                    obj = obj2;
                }
                try {
                    oVar2.f17982c.put(obj, new l(ePGTMDBMatchResult2, System.currentTimeMillis()));
                    linkedHashMap = oVar2.f17982c;
                    if (linkedHashMap.size() <= 500) {
                        it = linkedHashMap.entrySet().iterator();
                        while (it.hasNext() && linkedHashMap.size() > 500) {
                            it.next();
                            it.remove();
                        }
                    }
                    ((d) aVar).g(null);
                    return ePGTMDBMatchResult2;
                } catch (Throwable th) {
                    ((d) aVar).g(null);
                    throw th;
                }
                l lVar = (l) oVar3.f17982c.get(str3);
                dVar2.g(null);
                if (lVar != null) {
                    return lVar.f17971a;
                }
                C1451x5 c1451x5 = oVar3.f17980a;
                nVar.f17973h = oVar3;
                nVar.f17974i = str3;
                nVar.j = null;
                nVar.f17975k = null;
                nVar.f17976l = null;
                nVar.f17979o = 2;
                objH = c1451x5.H(str2, nVar);
                if (objH == aVar2) {
                    i9 = oVar3;
                    ePGProgram = str3;
                } else {
                    i9 = oVar3;
                    ePGProgram = str3;
                    ePGTMDBMatchResult = (EPGTMDBMatchResult) objH;
                    oVar = i9;
                    str = ePGProgram;
                    dVar = oVar.f17981b;
                    nVar.f17973h = oVar;
                    nVar.f17974i = str;
                    nVar.j = ePGTMDBMatchResult;
                    nVar.f17975k = dVar;
                    nVar.f17976l = null;
                    nVar.f17979o = 3;
                    if (dVar.e(nVar) != aVar2) {
                        ePGTMDBMatchResult2 = ePGTMDBMatchResult;
                        oVar2 = oVar;
                        obj = str;
                        aVar = dVar;
                        oVar2.f17982c.put(obj, new l(ePGTMDBMatchResult2, System.currentTimeMillis()));
                        linkedHashMap = oVar2.f17982c;
                        if (linkedHashMap.size() <= 500) {
                            it = linkedHashMap.entrySet().iterator();
                            while (it.hasNext()) {
                                it.next();
                                it.remove();
                            }
                        }
                        ((d) aVar).g(null);
                        return ePGTMDBMatchResult2;
                    }
                }
                return aVar2;
            } catch (Throwable th2) {
                dVar2.g(null);
                throw th2;
            }
        } catch (Exception unused) {
            ePGTMDBMatchResult = null;
            oVar = i9;
            str = ePGProgram;
        }
    }
}

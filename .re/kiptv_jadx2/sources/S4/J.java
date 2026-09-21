package S4;

import C5.O1;
import com.google.common.util.concurrent.P;
import com.kiptv.core.model.TMDBEpisode;
import com.kiptv.core.model.TMDBSeasonDetail;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class J {
    public static final G Companion = new G();

    public static final p070h6.p f9324d = com.google.common.util.concurrent.D.B(new C5.r(22));

    public final p028c8.d f9325a = new p028c8.d();

    public final LinkedHashMap f9326b = new LinkedHashMap();

    public final LinkedHashMap f9327c = new LinkedHashMap();

    public final Object a(int i3, List list, p117n6.c cVar) {
        H h9;
        LinkedHashMap linkedHashMap;
        p028c8.d dVar;
        J j;
        kotlin.jvm.internal.y yVar;
        if (cVar instanceof H) {
            h9 = (H) cVar;
            int i9 = h9.f9317o;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                h9.f9317o = i9 - Integer.MIN_VALUE;
            } else {
                h9 = new H(this, cVar);
            }
        } else {
            h9 = new H(this, cVar);
        }
        Object obj = h9.f9315m;
        p109m6.a aVar = p109m6.a.f25430h;
        int i10 = h9.f9317o;
        if (i10 == 0) {
            P.u0(obj);
            linkedHashMap = new LinkedHashMap();
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f24555h = 1;
            Iterator it = p078i6.o.I1(list, new O1(16)).iterator();
            while (it.hasNext()) {
                List list2 = ((TMDBSeasonDetail) it.next()).f20312f;
                if (list2 != null) {
                    Iterator it2 = p078i6.o.I1(list2, new O1(17)).iterator();
                    while (it2.hasNext()) {
                        linkedHashMap.put(new Integer(yVar2.f24555h), (TMDBEpisode) it2.next());
                        yVar2.f24555h++;
                    }
                }
            }
            h9.f9311h = this;
            h9.f9312i = linkedHashMap;
            h9.j = yVar2;
            dVar = this.f9325a;
            h9.f9313k = dVar;
            h9.f9314l = i3;
            h9.f9317o = 1;
            if (dVar.e(h9) == aVar) {
                return aVar;
            }
            j = this;
            yVar = yVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = h9.f9314l;
            dVar = h9.f9313k;
            yVar = h9.j;
            linkedHashMap = h9.f9312i;
            j = h9.f9311h;
            P.u0(obj);
        }
        try {
            j.f9326b.put(new Integer(i3), linkedHashMap);
            j.f9327c.put(new Integer(i3), new Integer(yVar.f24555h - 1));
            return linkedHashMap;
        } finally {
            dVar.g(null);
        }
    }

    public final Object b(int i3, int i9, p117n6.c cVar) {
        I i10;
        J j;
        p028c8.d dVar;
        if (cVar instanceof I) {
            i10 = (I) cVar;
            int i11 = i10.f9323n;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                i10.f9323n = i11 - Integer.MIN_VALUE;
            } else {
                i10 = new I(this, cVar);
            }
        } else {
            i10 = new I(this, cVar);
        }
        Object obj = i10.f9321l;
        p109m6.a aVar = p109m6.a.f25430h;
        int i12 = i10.f9323n;
        if (i12 == 0) {
            P.u0(obj);
            i10.f9318h = this;
            p028c8.d dVar2 = this.f9325a;
            i10.f9319i = dVar2;
            i10.j = i3;
            i10.f9320k = i9;
            i10.f9323n = 1;
            if (dVar2.e(i10) == aVar) {
                return aVar;
            }
            j = this;
            dVar = dVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = i10.f9320k;
            i3 = i10.j;
            dVar = i10.f9319i;
            j = i10.f9318h;
            P.u0(obj);
        }
        try {
            Map map = (Map) j.f9326b.get(new Integer(i3));
            return map != null ? (TMDBEpisode) map.get(new Integer(i9)) : null;
        } finally {
            dVar.g(null);
        }
    }
}

package p035d7;

import N7.d;
import N7.r;
import S2.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import p070h6.k;
import p077i5.C2237d;
import p078i6.D;
import p078i6.q;
import p078i6.z;
import p169t7.c;

public final class o {

    public final String f21285a;

    public final String f21286b;

    public final ArrayList f21287c = new ArrayList();

    public k f21288d = new k("V", null);

    public o(a aVar, String str, String str2) {
        this.f21285a = str;
        this.f21286b = str2;
    }

    public final void a(String type, d... dVarArr) {
        r rVar;
        m.e(type, "type");
        ArrayList arrayList = this.f21287c;
        if (dVarArr.length == 0) {
            rVar = null;
        } else {
            r rVar2 = new r(2, new C2237d(1, dVarArr));
            int iI0 = D.I0(q.I0(rVar2, 10));
            if (iI0 < 16) {
                iI0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
            Iterator it = rVar2.iterator();
            while (true) {
                d dVar = (d) it;
                if (!dVar.j.hasNext()) {
                    break;
                }
                z zVar = (z) dVar.next();
                linkedHashMap.put(Integer.valueOf(zVar.f23208a), (d) zVar.f23209b);
            }
            rVar = new r(linkedHashMap);
        }
        arrayList.add(new k(type, rVar));
    }

    public final void b(String type, d... dVarArr) {
        m.e(type, "type");
        r rVar = new r(2, new C2237d(1, dVarArr));
        int iI0 = D.I0(q.I0(rVar, 10));
        if (iI0 < 16) {
            iI0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iI0);
        Iterator it = rVar.iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.j.hasNext()) {
                this.f21288d = new k(type, new r(linkedHashMap));
                return;
            } else {
                z zVar = (z) dVar.next();
                linkedHashMap.put(Integer.valueOf(zVar.f23208a), (d) zVar.f23209b);
            }
        }
    }

    public final void c(c type) {
        m.e(type, "type");
        String strC = type.c();
        m.d(strC, "getDesc(...)");
        this.f21288d = new k(strC, null);
    }
}

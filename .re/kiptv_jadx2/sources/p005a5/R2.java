package p005a5;

import O2.g;
import S4.C0869h;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import p078i6.q;
import p078i6.u;
import p179v4.l;
import p179v4.m;
import p179v4.n;

public final class R2 {

    public final HashMap f13848a;

    public final HashMap f13849b;

    public R2(n nVar) {
        this.f13848a = new HashMap(nVar.f29177a);
        this.f13849b = new HashMap(nVar.f29178b);
    }

    public void a(C0869h c0869h, int i3, double d4, Function0 function0) {
        Object next;
        String strA = c0869h.a();
        Integer num = c0869h.f9397e;
        if (num != null) {
            int iIntValue = num.intValue();
            HashMap map = this.f13849b;
            String str = (String) map.get(Integer.valueOf(iIntValue));
            if (str != null) {
                strA = str;
            } else {
                map.put(Integer.valueOf(iIntValue), strA);
            }
        }
        HashMap map2 = this.f13848a;
        Object arrayList = map2.get(strA);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map2.put(strA, arrayList);
        }
        List list = (List) arrayList;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!g.T(c0869h, ((P2) next).f13762a));
        P2 p2 = (P2) next;
        if (p2 == null) {
            list.add(new P2(c0869h, i3, d4, function0.invoke()));
            return;
        }
        int i9 = p2.f13763b;
        if (i3 <= i9 && (i3 != i9 || d4 <= p2.f13764c)) {
            p2.f13766e++;
            if (p2.f13767f == null) {
                p2.f13767f = num;
                return;
            }
            return;
        }
        p2.f13763b = i3;
        p2.f13764c = d4;
        p2.f13765d = function0.invoke();
        p2.f13766e++;
        if (p2.f13767f == null) {
            p2.f13767f = num;
        }
    }

    public void b(l lVar) throws GeneralSecurityException {
        m mVar = new m(lVar.f29173a, p185w4.g.class);
        HashMap map = this.f13848a;
        if (!map.containsKey(mVar)) {
            map.put(mVar, lVar);
            return;
        }
        l lVar2 = (l) map.get(mVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
    }

    public void c(o4.m mVar) throws GeneralSecurityException {
        if (mVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsB = mVar.b();
        HashMap map = this.f13849b;
        if (!map.containsKey(clsB)) {
            map.put(clsB, mVar);
            return;
        }
        o4.m mVar2 = (o4.m) map.get(clsB);
        if (mVar2.equals(mVar) && mVar.equals(mVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
    }

    public ArrayList d() {
        Collection<List> collectionValues = this.f13848a.values();
        kotlin.jvm.internal.m.d(collectionValues, "<get-values>(...)");
        ArrayList arrayList = new ArrayList();
        for (List<P2> list : collectionValues) {
            kotlin.jvm.internal.m.b(list);
            ArrayList arrayList2 = new ArrayList(q.I0(list, 10));
            for (P2 p2 : list) {
                arrayList2.add(new Q2(p2.f13765d, p2.f13766e, p2.f13767f));
            }
            u.M0(arrayList, arrayList2);
        }
        return arrayList;
    }

    public R2(int i3) {
        switch (i3) {
            case 1:
                this.f13848a = new HashMap();
                this.f13849b = new HashMap();
                break;
            default:
                this.f13848a = new HashMap();
                this.f13849b = new HashMap();
                break;
        }
    }
}

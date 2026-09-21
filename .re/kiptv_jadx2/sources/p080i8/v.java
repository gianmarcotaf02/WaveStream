package p080i8;

import A8.l;
import O7.q;
import Y0.n;
import Y6.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import p020c0.C1704s0;
import p070h6.k;
import p078i6.o;
import p078i6.p;

public final class v implements o {

    public final C1704s0 f23287a;

    public final String f23288b;

    public final u f23289c;

    public v(Collection collection, C1704s0 c1704s0, String whatThisExpects) {
        int i3;
        m.e(whatThisExpects, "whatThisExpects");
        this.f23287a = c1704s0;
        this.f23288b = whatThisExpects;
        this.f23289c = new u();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.length() <= 0) {
                throw new IllegalArgumentException(("Found an empty string in " + this.f23288b).toString());
            }
            u uVar = this.f23289c;
            int length = str.length();
            for (int i9 = 0; i9 < length; i9++) {
                char cCharAt = str.charAt(i9);
                List list = uVar.f23285a;
                String strValueOf = String.valueOf(cCharAt);
                int size = list.size();
                n nVar = new n(strValueOf, 3);
                m.e(list, "<this>");
                p.F0(list.size(), size);
                int i10 = size - 1;
                int i11 = 0;
                while (true) {
                    if (i11 > i10) {
                        i3 = -(i11 + 1);
                        break;
                    }
                    i3 = (i11 + i10) >>> 1;
                    int iIntValue = ((Number) nVar.invoke(list.get(i3))).intValue();
                    if (iIntValue < 0) {
                        i11 = i3 + 1;
                    } else if (iIntValue <= 0) {
                        break;
                    } else {
                        i10 = i3 - 1;
                    }
                }
                List list2 = uVar.f23285a;
                if (i3 < 0) {
                    u uVar2 = new u();
                    list2.add((-i3) - 1, new k(String.valueOf(cCharAt), uVar2));
                    uVar = uVar2;
                } else {
                    uVar = (u) ((k) list2.get(i3)).f22540i;
                }
            }
            if (uVar.f23286b) {
                throw new IllegalArgumentException(f.h("The string '", str, "' was passed several times").toString());
            }
            uVar.f23286b = true;
        }
        b(this.f23289c);
    }

    public static final void b(u uVar) {
        Iterator it = uVar.f23285a.iterator();
        while (it.hasNext()) {
            b((u) ((k) it.next()).f22540i);
        }
        ArrayList arrayList = new ArrayList();
        List<k> list = uVar.f23285a;
        for (k kVar : list) {
            String str = (String) kVar.f22539h;
            u uVar2 = (u) kVar.f22540i;
            if (!uVar2.f23286b) {
                List list2 = uVar2.f23285a;
                if (list2.size() == 1) {
                    k kVar2 = (k) o.D1(list2);
                    String str2 = (String) kVar2.f22539h;
                    arrayList.add(new k(p121o0.p.o(str, str2), (u) kVar2.f22540i));
                }
            }
            arrayList.add(new k(str, uVar2));
        }
        list.clear();
        list.addAll(o.I1(arrayList, new l(1)));
    }

    @Override
    public final Object a(c cVar, String str, int i3) {
        String str2;
        u uVar;
        y yVar = new y();
        yVar.f24555h = i3;
        u uVar2 = this.f23289c;
        Integer numValueOf = null;
        loop0: while (yVar.f24555h <= str.length()) {
            if (uVar2.f23286b) {
                numValueOf = Integer.valueOf(yVar.f24555h);
            }
            Iterator it = uVar2.f23285a.iterator();
            do {
                if (!it.hasNext()) {
                    break loop0;
                }
                k kVar = (k) it.next();
                str2 = (String) kVar.f22539h;
                uVar = (u) kVar.f22540i;
            } while (!q.d1(str, str2, yVar.f24555h, false));
            yVar.f24555h = str2.length() + yVar.f24555h;
            uVar2 = uVar;
        }
        if (numValueOf == null) {
            return new i(i3, new g(this, str, i3, yVar));
        }
        String string = str.subSequence(i3, numValueOf.intValue()).toString();
        C1704s0 c1704s0 = this.f23287a;
        Object objR = c1704s0.r(cVar, string);
        return objR == null ? numValueOf : new i(i3, new l(objR, string, c1704s0, 2));
    }
}

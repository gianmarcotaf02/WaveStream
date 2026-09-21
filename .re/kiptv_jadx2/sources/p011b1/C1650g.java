package p011b1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import p078i6.o;
import p078i6.w;
import p079i7.f;
import p136q.AbstractC2667k;
import p136q.C2677v;
import p144r.a;

public final class C1650g implements CharSequence {

    public final List f17808h;

    public final String f17809i;
    public final ArrayList j;

    public final ArrayList f17810k;

    static {
        f fVar = C.f17716a;
    }

    public C1650g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3 = 0;
        this.f17808h = list;
        this.f17809i = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i9 = 0; i9 < size; i9++) {
                C1648e c1648e = (C1648e) list.get(i9);
                Object obj = c1648e.f17803a;
                if (obj instanceof E) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1648e);
                } else if (obj instanceof t) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1648e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.j = arrayList;
        this.f17810k = arrayList2;
        List listI1 = arrayList2 != null ? o.I1(arrayList2, new C1649f(i3)) : null;
        if (listI1 == null || listI1.isEmpty()) {
            return;
        }
        int i10 = ((C1648e) o.h1(listI1)).f17805c;
        C2677v c2677v = AbstractC2667k.f26396a;
        C2677v c2677v2 = new C2677v(1);
        c2677v2.a(i10);
        int size2 = listI1.size();
        for (int i11 = 1; i11 < size2; i11++) {
            C1648e c1648e2 = (C1648e) listI1.get(i11);
            while (true) {
                int i12 = c2677v2.f26431b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    a.e("IntList is empty.");
                    throw null;
                }
                int i13 = c2677v2.f26430a[i12 - 1];
                if (c1648e2.f17804b < i13) {
                    int i14 = c1648e2.f17805c;
                    if (i14 > i13) {
                        p065h1.a.a("Paragraph overlap not allowed, end " + i14 + " should be less than or equal to " + i13);
                        break;
                    }
                    break;
                }
                c2677v2.d(i12 - 1);
            }
            c2677v2.a(c1648e2.f17805c);
        }
    }

    @Override
    public final C1650g subSequence(int i3, int i9) {
        ArrayList arrayList;
        if (!(i3 <= i9)) {
            p065h1.a.a("start (" + i3 + ") should be less or equal to end (" + i9 + ')');
        }
        String str = this.f17809i;
        if (i3 == 0 && i9 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i3, i9);
        m.d(strSubstring, "substring(...)");
        C1650g c1650g = AbstractC1651h.f17811a;
        if (i3 > i9) {
            p065h1.a.a("start (" + i3 + ") should be less than or equal to end (" + i9 + ')');
        }
        List list = this.f17808h;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1648e c1648e = (C1648e) list.get(i10);
                int i11 = c1648e.f17804b;
                int i12 = c1648e.f17805c;
                if (AbstractC1651h.b(i3, i9, i11, i12)) {
                    arrayList.add(new C1648e(c1648e.f17803a, Math.max(i3, c1648e.f17804b) - i3, Math.min(i9, i12) - i3, c1648e.f17806d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new C1650g(arrayList, strSubstring);
    }

    @Override
    public final char charAt(int i3) {
        return this.f17809i.charAt(i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650g)) {
            return false;
        }
        C1650g c1650g = (C1650g) obj;
        return m.a(this.f17809i, c1650g.f17809i) && m.a(this.f17808h, c1650g.f17808h);
    }

    public final int hashCode() {
        int iHashCode = this.f17809i.hashCode() * 31;
        List list = this.f17808h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override
    public final int length() {
        return this.f17809i.length();
    }

    @Override
    public final String toString() {
        return this.f17809i;
    }

    public C1650g(String str) {
        this(str, w.f23205h);
    }

    public C1650g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}

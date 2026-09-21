package p011b1;

/* JADX INFO: renamed from: b1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1650g implements java.lang.CharSequence {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f17808h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.String f17809i;
    public final java.util.ArrayList j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f17810k;

    static {
        p079i7.f fVar = p011b1.C.f17716a;
    }

    public C1650g(java.util.List list, java.lang.String str) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i3 = 0;
        this.f17808h = list;
        this.f17809i = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i9 = 0; i9 < size; i9++) {
                p011b1.C1648e c1648e = (p011b1.C1648e) list.get(i9);
                java.lang.Object obj = c1648e.f17803a;
                if (obj instanceof p011b1.E) {
                    arrayList = arrayList == null ? new java.util.ArrayList() : arrayList;
                    arrayList.add(c1648e);
                } else if (obj instanceof p011b1.t) {
                    arrayList2 = arrayList2 == null ? new java.util.ArrayList() : arrayList2;
                    arrayList2.add(c1648e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.j = arrayList;
        this.f17810k = arrayList2;
        java.util.List listI1 = arrayList2 != null ? p078i6.o.I1(arrayList2, new p011b1.C1649f(i3)) : null;
        if (listI1 == null || listI1.isEmpty()) {
            return;
        }
        int i10 = ((p011b1.C1648e) p078i6.o.h1(listI1)).f17805c;
        p136q.C2677v c2677v = p136q.AbstractC2667k.f26396a;
        p136q.C2677v c2677v2 = new p136q.C2677v(1);
        c2677v2.a(i10);
        int size2 = listI1.size();
        for (int i11 = 1; i11 < size2; i11++) {
            p011b1.C1648e c1648e2 = (p011b1.C1648e) listI1.get(i11);
            while (true) {
                int i12 = c2677v2.f26431b;
                if (i12 == 0) {
                    break;
                }
                if (i12 == 0) {
                    p144r.a.e("IntList is empty.");
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

    /* JADX WARN: Code duplicated, block: B:29:0x009e  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p011b1.C1650g subSequence(int i3, int i9) {
        java.util.ArrayList arrayList;
        if (!(i3 <= i9)) {
            p065h1.a.a("start (" + i3 + ") should be less or equal to end (" + i9 + ')');
        }
        java.lang.String str = this.f17809i;
        if (i3 == 0 && i9 == str.length()) {
            return this;
        }
        java.lang.String strSubstring = str.substring(i3, i9);
        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
        p011b1.C1650g c1650g = p011b1.AbstractC1651h.f17811a;
        if (i3 > i9) {
            p065h1.a.a("start (" + i3 + ") should be less than or equal to end (" + i9 + ')');
        }
        java.util.List list = this.f17808h;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                p011b1.C1648e c1648e = (p011b1.C1648e) list.get(i10);
                int i11 = c1648e.f17804b;
                int i12 = c1648e.f17805c;
                if (p011b1.AbstractC1651h.b(i3, i9, i11, i12)) {
                    arrayList.add(new p011b1.C1648e(c1648e.f17803a, java.lang.Math.max(i3, c1648e.f17804b) - i3, java.lang.Math.min(i9, i12) - i3, c1648e.f17806d));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new p011b1.C1650g(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i3) {
        return this.f17809i.charAt(i3);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011b1.C1650g)) {
            return false;
        }
        p011b1.C1650g c1650g = (p011b1.C1650g) obj;
        return kotlin.jvm.internal.m.a(this.f17809i, c1650g.f17809i) && kotlin.jvm.internal.m.a(this.f17808h, c1650g.f17808h);
    }

    public final int hashCode() {
        int iHashCode = this.f17809i.hashCode() * 31;
        java.util.List list = this.f17808h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f17809i.length();
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        return this.f17809i;
    }

    public /* synthetic */ C1650g(java.lang.String str) {
        this(str, p078i6.w.f23205h);
    }

    public C1650g(java.lang.String str, java.util.List list) {
        this(list.isEmpty() ? null : list, str);
    }
}

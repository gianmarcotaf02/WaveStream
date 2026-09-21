package p011b1;

/* JADX INFO: renamed from: b1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1651h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p011b1.C1650g f17811a = new p011b1.C1650g("");

    public static final java.util.List a(p011b1.C1650g c1650g, int i3, int i9, p005a5.J6 j9) {
        java.util.List list;
        if (i3 == i9 || (list = c1650g.f17808h) == null) {
            return null;
        }
        if (i3 != 0 || i9 < c1650g.f17809i.length()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                p011b1.C1648e c1648e = (p011b1.C1648e) list.get(i10);
                if ((j9 != null ? ((java.lang.Boolean) j9.invoke(c1648e.f17803a)).booleanValue() : true) && b(i3, i9, c1648e.f17804b, c1648e.f17805c)) {
                    arrayList.add(new p011b1.C1648e((p011b1.InterfaceC1645b) c1648e.f17803a, O7.r.s(c1648e.f17804b, i3, i9) - i3, O7.r.s(c1648e.f17805c, i3, i9) - i3, c1648e.f17806d));
                }
            }
            return arrayList;
        }
        if (j9 == null) {
            return list;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            java.lang.Object obj = list.get(i11);
            if (((java.lang.Boolean) j9.invoke(((p011b1.C1648e) obj).f17803a)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final boolean b(int i3, int i9, int i10, int i11) {
        return ((i3 < i11) & (i10 < i9)) | (((i3 == i9) | (i10 == i11)) & (i3 == i10));
    }
}

package p011b1;

/* JADX INFO: renamed from: b1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1647d implements java.lang.Appendable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.StringBuilder f17801h = new java.lang.StringBuilder(16);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f17802i;

    public C1647d(p011b1.C1650g c1650g) {
        new java.util.ArrayList();
        this.f17802i = new java.util.ArrayList();
        new java.util.ArrayList();
        a(c1650g);
    }

    public final void a(p011b1.C1650g c1650g) {
        java.lang.StringBuilder sb = this.f17801h;
        int length = sb.length();
        sb.append(c1650g.f17809i);
        java.util.List list = c1650g.f17808h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                p011b1.C1648e c1648e = (p011b1.C1648e) list.get(i3);
                this.f17802i.add(new p011b1.C1646c(c1648e.f17803a, c1648e.f17804b + length, c1648e.f17805c + length, c1648e.f17806d));
            }
        }
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence) {
        if (charSequence instanceof p011b1.C1650g) {
            a((p011b1.C1650g) charSequence);
            return this;
        }
        this.f17801h.append(charSequence);
        return this;
    }

    public final p011b1.C1650g b() {
        java.lang.StringBuilder sb = this.f17801h;
        java.lang.String string = sb.toString();
        java.util.ArrayList arrayList = this.f17802i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            p011b1.C1646c c1646c = (p011b1.C1646c) arrayList.get(i3);
            int length = sb.length();
            int i9 = c1646c.f17799c;
            if (i9 != Integer.MIN_VALUE) {
                length = i9;
            }
            if (length == Integer.MIN_VALUE) {
                p065h1.a.b("Item.end should be set first");
            }
            arrayList2.add(new p011b1.C1648e(c1646c.f17797a, c1646c.f17798b, length, c1646c.f17800d));
        }
        return new p011b1.C1650g(string, arrayList2);
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(java.lang.CharSequence charSequence, int i3, int i9) {
        boolean z6 = charSequence instanceof p011b1.C1650g;
        java.lang.StringBuilder sb = this.f17801h;
        if (z6) {
            p011b1.C1650g c1650g = (p011b1.C1650g) charSequence;
            int length = sb.length();
            sb.append((java.lang.CharSequence) c1650g.f17809i, i3, i9);
            java.util.List listA = p011b1.AbstractC1651h.a(c1650g, i3, i9, null);
            if (listA != null) {
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    p011b1.C1648e c1648e = (p011b1.C1648e) listA.get(i10);
                    this.f17802i.add(new p011b1.C1646c(c1648e.f17803a, c1648e.f17804b + length, c1648e.f17805c + length, c1648e.f17806d));
                }
            }
            return this;
        }
        sb.append(charSequence, i3, i9);
        return this;
    }

    @Override // java.lang.Appendable
    public final java.lang.Appendable append(char c9) {
        this.f17801h.append(c9);
        return this;
    }
}

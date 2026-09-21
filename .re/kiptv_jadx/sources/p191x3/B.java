package p191x3;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f31152b;

    public /* synthetic */ B(int i3, java.lang.Object obj) {
        this.f31151a = i3;
        this.f31152b = obj;
    }

    public void e(java.lang.String str, long j, int i3, long j9, long j10) {
        switch (this.f31151a) {
            case 0:
                com.google.android.gms.internal.cast.C1817y2 c1817y2 = ((p191x3.C3102c) this.f31152b).f31191l;
                if (c1817y2 != null) {
                    com.google.android.gms.internal.cast.m3 m3VarD = c1817y2.f19178h.D();
                    com.google.android.gms.internal.cast.C1810x c1810x = new com.google.android.gms.internal.cast.C1810x(str);
                    c1810x.f19167b = j;
                    c1810x.f19168c = i3;
                    c1810x.f19169d = j9;
                    c1810x.f19170e = j10;
                    com.google.android.gms.internal.cast.C1814y c1814y = new com.google.android.gms.internal.cast.C1814y(c1810x);
                    c1814y.f19177f = m3VarD.f18991h;
                    m3VarD.f18988d.add(c1814y);
                }
                break;
        }
    }

    public void g(int[] iArr) {
        switch (this.f31151a) {
            case 1:
                java.util.ArrayList arrayListD = B3.AbstractC0088a.d(iArr);
                p199y3.c cVar = (p199y3.c) this.f31152b;
                if (!cVar.f31810d.equals(arrayListD)) {
                    cVar.h();
                    cVar.f31812f.evictAll();
                    cVar.g.clear();
                    cVar.f31810d = arrayListD;
                    p199y3.c.b(cVar);
                    cVar.g();
                    cVar.f();
                    break;
                }
                break;
        }
    }

    public void i(int[] iArr, int i3) {
        int size;
        switch (this.f31151a) {
            case 1:
                if (i3 == 0) {
                    size = ((p199y3.c) this.f31152b).f31810d.size();
                } else {
                    size = ((p199y3.c) this.f31152b).f31811e.get(i3, -1);
                    if (size == -1) {
                        ((p199y3.c) this.f31152b).d();
                        return;
                    }
                }
                ((p199y3.c) this.f31152b).h();
                ((p199y3.c) this.f31152b).f31810d.addAll(size, B3.AbstractC0088a.d(iArr));
                p199y3.c.b((p199y3.c) this.f31152b);
                p199y3.c cVar = (p199y3.c) this.f31152b;
                synchronized (cVar.f31817m) {
                    java.util.Iterator it = cVar.f31817m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                }
                ((p199y3.c) this.f31152b).f();
                return;
            default:
                return;
        }
    }

    public void k(p184w3.o[] oVarArr) {
        switch (this.f31151a) {
            case 1:
                java.util.HashSet hashSet = new java.util.HashSet();
                p199y3.c cVar = (p199y3.c) this.f31152b;
                cVar.g.clear();
                int i3 = 0;
                while (true) {
                    int length = oVarArr.length;
                    android.util.SparseIntArray sparseIntArray = cVar.f31811e;
                    if (i3 >= length) {
                        java.util.ArrayList arrayList = cVar.g;
                        java.util.Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            int i9 = sparseIntArray.get(((java.lang.Integer) it.next()).intValue(), -1);
                            if (i9 != -1) {
                                hashSet.add(java.lang.Integer.valueOf(i9));
                            }
                        }
                        arrayList.clear();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(hashSet);
                        java.util.Collections.sort(arrayList2);
                        cVar.h();
                        B3.AbstractC0088a.f(arrayList2);
                        p199y3.c.a(cVar);
                        cVar.f();
                    } else {
                        p184w3.o oVar = oVarArr[i3];
                        int i10 = oVar.f29891i;
                        cVar.f31812f.put(java.lang.Integer.valueOf(i10), oVar);
                        int i11 = sparseIntArray.get(i10, -1);
                        if (i11 == -1) {
                            cVar.d();
                        } else {
                            hashSet.add(java.lang.Integer.valueOf(i11));
                            i3++;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public void m(int[] iArr) {
        switch (this.f31151a) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i3 : iArr) {
                    ((p199y3.c) this.f31152b).f31812f.remove(java.lang.Integer.valueOf(i3));
                    int i9 = ((p199y3.c) this.f31152b).f31811e.get(i3, -1);
                    if (i9 == -1) {
                        ((p199y3.c) this.f31152b).d();
                        return;
                    } else {
                        ((p199y3.c) this.f31152b).f31811e.delete(i3);
                        arrayList.add(java.lang.Integer.valueOf(i9));
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                java.util.Collections.sort(arrayList);
                ((p199y3.c) this.f31152b).h();
                ((p199y3.c) this.f31152b).f31810d.removeAll(B3.AbstractC0088a.d(iArr));
                p199y3.c.b((p199y3.c) this.f31152b);
                p199y3.c cVar = (p199y3.c) this.f31152b;
                B3.AbstractC0088a.f(arrayList);
                synchronized (cVar.f31817m) {
                    java.util.Iterator it = cVar.f31817m.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                }
                ((p199y3.c) this.f31152b).f();
                return;
            default:
                return;
        }
    }

    public void o(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i3) {
        switch (this.f31151a) {
            case 1:
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (i3 == 0) {
                    ((p199y3.c) this.f31152b).f31810d.size();
                } else if (arrayList2.isEmpty()) {
                    B3.C0089b c0089b = ((p199y3.c) this.f31152b).f31807a;
                    android.util.Log.w(c0089b.f617a, c0089b.d("Received a Queue Reordered message with an empty reordered items IDs list.", new java.lang.Object[0]));
                } else if (((p199y3.c) this.f31152b).f31811e.get(i3, -1) == -1) {
                    p199y3.c cVar = (p199y3.c) this.f31152b;
                    cVar.f31811e.get(((java.lang.Integer) arrayList2.get(0)).intValue(), -1);
                }
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    int i9 = ((p199y3.c) this.f31152b).f31811e.get(((java.lang.Integer) it.next()).intValue(), -1);
                    if (i9 == -1) {
                        ((p199y3.c) this.f31152b).d();
                        return;
                    }
                    arrayList3.add(java.lang.Integer.valueOf(i9));
                }
                ((p199y3.c) this.f31152b).h();
                p199y3.c cVar2 = (p199y3.c) this.f31152b;
                cVar2.f31810d = arrayList;
                p199y3.c.b(cVar2);
                p199y3.c cVar3 = (p199y3.c) this.f31152b;
                synchronized (cVar3.f31817m) {
                    java.util.Iterator it2 = cVar3.f31817m.iterator();
                    if (it2.hasNext()) {
                        if (it2.next() != null) {
                            throw new java.lang.ClassCastException();
                        }
                        throw null;
                    }
                }
                ((p199y3.c) this.f31152b).f();
                return;
            default:
                return;
        }
    }

    public void q(int[] iArr) {
        switch (this.f31151a) {
            case 1:
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i3 = 0;
                while (true) {
                    int length = iArr.length;
                    p199y3.c cVar = (p199y3.c) this.f31152b;
                    if (i3 >= length) {
                        java.util.Collections.sort(arrayList);
                        cVar.h();
                        B3.AbstractC0088a.f(arrayList);
                        p199y3.c.a(cVar);
                        cVar.f();
                    } else {
                        int i9 = iArr[i3];
                        cVar.f31812f.remove(java.lang.Integer.valueOf(i9));
                        int i10 = cVar.f31811e.get(i9, -1);
                        if (i10 == -1) {
                            cVar.d();
                        } else {
                            arrayList.add(java.lang.Integer.valueOf(i10));
                            i3++;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void s() {
    }

    public final void h(int[] iArr) {
    }

    public final void l(p184w3.o[] oVarArr) {
    }

    public final void n(int[] iArr) {
    }

    public final void r(int[] iArr) {
    }

    public final void j(int[] iArr, int i3) {
    }

    public final void p(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i3) {
    }

    public final void f(java.lang.String str, long j, int i3, long j9, long j10) {
    }
}

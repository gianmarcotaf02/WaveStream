package p038e0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements java.util.List, p201y6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21317h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f21318i;

    public b(p038e0.e eVar) {
        this.f21318i = eVar;
    }

    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        int i9;
        switch (this.f21317h) {
            case 0:
                ((p038e0.e) this.f21318i).b(i3, obj);
                return;
            default:
                p136q.D d4 = (p136q.D) this.f21318i;
                if (i3 < 0 || i3 > (i9 = d4.f26304b)) {
                    d4.getClass();
                    p144r.a.d("Index " + i3 + " must be in 0.." + d4.f26304b);
                    throw null;
                }
                int i10 = i9 + 1;
                java.lang.Object[] objArr = d4.f26303a;
                if (objArr.length < i10) {
                    d4.m(objArr, i10);
                }
                java.lang.Object[] objArr2 = d4.f26303a;
                int i11 = d4.f26304b;
                if (i3 != i11) {
                    p078i6.m.Z(i3 + 1, i3, i11, objArr2, objArr2);
                }
                objArr2[i3] = obj;
                d4.f26304b++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection elements) {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).f(i3, elements);
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                p136q.D d4 = (p136q.D) this.f21318i;
                d4.getClass();
                if (i3 < 0 || i3 > d4.f26304b) {
                    java.lang.StringBuilder sbT = p121o0.p.t(i3, "Index ", " must be in 0..");
                    sbT.append(d4.f26304b);
                    p144r.a.d(sbT.toString());
                    throw null;
                }
                int i9 = 0;
                if (elements.isEmpty()) {
                    return false;
                }
                int size = elements.size() + d4.f26304b;
                java.lang.Object[] objArr = d4.f26303a;
                if (objArr.length < size) {
                    d4.m(objArr, size);
                }
                java.lang.Object[] objArr2 = d4.f26303a;
                if (i3 != d4.f26304b) {
                    p078i6.m.Z(elements.size() + i3, i3, d4.f26304b, objArr2, objArr2);
                }
                for (java.lang.Object obj : elements) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        p078i6.p.H0();
                        throw null;
                    }
                    objArr2[i9 + i3] = obj;
                    i9 = i10;
                }
                d4.f26304b = elements.size() + d4.f26304b;
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f21317h) {
            case 0:
                ((p038e0.e) this.f21318i).i();
                break;
            default:
                ((p136q.D) this.f21318i).d();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).j(obj);
            default:
                return ((p136q.D) this.f21318i).g(obj) >= 0;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        switch (this.f21317h) {
            case 0:
                p038e0.e eVar = (p038e0.e) this.f21318i;
                eVar.getClass();
                java.util.Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!eVar.j(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                p136q.D d4 = (p136q.D) this.f21318i;
                d4.getClass();
                java.util.Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (d4.g(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        switch (this.f21317h) {
            case 0:
                p038e0.f.a(i3, this);
                return ((p038e0.e) this.f21318i).f21324h[i3];
            default:
                p136q.N.a(i3, this);
                return ((p136q.D) this.f21318i).f(i3);
        }
    }

    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).k(obj);
            default:
                return ((p136q.D) this.f21318i).g(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).j == 0;
            default:
                return ((p136q.D) this.f21318i).h();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f21317h) {
            case 0:
                return new p038e0.d(0, 0, this);
            default:
                return new p038e0.d(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int i3;
        switch (this.f21317h) {
            case 0:
                p038e0.e eVar = (p038e0.e) this.f21318i;
                java.lang.Object[] objArr = eVar.f21324h;
                for (int i9 = eVar.j - 1; i9 >= 0; i9--) {
                    if (kotlin.jvm.internal.m.a(obj, objArr[i9])) {
                        return i9;
                    }
                }
                return -1;
            default:
                p136q.D d4 = (p136q.D) this.f21318i;
                if (obj == null) {
                    java.lang.Object[] objArr2 = d4.f26303a;
                    i3 = d4.f26304b - 1;
                    while (-1 < i3) {
                        if (objArr2[i3] != null) {
                            i3--;
                        }
                    }
                    return -1;
                }
                java.lang.Object[] objArr3 = d4.f26303a;
                i3 = d4.f26304b - 1;
                while (-1 < i3) {
                    if (!obj.equals(objArr3[i3])) {
                        i3--;
                    }
                }
                return -1;
                return i3;
        }
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        switch (this.f21317h) {
            case 0:
                return new p038e0.d(0, 0, this);
            default:
                return new p038e0.d(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).l(obj);
            default:
                return ((p136q.D) this.f21318i).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection elements) {
        switch (this.f21317h) {
            case 0:
                p038e0.e eVar = (p038e0.e) this.f21318i;
                eVar.getClass();
                if (!elements.isEmpty()) {
                    int i3 = eVar.j;
                    java.util.Iterator it = elements.iterator();
                    while (it.hasNext()) {
                        eVar.l(it.next());
                    }
                    if (i3 != eVar.j) {
                        return true;
                    }
                }
                return false;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                p136q.D d4 = (p136q.D) this.f21318i;
                d4.getClass();
                int i9 = d4.f26304b;
                java.util.Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    d4.j(it2.next());
                }
                return i9 != d4.f26304b;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection elements) {
        switch (this.f21317h) {
            case 0:
                p038e0.e eVar = (p038e0.e) this.f21318i;
                int i3 = eVar.j;
                for (int i9 = i3 - 1; -1 < i9; i9--) {
                    if (!elements.contains(eVar.f21324h[i9])) {
                        eVar.m(i9);
                    }
                }
                return i3 != eVar.j;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                p136q.D d4 = (p136q.D) this.f21318i;
                d4.getClass();
                int i10 = d4.f26304b;
                java.lang.Object[] objArr = d4.f26303a;
                for (int i11 = i10 - 1; -1 < i11; i11--) {
                    if (!elements.contains(objArr[i11])) {
                        d4.k(i11);
                    }
                }
                return i10 != d4.f26304b;
        }
    }

    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        switch (this.f21317h) {
            case 0:
                p038e0.f.a(i3, this);
                java.lang.Object[] objArr = ((p038e0.e) this.f21318i).f21324h;
                java.lang.Object obj2 = objArr[i3];
                objArr[i3] = obj;
                return obj2;
            default:
                p136q.N.a(i3, this);
                p136q.D d4 = (p136q.D) this.f21318i;
                if (i3 < 0 || i3 >= d4.f26304b) {
                    d4.n(i3);
                    throw null;
                }
                java.lang.Object[] objArr2 = d4.f26303a;
                java.lang.Object obj3 = objArr2[i3];
                objArr2[i3] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f21317h) {
            case 0:
                return ((p038e0.e) this.f21318i).j;
            default:
                return ((p136q.D) this.f21318i).f26304b;
        }
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        switch (this.f21317h) {
            case 0:
                p038e0.f.b(i3, i9, this);
                return new p038e0.c(this, i3, i9, 0);
            default:
                p136q.N.b(i3, i9, this);
                return new p038e0.c(this, i3, i9, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray() {
        switch (this.f21317h) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.a(this);
    }

    public b(p136q.D objectList) {
        kotlin.jvm.internal.m.e(objectList, "objectList");
        this.f21318i = objectList;
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        switch (this.f21317h) {
            case 0:
                return new p038e0.d(i3, 0, this);
            default:
                return new p038e0.d(i3, 1, this);
        }
    }

    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        switch (this.f21317h) {
            case 0:
                p038e0.f.a(i3, this);
                return ((p038e0.e) this.f21318i).m(i3);
            default:
                p136q.N.a(i3, this);
                return ((p136q.D) this.f21318i).k(i3);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        switch (this.f21317h) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f21317h) {
            case 0:
                ((p038e0.e) this.f21318i).c(obj);
                break;
            default:
                ((p136q.D) this.f21318i).a(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection elements) {
        switch (this.f21317h) {
            case 0:
                p038e0.e eVar = (p038e0.e) this.f21318i;
                return eVar.f(eVar.j, elements);
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                p136q.D d4 = (p136q.D) this.f21318i;
                d4.getClass();
                int i3 = d4.f26304b;
                java.util.Iterator it = elements.iterator();
                while (it.hasNext()) {
                    d4.a(it.next());
                }
                return i3 != d4.f26304b;
        }
    }
}

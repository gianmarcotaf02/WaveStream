package p038e0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements java.util.List, p201y6.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f21319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f21320i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21321k;

    public /* synthetic */ c(java.util.List list, int i3, int i9, int i10) {
        this.f21319h = i10;
        this.f21320i = list;
        this.j = i3;
        this.f21321k = i9;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                this.f21321k = i3 + 1;
                this.f21320i.add(i3, obj);
                break;
            default:
                int i9 = this.f21321k;
                this.f21321k = i9 + 1;
                this.f21320i.add(i9, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i3, java.util.Collection elements) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.addAll(i3 + this.j, elements);
                int size = elements.size();
                this.f21321k += size;
                return size > 0;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f21320i.addAll(i3 + this.j, elements);
                this.f21321k = elements.size() + this.f21321k;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k - 1;
                int i9 = this.j;
                if (i9 <= i3) {
                    while (true) {
                        this.f21320i.remove(i3);
                        if (i3 != i9) {
                            i3--;
                        }
                    }
                }
                this.f21321k = i9;
                break;
            default:
                int i10 = this.f21321k - 1;
                int i11 = this.j;
                if (i11 <= i10) {
                    while (true) {
                        this.f21320i.remove(i10);
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                this.f21321k = i11;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                for (int i9 = this.j; i9 < i3; i9++) {
                    if (kotlin.jvm.internal.m.a(this.f21320i.get(i9), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.f21321k;
                for (int i11 = this.j; i11 < i10; i11++) {
                    if (kotlin.jvm.internal.m.a(this.f21320i.get(i11), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(java.util.Collection elements) {
        switch (this.f21319h) {
            case 0:
                java.util.Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                java.util.Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final java.lang.Object get(int i3) {
        switch (this.f21319h) {
            case 0:
                p038e0.f.a(i3, this);
                return this.f21320i.get(i3 + this.j);
            default:
                p136q.N.a(i3, this);
                return this.f21320i.get(i3 + this.j);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                int i9 = this.j;
                for (int i10 = i9; i10 < i3; i10++) {
                    if (kotlin.jvm.internal.m.a(this.f21320i.get(i10), obj)) {
                        return i10 - i9;
                    }
                }
                return -1;
            default:
                int i11 = this.f21321k;
                int i12 = this.j;
                for (int i13 = i12; i13 < i11; i13++) {
                    if (kotlin.jvm.internal.m.a(this.f21320i.get(i13), obj)) {
                        return i13 - i12;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f21319h) {
            case 0:
                return this.f21321k == this.j;
            default:
                return this.f21321k == this.j;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        switch (this.f21319h) {
            case 0:
                return new p038e0.d(0, 0, this);
            default:
                return new p038e0.d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k - 1;
                int i9 = this.j;
                if (i9 <= i3) {
                    while (!kotlin.jvm.internal.m.a(this.f21320i.get(i3), obj)) {
                        if (i3 != i9) {
                            i3--;
                        }
                    }
                    return i3 - i9;
                }
                return -1;
            default:
                int i10 = this.f21321k - 1;
                int i11 = this.j;
                if (i11 <= i10) {
                    while (!kotlin.jvm.internal.m.a(this.f21320i.get(i10), obj)) {
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                    return i10 - i11;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator() {
        switch (this.f21319h) {
            case 0:
                return new p038e0.d(0, 0, this);
            default:
                return new p038e0.d(0, 1, this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                for (int i9 = this.j; i9 < i3; i9++) {
                    ?? r9 = this.f21320i;
                    if (kotlin.jvm.internal.m.a(r9.get(i9), obj)) {
                        r9.remove(i9);
                        this.f21321k--;
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.f21321k;
                for (int i11 = this.j; i11 < i10; i11++) {
                    ?? r10 = this.f21320i;
                    if (kotlin.jvm.internal.m.a(r10.get(i11), obj)) {
                        r10.remove(i11);
                        this.f21321k--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(java.util.Collection elements) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                java.util.Iterator it = elements.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i3 != this.f21321k;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                int i9 = this.f21321k;
                java.util.Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i9 != this.f21321k;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(java.util.Collection elements) {
        switch (this.f21319h) {
            case 0:
                int i3 = this.f21321k;
                int i9 = i3 - 1;
                int i10 = this.j;
                if (i10 <= i9) {
                    while (true) {
                        ?? r9 = this.f21320i;
                        if (!elements.contains(r9.get(i9))) {
                            r9.remove(i9);
                            this.f21321k--;
                        }
                        if (i9 != i10) {
                            i9--;
                        }
                    }
                }
                return i3 != this.f21321k;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                int i11 = this.f21321k;
                int i12 = i11 - 1;
                int i13 = this.j;
                if (i13 <= i12) {
                    while (true) {
                        ?? r10 = this.f21320i;
                        if (!elements.contains(r10.get(i12))) {
                            r10.remove(i12);
                            this.f21321k--;
                        }
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                return i11 != this.f21321k;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                p038e0.f.a(i3, this);
                return this.f21320i.set(i3 + this.j, obj);
            default:
                p136q.N.a(i3, this);
                return this.f21320i.set(i3 + this.j, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.f21319h) {
            case 0:
                break;
        }
        return this.f21321k - this.j;
    }

    @Override // java.util.List
    public final java.util.List subList(int i3, int i9) {
        switch (this.f21319h) {
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
        switch (this.f21319h) {
            case 0:
                break;
        }
        return kotlin.jvm.internal.l.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i3, java.lang.Object obj) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.add(i3 + this.j, obj);
                this.f21321k++;
                break;
            default:
                this.f21320i.add(i3 + this.j, obj);
                this.f21321k++;
                break;
        }
    }

    @Override // java.util.List
    public final java.util.ListIterator listIterator(int i3) {
        switch (this.f21319h) {
            case 0:
                return new p038e0.d(i3, 0, this);
            default:
                return new p038e0.d(i3, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        switch (this.f21319h) {
            case 0:
                break;
            default:
                kotlin.jvm.internal.m.e(array, "array");
                break;
        }
        return kotlin.jvm.internal.l.b(this, array);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(java.util.Collection elements) {
        switch (this.f21319h) {
            case 0:
                this.f21320i.addAll(this.f21321k, elements);
                int size = elements.size();
                this.f21321k += size;
                return size > 0;
            default:
                kotlin.jvm.internal.m.e(elements, "elements");
                this.f21320i.addAll(this.f21321k, elements);
                this.f21321k = elements.size() + this.f21321k;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final java.lang.Object remove(int i3) {
        switch (this.f21319h) {
            case 0:
                p038e0.f.a(i3, this);
                java.lang.Object objRemove = this.f21320i.remove(i3 + this.j);
                this.f21321k--;
                return objRemove;
            default:
                p136q.N.a(i3, this);
                java.lang.Object objRemove2 = this.f21320i.remove(i3 + this.j);
                this.f21321k--;
                return objRemove2;
        }
    }
}

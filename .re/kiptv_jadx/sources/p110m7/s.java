package p110m7;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends java.util.AbstractList implements java.util.RandomAccess, p110m7.t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p110m7.H f25504i = new p110m7.H(new p110m7.s());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f25505h;

    public s() {
        this.f25505h = new java.util.ArrayList();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, java.lang.Object obj) {
        this.f25505h.add(i3, (java.lang.String) obj);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection collection) {
        return addAll(this.f25505h.size(), collection);
    }

    @Override // p110m7.t
    public final java.util.List b() {
        return java.util.Collections.unmodifiableList(this.f25505h);
    }

    @Override // p110m7.t
    public final p110m7.H c() {
        return new p110m7.H(this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f25505h.clear();
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i3) {
        java.util.ArrayList arrayList = this.f25505h;
        java.lang.Object obj = arrayList.get(i3);
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (obj instanceof p110m7.AbstractC2632e) {
            p110m7.AbstractC2632e abstractC2632e = (p110m7.AbstractC2632e) obj;
            java.lang.String strW = abstractC2632e.w();
            if (abstractC2632e.q()) {
                arrayList.set(i3, strW);
            }
            return strW;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = p110m7.q.f25502a;
        try {
            java.lang.String str = new java.lang.String(bArr, "UTF-8");
            if (p110m7.D.c(bArr, 0, bArr.length) == 0) {
                arrayList.set(i3, str);
            }
            return str;
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override // p110m7.t
    public final p110m7.AbstractC2632e i(int i3) {
        p110m7.AbstractC2632e uVar;
        java.util.ArrayList arrayList = this.f25505h;
        java.lang.Object obj = arrayList.get(i3);
        if (obj instanceof p110m7.AbstractC2632e) {
            uVar = (p110m7.AbstractC2632e) obj;
        } else if (obj instanceof java.lang.String) {
            try {
                uVar = new p110m7.u(((java.lang.String) obj).getBytes("UTF-8"));
            } catch (java.io.UnsupportedEncodingException e6) {
                throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            byte[] bArr2 = new byte[length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
            uVar = new p110m7.u(bArr2);
        }
        if (uVar != obj) {
            arrayList.set(i3, uVar);
        }
        return uVar;
    }

    @Override // p110m7.t
    public final void l(p110m7.u uVar) {
        this.f25505h.add(uVar);
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object remove(int i3) {
        java.lang.Object objRemove = this.f25505h.remove(i3);
        ((java.util.AbstractList) this).modCount++;
        if (objRemove instanceof java.lang.String) {
            return (java.lang.String) objRemove;
        }
        if (objRemove instanceof p110m7.AbstractC2632e) {
            return ((p110m7.AbstractC2632e) objRemove).w();
        }
        byte[] bArr = (byte[]) objRemove;
        byte[] bArr2 = p110m7.q.f25502a;
        try {
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i3, java.lang.Object obj) {
        java.lang.Object obj2 = this.f25505h.set(i3, (java.lang.String) obj);
        if (obj2 instanceof java.lang.String) {
            return (java.lang.String) obj2;
        }
        if (obj2 instanceof p110m7.AbstractC2632e) {
            return ((p110m7.AbstractC2632e) obj2).w();
        }
        byte[] bArr = (byte[]) obj2;
        byte[] bArr2 = p110m7.q.f25502a;
        try {
            return new java.lang.String(bArr, "UTF-8");
        } catch (java.io.UnsupportedEncodingException e6) {
            throw new java.lang.RuntimeException("UTF-8 not supported?", e6);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25505h.size();
    }

    public s(p110m7.t tVar) {
        this.f25505h = new java.util.ArrayList(tVar.size());
        addAll(tVar);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, java.util.Collection collection) {
        if (collection instanceof p110m7.t) {
            collection = ((p110m7.t) collection).b();
        }
        boolean zAddAll = this.f25505h.addAll(i3, collection);
        ((java.util.AbstractList) this).modCount++;
        return zAddAll;
    }
}

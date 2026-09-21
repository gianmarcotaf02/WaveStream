package D1;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1971i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f1972k;

    public I() {
        if (B3.o.f639i == null) {
            B3.o.f639i = new B3.o(29);
        }
    }

    public int a(int i3) {
        if (i3 < this.j) {
            return ((java.nio.ByteBuffer) this.f1972k).getShort(this.f1971i + i3);
        }
        return 0;
    }

    public void b() {
        if (((p086j6.e) this.f1972k).f24247o != this.j) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public abstract java.lang.Object c(android.view.View view);

    public abstract void d(android.view.View view, java.lang.Object obj);

    public void e() {
        while (true) {
            int i3 = this.f1970h;
            p086j6.e eVar = (p086j6.e) this.f1972k;
            if (i3 >= eVar.f24245m || eVar.j[i3] >= 0) {
                return;
            } else {
                this.f1970h = i3 + 1;
            }
        }
    }

    public void g(android.view.View view, java.lang.Object obj) {
        java.lang.Object tag;
        D1.C0213b c0213b;
        if (android.os.Build.VERSION.SDK_INT >= this.f1971i) {
            d(view, obj);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= this.f1971i) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f1970h);
            if (!((java.lang.Class) this.f1972k).isInstance(tag)) {
                tag = null;
            }
        }
        if (i(tag, obj)) {
            android.view.View.AccessibilityDelegate accessibilityDelegateD = D1.U.d(view);
            if (accessibilityDelegateD == null) {
                c0213b = null;
            } else {
                c0213b = accessibilityDelegateD instanceof D1.C0211a ? ((D1.C0211a) accessibilityDelegateD).f1992a : new D1.C0213b(accessibilityDelegateD);
            }
            if (c0213b == null) {
                c0213b = new D1.C0213b();
            }
            D1.U.j(view, c0213b);
            view.setTag(this.f1970h, obj);
            D1.U.f(this.j, view);
        }
    }

    public boolean hasNext() {
        return this.f1970h < ((p086j6.e) this.f1972k).f24245m;
    }

    public abstract boolean i(java.lang.Object obj, java.lang.Object obj2);

    public void remove() {
        b();
        if (this.f1971i == -1) {
            throw new java.lang.IllegalStateException("Call next() before removing element from the iterator.");
        }
        p086j6.e eVar = (p086j6.e) this.f1972k;
        eVar.c();
        eVar.o(this.f1971i);
        this.f1971i = -1;
        this.j = eVar.f24247o;
    }
}

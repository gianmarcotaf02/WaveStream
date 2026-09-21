package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f17418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f17419f;
    public final java.lang.Object g;

    public f0(int i3) {
        this.f17414a = 1;
        this.f17415b = i3;
        if (i3 <= 0) {
            p144r.a.c("maxSize <= 0");
            throw null;
        }
        this.f17419f = new p040e2.c(1);
        this.g = new q2.i(1);
    }

    public void a() {
        android.view.View view = (android.view.View) com.google.android.gms.internal.play_billing.M0.j(1, (java.util.ArrayList) this.f17419f);
        androidx.recyclerview.widget.b0 b0Var = (androidx.recyclerview.widget.b0) view.getLayoutParams();
        this.f17416c = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g).f17336q.b(view);
        b0Var.getClass();
    }

    public void b() {
        ((java.util.ArrayList) this.f17419f).clear();
        this.f17415b = Integer.MIN_VALUE;
        this.f17416c = Integer.MIN_VALUE;
        this.f17417d = 0;
    }

    public int c() {
        boolean z6 = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g).f17341v;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f17419f;
        return z6 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public int d() {
        boolean z6 = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g).f17341v;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f17419f;
        return z6 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public int e(int i3, int i9) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g;
        int iK = staggeredGridLayoutManager.f17336q.k();
        int iG = staggeredGridLayoutManager.f17336q.g();
        int i10 = i9 > i3 ? 1 : -1;
        while (i3 != i9) {
            android.view.View view = (android.view.View) ((java.util.ArrayList) this.f17419f).get(i3);
            int iE = staggeredGridLayoutManager.f17336q.e(view);
            int iB = staggeredGridLayoutManager.f17336q.b(view);
            boolean z6 = iE <= iG;
            boolean z9 = iB >= iK;
            if (z6 && z9 && (iE < iK || iB > iG)) {
                return androidx.recyclerview.widget.I.C(view);
            }
            i3 += i10;
        }
        return -1;
    }

    public java.lang.Object f(java.lang.Object key) {
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((q2.i) this.g)) {
            p040e2.c cVar = (p040e2.c) this.f17419f;
            cVar.getClass();
            java.lang.Object obj = cVar.f21366a.get(key);
            if (obj != null) {
                this.f17417d++;
                return obj;
            }
            this.f17418e++;
            return null;
        }
    }

    public int g(int i3) {
        int i9 = this.f17416c;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (((java.util.ArrayList) this.f17419f).size() == 0) {
            return i3;
        }
        a();
        return this.f17416c;
    }

    public android.view.View h(int i3, int i9) {
        androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager = (androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f17419f;
        android.view.View view = null;
        if (i9 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                android.view.View view2 = (android.view.View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f17341v && androidx.recyclerview.widget.I.C(view2) >= i3) || ((!staggeredGridLayoutManager.f17341v && androidx.recyclerview.widget.I.C(view2) <= i3) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            android.view.View view3 = (android.view.View) arrayList.get(i10);
            if ((staggeredGridLayoutManager.f17341v && androidx.recyclerview.widget.I.C(view3) <= i3) || ((!staggeredGridLayoutManager.f17341v && androidx.recyclerview.widget.I.C(view3) >= i3) || !view3.hasFocusable())) {
                break;
            }
            i10++;
            view = view3;
        }
        return view;
    }

    public int i(int i3) {
        int i9 = this.f17415b;
        if (i9 != Integer.MIN_VALUE) {
            return i9;
        }
        if (((java.util.ArrayList) this.f17419f).size() == 0) {
            return i3;
        }
        android.view.View view = (android.view.View) ((java.util.ArrayList) this.f17419f).get(0);
        androidx.recyclerview.widget.b0 b0Var = (androidx.recyclerview.widget.b0) view.getLayoutParams();
        this.f17415b = ((androidx.recyclerview.widget.StaggeredGridLayoutManager) this.g).f17336q.e(view);
        b0Var.getClass();
        return this.f17415b;
    }

    public java.lang.Object j(java.lang.Object key, java.lang.Object obj) {
        java.lang.Object objPut;
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((q2.i) this.g)) {
            this.f17416c++;
            p040e2.c cVar = (p040e2.c) this.f17419f;
            cVar.getClass();
            objPut = cVar.f21366a.put(key, obj);
            if (objPut != null) {
                this.f17416c--;
            }
        }
        int i3 = this.f17415b;
        while (true) {
            synchronized (((q2.i) this.g)) {
                try {
                    if (this.f17416c < 0 || (((p040e2.c) this.f17419f).f21366a.isEmpty() && this.f17416c != 0)) {
                        break;
                    }
                    if (this.f17416c > i3 && !((p040e2.c) this.f17419f).f21366a.isEmpty()) {
                        java.util.Set setEntrySet = ((p040e2.c) this.f17419f).f21366a.entrySet();
                        kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
                        java.util.Map.Entry entry = (java.util.Map.Entry) p078i6.o.i1(setEntrySet);
                        if (entry == null) {
                            return objPut;
                        }
                        java.lang.Object key2 = entry.getKey();
                        java.lang.Object value = entry.getValue();
                        p040e2.c cVar2 = (p040e2.c) this.f17419f;
                        cVar2.getClass();
                        kotlin.jvm.internal.m.e(key2, "key");
                        cVar2.f21366a.remove(key2);
                        int i9 = this.f17416c;
                        kotlin.jvm.internal.m.e(value, "value");
                        this.f17416c = i9 - 1;
                    }
                    return objPut;
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            }
        }
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public java.lang.Object k(java.lang.Object obj) {
        java.lang.Object objRemove;
        synchronized (((q2.i) this.g)) {
            p040e2.c cVar = (p040e2.c) this.f17419f;
            cVar.getClass();
            objRemove = cVar.f21366a.remove(obj);
            if (objRemove != null) {
                this.f17416c--;
            }
        }
        return objRemove;
    }

    public java.lang.String toString() {
        java.lang.String str;
        switch (this.f17414a) {
            case 1:
                synchronized (((q2.i) this.g)) {
                    try {
                        int i3 = this.f17417d;
                        int i9 = this.f17418e + i3;
                        str = "LruCache[maxSize=" + this.f17415b + ",hits=" + this.f17417d + ",misses=" + this.f17418e + ",hitRate=" + (i9 != 0 ? (i3 * 100) / i9 : 0) + "%]";
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public f0(androidx.recyclerview.widget.StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f17414a = 0;
        this.g = staggeredGridLayoutManager;
        this.f17419f = new java.util.ArrayList();
        this.f17415b = Integer.MIN_VALUE;
        this.f17416c = Integer.MIN_VALUE;
        this.f17417d = 0;
        this.f17418e = i3;
    }
}

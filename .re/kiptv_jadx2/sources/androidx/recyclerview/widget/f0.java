package androidx.recyclerview.widget;

import android.view.View;
import com.google.android.gms.internal.play_billing.M0;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class f0 {

    public final int f17414a;

    public int f17415b;

    public int f17416c;

    public int f17417d;

    public int f17418e;

    public final Object f17419f;
    public final Object g;

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
        View view = (View) M0.j(1, (ArrayList) this.f17419f);
        b0 b0Var = (b0) view.getLayoutParams();
        this.f17416c = ((StaggeredGridLayoutManager) this.g).f17336q.b(view);
        b0Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f17419f).clear();
        this.f17415b = Integer.MIN_VALUE;
        this.f17416c = Integer.MIN_VALUE;
        this.f17417d = 0;
    }

    public int c() {
        boolean z6 = ((StaggeredGridLayoutManager) this.g).f17341v;
        ArrayList arrayList = (ArrayList) this.f17419f;
        return z6 ? e(arrayList.size() - 1, -1) : e(0, arrayList.size());
    }

    public int d() {
        boolean z6 = ((StaggeredGridLayoutManager) this.g).f17341v;
        ArrayList arrayList = (ArrayList) this.f17419f;
        return z6 ? e(0, arrayList.size()) : e(arrayList.size() - 1, -1);
    }

    public int e(int i3, int i9) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int iK = staggeredGridLayoutManager.f17336q.k();
        int iG = staggeredGridLayoutManager.f17336q.g();
        int i10 = i9 > i3 ? 1 : -1;
        while (i3 != i9) {
            View view = (View) ((ArrayList) this.f17419f).get(i3);
            int iE = staggeredGridLayoutManager.f17336q.e(view);
            int iB = staggeredGridLayoutManager.f17336q.b(view);
            boolean z6 = iE <= iG;
            boolean z9 = iB >= iK;
            if (z6 && z9 && (iE < iK || iB > iG)) {
                return I.C(view);
            }
            i3 += i10;
        }
        return -1;
    }

    public Object f(Object key) {
        kotlin.jvm.internal.m.e(key, "key");
        synchronized (((q2.i) this.g)) {
            p040e2.c cVar = (p040e2.c) this.f17419f;
            cVar.getClass();
            Object obj = cVar.f21366a.get(key);
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
        if (((ArrayList) this.f17419f).size() == 0) {
            return i3;
        }
        a();
        return this.f17416c;
    }

    public View h(int i3, int i9) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f17419f;
        View view = null;
        if (i9 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f17341v && I.C(view2) >= i3) || ((!staggeredGridLayoutManager.f17341v && I.C(view2) <= i3) || !view2.hasFocusable())) {
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
            View view3 = (View) arrayList.get(i10);
            if ((staggeredGridLayoutManager.f17341v && I.C(view3) <= i3) || ((!staggeredGridLayoutManager.f17341v && I.C(view3) >= i3) || !view3.hasFocusable())) {
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
        if (((ArrayList) this.f17419f).size() == 0) {
            return i3;
        }
        View view = (View) ((ArrayList) this.f17419f).get(0);
        b0 b0Var = (b0) view.getLayoutParams();
        this.f17415b = ((StaggeredGridLayoutManager) this.g).f17336q.e(view);
        b0Var.getClass();
        return this.f17415b;
    }

    public Object j(Object key, Object obj) {
        Object objPut;
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
                        Set setEntrySet = ((p040e2.c) this.f17419f).f21366a.entrySet();
                        kotlin.jvm.internal.m.d(setEntrySet, "<get-entries>(...)");
                        Map.Entry entry = (Map.Entry) p078i6.o.i1(setEntrySet);
                        if (entry == null) {
                            return objPut;
                        }
                        Object key2 = entry.getKey();
                        Object value = entry.getValue();
                        p040e2.c cVar2 = (p040e2.c) this.f17419f;
                        cVar2.getClass();
                        kotlin.jvm.internal.m.e(key2, "key");
                        cVar2.f21366a.remove(key2);
                        int i9 = this.f17416c;
                        kotlin.jvm.internal.m.e(value, "value");
                        this.f17416c = i9 - 1;
                    }
                    return objPut;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public Object k(Object obj) {
        Object objRemove;
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

    public String toString() {
        String str;
        switch (this.f17414a) {
            case 1:
                synchronized (((q2.i) this.g)) {
                    try {
                        int i3 = this.f17417d;
                        int i9 = this.f17418e + i3;
                        str = "LruCache[maxSize=" + this.f17415b + ",hits=" + this.f17417d + ",misses=" + this.f17418e + ",hitRate=" + (i9 != 0 ? (i3 * 100) / i9 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public f0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i3) {
        this.f17414a = 0;
        this.g = staggeredGridLayoutManager;
        this.f17419f = new ArrayList();
        this.f17415b = Integer.MIN_VALUE;
        this.f17416c = Integer.MIN_VALUE;
        this.f17417d = 0;
        this.f17418e = i3;
    }
}

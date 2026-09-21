package p105m2;

/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static p105m2.C2608f f25213c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f25214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f25215b = new java.util.ArrayList();

    static {
        android.util.Log.isLoggable("AxMediaRouter", 3);
    }

    public C(android.content.Context context) {
        this.f25214a = context;
    }

    public static void b() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            throw new java.lang.IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static p105m2.C2608f c() {
        p105m2.C2608f c2608f = f25213c;
        if (c2608f != null) {
            return c2608f;
        }
        throw new java.lang.IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static p105m2.C d(android.content.Context context) {
        b();
        if (f25213c == null) {
            f25213c = new p105m2.C2608f(context.getApplicationContext());
        }
        java.util.ArrayList arrayList = f25213c.f25293f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                p105m2.C c9 = new p105m2.C(context);
                arrayList.add(new java.lang.ref.WeakReference(c9));
                return c9;
            }
            p105m2.C c10 = (p105m2.C) ((java.lang.ref.WeakReference) arrayList.get(size)).get();
            if (c10 == null) {
                arrayList.remove(size);
            } else if (c10.f25214a == context) {
                return c10;
            }
        }
    }

    public final void a(p105m2.C2623v c2623v, p105m2.AbstractC2624w abstractC2624w, int i3) {
        p105m2.C2625x c2625x;
        p105m2.C2623v c2623v2;
        if (abstractC2624w == null) {
            throw new java.lang.IllegalArgumentException("callback must not be null");
        }
        b();
        java.util.ArrayList arrayList = this.f25215b;
        int size = arrayList.size();
        boolean z6 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((p105m2.C2625x) arrayList.get(i9)).f25374b == abstractC2624w) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            c2625x = new p105m2.C2625x(this, abstractC2624w);
            arrayList.add(c2625x);
        } else {
            c2625x = (p105m2.C2625x) arrayList.get(i9);
        }
        boolean z9 = true;
        if (i3 != c2625x.f25376d) {
            c2625x.f25376d = i3;
            z6 = true;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        c2625x.f25377e = jElapsedRealtime;
        p105m2.C2623v c2623v3 = c2625x.f25375c;
        c2623v3.a();
        c2623v.a();
        if (c2623v3.f25372b.containsAll(c2623v.f25372b)) {
            z9 = z6;
        } else {
            p105m2.C2623v c2623v4 = c2625x.f25375c;
            if (c2623v4 == null) {
                throw new java.lang.IllegalArgumentException("selector must not be null");
            }
            c2623v4.a();
            java.util.ArrayList<java.lang.String> arrayList2 = !c2623v4.f25372b.isEmpty() ? new java.util.ArrayList<>(c2623v4.f25372b) : null;
            java.util.ArrayList<java.lang.String> arrayListB = c2623v.b();
            if (!arrayListB.isEmpty()) {
                for (java.lang.String str : arrayListB) {
                    if (str == null) {
                        throw new java.lang.IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                c2623v2 = p105m2.C2623v.f25370c;
            } else {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                c2623v2 = new p105m2.C2623v(bundle, arrayList2);
            }
            c2625x.f25375c = c2623v2;
        }
        if (z9) {
            c().k();
        }
    }

    public final void e(p105m2.AbstractC2624w abstractC2624w) {
        if (abstractC2624w == null) {
            throw new java.lang.IllegalArgumentException("callback must not be null");
        }
        b();
        java.util.ArrayList arrayList = this.f25215b;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((p105m2.C2625x) arrayList.get(i3)).f25374b == abstractC2624w) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            arrayList.remove(i3);
            c().k();
        }
    }
}

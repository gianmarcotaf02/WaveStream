package p105m2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class C {

    public static C2608f f25213c;

    public final Context f25214a;

    public final ArrayList f25215b = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public C(Context context) {
        this.f25214a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static C2608f c() {
        C2608f c2608f = f25213c;
        if (c2608f != null) {
            return c2608f;
        }
        throw new IllegalStateException("getGlobalRouter cannot be called when sGlobal is null");
    }

    public static C d(Context context) {
        b();
        if (f25213c == null) {
            f25213c = new C2608f(context.getApplicationContext());
        }
        ArrayList arrayList = f25213c.f25293f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                C c9 = new C(context);
                arrayList.add(new WeakReference(c9));
                return c9;
            }
            C c10 = (C) ((WeakReference) arrayList.get(size)).get();
            if (c10 == null) {
                arrayList.remove(size);
            } else if (c10.f25214a == context) {
                return c10;
            }
        }
    }

    public final void a(C2623v c2623v, AbstractC2624w abstractC2624w, int i3) {
        C2625x c2625x;
        C2623v c2623v2;
        if (abstractC2624w == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f25215b;
        int size = arrayList.size();
        boolean z6 = false;
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                i9 = -1;
                break;
            } else if (((C2625x) arrayList.get(i9)).f25374b == abstractC2624w) {
                break;
            } else {
                i9++;
            }
        }
        if (i9 < 0) {
            c2625x = new C2625x(this, abstractC2624w);
            arrayList.add(c2625x);
        } else {
            c2625x = (C2625x) arrayList.get(i9);
        }
        boolean z9 = true;
        if (i3 != c2625x.f25376d) {
            c2625x.f25376d = i3;
            z6 = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i3 & 1) != 0) {
            z6 = true;
        }
        c2625x.f25377e = jElapsedRealtime;
        C2623v c2623v3 = c2625x.f25375c;
        c2623v3.a();
        c2623v.a();
        if (c2623v3.f25372b.containsAll(c2623v.f25372b)) {
            z9 = z6;
        } else {
            C2623v c2623v4 = c2625x.f25375c;
            if (c2623v4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            c2623v4.a();
            ArrayList<String> arrayList2 = !c2623v4.f25372b.isEmpty() ? new ArrayList<>(c2623v4.f25372b) : null;
            ArrayList<String> arrayListB = c2623v.b();
            if (!arrayListB.isEmpty()) {
                for (String str : arrayListB) {
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                c2623v2 = C2623v.f25370c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                c2623v2 = new C2623v(bundle, arrayList2);
            }
            c2625x.f25375c = c2623v2;
        }
        if (z9) {
            c().k();
        }
    }

    public final void e(AbstractC2624w abstractC2624w) {
        if (abstractC2624w == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        ArrayList arrayList = this.f25215b;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((C2625x) arrayList.get(i3)).f25374b == abstractC2624w) {
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
